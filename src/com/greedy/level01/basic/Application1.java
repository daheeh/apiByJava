package com.greedy.level01.basic;

public class Application1 {
	
	/* 실행용 메소드 */
	public static void main(String[] args) {
		
		// Calculator 클래스의 메소드를 호출 해서 실행
		Calculator calc = new Calculator();
		calc.checkMethod();
		
		
		String result = calc.sumTwoNumber(10, 20);
		System.out.println(result);
		
//		int first = 10;
//		int second = 20;
//		String sum = calc.sumTwoNumber(first, second);
//		System.out.println(sum);
		
		
		String result2 = calc.multiTwoNumber(10, 20);
		System.out.println(result2);
		
//		String mul = calc.multiTwoNumber(first, second);
//		System.out.println(mul);
		
	}
}
