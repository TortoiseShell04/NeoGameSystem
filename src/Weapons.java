import java.util.ArrayList;


// This class just holds the weapon's values and attributes
public abstract class Weapons {

    int BaseATK = 0;
    int MagicATK = 0;
    int ProjATK = 0;
    char rank = ';';

    String Name = " ";

}

// Class responsible for object creation and methods
class Weapon extends Weapons
{
    // Copies weapon data from weapon using the method to weapon in argument
    // Weapon1.CopyTo(Weapon2)
    // Copies all attributes to "Weapon2"
    public void CopyTo(Weapon A)
    {
        A.Name = Name;
        A.BaseATK = BaseATK;
        A.MagicATK = MagicATK;
        A.ProjATK = ProjATK;
        A.rank = rank;
    }

    // Copies weapon data from weapon in argument to weapon using the method
    // Weapon1.CopyFrom(Weapon2)
    // Copies all attributes to "Weapon1"
    public void CopyFrom(Weapon A)
    {
        Name = A.Name;
        BaseATK = A.BaseATK;
        MagicATK = A.MagicATK;
        ProjATK = A.ProjATK;
        rank = A.rank;
    }

    // Prints all weapons attributes to console
    // Can be useful if using a text based game and looking through a shop items' description
    public void Display()
    {
        System.out.println(Name);
        System.out.println(BaseATK);
        System.out.println(MagicATK);
        System.out.println(ProjATK);
        System.out.println(rank);

    }

    // Method for ranking weapons
    // Needs values optimization and more ranks
    public void Rank()
    {
        float RankInit = BaseATK + ProjATK + MagicATK;
        float Rank = RankInit / 3;

        if (Rank < 10)
        {
            rank = 'C';
        }
        if (Rank < 20 && Rank > 10)
        {
            rank = 'B';
        }
        if (Rank > 20)
        {
            rank = 'A';
        }
    }
}

// Class responsible for management for weapons' attributes
class WeaponManage
{
    Weapon SharkM = new Weapon();
    Weapon MageShooter = new Weapon();
    Weapon BomberDream = new Weapon();
    Weapon CopyTest = new Weapon();
    Weapon CopyTest1 = new Weapon();
    public void Manage()
    {
        // SharkM
        SharkM.BaseATK = 12;
        SharkM.Name = "SharkM";

        // MageShooter
        MageShooter.BaseATK = 45;
        MageShooter.MagicATK = 21;
        MageShooter.Name = "MageShooter";

        // BomberDream
        BomberDream.BaseATK = 34;
        BomberDream.ProjATK = 18;
        BomberDream.Name = "BomberDream";

        // ArrayList of possible weapons available
        ArrayList<Weapon> WeaponValues = new ArrayList<>();

        WeaponValues.add(SharkM);
        WeaponValues.add(MageShooter);
        WeaponValues.add(BomberDream);

        for (Weapon n : WeaponValues)
        {
            n.Rank();
            n.Display();
        }
        // CopyTo method testing
        SharkM.CopyTo(CopyTest);
        CopyTest.Display();

        // CopyFrom method testing
        CopyTest1.CopyFrom(MageShooter);
        CopyTest1.Display();
    }

}
