
public class SumaSa3Broja {

	public static void main(String[] args) {
		int suma=0;
			int i=0;
			while (i<3){
				suma=suma + TextIO.getInt();
				i=i+1;
			}
			System.out.println( "Suma tri broja je" +suma);
	}

}
