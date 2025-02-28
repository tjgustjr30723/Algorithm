import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        List<User> list = new LinkedList<User>();
        for (int i = 0; i < N; i++) {
            list.add(new User(sc.nextInt(), sc.nextLine()));
        }
        Collections.sort(list);
        for (User l : list) {
            System.out.println(l);
        }
    }
}
class User implements Comparable<User> {
    private int age;
    private String name;

    public User(int age, String word) {
        this.age = age;
        this.name = word;
    }

    @Override
    public int compareTo(User o1) {
        return this.age != o1.age ? this.age - o1.age : 0;
    }

    @Override
    public String toString() {
        return age + name;
    }
}