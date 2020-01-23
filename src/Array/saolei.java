package Array;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Saolei extends JFrame{

    final int ROW = 20;
    final int COL = 20;
    final int LEI = 30;
    JButton[][] buttons = new JButton[ROW][COL];
    int[][] counts = new int[ROW][COL];
    final int LCODE = 11; //雷的编码

    Container container = new Container();

    public Saolei() {
        init();


    }

    private void init() {
        JButton restBtn = new JButton("重来");
        restBtn.setOpaque(true);
        restBtn.setBackground(Color.PINK);
        restBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i<ROW;i++) {
                    for(int j=0;j<COL;j++) {
                        buttons[i][j].setText("");
                        buttons[i][j].setEnabled(true);
                        buttons[i][j].setBackground(Color.YELLOW);
                        counts[i][j] = 0;

                    }
                }
                mailei();
                jslsl();
            }
        });


        setLayout(new BorderLayout());
        add(restBtn,BorderLayout.NORTH);
        add(container,BorderLayout.CENTER);
        container.setLayout(new GridLayout(ROW,COL));
        for(int i=0;i<ROW;i++) {
            for(int j=0;j<COL;j++) {
                JButton button = new JButton();
                button.setMargin(new Insets(0, 0, 0, 0));
                button.setBackground(Color.YELLOW);
                button.setOpaque(true);
                buttons[i][j] = button;
                button.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton button = (JButton) e.getSource();
                        if(button.equals(restBtn)) {

                        }else {
                            int count = 0;
                            for(int i=0;i<ROW;i++) {
                                for(int j=0;j<COL;j++) {
                                    if(button.equals(buttons[i][j])) {
                                        count = counts[i][j];
                                        //踩到雷了
                                        if(count == LEI) {
                                            clcl();
                                        }else {
                                            openCell(i,j);
                                            checkWin();
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                    }

                    private void checkWin() {
                        for(int i=0;i<ROW;i++) {
                            for(int j=0;j<COL;j++) {
                                //说明还没有赢
                                if(buttons[i][j].isEnabled() == true && counts[i][j] != LEI) {
                                    return;
                                }
                            }
                        }

                        JOptionPane.showMessageDialog(container, "恭喜您赢了...");

                    }

                    private void openCell(int i,int j ) {

                        //如果格子已经打开，直接返回
                        if(buttons[i][j].isEnabled() == false) {
                            return ;
                        }

                        buttons[i][j].setText(counts[i][j]+"");
                        buttons[i][j].setEnabled(false);
                        buttons[i][j].setBackground(Color.CYAN);

                        if(counts[i][j] == 0) {
                            //左上角
                            if(i > 0 && j > 0 && counts[i-1][j-1] != LEI) {
                                openCell(i-1, j-1);
                            }

                            if(i > 0 && j > 0  && counts[i-1][j] != LEI) {
                                openCell(i-1, j);
                            }

                            if(i > 0 && j < 19  && counts[i-1][j+1] != LEI) {
                                openCell(i-1, j+1);
                            }

                            if(i > 0 && j > 0  && counts[i][j-1] != LEI) {
                                openCell(i, j-1);
                            }

                            if(i > 0 && j < 19  && counts[i][j+1] != LEI) {
                                openCell(i, j+1);
                            }

                            if(i < 19 && j > 0  && counts[i+1][j-1] != LEI) {
                                openCell(i+1, j-1);
                            }

                            if(i < 19 && j > 0 && counts[i+1][j] != LEI) {
                                openCell(i+1, j);
                            }

                            if(i < 19 && j < 19  && counts[i+1][j+1] != LEI) {
                                openCell(i+1, j+1);
                            }
                        }else {
                            buttons[i][j].setText(counts[i][j]+"");
                        }
                    }


                });
                container.add(button);
            }
        }
        mailei();
        //计算周边的雷的数量
        jslsl();

        setVisible(true);
        setTitle("扫雷游戏");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,700);
    }

    private void jslsl() {
        for(int i=0;i<ROW;i++) {
            for(int j=0;j<COL;j++) {
                int count = 0;
                if(counts[i][j] == LEI) {
                    continue;
                }

                //左上角
                if(i > 0 && j > 0 && counts[i-1][j-1] == LEI) {
                    count++;
                }

                if(i > 0 && j > 0  && counts[i-1][j] == LEI) {
                    count++;
                }

                if(i > 0 && j < 19  && counts[i-1][j+1] == LEI) {
                    count++;
                }

                if(i > 0 && j > 0  && counts[i][j-1] == LEI) {
                    count++;
                }

                if(i > 0 && j < 19  && counts[i][j+1] == LEI) {
                    count++;
                }

                if(i < 19 && j > 0  && counts[i+1][j-1] == LEI) {
                    count++;
                }

                if(i < 19 && j > 0 && counts[i+1][j] == LEI) {
                    count++;
                }

                if(i < 19 && j < 19  && counts[i+1][j+1] == LEI) {
                    count++;
                }

                counts[i][j] = count;
//                buttons[i][j].setText(counts[i][j]+" ");

            }
        }
    }

    private void clcl() {
        for(int i=0;i<ROW;i++) {
            for(int j=0;j<COL;j++) {
                int c = counts[i][j];
                if(c == LEI) {
                    buttons[i][j].setText("X");
                    buttons[i][j].setBackground(Color.RED);
                    buttons[i][j].setEnabled(false);
                }else {
                    buttons[i][j].setText(c+"");
                    buttons[i][j].setEnabled(false);
                }
            }
        }
    }

    private void mailei() {
        Random random = new Random();
        int randRow,randCol;
        for(int i=0;i<LEI;i++) {
            randRow = random.nextInt(ROW);
            randCol = random.nextInt(COL);
            if(counts[randRow][randCol] == LEI) {
                i--;
            }else {
                counts[randRow][randCol] = LEI;
//                buttons[randRow][randCol].setText(LEI+"");
            }
        }
    }


    public static void main(String[] args) {
        new Saolei();
    }

}
