package listas;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // nao aceita tipos primitivos

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco");        //inserir um elemento entre o alex e o bob (na posição 2)

        System.out.println(list.size());

        list.remove("Ana");
        list.remove(1);
//        list.removeIf(pessoa -> pessoa.charAt(0) == 'M'); //predicado - vai remover todo mundo que começa com a inicial M


        for (String pessoa : list) {
            System.out.println(pessoa);
        }

        System.out.println("index of bob: " + list.indexOf("Bob"));
        System.out.println("index of bob: " + list.indexOf("Marco")); //quando nao acha o elemento vai retornar -1








    }
}
