
public class First6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
				int max=1000;
				int result=0;
				for(int i=1; i<max; i++)
				{
					if(i%3==0 || i%5==0)
					{
						result+=i;
					}
				}
				System.out.println(result);
			}
		}
			

}
