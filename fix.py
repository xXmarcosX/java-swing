import re

with open('src/Views/CalculosJFrame.java', 'r', encoding='utf-8') as f:
    content = f.read()

# Replace block 1: the instantiations
decl_old = '''        jPanel6 = new javax.swing.JPanel();
        jLabelXA = new javax.swing.JLabel();
        InputXA = new javax.swing.JTextField();
        InputYA = new javax.swing.JTextField();
        jLabelXB = new javax.swing.JLabel();
        InputXB = new javax.swing.JTextField();
        InputYB = new javax.swing.JTextField();
        jLabelXC = new javax.swing.JLabel();
        InputXC = new javax.swing.JTextField();
        InputYC = new javax.swing.JTextField();
        jLabelEmpty1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();'''

decl_new = '''        jPanel6 = new javax.swing.JPanel();
        jLabelXA = new javax.swing.JLabel();
        InputXA = new javax.swing.JTextField();
        jLabelYA = new javax.swing.JLabel();
        InputYA = new javax.swing.JTextField();
        jLabelXB = new javax.swing.JLabel();
        InputXB = new javax.swing.JTextField();
        jLabelYB = new javax.swing.JLabel();
        InputYB = new javax.swing.JTextField();
        jLabelXC = new javax.swing.JLabel();
        InputXC = new javax.swing.JTextField();
        jLabelYC = new javax.swing.JLabel();
        InputYC = new javax.swing.JTextField();
        jLabelEmpty1 = new javax.swing.JLabel();
        btnCalcTrianguloGen = new javax.swing.JButton();'''

content = content.replace(decl_old, decl_new)

# Replace block 2: layout setup
layout_old = '''        jPanel6.setLayout(new java.awt.GridLayout(4, 3, 10, 10));

        jLabelXA.setText("Ponto A (x, y):");
        jPanel6.add(jLabelXA);
        jPanel6.add(InputXA);
        jPanel6.add(InputYA);

        jLabelXB.setText("Ponto B (x, y):");
        jPanel6.add(jLabelXB);
        jPanel6.add(InputXB);
        jPanel6.add(InputYB);

        jLabelXC.setText("Ponto C (x, y):");
        jPanel6.add(jLabelXC);
        jPanel6.add(InputXC);
        jPanel6.add(InputYC);
        jPanel6.add(jLabelEmpty1);

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5);'''

layout_new = '''        jPanel6.setLayout(new java.awt.GridLayout(7, 2, 10, 10));

        jLabelXA.setText("X de A:");
        jPanel6.add(jLabelXA);
        jPanel6.add(InputXA);

        jLabelYA.setText("Y de A:");
        jPanel6.add(jLabelYA);
        jPanel6.add(InputYA);

        jLabelXB.setText("X de B:");
        jPanel6.add(jLabelXB);
        jPanel6.add(InputXB);

        jLabelYB.setText("Y de B:");
        jPanel6.add(jLabelYB);
        jPanel6.add(InputYB);

        jLabelXC.setText("X de C:");
        jPanel6.add(jLabelXC);
        jPanel6.add(InputXC);

        jLabelYC.setText("Y de C:");
        jPanel6.add(jLabelYC);
        jPanel6.add(InputYC);

        jPanel6.add(jLabelEmpty1);
        btnCalcTrianguloGen.setText("Calcular");
        btnCalcTrianguloGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcTrianguloGenActionPerformed(evt);
            }
        });
        jPanel6.add(btnCalcTrianguloGen);'''

content = content.replace(layout_old, layout_new)

# Add variables to bottom declarations
var_block = '''    private javax.swing.JLabel jLabelXA;
    private javax.swing.JLabel jLabelXB;
    private javax.swing.JLabel jLabelXC;'''
var_new = '''    private javax.swing.JButton btnCalcTrianguloGen;
    private javax.swing.JLabel jLabelXA;
    private javax.swing.JLabel jLabelXB;
    private javax.swing.JLabel jLabelXC;
    private javax.swing.JLabel jLabelYA;
    private javax.swing.JLabel jLabelYB;
    private javax.swing.JLabel jLabelYC;'''
content = content.replace(var_block, var_new)

with open('src/Views/CalculosJFrame.java', 'w', encoding='utf-8') as f:
    f.write(content)

print("done")
