package com.mystudy.map1_hashmap;

import java.util.TreeMap;

public class TreeMap_Exam {

	public static void main(String[] args) {
		//TreeMap : key 데이터를 정렬해서 저장
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("홍길동", 100);
		map.put("김유신", 95);
		map.put("강감찬", 88);
		System.out.println("map : " + map);
		
		
		System.out.println("\n ==== 전체");
		for(String key: map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}


	}

}
