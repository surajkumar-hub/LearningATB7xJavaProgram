package August.ex_04082024.AccessModifiers.Criminal;

import August.ex_04082024.AccessModifiers.Police.Cop;

public class Thief {
    public static void main(String[] args)
    {
        Cop c = new Cop(100);
        //System.out.println(c.gun);
        // c.canIShoot();
        /* If in Cop class everything is public (e.g. class, attributes, methods) thief can create an object of Cop,
        can also see how many guns Cop has and can use canIShoot() function also. This is a security issue.
        We can save this by using private keyword. */
    }
}
