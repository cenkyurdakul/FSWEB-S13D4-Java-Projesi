package com.workintech.model;

public class PlayerMain {
    public static void main(String[] args) {
        Player player1 = new Player("Cenk", 100,Weapon.MACE);
        System.out.println(player1);
        player1.loseHealth(80);
        System.out.println(player1);
        player1.restoreHealth(20);
        System.out.println(player1);
        player1.loseHealth(50);
        System.out.println(player1);

    }
}
