
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class StudyQuiz extends javax.swing.JFrame {
    StudyNotes firstWindow;
    
    public StudyQuiz(StudyNotes m) {
        initComponents();
        firstWindow = m;
    }
    public String[] readQuestion(String arr[]) {
        try {
            File f = new File("src\\questions");
            Scanner s = new Scanner(f);
            int i = 0;
            while (s.hasNextLine()) {
                arr[i] = s.nextLine();
                i++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error " + e);
        }
        return arr;
    }
    public String[] readAnswer(String arr[]) {
        try {
            File f = new File("src\\Answers");
            Scanner s = new Scanner(f);
            int i = 0;
            while (s.hasNextLine()) {
                arr[i] = s.nextLine();
                i++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error " + e);
        }
        return arr;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        options = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jText = new javax.swing.JTextArea();
        option4 = new javax.swing.JRadioButton();
        option1 = new javax.swing.JRadioButton();
        option2 = new javax.swing.JRadioButton();
        option3 = new javax.swing.JRadioButton();
        btnStart = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jText.setEditable(false);
        jText.setColumns(20);
        jText.setRows(5);
        jScrollPane1.setViewportView(jText);

        options.add(option4);
        option4.setText("Option4");

        options.add(option1);
        option1.setText("Option1");

        options.add(option2);
        option2.setText("Option2");

        options.add(option3);
        option3.setText("Option3");

        btnStart.setText("Start Quiz");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnGoBack.setText("Go BACK!");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(option3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(option4, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(option1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStart))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(409, 409, 409)
                    .addComponent(btnGoBack)
                    .addContainerGap(469, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(option1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(option3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(option4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(588, Short.MAX_VALUE)
                    .addComponent(btnGoBack)
                    .addGap(18, 18, 18)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        btnStart.setText("Select");
        readQuestion(questions);
        readAnswer(answers);
        
        Questions q = new Questions(questions);
        if(counter == 1){
            jText.setText(q.getQuestion(1));
            option1.setText(answers[0]);
            option2.setText(answers[1]);
            option3.setText(answers[2]);
            option4.setText(answers[3]);
            if(option1.isSelected()){
                
            }
            
        }
        if(counter == 2){
            jText.setText(q.getQuestion(2));
            option1.setText(answers[4]);
            option2.setText(answers[5]);
            option3.setText(answers[6]);
            option4.setText(answers[7]);
        }   
        if(counter == 3){
            jText.setText(q.getQuestion(3));
            option1.setText(answers[8]);
            option2.setText(answers[9]);
            option3.setText(answers[10]);
            option4.setText(answers[11]);
        }
        if(counter == 4){
            jText.setText(q.getQuestion(4));
            option1.setText(answers[12]);
            option2.setText(answers[13]);
            option3.setText(answers[14]);
            option4.setText(answers[15]);
        }
        if(counter == 5){
            jText.setText(q.getQuestion(5));
            option1.setText(answers[16]);
            option2.setText(answers[17]);
            option3.setText(answers[18]);
            option4.setText(answers[19]);
        }
        if(counter == 6){
            jText.setText(q.getQuestion(6));
            option1.setText(answers[20]);
            option2.setText(answers[21]);
            option3.setText(answers[22]);
            option4.setText(answers[23]);
        }
        if(counter == 7){
            jText.setText(q.getQuestion(7));
            option1.setText(answers[24]);
            option2.setText(answers[25]);
            option3.setText(answers[26]);
            option4.setText(answers[27]);
        }
        if(counter == 8){
            jText.setText(q.getQuestion(8));
            option1.setText(answers[28]);
            option2.setText(answers[29]);
            option3.setText(answers[30]);
            option4.setText(answers[31]);
        }
        if(counter == 9){
            jText.setText(q.getQuestion(9));
            option1.setText(answers[32]);
            option2.setText(answers[33]);
            option3.setText(answers[34]);
            option4.setText(answers[35]);
        }
        if(counter == 10){
            jText.setText(q.getQuestion(10));
            option1.setText(answers[36]);
            option2.setText(answers[37]);
            option3.setText(answers[38]);
            option4.setText(answers[39]);
        }
        counter++;
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        firstWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGoBackActionPerformed
    
    static int counter = 1;
    static String questions[] = new String[10];
    static String answers[] = new String[39];
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnStart;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jText;
    private javax.swing.JRadioButton option1;
    private javax.swing.JRadioButton option2;
    private javax.swing.JRadioButton option3;
    private javax.swing.JRadioButton option4;
    private javax.swing.ButtonGroup options;
    // End of variables declaration//GEN-END:variables
}
