package P1;

public class CalAndConOfDistance_4 {
	public static void main(String[] args) {
		float d_in_km, d_in_m, d_in_f, d_in_i, d_in_cm;
		d_in_km = 1f;
		d_in_m = d_in_km * 1000;
		d_in_cm = d_in_m * 100;
		d_in_f = d_in_cm / 30.48f;
		d_in_i = d_in_f * 12;
		System.out.println("Distance Between Two Places (in KM) = " + d_in_km);
		System.out.println("Distance Between Two Places (in M) = " + d_in_m);
		System.out.println("Distance Between Two Places (in CM) = " + d_in_cm);
		System.out.println("Distance Between Two Places (in Feet) = " + d_in_f);
		System.out.println("Distance Between Two Places (in Inch) = " + d_in_i);
	}
}
