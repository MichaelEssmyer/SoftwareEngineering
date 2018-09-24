package com.java.michael.chesstutor;
import com.java.michael.chesstutor.Pieces;
import android.widget.ImageButton;

public class Player {
    private String[] move = new String [2];
    Player(String type){
        move[0] = "pick";
        move[1] = "place";

    }
    public String getMove(int a){
        return this.move[a];
    }
    public static void think(){

    }
}
