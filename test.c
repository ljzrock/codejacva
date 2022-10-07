#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<time.h>

int main()
{
	int command[4] = { 0,1,2,3 };						/*定义一个数组*/
	int num;
	struct tm* sysTime;
	printf("如需帮助可输入数字0！\n");					/*输出字符串*/
	printf("请输入命令符：\n");						/*输出字符串*/

	while (1)
	{
		scanf("%d", &num);							/*获得输入数字*/
		/*判断用于输入的字符*/
		if (command[0] == num)						/*如果输入数字0*/
		{
			/*输出帮助信息*/
			printf("输入数字1显示系统日期，输入数字2显示系统时间，输入数字3退出系统！\n");
		}
		else if (command[1] == num)					/*如果是命令数字1*/
		{
			time_t nowTime;
			time(&nowTime);						/*获取系统日期*/
			sysTime = localtime(&nowTime);			/*转换为系统日期*/
			printf("系统日期：%d-%d-%d \n", 1900 + sysTime->tm_year, sysTime->tm_mon + 1, sysTime->
				tm_mday);					/*输出信息*/
		}
		else if (command[2] == num)					/*如果是命令数字2*/
		{
			time_t nowTime;
			time(&nowTime);						/*获取系统时间*/
			sysTime = localtime(&nowTime);			/*转换为系统时间*/
			printf("系统时间：%d:%d:%d \n", sysTime->tm_hour, sysTime->tm_min, sysTime->tm_sec);
			/*输出信息*/
		}
		else if (command[3] == num)
		{
			return 0;								/*退出系统*/
		}
		printf("请输入命令符：\n");					/*输出字符串*/
	}

	return 0;										/*程序结束*/
}


//#include<stdio.h>
//int main()
//{
//	int i;
//	char string[7] = { "mrsoft"};
//	char reverse[7] = { 0 };
//	int size;
//	size = sizeof(string);
//	for (i = 0; i < 6; i++)
//	{
//		reverse[size - i - 2] = string[i];
//	}
//	printf("输出源字符串：%s\n", string);
//	printf("输出目标字符串：%s\n", reverse);
//	return 0;
//	   /*输出源字符串：mrsoft
//		输出目标字符串：tfosrm*/
//
//}

//#include<stdio.h>
//
///*声明函数*/
//void CelerityRun(int left, int right, int array[]);
//
//int main()
//{
//	int i;
//	int a[10];
//	printf("为数组元素赋值：\n");
//	/*通过键盘为数组元素赋值*/
//	for (i = 0; i < 10; i++)
//	{
//		printf("a[%d]=", i);
//		scanf("%d", &a[i]);
//	}
//
//	/*从小到大排序*/
//	CelerityRun(0, 9, a);
//	printf("排序结果如下：\n");
//	/*输出数组*/
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d\t", a[i]);					/*输出制表位*/
//		if (i == 4)							/*如果是第5个元素*/
//			printf("\n");					/*输出换行*/
//	}
//	printf("\n");
//	return 0;								/*程序结束*/
//}
//
//void CelerityRun(int left, int right, int array[])
//{
//	int i, j;
//	int middle, iTemp;
//	i = left;
//	j = right;
//	middle = array[(left + right) / 2];				/*求中间值*/
//	do
//	{
//		while ((array[i] < middle) && (i < right))		/*从左找小于中值的数*/
//			i++;
//		while ((array[j] > middle) && (j > left))		/*从右找大于中值的数*/
//			j--;
//		if (i <= j)						      	/*找到了一对值*/
//		{
//			iTemp = array[i]; 
//			array[i] = array[j];
//			array[j] = iTemp;
//			i++;
//			j--;
//		}
//	} while (i <= j);							/*如果两边的下标交错，就停止（完成一次）*/
//
//	/*递归左半边*/
//	if (left < j)
//		CelerityRun(left, j, array);
//	/*递归右半边*/
//	if (right > i)
//		CelerityRun(i, right, array);
//	//为数组元素赋值：
//	//	a[0] = 87
//	//	a[1] = 413 
//	//	a[2] = 153
//	//	a[3] = 341
//	//	a[4] = 25
//	//	a[5] = 25
//	//	a[6] = 3615
//	//	a[7] = 24
//	//	a[8] = 241
//	//	a[9] = 15
//	//	排序结果如下：
//	//	15      24      25      25      87
//	//	153     241     341     413     3615
//}



