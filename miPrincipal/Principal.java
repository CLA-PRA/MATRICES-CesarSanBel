package miPrincipal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Suma y multiplicacion de matrices.");
        System.out.println("==================================");
    	System.out.println("Leyendo matriz A...");
        int m1[][] = leeMatriz("matriz1");

        System.out.println("Leyendo matriz B...");
        int m2[][] = leeMatriz("matriz2");

        System.out.println("\nSumando matrices:");
        int m3[][] = sumaMatrices(m1,m2);
        for(int i=0; i<m1.length; i++) {
            for(int j=0; j<m1[i].length; j++) {
                 System.out.print(m1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("+");
        for(int i=0; i<m2.length; i++) {
            for(int j=0; j<m2[i].length; j++) {
                System.out.print(m2[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("=");
        for(int i=0; i<m3.length; i++) {
            for(int j=0; j<m3[i].length; j++) {
                System.out.print(m3[i][j]+" ");
            }
            System.out.println("");
        }
        if(sePuedeMultiplicar(m1,m2)) {
            System.out.println("\nMultiplicando matrices:");
            int m4[][] = multiplicaMatrices(m1,m2);
            for(int i=0; i<m1.length; i++) {
                for(int j=0; j<m1[i].length; j++) {
                    System.out.print(m1[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("*");
            for(int i=0; i<m2.length; i++) {
                for(int j=0; j<m2[i].length; j++) {
                    System.out.print(m2[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("=");
            for(int i=0; i<m4.length; i++) {
                for(int j=0; j<m4[i].length; j++) {
                    System.out.print(m4[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
    
    public static int[][] leeMatriz(String archivo) {
    	File f1 = new File("miPrincipal/"+archivo+".txt");
        int matriz[][] = null;
    	StringTokenizer st;
        Scanner entrada = null;
        String cadena;
        try {
        	int x = 0, y = 0;
            entrada = new Scanner(f1);
            String mat = entrada.nextLine();
            int ren = Integer.parseInt(mat.substring(0,1));
            int col = Integer.parseInt(mat.substring(2,3));
            matriz = new int[ren][col];
            while (entrada.hasNext()) {
                cadena = entrada.nextLine();
                st = new StringTokenizer(cadena, " ");
                while (st.hasMoreTokens()) {
                    matriz[x][y] = Integer.parseInt(st.nextToken());
                    y++;
                }
                x++;
                y=0;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        entrada.close();
        return matriz;
    }

    public static int[][] sumaMatrices(int[][] m1, int[][] m2) {
    	int ma3[][] = new int[m1.length][m1[0].length];
        for(int i=0; i<m1.length; i++) {
           	for(int j=0; j<m1[i].length; j++) {
           		ma3[i][j] = m1[i][j]+m2[i][j];
           	}
        }
        return ma3;
    }
    public static int[][] multiplicaMatrices(int[][] m1, int[][] m2) {
        int ma4[][] = new int[m1.length][m1[0].length];
 
        int suma=0;
        for(int i=0; i<m1.length; i++) {
        	for(int j=0; j<m1[i].length; j++) {
        		for(int k=0; k<m1[i].length; k++) {
        			suma = suma + m1[i][k]*m2[k][j];
        		}
        		ma4[i][j] = suma;
        		suma=0;
        	}
       	}
       	return ma4;
    }
    public static boolean sePuedeMultiplicar(int[][] m1, int[][] m2) {
        int m3[][] = new int[m1.length][m1[0].length];
        int m4[][] = new int[m2.length][m2[0].length];
        if(m1.length==m1[0].length && m1.length==m1[0].length) {
            return true;
        } else {
            return false;
        }
    }
}
