package pkmnname;

/**
 *
 * @author My boii Ian
 */
public class Pkmnname {
    public static void main(String[] args) {
        NameList titles = new NameList();
        titles.add("Bug Catcher");
        titles.add("Youngster");
        
        System.out.println(titles.get(0));
        System.out.println(titles.get(1));
        System.out.println("Size: " + titles.size());
    }
    
}
