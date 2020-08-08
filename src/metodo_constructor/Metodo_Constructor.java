
package metodo_constructor;

import java.util.Scanner;

public class Metodo_Constructor {
/*El metodo constructor es un metodo que toda clase tiene, el metodo constructor es un metodo especial que se invoca cada vez que se crea un objeto de esa clase,
ej: Auto n=new Auto();, new Auto() es el contructor de la clase a la que se invoca para crear el objeto "n", de esta forma esa el la funcion principal del
metodo constructor poder crear el objeto y de esta forma inicializar los atributos y metodos de esa clase. Ademas podremos si queremos pasarle parametros a
ese objeto a traves del metodo constructor.
Un constructor que no tiene parámetros se llama constructor por defecto. Un
constructor por defecto normalmente inicializa los miembros datos asignándoles
valores por defecto. 

*/ 
    public static void main(String[] args) 
       {
        Auto n=new Auto("Fiat",1232); //En este caso creamos un objeto de la clase Auto y le pasamos los atributos correspondientes
        n.mostar();
        Auto n1=new Auto();//Creamos un objeto del constructor por defecto, al no pasarle parametros inicializaria las v. de clases a 0 o null, en este caso como antes tenemos un constructor que si asigna parametros no lo podriamos apreciar, por ende la vemos solamente con la variable prueba
        
        //Ademas al crear estos 2 constructores lo que estamos haciendo es sobrecargar el metodo constructor, ya que a uno le pasamos parametros y al del mismo nombre no le pasamos nada, o le podriamos pasar otros parametros
        
        
 //Sobrecarga de Metodos la sobrecarga de metodos consiste en definir 2 metodos con el mismo nombre en una misma clase, estos compartiran el mismo nombe pero tendran diferentes parametros
 /*La sobrecarga es uno de los procedimientos mediante el cual Java implementa el polimorfismo.En las llamadas a los métodos sobrecargados, el compilador determina cuál es el
  método invocado basándose en el número o tipo de argumentos pasados   */   
 //Ejemplo
   Scanner sc=new Scanner(System.in);
           System.out.println("Ingrese su nombre");
           String o=sc.nextLine();
           System.out.println("Ingrese el mes cuando vuelve");
           String a=sc.nextLine();
         
          
           
           n.saludo(o);
           n.saludo(o, a);
       }
    
    
}
