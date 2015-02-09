
public class Euler2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib1 = 1;
        int fib2 =2;
        int fibonacci = 0;
        int sum = 0;
        
        for (int counter = 3; counter<=33; counter++)
          {
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
            if (fibonacci % 2 == 0)
              {
                sum = sum + fibonacci;
              }
            else
              {
                continue;
              }
          }
        System.out.println(sum+2);
      }
	}
	

