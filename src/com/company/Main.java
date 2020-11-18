package com.company;

import java.io.FileNotFoundException;
import java.net.SocketException;

public class Main {
    public static void main(String[] args) {
        try {
            DoSomethingDangerous();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        }

    }
    public static void DoSomethingDangerous() throws FileNotFoundException, SocketException{
        RedFile("");
    }
    public static void RedFile(String Path) throws FileNotFoundException, SocketException{
        if (Path == null){
            throw new FileNotFoundException();
        }
        throw new SocketException();
    }
}
