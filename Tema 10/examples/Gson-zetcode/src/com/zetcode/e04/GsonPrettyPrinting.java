/*
 * Gson tutorial: http://zetcode.com/java/gson/
 * Java Gson pretty printing
 *
 */
//  Gson has two output modes: compact and pretty.

package com.zetcode.e04;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
import java.util.Map;

public class GsonPrettyPrinting {

    public static void main(String[] args) {

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        
        Map<String, Integer> items = new HashMap<>();
        
        items.put("chair", 3);
        items.put("pencil", 1);
        items.put("book", 5);

        gson.toJson(items, System.out);
    }
}
