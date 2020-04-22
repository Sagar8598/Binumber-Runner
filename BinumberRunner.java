public class BinumberRunner
{
	int number1;
	int number2;
	public void binumber(int number1,int number2)
	{
		this.number1=number1;
		this.number2=number2;
	}
	public void add()
	{
		System.out.println(number1+number2);
	}
	public void multiply()
	{
		System.out.println(number1*number2);
	}
	public void doubleValue()
	{
		number1=number1*2;
		System.out.println(number1);
		number2=number2*2;
		System.out.println(number2);
	}
	public static void main(String[] args) {
		BinumberRunner number3=new BinumberRunner();
		number3.binumber(2,3);
		number3.add();
		number3.multiply();
		number3.doubleValue();
	}
}
