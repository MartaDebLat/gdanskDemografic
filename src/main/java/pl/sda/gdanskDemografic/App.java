package pl.sda.gdanskDemografic;

import javafx.scene.effect.Light;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        District[] districts = loadDistricts();

    }

    private static District[] loadDistricts() throws IOException {

        String loadData = FileLoaderUtil.readFileAsSingleStringByFilesReadString("data.csv");
        System.out.println(loadData);
        String[] rows = loadData.split("\r\n");
        System.out.println(rows);
        District[] Districts = new District[rows.length];

        for (int i = 1; i < rows.length; i++) {
            String[] splitRows = rows[i].split(";");
            // String[] splitRows = rows[+1].split(";");
            District singleDistrict = new District(

                    splitRows[0],
                    splitRows[1],
                    Integer.valueOf(splitRows[2].replaceAll(" ", "")),
                    Integer.valueOf(splitRows[3].replaceAll(" ", "")),
                    Integer.valueOf(splitRows[4].replaceAll(" ", "")),
                    Integer.valueOf(splitRows[5].replaceAll(" ", ""))
            );
            Districts[i - 1] = singleDistrict;
        }
        return Districts;
    }

}


