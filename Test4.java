import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
	//一，键盘输入语句 其本质是一个扫描器（对象）来接收键盘输入的数据 int float double string char 
		//它就是scanner 意思是简单文本扫描器，使用是需要导入Java.util包
		//导入scanner类所在的包import java.util.Scanner;
		//创建Scanner 对象
		//例如：Scanner myScanner = new  Scanner(System.in);
		//这里可以实现用户输入
		//实例 键盘输入一个人的信息 包括 姓名 年龄 薪资 
		/**
		 * 1，首先导入包 import Java.util.Scanner;//eclipse会自动生成这个包 
		 * 2，创建Scanner的对象如 myScanner  具体实现:Scanner myScanner = new Scanner(System.in);
		 * 创建好之后就要实现数如输出 
		 * */
//		Scanner myScanner = new Scanner(System.in); //这一步就是scanner对象创建完毕 
//		System.out.println("请输入人的姓名：");
//		String  name = myScanner.next();//这里开始引用对象 实现输入
//		System.out.println("请输入人的年龄：");
//		int     age = myScanner.nextInt();
//		System.out.println("请输入人的薪资：");
//		double  sal = myScanner.nextDouble();
//		System.out.println("人的信息如下：");
//		System.out.println("姓名 ： "+name);
//		System.out.println("年龄 ："+age);
//		System.out.println("薪资 ："+sal);
//	runresult：	    请输入人的姓名：
			//		rock
			//		请输入人的年龄：
			//		28
			//		请输入人的薪资：
			//		4500
			//		人的信息如下：
			//		姓名 ： rock
			//		年龄 ：28
			//		薪资 ：4500.0
   //二，自增自减该概念和使用规则	
      /** 1,自增 ++i 和 i++  ++i先自增1再运算 i++是先运算再自增1
       * 2，自减 --i 和i--   --i先自减1在运算 i--是先运算再自减1 
       *例子如下：
       * */
//		 int i = 10;
//		    
//		 System.out.println(++i+1);//结果是 12  ++i先自增再运算
//         int a = 5;
//         System.out.println(1+a++);//结果是6   i++先运算再自增 
         //自减类推一下 记住符号在前 先增（减）1后运算 
         //                符号在后 先算再增（减）1
		
      /**三 取模（%） java中取模本质运算是 ;
       *     a % b = a - (int)a / b * b
       *     这个本质如果运算flaot和double类型时依然适用 但是精度会降低 	
       *    例子 10.5 % 3 = 
       *    10.5-（int）10.5/3*3 = 1.5
       * */		
//		double i = 10.5;
//		int  j = 3;
//		System.out.println(i%j);// runresult：1.5
		
		/**
		 *四。1. 关系运算符 == ；！=； <； >； <=； >=；  他们运算结果都是boolean型 
		 * 要么是true 要么是false
		 * “==”双等号是判断是否相等的 是作为条件判断 
		 * 2，逻辑运算符 ：其作用是链接多个关系表达式	，做种结果是一个boolean型的值
		 * 分两组学习 
		 * 1）短路与 &&  短路或 || 取反 !（亦称非运算）
		 * 2)逻辑与 &  逻辑或 |   逻辑异或 ^   
		 * 规则：相同：逻辑与&和短路与&&这两个操作使用时 相关的表达式都为true是结果为true
		 *      不同： 逻辑&：他表示两个表达式都会执行运算 即使第一个为假，也会将第二个表达式
		 *      执行过后再给出结果 效率低！！！
		 *     
		 *     逻辑或|和短路或|| 
		 *     相同 ：两个表达式只要有一个为真则结果为真
		 *     不同：逻辑或 |在判断完第一个表达式后不管真假依然会执行后面的表达式 效率低 
		 *          短路|| 在判断第一个表达式为真时会直接给出结果true 后面表达式不会执行 
		 *         
		 *          ！取反（非运算），只是将表达式进行真假转换  
		 *          
		 *          ^逻辑异或 当两个表达式结果不同时则结果为真 反之为假
		 *               
		 * 看实例如下：         
		 *         
		 * */
//		int a = 30;
//		System.out.println(a > 10 && a < 50);//true
//		System.out.println(a > 50 && a < 10);//false
//		System.out.println(a > 10 & a < 50);//true
//		System.out.println(a < 50 & a > 10);//false
//		System.out.println(a > 10 || a < 50);//true
//		System.out.println(a > 10 || a < 30);//true
//		System.out.println(a > 10 | a < 50);//true
//		System.out.println(a > 10 | a < 30);//true
//		System.out.println(a > 50 | a > 10);//true
//	    
		
//		int i = 20;
//	    System.out.println(!(i<30));//取反操作 （非运算）真假转换 
//	    System.out.println(!(i < 15 && i > 10));//
//		
//		int m = 20;
//		System.out.println((m<30)^(m>10));//false
//		System.out.println((m<30)^(m>50));//true
		/**十进制转其他进制 转二进制除二取余数再倒过来 
		 * 十进制转八进制  十进制数一直除8 取余数再倒过来
		 * 十进制转十六进制 十进制数一直除十六 取余数再倒过来 
		 */
		/**二进制转八进制
		 * 规则：从二进制最低为开始 每三位一组转成对应的八进制数即可
		 * 如 0b100110111 ==>0(100)4(110)6(111)7
		 * 二进制转十六进制
		 * 规则：从二进制最低位开始 每四为一组转成对应十六进制数即可 
		 * 	0b1101001110110101 ==>0X(1101)D(0011)3(1011)B（0101)5										
		 * 八进制和十六进制转二进制就是上述的逆反操作
		 * 八进制转二进制 是将八进制每位数都转成对应的三位二级制数即可
		 * 十六进制数转二进制数将十六进制数每位数字转成对应的四位二进制数即可
		 * 																	
		 * */
		
	}

}
