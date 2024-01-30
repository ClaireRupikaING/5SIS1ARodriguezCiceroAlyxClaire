public class Persona {
    
    private int id;
    private String nombre;
    private int edad;

    //constructor
    public Persona(){

    }

    public Persona(int id, String nombre, int edad){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getNombre(){
        return nombre;
    }

    public void setNombre(int nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}
