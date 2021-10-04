
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Homepage2 extends javax.swing.JFrame {
int xx,yy;    // drag screen locate points
JFrame frame;
Set<String> ts;

public Homepage2() {
        initComponents();
     
        Homepane.setVisible(true);
        CmpPane.setVisible(false);
        DrvPane.setVisible(false);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        RegDrvPane.setVisible(false);
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(false);
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(false);
        DrvTripPane.setVisible(false);
        CmpTripViewPane.setVisible(false);
        CmpTripPane.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContainerPane = new javax.swing.JPanel();
        Dashbar = new javax.swing.JPanel();
        dashpane = new javax.swing.JPanel();
        BharatLab = new javax.swing.JLabel();
        DashboardLab = new javax.swing.JLabel();
        MinimizeLab = new javax.swing.JLabel();
        CloseLab = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        pp1 = new javax.swing.JPanel();
        MyDriversLab = new javax.swing.JLabel();
        pp2 = new javax.swing.JPanel();
        MyCmpsLab = new javax.swing.JLabel();
        pp3 = new javax.swing.JPanel();
        DailyEntryLab = new javax.swing.JLabel();
        pp4 = new javax.swing.JPanel();
        DriverBusinessLab = new javax.swing.JLabel();
        pp5 = new javax.swing.JPanel();
        CompanyBillsLab = new javax.swing.JLabel();
        pan_centre = new javax.swing.JPanel();
        Homepane = new javax.swing.JPanel();
        TruckImg = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        DrvPane = new javax.swing.JPanel();
        ViewDrvLab = new javax.swing.JLabel();
        RegisterDrvLab = new javax.swing.JLabel();
        DelDrvLab = new javax.swing.JLabel();
        DeleteDrvButton = new javax.swing.JButton();
        RegisterDrvButton = new javax.swing.JButton();
        ViewDrvButton = new javax.swing.JButton();
        CmpPane = new javax.swing.JPanel();
        ViewCmpLab = new javax.swing.JLabel();
        RegisterCmpLab = new javax.swing.JLabel();
        DelCmpLab = new javax.swing.JLabel();
        DelCmpButton = new javax.swing.JButton();
        RegCmpButton = new javax.swing.JButton();
        ViewCmpButton = new javax.swing.JButton();
        DailyEntryPane = new javax.swing.JPanel();
        EntryparticularsLab = new javax.swing.JLabel();
        EntryCmpLab = new javax.swing.JLabel();
        EntryChallanLAb = new javax.swing.JLabel();
        EntryVnoLab = new javax.swing.JLabel();
        EntryDrvLabel = new javax.swing.JLabel();
        EntryAmtLab = new javax.swing.JLabel();
        EntryBnameLab = new javax.swing.JLabel();
        com = new javax.swing.JTextField();
        par = new javax.swing.JTextField();
        ch = new javax.swing.JTextField();
        vname = new javax.swing.JTextField();
        drv = new javax.swing.JTextField();
        amt = new javax.swing.JTextField();
        vno = new javax.swing.JTextField();
        EntryDateLabel = new javax.swing.JLabel();
        EntrySaveButton = new javax.swing.JButton();
        d1 = new com.toedter.calendar.JDateChooser();
        DrvView = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JlistDrv = new javax.swing.JList<>();
        BackFromDrvListButton = new javax.swing.JButton();
        PhnoLabDrvView = new javax.swing.JLabel();
        NameLABDrvView = new javax.swing.JLabel();
        SetTextBoxDrvNo = new javax.swing.JLabel();
        SetTextboxDrvName = new javax.swing.JLabel();
        RegDrvPane = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DrvNoTB = new javax.swing.JTextField();
        DrvNameTB = new javax.swing.JTextField();
        RegDrvDBBut = new javax.swing.JButton();
        BackButtontoMyDrivers = new javax.swing.JButton();
        DelDrvPane = new javax.swing.JPanel();
        SelectdrvToDelLAB = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DrvLJistToDelete = new javax.swing.JList<>();
        BacktoDrvsButton = new javax.swing.JButton();
        DelDrvDbButton = new javax.swing.JButton();
        CmpViewPane = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        CmpList = new javax.swing.JList<>();
        BackButtomFrmCompList = new javax.swing.JButton();
        CmpRegPane = new javax.swing.JPanel();
        EnternameLabCmpreg = new javax.swing.JLabel();
        EnterTextRegCMPTB = new javax.swing.JTextField();
        BckButtonRegCmp = new javax.swing.JButton();
        SaveRegCmpButt = new javax.swing.JButton();
        DelCmpPane = new javax.swing.JPanel();
        SelectCmpLAB = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        CmpDelJlist = new javax.swing.JList<>();
        BackDelCmp = new javax.swing.JButton();
        delCmpDBbutton = new javax.swing.JButton();
        DrvTripViewPane = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        DrvListTripInfoJlist = new javax.swing.JList<>();
        SelectDrvLab = new javax.swing.JLabel();
        DrvStrtLab = new javax.swing.JLabel();
        DrvEndLab = new javax.swing.JLabel();
        DrvStrtate = new com.toedter.calendar.JDateChooser();
        DrvEndDate = new com.toedter.calendar.JDateChooser();
        ViewDrvTripButton = new javax.swing.JButton();
        DrvTripPane = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        DrvJtable = new javax.swing.JTable();
        BacFrmDrvTripButton = new javax.swing.JButton();
        PrintDrvTrips = new javax.swing.JButton();
        CmpTripViewPane = new javax.swing.JPanel();
        SelectDrvLab1 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Jlist = new javax.swing.JList<>();
        DrvStrtLab1 = new javax.swing.JLabel();
        DrvEndLab1 = new javax.swing.JLabel();
        DrvEndDate1 = new com.toedter.calendar.JDateChooser();
        DrvStrtate1 = new com.toedter.calendar.JDateChooser();
        ViewDrvTripButton1 = new javax.swing.JButton();
        CmpTripPane = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        CmpJtable = new javax.swing.JTable();
        BacFrmCmpTripButton = new javax.swing.JButton();
        PrintDCmpTrips = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ContainerPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dashbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashpane.setBackground(new java.awt.Color(46, 49, 49));
        dashpane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dashpane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dashpaneMouseDragged(evt);
            }
        });
        dashpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dashpaneMousePressed(evt);
            }
        });
        dashpane.setLayout(null);

        BharatLab.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        BharatLab.setForeground(new java.awt.Color(240, 240, 240));
        BharatLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BharatLab.setText("Bharat Transport ");
        BharatLab.setToolTipText("");
        dashpane.add(BharatLab);
        BharatLab.setBounds(500, 30, 450, 60);

        DashboardLab.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        DashboardLab.setForeground(new java.awt.Color(240, 240, 240));
        DashboardLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DashboardLab.setText("Dashboard");
        DashboardLab.setToolTipText("");
        dashpane.add(DashboardLab);
        DashboardLab.setBounds(10, 30, 270, 56);

        MinimizeLab.setBackground(new java.awt.Color(255, 51, 51));
        MinimizeLab.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        MinimizeLab.setForeground(new java.awt.Color(240, 240, 240));
        MinimizeLab.setText("-");
        MinimizeLab.setToolTipText("");
        MinimizeLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinimizeLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeLabMouseClicked(evt);
            }
        });
        dashpane.add(MinimizeLab);
        MinimizeLab.setBounds(1280, 30, 40, 54);

        CloseLab.setBackground(new java.awt.Color(255, 51, 51));
        CloseLab.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        CloseLab.setForeground(new java.awt.Color(240, 240, 240));
        CloseLab.setText("X");
        CloseLab.setToolTipText("");
        CloseLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseLabMouseClicked(evt);
            }
        });
        dashpane.add(CloseLab);
        CloseLab.setBounds(1330, 30, 40, 54);

        Dashbar.add(dashpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 120));

        ContainerPane.add(Dashbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        sidebar.setBackground(new java.awt.Color(46, 49, 49));

        pp1.setBackground(new java.awt.Color(46, 49, 49));
        pp1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pp1MouseClicked(evt);
            }
        });

        MyDriversLab.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        MyDriversLab.setForeground(new java.awt.Color(240, 240, 240));
        MyDriversLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MyDriversLab.setText("My Drivers");
        MyDriversLab.setToolTipText("");
        MyDriversLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MyDriversLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyDriversLabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pp1Layout = new javax.swing.GroupLayout(pp1);
        pp1.setLayout(pp1Layout);
        pp1Layout.setHorizontalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MyDriversLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pp1Layout.setVerticalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MyDriversLab, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        pp2.setBackground(new java.awt.Color(46, 49, 49));
        pp2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pp2MouseClicked(evt);
            }
        });

        MyCmpsLab.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        MyCmpsLab.setForeground(new java.awt.Color(240, 240, 240));
        MyCmpsLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MyCmpsLab.setText("My Companies");
        MyCmpsLab.setToolTipText("");
        MyCmpsLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MyCmpsLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyCmpsLabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pp2Layout = new javax.swing.GroupLayout(pp2);
        pp2.setLayout(pp2Layout);
        pp2Layout.setHorizontalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MyCmpsLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pp2Layout.setVerticalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MyCmpsLab, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        pp3.setBackground(new java.awt.Color(46, 49, 49));
        pp3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pp3MouseClicked(evt);
            }
        });

        DailyEntryLab.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        DailyEntryLab.setForeground(new java.awt.Color(240, 240, 240));
        DailyEntryLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DailyEntryLab.setText("Daily Entry");
        DailyEntryLab.setToolTipText("");
        DailyEntryLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DailyEntryLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DailyEntryLabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pp3Layout = new javax.swing.GroupLayout(pp3);
        pp3.setLayout(pp3Layout);
        pp3Layout.setHorizontalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DailyEntryLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pp3Layout.setVerticalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DailyEntryLab, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        pp4.setBackground(new java.awt.Color(46, 49, 49));
        pp4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pp4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pp4MouseClicked(evt);
            }
        });

        DriverBusinessLab.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        DriverBusinessLab.setForeground(new java.awt.Color(240, 240, 240));
        DriverBusinessLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DriverBusinessLab.setText("Driver Business");
        DriverBusinessLab.setToolTipText("");
        DriverBusinessLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DriverBusinessLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DriverBusinessLabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pp4Layout = new javax.swing.GroupLayout(pp4);
        pp4.setLayout(pp4Layout);
        pp4Layout.setHorizontalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DriverBusinessLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
        );
        pp4Layout.setVerticalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DriverBusinessLab, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        pp5.setBackground(new java.awt.Color(46, 49, 49));
        pp5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pp5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pp5MouseClicked(evt);
            }
        });

        CompanyBillsLab.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        CompanyBillsLab.setForeground(new java.awt.Color(240, 240, 240));
        CompanyBillsLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CompanyBillsLab.setText("Company Bills");
        CompanyBillsLab.setToolTipText("");
        CompanyBillsLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CompanyBillsLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompanyBillsLabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pp5Layout = new javax.swing.GroupLayout(pp5);
        pp5.setLayout(pp5Layout);
        pp5Layout.setHorizontalGroup(
            pp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CompanyBillsLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pp5Layout.setVerticalGroup(
            pp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CompanyBillsLab, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pp5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(pp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(pp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        ContainerPane.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 350, 640));

        pan_centre.setBackground(new java.awt.Color(255, 102, 102));
        pan_centre.setLayout(new java.awt.CardLayout());

        Homepane.setBackground(new java.awt.Color(44, 62, 80));

        TruckImg.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\MyApp\\image\\trkk.png")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("About US");
        jLabel10.setToolTipText("");

        jTextArea1.setBackground(new java.awt.Color(44, 62, 80));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea1.setRows(5);
        jTextArea1.setText("      Bharat Transport / Sourabh Cargo\n     Email: bharattransport1@gmail.com\n                Contact: 98509151314\n       Work Area: Overall Maharashtra\n                         Office: Pune ");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout HomepaneLayout = new javax.swing.GroupLayout(Homepane);
        Homepane.setLayout(HomepaneLayout);
        HomepaneLayout.setHorizontalGroup(
            HomepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomepaneLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(TruckImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(HomepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomepaneLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomepaneLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))))
        );
        HomepaneLayout.setVerticalGroup(
            HomepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomepaneLayout.createSequentialGroup()
                .addGroup(HomepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomepaneLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(TruckImg))
                    .addGroup(HomepaneLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel10)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 180, Short.MAX_VALUE))
        );

        pan_centre.add(Homepane, "card2");

        DrvPane.setBackground(new java.awt.Color(44, 62, 80));

        ViewDrvLab.setBackground(new java.awt.Color(236, 240, 241));
        ViewDrvLab.setFont(new java.awt.Font("Times New Roman", 1, 42)); // NOI18N
        ViewDrvLab.setForeground(new java.awt.Color(236, 240, 241));
        ViewDrvLab.setText("View My Driver List");

        RegisterDrvLab.setBackground(new java.awt.Color(236, 240, 241));
        RegisterDrvLab.setFont(new java.awt.Font("Times New Roman", 1, 42)); // NOI18N
        RegisterDrvLab.setForeground(new java.awt.Color(236, 240, 241));
        RegisterDrvLab.setText("Register New Driver");

        DelDrvLab.setBackground(new java.awt.Color(236, 240, 241));
        DelDrvLab.setFont(new java.awt.Font("Times New Roman", 1, 42)); // NOI18N
        DelDrvLab.setForeground(new java.awt.Color(236, 240, 241));
        DelDrvLab.setText("Delete a Driver");

        DeleteDrvButton.setBackground(new java.awt.Color(34, 167, 240));
        DeleteDrvButton.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        DeleteDrvButton.setForeground(new java.awt.Color(240, 240, 240));
        DeleteDrvButton.setText("Delete");
        DeleteDrvButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteDrvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteDrvButtonActionPerformed(evt);
            }
        });

        RegisterDrvButton.setBackground(new java.awt.Color(34, 167, 240));
        RegisterDrvButton.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        RegisterDrvButton.setForeground(new java.awt.Color(240, 240, 240));
        RegisterDrvButton.setText("Register");
        RegisterDrvButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterDrvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterDrvButtonActionPerformed(evt);
            }
        });

        ViewDrvButton.setBackground(new java.awt.Color(34, 167, 240));
        ViewDrvButton.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        ViewDrvButton.setForeground(new java.awt.Color(240, 240, 240));
        ViewDrvButton.setText("View");
        ViewDrvButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewDrvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDrvButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DrvPaneLayout = new javax.swing.GroupLayout(DrvPane);
        DrvPane.setLayout(DrvPaneLayout);
        DrvPaneLayout.setHorizontalGroup(
            DrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrvPaneLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(DrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DrvPaneLayout.createSequentialGroup()
                        .addGroup(DrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DelDrvLab, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegisterDrvLab, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addGroup(DrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegisterDrvButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteDrvButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DrvPaneLayout.createSequentialGroup()
                        .addComponent(ViewDrvLab, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ViewDrvButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(141, 141, 141))
        );
        DrvPaneLayout.setVerticalGroup(
            DrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrvPaneLayout.createSequentialGroup()
                .addGap(0, 92, Short.MAX_VALUE)
                .addGroup(DrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewDrvLab, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewDrvButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(DrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DrvPaneLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(RegisterDrvLab, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrvPaneLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(RegisterDrvButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(DrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DelDrvLab, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteDrvButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(254, 254, 254))
        );

        pan_centre.add(DrvPane, "card3");

        CmpPane.setBackground(new java.awt.Color(44, 62, 80));

        ViewCmpLab.setBackground(new java.awt.Color(236, 240, 241));
        ViewCmpLab.setFont(new java.awt.Font("Times New Roman", 1, 42)); // NOI18N
        ViewCmpLab.setForeground(new java.awt.Color(236, 240, 241));
        ViewCmpLab.setText("View My Company List");

        RegisterCmpLab.setBackground(new java.awt.Color(236, 240, 241));
        RegisterCmpLab.setFont(new java.awt.Font("Times New Roman", 1, 42)); // NOI18N
        RegisterCmpLab.setForeground(new java.awt.Color(236, 240, 241));
        RegisterCmpLab.setText("Register New Company");

        DelCmpLab.setBackground(new java.awt.Color(236, 240, 241));
        DelCmpLab.setFont(new java.awt.Font("Times New Roman", 1, 42)); // NOI18N
        DelCmpLab.setForeground(new java.awt.Color(236, 240, 241));
        DelCmpLab.setText("Delete a Company");

        DelCmpButton.setBackground(new java.awt.Color(34, 167, 240));
        DelCmpButton.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        DelCmpButton.setForeground(new java.awt.Color(240, 240, 240));
        DelCmpButton.setText("Delete");
        DelCmpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DelCmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelCmpButtonActionPerformed(evt);
            }
        });

        RegCmpButton.setBackground(new java.awt.Color(34, 167, 240));
        RegCmpButton.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        RegCmpButton.setForeground(new java.awt.Color(240, 240, 240));
        RegCmpButton.setText("Register");
        RegCmpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegCmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegCmpButtonActionPerformed(evt);
            }
        });

        ViewCmpButton.setBackground(new java.awt.Color(34, 167, 240));
        ViewCmpButton.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        ViewCmpButton.setForeground(new java.awt.Color(240, 240, 240));
        ViewCmpButton.setText("View");
        ViewCmpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewCmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCmpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CmpPaneLayout = new javax.swing.GroupLayout(CmpPane);
        CmpPane.setLayout(CmpPaneLayout);
        CmpPaneLayout.setHorizontalGroup(
            CmpPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CmpPaneLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(CmpPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewCmpLab, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegisterCmpLab, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DelCmpLab, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(CmpPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DelCmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewCmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegCmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        CmpPaneLayout.setVerticalGroup(
            CmpPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CmpPaneLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(CmpPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewCmpLab, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewCmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(CmpPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterCmpLab, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegCmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(CmpPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DelCmpLab, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DelCmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(228, Short.MAX_VALUE))
        );

        pan_centre.add(CmpPane, "card4");

        DailyEntryPane.setBackground(new java.awt.Color(44, 62, 80));
        DailyEntryPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EntryparticularsLab.setBackground(new java.awt.Color(236, 240, 241));
        EntryparticularsLab.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        EntryparticularsLab.setForeground(new java.awt.Color(236, 240, 241));
        EntryparticularsLab.setText("Particulars:");
        DailyEntryPane.add(EntryparticularsLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 190, 60));

        EntryCmpLab.setBackground(new java.awt.Color(236, 240, 241));
        EntryCmpLab.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        EntryCmpLab.setForeground(new java.awt.Color(236, 240, 241));
        EntryCmpLab.setText("Company:");
        DailyEntryPane.add(EntryCmpLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 170, 50));

        EntryChallanLAb.setBackground(new java.awt.Color(236, 240, 241));
        EntryChallanLAb.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        EntryChallanLAb.setForeground(new java.awt.Color(236, 240, 241));
        EntryChallanLAb.setText("Challan No:");
        DailyEntryPane.add(EntryChallanLAb, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, 46));

        EntryVnoLab.setBackground(new java.awt.Color(236, 240, 241));
        EntryVnoLab.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        EntryVnoLab.setForeground(new java.awt.Color(236, 240, 241));
        EntryVnoLab.setText("Vehicle No:");
        DailyEntryPane.add(EntryVnoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 190, 70));

        EntryDrvLabel.setBackground(new java.awt.Color(236, 240, 241));
        EntryDrvLabel.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        EntryDrvLabel.setForeground(new java.awt.Color(236, 240, 241));
        EntryDrvLabel.setText("Driver:");
        DailyEntryPane.add(EntryDrvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 120, 46));

        EntryAmtLab.setBackground(new java.awt.Color(236, 240, 241));
        EntryAmtLab.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        EntryAmtLab.setForeground(new java.awt.Color(236, 240, 241));
        EntryAmtLab.setText("Amount:");
        DailyEntryPane.add(EntryAmtLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 141, 46));

        EntryBnameLab.setBackground(new java.awt.Color(236, 240, 241));
        EntryBnameLab.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        EntryBnameLab.setForeground(new java.awt.Color(236, 240, 241));
        EntryBnameLab.setText("Vehicle Name:");
        DailyEntryPane.add(EntryBnameLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 240, 46));

        com.setBackground(new java.awt.Color(108, 122, 137));
        com.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        com.setForeground(java.awt.Color.white);
        com.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        com.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comKeyReleased(evt);
            }
        });
        DailyEntryPane.add(com, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 410, 50));

        par.setBackground(new java.awt.Color(108, 122, 137));
        par.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        par.setForeground(java.awt.Color.white);
        par.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        par.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parActionPerformed(evt);
            }
        });
        DailyEntryPane.add(par, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 550, 50));

        ch.setBackground(new java.awt.Color(108, 122, 137));
        ch.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        ch.setForeground(java.awt.Color.white);
        ch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        DailyEntryPane.add(ch, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 230, 50));

        vname.setBackground(new java.awt.Color(108, 122, 137));
        vname.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        vname.setForeground(java.awt.Color.white);
        vname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        DailyEntryPane.add(vname, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 230, 50));

        drv.setBackground(new java.awt.Color(108, 122, 137));
        drv.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        drv.setForeground(java.awt.Color.white);
        drv.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        drv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                drvKeyReleased(evt);
            }
        });
        DailyEntryPane.add(drv, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 230, 50));

        amt.setBackground(new java.awt.Color(108, 122, 137));
        amt.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        amt.setForeground(java.awt.Color.white);
        amt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        DailyEntryPane.add(amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 230, 50));

        vno.setBackground(new java.awt.Color(108, 122, 137));
        vno.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        vno.setForeground(java.awt.Color.white);
        vno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        DailyEntryPane.add(vno, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 230, 50));

        EntryDateLabel.setBackground(new java.awt.Color(236, 240, 241));
        EntryDateLabel.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        EntryDateLabel.setForeground(new java.awt.Color(236, 240, 241));
        EntryDateLabel.setText("Date:");
        DailyEntryPane.add(EntryDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 110, 70));

        EntrySaveButton.setBackground(new java.awt.Color(34, 167, 240));
        EntrySaveButton.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        EntrySaveButton.setForeground(new java.awt.Color(240, 240, 240));
        EntrySaveButton.setText("Save");
        EntrySaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EntrySaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrySaveButtonActionPerformed(evt);
            }
        });
        DailyEntryPane.add(EntrySaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 190, 70));

        d1.setBackground(new java.awt.Color(204, 255, 204));
        d1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d1.setForeground(new java.awt.Color(204, 255, 204));
        d1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DailyEntryPane.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 230, 50));

        pan_centre.add(DailyEntryPane, "card6");

        DrvView.setBackground(new java.awt.Color(44, 62, 80));

        JlistDrv.setBackground(new java.awt.Color(44, 62, 80));
        JlistDrv.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        JlistDrv.setForeground(new java.awt.Color(240, 240, 240));
        JlistDrv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JlistDrv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlistDrvMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JlistDrv);

        BackFromDrvListButton.setBackground(new java.awt.Color(34, 167, 240));
        BackFromDrvListButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BackFromDrvListButton.setForeground(new java.awt.Color(240, 240, 240));
        BackFromDrvListButton.setText("Back");
        BackFromDrvListButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackFromDrvListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackFromDrvListButtonActionPerformed(evt);
            }
        });

        PhnoLabDrvView.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        PhnoLabDrvView.setForeground(new java.awt.Color(240, 240, 240));
        PhnoLabDrvView.setText("Ph No:");
        PhnoLabDrvView.setToolTipText("");

        NameLABDrvView.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        NameLABDrvView.setForeground(new java.awt.Color(240, 240, 240));
        NameLABDrvView.setText("Name: ");
        NameLABDrvView.setToolTipText("");

        SetTextBoxDrvNo.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        SetTextBoxDrvNo.setForeground(new java.awt.Color(240, 240, 240));
        SetTextBoxDrvNo.setToolTipText("");

        SetTextboxDrvName.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        SetTextboxDrvName.setForeground(new java.awt.Color(240, 240, 240));
        SetTextboxDrvName.setToolTipText("");

        javax.swing.GroupLayout DrvViewLayout = new javax.swing.GroupLayout(DrvView);
        DrvView.setLayout(DrvViewLayout);
        DrvViewLayout.setHorizontalGroup(
            DrvViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrvViewLayout.createSequentialGroup()
                .addGroup(DrvViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DrvViewLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(BackFromDrvListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DrvViewLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addGroup(DrvViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameLABDrvView, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(PhnoLabDrvView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(DrvViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SetTextBoxDrvNo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SetTextboxDrvName, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        DrvViewLayout.setVerticalGroup(
            DrvViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrvViewLayout.createSequentialGroup()
                .addGroup(DrvViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DrvViewLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DrvViewLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(DrvViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameLABDrvView, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SetTextboxDrvName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(DrvViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhnoLabDrvView, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SetTextBoxDrvNo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(BackFromDrvListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        pan_centre.add(DrvView, "card6");

        RegDrvPane.setBackground(new java.awt.Color(44, 62, 80));

        jLabel8.setBackground(new java.awt.Color(236, 240, 241));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("Enter Name:");

        jLabel9.setBackground(new java.awt.Color(236, 240, 241));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("Enter Ph No:");

        DrvNoTB.setBackground(new java.awt.Color(108, 122, 137));
        DrvNoTB.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DrvNoTB.setForeground(new java.awt.Color(204, 255, 204));
        DrvNoTB.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        DrvNoTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrvNoTBActionPerformed(evt);
            }
        });

        DrvNameTB.setBackground(new java.awt.Color(108, 122, 137));
        DrvNameTB.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DrvNameTB.setForeground(new java.awt.Color(204, 255, 204));
        DrvNameTB.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        DrvNameTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrvNameTBActionPerformed(evt);
            }
        });

        RegDrvDBBut.setBackground(new java.awt.Color(34, 167, 240));
        RegDrvDBBut.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RegDrvDBBut.setForeground(new java.awt.Color(240, 240, 240));
        RegDrvDBBut.setText("Save");
        RegDrvDBBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegDrvDBBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegDrvDBButActionPerformed(evt);
            }
        });

        BackButtontoMyDrivers.setBackground(new java.awt.Color(34, 167, 240));
        BackButtontoMyDrivers.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BackButtontoMyDrivers.setForeground(new java.awt.Color(240, 240, 240));
        BackButtontoMyDrivers.setText("Back");
        BackButtontoMyDrivers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButtontoMyDrivers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtontoMyDriversActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegDrvPaneLayout = new javax.swing.GroupLayout(RegDrvPane);
        RegDrvPane.setLayout(RegDrvPaneLayout);
        RegDrvPaneLayout.setHorizontalGroup(
            RegDrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegDrvPaneLayout.createSequentialGroup()
                .addGroup(RegDrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(RegDrvPaneLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(RegDrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RegDrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DrvNoTB, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(DrvNameTB)))
                    .addGroup(RegDrvPaneLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(BackButtontoMyDrivers, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(RegDrvDBBut, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(493, Short.MAX_VALUE))
        );
        RegDrvPaneLayout.setVerticalGroup(
            RegDrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegDrvPaneLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(RegDrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegDrvPaneLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(RegDrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DrvNoTB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RegDrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DrvNameTB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91)
                .addGroup(RegDrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegDrvDBBut, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButtontoMyDrivers, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        pan_centre.add(RegDrvPane, "card7");

        DelDrvPane.setBackground(new java.awt.Color(44, 62, 80));

        SelectdrvToDelLAB.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        SelectdrvToDelLAB.setForeground(new java.awt.Color(240, 240, 240));
        SelectdrvToDelLAB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SelectdrvToDelLAB.setText("Select a Driver to Delete");
        SelectdrvToDelLAB.setToolTipText("");

        DrvLJistToDelete.setBackground(new java.awt.Color(44, 62, 80));
        DrvLJistToDelete.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        DrvLJistToDelete.setForeground(new java.awt.Color(240, 240, 240));
        DrvLJistToDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane3.setViewportView(DrvLJistToDelete);

        BacktoDrvsButton.setBackground(new java.awt.Color(34, 167, 240));
        BacktoDrvsButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BacktoDrvsButton.setForeground(new java.awt.Color(240, 240, 240));
        BacktoDrvsButton.setText("Back");
        BacktoDrvsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BacktoDrvsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BacktoDrvsButtonActionPerformed(evt);
            }
        });

        DelDrvDbButton.setBackground(new java.awt.Color(34, 167, 240));
        DelDrvDbButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DelDrvDbButton.setForeground(new java.awt.Color(240, 240, 240));
        DelDrvDbButton.setText("Delete");
        DelDrvDbButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DelDrvDbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelDrvDbButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DelDrvPaneLayout = new javax.swing.GroupLayout(DelDrvPane);
        DelDrvPane.setLayout(DelDrvPaneLayout);
        DelDrvPaneLayout.setHorizontalGroup(
            DelDrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DelDrvPaneLayout.createSequentialGroup()
                .addGroup(DelDrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DelDrvPaneLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DelDrvPaneLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(DelDrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SelectdrvToDelLAB, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DelDrvPaneLayout.createSequentialGroup()
                                .addComponent(BacktoDrvsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DelDrvDbButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(623, Short.MAX_VALUE))
        );
        DelDrvPaneLayout.setVerticalGroup(
            DelDrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DelDrvPaneLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(SelectdrvToDelLAB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(DelDrvPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BacktoDrvsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DelDrvDbButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pan_centre.add(DelDrvPane, "card8");

        CmpViewPane.setBackground(new java.awt.Color(44, 62, 80));

        CmpList.setBackground(new java.awt.Color(44, 62, 80));
        CmpList.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        CmpList.setForeground(new java.awt.Color(240, 240, 240));
        CmpList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane4.setViewportView(CmpList);

        BackButtomFrmCompList.setBackground(new java.awt.Color(34, 167, 240));
        BackButtomFrmCompList.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BackButtomFrmCompList.setForeground(new java.awt.Color(240, 240, 240));
        BackButtomFrmCompList.setText("Back");
        BackButtomFrmCompList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButtomFrmCompList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtomFrmCompListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CmpViewPaneLayout = new javax.swing.GroupLayout(CmpViewPane);
        CmpViewPane.setLayout(CmpViewPaneLayout);
        CmpViewPaneLayout.setHorizontalGroup(
            CmpViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CmpViewPaneLayout.createSequentialGroup()
                .addGroup(CmpViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CmpViewPaneLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CmpViewPaneLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(BackButtomFrmCompList, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(607, Short.MAX_VALUE))
        );
        CmpViewPaneLayout.setVerticalGroup(
            CmpViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CmpViewPaneLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(BackButtomFrmCompList, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pan_centre.add(CmpViewPane, "card9");

        CmpRegPane.setBackground(new java.awt.Color(44, 62, 80));

        EnternameLabCmpreg.setBackground(new java.awt.Color(236, 240, 241));
        EnternameLabCmpreg.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        EnternameLabCmpreg.setForeground(new java.awt.Color(236, 240, 241));
        EnternameLabCmpreg.setText("Enter Name:");

        EnterTextRegCMPTB.setBackground(new java.awt.Color(108, 122, 137));
        EnterTextRegCMPTB.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        EnterTextRegCMPTB.setForeground(new java.awt.Color(204, 255, 204));
        EnterTextRegCMPTB.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        EnterTextRegCMPTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterTextRegCMPTBActionPerformed(evt);
            }
        });

        BckButtonRegCmp.setBackground(new java.awt.Color(34, 167, 240));
        BckButtonRegCmp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BckButtonRegCmp.setForeground(new java.awt.Color(240, 240, 240));
        BckButtonRegCmp.setText("Back");
        BckButtonRegCmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BckButtonRegCmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BckButtonRegCmpActionPerformed(evt);
            }
        });

        SaveRegCmpButt.setBackground(new java.awt.Color(34, 167, 240));
        SaveRegCmpButt.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SaveRegCmpButt.setForeground(new java.awt.Color(240, 240, 240));
        SaveRegCmpButt.setText("Save");
        SaveRegCmpButt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaveRegCmpButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveRegCmpButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CmpRegPaneLayout = new javax.swing.GroupLayout(CmpRegPane);
        CmpRegPane.setLayout(CmpRegPaneLayout);
        CmpRegPaneLayout.setHorizontalGroup(
            CmpRegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CmpRegPaneLayout.createSequentialGroup()
                .addGroup(CmpRegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CmpRegPaneLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(EnternameLabCmpreg, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EnterTextRegCMPTB, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CmpRegPaneLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(BckButtonRegCmp, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(SaveRegCmpButt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(452, Short.MAX_VALUE))
        );
        CmpRegPaneLayout.setVerticalGroup(
            CmpRegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CmpRegPaneLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(CmpRegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnternameLabCmpreg, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterTextRegCMPTB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(CmpRegPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveRegCmpButt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BckButtonRegCmp, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(421, Short.MAX_VALUE))
        );

        pan_centre.add(CmpRegPane, "card10");

        DelCmpPane.setBackground(new java.awt.Color(44, 62, 80));

        SelectCmpLAB.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        SelectCmpLAB.setForeground(new java.awt.Color(240, 240, 240));
        SelectCmpLAB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SelectCmpLAB.setText("Select a Company to Delete");
        SelectCmpLAB.setToolTipText("");

        CmpDelJlist.setBackground(new java.awt.Color(44, 62, 80));
        CmpDelJlist.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        CmpDelJlist.setForeground(new java.awt.Color(240, 240, 240));
        CmpDelJlist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane5.setViewportView(CmpDelJlist);

        BackDelCmp.setBackground(new java.awt.Color(34, 167, 240));
        BackDelCmp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BackDelCmp.setForeground(new java.awt.Color(240, 240, 240));
        BackDelCmp.setText("Back");
        BackDelCmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackDelCmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackDelCmpActionPerformed(evt);
            }
        });

        delCmpDBbutton.setBackground(new java.awt.Color(34, 167, 240));
        delCmpDBbutton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        delCmpDBbutton.setForeground(new java.awt.Color(240, 240, 240));
        delCmpDBbutton.setText("Delete");
        delCmpDBbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delCmpDBbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delCmpDBbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DelCmpPaneLayout = new javax.swing.GroupLayout(DelCmpPane);
        DelCmpPane.setLayout(DelCmpPaneLayout);
        DelCmpPaneLayout.setHorizontalGroup(
            DelCmpPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DelCmpPaneLayout.createSequentialGroup()
                .addGroup(DelCmpPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DelCmpPaneLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(DelCmpPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SelectCmpLAB, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DelCmpPaneLayout.createSequentialGroup()
                                .addComponent(BackDelCmp, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delCmpDBbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(DelCmpPaneLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(603, Short.MAX_VALUE))
        );
        DelCmpPaneLayout.setVerticalGroup(
            DelCmpPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DelCmpPaneLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(SelectCmpLAB, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(DelCmpPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackDelCmp, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delCmpDBbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pan_centre.add(DelCmpPane, "card11");

        DrvTripViewPane.setBackground(new java.awt.Color(44, 62, 80));

        DrvListTripInfoJlist.setBackground(new java.awt.Color(44, 62, 80));
        DrvListTripInfoJlist.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        DrvListTripInfoJlist.setForeground(new java.awt.Color(240, 240, 240));
        DrvListTripInfoJlist.setAutoscrolls(false);
        DrvListTripInfoJlist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane6.setViewportView(DrvListTripInfoJlist);

        SelectDrvLab.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        SelectDrvLab.setForeground(new java.awt.Color(240, 240, 240));
        SelectDrvLab.setText("Please Select a Driver");
        SelectDrvLab.setToolTipText("");

        DrvStrtLab.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        DrvStrtLab.setForeground(new java.awt.Color(240, 240, 240));
        DrvStrtLab.setText("Enter Start Date:");
        DrvStrtLab.setToolTipText("");

        DrvEndLab.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        DrvEndLab.setForeground(new java.awt.Color(240, 240, 240));
        DrvEndLab.setText("Enter End Date:");
        DrvEndLab.setToolTipText("");

        DrvStrtate.setBackground(new java.awt.Color(204, 255, 204));
        DrvStrtate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DrvStrtate.setForeground(new java.awt.Color(204, 255, 204));
        DrvStrtate.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N

        DrvEndDate.setBackground(new java.awt.Color(204, 255, 204));
        DrvEndDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DrvEndDate.setForeground(new java.awt.Color(204, 255, 204));
        DrvEndDate.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N

        ViewDrvTripButton.setBackground(new java.awt.Color(34, 167, 240));
        ViewDrvTripButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ViewDrvTripButton.setForeground(new java.awt.Color(240, 240, 240));
        ViewDrvTripButton.setText("View");
        ViewDrvTripButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewDrvTripButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDrvTripButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DrvTripViewPaneLayout = new javax.swing.GroupLayout(DrvTripViewPane);
        DrvTripViewPane.setLayout(DrvTripViewPaneLayout);
        DrvTripViewPaneLayout.setHorizontalGroup(
            DrvTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrvTripViewPaneLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(DrvTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SelectDrvLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addGroup(DrvTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DrvTripViewPaneLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(DrvTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DrvEndLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DrvStrtLab))
                        .addGap(26, 26, 26)
                        .addGroup(DrvTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DrvStrtate, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(DrvEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(DrvTripViewPaneLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(ViewDrvTripButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        DrvTripViewPaneLayout.setVerticalGroup(
            DrvTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrvTripViewPaneLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(SelectDrvLab, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(DrvTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DrvTripViewPaneLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(DrvTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DrvStrtLab, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(DrvStrtate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(DrvTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DrvEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DrvEndLab, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addComponent(ViewDrvTripButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DrvTripViewPaneLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pan_centre.add(DrvTripViewPane, "card12");

        DrvTripPane.setBackground(new java.awt.Color(44, 62, 80));

        DrvJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Company", "Particulars", "Challan No", "Vehicle Name", "Vehicle No", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DrvJtable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        DrvJtable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DrvJtable.setRowHeight(25);
        DrvJtable.setSelectionBackground(new java.awt.Color(44, 62, 80));
        jScrollPane7.setViewportView(DrvJtable);

        BacFrmDrvTripButton.setBackground(new java.awt.Color(34, 167, 240));
        BacFrmDrvTripButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BacFrmDrvTripButton.setForeground(new java.awt.Color(240, 240, 240));
        BacFrmDrvTripButton.setText("Back");
        BacFrmDrvTripButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BacFrmDrvTripButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                BacFrmDrvTripButtonComponentHidden(evt);
            }
        });
        BacFrmDrvTripButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BacFrmDrvTripButtonActionPerformed(evt);
            }
        });

        PrintDrvTrips.setBackground(new java.awt.Color(34, 167, 240));
        PrintDrvTrips.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        PrintDrvTrips.setForeground(new java.awt.Color(240, 240, 240));
        PrintDrvTrips.setText("Print");
        PrintDrvTrips.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PrintDrvTrips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintDrvTripsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DrvTripPaneLayout = new javax.swing.GroupLayout(DrvTripPane);
        DrvTripPane.setLayout(DrvTripPaneLayout);
        DrvTripPaneLayout.setHorizontalGroup(
            DrvTripPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrvTripPaneLayout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(BacFrmDrvTripButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(PrintDrvTrips, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
            .addGroup(DrvTripPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrvTripPaneLayout.createSequentialGroup()
                    .addContainerGap(69, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(88, Short.MAX_VALUE)))
        );
        DrvTripPaneLayout.setVerticalGroup(
            DrvTripPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrvTripPaneLayout.createSequentialGroup()
                .addContainerGap(533, Short.MAX_VALUE)
                .addGroup(DrvTripPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrintDrvTrips, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BacFrmDrvTripButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(DrvTripPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrvTripPaneLayout.createSequentialGroup()
                    .addContainerGap(93, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(165, Short.MAX_VALUE)))
        );

        pan_centre.add(DrvTripPane, "card13");

        CmpTripViewPane.setBackground(new java.awt.Color(44, 62, 80));

        SelectDrvLab1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        SelectDrvLab1.setForeground(new java.awt.Color(240, 240, 240));
        SelectDrvLab1.setText("Please Select a Company");
        SelectDrvLab1.setToolTipText("");

        Jlist.setBackground(new java.awt.Color(44, 62, 80));
        Jlist.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        Jlist.setForeground(new java.awt.Color(240, 240, 240));
        Jlist.setAutoscrolls(false);
        Jlist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane8.setViewportView(Jlist);

        DrvStrtLab1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        DrvStrtLab1.setForeground(new java.awt.Color(240, 240, 240));
        DrvStrtLab1.setText("Enter Start Date:");
        DrvStrtLab1.setToolTipText("");

        DrvEndLab1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        DrvEndLab1.setForeground(new java.awt.Color(240, 240, 240));
        DrvEndLab1.setText("Enter End Date:");
        DrvEndLab1.setToolTipText("");

        DrvEndDate1.setBackground(new java.awt.Color(204, 255, 204));
        DrvEndDate1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DrvEndDate1.setForeground(new java.awt.Color(204, 255, 204));
        DrvEndDate1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N

        DrvStrtate1.setBackground(new java.awt.Color(204, 255, 204));
        DrvStrtate1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DrvStrtate1.setForeground(new java.awt.Color(204, 255, 204));
        DrvStrtate1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N

        ViewDrvTripButton1.setBackground(new java.awt.Color(34, 167, 240));
        ViewDrvTripButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ViewDrvTripButton1.setForeground(new java.awt.Color(240, 240, 240));
        ViewDrvTripButton1.setText("View");
        ViewDrvTripButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewDrvTripButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDrvTripButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CmpTripViewPaneLayout = new javax.swing.GroupLayout(CmpTripViewPane);
        CmpTripViewPane.setLayout(CmpTripViewPaneLayout);
        CmpTripViewPaneLayout.setHorizontalGroup(
            CmpTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CmpTripViewPaneLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(CmpTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelectDrvLab1)
                    .addGroup(CmpTripViewPaneLayout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(CmpTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CmpTripViewPaneLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(CmpTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DrvStrtLab1)
                                    .addComponent(DrvEndLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(CmpTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DrvStrtate1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DrvEndDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CmpTripViewPaneLayout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(ViewDrvTripButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        CmpTripViewPaneLayout.setVerticalGroup(
            CmpTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CmpTripViewPaneLayout.createSequentialGroup()
                .addGroup(CmpTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CmpTripViewPaneLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(CmpTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DrvStrtLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DrvStrtate1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(CmpTripViewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DrvEndLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DrvEndDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addComponent(ViewDrvTripButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CmpTripViewPaneLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(SelectDrvLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pan_centre.add(CmpTripViewPane, "card14");

        CmpTripPane.setBackground(new java.awt.Color(44, 62, 80));

        CmpJtable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        CmpJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Company", "Particulars", "Challan No", "Vehicle Name", "Vehicle No", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CmpJtable.setAlignmentX(1.5F);
        CmpJtable.setAlignmentY(1.5F);
        CmpJtable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        CmpJtable.setRowHeight(25);
        CmpJtable.setSelectionBackground(new java.awt.Color(44, 62, 80));
        jScrollPane9.setViewportView(CmpJtable);

        BacFrmCmpTripButton.setBackground(new java.awt.Color(34, 167, 240));
        BacFrmCmpTripButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BacFrmCmpTripButton.setForeground(new java.awt.Color(240, 240, 240));
        BacFrmCmpTripButton.setText("Back");
        BacFrmCmpTripButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BacFrmCmpTripButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                BacFrmCmpTripButtonComponentHidden(evt);
            }
        });
        BacFrmCmpTripButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BacFrmCmpTripButtonActionPerformed(evt);
            }
        });

        PrintDCmpTrips.setBackground(new java.awt.Color(34, 167, 240));
        PrintDCmpTrips.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        PrintDCmpTrips.setForeground(new java.awt.Color(240, 240, 240));
        PrintDCmpTrips.setText("Print");
        PrintDCmpTrips.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PrintDCmpTrips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintDCmpTripsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CmpTripPaneLayout = new javax.swing.GroupLayout(CmpTripPane);
        CmpTripPane.setLayout(CmpTripPaneLayout);
        CmpTripPaneLayout.setHorizontalGroup(
            CmpTripPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CmpTripPaneLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(BacFrmCmpTripButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166)
                .addComponent(PrintDCmpTrips, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CmpTripPaneLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        CmpTripPaneLayout.setVerticalGroup(
            CmpTripPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CmpTripPaneLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(CmpTripPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BacFrmCmpTripButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrintDCmpTrips, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        pan_centre.add(CmpTripPane, "card15");

        ContainerPane.add(pan_centre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 1060, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContainerPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContainerPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizeLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabMouseClicked
        this.setState(this.ICONIFIED);        // Minimize Screen
    }//GEN-LAST:event_MinimizeLabMouseClicked
private  void  DisplayTableCompany(String name, String date1, String date2)
   {
     
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
           PreparedStatement st=con.prepareStatement("Select Date, Company, Particulars, ChallanNo, VehicleName, VehicleNo,  Amount  "
                   + "from data where company = ?  and Date between ? and ?");
           st.setString(1,name);
           st.setString(2,date1);
           st.setString(3,date2);
           ResultSet rs = st.executeQuery(); 
            CmpJtable.setModel(DbUtils.resultSetToTableModel(rs));           
           con.close();
       }
        catch(Exception e){System.out.println(e);}
   }
private  void  DisplayTableDriver(String name, String date1, String date2)
   {
     
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
           PreparedStatement st=con.prepareStatement("Select Date, Company, Particulars, ChallanNo, VehicleName, VehicleNo,  Amount  "
                   + "from data where driver = ?  and Date between ? and ?");
           st.setString(1,name);
           st.setString(2,date1);
           st.setString(3,date2);
           ResultSet rs = st.executeQuery(); 
            DrvJtable.setModel(DbUtils.resultSetToTableModel(rs));           
           con.close();
       }
        catch(Exception e){System.out.println(e);}
   }


    private void CloseLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabMouseClicked

        if(JOptionPane.showConfirmDialog(this,"Confirm if you want to Logout","Logoff",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
                       this.dispose();                                      // Close the Application
    }//GEN-LAST:event_CloseLabMouseClicked

    private void dashpaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseDragged
       int xt=evt.getXOnScreen();
        int yt=evt.getYOnScreen();
        this.setLocation(xt-xx,yt-yy);        //Setting the dragged location , xx, yy dragged cordinates
    }//GEN-LAST:event_dashpaneMouseDragged

    private void dashpaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMousePressed
xx=evt.getX();
yy=evt.getY();        // get drag screenpoints
    }//GEN-LAST:event_dashpaneMousePressed

    private void MyDriversLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyDriversLabMouseClicked

        Homepane.setVisible(false);
        DrvPane.setVisible(true);
        CmpPane.setVisible(false);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
         RegDrvPane.setVisible(false);
         DelDrvPane.setVisible(false);
         CmpViewPane.setVisible(false);
         CmpRegPane.setVisible(false);
         DelCmpPane.setVisible(false);
         DrvTripViewPane.setVisible(false);
         DrvTripPane.setVisible(false);
         CmpTripViewPane.setVisible(false);
         CmpTripPane.setVisible(false);
    }//GEN-LAST:event_MyDriversLabMouseClicked

    private void pp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pp1MouseClicked
    
    }//GEN-LAST:event_pp1MouseClicked

    private void MyCmpsLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyCmpsLabMouseClicked
        Homepane.setVisible(false);
        DrvPane.setVisible(false);
        CmpPane.setVisible(true);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        RegDrvPane.setVisible(false);
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(false);
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(false);
        DrvTripPane.setVisible(false);
        CmpTripViewPane.setVisible(false);
        CmpTripPane.setVisible(false);
    }//GEN-LAST:event_MyCmpsLabMouseClicked

    private void pp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pp2MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_pp2MouseClicked

    private void DailyEntryLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DailyEntryLabMouseClicked
        Homepane.setVisible(false);
        DrvPane.setVisible(false);
        CmpPane.setVisible(false);
        DailyEntryPane.setVisible(true);
        DrvView.setVisible(false);
         RegDrvPane.setVisible(false);
         DelDrvPane.setVisible(false);
         CmpViewPane.setVisible(false);
         CmpRegPane.setVisible(false);
         DelCmpPane.setVisible(false);
         DrvTripViewPane.setVisible(false);
         DrvTripPane.setVisible(false);
         CmpTripViewPane.setVisible(false);
         CmpTripPane.setVisible(false);
        
    }//GEN-LAST:event_DailyEntryLabMouseClicked

    private void pp3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pp3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pp3MouseClicked

    private void DriverBusinessLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DriverBusinessLabMouseClicked
       String drv[]= new String[100];
           try{
        int i;
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
           Statement s = con.createStatement();
           ResultSet rs = s.executeQuery("Select * from driver"); 
           i=0; 
           while(rs.next())
           { i++;
           drv[i]=(String)rs.getString(1);
           }
       }
        catch(Exception e){System.out.println(e);}
       
        DrvListTripInfoJlist.setModel(new javax.swing.AbstractListModel<String>() {
    public int getSize() { return drv.length; }
    public String getElementAt(int j) { return drv[j]; }
});
        
        Homepane.setVisible(false);
        DrvPane.setVisible(false);
        CmpPane.setVisible(false);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        RegDrvPane.setVisible(false);
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(false);
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(true);
        DrvTripPane.setVisible(false);
        CmpTripViewPane.setVisible(false);
        CmpTripPane.setVisible(false);
    }//GEN-LAST:event_DriverBusinessLabMouseClicked

    private void pp4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pp4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pp4MouseClicked

    private void CompanyBillsLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompanyBillsLabMouseClicked
        String cmp[]= new String[100];
           try{
        int i;
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
           Statement s = con.createStatement();
           ResultSet rs = s.executeQuery("Select * from company"); 
           i=0; 
           while(rs.next())
           { i++;
           cmp[i]=(String)rs.getString(1);
           }
       }
        catch(Exception e){System.out.println(e);}
       
        Jlist.setModel(new javax.swing.AbstractListModel<String>() {
    public int getSize() { return cmp.length; }
    public String getElementAt(int j) { return cmp[j]; }
});
        Homepane.setVisible(false);
        DrvPane.setVisible(false);
        CmpPane.setVisible(false);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        RegDrvPane.setVisible(false);
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(false);
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(false);
        DrvTripPane.setVisible(false);    
        CmpTripViewPane.setVisible(true);
        CmpTripPane.setVisible(false);
    }//GEN-LAST:event_CompanyBillsLabMouseClicked

    private void pp5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pp5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pp5MouseClicked

    private void DeleteDrvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteDrvButtonActionPerformed
     String[] drv= new String[100];
      try{
        int i;
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
           Statement s = con.createStatement();
           ResultSet rs = s.executeQuery("Select * from driver"); 
           i=0; 
           while(rs.next())
           { i++;
           drv[i]=(String)rs.getString(1);
           }
       }
        catch(Exception e){System.out.println(e);}
         DrvLJistToDelete.setModel(new javax.swing.AbstractListModel<String>() {
    public int getSize() { return drv.length; }
    public String getElementAt(int j) { return drv[j]; }
});
        Homepane.setVisible(false);
        DrvPane.setVisible(false);
        CmpPane.setVisible(false);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        RegDrvPane.setVisible(false);
        DelDrvPane.setVisible(true);
        CmpViewPane.setVisible(false);
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(false);
        DrvTripPane.setVisible(false);
        CmpTripViewPane.setVisible(false);
        CmpTripPane.setVisible(false);
    }//GEN-LAST:event_DeleteDrvButtonActionPerformed

    private void RegisterDrvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterDrvButtonActionPerformed
        
         Homepane.setVisible(false);
         DrvPane.setVisible(false);
         CmpPane.setVisible(false);
         DailyEntryPane.setVisible(false);
         DrvView.setVisible(false);
         RegDrvPane.setVisible(true);
         DelDrvPane.setVisible(false);
         CmpViewPane.setVisible(false);
         CmpRegPane.setVisible(false);
         DelCmpPane.setVisible(false);
         DrvTripViewPane.setVisible(false);
         DrvTripPane.setVisible(false);
         CmpTripViewPane.setVisible(false);
         CmpTripPane.setVisible(false);
    }//GEN-LAST:event_RegisterDrvButtonActionPerformed

    private void ViewDrvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDrvButtonActionPerformed
      String drvlist[] = new String[100];
        try{
        int i;
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
           Statement s = con.createStatement();
           ResultSet rs = s.executeQuery("Select * from driver"); 
           i=0; 
           while(rs.next())
           { i++;
           drvlist[i]=(String)rs.getString(1);
           }
       }
        catch(Exception e){System.out.println(e);}
       
        JlistDrv.setModel(new javax.swing.AbstractListModel<String>() {
    public int getSize() { return drvlist.length; }
    public String getElementAt(int j) { return drvlist[j]; }
});//Set the Jlist with driver list
         
        Homepane.setVisible(false);
        DrvPane.setVisible(false);
        CmpPane.setVisible(false);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(true);
        RegDrvPane.setVisible(false);
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(false);
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(false);
        DrvTripPane.setVisible(false);
        CmpTripViewPane.setVisible(false);
        CmpTripPane.setVisible(false);
    }//GEN-LAST:event_ViewDrvButtonActionPerformed

    private void DelCmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelCmpButtonActionPerformed
     String comp[] = new String[100];
    
     try{
        int i;
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("Select * from company"); 
           i=0; 
           while(rs.next())
           { i++;
           comp[i]=(String)rs.getString(1);
           }
           con.close();
       }
        catch(Exception e){System.out.println(e);}
         CmpDelJlist.setModel(new javax.swing.AbstractListModel<String>() {
    public int getSize() { return comp.length; }
    public String getElementAt(int j) { return comp[j]; }
});  //Set the Jlist with drivers
        
        Homepane.setVisible(false);
        DrvPane.setVisible(false);
        CmpPane.setVisible(false);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        RegDrvPane.setVisible(false);
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(false);
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(true);
        DrvTripViewPane.setVisible(false);
        DrvTripPane.setVisible(false);
        CmpTripViewPane.setVisible(false);
        CmpTripPane.setVisible(false);
    }//GEN-LAST:event_DelCmpButtonActionPerformed

    private void RegCmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegCmpButtonActionPerformed
        
       Homepane.setVisible(false);
       DrvPane.setVisible(false);
       CmpPane.setVisible(false);
       DailyEntryPane.setVisible(false);
       DrvView.setVisible(false);
       RegDrvPane.setVisible(false);
       DelDrvPane.setVisible(false);
       CmpViewPane.setVisible(false);
       CmpRegPane.setVisible(true);
       DelCmpPane.setVisible(false);
       DrvTripViewPane.setVisible(false);
       DrvTripPane.setVisible(false);
       CmpTripViewPane.setVisible(false);
       CmpTripPane.setVisible(false);
    }//GEN-LAST:event_RegCmpButtonActionPerformed

    private void ViewCmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCmpButtonActionPerformed
     String complist[] = new String[100];
        try{
        int i;
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
           Statement s = con.createStatement();
           ResultSet rs = s.executeQuery("Select * from company"); 
           i=0; 
           while(rs.next())
           { i++;
           complist[i]=(String)rs.getString(1);
           }
       }
        catch(Exception e){System.out.println(e);}
       
        CmpList.setModel(new javax.swing.AbstractListModel<String>() {
     public int getSize() { return complist.length; }
     public String getElementAt(int j) { return complist[j]; }
});// set Jlist with drivers
        Homepane.setVisible(false);
        CmpPane.setVisible(false);
        DrvPane.setVisible(false);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        RegDrvPane.setVisible(false);
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(true);      
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(false);
        DrvTripPane.setVisible(false);
        CmpTripViewPane.setVisible(false);
        CmpTripPane.setVisible(false);
    }//GEN-LAST:event_ViewCmpButtonActionPerformed

    private void comKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comKeyReleased
       // Logic to suggest Company Names in com Textbox  
        String company[] = new String[100];
   
       try
        {
            int x;
            ts = new TreeSet<String>();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("Select * from company");
            int i=0;
            while(rs.next())
            { i++;
                company[i]=(String)rs.getString(1);
                ts.add(company[i]);
            }
            con.close();
        }
        catch(Exception ex) { System.out.println(ex);  }

        if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getKeyCode()==KeyEvent.VK_DELETE)
        {

        }
        else
        {
            String str = com.getText();
            int l=str.length();
            for(String data:ts)
            {
                String test="";
                for(int i=0;i<l;i++)
                {
                    if(l<=data.length())
                    test=test+data.charAt(i);
                }
                if(test.equalsIgnoreCase(str))
                {      com.setText(data);
                    com.setSelectionStart(l);
                    com.setSelectionEnd(data.length());
                    break;
                }
            }
        }
    }//GEN-LAST:event_comKeyReleased

    private void parActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parActionPerformed

    private void drvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_drvKeyReleased
       // Logic to suggest Driver Names indrv Textbox 
        String driver[] = new String[100];
     
        try
        {
            int x;
            ts = new TreeSet<String>();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("Select * from driver");
            int i=0;
            while(rs.next())
            { i++;
                driver[i]=(String)rs.getString(1);
                ts.add(driver[i]);
            }
            con.close();
        }
        catch(Exception ex) { System.out.println(ex);  }

        if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getKeyCode()==KeyEvent.VK_DELETE  ||  evt.getKeyCode()==KeyEvent.KEY_PRESSED)
        {  }
        else
        {
            String str = drv.getText();
            int l=str.length();
            for(String data:ts)
            {
                String test="";
                for(int i=0;i<l;i++)
                {
                    if(l<=data.length())
                    test=test+data.charAt(i);
                }
                if(test.equalsIgnoreCase(str))
                {      drv.setText(data);
                    drv.setSelectionStart(l);
                    drv.setSelectionEnd(data.length());
                    break;
                }
            }
        }
    }//GEN-LAST:event_drvKeyReleased

    private void EntrySaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrySaveButtonActionPerformed

        String d,m,y,co,vn,vno1,a,c,dr,cno,dt="";
        try
        {
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        dt = sdf.format(d1.getDate());}
        catch(Exception e)
        { 
             JOptionPane.showMessageDialog(null,"Please select proper Date","Date Error",JOptionPane.ERROR_MESSAGE);
             return;
        }
        c=com.getText();
        co=par.getText();
        vn=vname.getText();
        vno1=vno.getText();
        a=amt.getText();
        cno=ch.getText();
        dr=drv.getText();

        int flag1=0,flag2=0;
        try
        {
            int x;
            String comp[] = new String[100];
            String drvv[] = new String[100];
            String co1=com.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
            Statement s = con.createStatement();
            ResultSet rs1 = s.executeQuery("Select * from company");
            ResultSet rs2 = s.executeQuery("Select * from driver");
            int i=0;
            while(rs1.next())
            { i++;
                comp[i]=(String)rs1.getString(1);
                if(co1.contentEquals(comp[i]))
                flag1=1;
            }
            i=0;
            while(rs2.next())
            { i++;
                drvv[i]=(String)rs2.getString(1);
                if(dr.contentEquals(drvv[i]))
                flag2=1;
            }
            con.close();
        }
        catch(Exception ex) { System.out.println(ex);  }

        if(dt.contentEquals("")||co.contentEquals("")||vn.contentEquals("")||
            vno1.contentEquals("")||a.contentEquals("")||c.contentEquals("")||dr.contentEquals(""))
        {    
            JOptionPane.showMessageDialog(null,"Fields are Empty","Login Error",JOptionPane.ERROR_MESSAGE); }

        else if( flag1==1  )
        JOptionPane.showMessageDialog(null,"Company does not Exists,  Please Register","Login Error",JOptionPane.ERROR_MESSAGE);

        else if( flag2==1  )
        JOptionPane.showMessageDialog(null,"Driver does not Exists,  Please Register","Login Error",JOptionPane.ERROR_MESSAGE);

        else
        {
            try{
                int x;
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
                Statement s = con.createStatement();
                x = s.executeUpdate("Insert into data values('"+dt+"','"+c+"','"+co+"','"+cno+"','"+dr+"','"+vn+"','"+vno1+"',"+a+");");
                if(x!=0)
                {
                    JOptionPane.showMessageDialog(null,"Registered Successfully","Registration",JOptionPane.INFORMATION_MESSAGE);}
                com.setText(null);
                d1.setDate(null);
                par.setText(null);
                vname.setText(null);
                vno.setText(null);
                amt.setText(null);
                ch.setText(null);
                drv.setText(null);
                con.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_EntrySaveButtonActionPerformed

    private void BackFromDrvListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackFromDrvListButtonActionPerformed
        Homepane.setVisible(false);
        DrvPane.setVisible(true);
        CmpPane.setVisible(false);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(false);
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(false);
        DrvTripPane.setVisible(false);
        CmpTripViewPane.setVisible(false);
        CmpTripPane.setVisible(false);
     
    }//GEN-LAST:event_BackFromDrvListButtonActionPerformed

    private void DrvNoTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrvNoTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DrvNoTBActionPerformed

    private void DrvNameTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrvNameTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DrvNameTBActionPerformed

    private void RegDrvDBButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegDrvDBButActionPerformed
        String[] driver = new String[100];
        try
        {
            int x;
            String drv=DrvNameTB.getText();
            String p=DrvNoTB.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
            PreparedStatement s = con.prepareStatement("INSERT INTO driver VALUES(?,?)");
            s.setString(1,drv);
            s.setString(2,p);
            ResultSet rs = s.executeQuery("Select * from driver");
            int i=0,flag=0;
            while(rs.next())
            { i++;
                driver[i]=(String)rs.getString(1);
                if(drv.equalsIgnoreCase(driver[i]))
                flag=1;
            }
            String mno="(0/91)?[7-9][0-9]{9}";
            Pattern pat= Pattern.compile(mno);
            if( flag==1  )
            JOptionPane.showMessageDialog(null,"Driver already exists","Login Error",JOptionPane.ERROR_MESSAGE);

            else if( (drv.contentEquals("")) )
            JOptionPane.showMessageDialog(null,"TextBox Empty","Login Error",JOptionPane.ERROR_MESSAGE);

            else if (!(pat.matcher(p).matches() )) {
                JOptionPane.showMessageDialog(null,"Invalid Phone No","Login Error",JOptionPane.ERROR_MESSAGE);
                DrvNoTB.setText(null);
            }
            else{
                x = s.executeUpdate();
                JOptionPane.showMessageDialog(null,"Registered Successfully","Registration",JOptionPane.INFORMATION_MESSAGE);
                DrvNameTB.setText(null);
                DrvNoTB.setText(null);
            }
        }
        catch(Exception ex) { System.out.println(ex);  }

    }//GEN-LAST:event_RegDrvDBButActionPerformed

    private void BackButtontoMyDriversActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtontoMyDriversActionPerformed
        Homepane.setVisible(false);
        DrvPane.setVisible(true);
        CmpPane.setVisible(false);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        RegDrvPane.setVisible(false);      
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(false);
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(false);
        DrvTripPane.setVisible(false);
        CmpTripViewPane.setVisible(false);
        CmpTripPane.setVisible(false);
    }//GEN-LAST:event_BackButtontoMyDriversActionPerformed

    private void BacktoDrvsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BacktoDrvsButtonActionPerformed
        Homepane.setVisible(false);
        DrvPane.setVisible(true);
        CmpPane.setVisible(false);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        RegDrvPane.setVisible(false);      
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(false);
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(false);
        DrvTripPane.setVisible(false);
        CmpTripViewPane.setVisible(false);
        CmpTripPane.setVisible(false);
    }//GEN-LAST:event_BacktoDrvsButtonActionPerformed

    private void DelDrvDbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelDrvDbButtonActionPerformed
        String s = (String) DrvLJistToDelete.getSelectedValue();
        try
        {
            int x;

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
            Statement st = con.createStatement();

            if(JOptionPane.showConfirmDialog(this,"Are you sure if you want to Delete "+s+" ?","Delete  Driver",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
            { x = st.executeUpdate(" Delete from driver where name='"+s+"';");
                JOptionPane.showMessageDialog(null,"Deleted Successfully","Deletion",JOptionPane.INFORMATION_MESSAGE);}
            
              String[] drv= new String[100];
      try{
        int i;
           Class.forName("com.mysql.cj.jdbc.Driver");
           ResultSet rs = st.executeQuery("Select * from driver"); 
           i=0; 
           while(rs.next())
           { i++;
           drv[i]=(String)rs.getString(1);
           }
       }
        catch(Exception e){System.out.println(e);}
         DrvLJistToDelete.setModel(new javax.swing.AbstractListModel<String>() {
    public int getSize() { return drv.length; }
    public String getElementAt(int j) { return drv[j]; }
});// Refreshing deleted list of drivers
            con.close();
        }
        catch(Exception e){System.out.println(e);}

    }//GEN-LAST:event_DelDrvDbButtonActionPerformed

    private void BackButtomFrmCompListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtomFrmCompListActionPerformed

        Homepane.setVisible(false);
        CmpPane.setVisible(true);
        DrvPane.setVisible(false);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        RegDrvPane.setVisible(false);
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(false);      
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(false);
        DrvTripPane.setVisible(false);
        CmpTripViewPane.setVisible(false);
        CmpTripPane.setVisible(false);
    }//GEN-LAST:event_BackButtomFrmCompListActionPerformed

    private void EnterTextRegCMPTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterTextRegCMPTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterTextRegCMPTBActionPerformed

    private void BckButtonRegCmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BckButtonRegCmpActionPerformed
        Homepane.setVisible(false);
        DrvPane.setVisible(false);
        CmpPane.setVisible(true);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        RegDrvPane.setVisible(false);
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(false);
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(false);
        DrvTripPane.setVisible(false);
        CmpTripViewPane.setVisible(false);
        CmpTripPane.setVisible(false);
    }//GEN-LAST:event_BckButtonRegCmpActionPerformed

    private void SaveRegCmpButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveRegCmpButtActionPerformed
       String[] comp = new String[100];
        try
        {
            int x;
            String co=EnterTextRegCMPTB.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("Select * from company");
            int i=0,flag=0;
            while(rs.next())
            { i++;
                comp[i]=(String)rs.getString(1);
                if(co.equalsIgnoreCase(comp[i]))
                flag=1;
            }

            if( (co.contentEquals("")) )
            JOptionPane.showMessageDialog(null,"TextBox Empty","Login Error",JOptionPane.ERROR_MESSAGE);

            else if( flag==1  )
            JOptionPane.showMessageDialog(null,"Company already exists","Login Error",JOptionPane.ERROR_MESSAGE);

            else{
                x = s.executeUpdate("INSERT INTO company VALUES('"+co+"')");
                JOptionPane.showMessageDialog(null,"Registered Successfully","Registration",JOptionPane.INFORMATION_MESSAGE);
                EnterTextRegCMPTB.setText(null);
            }
        }
        catch(Exception ex) { System.out.println(ex);  }
    }//GEN-LAST:event_SaveRegCmpButtActionPerformed

    private void BackDelCmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackDelCmpActionPerformed
        Homepane.setVisible(false);
        DrvPane.setVisible(false);
        CmpPane.setVisible(true);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        RegDrvPane.setVisible(false);
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(false);
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(false);
        DrvTripPane.setVisible(false);
        CmpTripViewPane.setVisible(false);
        CmpTripPane.setVisible(false);
    }//GEN-LAST:event_BackDelCmpActionPerformed

    private void delCmpDBbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delCmpDBbuttonActionPerformed
        String s = (String) CmpDelJlist.getSelectedValue();
        try
        {
            int x;

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
            Statement st = con.createStatement();

            if(JOptionPane.showConfirmDialog(this,"Are you sure if you want to Delete Company "+s+" ?","Delete  Company",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
            { x = st.executeUpdate(" Delete from company where co='"+s+"';");
                JOptionPane.showMessageDialog(null,"Deleted Successfully","Deletion",JOptionPane.INFORMATION_MESSAGE);}
           //Refreshh the deleted part
             String comp[] = new String[100];
    try{
        int i;
           Class.forName("com.mysql.cj.jdbc.Driver");
          
           ResultSet rs = st.executeQuery("Select * from company"); 
           i=0; 
           while(rs.next())
           { i++;
           comp[i]=(String)rs.getString(1);
           }
           con.close();
       }
        catch(Exception e){System.out.println(e);}
         CmpDelJlist.setModel(new javax.swing.AbstractListModel<String>() {
    public int getSize() { return comp.length; }
    public String getElementAt(int j) { return comp[j]; }
});  
            
            con.close();
        }
        catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_delCmpDBbuttonActionPerformed

    private void JlistDrvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlistDrvMouseClicked
 String s = (String) JlistDrv.getSelectedValue();
 String name,phno;
        try{
       
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyApp","root","sourya");
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery(" Select * from driver where name='"+s+"';"); 
           while(rs.next())
           {
           name=(String)rs.getString(1);
           phno=(String)rs.getString(2);
          SetTextboxDrvName.setText(name);
          SetTextBoxDrvNo.setText(phno);}
           con.close();
        }
        catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_JlistDrvMouseClicked

    private void ViewDrvTripButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDrvTripButtonActionPerformed
 String s = (String) DrvListTripInfoJlist.getSelectedValue();
 int flag=0;
if(s==null)
{
    flag=1;
 JOptionPane.showMessageDialog(null,"Please select a driver and try again.","Driver Not Selected",JOptionPane.ERROR_MESSAGE);
}
else
   {
       try{
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd");
        String dt1 = sdf.format(DrvStrtate.getDate());
        String dt2 = sdf.format(DrvEndDate.getDate());
       DisplayTableDriver(s,dt1,dt2);
    }
catch(Exception e)
   {   JOptionPane.showMessageDialog(null,"Please select Both the Dates.","Dates Not Found",JOptionPane.ERROR_MESSAGE);
flag=1;   
   } }
if(flag==0){
       Homepane.setVisible(false);
        DrvPane.setVisible(false);
        CmpPane.setVisible(false);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        RegDrvPane.setVisible(false);
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(false);
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(false);
        DrvTripPane.setVisible(true);
        CmpTripViewPane.setVisible(false);
        CmpTripPane.setVisible(false);
}
// TODO add your handling code here:
    
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewDrvTripButtonActionPerformed

    private void BacFrmDrvTripButtonComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BacFrmDrvTripButtonComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_BacFrmDrvTripButtonComponentHidden

    private void BacFrmDrvTripButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BacFrmDrvTripButtonActionPerformed
        Homepane.setVisible(false);
        DrvPane.setVisible(false);
        CmpPane.setVisible(false);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        RegDrvPane.setVisible(false);
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(false);
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(true);
        DrvTripPane.setVisible(false);    
        CmpTripViewPane.setVisible(false);
        CmpTripPane.setVisible(false);
    }//GEN-LAST:event_BacFrmDrvTripButtonActionPerformed

    private void PrintDrvTripsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintDrvTripsActionPerformed

       
    }//GEN-LAST:event_PrintDrvTripsActionPerformed

    private void ViewDrvTripButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDrvTripButton1ActionPerformed
       String s = (String)Jlist.getSelectedValue();
      int flag =0;
if(s==null)
{
 JOptionPane.showMessageDialog(null,"Please select a Company and try again.","Company Not Selected",JOptionPane.ERROR_MESSAGE);
 flag=1;
}
else
   {
       try{
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd");
        String dt1 = sdf.format(DrvStrtate1.getDate());
        String dt2 = sdf.format(DrvEndDate1.getDate());
       DisplayTableCompany(s,dt1,dt2);
    }
catch(Exception e)
   {   JOptionPane.showMessageDialog(null,"Please select Both the Dates.","Dates Not Found",JOptionPane.ERROR_MESSAGE);
   flag=1;
   } }
if(flag==0){
       Homepane.setVisible(false);
        DrvPane.setVisible(false);
        CmpPane.setVisible(false);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        RegDrvPane.setVisible(false);
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(false);
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(false);
        DrvTripPane.setVisible(false);    
        CmpTripViewPane.setVisible(false);
        CmpTripPane.setVisible(true);
}
    }//GEN-LAST:event_ViewDrvTripButton1ActionPerformed

    private void BacFrmCmpTripButtonComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BacFrmCmpTripButtonComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_BacFrmCmpTripButtonComponentHidden

    private void BacFrmCmpTripButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BacFrmCmpTripButtonActionPerformed
        Homepane.setVisible(false);
        DrvPane.setVisible(false);
        CmpPane.setVisible(false);
        DailyEntryPane.setVisible(false);
        DrvView.setVisible(false);
        RegDrvPane.setVisible(false);
        DelDrvPane.setVisible(false);
        CmpViewPane.setVisible(false);
        CmpRegPane.setVisible(false);
        DelCmpPane.setVisible(false);
        DrvTripViewPane.setVisible(false);
        DrvTripPane.setVisible(false);    
        CmpTripViewPane.setVisible(true);
         CmpTripPane.setVisible(false);        
    }//GEN-LAST:event_BacFrmCmpTripButtonActionPerformed

    private void PrintDCmpTripsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintDCmpTripsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintDCmpTripsActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BacFrmCmpTripButton;
    private javax.swing.JButton BacFrmDrvTripButton;
    private javax.swing.JButton BackButtomFrmCompList;
    private javax.swing.JButton BackButtontoMyDrivers;
    private javax.swing.JButton BackDelCmp;
    private javax.swing.JButton BackFromDrvListButton;
    private javax.swing.JButton BacktoDrvsButton;
    private javax.swing.JButton BckButtonRegCmp;
    private javax.swing.JLabel BharatLab;
    private javax.swing.JLabel CloseLab;
    private javax.swing.JList<String> CmpDelJlist;
    private javax.swing.JTable CmpJtable;
    private javax.swing.JList<String> CmpList;
    private javax.swing.JPanel CmpPane;
    private javax.swing.JPanel CmpRegPane;
    private javax.swing.JPanel CmpTripPane;
    private javax.swing.JPanel CmpTripViewPane;
    private javax.swing.JPanel CmpViewPane;
    private javax.swing.JLabel CompanyBillsLab;
    private javax.swing.JPanel ContainerPane;
    private javax.swing.JLabel DailyEntryLab;
    private javax.swing.JPanel DailyEntryPane;
    private javax.swing.JPanel Dashbar;
    private javax.swing.JLabel DashboardLab;
    private javax.swing.JButton DelCmpButton;
    private javax.swing.JLabel DelCmpLab;
    private javax.swing.JPanel DelCmpPane;
    private javax.swing.JButton DelDrvDbButton;
    private javax.swing.JLabel DelDrvLab;
    private javax.swing.JPanel DelDrvPane;
    private javax.swing.JButton DeleteDrvButton;
    private javax.swing.JLabel DriverBusinessLab;
    private com.toedter.calendar.JDateChooser DrvEndDate;
    private com.toedter.calendar.JDateChooser DrvEndDate1;
    private javax.swing.JLabel DrvEndLab;
    private javax.swing.JLabel DrvEndLab1;
    private javax.swing.JTable DrvJtable;
    private javax.swing.JList<String> DrvLJistToDelete;
    private javax.swing.JList<String> DrvListTripInfoJlist;
    private javax.swing.JTextField DrvNameTB;
    private javax.swing.JTextField DrvNoTB;
    private javax.swing.JPanel DrvPane;
    private javax.swing.JLabel DrvStrtLab;
    private javax.swing.JLabel DrvStrtLab1;
    private com.toedter.calendar.JDateChooser DrvStrtate;
    private com.toedter.calendar.JDateChooser DrvStrtate1;
    private javax.swing.JPanel DrvTripPane;
    private javax.swing.JPanel DrvTripViewPane;
    private javax.swing.JPanel DrvView;
    private javax.swing.JTextField EnterTextRegCMPTB;
    private javax.swing.JLabel EnternameLabCmpreg;
    private javax.swing.JLabel EntryAmtLab;
    private javax.swing.JLabel EntryBnameLab;
    private javax.swing.JLabel EntryChallanLAb;
    private javax.swing.JLabel EntryCmpLab;
    private javax.swing.JLabel EntryDateLabel;
    private javax.swing.JLabel EntryDrvLabel;
    private javax.swing.JButton EntrySaveButton;
    private javax.swing.JLabel EntryVnoLab;
    private javax.swing.JLabel EntryparticularsLab;
    private javax.swing.JPanel Homepane;
    private javax.swing.JList<String> Jlist;
    private javax.swing.JList<String> JlistDrv;
    private javax.swing.JLabel MinimizeLab;
    private javax.swing.JLabel MyCmpsLab;
    private javax.swing.JLabel MyDriversLab;
    private javax.swing.JLabel NameLABDrvView;
    private javax.swing.JLabel PhnoLabDrvView;
    private javax.swing.JButton PrintDCmpTrips;
    private javax.swing.JButton PrintDrvTrips;
    private javax.swing.JButton RegCmpButton;
    private javax.swing.JButton RegDrvDBBut;
    private javax.swing.JPanel RegDrvPane;
    private javax.swing.JLabel RegisterCmpLab;
    private javax.swing.JButton RegisterDrvButton;
    private javax.swing.JLabel RegisterDrvLab;
    private javax.swing.JButton SaveRegCmpButt;
    private javax.swing.JLabel SelectCmpLAB;
    private javax.swing.JLabel SelectDrvLab;
    private javax.swing.JLabel SelectDrvLab1;
    private javax.swing.JLabel SelectdrvToDelLAB;
    private javax.swing.JLabel SetTextBoxDrvNo;
    private javax.swing.JLabel SetTextboxDrvName;
    private javax.swing.JLabel TruckImg;
    private javax.swing.JButton ViewCmpButton;
    private javax.swing.JLabel ViewCmpLab;
    private javax.swing.JButton ViewDrvButton;
    private javax.swing.JLabel ViewDrvLab;
    private javax.swing.JButton ViewDrvTripButton;
    private javax.swing.JButton ViewDrvTripButton1;
    private javax.swing.JTextField amt;
    private javax.swing.JTextField ch;
    private javax.swing.JTextField com;
    private com.toedter.calendar.JDateChooser d1;
    private javax.swing.JPanel dashpane;
    private javax.swing.JButton delCmpDBbutton;
    private javax.swing.JTextField drv;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel pan_centre;
    private javax.swing.JTextField par;
    private javax.swing.JPanel pp1;
    private javax.swing.JPanel pp2;
    private javax.swing.JPanel pp3;
    private javax.swing.JPanel pp4;
    private javax.swing.JPanel pp5;
    private javax.swing.JPanel sidebar;
    private javax.swing.JTextField vname;
    private javax.swing.JTextField vno;
    // End of variables declaration//GEN-END:variables
}
