package August.ex_17082024.exWrapperClass;

public enum Colors {
    RED("#ff0000"),
    GREEN("#f0d0d0d"),
    BLUE("#f0d0d0d");


    private final String hexValue;

    Colors(String hexValue)
    {
        this.hexValue = hexValue;
    }

    public String getValue()
    {
        return hexValue;
    }

}
