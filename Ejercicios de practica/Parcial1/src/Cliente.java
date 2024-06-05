public abstract class Cliente extends Persona{
    //atributos
    private String ID_Cliente;
    private String TipoCliente;
    private int cantidadAcompaniantes;

    //constructor
    public Cliente(Persona persona,String ID_Cliente,String TipoCliente,int cantidadAcompaniantes){
        super(persona);
        this.ID_Cliente = ID_Cliente;
        this.TipoCliente = TipoCliente;
        this.cantidadAcompaniantes = cantidadAcompaniantes;
    }
    //metodos

    //getters y setters
    public String getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(String ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getTipoCliente() {
        return TipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        TipoCliente = tipoCliente;
    }

    public int getCantidadAcompaniantes() {
        return cantidadAcompaniantes;
    }

    public void setCantidadAcompaniantes(int cantidadAcompaniantes) {
        this.cantidadAcompaniantes = cantidadAcompaniantes;
    }
}
