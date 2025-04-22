package com.mystudy.student.dao2;

import java.util.List;

import com.mystudy.student.vo.StudentVO;

public class StudentDAO2_Test {

	public static void main(String[] args) {
		StudentDAO2 dao = new StudentDAO2();
		
		String id = "2025001";
		System.out.println("--- selectOne(id) ---");
		StudentVO stu1 = dao.selectOne(id);
		System.out.println("stu1 : " + stu1);
		stu1.computeTotAvg();
		System.out.println("stu1 : " + stu1);
		System.out.println("stu1 id : " + stu1.getId());
		System.out.println("stu1 name : " + stu1.getName());
		
		System.out.println("--- selectAll() ---");
		List<StudentVO> list = dao.selectAll();
		System.out.println("list : " + list);
		for (StudentVO vo : list) {
			//System.out.print(vo.getId() + ", " + vo.getName() + ", " + vo.getKor());
			//System.out.println();
			System.out.println(vo);
		}
		
		System.out.println("--- insert(vo) ---");
		StudentVO insertVO = new StudentVO("S2025010", "강감찬10", 95, 88, 75);
		System.out.println("입력할 데이터 : " + insertVO);
		int result = dao.insert(insertVO);
		System.out.println("입력건수 : " + result);
		
		StudentVO insertedVO = dao.selectOne(insertVO.getId());
		System.out.println("입력된 DB 데이터 조회 : " + insertedVO);
		
		System.out.println("--- update(vo) ---");
		StudentVO updateVO = new StudentVO("S2025010", "강감찬10", 99, 88, 77);
		System.out.println("변경전 데이터 : " + dao.selectOne(updateVO.getId()));
		System.out.println("수정할 VO : " + updateVO);
		
		int updateCnt = dao.update(updateVO);
		System.out.println("수정건수 : " + updateCnt);
		System.out.println(">> 수정결과 확인");
		System.out.println("수정결과 : " + dao.selectOne(updateVO.getId()));
		
		System.out.println("--- delete(id) ---");
		int deleteCnt = dao.delete(updateVO.getId());
		
		
		System.out.println("=== main() 끝 =====");

	}

}







