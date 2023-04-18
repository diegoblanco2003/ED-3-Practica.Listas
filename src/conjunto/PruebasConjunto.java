package conjunto;

public class PruebasConjunto {

    public static void main(String[] args) {
        // Introducir aquí las pruebas pedidas en la práctica
        //5.1
        Conjunto un = new Conjunto();
        un.insertar(4);
        un.insertar(6);
        un.insertar(2);
        un.insertar(4);
        un.insertar(-2);
        System.out.println("Conjunto de trabajo: ");
        un.mostrar();



        //5.2
        int[] array = un.toArray();
        System.out.println("El array contiene: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }



        //5.3
        System.out.println("\nEl mayor elemento es: " + un.mayor());
        un.mayor();



        //5.4
        System.out.println("El subconjunto entre 3 y 6 es:" );
        un.subconjunto(3,6).mostrar();



        //5.5
        Conjunto dos = new Conjunto();
        dos.insertar(2);
        dos.insertar(4);
        System.out.println("Un conjunto es: " );
        dos.mostrar();
        System.out.println("Es igual que el conjunto de trabajo? "+ (un.equals(dos)));
        dos.insertar(6);
        System.out.println("Un conjunto es: " );
        dos.mostrar();
        System.out.println("Es igual que el conjunto de trabajo? "+ (un.equals(dos)));



        //6
        Conjunto tres = new Conjunto();
        tres.insertar(4);
        tres.insertar(5);
        Algoritmos cuatro = new Algoritmos();
        System.out.println("La interseccion de [ 4, 5 ] con el de trabajo es: ");
        cuatro.interseccion(un,tres).mostrar();




    }

}
