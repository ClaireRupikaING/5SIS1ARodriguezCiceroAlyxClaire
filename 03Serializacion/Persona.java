import java.io.*;

/*La serialización es el proceso mediante el cual el programa puede traducir a un archivo los objetos que se le marquen para su almacenamiento
 * la serialización puede ocurrir ya sea por objetos principalmente en el buffer mediante el cual se envia o se extrae la información
 */

public class Persona implements Serializable{

    private String nombre;
    private int edad;

    public Persona(){

    }   
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    

    
}
