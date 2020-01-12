package pl.sda.gdanskDemografic;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Analyser {
    private District[] allDistricts;

    public Analyser(District[] allDistricts) {
        this.allDistricts = allDistricts;
    }

    public void findByName(String districtName) {
        for (District singleDistrict : allDistricts) {
            if (singleDistrict.getDistrictName().equals(districtName)) {

                System.out.println(singleDistrict);
            }
        }
    }
}