//#include<stdio.h>
//int main()
//{
//	int i;
//	int a[10];
//	int iTemp;
//	int iPos;
//	printf("为数组元素赋值：\n");
//	/*通过键盘为数组元素赋值*/
//	for (i = 0; i < 10; i++)
//	{
//		printf("a[%d]=", i);
//		scanf("%d", &a[i]);
//	}
//
//	/*从小到大排序*/
//	for (i = 1; i < 10; i++) 						/*循环数组中的元素*/
//	{
//		iTemp = a[i]; 						        /*设置插入值*/
//		iPos = i - 1;
//		while ((iPos >= 0) && (iTemp < a[iPos])) 	 /*寻找插入值的位置*/
//		{
//			a[iPos + 1] = a[iPos]; 				    /*插入数值*/
//			iPos--;
//		}
//		a[iPos + 1] = iTemp;
//	}
//	printf("排序结果如下：\n");
//	/*输出数组*/
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d\t", a[i]);					/*输出制表位*/
//		if (i == 4)							/*如果是第5个元素*/
//			printf("\n");					/*输出换行*/
//	}
//	printf("\n");
//	return 0;	
///*	为数组元素赋值：
//		a[0] = 65
//		a[1] = 6
//		a[2] = 51
//		a[3] = 58
//		a[4] = 99
//		a[5] = 31
//		a[6] = 544
//		a[7] = 1556
//		a[8] = 25
//		a[9] = 14
//		排序结果如下：
//		6       14      25      31      51
//		58      65      99      544     1556*//*程序结束*/
//}


//#include<stdio.h>
//int main()
//{
//	//交换排序法 
//	int i, j;
//	int a[10];
//	int temp;
//	printf("为数组元素赋值：\n");
//	for (i = 0; i < 10; i++)
//	{
//		printf("a[%d]=", i);
//		scanf("%d", &a[i]);
//
//	}
//	//交换法排序 数组元素从小到大排序
//	for (i = 0; i < 9; i++)           //外层循环下标为0-8，表示前9个数组元素
//	{
//		for (j = i + 1; j < 10; j++)  // 内层循环元素小标为i+1~9,表示后面的待比较数组元素
//		{
//			if (a[j] < a[i])          //如果后一个数比前一个数小
//			{
//				                      //交换两个数组元素 使得小数前移
//				temp = a[i];
//				a[i] = a[j];
//				a[j] = temp;
//			}
//		}
//	}
//	printf("排序结果如下：\n");
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d\t", a[i]);
//		if (i == 4)
//			printf("\n");
//	}
//	printf("\n");
//		return 0;
//	/*	为数组元素赋值：
//			a[0] = 98
//			a[1] = 54
//			a[2] = 66
//			a[3] = 85
//			a[4] = 588
//			a[5] = 36
//			a[6] = 15
//			a[7] = 8
//			a[8] = 65
//			a[9] = 6
//			排序结果如下：
//			6       8       15      36      54
//			65      66      85      98      588*/
//}




