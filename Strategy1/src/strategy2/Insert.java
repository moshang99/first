package strategy2;
//��������
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
		System.out.print("��������");
		for (int i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}

}





















































/**
 * arr={7,3,4,90,6};
 * 1.��һ����ѭ�����õ���arr[1]=3,��arr[0]=7���жԱȣ�3С����λ��;
		�õ�arr={3,7,4,90,6};
��  2.�ڶ�����ѭ�����õ���arr[2]=4����arr[1]=7�ȣ�λ�ý�����
		�õ�arr={3,4,7,90,6};
		�õ�arr[1]=4,��arr[0]=3��,λ�ò���;
   3.��������ѭ�����õ���arr[3]=90����arr[2]=7�ȣ�λ�ò��䣬break��������ѭ����
   4.���Ĵ�ѭ�����õ���arr[4]=6����arr[3]=90��λ�ý���
   		�õ�arr{3,4,7,6,90};
   		�õ�arr[3]=6����arr[2]=7��λ�ý�����
   		�õ�arr={3,4,6,7,90}
 * 		�õ�arr[2]=6����arr[1]=4��λ�ò��䣬break��������ѭ����
 * 
 * */
 