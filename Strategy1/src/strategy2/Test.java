package strategy2;

public class Test {
	public static void main(String[] args) {
		//√∞≈›≈≈–Ú
		Ambient bubble=new Ambient(new Bubble());
		bubble.operate();
		//—°‘Ò≈≈–Ú
		Ambient choices=new Ambient(new Choices());
		choices.operate();
		System.out.println(new Choices());
		//≤Â»Î≈≈–Ú
		Ambient insert=new Ambient(new Insert());
		insert.operate();
		//Arraysµƒ≈≈–Ú
		Ambient sort=new Ambient(new Sort());
		sort.operate();
		System.out.println(sort);
	}
}