//#include<stdio.h>
//int main()
//{
//	//冒泡排序方法
//	int i, j;
//	int a[10];
//	int temp;
//	printf("为数组元素赋值：\n");
//	for (i = 0; i < 10; i++)
//	{
//		printf("a[%d]=", i);
//		scanf("%d", &a[i]);
//	}
//	//采用冒泡排序法是数组元素从小到大排序
//	for (i = 1; i < 10; i++)   //外层循环元素的下标为1-9，表示后9个数组元素
//	{
//		for (j = 9; j >= i; j--) //内层循环元素的下标为9-i 表示从最后一个元素开始向前循环
//		{
//			if (a[j] < a[j - 1])  //如果前一个数比后一个数大
//			{
//				//交换两个数组元素 是小数前移，如同冒泡
//				temp = a[j - 1];
//				a[j - 1] = a[j];
//				a[j] = temp;
//			}
//		}
//	}
//	printf("排序结果如下：\n");
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d\t", a[i]);
//		if (i == 4)
//			printf("\n");
//	}
//	return 0;
//	//为数组元素赋值：
//	//	a[0] = 45
//	//	a[1] = 98
//	//	a[2] = 45
//	//	a[3] = 2
//	//	a[4] = 25
//	//	a[5] = 61
//	//	a[6] = 58
//	//	a[7] = 1
//	//	a[8] = 5
//	//	a[9] = 44
//	//	排序结果如下：
//	//	1       2       5       25      44
//	//	45      45      58      61      98
//}





//#include<stdio.h>
//int main()
//{
//	//选择排序方法
//	int i, j;
//	int a[10];
//	int temp;//定义变量表示最小数组元素
//	int pos;//定义变量 表示元素位置
//	printf("为数组元素赋值：\n");
//	for (i = 0; i < 10; i++)
//	{
//		printf("a[%d]=", i);
//		scanf("%d", &a[i]);
//
//	}
//	//选择排序法对数组元素从小到大排序
//	for (i = 0; i < 9; i++)        //设置外层循环下标0-8，表示前9个元素
//	{
//		temp = a[i];              //假设当前元素为最小值
//		pos = i;                  //记录最小值元素位置
//		for (j = i+1; j < 10; j++)  //设置内层循环下标为i+1-9，表示剩下的未排序的数组元素
//		{
//			if (a[j] < temp)      //如果后续的元素中有比前面设定的最小值还小
//			{
//				temp = a[j];      //重新设定最小值
//				pos = j;          //修正最小元素位置
//			}
//		}
//		a[pos] = a[i];            //此两行代码用于将最小的数组元素和当前排序次数对应的数组元素互换
//		a[i] = temp;
//	}
//	printf("排序结果如下：\n");
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d\t", a[i]);
//		if (i == 4)
//			printf("\n");
//
//	}
//	printf("\n");
//	return 0;
//	/*为数组元素赋值：
//		a[0] = 96
//		a[1] = 54
//		a[2] = 82
//		a[3] = 61
//		a[4] = 33
//		a[5] = 15
//		a[6] = 27
//		a[7] = 87
//		a[8] = 46
//		a[9] = 25
//		排序结果如下：
//		15      25      27      33      46
//		54      61      82      87      96*/
//}





//#include<stdio.h>
//
//int main()
//{
//	char cString[100];								/*定义保存字符串的数组*/
//	int iIndex, iWord = 1;								/*iWord表示单词的个数*/
//	char cBlank;										/*表示空格*/
//	printf("请输入字符串：\n");
//	gets(cString);									/*输入字符串*/
//
//	if (cString[0] == '\0')								/*判断字符串为空的情况*/
//	{
//		printf("There is no char!\n");
//	}
//	else if (cString[0] == ' ')							/*判断第一个字符为空格的情况*/
//	{
//		printf("First char just is a blank!\n");
//	}
//	else
//	{
//		for (iIndex = 0; cString[iIndex] != '\0'; iIndex++)	/*循环判断每一个字符*/
//		{
//			cBlank = cString[iIndex];					/*得到数组中的字符元素*/
//			if (cBlank == ' ')							/*判断是不是空格*/
//			{
//				iWord++;								/*如果是则加1*/
//			}
//		}
//		printf("一共有%d个单词\n", iWord);
//	}
//	return 0;
//}


