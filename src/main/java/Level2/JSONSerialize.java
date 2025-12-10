package Level2;

import java.io.*;
import java.lang.reflect.Field;

public class JSONSerialize {
    private static String JSON = "";

    private static void writeJSON(Field[] fields, Object obj) throws IllegalAccessException {
        StringBuilder json = new StringBuilder();
        json.append("{\n");

        for(int i = 0; i < fields.length; i++) {
            Field f = fields[i];

            f.setAccessible(true);

            String name = f.getName();
            Object value = f.get(obj);

            json.append("\t\"").append(name).append("\":");

            if(value instanceof String) {
                json.append("\"").append(value).append("\"");
            }else if(value == null){
                json.append("null");
            }else if(value instanceof Boolean){
                json.append(value);
            }else if(value instanceof Number){
                json.append(value);
            }

            if(i < fields.length-1){
                json.append(",");
            }

            json.append("\n");
        }
        json.append("}");

        JSON = json.toString();
    }

    public static void serialize(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        if(!clazz.isAnnotationPresent(SerializeToJSON.class)) {
            throw new RuntimeException("The class " + clazz.getName() + " has to be annotated with @SerializeToJSON");
        }

        SerializeToJSON serializeToJSON = clazz.getAnnotation(SerializeToJSON.class);
        String directory = serializeToJSON.directory();

        Field [] fields = clazz.getDeclaredFields();

        writeJSON(fields, obj);



        String fileName = directory + "/" + clazz.getSimpleName() + ".json";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(JSON);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
