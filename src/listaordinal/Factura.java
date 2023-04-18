package listaordinal;

import java.util.WeakHashMap;

public class Factura {
    private String dni;
    private String fecha;
    private ListaOrdinal listaProductos;
    private boolean cobrada;

    public Factura(String dni, String fecha) {
        this.dni = dni;
        this.fecha = fecha;
        listaProductos = new ListaOrdinal();
        cobrada = false;
    }

    public String getDNI() {
        return dni;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean estaCobrada() {
        return cobrada;
    }

    public void cobrada() {
        cobrada = true;
    }

    public void añadirProducto(Producto producto) {
        // Completar
        Iterador it = listaProductos.getIterador();
        boolean esta = false;
        while (it.hasNext() && !esta) {
            Producto p = it.next();
            if (producto.equals(p)) {
                p.setUnidades(producto.getUnidades() + p.getUnidades());
                esta = true;
            }
        }if(!esta){
            listaProductos.insertar(producto);
        }

    }

    public void mostrar() {
        System.out.println("Factura de: " + dni + " Fecha " + fecha);
        if (listaProductos.vacia()) {
            System.out.println("Lista vacía");
        } else {
            Iterador it = listaProductos.getIterador();
            while (it.hasNext()) {
                it.next().mostrar();
        }
    }
        System.out.println("IMPORTE TOTAL " + importeTotal() + "\n");
}


    public float importeTotal() {
        // Completar
        Iterador it = listaProductos.getIterador();
        float imp=0;
        while (it.hasNext()){
            Producto p = it.next();
            imp += (p.getPrecio()*p.getUnidades());
        }
        return imp; // Línea puesta para evitar error. Eliminarla al codificar el método
    }

    public int eliminarProducto(Producto producto) {
        // Completar
        Iterador it = listaProductos.getIterador();
        while(it.hasNext()){
            Producto este = it.next();
            if(este.equals(producto)){
                if(producto.getUnidades()>=este.getUnidades()){
                    listaProductos.borrar(este);
                    return este.getUnidades();
                }else{
                    este.setUnidades(este.getUnidades()-producto.getUnidades());
                    return producto.getUnidades();

                }
            }
        }
        return 0; // Línea puesta para evitar error. Eliminarla al codificar el método
    }



    public ListaOrdinal mayoresPrecios(float precio) {
        // Completar
        Iterador it = listaProductos.getIterador();
        ListaOrdinal lista = new ListaOrdinal();
        while (it.hasNext()){
            Producto p = it.next();
            if(p.getPrecio()>=precio){
                lista.insertar(p);
            }
        }
        System.out.println("Se han obtenido " + lista.getNumElementos() + " productos con precio mayor a " + precio + " por unidad");
        lista.mostrar();
        return lista; // Línea puesta para evitar error. Eliminarla al codificar el método
    }
}
