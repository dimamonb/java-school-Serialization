package homework.v3;


import homework.v3.entity.JsonFileClass;
import homework.v3.entity.da.JsonReaderWithJackson;

import java.io.IOException;

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
    final static String binatySerializeFile = "homework.parameters.ser";
    final static String binatyExternalizeFile = "homework.parameters.exter";

    public static void main(String[] args) throws IOException {
        JsonReaderWithJackson jsonReaderWithJackson = new JsonReaderWithJackson();
        JsonFileClass jsonFileClass = jsonReaderWithJackson.readJson(jsonFile);
    }

}
