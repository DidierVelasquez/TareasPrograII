
package uspg.edu.model;

public class Estudiante {
    
    private String Nombre;
    private String Apellido;
    private String Edad;
    private Integer Carnet;
    
    public Estudiante (){}
    

    public Estudiante(String Nombre, String Apellido, String Edad, Integer Carnet) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Carnet = Carnet;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public Integer getCarnet() {
        return Carnet;
    }

    public void setCarnet(Integer Carnet) {
        this.Carnet = Carnet;
    }
    
    public void Datos (){
        
        System.out.println ("\nNombre: \t"  + getNombre() + "\nApellido:  \t" + getApellido() +
                            "\nEdad: \t" + getEdad() +      "\nCarnet: \t" + getCarnet());
        
    }
}
