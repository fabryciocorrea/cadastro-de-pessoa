package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pessoa fabrycio = new Pessoa();
        Pessoa eduarda = new Pessoa();
        Pessoa fulana = new Pessoa();
        Pessoa ciclana = new Pessoa();
        List < Pessoa > usuariosCadastrados = new ArrayList<>();
        usuariosCadastrados.add(fabrycio);
        usuariosCadastrados.add(eduarda);
        usuariosCadastrados.add(fulana);
        usuariosCadastrados.add(ciclana);

        List <Float> temperaturas = new ArrayList<>();
        temperaturas.add(35.3f);
        temperaturas.add(37.5f);

        List <LocalDate> datas = new ArrayList<>();
        datas.add(LocalDate.of(2019,12,30));
        datas.add(LocalDate.of(2018,1,1));

        List <Integer> idades = new ArrayList<>();
        idades.add(22);
        idades.add(19);

        List <String> cidades = new ArrayList<>();
        cidades.add("Canoas");
        cidades.add("Cachoeirinha");
//        1 - Fabrycio
//        2 - joao
//        3 - maria
//        4 - teste


        fabrycio.setNome ("Fabrycio");
        fabrycio.setDataDeNascimento(LocalDate.of(1998,8,3));
        eduarda.setNome("Eduarda");
        eduarda.setDataDeNascimento(LocalDate.of(1985,10,12));
        fulana.setNome("Fulana");
        fulana.setDataDeNascimento(LocalDate.of(1983,10,22));
        ciclana.setNome("Ciclana");

        System.out.println("Dados da pessoa: ");
        System.out.println(fabrycio.getNome());
        System.out.println(eduarda.getNome());
        System.out.println(fulana.getNome());
        System.out.println(ciclana.getNome());
        System.out.println(usuariosCadastrados);
        System.out.println(fabrycio.getDataDeNascimento());
        System.out.println(eduarda.getDataDeNascimento());
        System.out.println(fulana.getDataDeNascimento());
        System.out.println(fabrycio.getAltura());
        System.out.println(eduarda.getAltura());
        System.out.println(fulana.getAltura());

        int idade = calcularIdade(eduarda.getDataDeNascimento());
        int idadeFabrycio = calcularIdade(fabrycio.getDataDeNascimento());
        System.out.println("Nome da pessoa: " + eduarda.getNome());
        System.out.println("Idade: " + idade);
        System.out.println("Nome da pessoa: " + fabrycio.getNome());
        System.out.println("Idade: " + idadeFabrycio);
        System.out.println("Nome da pessoa: " + fulana.getNome());
        System.out.println("Idade: " + calcularIdade(fulana.getDataDeNascimento()));
    }
    public static int calcularIdade(LocalDate dataDeNascimento){

        int ano = LocalDate.now().getYear();
        System.out.println("Ano atual: " + ano);

        int soma = ano - dataDeNascimento.getYear();
        return soma;
    }

}
