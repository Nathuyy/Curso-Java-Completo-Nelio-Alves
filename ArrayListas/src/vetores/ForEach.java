package vetores;

public class ForEach {
    public static void main(String[] args) {
        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for(String pessoa : vect) { //tipo apelido : coleção
            System.out.println(pessoa);
        }
    }
}
