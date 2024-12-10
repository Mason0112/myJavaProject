package org.example.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://api.myjson.online/v1/records/0b41b215-b857-4baf-b372-372ae1e4c437");
            HttpURLConnection connection =(HttpURLConnection)url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = br.readLine();
            StringBuffer json = new StringBuffer();
            while (line != null) {
                json.append(line);
                line = br.readLine();
            }
            System.out.println(json.toString());

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
