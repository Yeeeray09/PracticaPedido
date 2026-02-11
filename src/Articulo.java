//**@Autor Yeray Musila */

public class Articulo {
    private String nombreArt;
    private int cantidad;
    private double PrecioU;

    //constructor del articulo lo usaremos para añadir articulos por ejemplo
    public Articulo(String nombreArt , int cantidad , double PrecioU){
        this.nombreArt=nombreArt;
        this.cantidad=cantidad;
        this.PrecioU=PrecioU;
    }

//Metodo para mostrar el pedido
    void mostrarArticulo(){
        System.out.println("Articulo : "+nombreArt);
        System.out.println("Cantidad : "+ cantidad);
        System.out.println("PrecioU : "+PrecioU);
    }

//getters para 
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