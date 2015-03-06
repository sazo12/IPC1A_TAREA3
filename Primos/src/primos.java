import java.util.Scanner;
public class primos {

	public static void main(String[] args) {
	int n=0; boolean esPrimo=true;
	System.out.println("Ingrese un numero para verificar:");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	for(int i=2;i<n;i++)
		if(n%i==0){
		System.out.println("No es primo."); esPrimo=false;
		break;
		}
	if(esPrimo)
		System.out.println("Es primo.");
	}

}
