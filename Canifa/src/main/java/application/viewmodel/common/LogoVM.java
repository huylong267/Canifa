package application.viewmodel.common;

public class LogoVM {
    private String companyName;
    private  String logoUrl;
    private  String logoAlt;
    private String companyBrand;

    public LogoVM(String logoUrl, String logoAlt) {
        this.logoUrl = logoUrl;
        this.logoAlt = logoAlt;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getLogoAlt() {
        return logoAlt;
    }

    public void setLogoAlt(String logoAlt) {
        this.logoAlt = logoAlt;
    }

    public String getCompanyBrand() {
        return companyBrand;
    }

    public void setCompanyBrand(String companyBrand) {
        this.companyBrand = companyBrand;
    }
}
