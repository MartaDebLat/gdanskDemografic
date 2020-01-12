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

    public String getDistrictName() {
        return districtName;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAgeUnderEighteen() {
        return ageUnderEighteen;
    }

    public Integer getAgeFromNineteenToFifhtynine() {
        return ageFromNineteenToFifhtynine;
    }

    public Integer getAgeFromSixtytoSixtyfive() {
        return ageFromSixtytoSixtyfive;
    }

    @Override
    public String toString() {
        return "District{" +
                "districtName='" + districtName + '\'' +
                ", gender='" + gender + '\'' +
                ", ageUnderEighteen=" + ageUnderEighteen +
                ", ageFromNineteenToFifhtynine=" + ageFromNineteenToFifhtynine +
                ", ageFromSixtytoSixtyfive=" + ageFromSixtytoSixtyfive +
                ", ageOverSixtyFour=" + ageOverSixtyFour +
                '}';
    }

    public Integer getAgeOverSixtyFour() {
        return ageOverSixtyFour;


    }
}