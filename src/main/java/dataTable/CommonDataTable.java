package dataTable;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;


public class CommonDataTable {
    private static List<Map<String, String>> data;

    public static String getDataForField(String name, DataTable dataTable) {
        data = dataTable.asMaps(String.class, String.class);
        return data.get(0).get(name);
    }

}
