package OOPs_revise.one;

public class Interface {

    public static void main(String args[]) {
        Pawn p = new Pawn();
        p.moves();
    }

}

interface Chessplayer {
    void moves();
}

class Rook implements Chessplayer {
    public void moves() {
        System.out.println("moves straight in all direction");
    }
}

class Pawn implements Chessplayer {
    public void moves() {
        System.out.println("moves 1 or 2 step only forward");
    }
}

class Queen implements Chessplayer {
    public void moves() {
        System.out.println("moves straight or diagonal in all direction");
    }
}