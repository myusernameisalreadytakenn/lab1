/**
 * C5 = 0 C=a×B, a - const
 * C7 = 4 тип елементів матриці byte
 * C11 = 8 	Знайти середнє значення елементів кожного рядка матриці
 */
public class lab2 {
	public static void main(String[] args)
	{
        final byte[][] B =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };

        	// multiply each element on a
        	byte a = 2;
        	for (int i = 0; i < B.length; i++) {
        		for (int j = 0; j < B[i].length; j++) {
        			B[i][j] *= a; 
        		}
        	}

        	// print matrix
        	for (int i = 0; i < B.length; i++) {
        		for (int j = 0; j < B[i].length; j++) {
        			System.out.print(B[i][j] + " ");
        		}
        		System.out.println();
        	}
        	// calculate avg
        	byte[] avg = {0,0,0};
        
        	for (int i = 0; i < B.length; i++) {
        		byte rowSum = 0;
        		for (int j = 0; j < B[i].length; j++) {
        			rowSum += B[i][j]; 
        		}
        		avg[i] = (byte) (rowSum/B.length);
        	}
        	// print avg
        	System.out.println("Average per row");
        	for (int i = 0; i < avg.length; i++) {
        		System.out.print(avg[i] + " ");
        	}
	}
}
