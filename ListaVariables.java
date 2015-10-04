import java.util.Scanner;
public class ListaVariables{

   private Nodo p;  
   public ListaVariables()  { 
      p = null;  
      
   } 
   
   public void altas(Variables informacion) 
   { 
      Nodo n = new Nodo(informacion); 
      Nodo u; 
      if (p == null) 
         p = n; 
      else 
      { 
         u = p; 
         while 
               (u.enlace != null) 
            u = u.enlace; 
         u.enlace = n;
      } 
   }// Altas insertando por el final
   
   /// estrai el valor de un dato
   public String datoValor(String nombre) 
   { 
      Nodo t = p; 
      while 
          (t != null)
         if 
           (t.informacion.getNombre() == nombre) 
            return t.informacion.getValor(); 
         else t = t.enlace; 
      return ""; 
   }//datoValor   
   
   
   public void consultaGeneral() 
   { 
      Nodo t = p; 
      int cont = 0; 
      System.out.println("               *****   -----Tabla de Símbolos-----   *****");
      System.out.printf("\n\n%s\t\t%s\t\t%s\t\t%s\t\t%s\t","Nombre","Tipo","Valor","     ","ID'S");
      //System.out.println("Nombre de la variable"+"   "+"Tipo de Variable"+"   "+"Valor de la Variable"+"                  "+"ID'S");
   
      while (t != null) 
      { 
         //System.out.println(t.informacion.getNombre()+"   "+t.informacion.getTipo()+"   "+t.informacion.getValor()+"                  "+t.informacion.getID());
         System.out.printf("\n\n%s\t\t%s\t\t%s\t\t%s\t\t%s\t",t.informacion.getNombre(), t.informacion.getTipo(), t.informacion.getValor(),"     ",t.informacion.getID());
         t=t.enlace;
      } 
   }//consulta general de los alumnos 
   
   public Nodo busqueda(String nombre)  
   {       Nodo t = p;      
      while (t != null)  
             
         if (t.informacion.getNombre().equals(nombre)) {
            
            return t;        
         }
         else           
            t = t.enlace;    
      return null;        
   } 



   public Nodo modificar(String nombre,String nuevoValor) 
   { 
      Nodo t = p; 
      while 
          (t != null)          
         if 
           (t.informacion.getNombre().equals(nombre)){
            t.informacion.setValor(nuevoValor);
            return t;
         }   
         else t = t.enlace; 
      return null; 
   }//modificacion indi
   //se imprime la variable que el usuario busca
   public String imprime(String nombre) 
   { 
      Nodo t = p; 
      while (t != null)          
         if (t.informacion.getNombre().equals(nombre))
         {
            System.out.printf("\n\n%s\t\t%s\t\t%s\t\t%s","Nombre","Tipo","Valor");
            System.out.printf("\n%s\t\t%s\t\t%s\t%d",t.informacion.getNombre(), t.informacion.getTipo(), t.informacion.getValor());
            System.out.println("");
            return "true";
         }   
         else t = t.enlace; 
      return "null"; 
   }//termina la imprecion

   public String consultaIndividual(String nombre, int opc) 
   { 
      Nodo t = p; 
      while 
          (t != null)          
         if (t.informacion.getNombre().equals(nombre))
         {
            switch(opc)
            {
               case 1:
                  return t.informacion.getTipo();
               case 2:
                  return t.informacion.getValor();
            }
         }   
         else t = t.enlace; 
      return "null"; 
   }//busqueda
}//clase