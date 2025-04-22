package com.mystudy.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mystudy.common.CommonJdbcUtil;
import com.mystudy.student.vo.StudentVO;

// xxxDAO, xxxDao : Data Access Object
// 데이터베이스(Database)와 연동해서 CRUD를 구현하는 클래스
public class StudentDAO {
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "MYSTUDY";
	private static final String PASSWORD = "mystudypw";

	public StudentDAO() {
		System.out.println(">> StudentDAO() 실행~~");
	}
	
	// 인스턴스(instance) 초기화구문
	{
		System.out.println(">> 인스턴스(instance) 초기화구문");
	}
	
	// static 초기화 구문
	static {
		System.out.println(">> 스태틱(static) 초기화구문");
		try {
			Class.forName(DRIVER);
			System.out.println(">> JDBC 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("[예외발생] JDBC 드라이버 로딩 실패!!!");
		}
	}
	
	// SELECT : 데이터 1개 조회(ID) - selectOne : StudentVO
	public StudentVO selectOne(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		StudentVO vo = null;
		
		try {
			//2. DB연결 - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//3. Statement 문 실행(SQL 문 실행)
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ");
			sb.append("FROM STUDENT ");
			sb.append("WHERE ID = ? ");
			pstmt = conn.prepareStatement(sb.toString());
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			//4. SQL 실행 결과에 대한 처리
			//   - SELECT : 조회(검색) 데이터 결과 값에 대한 처리
			if (rs.next()) {
				vo = new StudentVO();
				vo.setId(rs.getString("ID"));
				vo.setName(rs.getString("NAME"));
				vo.setKor(rs.getInt("KOR"));
				vo.setEng(rs.getInt("ENG"));
				vo.setMath(rs.getInt("MATH"));
				vo.setTot(rs.getInt("TOT"));
				vo.setAvg(rs.getDouble("AVG"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. 클로징 처리에 의한 자원 반납
			close(conn, pstmt, rs);
		}
		return vo;
	}
	
	//SELECT : 테이블 전체 데이터 조회 selectAll : List<StudentVO>
	public List<StudentVO> selectAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<StudentVO> list = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ");
			sb.append("FROM STUDENT ");
			sb.append("ORDER BY ID");
			
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			
			list = new ArrayList<StudentVO>();
			while (rs.next()) {
				StudentVO vo = new StudentVO(
						rs.getString("ID"), 
						rs.getString("NAME"), 
						rs.getInt("KOR"), 
						rs.getInt("ENG"),  
						rs.getInt("MATH"),  
						rs.getInt("TOT"),  
						rs.getDouble("AVG") );
				
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. 클로징 처리에 의한 자원 반납
			close(conn, pstmt, rs);
		}
		
		return list;
	}
	
	private void close(Connection conn, 
			PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null) rs.close();
		} catch (SQLException e) {}
		try {
			if (pstmt != null) pstmt.close();
		} catch (SQLException e) {}
		try {
			if (conn != null) conn.close();
		} catch (SQLException e) {}
	}
	
	// INSERT : 데이터(VO)를 전달받아 입력처리 - insert(vo) : int
	public int insert(StudentVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		try {
			//conn = DriverManager.getConnection(URL, USER, PASSWORD);
			conn = CommonJdbcUtil.getConnection();
			
			StringBuilder sb = new StringBuilder();
			sb.append("INSERT INTO STUDENT ");
			sb.append("       (ID, NAME, KOR, ENG, MATH, TOT, AVG) ");
			sb.append("VALUES (?, ?, ?, ?, ?, ?, ?)");
			
			pstmt = conn.prepareStatement(sb.toString());
			
			// ? 값 설정
			int i = 1;
			pstmt.setString(i++, vo.getId());
			pstmt.setString(i++, vo.getName());
			pstmt.setInt(i++, vo.getKor());
			pstmt.setInt(i++, vo.getEng());
			pstmt.setInt(i++, vo.getMath());
			pstmt.setInt(i++, vo.getTot());
			pstmt.setDouble(i++, vo.getAvg());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			result = -1;
			//e.printStackTrace();
		} finally {
			//close(conn, pstmt, null);
			//close(conn, pstmt);
			CommonJdbcUtil.close(conn, pstmt);
		}
		
		return result;
	}

	private void close(Connection conn, PreparedStatement pstmt) {
		try {
			if (pstmt != null) pstmt.close();
		} catch (SQLException e) {}
		try {
			if (conn != null) conn.close();
		} catch (SQLException e) {}
	}
	
	// SELECT : 이름(name) 받아서 찾기 - selectName(name) : List<StudentVO>
	
	// UPDATE : VO 데이터 받아서 수정처리 - update(vo) : int
	// UPDATE : id, name 받아서 이름 수정처리 - updateName(id, name) : int
	// UPDATE : id, kor 받아서 국어점수 수정처리 - updateKor(id, kor) : int
	// UPDATE : id 받아서 총점, 평균 재계산 처리 - updateTotAvg(id) : int
	// UPDATE : 전체 총점, 평균 재계산 처리 - updateTotAvgAll() : int
	
	// DELETE : id 받아서 삭제처리 - delete(id) : int
	// DELETE : VO 받아서 삭제처리 - delete(vo) : int
	//-------------------------
	
	// UPDATE : VO 데이터 받아서 수정처리 - update(vo) : int
	// 국어, 영어, 수학, 총점, 평균 수정 처리
	public int update(StudentVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		try {
			conn = CommonJdbcUtil.getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE STUDENT ");
			sql.append("SET KOR = ? ");  //1
			sql.append("  , ENG = ? ");  //2
			sql.append("  , MATH = ? "); //3
			sql.append("  , TOT = ? ");  //4
			sql.append("  , AVG = ? ");  //5
			sql.append("WHERE ID = ? "); //6
			
			pstmt = conn.prepareStatement(sql.toString());
			
			// ? 값 설정
			int i = 1;
			pstmt.setInt(i++, vo.getKor());
			pstmt.setInt(i++, vo.getEng());
			pstmt.setInt(i++, vo.getMath());
			pstmt.setInt(i++, vo.getTot());
			pstmt.setDouble(i++, vo.getAvg());
			pstmt.setString(i++, vo.getId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			result = -1;
		} finally {
			CommonJdbcUtil.close(conn, pstmt);
		}
		
		return result;
	}

	//(실습) DELETE : id 받아서 삭제처리 - delete(id) : int
	public int delete(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		try {
			conn = CommonJdbcUtil.getConnection();
			
			String sql = "DELETE FROM STUDENT WHERE ID = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			result = -1;
		} finally {
			CommonJdbcUtil.close(conn, pstmt);
		}
		
		return result;
	}
	
	// SELECT : 이름(name) 받아서 찾기 - selectName(name) : List<StudentVO>
	public List<StudentVO> selectName(String name) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<StudentVO> list = null;
		
		conn = CommonJdbcUtil.getConnection();
		if (conn == null) return null;
		
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ");
			sb.append("FROM STUDENT ");
			sb.append("WHERE NAME LIKE '%' || ? || '%'");
			
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			list = new ArrayList<StudentVO>();
			while (rs.next()) {
				StudentVO vo = new StudentVO(
						rs.getString("ID"), 
						rs.getString("NAME"), 
						rs.getInt("KOR"), 
						rs.getInt("ENG"),  
						rs.getInt("MATH"),  
						rs.getInt("TOT"),  
						rs.getDouble("AVG") );
				
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			CommonJdbcUtil.close(conn, pstmt, rs);
		}
		
		return list;
	}
	
	//----------------------
	//(실습) SELECT, UPDATE 처리
	
	// UPDATE : id, name 받아서 이름 수정처리 - updateName(id, name) : int
	// UPDATE : id, kor 받아서 국어점수 수정처리 - updateKor(id, kor) : int
	// UPDATE : id 받아서 총점, 평균 재계산 처리 - updateTotAvg(id) : int
	// UPDATE : 총점, 평균 불일치 데이터 찾아서 재계산 처리
	
	
	//--------------
	// UPDATE : 전체 총점, 평균 재계산 처리 - updateTotAvgAll() : int
	// DELETE : VO 받아서 삭제처리 - delete(vo) : int
	// SELECT : 총점, 평균 불일치 데이터 찾기
	
	
}









