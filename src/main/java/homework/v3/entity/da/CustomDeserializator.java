package homework.v3.entity.da;

import homework.v3.entity.JsonFileClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CustomDeserializator {

    public JsonFileClass customDeserialize(String fileName) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(fileName)){
            try (ObjectInputStream ois = new ObjectInputStream(fis)){
                return  (JsonFileClass) ois.readObject();
            }
        }
    }
}
