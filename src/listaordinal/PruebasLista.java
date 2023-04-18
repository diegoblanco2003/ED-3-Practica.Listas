package listaordinal;

public class PruebasLista {
    public static void main(String[] args) {
        // Introducir aquí las pruebas pedidas en la práctica
        //2.2
        System.out.println("---------- PRODUCTOS EN LA LISTA -----------");
        ListaOrdinal lista = new ListaOrdinal();
        Producto un = new Producto("Mesa escritorio", 185,2 );
        Producto dos = new Producto("Silla oficina", 95.9F,3 );
        Producto tres = new Producto("Mesa cocina", 125,1  );
        Producto quatre = new Producto("Sillón reclinable", 230,2 );
        lista.insertar(un);
        lista.insertar(dos);
        lista.insertar(tres);
        lista.insertar(quatre);
        lista.mostrar();
        lista.borrar(dos);
        System.out.println("Después de borrar las sillas de oficina:");
        lista.mostrar();



        //3.2-3.3
        Factura uno = new Factura("12345678B","17/03/2021");
        uno.añadirProducto(un);
        uno.añadirProducto(dos);
        uno.añadirProducto(tres);
        uno.añadirProducto(quatre);
        Producto cinc = new Producto("Silla oficina",95.9F,1);
        uno.añadirProducto(cinc);
        uno.mostrar();



        //3.4
        int numEliminados = 0;
        Producto sec = new Producto("Silla oficina",95.9F,2);
        Producto set = new Producto("Sillón reclinable",230,3);
        //uno.añadirProducto(sec);
        //uno.añadirProducto(set);
        //uno.eliminarProducto(sec);
        //uno.eliminarProducto(set);
        numEliminados += uno.eliminarProducto(sec);
        numEliminados += uno.eliminarProducto(set);
        System.out.println("Se han eliminado " + numEliminados + " unidades");
        uno.mostrar();



        //3.5
        uno.mayoresPrecios(100);



        //4
        FacturaBib doss = new FacturaBib("88888888A","08/08/2008");
        Producto acht = new Producto("Armario",385,5);
        Producto neun = new Producto("Cama",255,3);
        Producto zhen = new Producto("Cama",255,2);
        Producto elf = new Producto("Armario",385,1);
        doss.añadirProducto(acht);
        doss.añadirProducto(neun);
        doss.añadirProducto(zhen);
        doss.eliminarProducto(elf);
        doss.mostrar();
        doss.mayoresPrecios(250);
        
    }
}
