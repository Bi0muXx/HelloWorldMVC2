package model;

import java.io.*;

public class Model {
    public String getMessage() {
        String res = "";
        try {
            try(BufferedReader br = new BufferedReader(new InputStreamReader(Model.class.getResourceAsStream("message.txt")))) {
                String st;
                while ((st = br.readLine()) != null) {
                    res += st;
                }
                return res;
            }
        } catch (IOException e) {
            return e.toString();
        }
    }
}
