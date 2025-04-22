package com.mystudy.student.dao2;

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
public class StudentDAO2 {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// SELECT : 데이터 1개 조회(ID) - selectOne : StudentVO
	public StudentVO selectOne(String id) {
		
		//2. DB연결 - Connection 객체 생성 <- DriverManager
		conn = CommonJdbcUtil.getConnection();
		if (conn == null) return null;
		
		StudentVO vo = null;
		
		try {
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
			CommonJdbcUtil.close(conn, pstmt, rs);
		}
		return vo;
	}
	
	//SELECT : 테이블 전체 데이터 조회 selectAll : List<StudentVO>
	public List<StudentVO> selectAll() {
		List<StudentVO> list = null;
		
		try {
			conn = CommonJdbcUtil.getConnection();
			
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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//5. 클로징 처리에 의한 자원 반납
			CommonJdbcUtil.close(conn, pstmt, rs);
		}
		
		return list;
	}
	
	
	// INSERT : 데이터(VO)를 전달받아 입력처리 - insert(vo) : int
	public int insert(StudentVO vo) {
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
			CommonJdbcUtil.close(conn, pstmt);
		}
		
		return result;
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
		int result = 0;
		
		try {
			conn = CommonJdbcUtil.getConnection();
			
			StringBuilder sb = new StringBuilder();
			sb.append("UPDATE STUDENT ");
			sb.append("SET KOR = ? ");  //1
			sb.append("  , ENG = ? ");  //2
			sb.append("  , MATH = ? "); //3
			sb.append("  , TOT = ? ");  //4
			sb.append("  , AVG = ? ");  //5
			sb.append("WHERE ID = ? "); //6
			
			pstmt = conn.prepareStatement(sb.toString());
			
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
		
		return 0;
	}
	
	
	//----------------------
	// SELECT : 이름(name) 받아서 찾기 - selectName(name) : List<StudentVO>
	
	// UPDATE : id, name 받아서 이름 수정처리 - updateName(id, name) : int
	// UPDATE : id, kor 받아서 국어점수 수정처리 - updateKor(id, kor) : int
	// UPDATE : id 받아서 총점, 평균 재계산 처리 - updateTotAvg(id) : int
	// UPDATE : 전체 총점, 평균 재계산 처리 - updateTotAvgAll() : int
	
	// DELETE : VO 받아서 삭제처리 - delete(vo) : int
	
	
}









