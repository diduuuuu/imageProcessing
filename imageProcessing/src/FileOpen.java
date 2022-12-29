import javafx.stage.Stage;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileOpen extends JFrame implements ActionListener{
    private JFileChooser fileComponent = new JFileChooser();
    private JButton btnOpen = new JButton("Open");
    //private JButton btnSave = new JButton("불러오기");
    private JLabel labelOpen = new JLabel(" ");
    private JLabel labelSave = new JLabel(" ");
    private Stage primaryStage;
    static String path = new String();
    public FileOpen(){
        this.init();
        this.start();
        this.setBounds(700,150,700, 500);
        this.setVisible(true);
    }
    public void init(){
        getContentPane().setLayout(new FlowLayout());
        add(btnOpen);
        //add(btnSave);
        add(labelOpen);
        //add(labelSave);
    }
    public void start(){
        btnOpen.addActionListener(this);
        //btnSave.addActionListener(this);
        fileComponent.setFileFilter(new FileNameExtensionFilter(".jpg", "png", "xls")); // 확장자 .xlsx, xls만 선택가
        fileComponent.setMultiSelectionEnabled(false); // 다중 선택 불가 설정
    }

    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == btnOpen){
            if(fileComponent.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
                path = fileComponent.getSelectedFile().toString();
                FileGet fileGet = new FileGet();
                frame.bfPanel.add(fileGet);

                System.out.println("야호");
                setVisible(false);
                //labelOpen.setText("열기 파일 경로 : " + fileComponent.getSelectedFile().toString());
            }
        }
//        else if(arg0.getSource() == btnSave){
//            if(fileComponent.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
//                //labelSave.setText("저장 파일 경로 : " + fileComponent.getSelectedFile().toString());
//
//            }
//        }
   }
}