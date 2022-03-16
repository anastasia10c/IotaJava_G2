package co.jp.chapter01;

public class JavaHomeWork01 {

	static int num;

	public static void main(String[] args) {
		
		
		//質問１︓以下変数nの値は︖
		int i = 10;
		int n = i%5;
		System.out.println(n);
		/*System.out.println(10%5);*/
		
		
		//質問２︓ 右の式を解釈してください: a = a > 10 ? 11 : 0;
		int a=9;
		if(a>10){a=11;}
		 else{a=0;}
		System.out.println(a);
		
		
		//質問３︓変数値を⽐較する演算⼦は = or == ?
		
		System.out.println("==");
		 
				
		//質問４︓ブリアン（ boolean ）変数に設定可能の値は「?」「?」。
		
			boolean t = true ;
			boolean f = false;

			System.out.println(t);
			System.out.println(f);

	}

}
