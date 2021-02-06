package javabasic;


import java.util.*;

/**
 * Java util中包含集合类Collections，主要实现了常用的三大集合类型：List set map类型；
 * set：一伙，一团，不相同但是类似；
 */
public class JavaCollectionType {
    public static void main(String arg[]) {
        List<String> nameList = new ArrayList<String>();
        nameList.add("sunrong");
        nameList.add("wang");
        for (String s : nameList) {
            System.out.println(s);
        }
        List<String> nameLinked = new LinkedList<String>();
        nameLinked.add("sunrong2");
        nameLinked.add("wang2");
        for (String s : nameLinked) {
            System.out.println(s);
        }

        Map<String, String> stringMap = new HashMap<String, String>();
        Set<String> setNames = new HashSet<String>();

    }
}

class Student {
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

}
