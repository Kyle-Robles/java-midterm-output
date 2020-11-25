
import java.util.*;
import java.util.ArrayList;

public class       MidtermsOutput {
    static ArrayList<Integer> age = new ArrayList<>();
    static ArrayList<String> name = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int opt = 0;
        end:
        while (true){
            System.out.println("NAME & AGE DATABASE INPUT\n[1] Add Entry \n[2] Delete Entry \n[3] View Entries \n[4] Update Entry \n[0] Exit\n[Please choose a number] = ");
            opt = input.nextInt();

            switch (opt){
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    view();
                    break;
                case 4:
                    update();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Try choosing the options please");
                    break;
            }
        }
    }

    static void view(){
        System.out.println("\nPersons you've entered in the list: ");
        for(int x=0;x<name.size();x++){
            System.out.println(name.get(x)+" is "+ age.get(x)+" yr(s) old");
        }
    }
    static void update(){
        System.out.println("Enter index to update: ");
        int index = input.nextInt();
        System.out.println("Enter updated name: ");
        String updated = input.next();
        System.out.println("Enter updated age: ");
        int aage = input.nextInt();
        name.set(index,updated);
        age.set(index,aage);
        System.out.println("Input updated");

    }
    static void add(){
        System.out.println("Enter name: ");
        name.add(input.next());
        System.out.println("Enter the age: ");
        age.add(input.nextInt());
        System.out.println("Index added");
    }
    static void delete(){
        String remv;
        System.out.println("Enter name to remove: ");
        remv = input.next();
        if(name.contains(remv)) {
            name.remove(remv);
            System.out.println(remv + " has been deleted");
        }
        else {
            System.out.println("No " + remv + " in the list");
        }
    }
}


