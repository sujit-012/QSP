class Fasinating
{
	public static void main(String[] args)
	{
		int num = 192;

		int num1 = number(192, 192, 1);

		System.out.println(isFasinating(num1, 1));
	}

	public static boolean isFasinating(int num, int i)
	{
		if(i > 9) return true;

		if(checkNum(num, i, 0))
		{
			return isFasinating(num, i + 1);
		}
		else
		{
			return false;
		}
	}

	public static boolean checkNum(int num, int i, int ct)
	{
		if(num == 0) return ct != 0;

		if(num % 10 == i) ct++;

		return checkNum(num / 10, i, ct);
	}

	public static int number(int num, int num1, int i)
	{
		if(i == 3)return num;

		return number(num * 1000 + num1 * (i + 1), num1, i + 1);
	}
}