import java.util.concurrent.CopyOnWriteArraySet;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class test {

	public static void main(String args[]) {
		/*
		 * int m=4; System.out.println("result1="+m++);
		 * System.out.println("result2="+(++m)); boolean x=(m>=6)&&(m%2==0);
		 * System.out.println("result3="+x);
		 */
		/*
		 * int x=3; System.out.println((x==3)||(x++>4));
		 */
		/*
		 * char c='a'; int d='c'-c; int x=c+1; char c2=(char)x;
		 * System.out.println(c+"\t"+d+"\t"+x+"\t"+c2);
		 */
		/*
		 * int a=6,b=7; System.out.println(a>b?a:b);
		 */
		/*
		 * int a=8,b=10; if(a>b) System.out.println(a);
		 * 
		 * else System.out.println(b);
		 */
		
		/*
		 * String s=JOptionPane.showInputDialog("请输入圆的半径："); double
		 * r=Double.parseDouble(s); double area=Math.PI*r*r;
		 * System.out.printf("圆的面积=%.3f", area);
		 */
		/*
		 * int m=12,n=517; System.out.print("n%m="+(n%m));
		 * System.out.println("\tn/m="+(n/m));
		 * System.out.print(Integer.toBinaryString(m)); System.out.println("\t"
		 * +Integer.toBinaryString(m>>2));
		 * System.out.printf("Value of PI is %.3%n",Math.PI); //
		 * System.out.printf("result=%e%n",1500.34); //
		 * System.out.printf("result1=%13.8e%n",1500.34);
		 */	
		/*
		 * int a ,b,c,max; String s;
		 * s=JOptionPane.showInputDialog("input first number："); a=Integer.parseInt(s);
		 * s=JOptionPane.showInputDialog("input second number："); b=Integer.parseInt(s);
		 * s=JOptionPane.showInputDialog("input third number："); c=Integer.parseInt(s);
		 * max=a; if(b>max) max=b; if(c>max) max=c; JOptionPane.showMessageDialog(null,
		 * "最大值是：" +max);
		 */
		/*
		 * String str=javax.swing.JOptionPane.showInputDialog("输入学生分数："); int
		 * s=Integer.parseInt(str); if(s<60) System.out.println("不及格"); else if(s<70)
		 * System.out.println("及格"); else if(s<80) System.out.println("中等"); else
		 * if(s<90) System.out.println("良"); else System.out.println("优");
		 */
//		int s=Integer.parseInt(JOptionPane.showInputDialog("输入学生分数:"));
//        int x=s/10;
//        switch(x){
////        	case 0:case 1:case 2:case 3:case 4:
//        	case 5:System.out.println("不及格");break;
//        	case 6:System.out.println("及格");break;
//        	case 7:System.out.println("中等");break;
//        	case 8:System.out.println("良好");break;
//        	case 9:System.out.println("优秀");break;
//        
//        }
        
//		   int k=1;
//		   while(k<1000) {
//			   System.out.println(k);
//			   k++;
//		   }
//		int n=100,m=1;//求1000以内的水仙花数 （各个位数的立方和等于这个数）
//		while(n<1000) {//通过while循环来遍历1000以内的数字
//			int i=n/100;//获取最高位
//			int j=(n-i*100)/10;//获取第二位
//			int k=n%10;//获取最低位
//			if(Math.pow(i, 3)+Math.pow(j, 3)+Math.pow(k, 3)==n)//利用数学函数求取个个位数的
//				//立方和是否等于该数
//			System.out.println("找到第"+ m++ +"个水仙花数："+n);//print是持续输出没有换行
//			                                                   //printf是格式化输出
//			                                                     //println是输出换行 
//           n++;
//		}
		//从键盘输入一个长整数 求其各位的数字
//		long a,n,m=0;
//		a=Long.parseLong(JOptionPane.showInputDialog("输入长整数"));
//        n=a;
//        while(a>0) {
//           m+=a%10;   
//           a=a/10;
//           
//        }
//        System.out.print(n+"的各位数字之和是："+m);
//		int x=23659;
//		String m="result=";
//		do {
//			m=m+x%10;
//			x=x/10;
//		}while(x>0);
//	   System.out.println(m);
		
		
		//用随机函数产生10道2位数的加法测试，并统计得分 
//		int score=0;
//		for(int i=0;i<10;i++) {
//			int a=10+(int)(90*Math.random());
//			int b=10+(int)(90*Math.random());
//			String s=JOptionPane.showInputDialog(a+"+"+b+"=？");
//			int ans=Integer.parseInt(s);
//			if(a+b==ans)
//				
//			score=score+10;
//			
//		}
//		JOptionPane.showMessageDialog(null, " you score=" +score);
		int m = 0;//计数器
		for(int n = 3; n <= 50; n++){//外层循环 n的范围是3-50
			boolean f = true;//定义布尔类型变量f 并赋值为true
			int k = 2;
			while(f && k <= (n-1)) {//通过while循环
				if(n % k == 0)     //寻找n%k的模 若模为0 则将f=false 并且k++
					f = false;   //内层循环中将n与2-50之间的每个数进行取模 
					k++;
				
			}
			if(f){
				System.out.println("\t"+n); //通过if语句判断如果f=false则将n的值打印输出
				m++;//计数器自增
				if(m % 5 == 0)//这条语句是输出间隔 
				System.out.println();//换行输出 
			}
		}
		}
}
