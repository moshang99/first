package strategy2;

public class Test {
	public static void main(String[] args) {
		//ð������
		Ambient bubble=new Ambient(new Bubble());
		bubble.operate();
		//ѡ������
		Ambient choices=new Ambient(new Choices());
		choices.operate();
		System.out.println(new Choices());
		//��������
		Ambient insert=new Ambient(new Insert());
		insert.operate();
		//Arrays������
		Ambient sort=new Ambient(new Sort());
		sort.operate();
		System.out.println(sort);
	}
}
