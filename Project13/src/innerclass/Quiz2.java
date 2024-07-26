package innerclass;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Quiz2 {
    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setLayout(new FlowLayout());
        frame.setBounds(500, 300, 500, 300);



        TextArea textArea = new TextArea("텍스트상자",10,50);
        frame.add(textArea);

        frame.setVisible(true);

        textArea.addFocusListener(new MyFocusListener1()); //

    }
}


// MyFocusListener 자식 클래스 == > 부모클래스 FocusListener 구현체
class MyFocusListener implements FocusListener{
    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("포커스 되었습니다..!");
    }

    @Override
    public void focusLost(FocusEvent e) {
        System.out.println("포커스가 벗어났습니다..!");
    }
}

class MyFocusListener1 implements FocusListener{
    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("포커스 되었습니다..~~~~~~");
    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}