import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import src.classes.Monster;

public class ArraysDemo {
    public static void main(String args[]){
        //Array list collection demo
        Set<Integer> collection = new TreeSet<Integer>();
        collection.add(6);
        collection.add(5);
        collection.add(54);
        collection.add(55);
        collection.add(58);

        Iterator<Integer> iterator = collection.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        for (int object : collection){
            System.out.println(object);
        }

        // MAP demo
        // Create Map array
        // formerly we had to add the type on the left side of the array : new HashMap<String, String>(); 
        // But now it is optionnal you can live the angle brackets empty, it is called diamond operator
        Map<String, String> students = new HashMap<>();
        //Asssign keys and values to the array
        students.put("John", "pass");
        students.put("Ava", "refused");
        students.put("Dehlia", "Escellent");
        students.put("Ixnay", "pass");
        // Can print the whole array
        System.out.println(students);
        // Reassign the array
        students.put("John", "refused");
        // Display a data from array specific key
        System.out.println(students.get("John"));
        // Get the keys from the array
        Set<String> keys = students.keySet();
        System.out.println(keys);
        // Loop on the keys
        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }
        // You can remove,get all values

        //Comparable and Comparator demo
        List<Integer> nums = new ArrayList<>();
        nums.add(5584);
        nums.add(4356);
        nums.add(3785);
        nums.add(625);
        System.out.println(nums);
        // Sort an array with Collections static method sort:
        Collections.sort(nums);
        System.out.println(nums);
        // change sorting method with Comparator
        // Like sorting with a cistom method to sort with last number
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10)
                {
                    return 1;
                }
                else if(o1%10 < o2%10)
                {
                    return -1;
                }
                else
                {
                    return 0;
                }
            }
        };
        Collections.sort(nums, comparator);
        System.out.println(nums);
        // Sort an Array of string with the length of the string
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Hi");
        strings.add("Hey");
        strings.add("Howdy");
        System.out.println(strings);
        // We can do it with a lambda expression
        Collections.sort(strings, (o1, o2) -> {
            if(o1.length() > o2.length())
            {
                return 1;
            }
            else if(o1.length() < o2.length())
            {
                return -1;
            }
            else
            {
                return 0;
            }
        });
        System.out.println(strings);
        // Get an ArrayList of monsters
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Monster("Zombie", 10, 2, 15, "Undead"));
        monsters.add(new Monster("Skeleton", 5, 1, 10, "Undead"));
        monsters.add(new Monster("Goblin", 3, 1, 5, "Humanoid"));
        monsters.add(new Monster("Orc", 7, 2, 10, "Humanoid"));
        monsters.add(new Monster("Troll", 15, 3, 20, "Humanoid"));
        monsters.add(new Monster("Dragon", 20, 5, 30, "Dragon"));
        System.out.println(monsters);
        // and iterate over it to display only the name and description
        for(Monster monster : monsters)
        {
            System.out.println(monster.getName() + " : " + monster.getDescription());
        }
        // Sort the monsters array by name with Comparator
        Comparator<Monster> monsterComparator = new Comparator<>() {
            @Override
            public int compare(Monster o1, Monster o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(monsters, monsterComparator);
        System.out.println(monsters);
        // Sort the monsters array with Monster method compareTo
        // Because the Monster class implements the Comparable interface
        // We can sort the array with the Collections static method sort
        Collections.sort(monsters);
        System.out.println(monsters);
    }
}
