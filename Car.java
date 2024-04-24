
/**
 * 車を作るためのクラス
 */
public class Car {
	//Carを作る要素を記述しています。
	private  String type;
	private String color;
	private int fuelefficiency;
	private int fuel;
    
	
	/**
	 *インスタンスメソッド 
	 */
	public void showinfo() {
		System.out.println("車種" + type + "色" + color + "燃費" + fuelefficiency + "燃料" + fuel);
	}

	/**
	 * インスタンスしたものを走らせるためのメソッド
	 * @param km 走行距離
	 */
	void run(int km) {

		if (this.fuel >= km / this.fuelefficiency) {
			this.fuel -= km / this.fuelefficiency;

			System.out.println(
					km + "km走りました。残りの燃料は" + this.fuel + "ℓです");

		} else 
			System.out.println(this.type + "の燃料が足りません");
            
		}

	
    
	/**
	 * オブジェクト生成時に必要なものの詳細情報
	 * @param type車種
	 * @param color色
	 * @param fuelefficiency燃費
	 * @param fuel燃料
	 */
	public Car(String type, String color, int fuelefficiency, int fuel) {
		this.type = type;
		this.color = color;
		this.fuelefficiency = fuelefficiency;
		this.fuel = fuel;

	}

	

	

	/**車の走る距離
	 * @param args
	 */
	public static void main(String[] args) {
		
       
		Car car = new Car("180SX", "black", 12, 60);
        
		car.run(70);
		car.run(5000);

	}

}