//#include<stdio.h>
//int main()
//{
//	int inedx;
//	int lengthe = 0;
//	char c[80];
//	printf("请输入字符串：\n");
//	gets(c);
//	for (inedx = 0; c[inedx] != '\0'; inedx++)
//	{
//		lengthe++;
//	}
//	printf("字符串的长度是：%d\n", lengthe);
//	return 0;
//}
//#include<stdio.h>
//int main()
//{
//	int inedx;
//	char c1[33] = "Education is the door of freedom";
//	char c2[100] = "教育是通向自由之门";
//	for (inedx = 0; inedx < 33; inedx++)
//	{
//		printf("%c", c1[inedx]);
//	}
//	printf("\n%s\n", c2);
//	return 0;
//	/*Education is the door of freedom
//		教育是通向自由之门
//}*/

//#include<stdio.h>
//int main()
//{
//	char c[5] = { 'p','a','r','k' };
//	int i;
//	for (i = 0; i < 5; i++)
//	{
//		printf("%c", c[i]);
//	}
//	printf("\n");
//	return 0;
//}


//#include<stdio.h>
//int main()
//{
//	int  i, j, s = 0, c[3], a[3][5];
//	printf("请输入成绩：\n");
//	for (i = 0; i < 3; i++)
//	{
//		for (j = 0; j < 5; j++)
//		{
//			printf("a[%d][%d]=", i, j);
//			scanf("%d", &a[i][j]);
//			s += a[i][j];
//		}
//		c[i] = s / 5;
//		s = 0;
//	}
//	printf("数学的平均成绩是（取整数）:%d\n语文的平均成绩是（取整数）:%d\n英语的平均成绩是（取整数）:%d\n", c[0], c[1], c[2]);
//	return 0;
//	/*请输入成绩：
//		a[0][0] = 93
//		a[0][1] = 87
//		a[0][2] = 90
//		a[0][3] = 76
//		a[0][4] = 70
//		a[1][0] = 90
//		a[1][1] = 76
//		a[1][2] = 60
//		a[1][3] = 80
//		a[1][4] = 71
//		a[2][0] = 70
//		a[2][1] = 88
//		a[2][2] = 72
//		a[2][3] = 77
//		a[2][4] = 96
//		数学的平均成绩是（取整数）:83
//		语文的平均成绩是（取整数） : 75
//		英语的平均成绩是（取整数） : 80*/
//}


//#include<stdio.h>
//int main()
//{
//	char c[5][5] = { {'a','b','c','d','e'},
//				   {'g','a','t','d','h'},
//				   {'f','y','a','d','o'},
//				   {'q','e','t','a','p'},
//				   {'k','a','u','r','a'},
//	};
//	int i, j;
//	for (i = 0; i < 5; i++)
//	{
//		for (j = 0; j < 5; j++)
//		{
//			if (i == j)
//			{
//				printf("对角线字符是：%c\n", c[i][j]);
//			}
//
//		}
//	}
//	return 0;
//	/*对角线字符是：a
//		对角线字符是：a
//		对角线字符是：a
//		对角线字符是：a
//		对角线字符是：a*/
//
//}


//#include<stdio.h>
//int main()
//{
//	int a[2][3], b[3][2];
//	int i, j;
//	for (i = 0; i < 2; i++)
//	{
//
//
//		for (j = 0; j < 3; j++)
//		{
//			printf("a[%d][%d]=", i, j);
//			scanf("%d", &a[i][j]);
//
//		}
//	}
//	printf("输出二维数组：\n");
//	for (i = 0; i < 2; i++)
//	{
//		for (j = 0; j < 3; j++)
//		{
//			printf("%d\t", a[i][j]);
//
//		}
//		printf("\n");
//	}
//	for (i = 0; i < 2; i++)
//	{
//		for (j = 0; j < 3; j++)
//		{
//			b[j][i] = a[i][j];
//		}
//	}
//	printf("输出转换后的二维数组：\n");
//	for(i = 0; i < 3; i++)
//	{
//		for (j = 0; j < 2; j++)
//		{
//			printf("%d\t", b[i][j]);
//
//		}
//		printf("\n");
//
//	}
//
//	return 0;
//	/*  a[0][0] = 12
//		a[0][1] = 34
//		a[0][2] = 25
//		a[1][0] = 78
//		a[1][1] = 65
//		a[1][2] = 95
//		输出二维数组：
//		12      34      25
//		78      65      95
//		输出转换后的二维数组：
//		12      78
//		34      65
//		25      95*/
//
//}


