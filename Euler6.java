
public class Euler6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b=0;
		for(a=1;a<101;a++){
			b=a+b;
		}
		int f=b*b;
		int c=0;
		int d;
		for(d=1;d<101;d++){
			c=d*d+c;
			
		}
		int g = f-c;
		System.out.println(g);
		}
			
	}


