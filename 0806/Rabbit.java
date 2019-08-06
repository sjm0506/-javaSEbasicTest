import java.util.Scanner;
public class Rabbit {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入月份：");
		int month = scanner.nextInt();
		//1  1
		//2  1
		//3  2
		//4  3
		//5  5
		//6  8
		//7  13
		//分析可以得出,从第三个月开始,每个月的兔子为上一个月加上上一个月的和
		int[] arr = new int[month];
		for (int i = 0; i < month; i++) {
			if (i < 2) {
				arr[i] = 1;
			} else {
				arr[i] = arr[i-1] + arr[i - 2];
			}
		}
		System.out.println("第" + month + "个月兔子的总数是:" + arr[month-1]);
	}
}