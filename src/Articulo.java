public class Articulo {
    private String nombreArt;
    private int cantidad;
    private double PrecioU;

    public Articulo(String nombreArt , int cantidad , double PrecioU){
        this.nombreArt=nombreArt;
        this.cantidad=cantidad;
        this.PrecioU=PrecioU;
    }

    void mostrarArticulo(){
        System.out.println("Articulo : "+nombreArt);
        System.out.println("Cantidad : "+ cantidad);
        System.out.println("PrecioU : "+PrecioU);
    }

    public String getnombreArt(){
        return nombreArt;
    }
    
    public int getcantidad(){
        return cantidad;
    }
    public double getPrecioU(){
        return PrecioU;
    }
}