//#include<stdio.h>
//int main()
//{
//	int a[3][3];
//	int i, j;
//	for (i = 0; i < 3; i++)
//	{
//		for (j = 0; j < 3; j++)
//		{
//			printf("a[%d][%d]=", i, j);//输出数组元素下标哦
//			scanf("%d", &a[i][j]);//输入数组元素
//
//		}
//	}
//	printf("输出二维数组：\n");
//	for (i = 0; i < 3; i++)
//	{
//		for (j = 0; i < 3; j++)//数组引用都是从下标0开始的 
//		{
//			printf("%d\t", a[i][j]);//输出数组 并制表 
//		}
//		printf("\n");
//	}
//	return 0;
//}



//#include<stdio.h>
//int main()
//{
//	int a[3], i;
//	printf("请输入语文，数学，英语的成绩：\n");
//	for (i = 0; i < 3; i++)
//	{
//		scanf("%d", &a[i]);
//	}
//	printf("\n");
//	printf("语文，数学，英语的成绩是：\n");
//	for (i = 0; i < 3; i++)
//	{
//		printf("%d ", a[i]);
//
//	}
//	printf("\n");
//	return 0;
//	/*请输入语文，数学，英语的成绩：
//		87 98 96
//
//		语文，数学，英语的成绩是：
//		87 98 96*/
//}




//#include<stdio.h>
//int main()
//{
//	//定义两个整型数组 和两个控制变量
//	int a[20] = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 }, inedx;
//	int a1[21] = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 ,21 }, inedx1;
//	printf("体育老师按身材高矮排队编号，老师排好，编号是：\n");
//	for (inedx = 0; inedx < 20; inedx++)//控制变量表示数组下标，循环控制数组元素
//	{
//		printf("%d ", a[inedx]);
//
//	}
//	printf("\n");
//	printf("重新排列插队编号及后面的同学，他们的编号是：\n");
//	for (inedx1 = 7; inedx1< 21; inedx1++)//数组下标可以对数组任意一个数进行操作
//	{
//		printf("%d ", a1[inedx1]);//打印数组元素
//
//	}
//	printf("\n");
//	return 0;
//	/*体育老师按身材高矮排队编号，老师排好，编号是：
//		1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
//		重新排列插队编号及后面的同学，他们的编号是：
//		8 9 10 11 12 13 14 15 16 17 18 19 20 21*/
//}



//#include<stdio.h>
//int main()
//{
//	int grad[10] = { 12,5,21,15,32,10,25,14,30,20 };//初始化数组 (定义数组并赋值)
//	int total = 0;
//	int i;
//	float avg;
//	for (i = 0; i < 10; i++)//用下标控制数组元素，
//	{
//		total += grad[i]; //实现数组每个元素的累计求和
//
//	}
//	avg = ((float)total / 10); // 强制类型转换 求取平均数
//	printf("篮球比赛的平均成绩是：%.2f\n", avg);//打印平均数
//
//	return 0;
//
//}



//#include<stdio.h>
//int main()
//{
//	//一维数组
//	int iarray[11], inedx;      //定义数组和控制变量
//	printf("请输入手机号：\n");
//	for (inedx = 0; inedx < 11; inedx++)  //变量inedx用于控制数组下标，程序执行从数组下标0开始存入
//	{
//		scanf("%d", &iarray[inedx]); //给了一个for循环依次接收键入信息存放在数组iarray中
//	}
//	printf("手机号是：\n");
//	for (inedx = 0; inedx < 11; inedx++)  //变量inedx用于控制数组下标，程序执行从数组下标0开始打印
//	{
//		printf("%d", iarray[inedx]);    //再给一个for循环 依次从数组iarray中输出打印刚才输入的信息
//	}
//	printf("\n");                         //控制换行 
//	return 0;
//	/*请输入手机号：
//		1 3 8 5 6 5 6 8 9 4 3
//		手机号是：
//		13856568943*/
//}