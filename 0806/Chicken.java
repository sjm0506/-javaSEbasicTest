public class Chicken {
	public static void main(String[] args){
		for(int i=1;i<20;i++){
			for(int j=1;j<34;j++){
				for(int k=1;k<300;k++){
					if((i+j+k==100) && (5*i+3*j+k/3==100)){
						System.out.println("公鸡的数量是"+i);
						System.out.println("母鸡的数量是"+j);
						System.out.println("小鸡的数量是"+k);
						System.out.println("......");
					}
				}
			}
		}
		
	}
}