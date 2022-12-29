import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame extends JFrame implements ActionListener {
    public static JPanel bfPanel = new JPanel();
    JPanel atPanel = new JPanel();
    JPanel muPanel = new JPanel();
    JPanel noPanel = new JPanel();

    JButton[] buttons = new JButton[5];
    Color color = new Color(182, 199, 255);
    static Font font = new Font("맑은 고딕", Font.BOLD, 22);

    public frame() {
        //작업할 사진 놓을 패널 설정
        bfPanel.setBounds(80, 50, 600, 600);
        bfPanel.setBackground(Color.white);

        //작업 후 사진 놓을 패널 설정
        atPanel.setBounds(740, 50, 600, 600);
        atPanel.setBackground(Color.white);

        //메뉴 패널 설정
        muPanel.setBounds(80, 700, 1260, 100);
        muPanel.setBackground(Color.white);

        //의미없는 패널 추가
        noPanel.setBounds(0, 0, 0, 0);
        noPanel.setBackground(color);

        //메뉴에 넣을 버튼 설정
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setBackground(color);
            buttons[i].setBounds(30, 20, i * 120, 90);
            //buttons[i].setText("버튼이에용");
        }
        buttons[0].setText("파일 열기");
        buttons[1].setText("1");
        buttons[2].setText("2");
        buttons[3].setText("3");
        buttons[4].setText("4");

        for (int i = 0; i < buttons.length; i++) {
                buttons[i].setFont(font);
                muPanel.add(buttons[i]);
                buttons[i].addActionListener(this);
            }

            //bfPanel.add(new FileGet());

            //add(bfPanel);
            add(atPanel);
            add(muPanel);
            add(noPanel);

            //프레임 설정
            setBackground(Color.black);
            setLocation(230, 50);//frame 창 위치 설정
            setPreferredSize(new Dimension(1450, 900));//프레임 크기
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//끄기

            pack();
            setVisible(true);
        }
        @Override
        public void actionPerformed (ActionEvent e){
            if (e.getActionCommand() == "파일 열기") {
                FileOpen fileOpen = new FileOpen();
                System.out.println("되니?"+ FileOpen.path);
                add(bfPanel);
            }

        }
    }
