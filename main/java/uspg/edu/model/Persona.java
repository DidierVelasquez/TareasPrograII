
package uspg.edu.model;

// Objeto
public class Persona {
    
// Atributos
    
    private Integer ID;
    private String Nombres;
    private String Apellidos;
    private String FechaDeNac;
    private Integer DPI;
    private String Sexo;
    private Integer Telefono;
    
// Constructor 
    
    public Persona (){}
    
       
    
    public Persona(Integer ID, String Nombres, String Apellidos, String FechaDeNac, Integer DPI, String Sexo, Integer Telefono) {
        this.ID = ID;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.FechaDeNac = FechaDeNac;
        this.DPI = DPI;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
    }

    
// Getter y Setter
    
    public Integer getID (){
        return ID;
    }
    
    public void setID(Integer ID) {
        this.ID = ID;
    }
   
    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getFechaDeNac() {
        return FechaDeNac;
    }

    public void setFechaDeNac(String FechaDeNac) {
        this.FechaDeNac = FechaDeNac;
    }

    public Integer getDPI() {
        return DPI;
    }

    public void setDPI(Integer DPI) {
        this.DPI = DPI;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer Telefono) {
        this.Telefono = Telefono;
    }
    
    
    public void Datos (){
        
        System.out.println ("ID:           \t" + getID () + "\nNombre: \t"  + getNombres () + "\nApellido:  \t" + getApellidos () + "\nFechaDeNac: \t"  + getFechaDeNac ()
                                 + "\nDPI:       \t" + getDPI () + "\nSexo:     \t"  + getSexo () + "\nTelefono:" + "    \t" + getTelefono ());
        
    }
    
    
    
    
    
}
