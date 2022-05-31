/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoccerManagementModel;

/**
 *
 * @author quochung
 */
public class Club {
    String name;
    String nameCaptain;
    int numPlayer;

    public Club() {
    }

    public Club(String name, String nameCaptain, int numPlayer) {
        this.name = name;
        this.nameCaptain = nameCaptain;
        this.numPlayer = numPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCaptain() {
        return nameCaptain;
    }

    public void setNameCaptain(String nameCaptain) {
        this.nameCaptain = nameCaptain;
    }

    public int getNumPlayer() {
        return numPlayer;
    }

    public void setNumPlayer(int numPlayer) {
        this.numPlayer = numPlayer;
    }
    
    
    
}
