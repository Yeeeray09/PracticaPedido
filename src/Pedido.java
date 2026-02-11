//**@Autor Yeray Musila Ferrer  */

public class Pedido {

    //he añadido esta variable para contar cuantos pedidos existen en total
    private static int contadorId=1;

    //asignamos las variables y las encapsulamos como el resto del codigo
 private int idPedido;
  private String nomCliente;

  //creamos el array para guardar el objeto articulo
    private Articulo[] listaArticulos = new Articulo[5];

    //creamos un int para saber el valor que tiene el array y si ya a llegadp al limmite 5
    private int numArticulos =0;

    //usamos el enum que creamos del estado
    private EstadoPedido estado;

    //creamos el contructor de pedido y controlamos el numero de pedidos con el contadorId para que se vaya incrementando y no de el mismo
    public Pedido ( String nomCliente){
        this.nomCliente=nomCliente;
        this.idPedido = contadorId;
        contadorId++;
        this.estado=EstadoPedido.En_preparacion;

    }

    //creamos un metodo para añadir articulos en los que manipularemos el pedido para que no supere los 5 articulos 
    public void añadirArticulos(Articulo newArticulo){
        if(numArticulos<5){
            listaArticulos[numArticulos]= newArticulo;
            numArticulos++;
        }else{
            System.out.println("Carrito lleno(MAX 5 ARTICULOS)");
        }
    }

    //creamos el metodo para calcular el precio total en el que 
    public double calcularTotal(){
    
        double sumaPre=0.0;
        for(int i=0 ; i<numArticulos;i++){
         sumaPre+=listaArticulos[i].getPrecioU()*listaArticulos[i].getcantidad();
        }
         return sumaPre;
    }

    //creamos otro metodo para que el pedido avance de estado
    public void cambiarEstado(EstadoPedido nuevoEstado){
        this.estado=nuevoEstado;
        System.out.println("El pedido "+ idPedido +" ahora esta "+ this.estado);
    }
}