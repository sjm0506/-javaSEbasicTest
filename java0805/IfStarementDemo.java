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
		/*Scanner scanner = new Scanner(System.in);
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
		System.out.print(level);*/
		//               whileѭ��
		// 1-100�ĺ�
		/*int i = 1;
		int sum = 0;
		while(i<=100){//��ѭ�� (i==i)||(true)
			sum = sum + i;
			i++;
		}
		System.out.print(sum);*/
		   //��ʼ��1 //�������ʽ2 5 //i++3 7
		/*for(i =0;i<=100;i++){
			System.out.print(i);// ѭ����4 6
		}*/
		int i = 1;
		do{
			System.out.print("do...");
		}while(i<1);//������while������ʱ����ִ��һ��
		
	}
}