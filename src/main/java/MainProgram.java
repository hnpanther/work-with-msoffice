import model.DataModel;
import tools.ExcelTools;

import java.util.HashMap;
import java.util.Map;

public class MainProgram {

    public static void main(String[] args) {
        DataModel dataModel1 = new DataModel();
        dataModel1.setId(2);
        dataModel1.setFirstName("test1");
        dataModel1.setLastName("testL1");

        DataModel dataModel2 = new DataModel();
        dataModel2.setFirstName("test2");
        dataModel2.setLastName("testL2");

        Map<Integer, DataModel> dataModelMap = new HashMap<>();
        dataModelMap.put(1, dataModel1);
        dataModelMap.put(2, dataModel2);

        ExcelTools excelTools = new ExcelTools();
        excelTools.writeToExcel(dataModelMap);
    }
}
