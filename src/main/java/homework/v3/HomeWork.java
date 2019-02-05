package homework.v3;


import com.fasterxml.jackson.databind.ObjectMapper;
import homework.v3.entity.JsonFileClass;
import homework.v3.da.CustomDeserializator;
import homework.v3.da.CustomSerializator;
import homework.v3.da.JsonReaderWithJackson;

import java.io.File;


/**
 * Задание
 * 1) Составить файл с JSON-объектом, который "разложен" в пакете homework.v3.entity.
 * Определить какой элемент является корневым
 * Дать имя файлу homework.parameters.json
 * 2) Заполнить его значениями (как пример "parameters.v1.json")
 * 3) Считать получившийся homework.parameters.json в память
 * 4) Сериализовать его с помощью встроенного механиза сериализации в файл с именем homework.parameters.ser
 * 5) Сериализовать его с использованием интерфейса Externalizable в файл с именем homework.parameters.exter
 * 6) Считать данные из файла homework.parameters.ser в память и сохранить в формате JSON в файл с именем homework.result.ser.parameters.json
 * 7) Считать данные из файла homework.parameters.exter в память и сохранить в формате JSON в файл с именем homework.result.exter.parameters.json
 * 8) Убедиться, что файлы homework.result.ser.parameters.json и  homework.result.exter.parameters.json
 * совпадают с homework.parameters.json
 * */
public class HomeWork {
    final static String jsonFile = "homework.parameters.json";
    final static String binarySerializeFile = "homework.parameters.ser";
    final static String binaryExternalizeFile = "homework.parameters.exter";
    final static String jsonSerializeFile = "homework.result.ser.parameters.json";

    static homework.v3.exentity.exJsonFileClass exJsonFileClass = null;

    public static void main(String[] args) throws Exception {

        /************************* Читаем данные из json *********************************/
        JsonReaderWithJackson jsonReaderWithJackson = new JsonReaderWithJackson();
        JsonFileClass jsonFileClass = null;
        jsonFileClass = jsonReaderWithJackson.readJson(jsonFile);
        System.out.print(jsonFileClass + "\n");

        System.out.println("***************************************************");

        /***************** Сериализация в файл ***************/

        CustomSerializator cs = new CustomSerializator();
        cs.customSerialize(jsonFileClass, binarySerializeFile);

        /****************** Прочитать из файла ***********************************/
        JsonFileClass jfc = null;
        CustomDeserializator cd = new CustomDeserializator();
        jfc = cd.customDeserialize(binarySerializeFile);
        System.out.println(jfc);

        /********************* Записать прочитанные данные в json ************************/

        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(jsonSerializeFile), jfc);

        /*******************************************************************************/
       
    }

}
