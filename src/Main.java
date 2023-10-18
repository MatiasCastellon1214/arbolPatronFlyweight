import com.backend.clase.model.Arbol;
import com.backend.clase.model.Bosque;
import com.backend.clase.service.ArbolFactory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Arbol ornamental = ArbolFactory.obtenerArbol(22, 400, "verde", "ornamental");
        //Arbol ornamental2 = ArbolFactory.obtenerArbol(22, 400, "verde", "ornamental");

        Bosque bosque = new Bosque();

        for (int i = 0; i < 500000; i++) {

            bosque.plantarArbol(ArbolFactory.obtenerArbol(200, 400, "verde", "Ornamental"));
            System.out.println(i+1);
            System.out.println("Árbol plantado");

        }
        System.out.println("-------------------------");

        for (int i = 0; i < 500001; i++) {

            bosque.plantarArbol(ArbolFactory.obtenerArbol(500, 300, "rojo", "Frutales"));
            System.out.println(i+500000);
            System.out.println("Árbol plantado");

        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));


    }
}