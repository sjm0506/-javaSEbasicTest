import java.util.*;
//��֧���̿��� if~else���
public class IfStarementDemo{
	public static void main(String[] args){
		/*if(10>20){
			System.out.print("-_-!");
		}else{
			System.out.print("*_*");
		}*/
	    /*  ����̨����һ����ScannerScanner scanner = new Scanner(System.in);
		int a = scanner .nextInt();
		if(a>0){
			System.out.print("������");
		}else if(a<0){
			System.out.print("������");
		}else{
			System.out.print("��");
		}*/
		// ��֧���̿���ʵ�������ϵ�ҵ��
		// 0������ 1������ �ڶ������
		/* double price = 6.00;//��Ʒ����
		double totalPrice = 0;// ׼������Ǯ
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����빺��������");
		int count = scanner.nextInt();//�ӿ���̨���빺���� count����
		if(count==1){
			totalPrice = price*count;
			System.out.print("����Ҫ֧����"+totalPrice);
		}else if(count==2){
			totalPrice = price+(count-1)*(price/2);
			System.out.print("����Ҫ֧����"+totalPrice);
		}else {
			System.out.print("��������");
		}*/
		// switch(�������ʽ) case  score����
		Scanner scanner = new Scanner(System.in);
		System.out.print("����������ĳɼ���");
		int score = scanner.nextInt();
		// char �ַ�
		// String �ַ���
		String level ="";
		switch(score/10){
			case 10:
			    level = "����";
				break;
			case 9:
			    level = "����";
				break;
	        case 8:
			    level = "����";
				break;
			case 7:
			    level = "�е�";
				break;
			case 6:
			    level = "����";
				break; 
		    default:
			    level = "������";
			// ��������������default
		}
		System.out.print(level);
		
	}
}