import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Set<Word> words = new TreeSet<Word>();
        for (int i = 0; i < N; i++) {
            words.add(new Word(sc.nextLine()));
        }
        Iterator<Word> iter = words.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
class Word implements Comparable<Word> {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public int getLength() {
        return word.length();
    }

    @Override
    public int compareTo(Word o1) {
        if (this.getLength() > o1.getLength()) {
            return 1;
        } else if (this.getLength() == o1.getLength()) {
            for (int i = 0; i < this.getLength(); i++) {
                if (word.charAt(i) > o1.word.charAt(i)) {
                    return 1;
                } else if (word.charAt(i) < o1.word.charAt(i)) {
                    return -1;
                }
            }
        } else return -1;
        return 0;
    }
    @Override
    public String toString() {
        return word;
    }
}