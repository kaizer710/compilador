import java.io.*;
public class sintactico
{
   //Creaci�n de arreglo para las producciones matematicas
   static String mat[][]=new String [9][2];
   //Se crea la tabla para la gramatica 
   static String tabla[][]=new String [17][12];
   // variables para la cadena
   static String cad, cad2;
   static String ar_cadena[];
   static int cont=0;
   static int banderita=0;
   static int a,s,A;
   //Creaci�n de lista enlazada 
   static nodo nuev=null;
   static nodo ini=null;
   static nodo p,q=null;
   static nodo n;
   static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   public static void main (String args[]) throws IOException
   {
     //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
      analisisMatematico();
   
   }//fin main
   
   public static void analisisMatematico()throws IOException
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
         System.out.println("");
      }   
   
      tabla [0][0]="d5"; tabla [0][1]="d6";tabla [0][2]=" ";tabla [0][3]=" ";tabla [0][4]=" ";tabla [0][5]=" ";tabla [0][6]="d4";tabla [0][7]=" ";tabla [0][8]=" ";tabla [0][9]="1";tabla [0][10]="2";tabla [0][11]="3";
      tabla [1][0]=" ";tabla[1][1]=" ";tabla[1][2]="d7";tabla[1][3]="d8";tabla[1][4]=" ";tabla[1][5]=" "; tabla[1][6]=" "; tabla[1][7]=" ";tabla[1][8]="acept";tabla[1][9]=" ";tabla[1][10]=" ";tabla[1][11]=" ";
      tabla [2][0]=" ";tabla [2][1]=" ";tabla [2][2]="r2";tabla [2][3]="r2";tabla [2][4]="d9";tabla [2][5]="d10";tabla [2][6]=" ";tabla [2][7]="r2";tabla [2][8]="r2";tabla [2][9]=" ";tabla [2][10]=" ";tabla [2][11]=" ";
      tabla [3][0]=" ";tabla [3][1]=" ";tabla [3][2]="r6";tabla [3][3]="r6";tabla [3][4]="r6";tabla [3][5]="r6";tabla [3][6]=" ";tabla [3][7]="r6";tabla [3][8]="r6";tabla [3][9]=" ";tabla [3][10]=" ";tabla [3][11]=" ";
      tabla [4][0]="d5";tabla [4][1]="d6";tabla [2][2]=" ";tabla [2][3]=" ";tabla [2][4]=" ";tabla [4][5]=" ";tabla [4][6]="d4";tabla [4][7]=" ";tabla [4][8]=" ";tabla [4][9]="11";tabla [4][10]="2";tabla [4][11]="3";
      tabla [5][0]=" ";tabla [5][1]=" ";tabla [5][2]="r8";tabla [5][3]="r8";tabla [5][4]="r8";tabla [5][5]="r8";tabla [5][6]="d4";tabla [5][7]="r8";tabla [5][8]="r8";tabla [5][9]=" ";tabla [5][10]=" ";tabla [5][11]=" ";
      tabla [6][0]=" ";tabla [6][1]=" ";tabla [6][2]="r9";tabla [6][3]="r9";tabla [6][4]="r9";tabla [6][5]="r9";tabla [6][6]=" ";tabla [6][7]="r9";tabla [6][8]="r9";tabla [6][9]=" ";tabla [6][10]=" ";tabla [6][11]=" ";
      tabla [7][0]="d5";tabla [7][1]="d6";tabla [7][2]=" ";tabla [7][3]=" ";tabla [7][4]=" ";tabla [7][5]=" ";tabla [7][6]="d4";tabla [7][7]=" ";tabla [7][8]=" ";tabla [7][9]=" ";tabla [7][10]="12";tabla [7][11]="3";
      tabla [8][0]="d5";tabla [8][1]="d6";tabla [8][2]=" ";tabla [8][3]=" ";tabla [8][4]=" ";tabla [8][5]=" ";tabla [8][6]="d4";tabla [8][7]=" ";tabla [8][8]=" ";tabla [8][9]=" ";tabla [8][10]="13";tabla [8][11]="3";
      tabla [9][0]="d5";tabla [9][1]="d6";tabla [9][2]=" ";tabla [9][3]=" ";tabla [9][4]=" ";tabla [9][5]=" ";tabla [9][6]="d4";tabla [9][7]=" ";tabla [9][8]=" ";tabla [9][9]=" ";tabla [9][10]=" ";tabla [9][11]="14";
      tabla [10][0]="d5";tabla [10][1]="d6";tabla [10][2]=" ";tabla [10][3]=" ";tabla [10][4]=" ";tabla [10][5]=" ";tabla [10][6]="d4";tabla [10][7]=" ";tabla [10][8]=" ";tabla [10][9]=" ";tabla [10][10]=" ";tabla [10][11]="15";
      tabla [11][0]=" ";tabla [11][1]=" ";tabla [11][2]="d7";tabla [11][3]="d8";tabla [11][4]=" ";tabla [11][5]=" ";tabla [11][6]=" ";tabla [11][7]="d16";tabla [11][8]=" ";tabla [11][9]=" ";tabla [11][10]=" ";tabla [11][11]=" ";
      tabla [12][0]=" ";tabla [12][1]=" ";tabla [12][2]="r1";tabla [12][3]="r1";tabla [12][4]="d9";tabla [12][5]="d10";tabla [12][6]=" ";tabla [12][7]="r1";tabla [12][8]="r1";tabla [12][9]=" ";tabla [12][10]=" ";tabla [12][11]=" ";
      tabla [12][0]=" ";tabla [13][1]=" ";tabla [13][2]="r3";tabla [13][3]="r3";tabla [13][4]="d9";tabla [13][5]="d10";tabla [13][6]=" ";tabla [13][7]="r3";tabla [13][8]="r3";tabla [13][9]=" ";tabla [13][10]=" ";tabla [13][11]=" ";
      tabla [14][0]=" ";tabla [14][1]=" ";tabla [14][2]="r4";tabla [14][3]="r4";tabla [14][4]="r4";tabla [14][5]="r4";tabla [14][6]=" ";tabla [14][7]="r4";tabla [14][8]="r4";tabla [14][9]=" ";tabla [14][10]=" ";tabla [14][11]=" ";
      tabla [15][0]=" ";tabla [15][1]=" ";tabla [15][2]="r5";tabla [15][3]="r5";tabla [15][4]="r5";tabla [15][5]="r5";tabla [15][6]=" ";tabla [15][7]="r5";tabla [15][8]="r5";tabla [15][9]=" ";tabla [15][10]=" ";tabla [15][11]=" ";
      tabla [16][0]=" ";tabla [16][1]=" ";tabla [16][2]="r7";tabla [16][3]="r7";tabla [16][4]="r7";tabla [16][5]="r7";tabla [16][6]=" ";tabla [16][7]="r7";tabla [16][8]="r7";tabla [16][9]=" ";tabla [16][10]=" ";tabla [16][11]=" ";
   
      //Captura de cadena 
      System.out.println("Ingrese la cadena");
      cad=br.readLine();
      cad = cad+"$"; //se hace una contatenaci�n de $ para la cadena
      cad2="";//se inicializa variable
      
      //ciclo para separar id o terminales
      for(int x=0;x<cad.length();x++)
      {
         if(cad.charAt(x)=='i'|cad.charAt(x)=='I')//verifica si es id
         {
            cad2+=cad.charAt(x);
            cad2+=cad.charAt(x+1);
            cad2+=" ";
            x++;
         }
         else if (cad.charAt(x)=='n'&&cad.charAt(x+1)=='u') //verifica si es num
         {
            cad2+=cad.charAt(x);
            cad2+=cad.charAt(x+1);
            cad2+=cad.charAt(x+2);
            cad2+=" ";
            x+=2;	
         }
         else //se verifica si es simbolo terminal
         {
            cad2+=cad.charAt(x);
            cad2+=" ";
         }
      }//Fin de ciclo for 
   
      ar_cadena=cad2.split("\\s");//ya separado la cadena con espacios pasa cada elemento a un arreglo
      System.out.println("Elementos separados");
      for (int x=0;x<ar_cadena.length;x++)
      {
         System.out.println(ar_cadena[x]);
      
      }
   //Algoritmo SLR
      boolean aceptar=false;
      cont=0;
      insertar ("0");
      while (aceptar==false)
      {
         s=Integer.parseInt(p.dato);
         a=elementos_tabla(ar_cadena[cont]);
         System.out.println("s= " +s + "a="+a);
      
         //verifica si es despalzar o reducci�n
         if(tabla[s][a].startsWith("d"))
         {
            insertar(""+a);insertar(""+eseprima(tabla[s][a]));
            System.out.println("d"+eseprima(tabla[s][a]));
            if (cont<ar_cadena.length)
            {
               cont++;
            }
         
         }
         else if(tabla[s][a].startsWith("r"))
         {
            int h=(eseprima(tabla[s][a])-1);
         	//variable para desplazar los datos
            int desp=Integer.parseInt(mat[h][1]);
            
            for(int x=0;x<desp;x++)
            {
               eliminar_dato(p.dato);
            }
            s=Integer.parseInt(p.dato);
            A=elementos_tabla(mat[h][0]);
            insertar(""+A);
            insertar (""+tabla[s][A]);
            System.out.println("s="+p.dato);
            System.out.println("A="+A);
         }
         else if (tabla[s][a].startsWith("acept"))
         {
            System.out.println("Cadena aceptada"); aceptar=true;
         }
         else
         {
            System.out.println("Error de cadena"); aceptar=true;
         }
            
         
        
      }
   
   }//fin metodo analisis matematico

   public static void insertar(String dato)
   {
      nodo nuev=new nodo();
      nuev.dato=dato;
      nuev.enlace=null;
      if(ini==null)
      {
         ini=nuev;
      }
      else
      {
         p.enlace=nuev;
      }
      p=nuev;
   }
   
   //metodo para verificar la tabla 
   public static int elementos_tabla (String dato)
   {
      int vr=0;
      if (dato.startsWith("id"))
         vr=0;
      else if(dato.equals("num"))
         vr=1;
      else if (dato.equals("+"))
         vr=2;
      else if (dato.equals("-"))
         vr=3;
      else if (dato.equals("*"))
         vr=4;
      else if (dato.equals("/"))
         vr=5;
      else if (dato.equals("("))
         vr=6;
      else if (dato.equals(")"))
         vr=7;
      else if (dato.equals("$"))
         vr=8;
      else if (dato.equals("E"))
         vr=9;
      else if (dato.equals("T"))
         vr=10;
      else if (dato.equals("F"))
         vr=11;
   
      	
      return vr;
   }


   //metodo para s prima
   public static int eseprima(String dato)
   {
      int red=0;
      String cadena="";
      for(int x=1;x<dato.length();x++)
      {
         cadena+=dato.charAt(x);
      }
      red=Integer.parseInt(cadena);
      return red;
   }

   public static void eliminar_dato(String dato)
   {
      if (ini==null)
         System.out.println("No hay elementos");
      else
      {
         n=ini;
         banderita=0;
         while(n!=null & banderita==0)
         {
            if(n.dato==dato)
               banderita=1;
            else
            {
               q=n;
               n=n.enlace;
            }
         }
         if (banderita==1)
         {
            if(n==ini)
            {
               ini=ini.enlace;
            }
            else
            {
               q.enlace=n.enlace;
            }
         
            if(n.enlace==null)
            {
               p=q;
            }
            n=null;
            System.out.println("Dato "+dato	+ " borrado");
         }
      
      }
   }
}