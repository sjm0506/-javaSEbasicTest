import java.util.Scanner;
public class Test4{
	public static void main(String[] args){
		/*String nums = "692116851128";
		int oldNum = 0;
		int evenNum = 0;
		// 方法 charAt();
		for(int i=0; i<nums.length();i++){
			//取奇数位
			if(i%2 == 0){
				oldNum += nums.charAt(i)-'0';
			}else {
				evenNum += nums.charAt(i)-'0';
			}
		}
		System.out.print("奇数位："+oldNum);
		System.out.print("偶数位："+evenNum);*/
		// 民航大学招生标准
		// 身高175以上 体重50KG一下
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入身高:");
		int height = scanner.nextInt();
		System.out.println("请输入您的体重");
		int weight = scanner.nextInt();
		if(height >= 175 && weight <= 50){
			System.out.print("恭喜您被录取！");
		}else{
			System.out.print("很遗憾,另谋高校");
		}*/
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("请输入您的身高：");
		int height = scanner.nextInt();
		System.out.print("请输入您的体重：");
		int weight = scanner.nextInt();
		if(height >= 175 && weight <= 50){
			System.out.print("恭喜您，被成功录取！");
		}else{
			System.out.print("很遗憾,另谋高校");
		}*/
		// 三目运算符
		// 总数据条数  每页显示几条数据
		int allDatas = 151;
		int pageSize = 10;
		int totalPage = 0;
		totalPage = allDatas%pageSize == 0 ? allDatas/pageSize:allDatas/pageSize+1;
		System.out.print(totalPage);
	}
}