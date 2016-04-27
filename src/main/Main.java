package main;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    Collection c;

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
        c = new HashSet();
        try {
            int k = read("file.txt");
            System.out.println("Прочитано строк: " + k);
            System.out.println(c.contains("firstwefwe"));
            System.out.println("-------------------------");
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            System.out.println("--------------------------");
            for (Object ob : c) {
                System.out.println(ob);
            }
            System.out.println("---------------------------");
            Set<Person> persons = new HashSet<>();
            persons.add(new Person(1,"Ivanov",25));
            persons.add(new Person(2,"Petrov",15));
            persons.add(new Person(3,"Petrovsky",35));
            for (Person p : persons) {
                System.out.println(p);
            }
            System.out.println("-------------------");
            Queue<Integer> queue = new PriorityQueue<>();
            queue.addAll(Arrays.asList(5,6,2,9,0,-4,1,7));
            while (!queue.isEmpty()) {
                System.out.print(queue.poll() + " ");
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int read(String filename) throws IOException {
        Scanner in = new Scanner(new File(filename), "utf8");
//        Scanner in = new Scanner(System.in);
        int read = 0;
        while (in.hasNext()) {
            read++;
            c.add(in.next());
        }
        return read;
    }

}
