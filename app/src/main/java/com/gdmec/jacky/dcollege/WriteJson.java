package com.gdmec.jacky.dcollege;

import android.os.Environment;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;

public class WriteJson {

    public static String writeJson(String fileName, String key, Object value) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put(key, value);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        saveFile(fileName, jsonObject.toString());
        return jsonObject.toString();
    }

    public static void saveFile(String fileName, String value) {
        String filePath = null;
        boolean hasSDCard = Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
        if (hasSDCard) {
            filePath = Environment.getExternalStorageDirectory().toString() + File.separator + fileName + ".txt";
        } else {
            filePath = Environment.getDownloadCacheDirectory().toString() + File.separator + fileName + ".txt";
        }
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                File dir = new File(file.getParent());
                dir.mkdirs();
                file.createNewFile();
            }
            FileOutputStream outStream = new FileOutputStream(file);
            outStream.write(value.getBytes());
            outStream.close();
            System.out.println("OK");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}