package strategy2;
//插入排序
public class Insert implements Strategy{

	@Override
	public void reorder() {
		int[] arr={7,3,4,90,6};
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j >0; j--) {
				if (arr[j]<arr[j-1]) {
					int t=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=t;
				}else break;
			}
		}
		System.out.print("插入排序：");
		for (int i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}

}





















































/**
 * arr={7,3,4,90,6};
 * 1.第一次内循环，拿到数arr[1]=3,和arr[0]=7进行对比，3小，换位置;
		得到arr={3,7,4,90,6};
　  2.第二次内循环，拿到数arr[2]=4，和arr[1]=7比，位置交换，
		得到arr={3,4,7,90,6};
		拿到arr[1]=4,和arr[0]=3比,位置不换;
   3.第三次内循环，拿到数arr[3]=90，和arr[2]=7比，位置不变，break跳出本次循环。
   4.第四次循环，拿到数arr[4]=6，和arr[3]=90，位置交换
   		得到arr{3,4,7,6,90};
   		拿到arr[3]=6，和arr[2]=7，位置交换，
   		得到arr={3,4,6,7,90}
 * 		拿到arr[2]=6，和arr[1]=4，位置不变，break跳出本次循环。
 * 
 * */
 