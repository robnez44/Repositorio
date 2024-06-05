public class ClienteVIP extends Cliente implements Descuento{
    private int desMembre = 100;

    public ClienteVIP(Persona persona, String ID_Cliente, String TipoCliente,int desMembers,int cantidadAcompaniantes){
        super(persona,ID_Cliente,TipoCliente,cantidadAcompaniantes);
        this.desMembre = desMembers;
    }

    @Override
    public float CalcularDescuento(float total) {
        float descuento = total;
        System.out.println("Al ser un cliente VIP y poseer una membresia, obtiene un descuento de $" +descuento+"en su total.");
        return descuento;
    }

    public void mostrarBeneficios() {
        System.out.println("Beneficios VIP:");
        System.out.println("- Descuento en el precio de las habitaciones.");
        System.out.println("- Prioridad en la asignación de habitaciones de mayor calidad o ubicación.");
        System.out.println("- Acceso a áreas exclusivas del hotel, como salones VIP o áreas de descanso.");
        // Agregar más beneficios aquí según sea necesario
    }
}
