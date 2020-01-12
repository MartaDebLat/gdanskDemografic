package pl.sda.gdanskDemografic;

public class District {
    private String districtName;
    private String gender;
    private Integer ageUnderEighteen;
    private Integer ageFromNineteenToFifhtynine;
    private Integer ageFromSixtytoSixtyfive;
    private Integer ageOverSixtyFour;

    public District(String districtName,
                    String gender, Integer ageUnderEighteen,
                    Integer ageFromNineteenToFifhtynine,
                    Integer ageFromSixtytoSixtyfive,
                    Integer ageOverSixtyFour) {

        this.districtName = districtName;
        this.gender = gender;
        this.ageUnderEighteen = ageUnderEighteen;
        this.ageFromNineteenToFifhtynine = ageFromNineteenToFifhtynine;
        this.ageFromSixtytoSixtyfive = ageFromSixtytoSixtyfive;
        this.ageOverSixtyFour = ageOverSixtyFour;
    }
}