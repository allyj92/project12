package innerclass;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Quiz1 {
    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setLayout(new FlowLayout());
        frame.setBounds(500, 300, 500, 300);


        TextArea textArea = new TextArea();
        frame.add(textArea);


        myKeyListener keyListener = new myKeyListener();


        frame.addKeyListener(keyListener);


        frame.setVisible(true);


        textArea.requestFocus();
    }
}

class myKeyListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("키를 눌렀습니다!!");
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}