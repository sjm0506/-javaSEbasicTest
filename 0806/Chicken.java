public class Chicken {
	public static void main(String[] args){
		for(int i=1;i<20;i++){
			for(int j=1;j<34;j++){
				for(int k=1;k<300;k++){
					if((i+j+k==100) && (5*i+3*j+k/3==100)){
						System.out.println("������������"+i);
						System.out.println("ĸ����������"+j);
						System.out.println("С����������"+k);
						System.out.println("......");
					}
				}
			}
		}
		
	}
}