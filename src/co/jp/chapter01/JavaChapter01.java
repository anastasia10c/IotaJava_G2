package co.jp.chapter01;

public class JavaChapter01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("test");
		
		// ① 変数の宣言が必要 abc = 100;
		
		// ② 変数名のネーミングルールがある
		
		byte byte_1 = 100;
		
		int aaa = abc;
		
		String abc = "abc 汉字 123";
		
		
		int a = 7;
		int b = 5;
		int c = 100;
		int d = 50;
		
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		
		//a-b*c/d
		System.out.println("a-b*c/d="+(a-b)*c/d+6);
		
		// %
		
		int m = 18;
		int n = 5;
		
		System.out.println("m%n:"+(m%n));
		
		int i = 99;
		
		i++; //i=i+i;
		System.out.println(i++);
		
		int j = 99;
		++j;
		System.out.println(++j);
		
		
		//int a = 100;
		//int b = 888;
		
		boolean flg = a<=b;
		System.out.println(flg);
		
		String aa = "123";
		String bb = new String ("123");//"123;//
		
		System.out.println("== :" + aa != bb);
		System.out.println("equals :" + !aa.equals(bb));
		
		//否！
		
		boolean t = true ;
		boolean f = false;

		System.out.println(!t);
		System.out.println(!f);
	
		
		// ||
		
		System.out.println( t || f); // or

		System.out.println( t && f); // and
		
		//boolean flg = true;
		
				if (flg) {
					System.out.println("スイッチ:" + flg);
				}
		
		int int_1 = 123;
		System.out.println("intの値:" + (int_1 + 1 ));

		String str_1 = "123";
		System.out.println("Stringの値:"+ (str_1 + 1));
		
		//字节
		
		//byte b = 127;
		System.out.println(b);
		
		b= 100;
		System.out.println(b);
		
		
		byte abcd ; //宣言
		abcd = 127; //负值
		
		System.out.println("变数 abcd 的值 :" + abcd);
		
		//int a = 10;
		//int bb = 100;
		
		
		//整数
		
		//int i= 1234567890；
		
		//max result
		int maxResult = 100;
		
		short s = 12345;
		
		//long l = 1234567890123451;
		
				
		int x = 10;
		int y = 20;
		x = y;
		y = 30;
		System.out.println(x);
		System.out.println(y);
		
	}
}
