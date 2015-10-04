import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class nino
{ 
   static ListaVariables li =new ListaVariables();
//este es un cambio a otro cambio m嫳
   
   static Variables va =new Variables();
   public static void main(String[]chivas)throws IOException 
   {
      //private static
      //nino li=new nino();
      BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
      String texto="",xxx="",lectura=""; int edo=1,puntero=0,edo1=1,op1=1,op2=2,cont=0;
      boolean ban=false,ban2=false,ban3=false;
      //edo manipula  el autanomata y texto la  lectura del archivo  
      //se asignan las paalabras reservadas  a  cadenas
      String tipo="",nombre="",valor="",Id="",valor2="",ayuda1="",ayuda2="",ayuda3="",ayuda4=""; //se agrego lo sigiente  se creo una ER QUE TE ACEPTE CUALQIER NOMRbre
      int y=0;
      String a,arch,cad1,cad2,cad3,cad4,b,c="",aux,aux2;
      String captura="",captura2="",captura3="",captura4="";
      String ayud="",ayud2="",ayud3="",ayud4="",imprim="";
      String cambio="",cambio2="",cambio3="",cambio4="",c1="",c2="";
      Pattern p1 = Pattern.compile("[\\w]+");//se usara para la impresionde un id
   //para ver si es un letrero validode impresion
      //para ver  si es un ide valido
      Pattern pat = Pattern.compile("[^0-9]+([a-z]|[A-Z]|[0-9])*");//que empieze por letra minuscula,seguida de letras o num
      System.out.println("Proporciona el nombre del archivo");
      arch=ent.readLine();
      System.out.println("\n");
    
      try
      {
         File archivo1=new File(arch+".txt");
         File archivo2=new File(arch+".int");
         
         if(archivo1.exists()&&archivo2.exists()) 
         {
            System.out.println("Archivo Encontrado!!!! :)");
            System.out.println("\n");
                  //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector=new FileReader(arch+".txt");
          
                        //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido=new BufferedReader(lector);
            FileWriter escribir=new FileWriter(archivo2,true);
                  /*try
                  {
                     File archivo1=new File(arch+".int"); 
                     FileWriter escribir=new FileWriter(archivo1,true);
                  */
                        //Con el siguiente ciclo ex12traemos todo el contenido del objeto "contenido" y lo mostramos
            while((texto=contenido.readLine())!=null)
            {
               //System.out.println(texto);
               cont++;
                  
               cad1=texto.replaceAll("\\s"," ");//replaceAll(" +", " ").trim(); 
                             //quitamos comentarios del archivo
               cad2=cad1.replaceAll("\\?[A-Za-z0-9|[!#$%&/=?▼/:;*-+{}_.,<>院^~柵*.(\\s)]*([!#$%&/=?▼/:;*-+{}_.,<>院^~柵*(\\s))*[A-Za-z0-9.|[!#$%&/=?▼/:;*-+{}_.,<>院^~柵*(\\s)]+", "");
               escribir.write(cad2+"\n");
               System.out.println("Linea "+cont+" : "+cad2) ;
                                                         
                        
               a="";
              
               Pattern pcad=Pattern.compile("(^Cad)[\\s]([^0-9]+([a-z]|[A-Z]|[0-9])*)[=]('{2}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{2});");
               Matcher cadenam=pcad.matcher(cad2);
               Pattern cadas=Pattern.compile("(^Cad)[\\s]([^0-9]+([a-z]|[A-Z]|[0-9])*);");
               Matcher cadenas=cadas.matcher(cad2);
               Pattern pcad1=Pattern.compile("([^0-9|[\\s]]+([a-z]|[A-Z]|[0-9][\\s])*)[=]('{2}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{2});");
               Matcher cadeas=pcad1.matcher(cad2);
               Pattern pcad11=Pattern.compile("(^Cad)[\\s]([^0-9]+([a-z]|[A-Z]|[0-9][\\s])*)[=]('{2}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{2})");
               Matcher caderror=pcad11.matcher(cad2);
               Pattern pcad111=Pattern.compile("(^Cad)[\\s]([^0-9]+([a-z]|[A-Z]|[0-9][\\s])*)[=]('{2}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{1})");
               Matcher caderror2=pcad111.matcher(cad2);
               Pattern pcad2=Pattern.compile("(^Cad)[\\s]([^0-9]+([a-z]|[A-Z]|[0-9][\\s])*)[=]('{2}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+)");
               Matcher caderror3=pcad2.matcher(cad2);
               Pattern pcad22=Pattern.compile("(^Cad)[\\s]([^0-9]+([a-z]|[A-Z]|[0-9][\\s])*)[=]('{1}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{2})");
               Matcher caderror4=pcad22.matcher(cad2);
               Pattern pcad222=Pattern.compile("(^Cad)[\\s]([^0-9]+([a-z]|[A-Z]|[0-9][\\s])*)[=]([A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{2})");
               Matcher caderror5=pcad222.matcher(cad2);
               
               Pattern pcad3=Pattern.compile("(^Cad)[\\s]([^0-9]+([a-z]|[A-Z]|[0-9])*)[=]('{1}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{2});");
               Matcher caderror6=pcad3.matcher(cad2);
               
               Pattern pcad33=Pattern.compile("(^Cad)[\\s]([^0-9]+([a-z]|[A-Z]|[0-9])*)[=]([A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{2});");
               Matcher caderror7=pcad33.matcher(cad2);
               
               Pattern pcad333=Pattern.compile("(^Cad)[\\s]([^0-9]+([a-z]|[A-Z]|[0-9])*)[=]('{2}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{1});");
               Matcher caderror8=pcad333.matcher(cad2);
               
               Pattern pcad4=Pattern.compile("(^Cad)[\\s]([^0-9]+([a-z]|[A-Z]|[0-9])*)[=]('{2}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+);");
               Matcher caderror9=pcad4.matcher(cad2);
               Pattern pcad34555=Pattern.compile("(^lee)([\\s]|[\\w-]|[*]|[+]|[-]|[_]|[.]|[:]|[;]|[,]|[<]|[>]|[|]|[!]|[#]|[$]|[%]|[&]|[/]|[(]|[)]|[=]|[?]|[癒]|[聶])*");
               Matcher leg=pcad34555.matcher(cad2);
            
               Pattern ple=Pattern.compile("(^lee)[\\s]([\\s]|[(]+)([^0-9|[\\s]]+([a-z]|[A-Z]|[0-9]|[\\s])*)([)]+);");
               Matcher lee=ple.matcher(cad2);
             
               Pattern prinn=Pattern.compile("(^pritin)([\\w-]|[*]|[+]|[-]|[_]|[.]|[:]|[;]|[,]|[<]|[>]|[|]|[!]|[#]|[$]|[%]|[&]|[/]|[(]|[)]|[=]|[?]|[癒]|[聶]|[']|[\\s]|[]])*;");
               Matcher imp=prinn.matcher(cad2);
               //Patron para Cad nom.variable=''cadena'';
               if (cadenam.matches())
               {
                  int x=0;
                  for(int i=0;i<cad2.length();i++)
                  { 
                     char letra1=cad2.charAt(i);
                     
                     if(letra1=='=')
                     {
                        break;
                     }
                     x++;
                  }
                  cad3=cad2.substring(x);
                  int x1=0;
                  for(int i1=0;i1<cad3.length();i1++)
                  { 
                     char letra2=cad2.charAt(i1);
                     
                     if(letra2==';')
                     {
                        break;
                     }
                     x1++;
                  }
               
                  String Cad=cad2.substring(0,3);
               //aqi solo imprimira "Cad"
                  //System.out.println(Cad);
                  cad4=cad3.substring(0,x1-1);
                  //System.out.println(cad4);
               //aqi solo imprimira desde el igual hasta la cadena de asigancion
               //valor2=cad4;
                  valor2=cad4.replace("=", "");
                  //System.out.println(valor2);
               
                //aqi solo imprimira la cadena de asigancion
                  xxx=cad2.replaceFirst("'{2}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{2}","");
                  //System.out.println(xxx);
               //aqi imprime "Cad seguido del nombre de la variable un = y al final ;"
                  b=xxx.replace(";"," ;");
               //reemplazamos ";por"espacio ;"
                  c=b.replace("="," = ");
                
               
               //xxx=c.replaceFirst("'{2}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{2}","");
               //System.out.println(xxx);
                //se inicializo a
                  StringTokenizer tokens=new StringTokenizer(c);
               //se crea un  objeto de la clase StringTokenizer y se agrega b  que es  la cadena del archivo 
                  while(tokens.hasMoreTokens())
                  {//en este ciclo manipula palbra x palabra de la cadena
                     a=tokens.nextToken();
                  //se agregan las palabras extraidas a una cadena
                  //inicia  automata
                     //System.out.println(a) ;
                     switch(edo)
                     {
                        case 1:
                        //se hace una  expresion regular para el tipo de palabra reservada
                           Pattern pat1 = Pattern.compile("(Cad)");
                           Matcher palres = pat1.matcher(a);
                        //Validamos que el identificador cumpla con el siguiente patron
                           Pattern pat31 = Pattern.compile("[^0-9]+([a-z]|[A-Z]|[0-9])*");
                           Matcher nombvar1 = pat31.matcher(a);
                        
                           if (palres.matches()) 
                           {
                              tipo=a;
                           
                              
                              edo=2; 
                           }
                           
                           else
                           {
                           
                              System.out.println("Error !!");
                           
                              edo=1;
                           }
                           break;
                        case 2:
                        //valida q el id no sea un tipo de dato
                           Pattern pat22 = Pattern.compile("(Cad|Ent|Bol|Car);*");
                           Matcher palres2 = pat22.matcher(a);
                        //Validamos que el identificador cumpla con el siguiente patron
                           Pattern pat3 = Pattern.compile("[^0-9]+([a-z]|[A-Z]|[0-9])*");
                           Matcher nombvar = pat3.matcher(a);
                        
                                                
                           if (palres2.matches()) 
                           {//si es  un tipo de  dato mandamos a un error obviamente haciendo refrencia que no se puede tener
                           //declarado un tipo de variable como identificador
                           
                              System.out.println("Error no puedes tener un tipo de variable como identificado !!");
                              System.out.println("Error en linea: "+cont);
                           
                              edo = 101;
                              break;
                           } 
                           //valida id con la E.R que tenemos
                           //aqi entra el nombre de la variable
                           else
                           {
                              if (nombvar.matches()) 
                              {
                                 if(null==li.busqueda(a))
                                 {
                                 //si cumple con el patron asignamos  "a" ala variable "Variablenom"
                                    nombre=a;
                                    edo=3;
                                 }
                                 else 
                                 {
                                    edo=101;
                                 }
                              }
                           
                           
                           }
                           break;
                        case 3:
                        //Validamos que el identificador cumpla con el siguiente patron
                        /*Pattern pat313 = Pattern.compile("[^0-9]+([a-z]|[A-Z]|[0-9])*");
                        Matcher nombvar3= pat313.matcher(a);*/
                                             
                         
                           if(a.equals(";"))
                           {
                              y++;
                           //se convierteentero a String
                              Id="ID"+Integer.toString(y);
                           //agregamos las variables ala lista
                              va= new Variables(nombre,tipo,"",Id);
                              li.altas(va);
                              edo=1;
                           
                           }
                           else if (a.equals("="))
                           {
                              if (ban=true)
                              {
                                 valor=valor2;
                                 ban=false;
                                 edo=4;
                              }
                              else
                              {
                                 edo=1;
                              }
                           }
                           else if(a.equals(","))
                           {
                              if (puntero==1)
                              {
                                 tipo="Cad";
                                 edo=2;
                              }
                              else if (puntero==2)
                              {
                                 tipo="Ent";
                                 edo=2;
                              }
                              else if (puntero==3)
                              {
                                 tipo="Bol";
                                 edo=2;
                              }
                              else if (puntero==4)
                              {
                                 tipo="Car";
                                 edo=2;
                              }
                           
                           
                           }
                        /*else if(nombvar3.matches()) 
                        {
                           if (puntero==1)
                           {
                              tipo="Cad";
                              edo=2;
                           }
                           else if (puntero==2)
                           {
                              tipo="Ent";
                              edo=2;
                           }
                           else if (puntero==3)
                           {
                              tipo="Bol";
                              edo=2;
                           }
                           else if (puntero==4)
                           {
                              tipo="Car";
                              edo=2;
                           }
                           
                        }*/
                        
                        /*else
                        {
                        //Validamos que el identificador cumpla con el siguiente patron
                           Pattern pat313 = Pattern.compile("[^0-9]+([a-z]|[A-Z]|[0-9])*");
                           Matcher nombvar2 = pat313.matcher(a);
                        
                        
                           if (nombvar2.matches()) 
                           {
                              edo=2;
                           }
                        
                        }*/
                           break;
                        case 4:
                           if( a.equals(";"))
                           {y++;
                           //se convierteentero a String
                              Id="ID"+Integer.toString(y);
                              va= new Variables(nombre,tipo,valor,Id);
                              li.altas(va);
                              edo=1;
                           }
                           break;
                        case 101:
                           System.out.println("Error en linea Variable existente");
                           System.out.println("Error en linea: "+cont);
                           edo=1;
                           break;
                     }
                  }
               }
               else if (cadeas.matches())
               {
                  b=cad2.replace(";"," ;");
               //reemplazamos ";por"espacio ;"
                  c=b.replace("="," = ");
                  String d=c.replaceFirst("'{2}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{2}","");
               //xxx=c.replaceFirst("'{2}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{2}","");
               //System.out.println(xxx);
                //se inicializo a
                  StringTokenizer tokens=new StringTokenizer(d);
               //se crea un  objeto de la clase StringTokenizer y se agrega b  que es  la cadena del archivo 
                  while(tokens.hasMoreTokens())
                  {//en este ciclo manipula palbra x palabra de la cadena
                     a=tokens.nextToken();
                  //se agregan las palabras extraidas a una cadena
                  //inicia  automata
                     //System.out.println(a) ;
                     switch(edo)
                     {
                        case 1:
                        //Validamos que el identificador cumpla con el siguiente patron
                           Pattern pat31 = Pattern.compile("[^0-9]+([a-z]|[A-Z]|[0-9])*");
                           Matcher nombvar1 = pat31.matcher(a);
                           if (nombvar1.matches())
                           //en esta parte se usara pala asignacion ejemplo a=1;
                           //siempre  y caudnoeste declarada la variable
                           {
                              if(null==li.busqueda(a))
                              {
                              //si no esta la variable declarada mandamos al caso 101                              
                                 edo=100;
                              }
                              else 
                              {
                              // siesta declarada asignamos lo que existe en "a" ala variable "nombre"
                                 nombre=a;
                              //li.imptipo(nombre);
                              /*despues invocamos al metodo "consultaindividual"  pero ahi algo interesante que le
                              mandamos como param  entero "op1" esta  variable tipo entera contiene un uno
                              lo cual este uno es significatipo ya que gracias a el nos retornara el tipo de variable que es*/
                                 ayuda1=li.consultaIndividual(nombre,op1);
                              //se asigno el tipo de variable "en ayuda"
                                 ayuda2=li.consultaIndividual(nombre,op2);
                              //se asigno el valor asignado en la variable en ayuda2
                                 //System.out.println(ayuda1);
                                 edo=2;
                              //edo=22 el estado donde existe un "="
                              }
                           }
                           
                           else
                           {
                           
                              System.out.println("Error !!");
                              System.out.println("Error en linea: "+cont);
                              edo=1;
                           }
                        
                           break;
                        case 2:
                           if(a.equals("="))
                           {
                              aux=c.replaceFirst("([^0-9]+([a-z]|[A-Z]|[0-9])*=)","");
                              aux2=aux.replace(" ;","");
                              //System.out.println(aux2);
                           
                              valor=aux2;
                              //System.out.println(valor);
                              edo=3;
                           }
                           else
                           {
                              edo=4;
                           }
                           break;
                        case 3:
                           if(a.equals(";"))
                           {
                              li.modificar(nombre,valor);
                              edo=1;
                           }
                           else 
                           {
                              edo=4;
                           }
                           break;
                        case 4:
                           System.out.println("Error !!");
                           System.out.println("Error en linea: "+cont);
                           edo=1;
                           break;
                     }
                  }
               }
               else if (caderror.matches())
               {System.out.println("Error Sintaxis incorrecta!!");edo=1;}
               else if (caderror2.matches())
               {System.out.println("Error Sintaxis incorrecta!!");edo=1;}
               else if (caderror3.matches())
               {System.out.println("Error Sintaxis incorrecta!!");edo=1;}
               else if (caderror4.matches())
               {System.out.println("Error Sintaxis incorrecta!!");edo=1;}
               else if (caderror5.matches())
               {System.out.println("Error Sintaxis incorrecta!!");edo=1;}
               else if (caderror6.matches())
               {System.out.println("Error Sintaxis incorrecta!!");edo=1;}
               else if (caderror7.matches())
               {System.out.println("Error Sintaxis incorrecta!!");edo=1;}
               else if (caderror8.matches())
               {System.out.println("Error Sintaxis incorrecta!!");edo=1;}
               else if (caderror9.matches())
               {System.out.println("Error Sintaxis incorrecta!!");edo=1;}
               else if (leg.matches())
               {
                  if (lee.matches())
                  //aqui sera el automoata de la lectura
                  {
                     b=cad2.replace(";"," ;");
                  //reemplazamos ";por"espacio ;"
                     String d=b.replace("("," ( ");
                  //reemplazamos "(por"espacio ("
                     String e=d.replace(")"," ) ");
                     StringTokenizer toko=new StringTokenizer(e);
                  //se crea un  objeto de la clase StringTokenizer y se agrega b  que es  la cadena del archivo 
                     while(toko.hasMoreTokens())
                     {//en este ciclo manipula palbra x palabra de la cadena
                        a=toko.nextToken();
                     //se agregan las  palabras que sean parte de este automata
                     //inicia  automata
                        //System.out.println(a) ;
                        switch(edo)
                        {
                           case 1:
                              if(a.equals("lee"))
                              {
                                 edo=2;
                              }
                              else if(a.equals(")"))
                              {
                                 edo=1;
                              }
                              else if(a.equals(";"))
                              {
                                 edo=1;
                              }
                              else 
                              {
                                 System.out.println("Error!") ;
                                 
                                 edo=1;
                              }
                           
                              break;
                           case 2:
                              if(a.equals("("))
                              {
                                 edo=3;
                              }
                              else 
                              {
                                 System.out.println("Error!") ;
                                 System.out.println("Error en linea: "+cont);
                                 edo=1;
                              }
                              break;
                           case 3:
                           //aqui es donde se hara la lectura de datos
                           //Validamos que el identificador cumpla con el siguiente patron
                              Pattern pat3 = Pattern.compile("[^0-9]+([a-z]|[A-Z]|[0-9])*");
                              Matcher nombvarias = pat3.matcher(a);
                              if (nombvarias.matches()) 
                              {
                                 if(null==li.busqueda(a))
                                 {
                                 //si cumple con el patron asignamos  "a" ala variable "Variablenom"
                                    System.out.println("Error No se encuentra declarada la variable ala cual quiere hacer lectura de datos!!!") ;
                                    System.out.println("Error en linea: "+cont);                                      
                                    edo=1;                    
                                 }
                                 else 
                                 {
                                    nombre=a;
                                 //aqui es donde se hara la lectura de datos
                                    ayuda1=li.consultaIndividual(nombre,op1);
                                 //se asigno el tipo de variable "en ayuda"
                                    lectura=ent.readLine();
                                 //hacemos la lectura de datos deespues validaremos el tipo de identificadoral cual deseamos
                                 //agregar dicho valor, pero  obviamente siguiendo las expreciones regulares
                                    if(ayuda1.equals("Cad"))
                                    {
                                       Pattern leecas = Pattern.compile("('{2}[A-Za-z0-9|[!#$%&/=?▼/:;*-+{}_.,<>院^~柵*.(\\s)]*([!#$%&/=?▼/:;*-+{}_.,<>院^~柵*(\\s))*[A-Za-z0-9.|[!#$%&/=?▼/:;*-+{}_.,<>院^~柵*(\\s)]+'{2})");
                                    //patron para las cadenas
                                       Matcher leca =leecas.matcher(lectura);
                                       if (leca.matches()) 
                                       {
                                          valor=lectura;
                                          edo=4;
                                       }
                                       else 
                                       {
                                          System.out.println("Error!!! No se puede agregar el valor a una  variable tipo cadena"+"\n"+" debido aque  no es  una cadena!!!") ;
                                          System.out.println("Error en linea: "+cont);
                                          edo=1;
                                       }
                                    }
                                    else if(ayuda1.equals("Ent"))
                                    {
                                       Pattern led= Pattern.compile("[0-9]*");
                                    //patron para que sean puros dijitos
                                       Matcher lediji= led.matcher(lectura);
                                       if (lediji.matches()) 
                                       {
                                          valor=lectura;
                                          edo=4;
                                       }
                                       else 
                                       {
                                          System.out.println("Error!!! No se puede agregar el valor en un a variable tipo entera"+"\n"+" debido aque  no son numeros!!!") ;
                                          System.out.println("Error en linea: "+cont);
                                          edo=1;
                                       }
                                    
                                    }
                                    else if(ayuda1.equals("Bol"))
                                    {
                                       Pattern leb = Pattern.compile("(V|F|v|f|1|0)");
                                    //patron para que sean booleanos
                                       Matcher boole =leb.matcher(lectura);
                                       if ( boole.matches()) 
                                       {
                                          valor=lectura;
                                          edo=4;
                                       }
                                       else 
                                       {
                                          System.out.println("Error!!! No se puede agregar el valor en un a variable tipo Entera"+"\n"+" debido aque  no son Valores Booleanos!!!") ;
                                          System.out.println("Error en linea: "+cont);
                                          edo=1;
                                       }
                                    
                                    }
                                    else if(ayuda1.equals("Car"))
                                    {
                                       Pattern lecarcl = Pattern.compile("'{1}[A-Za-z0-9.!#$%&/=?▼/*-+]{1,2}'{1}");
                                    //patron para que sean puros caracteres
                                       Matcher carcl =lecarcl.matcher(lectura);
                                       if ( carcl.matches()) 
                                       {
                                          valor=lectura;
                                          edo=4;
                                       }
                                       else 
                                       {
                                          System.out.println("Error!!! No se puede agregar el valor en un a variable tipo Caracter"+"\n"+" debido aque  no son Caracateres!!!") ;
                                          System.out.println("Error en linea: "+cont);
                                          edo=1;
                                       }
                                    }
                                 }
                              }
                              else
                              {System.out.println("Error!") ;
                                 System.out.println("Error en linea: "+cont);
                                 edo=1;
                              }
                           
                           
                              break;
                           case 4:
                              if(a.equals(")"))
                              {
                                 edo=5;
                              }
                              else 
                              {
                                 System.out.println("Error!!!") ;
                                 System.out.println("Error en linea: "+cont);
                                 edo=1;
                              
                              }
                              break;
                           case 5:
                              if(a.equals(";"))
                              {
                                 li.modificar(nombre,valor);
                                 edo=1;
                              }
                              else 
                              {
                                 System.out.println("Error!!!") ;
                                 System.out.println("Error en linea: "+cont);
                                 edo=1;
                              
                              }
                           
                              break;
                           
                        }
                     }
                  
                  }
                   
                  else
                  {
                  
                     System.out.println("Error en La  Sintaxis!!") ;
                     System.out.println("Error en linea: "+cont);
                     edo=1;
                  }
               }
               else if (imp.matches())
               //aqi se  hara el automata de la impresion
               {
                  a="";
                  b=cad2.replace(";"," ;");
                  String d=b.replace("("," ( ");
               //reemplazamos "(por"espacio ("
                  String e=d.replace(")"," ) ");
               //reemplazamos ")por"espacio )"
                  String f=e.replace("+"," + ");
                  String g=f.replace("pritin"," pritin ");
                  //reemplazamos las cadenas  por "1"
                  cambio=g.replaceAll("'{2}[A-Za-z0-9|[!#$%&/=?▼/:;*-+{}_.,<>院^~柵*.(\\s)]*([!#$%&/=?▼/:;*-+{}_.,<>院^~柵*(\\s))*[A-Za-z0-9.|[!#$%&/=?▼/:;*-+{}_.,<>院^~柵*(\\s)]+'{2}","1");
                  /*cambio2=cambio1.replaceFirst("'{2}[A-Za-z0-9|[!#$%&/=?▼/:;*-+{}_.,<>院^~柵*.(\\s)]*([!#$%&/=?▼/:;*-+{}_.,<>院^~柵*(\\s))*[A-Za-z0-9.|[!#$%&/=?▼/:;*-+{}_.,<>院^~柵*(\\s)]+'{2}","1");
                  cambio3=cambio2.replaceFirst("'{2}[A-Za-z0-9|[!#$%&/=?▼/:;*-+{}_.,<>院^~柵*.(\\s)]*([!#$%&/=?▼/:;*-+{}_.,<>院^~柵*(\\s))*[A-Za-z0-9.|[!#$%&/=?▼/:;*-+{}_.,<>院^~柵*(\\s)]+'{2}","1");
                  cambio4=cambio3.replaceFirst("'{2}[A-Za-z0-9|[!#$%&/=?▼/:;*-+{}_.,<>院^~柵*.(\\s)]*([!#$%&/=?▼/:;*-+{}_.,<>院^~柵*(\\s))*[A-Za-z0-9.|[!#$%&/=?▼/:;*-+{}_.,<>院^~柵*(\\s)]+'{2}","1");*/
                  StringTokenizer obj=new StringTokenizer(cambio);
               //se crea un  objeto de la clase StringTokenizer y se agrega b  que es  la cadena del archivo 
                  while(obj.hasMoreTokens())
                  {//en este ciclo manipula palbra x palabra de la cadena
                     a=obj.nextToken();
                  //se agregan las palabras extraidas a una cadena
                  //inicia  automata
                     //System.out.println(a) ;
                     switch(edo)
                     {
                        case 1:
                           if(a.equals("pritin"))
                           {
                              edo=2;
                           }
                           else if(ban3==true)
                           {
                              ban3=false;
                              edo=1;
                              break;
                           }
                           else 
                           {
                              ban=true;
                              edo=8;
                           }
                           break;
                        case 2:
                           if(a.equals("("))
                           {
                              edo=3;
                           }
                           else 
                           {
                              ban=true;
                              edo=8;
                           }
                           break;
                        case 3:
                           Pattern pat3 = Pattern.compile("[^0-9]+([a-z]|[A-Z]|[0-9])*");
                           Matcher variable = pat3.matcher(a); 
                           Pattern pcad123=Pattern.compile("'{2}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{2}");
                           Matcher cadd=pcad123.matcher(a);
                           if (variable.matches()) 
                           {
                              if(null==li.busqueda(a))
                              {
                              //si no esta la variable declarada mandamos al caso 101                              
                                 edo=9;
                              }
                              else 
                              {
                              // siesta declarada asignamos lo que existe en "a" ala variable "nombre"
                                 nombre=a;
                              //li.imptipo(nombre);
                              /*despues invocamos al metodo "consultaindividual"  pero ahi algo interesante que le
                              mandamos como param  entero "op1" esta  variable tipo entera contiene un uno
                              lo cual este uno es significatipo ya que gracias a el nos retornara el tipo de variable que es*/
                                 if( ban2==true)
                                 {
                                    ayud3=li.consultaIndividual(nombre,op2);
                                    edo=4;
                                 }
                                 else
                                 {ayud=li.consultaIndividual(nombre,op2);
                                 //se asigno el valor asignado en la variable en ayuda2
                                    //System.out.println(ayuda1);
                                    edo=4;
                                 }
                              }
                           }
                           else  if (a.equals("1")) 
                           {
                              if(ban==true)
                              {
                              //aqui se hara la modificicacion de  las cadenas
                                
                                 c1=xxx.replaceAll("[+]('{2}[A-Za-z0-9|[!#$%&/=?▼/:;*-+{}_.,<>院^~柵*.(\\s)]*([!#$%&/=?▼/:;*-+{}_.,<>院^~柵*(\\s))*[A-Za-z0-9.|[!#$%&/=?▼/:;*-+{}_.,<>院^~柵*(\\s)]+'{2})","");
                                 captura3=a;
                                 edo=4;}
                              else
                              {
                                 c1=cad2.replaceAll("[+]('{2}[A-Za-z0-9|[!#$%&/=?▼/:;*-+{}_.,<>院^~柵*.(\\s)]*([!#$%&/=?▼/:;*-+{}_.,<>院^~柵*(\\s))*[A-Za-z0-9.|[!#$%&/=?▼/:;*-+{}_.,<>院^~柵*(\\s)]+'{2})","");
                                 captura=c1.replaceAll("([+][^0-9]+([a-z]|[A-Z]|[0-9])*)","");
                                 edo=4;
                              }
                           }
                           else 
                           {
                              ban=true;
                              edo=8;
                           }
                           break;
                        case 4:
                           if(a.equals("+"))
                           { edo=5;}
                           else if(a.equals(")")){
                              ban=false;ban2=false;
                              edo=7;//enviamos a edo de aceptacion
                           }
                           else 
                           {
                              ban=true;
                              edo=8;
                           }
                           break;
                        case 5:
                           Pattern pat3456 = Pattern.compile("[^0-9]+([a-z]|[A-Z]|[0-9])*");
                           Matcher variables = pat3456.matcher(a); 
                           Pattern pcad321=Pattern.compile("'{2}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{2}");
                           Matcher cadle=pcad321.matcher(a);
                           if (variables.matches()) 
                           {
                              if(null==li.busqueda(a))
                              {
                              //si no esta la variable declarada mandamos al caso 101                              
                                 edo=9;
                              }
                              else 
                              {
                              // siesta declarada asignamos lo que existe en "a" ala variable "nombre"
                                 nombre=a;
                              //li.imptipo(nombre);
                              /*despues invocamos al metodo "consultaindividual"  pero ahi algo interesante que le
                              mandamos como param  entero "op1" esta  variable tipo entera contiene un uno
                              lo cual este uno es significatipo ya que gracias a el nos retornara el tipo de variable que es*/
                                 if(ban2==true)
                                 {
                                    ayud4=li.consultaIndividual(nombre,op2);
                                 //se asigno el valor asignado en la variable en ayuda2
                                    //System.out.println(ayuda4);
                                    edo=6;
                                 }
                                 else
                                 {
                                    ayud2=li.consultaIndividual(nombre,op2);
                                 //se asigno el valor asignado en la variable en ayuda2
                                    //System.out.println(ayuda2);
                                    edo=6;
                                 }
                              }
                           }
                           else  if (a.equals("1")) 
                           {
                              if(ban==true)
                              {
                                 captura4=a;
                                 edo=6;
                              
                              }
                              else
                              {
                              //aqi se hara  lode agregar la cadena obviamente usando el metodo replace
                                 captura2=a;
                                 edo=6;
                              }
                           }
                           else 
                           {
                              ban=true;
                              edo=8;
                           }
                           break;
                        case 6:
                           if(a.equals(")"))
                           {
                           //mandamos a estado de aceptacion
                              edo=7;
                           }
                           else if(a.equals("+"))
                           {
                           //regresamos aun punto fijo el automta
                              edo=3;
                              ban2=true;
                           
                           }
                           else 
                           {
                              ban=true;
                              edo=8;
                           }
                        
                           break;
                        case 7:
                           //edo de aceptacion
                           if(a.equals(";"))
                           {
                           //aqi se  visualizara la impresion
                              imprim=""+ayud+""+captura+""+ayud2+""+captura2+""+ayud3+""+captura3+""+ayud4+""+captura4;
                              System.out.println(imprim);
                              edo=1;
                           }
                           break;
                           //edos de error
                        case 8:
                           System.out.println("Error en Sintaxis!!!");
                           System.out.println("Error en linea: "+cont);
                           ban3=true;
                           edo=1;
                        
                           break;
                        case 9:
                           System.out.println("error variable no esta declarada!!!");
                           System.out.println("Error en linea: "+cont);
                           ban3=true;
                           edo=1;
                           break;
                     }
                  
                  }
               }
                  
               else
               {
                  b=cad2.replace(";"," ;");
               //reemplazamos ";por"espacio ;"
                  c=b.replace("="," = ");
                
                  String d=c.replaceFirst("'{2}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{2}","");
               //xxx=c.replaceFirst("'{2}[A-Za-z0-9.(\\s)]*([!#$%&/=?▼/*-+]*(\\s))*[A-Za-z0-9.(\\s)]+'{2}","");
               //System.out.println(xxx);
                //se inicializo a
                  StringTokenizer tokenaso=new StringTokenizer(d);
               //se crea un  objeto de la clase StringTokenizer y se agrega b  que es  la cadena del archivo 
                  while(tokenaso.hasMoreTokens())
                  {//en este ciclo manipula palbra x palabra de la cadena
                     a=tokenaso.nextToken();
                  //se agregan las palabras extraidas a una cadena
                  //inicia  automata
                     //System.out.println(a) ;
                     switch(edo)
                     {
                        case 1:
                        //se hace una  expresion regular para el tipo de palabra reservada
                           Pattern pat1 = Pattern.compile("(Cad|Ent|Bol|Car)");
                           Matcher palres = pat1.matcher(a);
                        //Validamos que el identificador cumpla con el siguiente patron
                           Pattern pat31 = Pattern.compile("[^0-9]+([a-z]|[A-Z]|[0-9])*");
                           Matcher nombvar1 = pat31.matcher(a);
                        
                           if (palres.matches()) 
                           {
                              tipo=a;
                              //despues se  agregaran punteros dependiendo del tipo de variable que sea
                              //el puntero nos ayudara para la asiganacion declarada ejemplo
                              // Ent variable=2323546;
                              if(a.equals("Cad"))
                              {
                                 puntero=1;
                              }
                              else if(a.equals("Ent"))
                              {
                                 puntero=2;
                              }
                              else if(a.equals("Bol"))
                              {
                                 puntero=3;
                              }
                              else if(a.equals("Car"))
                              {
                                 puntero=4;
                              }
                              
                              edo=2; 
                           }
                           else if (nombvar1.matches())
                           //en esta parte se usara pala asignacion ejemplo a=1;
                           //siempre  y caudnoeste declarada la variable
                           {
                              if(null==li.busqueda(a))
                              {
                              //si no esta la variable declarada mandamos al caso 101                              
                                 edo=100;
                              }
                              else 
                              {
                              // siesta declarada asignamos lo que existe en "a" ala variable "nombre"
                                 nombre=a;
                              //li.imptipo(nombre);
                              /*despues invocamos al metodo "consultaindividual"  pero ahi algo interesante que le
                              mandamos como param  entero "op1" esta  variable tipo entera contiene un uno
                              lo cual este uno es significatipo ya que gracias a el nos retornara el tipo de variable que es*/
                                 ayuda1=li.consultaIndividual(nombre,op1);
                              //se asigno el tipo de variable "en ayuda"
                                 ayuda2=li.consultaIndividual(nombre,op2);
                              //se asigno el valor asignado en la variable en ayuda2
                                 //System.out.println(ayuda1);
                                 edo=5;
                              //edo=22 el estado donde existe un "="
                              }
                           }
                           
                           else
                           {
                           
                              System.out.println("Error !!");
                           
                              edo=1;
                           }
                           break;
                        case 2:
                        //valida q el id no sea un tipo de dato
                           Pattern pat22 = Pattern.compile("(Cad|Ent|Bol|Car);*");
                           Matcher palres2 = pat22.matcher(a);
                        //Validamos que el identificador cumpla con el siguiente patron
                           Pattern pat3 = Pattern.compile("[^0-9]+([a-z]|[A-Z]|[0-9])*");
                           Matcher nombvar = pat3.matcher(a);
                        
                                                
                           if (palres2.matches()) 
                           {//si es  un tipo de  dato mandamos a un error obviamente haciendo refrencia que no se puede tener
                           //declarado un tipo de variable como identificador
                           
                              System.out.println("Error no puedes tener un tipo de variable como identificado !!");
                              edo = 101;
                              break;
                           } 
                           //valida id con la E.R que tenemos
                           //aqi entra el nombre de la variable
                           else
                           {
                              if (nombvar.matches()) 
                              {
                                 if(null==li.busqueda(a))
                                 {
                                 //si cumple con el patron asignamos  "a" ala variable "Variablenom"
                                    nombre=a;
                                    edo=3;
                                 }
                                 else 
                                 {
                                    edo=101;
                                 }
                              }
                              else
                              {
                                 System.out.println("Error  Sintaxis Incorrecta!!!!");
                                 edo=1;
                              }
                           
                           }
                           break;
                        case 3:
                        //Validamos que el identificador cumpla con el siguiente patron
                        /*Pattern pat313 = Pattern.compile("[^0-9]+([a-z]|[A-Z]|[0-9])*");
                        Matcher nombvar3= pat313.matcher(a);*/
                                             
                         
                           if(a.equals(";"))
                           {y++;
                           //se convierteentero a String
                              Id="ID"+Integer.toString(y);
                           //agregamos las variables ala lista
                              va= new Variables(nombre,tipo,"",Id);
                              li.altas(va);
                              edo=1;
                           
                           }
                           else if (a.equals("="))
                           {
                              //valor=valor2;
                              edo=4;
                           }
                           else if(a.equals(","))
                           {
                              if (puntero==1)
                              {
                                 tipo="Cad";
                                 edo=2;
                              }
                              else if (puntero==2)
                              {
                                 tipo="Ent";
                                 edo=2;
                              }
                              else if (puntero==3)
                              {
                                 tipo="Bol";
                                 edo=2;
                              }
                              else if (puntero==4)
                              {
                                 tipo="Car";
                                 edo=2;
                              }
                           
                           
                           }
                           /*else if(nombvar3.matches()) 
                           {
                           if (puntero==1)
                           {
                              tipo="Cad";
                              edo=2;
                           }
                           else if (puntero==2)
                           {
                              tipo="Ent";
                              edo=2;
                           }
                           else if (puntero==3)
                           {
                              tipo="Bol";
                              edo=2;
                           }
                           else if (puntero==4)
                           {
                              tipo="Car";
                              edo=2;
                           }
                           
                           }*/
                           
                           /*else
                           {
                           //Validamos que el identificador cumpla con el siguiente patron
                           Pattern pat313 = Pattern.compile("[^0-9]+([a-z]|[A-Z]|[0-9])*");
                           Matcher nombvar2 = pat313.matcher(a);
                           
                           
                           if (nombvar2.matches()) 
                           {
                              edo=2;
                           }
                           
                           }*/
                           else
                           {
                              System.out.println("Error  Sintaxis Incorrecta!!!!");
                              System.out.println("Error en linea: "+cont);
                              edo=1;
                           }
                           break;
                        case 4://caso donde se haran las asignaciones
                        //nota : Cad variable=''cadena'' ya  se programo  x lo tanto en este  caso no hara
                        //para evitar duplicados
                           Pattern patd= Pattern.compile("[0-9]*");
                        //patron para que sean puros dijitos
                           Matcher diji= patd.matcher(a);
                           Pattern pat_o1 = Pattern.compile("'{1}[A-Za-z0-9.!#$%&/=?▼/*-+]{1,2}'{1}");
                        //patron para que sean puros caracteres
                           Matcher carc1 =pat_o1.matcher(a);
                           Pattern pat_oo1 = Pattern.compile("(V|F|v|f|1|0)");
                        //patron para que sean booleanos
                           Matcher bool1 =pat_oo1.matcher(a);
                           Pattern pat_id1 = Pattern.compile("[^0-9]+([a-z]|[A-Z]|[0-9])*");
                        //patron para los identificadores
                           Matcher id1 =pat_id1.matcher(a);
                           if(puntero==1)
                           { 
                              if (id1.matches())
                              {//si es un identificador se busca primero que este declarado
                                 if(null==li.busqueda(a))
                                 {
                                    System.out.println("Error al hacer la asignacion con Variable Cadena!!");
                                 
                                    edo=102;
                                 }
                                 else 
                                 {
                                    ayuda3=li.consultaIndividual(a,op1);
                                    ayuda4=li.consultaIndividual(a,op2);
                                    if(ayuda3.equals("Cad"))
                                    {valor=ayuda4;
                                       edo=5;
                                    }
                                    else
                                    {
                                       System.out.println("Error al hacer la asignacion tipos de variables difrenntes!!!");
                                       edo=102;
                                    
                                    }
                                 }
                              }
                           
                           }
                           else if (puntero==2)
                           {
                              if (diji.matches()) 
                              {
                                 valor=a;
                              //mandamos a estado de aceptacion
                                 edo=5;
                              }
                              else if (id1.matches())
                              {//si es un identificador se busca primero que este declarado
                                 if(null==li.busqueda(a))
                                 {
                                    System.out.println("Error al hacer la asignacion con Variable Entero!!");
                                 
                                    edo=102;
                                 }
                                 else 
                                 {
                                    ayuda3=li.consultaIndividual(a,op1);
                                    ayuda4=li.consultaIndividual(a,op2);
                                    if(ayuda3.equals("Ent"))
                                    {valor=ayuda4;
                                       edo=5;
                                    }
                                    else
                                    {
                                       System.out.println("Error al hacer la asignacion tipos de variables difrenntes!!!");
                                       edo=102;
                                    
                                    }
                                 }
                              }
                              
                              else 
                              {
                                 System.out.println("Error al hacer la asignacion con Variable tipo Entero!!!");
                                 edo=1;
                              }
                           }
                           else if (puntero==3)
                           {
                              if (bool1.matches()) 
                              {
                                 valor=a;
                              //mandamos a estado de aceptacion
                                 edo=5;
                              }
                              else if (id1.matches())
                              {//si es un identificador se busca primero que este declarado
                                 if(null==li.busqueda(a))
                                 {
                                    System.out.println("Error al hacer la asignacion con Variable Booleana!!");
                                 
                                    edo=102;
                                 }
                                 else 
                                 {
                                    ayuda3=li.consultaIndividual(a,op1);
                                    ayuda4=li.consultaIndividual(a,op2);
                                    if(ayuda3.equals("Bol"))
                                    {valor=ayuda4;
                                       edo=5;
                                    }
                                    else
                                    {
                                       System.out.println("Error al hacer la asignacion tipos de variables difrenntes!!!");
                                       edo=102;
                                    
                                    }
                                 }
                              }
                              
                              else 
                              {
                                 System.out.println("Error al hacer la asignacion con Variable tipo Booleana!!!");
                                 edo=1;
                              }
                           }
                           else if(puntero==4)
                           {
                              if (carc1.matches()) 
                              {
                                 valor=a;
                              /*va= new Variables(nombre,tipo,valor);
                              li.altas(va);*/
                              //mandamos a estado de aceptacion
                                 edo=5;
                              }
                              else if (id1.matches())
                              {//si es un identificador se busca primero que este declarado
                                 if(null==li.busqueda(a))
                                 {
                                    System.out.println("Error al hacer la asignacion con Variable Caracter!!");
                                 
                                    edo=102;
                                 }
                                 else 
                                 {
                                    ayuda3=li.consultaIndividual(a,op1);
                                    ayuda4=li.consultaIndividual(a,op2);
                                    if(ayuda3.equals("Car"))
                                    {valor=ayuda4;
                                       edo=5;
                                    }
                                    else
                                    {
                                       System.out.println("Error al hacer la asignacion tipos de variables difrenntes!!!");
                                       edo=102;
                                    
                                    }
                                 }
                              }
                              
                              else 
                              {
                                 System.out.println("Error al hacer la asignacion con Variable tipo Caracter!!!");
                                 edo=1;
                              }
                           
                           }
                        
                           break;
                        case 5:
                           if( a.equals(";"))
                           {y++;
                           //se convierteentero a String
                              Id="ID"+Integer.toString(y);
                              va= new Variables(nombre,tipo,valor,Id);
                              li.altas(va);
                              edo=1;
                           }
                           else if(a.equals("="))
                           {
                              if(ayuda1.equals("Cad"))
                              {
                                 Pattern pat_id = Pattern.compile("[^0-9]+([a-z]|[A-Z]|[0-9])*");
                                 Matcher id =pat_id.matcher(c);
                               
                                 if (id.matches())
                                 { edo=6;}
                                 
                              }
                              
                              else if(ayuda1.equals("Ent")||ayuda1.equals("Bol")||ayuda1.equals("Car"))
                              {
                                 edo=6;
                              }  
                           }
                           else
                           {
                              edo=102;
                           }          
                           break;
                        case 6:
                           Pattern pat41= Pattern.compile("[0-9]*");
                           Matcher vary= pat41.matcher(a);
                           Pattern pat_o = Pattern.compile("'{1}[A-Za-z0-9.!#$%&/=?▼/*-+]{1,2}'{1}");
                           Matcher carc =pat_o.matcher(a);
                           Pattern pat_oo = Pattern.compile("(V|F|v|f|1|0)");
                           Matcher bool =pat_oo.matcher(a);
                           Pattern pat_id = Pattern.compile("[^0-9]+([a-z]|[A-Z]|[0-9])*");
                           Matcher id =pat_id.matcher(a);
                           if(ayuda1.equals("Cad"))
                           {
                              if (id.matches())
                              { 
                                 //si es un identificador se busca primero que este declarado
                                 if(null==li.busqueda(a))
                                 {
                                    System.out.println("Error al hacer la asignacion la  Variable no esta declarada !!!");
                                    
                                    edo=102;
                                 }
                                 else 
                                 {
                                    ayuda3=li.consultaIndividual(a,op1);
                                    //invocamos al tipo de variable y lo agregamos en "ayuda3"
                                    //System.out.println(ayuda3);
                                    
                                    ayuda4=li.consultaIndividual(a,op2);
                                    //System.out.println(ayuda4);
                                    //invocamos el valor de la variable  y lo asignamos en "ayuda4"
                                    //comparamos si los tipos de  variables son iguales
                                    if(ayuda1.equals(ayuda3))
                                    {valor=ayuda4;
                                       edo=7;
                                    }
                                    else 
                                    {
                                       System.out.println("Error tipo de identificadores diferentes no sepuede hacer la asignacion !!!");
                                       
                                       edo=102;
                                    }
                                    
                                 }
                              }
                                  
                              else
                              {
                                 System.out.println("Error al hacer la asignacon con  variable de tipo cadena");
                                 
                                 edo=102;
                              }
                              
                           }
                                      
                           
                           if(ayuda1.equals("Ent"))
                           {//patron que lo q se asigna es un entero
                              if (vary.matches()) 
                              {
                                 valor=a;
                              /*va= new Variables("","",valor);
                              li.altas(va);*/
                              // al estado que se envia es el estado final de aceptacion
                                 edo=7;
                              }
                              else if (id.matches())
                              {
                              //si es un identificador se busca primero que este declarado
                                 if(null==li.busqueda(a))
                                 {
                                    System.out.println("Error al hacer la asignacion la  Variable no esta declarada !!!");
                                 
                                    edo=102;
                                 }
                                 else 
                                 {
                                    ayuda3=li.consultaIndividual(a,op1);
                                 //invocamos al tipo de variable y lo agregamos en "ayuda3"
                                    //System.out.println(ayuda3);
                                 
                                    ayuda4=li.consultaIndividual(a,op2);
                                    //System.out.println(ayuda4);
                                 //invocamos el valor de la variable  y lo asignamos en "ayuda4"
                                 //comparamos si los tipos de  variables son iguales
                                    if(ayuda1.equals(ayuda3))
                                    {valor=ayuda4;
                                       edo=7;
                                    }
                                    else 
                                    {
                                       System.out.println("Error tipo de identificadores diferentes no sepuede hacer la asignacion !!!");
                                    
                                       edo=102;
                                    }
                                 
                                 }
                              }
                              else
                              {//delo contrario marca un error
                                 System.out.println("Error al hacer la asignacion con Variable tipo Entero!!!");
                                 edo=102;
                              }
                           }
                           // antes entrar al patron de los booleanos se  valida el tipo de dato
                           else if (ayuda1.equals("Bol"))
                           {//patron que lo q se asigna es un booleano
                              if (bool.matches()) 
                              {
                                 valor=a;
                              /*va= new Variables("","",valor);
                              li.altas(va);*/
                              // al estado que se envia es el estado final de aceptacion
                                 edo=7;
                                 
                              }
                              else if (id.matches())
                              {
                              //si es un identificador se busca primero que este declarado
                                 if(null==li.busqueda(a))
                                 {
                                    System.out.println("Error al hacer la asignacion la  Variable no esta declarada !!!");
                                 
                                    edo=102;
                                 }
                                 else 
                                 {
                                    ayuda3=li.consultaIndividual(a,op1);
                                 //invocamos al tipo de variable y lo agregamos en "ayuda3"
                                    //System.out.println(ayuda3);
                                 
                                    ayuda4=li.consultaIndividual(a,op2);
                                    //System.out.println(ayuda4);
                                 //invocamos el valor de la variable  y lo asignamos en "ayuda4"
                                 //comparamos si los tipos de  variables son iguales
                                    if(ayuda1.equals(ayuda3))
                                    {valor=ayuda4;
                                       edo=7;
                                    }
                                    else 
                                    {
                                       System.out.println("Error tipo de identificadores diferentes no sepuede hacer la asignacion !!!");
                                    
                                       edo=102;
                                    }
                                 
                                 }
                              }
                              
                              else
                              {//delo contrario marca un error
                                 System.out.println("Error al hacer la asignacion con Variable tipo Booleana!!!");
                                 edo=102;
                              }
                           }
                           // antes entrar al patron de los caracteres se  valida el tipo de dato
                           else if (ayuda1.equals("Car"))
                           {//patron que lo q se asigna es un caracter
                              if (carc.matches()) 
                              {
                                 valor=a;
                              /*va= new Variables("","",valor);
                              li.altas(va);*/
                              // al estado que se envia es el estado final de aceptacion
                                 edo=7;
                              }
                              else if (id.matches())
                              {
                              //si es un identificador se busca primero que este declarado
                                 if(null==li.busqueda(a))
                                 {
                                    System.out.println("Error al hacer la asignacion la  Variable no esta declarada !!!");
                                 
                                    edo=102;
                                 }
                                 else 
                                 {
                                    ayuda3=li.consultaIndividual(a,op1);
                                 //invocamos al tipo de variable y lo agregamos en "ayuda3"
                                    //System.out.println(ayuda3);
                                 
                                    ayuda4=li.consultaIndividual(a,op2);
                                    //System.out.println(ayuda4);
                                 //invocamos el valor de la variable  y lo asignamos en "ayuda4"
                                 //comparamos si los tipos de  variables son iguales
                                    if(ayuda1.equals(ayuda3))
                                    {valor=ayuda4;
                                       edo=7;
                                    }
                                    else 
                                    {
                                       System.out.println("Error tipo de identificadores diferentes no sepuede hacer la asignacion !!!");
                                    
                                       edo=102;
                                    }
                                 
                                 }
                              }
                              
                              else
                              {//delo contrario marca un error
                                 System.out.println("Error al hacer la asignacion con Variable tipo Caracter!!!");
                                 edo=102;
                              }
                           }
                        
                           break;
                        case 7:
                           if(a.equals(";"))
                           {
                              li.modificar(nombre,valor);
                              edo=1;
                           }
                           else 
                           { edo=102;
                           }
                           break;
                        case 100:
                           System.out.println("Error en linea no Existe la Variable sobre la  cual quiere  agregar el valor");
                           System.out.println("Error en linea: "+cont);
                           edo=1;
                           break;
                        case 101:
                           System.out.println("Error Variable existente");
                           System.out.println("Error en linea: "+cont);
                           edo=1;
                           break;
                        case 102:
                           System.out.println("Error !!!!");
                           System.out.println("Error en linea: "+cont);
                           edo=1;
                           break;
                     }
                  }
               
               }
            }
            escribir.close();
         
         }
         li.consultaGeneral();
      }
      catch(Exception ex)
      {
         System.out.println("Error al leer");
      
      }
   }
}
