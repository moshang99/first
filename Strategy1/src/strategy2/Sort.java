package strategy2;

import java.util.Arrays;
//Arrays的方法排序
public class Sort implements Strategy{

	@Override
	public void reorder() {
		String string="马上就要毕业了";
		final StringBuilder unicode=new StringBuilder(string);
		unicode.append("吗");
		
		char[] arr=new char[unicode.toString().length()];
		for (int i = 0; i < unicode.toString().length(); i++) {
			  // 取出每一个字符
            char c = unicode.toString().charAt(i);
            // 转换为unicode
            arr[i]=c;
		}
		//int[] arr1={1,2,3,4,5};
		Arrays.sort(arr);
		System.out.println("Arrays方法：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
			System.out.print("\\u" + Integer.toHexString(arr[i])+"\t");
			//System.out.print(Integer.parseInt(arr[i],16)+"\t");
			System.out.println();
		}
		System.out.println();
		
	}

}
