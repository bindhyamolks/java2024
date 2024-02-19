package methodsandreturns;

public class Maintest {

	public static void main(String[] args) {
	
      main();
      main(1,2,3,4.5,5.6f,true);
	}
	
	public static void main()
	{System.out.println("main mtethod");

}
	public static void main(int u,int b,long w,double x,float y,boolean z)
	
	{
		System.out.println(u+b+w+x+y);
		System.out.println(z);
	}
}
