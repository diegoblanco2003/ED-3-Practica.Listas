package listaordinal;

import java.util.Iterator;
import java.util.LinkedList;

public class FacturaBib {
    private String dni;
    private String fecha;
    private LinkedList<Producto> listaProductos;
    private boolean cobrada;

    public FacturaBib(String dni, String fecha) {
        this.dni = dni;
        this.fecha = fecha;
        listaProductos = new LinkedList<Producto>();
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
        Iterator<Producto> it = listaProductos.listIterator();
        boolean esta = false;
        while (it.hasNext() && !esta) {
            Producto p = it.next();
            if (producto.equals(p)) {
                p.setUnidades(producto.getUnidades() + p.getUnidades());
                esta = true;
            }
        }if(!esta){
            listaProductos.add(producto);
        }

    }

    public void mostrar() {
        System.out.println("Factura de: " + dni + " Fecha " + fecha);
        if (listaProductos.isEmpty()) {
            System.out.println("Lista vacía");
        } else {
            Iterator<Producto> it = listaProductos.listIterator();
            while (it.hasNext()) {
                it.next().mostrar();
        }
    }
        System.out.println("IMPORTE TOTAL " + importeTotal() + "\n");
}


    public float importeTotal() {
        // Completar
        Iterator<Producto> it = listaProductos.listIterator();
        float imp=0;
        while (it.hasNext()){
            Producto p = it.next();
            imp += (p.getPrecio()*p.getUnidades());
        }
        return imp; // Línea puesta para evitar error. Eliminarla al codificar el método
    }

    public int eliminarProducto(Producto producto) {
        // Completar
        Iterator<Producto> it = listaProductos.listIterator();
        while(it.hasNext()){
            Producto este = it.next();
            if(este.equals(producto)){
                if(producto.getUnidades()>=este.getUnidades()){
                    listaProductos.remove(este);
                    return este.getUnidades();
                }else{
                    este.setUnidades(este.getUnidades()-producto.getUnidades());
                    return producto.getUnidades();

                }
            }
        }
        return 0; // Línea puesta para evitar error. Eliminarla al codificar el método
    }



    public LinkedList<Producto> mayoresPrecios(float precio) {
        // Completar
        Iterator<Producto> it = listaProductos.listIterator();
        LinkedList<Producto> lista = new LinkedList();
        while (it.hasNext()){
            Producto p = it.next();
            if(p.getPrecio()>=precio){
                lista.add(p);
            }
        }
        System.out.println("Se han obtenido " + lista.size() + " productos con precio mayor a " + precio + " por unidad");
        //lista.mostrar();
        Iterator<Producto> it2 = listaProductos.listIterator();
        while (it2.hasNext()){
            it2.next().mostrar();
        }
        return lista; // Línea puesta para evitar error. Eliminarla al codificar el método
    }
}
