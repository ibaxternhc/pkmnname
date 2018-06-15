package pkmnname;

/**
 *
 * @author My boii Ian
 */
public class NameList {
    int pointer;
    String names[];
    
    public NameList(){
        names = new String[1];
        pointer = 0;
    }
    
    public void add(String newName){
        names[pointer] = newName;
        pointer++;
        if (pointer == names.length){
            String[] temp = new String[names.length*2];
            System.arraycopy(names, 0, temp, 0, pointer);
            names = temp;
        }
    }
    public void remove(int index){}
    
    public String get(int index){
        return names[index];
    }
    public int size(){
        return pointer;
    }
    public int capacity(){
        return names.length;
    }
    
}
