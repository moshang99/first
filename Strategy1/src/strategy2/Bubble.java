package strategy2;
//√∞≈›≈≈–Ú
public class Bubble implements Strategy{
	@Override
	public void reorder() {
		int[] arr={23,12,89,67,92 };
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		System.out.print("√∞≈›≈≈–Ú£∫");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	
}
