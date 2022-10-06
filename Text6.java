import java.util.Scanner;
public class Text6 {
        
	public static void main(String[] args) {
//		Scanner myScanner = new Scanner(System.in);
//		              //一个班级的总成绩
//		double totalscore = 0;        //全年级总成绩
//		int passNum = 0;              //及格人数 
//		for(int i = 1;i <= 3;i++) {   //班级个数
//			double sum = 0; 
//           for(int j = 1;j <=5;j++) { //班级人数
//        	 
//        	 System.out.println("请输入第"+i+"班第"+j+"个学生成绩：");
//        	 double score = myScanner.nextDouble();
//        	 if(score >= 60) {
//        		 passNum++;
//    	 }
//        	  sum += score;
//        	 System.out.println("成绩是："+score);
//	         }
//	           System.out.println("班级总分是："+sum+" 班级平均分是："+(sum / 5));
//	           totalscore += sum;
//	    }
//		
//			  System.out.println("所有班级的平均分是："+totalscore / (3*5));
//			  System.out.println("及格人数有:"+passNum);
		
		
		//九九乘法口诀表
		for (int i = 1;i <= 9;i++) {
			for (int j = 1;j <= i;j++ ) {
				System.out.print(j+" * "+i+" = "+(i*j)+"\t");		
			}
			System.out.println();
		}
		
	}

}
