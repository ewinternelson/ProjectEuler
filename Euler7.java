
public class Euler7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=10001;
		int num=3;
		int status=1;
		
		  for ( int count = 2 ; count <=end ;  )
	      {
	         for ( int i = 2 ; i <= Math.sqrt(num) ; i++ )
	         {
	            if ( num%i == 0 )
	            {
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 )
	         {
	            System.out.println(num);
	            count++;
	         }
	         status = 1;
	         num++;
	      }         
		
	}

}
