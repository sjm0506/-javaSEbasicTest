import java.util.Scanner;
public class Test3{
	public static void main(String[] args){
		double result = multiply();
		System.out.print("结果为："+result);
		
	}
	// 创建方法
	// 乘法
	public static double multiply(){
        Scanner scanner = new Scanner(System.in);
		System.out.print("请输入第一个数：");
		double value = scanner.nextDouble();
		System.out.print("请输入第二个数：");
		double value2 = scanner.nextDouble();
		return value*value2;
		
		
	}
}