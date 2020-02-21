package abstraction;

public  abstract class vehicle {
	public float v;
    abstract void move();
    abstract void speed();
	public vehicle( float v){
		this.v=v;
	}
	public void label(){
		System.out.println("Vehicle's data: \n");
	}
	
	
}
