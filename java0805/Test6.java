import java.util.Scanner;
public class Test6{
	public static void main(String[] args){
		// 缴税后到手工资
		// salary工资;薪水
		/*System.out.print("请输入您的工资：");
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		//不用扣税的工资
		double minStandrad = 5000;
		// 天津扣税标准
		double finalSalary = salary - minStandrad;
		// 五险一金
		double oneMoney = 1000;
		// 补助
		double subSidy = 500;
		// 到手的工资
		double realSalary = 0;
		// 如果 <1500 3%
		// 1500-4500 10%
		// 4500-9000 20%
		// 9000-35000 25%
		// 35000-55000 30%
		if(finalSalary<=1500){       // 魔法值
			realSalary = finalSalary*0.97 + minStandrad - oneMoney + subSidy;
		}else if(finalSalary >1500 && finalSalary <= 4500){
			realSalary = finalSalary*0.90 + minStandrad - oneMoney + subSidy;
		}else if(finalSalary >4500 && finalSalary <= 9000){
			realSalary = finalSalary*0.80 + minStandrad - oneMoney + subSidy;
		}else if(finalSalary >9000 && finalSalary <= 35000){
			realSalary = finalSalary*0.75 + minStandrad - oneMoney + subSidy;
		}else if(finalSalary >35000 && finalSalary <= 55000){
			realSalary = finalSalary*0.70 + minStandrad - oneMoney + subSidy;
		}else{
			realSalary = minStandrad - oneMoney + subSidy;
		}
		System.out.print("您到手工资："+realSalary);
		*/
		// 取奇数偶数位和
		// 692116851128
		// 字符串
		String str = "692116851128";
		int oldNum = 0;
		int evenNum = 0;
		// 方法 charAt();
		System.out.print(str.charAt(0));  //0代表第一位'6'下下标
		for(int i=0;i<str.length();i++){
			// 取奇数位
			if(i%2 == 0){
		
				oldNum += str.charAt(i)-'0';
			}else{
				evenNum += str.charAt(i)-'0';
			}
		}
				System.out.print("奇数位和："+oldNum);
				System.out.print("偶数位和："+evenNum);
		 
	}
}