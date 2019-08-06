public class Height {
	public static void main(String[] args){
		// 9.一个小球从100高度自由落下,每次落地后反跳回原高度的一半,
		// 再落下，求它在第十次落地时,共经过多少米?第10次反弹多高?
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
	