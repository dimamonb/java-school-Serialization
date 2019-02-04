package homework.v3;

import homework.v3.entity.*;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomeWorkFillJson {

    public static final String RESULT_PARAMETERS_V_1_JSON = "homework.parameters.json";


    public static void main(String[] args) throws IOException {

        Value value = new Value();
        value.setValue("SomeValue");
        List<String> valueList= new ArrayList<>();
        valueList.add(value.getValue());
//        value.setValue("SomeValue_2");
//        valueList.add(value.getValue());

        Path path = new Path();
        path.setCode("123");
        path.setValue("val123");
        List<Path> pathList= new ArrayList<>();
        pathList.add(path);

        Bundle bundle = new Bundle();
        bundle.setPath(pathList);
        bundle.setValues(valueList);
        List<Bundle> bundleList = new ArrayList<>();
        bundleList.add(bundle);

        Role role = new Role();
        role.setRole("role1");
        List<String> rolesList =new ArrayList<>();
        rolesList.add(role.getRole());

        JsonParameters params = new JsonParameters();
        params.setBundle(bundleList);
        params.setDescription("Description parameters");
        params.setList(true);
        params.setName("Name in parameters class");
        params.setRoles(rolesList);
        params.setType("SomeType");
        List<JsonParameters> jsonParametersList = new ArrayList<>();
        jsonParametersList.add(params);


        JsonFileClass jsonFileClass = new JsonFileClass();
        jsonFileClass.setVersion("0.1");
        jsonFileClass.setParameters(jsonParametersList);



        ObjectMapper mapper = new ObjectMapper();
        System.out.println("Записываем данные в файла " + RESULT_PARAMETERS_V_1_JSON);
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(RESULT_PARAMETERS_V_1_JSON), jsonFileClass);
        System.out.println("Данные записаны на диск в файл " + RESULT_PARAMETERS_V_1_JSON);
    }
}
