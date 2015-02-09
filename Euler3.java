
public class Euler3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double nope = 0;
        double orig = 600851475143d;
        for (double i = 3; i < orig; i += 2) {
            while (orig % i == 0) {
                nope = i;
                orig = orig / i;
            }
        }
        System.out.println("" + ((orig == 1)?nope:orig));
	}
}


