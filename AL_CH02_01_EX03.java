//실습 2-3
public class AL_CH02_01_EX03 {
	public static void main(String[] args){
		int[] a = {1,2,3,4,5};
		int[] b = a.clone();
		b[3] = 0;
		
		System.out.print("a =");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\nb =");
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]+" ");
		}
	}
}