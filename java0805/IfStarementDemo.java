import java.util.*;
//分支流程控制 if~else语句
public class IfStarementDemo{
	public static void main(String[] args){
		/*if(10>20){
			System.out.print("-_-!");
		}else{
			System.out.print("*_*");
		}*/
	    /*  控制台输入一个数ScannerScanner scanner = new Scanner(System.in);
		int a = scanner .nextInt();
		if(a>0){
			System.out.print("正整数");
		}else if(a<0){
			System.out.print("负整数");
		}else{
			System.out.print("零");
		}*/
		// 分支流程控制实现买饮料的业务
		// 0杯不卖 1杯以上 第二杯半价
		/* double price = 6.00;//产品单价
		double totalPrice = 0;// 准备花的钱
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入购买数量：");
		int count = scanner.nextInt();//从控制台输入购买量 count数量
		if(count==1){
			totalPrice = price*count;
			System.out.print("您需要支付："+totalPrice);
		}else if(count==2){
			totalPrice = price+(count-1)*(price/2);
			System.out.print("您需要支付："+totalPrice);
		}else {
			System.out.print("输入有误");
		}*/
		// switch(整数表达式) case  score分数
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("请输入该生的成绩：");
		int score = scanner.nextInt();
		// char 字符
		// String 字符串
		String level ="";
		switch(score/10){
			case 10:
			    level = "优秀";
				break;
			case 9:
			    level = "优秀";
				break;
	        case 8:
			    level = "良好";
				break;
			case 7:
			    level = "中等";
				break;
			case 6:
			    level = "及格";
				break; 
		    default:
			    level = "不及格";
			// 其他不成立就找default
		}
		System.out.print(level);*/
		//               while循环
		// 1-100的和
		/*int i = 1;
		int sum = 0;
		while(i<=100){//死循环 (i==i)||(true)
			sum = sum + i;
			i++;
		}
		System.out.print(sum);*/
		   //初始化1 //布尔表达式2 5 //i++3 7
		/*for(i =0;i<=100;i++){
			System.out.print(i);// 循环体4 6
		}*/
		int i = 1;
		do{
			System.out.print("do...");
		}while(i<1);//不满足while的条件时至少执行一次
		
	}
}