import model.DataModel;
import tools.ExcelTools;

import java.util.HashMap;
import java.util.Map;

public class MainProgram {

    public static final Map<Integer, DataModel> dataModel = new HashMap<>();
    public static String basePath= "local_storage/";

    public static void main(String[] args) {

        initData();
        ExcelTools excelTools = new ExcelTools();
        excelTools.writeToExcel(dataModel, basePath);
    }

    public static void initData() {
        dataModel.put(1, new DataModel(1,"Java", "Java Language..."));
        dataModel.put(2, new DataModel(2, "C#", "C# Language..."));
        dataModel.put(3, new DataModel(3, "Python", "Python Language..."));
        dataModel.put(4, new DataModel(4, "C", "C Language..."));
    }
}
