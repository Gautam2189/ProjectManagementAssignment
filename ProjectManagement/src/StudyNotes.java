
public class StudyNotes extends javax.swing.JFrame {

    private StudyQuiz otherWindow;
    public StudyNotes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStudy2 = new javax.swing.JButton();
        btnStudy1 = new javax.swing.JButton();
        btnStudy3 = new javax.swing.JButton();
        btnStudy4 = new javax.swing.JButton();
        btnStudy5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDisplay = new javax.swing.JTextArea();
        btnQuiz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnStudy2.setText("How to measure success.");
        btnStudy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudy2ActionPerformed(evt);
            }
        });

        btnStudy1.setText("What is a System?");
        btnStudy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudy1ActionPerformed(evt);
            }
        });

        btnStudy3.setText("The Software Development Process (SDLC)");
        btnStudy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudy3ActionPerformed(evt);
            }
        });

        btnStudy4.setText("Waterfall Model");
        btnStudy4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudy4ActionPerformed(evt);
            }
        });

        btnStudy5.setText("Gantt Chart");
        btnStudy5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudy5ActionPerformed(evt);
            }
        });

        txtDisplay.setColumns(20);
        txtDisplay.setRows(5);
        jScrollPane1.setViewportView(txtDisplay);

        btnQuiz.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnQuiz.setForeground(new java.awt.Color(255, 0, 102));
        btnQuiz.setText("QUIZ ME!!");
        btnQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStudy1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStudy2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStudy4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStudy5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(btnStudy3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQuiz)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnStudy3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStudy2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStudy1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnStudy5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStudy4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizActionPerformed
        if(otherWindow == null){
            otherWindow = new StudyQuiz(this);
        }
        otherWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQuizActionPerformed

    private void btnStudy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudy1ActionPerformed
        txtDisplay.setText("System:\nIs a combination of software and hardware that provides a solution for a buissness problem.\nA system involves the client, analysts, designers/developers, testers, users and others(laweyrs, communication specialists)");
    }//GEN-LAST:event_btnStudy1ActionPerformed

    private void btnStudy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudy2ActionPerformed
        txtDisplay.setText("Success may be measured by answering the following questions:\nDoes the project solve what it was meant to solve?\nIs it easy to maintain and administer?\nIs it scalable to meet the needs of the client?\nIs there a successfull support system in place for the client?\nWas it delivered on time and ready to go?\nWas the client happy with the end product?");
    }//GEN-LAST:event_btnStudy2ActionPerformed

    private void btnStudy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudy3ActionPerformed
        txtDisplay.setText("The Software Development Process:\nCreating high-quality software involves organization involves organization, planning and utilizing various diagrammatic  conventions.\nComputer scientists have created a view of the software development process known as the 'software development life cycle'(SDLC)\nOne method is known as the 'waterfall method'\n \tA mistake made in one phase often requires the developer to backup and redo some of the work in the previous phase.");
    }//GEN-LAST:event_btnStudy3ActionPerformed

    private void btnStudy4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudy4ActionPerformed
        txtDisplay.setText("Developed by Dr. Winston Royce in 1970 based on his experience developing software for spacecraft mission planning.\nThe Waterfall Model consists of several phases:\n\tProblem Statement\n\tAnalysis\n\tDesign\n\tImplementiation\n\tIntegration/Test\n\tMaintenance");
    }//GEN-LAST:event_btnStudy4ActionPerformed

    private void btnStudy5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudy5ActionPerformed
        txtDisplay.setText("Developed by mechanical engineer Henry Gantt in the 1910's\nToop typically used by people working on a large project\n\tHooverDam\n\tEisenhower National Defense\n\tInterstate Highway System\nHelps project managers to visualize, schedule, and track scheduled as well as actual progress of projects");
    }//GEN-LAST:event_btnStudy5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudyNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudyNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudyNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudyNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudyNotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuiz;
    private javax.swing.JButton btnStudy1;
    private javax.swing.JButton btnStudy2;
    private javax.swing.JButton btnStudy3;
    private javax.swing.JButton btnStudy4;
    private javax.swing.JButton btnStudy5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDisplay;
    // End of variables declaration//GEN-END:variables
}
