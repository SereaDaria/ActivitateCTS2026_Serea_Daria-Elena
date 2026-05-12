package ro.ase.exercitii2.structurale.facade.main;

import ro.ase.exercitii2.structurale.facade.entity.FacadeRestaurant;

public class Main {
    public static void main(String[] args) {
        FacadeRestaurant facadeRestaurant = new FacadeRestaurant();
        System.out.println(facadeRestaurant.verificaDisponibilitateMasa(1));
        System.out.println(facadeRestaurant.verificaDisponibilitateMasa(4));
        System.out.println(facadeRestaurant.verificaDisponibilitateMasa(5));
        System.out.println(facadeRestaurant.verificaDisponibilitateMasa(7));
        System.out.println(facadeRestaurant.verificaDisponibilitateMasa(15));
    }
}
