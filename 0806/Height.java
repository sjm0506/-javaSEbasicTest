public class Height {
	public static void main(String[] args){
		// 9.һ��С���100�߶���������,ÿ����غ�����ԭ�߶ȵ�һ��,
		// �����£������ڵ�ʮ�����ʱ,������������?��10�η������?
		double height = 100;
		double half = height/2;
		for(int i=2;i<=10;i++){
			height =height+half*2;
			half=half/2;
		}
		System.out.println(height);
		System.out.print(half);
	}
}
	