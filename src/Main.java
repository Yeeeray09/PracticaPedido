public class Main {
    public static void main(String[] args) {
        //  CARTA DE 5 ARTÍCULOS DISPONIBLES
        Articulo hamburguesa = new Articulo("Hamburguesa BBQ", 1, 12.50);
        Articulo pizza = new Articulo("Pizza Carbonara", 1, 10.00);
        Articulo ensalada = new Articulo("Ensalada César", 1, 8.50);
        Articulo refresco = new Articulo("Refresco", 2, 2.50);
        Articulo tarta = new Articulo("Tarta de Queso", 1, 5.00);

        //  EJEMPLO 1
        System.out.println(">>> EJEMPLO 1: Creando pedido para Yeray");
        Pedido pedido1 = new Pedido("Yeray");
        
        pedido1.añadirArticulos(hamburguesa);
        pedido1.añadirArticulos(refresco);
        pedido1.añadirArticulos(tarta);
        
        System.out.println("Total pedido 1: " + pedido1.calcularTotal() + " euros ");
        pedido1.cambiarEstado(EstadoPedido.Listo_para_entregar);
        pedido1.cambiarEstado(EstadoPedido.Entregado);


        //  EJEMPLO 2
        System.out.println("\n>>> EJEMPLO 2: Probando límite de 5 artículos");
        Pedido pedido2 = new Pedido("Gabriel"); 
        
        pedido2.añadirArticulos(pizza);
        pedido2.añadirArticulos(pizza);
        pedido2.añadirArticulos(ensalada);
        pedido2.añadirArticulos(refresco);
        pedido2.añadirArticulos(tarta);
        
        // Este sexto artículo hará que salte tu mensaje de "Carrito lleno"
        Articulo extra = new Articulo("Café", 1, 1.50);
        pedido2.añadirArticulos(extra); 
        
        System.out.println("Total pedido 2 (máx 5): " + pedido2.calcularTotal() + " euros ");
        pedido2.cambiarEstado(EstadoPedido.Listo_para_entregar);

    }
}