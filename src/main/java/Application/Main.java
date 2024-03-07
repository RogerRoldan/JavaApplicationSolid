package Application;

import Models.Departamento;
import Models.ListaObjetosInformacion;
import Persistence.Seed;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        ListaObjetosInformacion lista = new ListaObjetosInformacion();
//
//        //Print all the departments
//        List<Departamento> departamentos = lista.Cargar("departments.txt", Departamento.class);
//
//        for (Departamento departamento : departamentos) {
//            System.out.println(departamento.getId() + " " + departamento.getNombre());
//        }

        Seed seed = new Seed();
        seed.Execute();


        System.out.println("Hello world!");
    }
}
