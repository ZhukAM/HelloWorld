package mypackage;
import java.util.*;

/**
 * Created by Aleksandr Zhuk on 19.12.16.
 */

public class ImportFromNet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = in.nextLine();
        System.out.print("Input your age: ");
        int age = in.nextInt();
        StringBuilder strbld = new StringBuilder("My name");
        strbld.append(":");
        strbld.append(" ");
        strbld.append(name);
        strbld.append(", ");
        strbld.append("My age: ");
        strbld.append(age + " ");
        strbld.append(new Date());
        //strbld.delete(0, 10);
        //strbld.deleteCharAt(5);
        strbld.reverse();
        System.out.println(strbld);
        System.out.println("Your name: " + name + " Your age: " + age);
    }
}





