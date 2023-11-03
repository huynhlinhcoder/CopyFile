/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import common.Library;
import java.util.ArrayList;

/**
 *
 * @author huynh
 */
public abstract class Menu<T> {

    protected String title;
    protected ArrayList<T> mChon;
    Library l = new Library();

    public Menu() {
        mChon = new ArrayList<>();
    }

    public Menu(String td, String[] mc) {
        title = td;
        mChon = new ArrayList<>();
        for (String s : mc) {
            mChon.add((T) s);
        }
    }

    //-------------------------------------------
    public void display() {
        System.out.println(title);
    }
//-------------------------------------------

    public int getSelected() {
        display();
        return l.getInt("Enter your choice", 1, mChon.size() + 1);
    }
//-------------------------------------------

    public abstract void execute();
//-------------------------------------------

    public void run() {
            execute();
    }

}
