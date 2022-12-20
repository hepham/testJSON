/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.javacore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class jsonConvert {

    public static List<infor> readfile(String filename) throws FileNotFoundException {
        List<infor> list = new ArrayList<infor>() {
        };
        Scanner sc = new Scanner(new File(filename));
        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().trim().split(",");
            infor temp = new infor(Integer.parseInt(line[0]), line[1]);
            list.add(temp);
        }
        return list;
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<infor> list = new ArrayList<infor>();
        list = readfile("C:/Users/phamh/Documents/NetBeansProjects/javacore/src/main/java/com/mycompany/javacore/test.txt");
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).display();
//        }
        //Creating a JSONObject object
        JSONArray jsonList = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            list.get(i).display();
            JSONObject jsonObject = new JSONObject();
            //Inserting key-value pairs into the json object
            jsonObject.put("ID", list.get(i).getId());
            jsonObject.put("username", list.get(i).getUsername());
            jsonObject.put("password", "VF6qgEOaTC0=");
            JSONObject server = new JSONObject();
            server.put("index", 10);
            server.put("name", "Server 11");
            jsonObject.put("server", server);
            jsonObject.put("size", "240*320");
            jsonObject.put("note", "nm");
            jsonObject.put("status", "-");
            jsonObject.put("socket", null);
            jsonList.add(jsonObject);
        }

        try {
            FileWriter file = new FileWriter("C:/Users/phamh/Documents/NetBeansProjects/javacore/src/main/java/com/mycompany/javacore/output.json");
            file.write(jsonList.toJSONString());
             file.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("JSON file created ");
    }

}
