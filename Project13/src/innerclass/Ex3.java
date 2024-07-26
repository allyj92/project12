package innerclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex3 {
    public static void main(String[] args) {

        // 1. 화면 만들기
        Frame frame = new Frame(); // 프레임 선언
        frame.setLayout(new FlowLayout());
        frame.setBounds(500, 300, 500, 300); // X좌표, Y좌표, 넓이, 높이
        frame.setVisible(true);// setVisible(true)를 해 줘야 눈으로 확인 가능
        Button button = new Button("Click"); // 버튼 이름
        frame.add(button);

        // 미리 구현한 클래스로 이벤트 등록
//        button.addActionListener(new EventHandler());
        // 익명클래스를 만들고, 자식클래스를 바로 생성
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼을 클릭했습니다!!!!!");
            }
        });
    }
}

class EventHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("버튼을 클릭했습니다!");
    }
}
