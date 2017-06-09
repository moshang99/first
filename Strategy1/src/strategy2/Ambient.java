package strategy2;
//������
public class Ambient {
	private Strategy strategy;

	public Ambient(Strategy strategy) {
		this.strategy = strategy;
	}

	public Strategy getStrategy() {
		return strategy;
	}
	//����������������ӿ��ڷ���
	public void operate(){
		this.strategy.reorder();
	}
	
}
