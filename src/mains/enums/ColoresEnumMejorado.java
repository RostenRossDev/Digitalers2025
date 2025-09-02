package mains.enums;

public enum ColoresEnumMejorado {
    ROJO("FF0000", "255,0,0", "ROJO"),
    VERDE("008000", "0,128,0", "VERDE");

    private String HEX_CODE;
    private String RGB_CODE;
    private String NAME;

    private ColoresEnumMejorado(String hex, String rgb, String name){
        this.HEX_CODE = hex;
        this.RGB_CODE = rgb;
        this.NAME = name;
    }

    public String getHEX_CODE() {
        return HEX_CODE;
    }

    public void setHEX_CODE(String HEX_CODE) {
        this.HEX_CODE = HEX_CODE;
    }

    public String getRGB_CODE() {
        return RGB_CODE;
    }

    public void setRGB_CODE(String RGB_CODE) {
        this.RGB_CODE = RGB_CODE;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
}