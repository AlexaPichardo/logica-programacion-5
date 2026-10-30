
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


import static java.util.Collection.*;

public class DiccionarioApp {
    public static void main(String[] args){
        //1.-Crear el diccionario(20 palabras español-ingles)
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("planta", "plant");
        diccionario.put("animal", "animal");
        diccionario.put("flor", "flower");
        diccionario.put("árbol", "tree");
        diccionario.put("hoja", "leaf");
        diccionario.put("semilla", "seed");
        diccionario.put("jardín", "garden");
        diccionario.put("bosque", "forest");
        diccionario.put("mariposa", "butterfly");
        diccionario.put("pájaro", "bird");
        diccionario.put("agua", "water");
        diccionario.put("tierra", "earth");
        diccionario.put("sol", "sun");
        diccionario.put("nube", "cloud");
        diccionario.put("río", "river");
        diccionario.put("fruta", "fruit");
        diccionario.put("piedra", "stone");
        diccionario.put("vida", "life");

        ArrayList<String> listaEspañol = new ArrayList<>(diccionario.keySet());

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int correctas = 0;
        int incorrectas = 0;

        System.out.println("==========Aprendamos juntos==================");
        System.out.println("Traduce 5 palabras al ingles: \n");

        for (int i = 0; i < 5; i++){
            int indiceAleatorio = random.nextInt(listaEspañol.size());

            String palabrasEspañol = listaEspañol.get(indiceAleatorio);

            System.out.print("Como se dice \"" + palabrasEspañol + "\" en ingles?: ");
            String respuesta = scanner.nextLine().trim().toLowerCase();

            String traduccionReal = diccionario.get(palabrasEspañol);

            //Validar acierto
            if (respuesta.equals(traduccionReal)){
                System.out.println("!Correcto¡");
                 correctas++;
            }else {
                System.out.println("Incorrecta: la respuesta correcta es: " + traduccionReal + "\n");
                incorrectas++;
            }//else
            //No repetir palabras ya preguntadas
            listaEspañol.remove(indiceAleatorio);
        }//for
        System.out.println("============================================================");
        System.out.println("Resultados: " + correctas + "  correctas, " + incorrectas + "  incorrectas ");
        System.out.println("============================================================");
    }//main

} //class DiccionarioApp
