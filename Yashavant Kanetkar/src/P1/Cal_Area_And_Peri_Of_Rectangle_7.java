package P1;

public class Cal_Area_And_Peri_Of_Rectangle_7 {
	public static void main(String[] args) {
		int len = 10, bred = 5, rad = 5;
		float a_rec, p_rec, a_cir, c_cir;
		
		a_rec = len * bred;
		p_rec = 2f * (len + bred);
		a_cir = 3.14f * rad * rad;
		c_cir = 2f * 3.14f * rad;
		
		System.out.println("Length of Rectangle = " + len + "\tBreadth of Rectangle = " + bred);
		System.out.println("Area of Rectangle = " + a_rec);
		System.out.println("Perimeter of Rectangle = " + p_rec);
		System.out.println("Radius of Circle = " + rad);
		System.out.println("Area of Circle = " + a_cir);
		System.out.println("Circumference of Circle = " + c_cir);
		
	}
}
