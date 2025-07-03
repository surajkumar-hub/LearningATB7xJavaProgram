package August.ex_04082024.AccessModifiers.Police;

public class Cop {
    private int gun;
    private String idCard;

    public Cop(int gun)
    {
        this.gun = gun;
    }
    void canIShoot()
    {
        System.out.println("Yes, You can!!");
    }
}
