import java.util.Scanner;
public class Rabbit {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������·ݣ�");
		int month = scanner.nextInt();
		//1  1
		//2  1
		//3  2
		//4  3
		//5  5
		//6  8
		//7  13
		//�������Եó�,�ӵ������¿�ʼ,ÿ���µ�����Ϊ��һ���¼�����һ���µĺ�
		int[] arr = new int[month];
		for (int i = 0; i < month; i++) {
			if (i < 2) {
				arr[i] = 1;
			} else {
				arr[i] = arr[i-1] + arr[i - 2];
			}
		}
		System.out.println("��" + month + "�������ӵ�������:" + arr[month-1]);
	}
}