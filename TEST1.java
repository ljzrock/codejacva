
public class TEST1 {//(public class TEST1 表示TEST1 是public公有的类)
	public static void main(String[] args) {//public static void main(String[] args) 
		                                    //这段代码表示一个主方法 Java程序入口
		
	
//		int a = 100;
//		System.out.println("a = "+a);
		//转义字符 \t (一个制表位 实现对齐功能)   \n（表示换行）\\（一个单斜杠\）
		//  \"(一个双引号")  \'(一个单引号')  \r(表示回车)
//		System.out.println("this\tis\ta\tbook");//result:this	is	a	book
//		System.out.println("醉卧沙城君莫笑\n古来征战几人回");//result:醉卧沙城君莫笑
//		                                                   //       古来征战几人回
//		System.out.println("C:\\windows\\system32\\cmd.exe");// result:C:\windows\system32\cmd.exe
//		System.out.println("老师说：\"我们要好好学习\"");//result:老师说："我们要好好学习"
//		System.out.println("老韩说：\'好好学习java有前途,万丈高楼平地起，不要着急\'"); //result:老韩说：'好好学习java有前途,万丈高楼平地起，不要着急'
//		System.out.println("韩顺平教育\r北京");//result:韩顺平教育  这里\r是表示回车
//		                                      //       北京
//		System.out.println("书名\t作者\t单价\t销量\n三国\t罗贯中\t120\t1000");//result:书名	作者	单价	销量
//		                                                                    //       三国	罗贯中	120	1000
             //实现两个数的相加 
//		int a = 10,b=20,c=0;
//		 System.out.println("c = "+(a + b));//result:c = 30
//          //JDK = JRE + 开发工具集（例如 Javac,java 编译工具等)
		 //2) JRE = JVM + Java SE 标准类库（java 核心类库）

//D:\javaspce>javac Test2.java   注意事项 Java的公共类名要与Java编译过后的文件名称保持一致 否则编译错误
//                              用 Dos命令编译运行Java文件时要先编译 在运行 
//                             编译 javac 文件名（公共类名）.java   如：javac Test2.java
		  //                       编译过后会生成.class文件         如：Test2.class
		 //                     运行 Java 文件名（公共类名）        如：java Test2
		 //                       运行后会输出结果                  如 ：hello world
//D:\javaspce>java Test2
//hello world
//
//D:\javaspce>
//	}
	               String   name = "king";
	               char     gender = '男';
	               int      age = 28;
	               double   score = 89.5;
	               System.out.println("一个人的信息：");
	               System.out.println("姓名："+name); 
	               System.out.println("性别："+gender); 
	               System.out.println("年龄："+age); 
	               System.out.println("成绩："+score); 
	               
                  

 }
}
    class dog{
   public static void main(String[] args){
   System.out.println("一条小狗"); 
       }
}
//    D:\javaspce>javac Test2.java   编译.Java文件 会生成主类.class和非主类.class文件 
// 
//    D:\javaspce>java dog      运行 dog类会输出结果一条小狗 
//    一条小狗
//
//    D:\javaspce>java Test2    运行Test2主类 会输出hello world 
//    hello world
//                           总结：1：Java中可以有一个主类 并且有其他的非主类
//    D:\javaspce>                 2：当非主类中加了main方法后会 Java程序运行入口可以被改变
//                                 意思是Java程序入口可以是非主类

//tab键会使java	代码整体右移   shift + tab 会使java代码整体左移
