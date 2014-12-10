
public class Petlja {

		public static void main(String[] args) {
		System.out.println("unesite prvi broj");
		int a= TextIO.getlnInt();
		
		System.out.println("unesite drugi broj");
		int b= TextIO.getlnInt();
		
		System.out.println("unesite treci broj");
		int c= TextIO.getlnInt();
		
		if (a>b && a>c){
			System.out.println("Prvi broj je veci " + a);
		}
		else if (b>c) {
			System.out.println("Drugi broj je veci " + b);
		}
		
		else if (b==a && b>c) {
			System.out.println("Prvi i Drugi broj su isti i veci " +a +" " + b);
		}
		else if (b==c && b>a) {
				System.out.println("Drugi i Treci broj su isti i veci " +a + " "+ b);
		}		
		else if (a==c && a>b) {
			System.out.println("Prvi i Treci broj su isti i veci " +a + " "+ b);
		}
		else if (a==b && a==c){
			System.out.println("Svi brojevi su isti " +a + " "+ b+" "+c);
		}
		
		else	{
			System.out.println("Treci broj je veci " + c);
				}
	}	

}
