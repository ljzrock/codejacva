import java.util.Scanner;
public class Test5 {
	public static void main(String[] args) {
//		Scanner myScanner = new Scanner(System.in);
//		System.out.println("请输入年龄：");
//		int age = myScanner.nextInt();
//         if(age>18) {
		
//        	 System.out.println("你的年龄已过18岁，要负法律责任");
//         }
//         else {
//        	 System.out.println("你还未成年，要接受教育");
//         }
	//嵌套举例
//		Scanner myScanner = new  Scanner(System.in);
//		System.out.println("请输入芝麻信用分1-100：");
//		int grade = myScanner.nextInt();
//		if(grade>=1 && grade<=100) {
//			if(grade == 100) {
//				System.out.println("信用分极好");
//			}else if(grade>80 && grade<=99) {
//				System.out.println("信用分优秀");
//			}else if(grade>=60 && grade<=80) {
//				System.out.println("信用分一般");
//			}else if(grade<60) {
//				System.out.println("信用分不及格");
//			}
//		}else {
//			System.out.println("信用分输入有误，请重新输入");
//		}
//	
//		参加歌手比赛，如果初赛成绩大于 8.0 进入决赛，
//		否则提示淘汰。并且根据性别提示进入男子组或女子组。
//       Scanner myScanner = new Scanner(System.in);//scanner一个扫描器物接键盘书输入的信息
//       System.out.println("请输入分数：");
//       double score = myScanner.nextDouble();
//       if(score>8.0) {
//    	   System.out.println("请输入性别：");
//    	  char gender = myScanner.next().charAt(0);
//    	  if(gender == '男') {
//    		  System.out.println("恭喜进入男子组决赛！！");
//    	  }else if(gender == '女') {
//    		  System.out.println("恭喜进入女子组决赛！！");
//    	  }else {
//    		  System.out.println("输入性别有误！！");
//    	  }
//    	   
//       }else {
//    	  System.out.println("成绩不达标，无缘决赛!!");
//       }
		/*请编写一个程序，该程序可以接收一个字符，比如:a,b,c,d,e,f,g
		a 表示星期一，b 表示星期二 …
		1,需要键盘输入字符，创建scanner扫描器接收输入的字符
		2，使用switch语句来判断星期几
		3，我们显示星期只有1-7 所以对应字符是a - g 超过 或输入不正确去需要执行default语句
	    4，代码演示：
	*/
//		System.out.println("请输入一个字母a-g：");
//		Scanner myScanner = new Scanner(System.in);
//		char c1 = myScanner.next().charAt(0);
//		switch(c1){
//		case 'a': 
//			System.out.println("星期一");
//			break;
//		case 'b': 
//			System.out.println("星期二");
//			break;
//		case 'c': 
//			System.out.println("星期三");
//			break;
//		case 'd': 
//			System.out.println("星期四");
//			break;
//		case 'e': 
//			System.out.println("星期五");
//			break;
//		case 'f': 
//			System.out.println("周六");
//			break;
//		case 'g': 
//			System.out.println("周末");
//			break;
//		default: 
//			System.out.println("您输入的有误，请重新输入！！");
//			break;
//				}
//		System.out.println("退出switch，继续执行程序！！");
	/*对学生成绩大于 60 分的，输出"合格"。低于 60 分的，输出"不合格"。   
     (注：输入的成绩不能大于 100), 提示 成绩/60
     1,要创建scanner对象接收输入的成绩
     2，因为case 后面的常量是具体值 所以我们将输入的成绩/60 在强制转换成int型 
     最后case后常量只要判断 0 和 1 就可 0 表示不合格 1 表示合格 
     最后代码演示
     */
//		Scanner myScanner = new Scanner(System.in);	
//		System.out.println("请输入成绩[1-100]:");
//		double score = myScanner.nextDouble();
//		if(score >= 0 && score <=100) {
//			switch((int)(score/60)) {
//			case 0:
//				System.out.println("不合格!");
//				break;
//			case 1:
//				System.out.println("合格！");
//				break;	
//			}	
//		} else {
//				System.out.println("请输入成绩再1-100！！");
//		}
		
		
		
//		     根据用于指定月份，打印该月份所属的季节。
//		      3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季 
//		      [课堂练习, 提示  用穿透]穿透是将相同属性的直接是使用穿透
		//直接上代码
		
//		   Scanner myScanner = new Scanner(System.in);
//		   System.out.println("请输入月份（1-12）：");
//		   int mooth = myScanner.nextInt();
//		   switch(mooth) {
//		   case 3:
//		   case 4:
//		   case 5:
//		   System.out.println("这是春季");
//		   break;
//		   case 6:
//		   case 7:
//		   case 8:
//		   System.out.println("这是夏季");
//		   break;
//		   case 9:
//		   case 10:
//		   case 11:
//		   System.out.println("这是秋季");
//		   break;
//		   case 1:
//		   case 2:
//		   case 12:
//		   System.out.println("这是冬季");
//		   break;
//		   default :
//			   System.out.println("您输入的月份不对（1-12）！！");
//		   }
//		
		/*打印 1~100 之间所有是 9 的倍数的整数，统计个数 及 总和.[
		*分析：1 循环控制变量   统计个数变量 总和变量 
		*     2  循环控制变量范围（1-100） 以及循环迭代条件（9的倍数）  
		*     3 使用for循环解决 
		*    4 代码演示：
		*/
//	       int count = 0,sum = 0,i;
//	       for(i = 1;i <= 100;i++) {
//	    	   if(i % 9 == 0) { 
//	    		   sum += i;
//	    		   count++;
//	    		  
//	    	   }
//	    
//	       }
//		   System.out.println("数量是："+count+"和是："+sum);
//	      
//	
		
//		int num = 1000;
//		for(int i=0,j=num;i <= num && j <= num;i++,j--) {
//				
//		System.out.println(i+"+"+j+"="+num);
//			
//		}
		
		
		
	//	1) 打印 1—100 之间所有能被 3 整除的数 
//		int num = 1;
//		while(num <= 100) {
//			if(num % 3 == 0) {
//				System.out.println(num);
//			}
//				num++;
//					
//		}
		
		
		
//		统计 3 个班成绩情况，每个班有 5 名同学，
//		求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]
		//求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
		//统计三个班及格人数，每个班有 5 名同学。
		//
		//思路分析:
	
		//化繁为简
		//(1) 先计算一个班 , 5 个学生的成绩和平均分 , 使用 for
		//1.1 创建 Scanner 对象然后，接收用户输入
		//1.2 得到该班级的平均分 , 定义一个 doubel sum 把该班级 5 个学生的成绩累积
		//(2) 统计 3 个班(每个班 5 个学生) 平均分
		//(3) 所有班级的平均分
		//3.1 定义一个变量，double totalScore 累积所有学生的成绩
		//3.2 当多重循环结束后，totalScore / (3 * 5)
		//(4) 统计三个班及格人数
		//4.1 定义变量 int passNum = 0; 当有一个学生成绩>=60, passNum++
		//4.2 如果 >= 60 passNum++
		//(5) 可以优化[效率，可读性, 结构]
		
	}
}