package strategy2;

public class Choices implements Strategy{

	@Override
	public void reorder() {
		char arr[]={'c','d','e','b','a'};
		for (int i = 0; i < arr.length-1; i++) {
			int k=i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[k]>arr[j]) {
					k=j;
				}
			}
			if (k!=i) {
				char f=arr[i];
				arr[i]=arr[k];
				arr[k]=f;
			}
		}
		System.out.print("—°‘Ò≈≈–Ú£∫");
		for (char i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}

}

 