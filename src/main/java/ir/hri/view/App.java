package ir.hri.view;

import ir.hri.bl.Image;
import ir.hri.bl.Impl.ProxyImage;

public class App {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println();

        //image will not be loaded from disk
        image.display();
    }
}
