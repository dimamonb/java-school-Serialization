package homework.v3.entity.da;


import homework.v3.entity.JsonFileClass;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonReaderWithJackson {

    public JsonFileClass readJson(String file) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonFileClass jsonFileClass = objectMapper.readValue(new File(file), JsonFileClass.class);
        return jsonFileClass;
    }
}
