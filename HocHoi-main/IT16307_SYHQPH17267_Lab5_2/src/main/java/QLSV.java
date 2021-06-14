
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class QLSV {

    static ArrayList<student> list = new ArrayList<>();

    public static void write() {
        Gson gson = new Gson();
        String json = gson.toJson(list);
        try {

            File file = new File("D:\\listStudent.txt");
            FileWriter fw = new FileWriter(file);

            fw.write(json);
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        File file = new File("D:\\listStudent.txt");
        Gson gson = new Gson();
        try {
            FileReader Fr = new FileReader(file);
            ArrayList<student> list = gson.fromJson(Fr, new TypeToken<ArrayList<student>>() {
            }.getType());
            for (student object : list) {

                System.out.println(object);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        list.add(new student("Hoa Quang Sy"));
        list.add(new student("Hoa Quang Sy2"));
        list.add(new student("Hoa Quang Sy3"));
        list.add(new student("Hoa Quang Sy4"));
        write();
        read();
    }

}
