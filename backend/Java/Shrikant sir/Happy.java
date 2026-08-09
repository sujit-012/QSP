class Happy {
	public static void main(String args[])
	{
		System.out.println(isHappy(19));
	}
	
    public static boolean isHappy(int n) 
	{
        int temp = n;

        while(temp != 4)
        {
            int sum = 0;

            while(temp != 0)
            {
                int dig = temp % 10;
                int pow = dig*dig;
                sum = sum + pow;
                temp = temp/10;
            }
            
            if(sum == 1)
            {
                return true;
            }
            else
            {
                temp = sum;
            }
        }
        return false;
    }
}