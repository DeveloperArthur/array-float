import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	    
	    final int numeros = 5;
	    float aux=0;
	    
	    Scanner sc = new Scanner(System.in);
	    float Array[] = new float[numeros];
	    
	    //inserindo valores no Array
	    for(int i=0; i<numeros; i++){
	        System.out.println("Digite o numero da posicao ["+(i+1)+"]");    
	        Array[i] = sc.nextFloat();
	    }
	    
		//ordenando o array
		for(int j=0; j<numeros; j++){
		    for(int k=0; k<numeros; k++){
		        if(Array[k] > Array[j]){
		            aux = Array[j];
		            Array[j] = Array[k];
		            Array[k] = aux;
		        }
		    }
		}
		
		//imprimindo com 1 digito dps da virgula
		System.out.println("Array ordenado abaixo: ");
		for(int l=0; l<numeros; l++){
		    System.out.printf("%.1f\n", Array[l]);
		}
	}
}