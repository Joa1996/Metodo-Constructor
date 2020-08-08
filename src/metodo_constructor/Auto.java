
package metodo_constructor;
import java.time.*;
//El metodo constructor tiene el mismo nombre de la clase, no devuelve ningun valor y siempre debe declararse como publico.
public class Auto 
{
   String Marca;
   int dominio;
   int prueba;//En este caso la variable prueba no la colocamos en el primer constructor por ende se inicializara con el 2° constructor y a 0, ya que es un constructor por defecto

    //EL contrusctor de la clase Auto
    public Auto(String Marca,int dominio)//El contructor puede esta vacio, es decir no tener parametros, de esta forma se va a usar solamente para crear el objeto
    {
        this.Marca=Marca;// this se usa para poder poner el mismo nombre en los parametros y en los atributos,this le permite a Java poder saber diferenciar entre los atributos de la clase y los parametros que recibe por el constructor
        this.dominio=dominio;   
    }
    public Auto()//Creamos el constructor por defecto
    {
       
    }
    
    void mostar()//Creamos un metodo para poder imprimir 
    {
        System.out.println(this.Marca+"\n"+this.dominio);
        System.out.println(this.prueba);
    }
    void saludo(String nom)
    {
        System.out.println("Hola"+nom+",Bienvenido");  
        
    }
    void  saludo(String nom,String mes)//Metodo sobrecargado
    {
        System.out.println("Adios"+nom+",Hasta el mes de "+mes);
       
    }
   
}
