import java.text.ParseException;
import java.util.BitSet;

public class Test2 {
	public static void main(String[] args) {
		 //一。数据基本类型 数值型 实型 字符型 布尔型 引用类型
//		1, 数值型 byte（1BitSet ） short（2bit） int（4bit） long（8bit）
//		2，实型（浮点型）float（4bit） double（8bit）
//		3，字符型 char（2bit）存放单个字符 如：'a' 
//		4,布尔型  boolean（1bit）只有两个值 true（真） false（假） 
//		5，引用类型 类（class）接口（interface）数组（array）
//		6，字符串类型 String 存放一串字符ru String s = "hello world";
//		byte    num1 = 10;
//		short   num2 = 20;
//		int     num3 = 30;
//		long    num4 = 123456789L;     //long型数据数值后面要加大写L 以便表示long型数据  
//		float   num5 = 52465.464654F;  //(float数据类型定义时要加上大写F表示float类型数据)
//		double  num6 = 5.78;          // (java中所有实型数值没有说明的系统直接默认为double型数据)
//		double  num  = .415F;         //浮点型数据数值前是0的这个0可以省略 可以写成.415 也是ok的 
//		double  numm  = .415; 
//		char    num7 = 'a';  //字符类型数据很重要 它可以表示单个英文字符 转义字符 汉字字符 数值字符
//		char    c1 = '\t';   //英文字符直接输出英文字母 转义字符会输出相应的转义意思 如空格（\t）
//		char    c2 = '李';    //汉字字符会直接输出汉字 字母 转义 和汉字字符赋值都要加上一对单引号（''）
//		char    c3 = 97;     //数值型字符会找i到对应的unicode码的码值 在输出对应的字符 如码值97对应小写a
//		boolean num8 = true;
//		String  num9 = "hello";       //(s是字符串类型数据存放字符串)
//		System.out.println(num1);  //10
//		System.out.println(num2);  //20
//		System.out.println(num3);  //30
//		System.out.println(num4);  //123456789
//		System.out.println(num5);  //52465.465
//		System.out.println(num6);  //5.78
//		System.out.println(num);   //0.41499999165534973这个输出结果有点意外 系统只是无限接近.415这个数值
//		System.out.println(numm);  // 0.415当定义数据没有加F时输出数值和定义时赋给变量的numm值一样                       
//		System.out.println(num7);  //a
//		System.out.print(c1);
//		System.out.println(c2);
//		System.out.println(c3);
//		System.out.println(num8);  //true
//		System.out.println(num9);  //hello
//		//注：double类型数据后面加F的数值会丢失精度 不加F会原样输出
		//布尔类型数据适用于逻辑运算，一般用于流程控制if...else...语句 do...while while for 循环语句
//		boolean result = false;
//		if(result)
//		  System.out.println("结果正确");
//		else
//		  System.out.println("结果错误");
		// 二。自动类型转换 java中是由精度小的自动转换到精度大的类型	
		//1,char->int->long->float->doouble
		//2,byte->short->int->long->float->double(两条数据转换规则 老韩要求背下)
//		int num = 'a';
//		double num1 = 80;
//		System.out.println(num);//97
//		System.out.println(num1);//80.0上面两条代码实现了数据系统自动转换
		//切记一点数据精度大的转换精度小的系统会报错 （数据类型不兼容 会造成数据损失） 
		//意识数据自动转换只能是精度小的向精度大的自动转换
		//多重混合运算一点要注意数据类型转换是否正确
		//byte short char三者之间不能自动转换 但是可以一起运算 并且会先转成int类型	
		//意思是三者之间运算结果为int型数据 并且可以向精度搞得数据类型自动转换 
		//char类型变量如果是数值会直接参与运算 如果是字符会先转成unicode的码值再参与运算
//		byte  num1 = 10;
//		short num2 = 20;
//		char  num3 = 97;
//		char  num = 'a';
//		int   num4 = num1 + num2 + num3;
//		long  num5 = num1 + num2 + num3 + num;
//		float  num6 = num1 + num2 + num3;
//		double num7 =  num1 + num2 + num3;
//		System.out.println(num4);
//		System.out.println(num5);
//		System.out.println(num6);
//		System.out.println(num7);
		
		
		// 三。强制类型转换 	将精度高的数据转向精度小的数据类型 使用时要加上强制转换符（）一对圆括号
		//可能会造成精度降低或溢出 需要格外注意
		
		//四。基本数据类型和String的转换  前者和后者都可以转换 但有一定的规则 
		//1.基本数据类型转String类型 语法是：将基本类型的值+""(一对双引号)即可 如：String str = 100 + "";
		//2.String数据类型转基本数据类型 语法是：通过基本类的包装类调用parseXX方法即可
		// 如：Integer.parseInt("123");
		//案例演示
//		int n1 = 10;
//		float f1 = 1.4F;
//		double d1 = 8.6;
//		boolean b1 = true;
//		String s1 = n1 + "";
//		String s2 = f1 + "";
//		String s3 = d1 + "";
//		String s4 = b1 + "";
//		System.out.println(n1 + "" + f1 + "" + d1 + "" + b1 + "");  //101.48.6true
//		System.out.println(s1 + s2 + s3 + s4);                      //101.48.6true
		//以上就是基本类型转成String类型数据
		
		//将String类型转成基本数据类型 要通过基本类的包装类调用parsexx方法实现数据类型转换
		//案例演示
//		String str = "123";
//		String str1 = "hello";
//	    byte    num1 = Byte.parseByte(str);
//	    short   num2 = Short.parseShort(str);
//	    int     num3 = Integer.parseInt(str);
//	    float   num4 = Float.parseFloat(str);
//	    double  num5 = Double.parseDouble(str);
//	    long    num6 = Long.parseLong(str);
//	    boolean b = Boolean.parseBoolean("true");
//	    //int    num7 = Integer.parseInt(str1);我们不能将非数值型的String数据转成基本类型
//	    //但是可以得到字符串第一个字符，即把字符串转成字符 char -> 含义是指 把字符串的第一个字符得到
//	    System.out.println(str1.charAt(0));
//	    System.out.println("==================");
//	    System.out.println(num1);
//	    System.out.println(num2);
//	    System.out.println(num3);
//	    System.out.println(num4);
//	    System.out.println(num5);
//	    System.out.println(num6);
//	    System.out.println(b);
	    
//run result		h
//					==================
//					123
//					123
//					123
//					123.0
//					123.0
//					123
//					true
	   //以上是String类型数据转成基本数据类的基本语法 
	    //并且字符串转字符可以的到字符产第一个字符。
		double num1 = 234.6  ,num2 = 0;
		num2 = 5/9.0*(num1-100);
		System.out.println(num2);
	    
		
	}

}
