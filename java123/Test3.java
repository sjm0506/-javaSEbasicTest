import java.util.Scanner;
public class Test3{
	public static void main(String[] args){
		double result = multiply();
		System.out.print("���Ϊ��"+result);
		
	}
	// ��������
	// �˷�
	public static double multiply(){
        Scanner scanner = new Scanner(System.in);
		System.out.print("�������һ������");
		double value = scanner.nextDouble();
		System.out.print("������ڶ�������");
		double value2 = scanner.nextDouble();
		return value*value2;
		
		
	}
}