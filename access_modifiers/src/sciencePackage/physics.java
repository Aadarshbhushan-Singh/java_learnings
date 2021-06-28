package sciencePackage;
import sciencePackage.organicChemistry;
import sciencePackage.chemistry;

class force{
    public int force=100;
    public void setForce(){
        System.out.println("The value of force is: "+force);
    }
}
public class physics {
    public static void main(String[] args){
        System.out.println("This is physics from science package.");
        organicChemistry obj1=new organicChemistry();
        obj1.printOrganicChemistry();
        chemistry obj2=new chemistry();
        obj2.chemistryMain();

    }
}
