import java.util.Scanner;
public class Test4{
	public static void main(String[] args){
		/*String nums = "692116851128";
		int oldNum = 0;
		int evenNum = 0;
		// ���� charAt();
		for(int i=0; i<nums.length();i++){
			//ȡ����λ
			if(i%2 == 0){
				oldNum += nums.charAt(i)-'0';
			}else {
				evenNum += nums.charAt(i)-'0';
			}
		}
		System.out.print("����λ��"+oldNum);
		System.out.print("ż��λ��"+evenNum);*/
		// �񺽴�ѧ������׼
		// ���175���� ����50KGһ��
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("�����������:");
		int height = scanner.nextInt();
		System.out.println("��������������");
		int weight = scanner.nextInt();
		if(height >= 175 && weight <= 50){
			System.out.print("��ϲ����¼ȡ��");
		}else{
			System.out.print("���ź�,��ı��У");
		}*/
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("������������ߣ�");
		int height = scanner.nextInt();
		System.out.print("�������������أ�");
		int weight = scanner.nextInt();
		if(height >= 175 && weight <= 50){
			System.out.print("��ϲ�������ɹ�¼ȡ��");
		}else{
			System.out.print("���ź�,��ı��У");
		}*/
		// ��Ŀ�����
		// ����������  ÿҳ��ʾ��������
		int allDatas = 151;
		int pageSize = 10;
		int totalPage = 0;
		totalPage = allDatas%pageSize == 0 ? allDatas/pageSize:allDatas/pageSize+1;
		System.out.print(totalPage);
	}
}