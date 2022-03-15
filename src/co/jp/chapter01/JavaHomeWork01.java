package co.jp.chapter01;

public class JavaHomeWork01 {

	static int num;

	public static void main(String[] args) {
		// 質問０
		// 1. 変数の宣言方法 ⇒ 型 変数名;
		char grade = 'A';
		String abc = "anyword";
		
		byte num = 1;
		short byte_2 = 2;
		int byte_4 = 4;
		long byte_8 = 8;
		
		float num4 = 3.14f;
		double num8 = 3.1415926d;
		
		boolean flg = false;
		
		System.out.println(grade);
		System.out.println(abc);
		
		System.out.println(num);
		System.out.println(byte_2);
		System.out.println(byte_4);
		System.out.println(byte_8);
		
		System.out.println(num4);
		System.out.println(num8);
		
		System.out.println(flg);
		// 2. 変数の代入 ⇒ 変数名 = 値;
		int age;
		age = 18;
		System.out.println(age);
		// 3. 変数の命名規則
		System.out.println("变量不能数字开头，要有含义，可以下划线拼接，可以驼峰命名");
		// 4. 変数は重複不可。
		System.out.println("变量不要重复定义，可以重复使用");
		// 5. 変数の値を再代入型は宣言時の型は同じ。
		int age2 = 20;
		System.out.println(age2);
		age = 30;  // 等号右边赋值的类型要与定义age时的类型一致
		System.out.println(age2);
		/*
		   6. 下記コードで、変数 x と y の値を回答してください。
		      1 int x = 10;
		      2 int y = 20;
		      3 x = y;
		      4 y = 30;
		      5 System.out.println(x);
		      6 System.out.println(y);
		*/
		System.out.println("x=20，y=30");
		/*
		   質問１︓以下変数nの値は︖
		         1 int i = 10;
                 2 int n = i%5;
		*/
		System.out.println("10%5整除，结果为0");
		
		// 質問２︓ 右の式を解釈してください: a = a > 10 ? 11 : 0;
		System.out.println("三元运算，如果a大于10，给a赋值11，否则给a赋值0");
		// 質問３︓変数値を比較する演算⼦は = or == ?
		System.out.println("=是赋值，==是比较地址，字符串.equals方法是比较值");
        // 質問４︓ブリアン（ boolean ）変数に設定可能の値は「?」「?」。
		System.out.println("布尔只有false(0)和true(1)两个值");
	}

}
