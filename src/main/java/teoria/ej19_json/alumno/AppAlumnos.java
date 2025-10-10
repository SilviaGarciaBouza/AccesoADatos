package teoria.ej19_json.alumno;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

public class AppAlumnos {

    public static void main(String[] args) {

        // Parte1: Lee el fichero de alumnos, crear una lista de alumnos y mostrarlos
        // por consola
        //TODO Hacer por parte del alumno
//        for(Alumno e: leerJson(new File("src/main/java/teoria/ej19_json/alumno/alumnos_asignatura.json"))){
//            System.out.println(e.getNombre());
//        }
        leerJson(new File("src/main/java/teoria/ej19_json/alumno/alumnos_asignatura.json")).forEach(System.out::println);
        // Parte 2: Generar y escribir en el archivo alumnos_output.json
        //TODO Hacer por parte del alumno

        // Parte 3: Generar y escribir en el archivo alumnos_estadisticas.json
       calcularMediaAsignaturas(crearAlumnosFicticios()).forEach(System.out::println);

        System.out.println("Done!");
    }


    private static void escribirJson(File fichero) {
        List<Alumno>listaAlumnos=crearAlumnosFicticios();
        try(BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fichero)))){
           String json= new Gson().toJson(listaAlumnos);
           bw.write(json);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static List<Alumno> leerJson(File fichero) {
        List<Alumno> listAlumnos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fichero)))) {


            JsonParser parser = new JsonParser();
            JsonObject jsonob = parser.parse(br).getAsJsonObject();

            JsonArray gsonArr = jsonob.get("alumnos").getAsJsonArray();
            for (JsonElement element : gsonArr) {
                JsonObject gsonObj = element.getAsJsonObject();
                String nombre = gsonObj.get("nombre").getAsString();
                String dni = gsonObj.get("dni").getAsString();
                String apellido1 = gsonObj.get("apellido1").getAsString();
                String apellido2 = gsonObj.get("apellido2").getAsString();

                JsonArray asignaturas = gsonObj.get("asignaturas").getAsJsonArray();
                List listaAsignautas = new ArrayList<>();
                for (JsonElement e : asignaturas) {
                    JsonObject gsonObjAsig = e.getAsJsonObject();
                    String name = gsonObjAsig.get("nombre").getAsString();
                    double calificacion = gsonObjAsig.get("calificacion").getAsDouble();
                    listaAsignautas.add(new Asignatura(name, calificacion));
                }
                Alumno a = new Alumno(nombre, dni, apellido1, apellido2, listaAsignautas);

                listAlumnos.add(a);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            return listAlumnos;
        }
    }

    private static void escribirEstadisticasAlumnos(List<Alumno> alumnos) {
        throw new UnsupportedOperationException("A implementar por el alumno");
    }

    private static List<Asignatura> calcularMediaAsignaturas(List<Alumno> alumnos) {
        Map<String, Double> mapeoAsignatura=new HashMap<String, Double>();
        List<Asignatura>listaAsignaturas= new ArrayList<>();
//        for(Alumno element:alumnos){
//            for(Asignatura e:element.getAsignaturas()){
//                mapeoAsignatura.put(e.getNombre(),mapeoAsignatura.getOrDefault(e.getNombre(),0.0)+e.getCalificacion());
//            }
//        }
      mapeoAsignatura= alumnos.stream().flatMap(e->e.getAsignaturas().stream()).collect(Collectors.groupingBy(a->a.getNombre(),Collectors.averagingDouble(a->a.getCalificacion())));
        mapeoAsignatura.entrySet().forEach(e->listaAsignaturas.add(new Asignatura(e.getKey(),e.getValue())));
    return listaAsignaturas;
    }

    private static List<Alumno> crearAlumnosFicticios() {
        List<Alumno> alumnos = new ArrayList<>();

        // Primer alumno
        List<Asignatura> asignaturas1 = new ArrayList<>();
        asignaturas1.add(new Asignatura("BBDD", 9));
        asignaturas1.add(new Asignatura("LM", 8));
        Alumno alumno1 = new Alumno("12345678-T", "Alicia", "Castro", "Lopez", asignaturas1);
        alumnos.add(alumno1);

        // Segundo alumno
        List<Asignatura> asignaturas2 = new ArrayList<>();
        asignaturas2.add(new Asignatura("Programación", 10));
        asignaturas2.add(new Asignatura("Redes", 7));
        Alumno alumno2 = new Alumno("22345678-T", "Borja", "Sanchez", "Lopez", asignaturas2);
        alumnos.add(alumno2);

        return alumnos;
    }




}
