package strategy2;

import java.util.Arrays;
//Arrays�ķ�������
public class Sort implements Strategy{

	@Override
	public void reorder() {
		String string="���Ͼ�Ҫ��ҵ��";
		final StringBuilder unicode=new StringBuilder(string);
		unicode.append("��");
		
		char[] arr=new char[unicode.toString().length()];
		for (int i = 0; i < unicode.toString().length(); i++) {
			  // ȡ��ÿһ���ַ�
            char c = unicode.toString().charAt(i);
            // ת��Ϊunicode
            arr[i]=c;
		}
		//int[] arr1={1,2,3,4,5};
		Arrays.sort(arr);
		System.out.println("Arrays������");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
			System.out.print("\\u" + Integer.toHexString(arr[i])+"\t");
			//System.out.print(Integer.parseInt(arr[i],16)+"\t");
			System.out.println();
		}
		System.out.println();
		
	}

}
