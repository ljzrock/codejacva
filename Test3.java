
public class Test3 {
	public static void main(String[] args) {
		  /** 三目运算符求取三个数中最大数字
 	    * 需要定义三个变量 以及一个接收最大值的变量 要求双精度类型数据
 	    * 
 	    * */
		int num1 = 10, num2 = 30,num3 = 40;
		int Maxnum1 = num1 > num2 ? num1 : num2;
		int ResultMax = Maxnum1 > num3 ? Maxnum1: num3;
		System.out.println("ResultMax = "+ResultMax);
	}

}
class  ArithmeticOperator{
       public static void main(String[] args) {
   	   System.out.println("第四章运算符");
//    	  
//    	   作业：1) 假如还有 59 天放假，问：合 xx 个星期零 xx 天
//    	   2) 定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度。
//    	   [234.5]
    	 /**作业1分析 59天需要一个整型变量来存放 一星期有7天 星期需要一个变量来接收 零几天需要一个变量来接收
    	  *    定义变量int days = 59；int weeks，day；
    	  * 代码实现
    	  * */
//    	   int days = 59;
//    	   int weeks = 0,day = 0;
//    	   weeks = days / 7;//自动类型转换 
//    	   day = days % 7;
//    	   System.out.println(days+"天合"+weeks+"个星期零"+day+"天");
//    	  run result： 59天合8个星期零3天
    	   
    	   
    	   /**作业二分析 题目直接给出公式套用公式定义好变量 数据类型为double类型数据
    	    *代码实现 如下
    	    * */
//    	   double huashi = 234.5;
//    	   double sheshi = 5/9.0*(huashi-100);
//    	   System.out.println(huashi+"华氏温度对应的摄氏温度是"+sheshi);
    	 
    	   
       }

}