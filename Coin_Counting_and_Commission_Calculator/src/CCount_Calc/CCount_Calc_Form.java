/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CCount_Calc;

/**
 *
 * @author Mikey
 */
public class CCount_Calc_Form extends javax.swing.JFrame {

    /**
     * Creates new form Lab5Form
     */
    public CCount_Calc_Form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtDollarAmount = new javax.swing.JTextField();
        btnCalcCoinage = new javax.swing.JButton();
        txtQuarters = new javax.swing.JTextField();
        txtDimes = new javax.swing.JTextField();
        txtNickels = new javax.swing.JTextField();
        txtPennies = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtSalesAmount = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnReset2 = new javax.swing.JButton();
        lblCommission = new javax.swing.JLabel();
        lblSalesTax = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblCommissionPerc = new javax.swing.JLabel();
        lblCommissionClar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDollarAmount.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter dollar amount:"));

        btnCalcCoinage.setText("Calculate Coinage");
        btnCalcCoinage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcCoinageActionPerformed(evt);
            }
        });

        txtQuarters.setBorder(javax.swing.BorderFactory.createTitledBorder("Quarters"));

        txtDimes.setBorder(javax.swing.BorderFactory.createTitledBorder("Dimes"));

        txtNickels.setBorder(javax.swing.BorderFactory.createTitledBorder("Nickels"));

        txtPennies.setBorder(javax.swing.BorderFactory.createTitledBorder("Pennies"));

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtQuarters, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDimes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNickels, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcCoinage, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addComponent(txtPennies))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCalcCoinage)
                        .addComponent(btnReset))
                    .addComponent(txtDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPennies)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(txtQuarters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDimes)
                        .addComponent(txtNickels)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Coin Counter", jPanel1);

        txtSalesAmount.setBorder(javax.swing.BorderFactory.createTitledBorder("Sales Amount"));

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnReset2.setText("RESET");
        btnReset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset2ActionPerformed(evt);
            }
        });

        lblCommission.setForeground(new java.awt.Color(0, 0, 255));
        lblCommission.setBorder(javax.swing.BorderFactory.createTitledBorder("Commission Amount"));

        lblSalesTax.setBorder(javax.swing.BorderFactory.createTitledBorder("Sales Tax"));

        lblTotal.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));

        lblCommissionPerc.setBorder(javax.swing.BorderFactory.createTitledBorder("Commission %"));

        lblCommissionClar.setText("(included in sales amount)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSalesAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 82, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCommissionPerc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCommission, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSalesTax, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(lblCommissionClar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCalculate)
                        .addComponent(btnReset2))
                    .addComponent(txtSalesAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSalesTax, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCommissionPerc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCommission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCommissionClar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Commission Calculator", jPanel2);

        jLabel1.setText("Michael Knudsen");

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)
                        .addGap(110, 110, 110)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnExit))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0); 
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCalcCoinageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcCoinageActionPerformed
        // TODO add your handling code here:
        
        //validation for number entry; resets form if entry is not a numerical value
        
        boolean floatTest = (MyUtils.isFloat(txtDollarAmount.getText()));
        
        if (floatTest == false) {
            txtDollarAmount.setText(""); 
            txtDollarAmount.requestFocusInWindow();
        } else{
        
            float fmoneyValue = 0;
            int imoneyValue = 0; 
            final int[] coinageValues = {25, 10, 5, 1}; 
            int[] countOfCoins = new int[coinageValues.length]; 
            int i = 0;


       //get Dollar amount from form and make conversions needed for integer calculation and proper display
            float moneyValueDisplayed = Float.parseFloat(txtDollarAmount.getText()); 

            fmoneyValue = Float.parseFloat(txtDollarAmount.getText()) * 100;
            imoneyValue = (int)fmoneyValue; 

            //display the dollar amount as entered, before * 100 multiplication, and add a dollar sign before it
            
            //format the Dollar value displayed
            txtDollarAmount.setText(MyUtils.moneyFormatting(moneyValueDisplayed)); 


            //loop through the countOfCoins array 
            for (i = 0; i < coinageValues.length; i++) {
                countOfCoins[i] = imoneyValue/coinageValues[i];
                imoneyValue = imoneyValue - (countOfCoins[i] * coinageValues[i]);   
            }

            if (countOfCoins[0] == 1){
               txtQuarters.setText(countOfCoins[0] + " Quarter");  
            } else {
                txtQuarters.setText(countOfCoins[0] + " Quarters");
            }

            if(countOfCoins[1] == 1){
               txtDimes.setText(countOfCoins[1] + " Dime");  
            } else {
                txtDimes.setText(countOfCoins[1] + " Dimes");
            }

            if(countOfCoins[2] == 1){
               txtNickels.setText(countOfCoins[2] + " Nickel");  
            } else {
                txtNickels.setText(countOfCoins[2] + " Nickels");
            }

            if(countOfCoins[3] == 1){
               txtPennies.setText(countOfCoins[3] + " Penny");  
            } else {
                txtPennies.setText(countOfCoins[3] + " Pennies");
            }    
      }
    }//GEN-LAST:event_btnCalcCoinageActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtDollarAmount.setText(""); 
        txtQuarters.setText("");
        txtDimes.setText("");
        txtNickels.setText("");
        txtPennies.setText(""); 
        txtDollarAmount.requestFocusInWindow(); 
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        //test if input is a float
        
        //validation for number entry; resets form if entry is not a numerical value
        boolean numberTest = MyUtils.isFloat(txtSalesAmount.getText()); 
        if  (numberTest == false) {
          txtSalesAmount.setText(""); 
          txtSalesAmount.requestFocusInWindow();
        } else {
           float salesValue = Float.parseFloat(txtSalesAmount.getText()); 
        //txtSalesAmount.setText("$" + salesValue); Deprecated formatting for the Sales Amount output
 
            txtSalesAmount.setText(MyUtils.moneyFormatting(salesValue)); 

            float commissionCalc = (MyUtils.calcCommission(salesValue));

           String commissionPercValue[] = {"3%", "6%", "8%", "10%"}; 

            if (salesValue < 200) {
                lblCommissionPerc.setText(commissionPercValue[0]); 
            } else if (salesValue >= 200 && salesValue < 500) {
                lblCommissionPerc.setText(commissionPercValue[1]);
            } else if (salesValue >=500 && salesValue < 1000){
                lblCommissionPerc.setText(commissionPercValue[2]);
            } else {
                lblCommissionPerc.setText(commissionPercValue[3]);
            }

            String commissionOutput = MyUtils.moneyFormatting(commissionCalc);


            //Original if-then structure to format the dollar figure output; decided to split it off into the moneyFormatting method in MyUtils()

            /**if (commissionCalc < 10) {
                commissionOutput = MyUtils.formatNum(commissionCalc,"0.00");
            } else if (commissionCalc >= 10 && commissionCalc < 100){
                commissionOutput = MyUtils.formatNum(commissionCalc,"00.00");
            } else if (commissionCalc >= 100 && commissionCalc < 1000){
                commissionOutput = MyUtils.formatNum(commissionCalc, "000.00");
            } else if (commissionCalc >= 1000 && commissionCalc < 10000){
                commissionOutput = MyUtils.formatNum(commissionCalc, "0000.00"); 
            } else if (commissionCalc >= 10000 && commissionCalc < 100000) {
                commissionOutput = MyUtils.formatNum(commissionCalc, "00000.00"); 
            } else if (commissionCalc >= 100000 && commissionCalc < 1000000){
                commissionOutput = MyUtils.formatNum(commissionCalc, "000000.00");
            } else if (commissionCalc >= 1000000 && commissionCalc < 10000000){
                commissionOutput = MyUtils.formatNum(commissionCalc, "0000000.00");
            }**/

            lblCommission.setText(commissionOutput);

            float salesTax = MyUtils.calcSalesTax(salesValue);
            String salesTaxString = MyUtils.moneyFormatting(salesTax);

            //Original if-then structure to format the dollar figure output; decided to split it off into the moneyFormatting method in MyUtils()
            /**if (salesTax < 10) {
                salesTaxString = MyUtils.formatNum(salesTax,"0.00");
            } else if (salesTax >= 10 && salesTax < 100){
                salesTaxString = MyUtils.formatNum(salesTax,"00.00");
            } else if (salesTax >= 100 && salesTax < 1000){
                salesTaxString = MyUtils.formatNum(salesTax, "000.00");
            } else if (salesTax >= 1000 && salesTax < 10000){
                salesTaxString = MyUtils.formatNum(salesTax, "0000.00"); 
            } else if (salesTax >= 10000 && salesTax < 100000) {
                salesTaxString = MyUtils.formatNum(salesTax, "00000.00"); 
            } else if (salesTax >= 100000 && salesTax < 1000000){
                salesTaxString = MyUtils.formatNum(salesTax, "000000.00");
            } else if (salesTax >= 1000000 && salesTax < 10000000){
                salesTaxString = MyUtils.formatNum(salesTax, "0000000.00");
            }**/ 

            lblSalesTax.setText(salesTaxString); 

            float totalPrice = MyUtils.calcFinalPrice(salesValue, commissionCalc, salesTax);
            lblTotal.setText(MyUtils.moneyFormatting(totalPrice)); 
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnReset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset2ActionPerformed
        // TODO add your handling code here:
        txtSalesAmount.setText(""); 
        txtSalesAmount.requestFocusInWindow();
        lblCommission.setText(""); 
        lblCommissionPerc.setText("");
        lblSalesTax.setText(""); 
        lblTotal.setText(""); 
    }//GEN-LAST:event_btnReset2ActionPerformed

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
            java.util.logging.Logger.getLogger(CCount_Calc_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CCount_Calc_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CCount_Calc_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CCount_Calc_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CCount_Calc_Form().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcCoinage;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReset2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCommission;
    private javax.swing.JLabel lblCommissionClar;
    private javax.swing.JLabel lblCommissionPerc;
    private javax.swing.JLabel lblSalesTax;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtDimes;
    private javax.swing.JTextField txtDollarAmount;
    private javax.swing.JTextField txtNickels;
    private javax.swing.JTextField txtPennies;
    private javax.swing.JTextField txtQuarters;
    private javax.swing.JTextField txtSalesAmount;
    // End of variables declaration//GEN-END:variables
}
