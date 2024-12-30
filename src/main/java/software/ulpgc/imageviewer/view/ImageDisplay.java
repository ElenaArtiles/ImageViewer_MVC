package software.ulpgc.imageviewer.view;

import software.ulpgc.imageviewer.model.Image;

import java.awt.*;

public interface ImageDisplay {
    void show(Image image);
    Image image();
    void paint(Graphics g);
}
