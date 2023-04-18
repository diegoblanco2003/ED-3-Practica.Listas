package conjunto;

public class Algoritmos {

    public Conjunto interseccion(Conjunto conjunto1, Conjunto conjunto2) {
        Conjunto interseccion = new Conjunto();

        int[] array = conjunto1.toArray();


        for (int i=0; i<conjunto1.getNumElementos();i++) {
            int elem = array[i];
            if(conjunto2.contiene(elem)){
                interseccion.insertar(elem);
            }
        }

        return interseccion;
    }


    }
