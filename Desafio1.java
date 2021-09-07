import java.io.IOException;
import java.util.Scanner;

public class Desafio1 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (               ) {
        	for (                 ) {
        		M[i][j] = leitor.nextDouble();
        	}
        }
        
        for (                    ) {
        	for (                     ) {
        		if (                  ) soma += M[i][j];
        	}
        }

        if (                     ) soma /= 30;
    	System.out.println(String.format("%.1f", soma));
    }
	
}