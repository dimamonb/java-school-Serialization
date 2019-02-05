package homework.v3.entity.da;

import homework.v3.entity.JsonFileClass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomSerializator {
    public void customSerialize(JsonFileClass obj, String fileName) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(fileName)){
            try (ObjectOutputStream oos = new ObjectOutputStream(fos);){
                oos.writeObject(obj);
            }
        }
    }
}
