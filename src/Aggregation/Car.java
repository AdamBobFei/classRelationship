package Aggregation;

public class Car {

	//在car中不直接实例化engine,而是通过构造或者是set的方法将外部实例化好的engine注入到car中,也就是他们实例化的时间不同,因此他们不存在
	//因此他们不存在生命周期的依赖关系,而仅仅是整体与部分之间的关系
	private Engine engine;
	
	public Car(Engine engine){
		this.engine=engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
}
