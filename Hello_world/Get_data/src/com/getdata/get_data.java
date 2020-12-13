package com.getdata;

import com.getapi.get_api;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class get_data {

       public static void get_temp(String s) {

        JSONObject obj = (JSONObject) get_api.get_json_object();
        JSONArray arr = (JSONArray) obj.get("list");

        for (int i = 0; i < arr.size(); i++) {

            JSONObject new_obj = (JSONObject) arr.get(i);
            if (new_obj.get("dt_txt").equals(s)) {
                JSONObject obj_main = (JSONObject) new_obj.get("main");
                System.out.println("Temperature: " + obj_main.get("temp"));
                return;
            }
        }
        System.out.println("No data found for this datetime");
    }

    public static void get_windSpeed(String s) {

        JSONObject obj = (JSONObject) get_api.get_json_object();
        JSONArray arr = (JSONArray) obj.get("list");

        for (int i = 0; i < arr.size(); i++) {

            JSONObject new_obj = (JSONObject) arr.get(i);
            if (new_obj.get("dt_txt").equals(s)) {
                JSONObject obj_wind = (JSONObject) new_obj.get("wind");
                System.out.println("Wind Speed: " + obj_wind.get("speed"));
                return;
            }
        }
        System.out.println("No data found for this datetime");
    }

    public static void get_pressure(String s) {

        JSONObject obj = (JSONObject) get_api.get_json_object();
        JSONArray arr = (JSONArray) obj.get("list");

        for (int i = 0; i < arr.size(); i++) {

            JSONObject new_obj = (JSONObject) arr.get(i);
            if (new_obj.get("dt_txt").equals(s)) {
                JSONObject obj_main = (JSONObject) new_obj.get("main");
                System.out.println("Pressure: " + obj_main.get("pressure"));
                return;
            }
        }
        System.out.println("No data found for this datetime");
    }
}
