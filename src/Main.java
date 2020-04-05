import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static ArrayList<Person> inputData() {
        Person person1 = new Person("Thinh Bui", "male", "1995");
        Person person2 = new Person("Kim Anh ", "female", "1997");
        Person person3 = new Person("Thanh Tran", "male", "1998");
        Person person4 = new Person("Kim Cuong", "female", "1999");
        Person person5 = new Person("Giang Hoang", "male", "2001");
        Person person6 = new Person("Uyên Pu", "female", "2002");

        ArrayList<Person> listPerson = new ArrayList<Person>();
        listPerson.add(person1);
        listPerson.add(person2);
        listPerson.add(person3);
        listPerson.add(person4);
        listPerson.add(person5);
        listPerson.add(person6);

        return listPerson;
    }

    private static ArrayList<Person> classify(Queue<Person> malePerson, Queue<Person> femalePerson) {
        ArrayList<Person> newListPerson = new ArrayList<>();
        for (Person value : femalePerson) {
            newListPerson.add(value);
        }

        for (Person value : malePerson) {
            newListPerson.add(value);
        }
        return newListPerson;
    }

    private static void processOldList(Queue<Person> maleQueue, Queue<Person> femaleQueue, ArrayList<Person> listPerson) {
        for (int i = 0; i < listPerson.size(); i++) {
            Person holder = listPerson.get(i);
            if (holder.getGender().equals("male")) {
                maleQueue.add(holder);
            } else femaleQueue.add(holder);
        }
    }

    private static void showList(ArrayList<Person> listPerson) {
        System.out.println("===LIST===");
        System.out.printf("%-18s%-13s%-5S\n", "Name", "Gender", "DOB");
        for (int i = 0; i < listPerson.size(); i++) {
            Person holder = listPerson.get(i);
            holder.display();
        }
    }

    public static void main(String[] args) {
        Queue<Person> maleQueue = new LinkedList<>();
        Queue<Person> femaleQueue = new LinkedList<>();
        ArrayList<Person> listPerson = inputData();
        showList(listPerson);
        processOldList(maleQueue, femaleQueue, listPerson);
        ArrayList<Person> newListPerson = classify(maleQueue, femaleQueue);
        showList(newListPerson);
    }
}



