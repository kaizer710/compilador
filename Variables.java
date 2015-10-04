public class Variables{
   
   private String nombre;
   private String tipo;
   private String valor;
   private String id;
   //constructor vacio
   public Variables(){
   
   }
   
   //constructor vacio que nada mas recibe los atributos
   public Variables(String nombre,String tipo,String valor,String id){
      
      this.nombre=nombre;
      this.tipo=tipo;
      this.valor=valor;
      this.id=id;
   }//contructor
   
   //metodos get 
   public String getNombre () {
      return nombre; 
   }
   public String getTipo () { 
      return tipo; 
   }
   public String getValor () { 
      return valor; 
   }
   public String getID () { 
      return id; 
   }

   
   //metodos set
   public void setNombre(String nom) {
      this.nombre = nom;
   }
   public void setTipo (String tip) { 
      this.tipo=tip; 
   }
   public void setValor (String val) { 
      this.valor=val; 
   }
   public void setID (String idd) { 
      this.id=idd; 
     
   }
}//clase