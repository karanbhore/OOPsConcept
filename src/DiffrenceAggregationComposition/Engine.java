package DiffrenceAggregationComposition;

public class Engine {
	public void work() {
		System.out.println("Engine of has been started!!!");
	}
	public static void main(String[] args) {
		Engine engine=new Engine();
		
		Car car=new Car(engine);
		car.move();
	}
}
final class Car{
	private final Engine engine;

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}
	public void move() {
		engine.work();
		
		System.out.println("Car is moving");
	}
}