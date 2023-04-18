package conjunto;

public class Conjunto {

    private Nodo inicio;
    private int numElementos;

    public Conjunto() {
        inicio = null;
        numElementos = 0;
    }

    public boolean vacio() {
        return inicio == null;
    }

    /**
     * Inserta el dato en la posición que le corresponde
     */
    public boolean insertar(int dato) {
        if (dato >= 0) {
            Nodo anterior = null;
            Nodo actual = inicio;
            while ((actual != null) && (actual.getDato() < dato)) {  // Buscar posición de inserción
                anterior = actual;
                actual = actual.getSiguiente();
            }
            if ((actual == null) || (actual.getDato() > dato)) {  // Insertar antes de actual
                Nodo nuevo = new Nodo(dato, actual);
                if (actual == inicio) {  // insertar al principio de la lista
                    inicio = nuevo;
                } else {
                    anterior.setSiguiente(nuevo);
                }
                numElementos++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    /**
     * Determina si la clave recibida como parámetro existe en la lista.
     */
    public boolean contiene(int dato) {
        Nodo actual = inicio;
        while ((actual != null) && (actual.getDato() < dato)) {  // Buscar dato
            actual = actual.getSiguiente();
        }
        return (actual != null) && (actual.getDato() == dato);
    }

    /**
     * Elimina de la lista el alumno con número de matrícula clave,
     * en caso de existir.
     */
    public boolean borrar(int dato) {
        Nodo actual = inicio;
        Nodo anterior = null;
        while ((actual != null) && (actual.getDato() < dato)) {  // Buscar dato
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if ((actual == null) || (actual.getDato() > dato)) {  // No existe clave
            return false;
        } else {  // Clave encontrada
            if (actual == inicio) {    // eliminar el primero de la lista
                inicio = actual.getSiguiente();
            } else {
                anterior.setSiguiente(actual.getSiguiente());
            }
            numElementos--;
            return true;
        }
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void mostrar() {
        if (this.vacio()) {
            System.out.println ("Conjunto vacío");
        } else {
            System.out.print("[ " + inicio.getDato());
            Nodo actual = inicio.getSiguiente();
            while (actual != null) {
                System.out.print(", " + actual.getDato());
                actual = actual.getSiguiente();
            }
            System.out.println(" ]");
        }
    }



    public int[] toArray() {
        // Completar
        int[]array = new int[numElementos];
        Nodo nodoActual = inicio;
        int num = 0;
        while (nodoActual != null){
            array[num] = nodoActual.getDato();
            nodoActual = nodoActual.getSiguiente();
            num++;
        }

        return array;   // Línea puesta para evitar error. Eliminarla al codificar el método
    }


    public int mayor() {
        // Completar
        Nodo nodoActual = inicio;
        int max=0;
        while (nodoActual != null){
            if(nodoActual.getDato()>max){
                max = nodoActual.getDato();
            }
            nodoActual = nodoActual.getSiguiente();
        }

        return max;   // Línea puesta para evitar error. Eliminarla al codificar el método
    }

    public Conjunto subconjunto(int inferior, int superior) {
        // Completar
        Conjunto subconjunto = new Conjunto();
        Nodo nodoActual = inicio;
        while(nodoActual != null){
            if(nodoActual.getDato()>=inferior && nodoActual.getDato()<=superior){
                subconjunto.insertar(nodoActual.getDato());
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return subconjunto;   // Línea puesta para evitar error. Eliminarla al codificar el método
    }

    public boolean equals(Conjunto conjunto) {
        // Completar
        if (this.numElementos != conjunto.numElementos) {
            return false;
        }
        Nodo nodo1 = this.inicio;
        Nodo nodo2 = conjunto.inicio;
        while (nodo1 != null && nodo2 != null) {
            if (nodo1.getDato() != nodo2.getDato()) {
                return false;
            }
            nodo1 = nodo1.getSiguiente();
            nodo2 = nodo2.getSiguiente();
        }
        return true;
    }






}
