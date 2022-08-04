package Wrappers;

public class Wrapper {

    //#region Tipos primitivos
    short num1 = 1;
    byte num2 = 10;
    int num3 = 100;
    long num4 = 100000000000000000L;
    float num5 = 3.5f;
    double num6 = 3.526;
    boolean flag = true;
    char a = 'a';

    //#endregion
    //#region Wrapper Class
    Short num7 = 1;
    Byte num8 = Byte.valueOf(num2);
    Integer num9 = Integer.parseInt("295");
    Long num10 = Long.valueOf(num4);

    Boolean flag2 = Boolean.parseBoolean("true");
    Character b = Character.valueOf('H');
    Double num11 = Double.parseDouble("3.4");

    //#endregion

}
