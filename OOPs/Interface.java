// package OOPs;

// public class Interface {
// public static void main(String[] args) {
// Bear b1 = new Bear();
// b1.eats();
// b1.graze();
// b1.hunt();

// }
// }

// interface ChessPlayer {
// void moves();
// }

// class Queen implements ChessPlayer {
// // should implement the method of interface
// // and should have public access modifier
// public void moves() {
// System.out.println("moves in all direction");
// }
// }

// class Horse implements ChessPlayer {

// public void moves() {
// System.out.println("moves in L type");
// }
// }

// class Pawn implements ChessPlayer {

// public void moves() {
// System.out.println("moves only one block and 2 at start");
// }
// }

// // multiple inheritance using interface
// interface Herbivore {
// void eats();

// void graze();
// }

// interface Carnivore {
// void eats();

// void hunt();
// }

// class Bear implements Herbivore, Carnivore {
// public void eats() {
// System.out.println("both carnivores and herbivore");
// }

// public void graze() {
// System.out.println("eat berry");
// }

// public void hunt() {
// System.out.println("hunt salmon");
// }
// }