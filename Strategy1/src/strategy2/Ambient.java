package strategy2;
//环境类
public class Ambient {
	private Strategy strategy;

	public Ambient(Strategy strategy) {
		this.strategy = strategy;
	}

	public Strategy getStrategy() {
		return strategy;
	}
	//这个方法用来操作接口内方法
	public void operate(){
		this.strategy.reorder();
	}
	
}
