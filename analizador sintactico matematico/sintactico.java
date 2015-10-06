import java.io.*;
public class sintactico
{
   //Creación de arreglo para las producciones matematicas
   static String mat[][]=new String [9][2];
   //Se crea la tabla para la gramatica 
   static String tabla[][]=new String [16][12];
   public static void main (String args[]) throws IOException
   {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
      analisisMatematico();
   
   }
   
   public static void analisisMatematico()
   {
      //producciones matematicas 
      mat[0][0]="E";mat[0][1]="6";
      mat[1][0]="E";mat[1][1]="2";
      mat[2][0]="E";mat[2][1]="6";
      mat[3][0]="T";mat[3][1]="6";
      mat[4][0]="T";mat[4][1]="6";
      mat[5][0]="T";mat[5][1]="2";
      mat[6][0]="F";mat[6][1]="6";
      mat[7][0]="F";mat[7][1]="2";
      mat[8][0]="F";mat[8][1]="2";
      
      System.out.println("Valores de las producciones");
      
      for (int x=0; x<=8; x++)
      {
         for (int y=0; y<=1; y++)
         {
            System.out.print (mat[x][y]);
         }
      }   

      tabla[0][0]="d5"; tabla [0][1]="d6";tabla [0][2]=" ";tabla [0][3]=" ";tabla [0][4]=" ";tabla [0][5]=" ";tabla [0][6]="d4";tabla [0][7]=" ";tabla [0][8]=" ";tabla [0][9]="1";tabla [0][10]="2";tabla [0][11]="3";
      tabla [1][0]=" ";tabla[1][1]=" ";tabla[1][2]="d7";tabla[1][3]="d8";tabla[1][4]=" ";tabla[1][5]=" "; tabla[1][6]=" "; tabla[1][7]=" ";tabla[1][8]="acept";tabla[1][9]=" ";tabla[1][10]=" ";tabla[1][11]=" ";
      tabla [2][0]=" ";tabla [2][1]=" ";tabla [2][2]="r2";tabla [2][3]="r2";tabla [2][4]="d9";tabla [2][5]="d10";tabla [2][6]=" ";
   }
   
}

   
   
