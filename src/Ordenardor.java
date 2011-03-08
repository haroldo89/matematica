import java.util.Arrays;


public class Ordenardor {

	public int[] ordenar (int[] arreglo){
		int n = arreglo.length;
		int[] arreglo2 = new int[n];
		int m=Integer.MAX_VALUE;
		Arrays.fill(arreglo2,m);
		for(int i=0;i<n;i++){
			int min=0;
			for (int j=0; j < n; j++) {
				int c = matematica.min(arreglo[j], arreglo2[i]);
				if(c == arreglo[j]){
					arreglo2[i]=arreglo[j];
					min=j;
				}
			}
			arreglo[min]=m;
		}
		return arreglo2;
	}

	public static void main(String[] args) {
		Ordenardor a;
		a = new Ordenardor();
		int resp[]= a.ordenar(new int[]{4,5,3,8});
		System.out.println(resp[0]+ " "+resp[1]+" "+resp[2]+" "+resp[3]);
		

	}


}





