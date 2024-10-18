/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.proyectoFinal.views;

import autonoma.proyectoFinal.models.Gerente;
import autonoma.proyectoFinal.models.Hospital;
import javax.swing.JOptionPane;


/**
 * Ventana principal que muestra la interfaz gráfica para gestionar
 * @author Mariana Salgado & Nicolas Fernando Medina
 * @version 1.0.0
 * @since 2024-10-18
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Hospital hospital;
    private Gerente gerente;
    
    public VentanaPrincipal(Gerente gerente,Hospital hospital) {
        this.hospital = hospital;
        this.gerente = gerente;
        initComponents();
        
    }
    
    public Hospital obtenerHospital() {
        return this.hospital; // Devuelve la instancia del hospital
    }
    
    public Gerente obtenerGerente() {
        return this.gerente; // Devuelve la instancia del hospital
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGestionPaciente = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnActualizarDatosHospital2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGestionEmpleado1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReportes = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnCitas = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnGestionMedicamentos1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        BtnActualizarDatosHospital = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/proyectoFinal/images/hospital icono.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnGestionPaciente.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGestionPacienteMouseClicked(evt);
            }
        });

        jLabel4.setText("Gestion Paciente");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/proyectoFinal/images/icons8-paciente-50.png"))); // NOI18N

        javax.swing.GroupLayout btnGestionPacienteLayout = new javax.swing.GroupLayout(btnGestionPaciente);
        btnGestionPaciente.setLayout(btnGestionPacienteLayout);
        btnGestionPacienteLayout.setHorizontalGroup(
            btnGestionPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGestionPacienteLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btnGestionPacienteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnGestionPacienteLayout.setVerticalGroup(
            btnGestionPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGestionPacienteLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        BtnActualizarDatosHospital2.setBackground(new java.awt.Color(255, 255, 255));
        BtnActualizarDatosHospital2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnActualizarDatosHospital2MouseClicked(evt);
            }
        });

        jLabel6.setText("Ver Historial Hospital");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/proyectoFinal/images/icons8-ver-48.png"))); // NOI18N

        javax.swing.GroupLayout BtnActualizarDatosHospital2Layout = new javax.swing.GroupLayout(BtnActualizarDatosHospital2);
        BtnActualizarDatosHospital2.setLayout(BtnActualizarDatosHospital2Layout);
        BtnActualizarDatosHospital2Layout.setHorizontalGroup(
            BtnActualizarDatosHospital2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnActualizarDatosHospital2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BtnActualizarDatosHospital2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BtnActualizarDatosHospital2Layout.setVerticalGroup(
            BtnActualizarDatosHospital2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnActualizarDatosHospital2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        btnGestionEmpleado1.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionEmpleado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGestionEmpleado1MouseClicked(evt);
            }
        });

        jLabel8.setText("Gestion Empleado");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/proyectoFinal/images/icons8-empleado-48.png"))); // NOI18N

        javax.swing.GroupLayout btnGestionEmpleado1Layout = new javax.swing.GroupLayout(btnGestionEmpleado1);
        btnGestionEmpleado1.setLayout(btnGestionEmpleado1Layout);
        btnGestionEmpleado1Layout.setHorizontalGroup(
            btnGestionEmpleado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGestionEmpleado1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnGestionEmpleado1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnGestionEmpleado1Layout.setVerticalGroup(
            btnGestionEmpleado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGestionEmpleado1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Direccion:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Telefono:");

        btnReportes.setBackground(new java.awt.Color(255, 255, 255));
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
        });

        jLabel10.setText("Reportes");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/proyectoFinal/images/icons8-noticias-50.png"))); // NOI18N

        javax.swing.GroupLayout btnReportesLayout = new javax.swing.GroupLayout(btnReportes);
        btnReportes.setLayout(btnReportesLayout);
        btnReportesLayout.setHorizontalGroup(
            btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReportesLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnReportesLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnReportesLayout.setVerticalGroup(
            btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReportesLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        btnCitas.setBackground(new java.awt.Color(255, 255, 255));
        btnCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCitasMouseClicked(evt);
            }
        });

        jLabel12.setText("    Citas");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/proyectoFinal/images/icons8-tear-off-calendar-48.png"))); // NOI18N

        javax.swing.GroupLayout btnCitasLayout = new javax.swing.GroupLayout(btnCitas);
        btnCitas.setLayout(btnCitasLayout);
        btnCitasLayout.setHorizontalGroup(
            btnCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCitasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(btnCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCitasLayout.setVerticalGroup(
            btnCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCitasLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        btnGestionMedicamentos1.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionMedicamentos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGestionMedicamentos1MouseClicked(evt);
            }
        });

        jLabel14.setText("Gestion Medicamentos");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/proyectoFinal/images/icons8-sobre-externo-de-medicamento-disponible-y-medicamentos-sin-receta-color-tal-revivo-48.png"))); // NOI18N

        javax.swing.GroupLayout btnGestionMedicamentos1Layout = new javax.swing.GroupLayout(btnGestionMedicamentos1);
        btnGestionMedicamentos1.setLayout(btnGestionMedicamentos1Layout);
        btnGestionMedicamentos1Layout.setHorizontalGroup(
            btnGestionMedicamentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGestionMedicamentos1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnGestionMedicamentos1Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnGestionMedicamentos1Layout.setVerticalGroup(
            btnGestionMedicamentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGestionMedicamentos1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        BtnActualizarDatosHospital.setBackground(new java.awt.Color(255, 255, 255));
        BtnActualizarDatosHospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnActualizarDatosHospitalMouseClicked(evt);
            }
        });

        jLabel16.setText("Actualizar Hospital");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/proyectoFinal/images/icons8-actualizar (2).gif"))); // NOI18N

        javax.swing.GroupLayout BtnActualizarDatosHospitalLayout = new javax.swing.GroupLayout(BtnActualizarDatosHospital);
        BtnActualizarDatosHospital.setLayout(BtnActualizarDatosHospitalLayout);
        BtnActualizarDatosHospitalLayout.setHorizontalGroup(
            BtnActualizarDatosHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnActualizarDatosHospitalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BtnActualizarDatosHospitalLayout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BtnActualizarDatosHospitalLayout.setVerticalGroup(
            BtnActualizarDatosHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnActualizarDatosHospitalLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnGestionEmpleado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnGestionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnGestionMedicamentos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(BtnActualizarDatosHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(BtnActualizarDatosHospital2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(80, 80, 80)
                        .addComponent(btnGestionEmpleado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGestionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGestionMedicamentos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnActualizarDatosHospital2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnActualizarDatosHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionPacienteMouseClicked
        
    }//GEN-LAST:event_btnGestionPacienteMouseClicked

    private void BtnActualizarDatosHospital2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnActualizarDatosHospital2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnActualizarDatosHospital2MouseClicked

    private void btnGestionEmpleado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionEmpleado1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionEmpleado1MouseClicked

    private void btnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesMouseClicked

    private void btnCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCitasMouseClicked

    private void btnGestionMedicamentos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionMedicamentos1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionMedicamentos1MouseClicked

    private void BtnActualizarDatosHospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnActualizarDatosHospitalMouseClicked
        Hospital hospitalActual = obtenerHospital();  
        Gerente gerenteActual = obtenerGerente();
        if (hospitalActual != null) {
            // Pasamos el hospital al constructor de la ventana de actualización
            ActualizarDatosHospital actualizarHospital = new ActualizarDatosHospital(gerenteActual,hospitalActual,this,true);
            actualizarHospital.setVisible(true);  // Mostramos la ventana
        } else {
            // Manejo de error si hospitalActual es null
            JOptionPane.showMessageDialog(this, "El hospital no está inicializado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnActualizarDatosHospitalMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnActualizarDatosHospital;
    private javax.swing.JPanel BtnActualizarDatosHospital2;
    private javax.swing.JPanel btnCitas;
    private javax.swing.JPanel btnGestionEmpleado1;
    private javax.swing.JPanel btnGestionMedicamentos1;
    private javax.swing.JPanel btnGestionPaciente;
    private javax.swing.JPanel btnReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
