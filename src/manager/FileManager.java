/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manager;

import common.Algorithm;
import common.Library;
import java.util.Scanner;
import view.Menu;

/**
 *
 * @author huynh
 */
public class FileManager extends Menu<String> {

    static Scanner sc = new Scanner(System.in);

    static String[] mc = {"coppy", "exit"};

    protected Library library;
    protected Algorithm al;

    public FileManager() {
        super("============ Coppy Program =========", mc);
        library = new Library();
        al = new Algorithm();
    }

    @Override
    public void execute() {
        al.readFileConfig();
    }
}