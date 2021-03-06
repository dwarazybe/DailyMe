package client;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MainFrame extends javax.swing.JFrame {
    private RegisterDialog registerDialog;
    private TextMessageDialog msgDialog;
    
    private final String hostAddress = "127.0.0.1";
    private final int PORT = 8754;
    private BufferedReader in;
    private PrintWriter out;
    private String receivedMessage;
    
    private Thread broadcastThread;
    private Thread loadingThread;
    
    private int positionX;
    private int positionY;
    
    private final WorkoutCalculator workoutCalc;
    private final BmrCalculator bmrCalc;
    private final BmiCalculator bmiCalc;
    private final BfiCalculator bfiCalc;
    private final Validators val;
    private final SHA256 sha256;
    
    private AddMealDialog addMealDialog;
    private LoadingDialog loadingDialog;
    
    protected double weight;
    protected int time;
    protected double kcal;
    protected int height;
    protected int age;
    protected int waist;
    protected int calcGender = 0;
    protected int intensityLevel = 2;
    protected double activityLevel = 1.2;
    
    private double totalKcal = 0.0;
    private double totalProteins = 0.0;
    private double totalFats = 0.0;
    private double totalCarbs = 0.0;
    
    private String username;
    private String password;
    private String encryptedPassword; 
    private String usertype;
    
    protected boolean threadExit = false;
    private boolean notesEditable = false;
    
    private int lastActivitiesCounter = 0;
    
    private int sportSelected = 0;
    private boolean modifyNotesButtonActive = false;

    DecimalFormat df = new DecimalFormat("##.#"); 
    
    
    public MainFrame() {
        this.workoutCalc = new WorkoutCalculator();
        this.bmrCalc = new BmrCalculator();
        this.bmiCalc = new BmiCalculator();
        this.bfiCalc = new BfiCalculator();
        this.val = new Validators();
        this.sha256 = new SHA256();
        initDatabase();
        initComponents();   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startupPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        loginIcon = new javax.swing.JLabel();
        titleText = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        loginTextFieldBar = new javax.swing.JLabel();
        passwordIcon = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordFieldBar = new javax.swing.JLabel();
        warningText = new javax.swing.JLabel();
        warningText1 = new javax.swing.JLabel();
        registerButton = new javax.swing.JPanel();
        registerButtonText = new javax.swing.JLabel();
        registerButtonLowerBar = new javax.swing.JLabel();
        loginButton = new javax.swing.JPanel();
        loginButtonText = new javax.swing.JLabel();
        loginButtonBackground = new javax.swing.JLabel();
        loginButtonBackgroundActive = new javax.swing.JLabel();
        upperBar = new javax.swing.JLabel();
        startupPanelCloseButton = new javax.swing.JPanel();
        startupPanelCloseButtonInactiveIcon = new javax.swing.JLabel();
        startupPanelCloseButtonActiveIcon = new javax.swing.JLabel();
        startupPanelMinimizeButton = new javax.swing.JPanel();
        startupPanelMinimizeButtonInactiveIcon = new javax.swing.JLabel();
        startupPanelMinimizeButtonActiveIcon = new javax.swing.JLabel();
        startupPanelBackground = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        myProfileButton = new javax.swing.JPanel();
        myProfileButtonText = new javax.swing.JLabel();
        myProfileButtonIcon = new javax.swing.JLabel();
        myProfileButtonBar = new javax.swing.JLabel();
        mealDiaryButton = new javax.swing.JPanel();
        mealDiaryButtonText = new javax.swing.JLabel();
        mealDiaryButtonIcon = new javax.swing.JLabel();
        mealDiaryButtonBar = new javax.swing.JLabel();
        workoutDiaryButton = new javax.swing.JPanel();
        workoutDiaryButtonText = new javax.swing.JLabel();
        workoutDiaryButtonIcon = new javax.swing.JLabel();
        workoutDiaryButtonBar = new javax.swing.JLabel();
        statsButton = new javax.swing.JPanel();
        statsButtonText = new javax.swing.JLabel();
        statsButtonIcon = new javax.swing.JLabel();
        statsButtonBar = new javax.swing.JLabel();
        calcButton = new javax.swing.JPanel();
        calcButtonText = new javax.swing.JLabel();
        calcButtonIcon = new javax.swing.JLabel();
        calcButtonBar = new javax.swing.JLabel();
        infoButton = new javax.swing.JPanel();
        infoButtonText = new javax.swing.JLabel();
        infoButtonIcon = new javax.swing.JLabel();
        infoButtonBar = new javax.swing.JLabel();
        closeButton = new javax.swing.JPanel();
        closeButtonIcon = new javax.swing.JLabel();
        closeButtonIconActive = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JPanel();
        minimizeButtonIcon = new javax.swing.JLabel();
        minimizeButtonIconActive = new javax.swing.JLabel();
        loginInfo = new javax.swing.JPanel();
        logoutButton = new javax.swing.JPanel();
        logoutButtonText = new javax.swing.JLabel();
        loginInfoUsernameTextField = new javax.swing.JTextField();
        myProfilePanel = new javax.swing.JPanel();
        myProfileBanner = new javax.swing.JLabel();
        namePanel = new javax.swing.JPanel();
        profileNameText = new javax.swing.JLabel();
        profileNameLowerBar = new javax.swing.JLabel();
        profileNameTextField = new javax.swing.JTextField();
        kcalPanel = new javax.swing.JPanel();
        todayKcalText = new javax.swing.JLabel();
        kcalIcon = new javax.swing.JLabel();
        kcalValueTextField = new javax.swing.JTextField();
        userParamPanel = new javax.swing.JPanel();
        bmiText = new javax.swing.JLabel();
        bmiValueTextField = new javax.swing.JTextField();
        bmiRateText = new javax.swing.JLabel();
        bmiRateValueTextField = new javax.swing.JTextField();
        goalText = new javax.swing.JLabel();
        goalValueTextField = new javax.swing.JTextField();
        goalLeftText = new javax.swing.JLabel();
        goalLeftTextField = new javax.swing.JTextField();
        bmiValueTextField2 = new javax.swing.JTextField();
        maleIcon = new javax.swing.JLabel();
        femaleIcon = new javax.swing.JLabel();
        weightValuePanel = new javax.swing.JPanel();
        weightText = new javax.swing.JLabel();
        weightValueTextField = new javax.swing.JTextField();
        heightText = new javax.swing.JLabel();
        heightValueTextField = new javax.swing.JTextField();
        ageText = new javax.swing.JLabel();
        ageValueTextField = new javax.swing.JTextField();
        modifyParamsToggleButton = new javax.swing.JPanel();
        modifyParamsToggleButtonOn = new javax.swing.JLabel();
        modifyParamsToggleButtonOff = new javax.swing.JLabel();
        notesPanel = new javax.swing.JPanel();
        notesText = new javax.swing.JLabel();
        notesScrollPane = new javax.swing.JScrollPane();
        notesTextArea = new javax.swing.JTextArea();
        saveNotesButton = new javax.swing.JLabel();
        modifyNotesButton = new javax.swing.JLabel();
        lastActivitiesPanel = new javax.swing.JPanel();
        lastActivitiesText = new javax.swing.JLabel();
        lastActivity1Panel = new javax.swing.JPanel();
        lastActivity1UsernameTextField = new javax.swing.JTextField();
        lastActivity1MessageTextField = new javax.swing.JTextField();
        lastActivity2Panel = new javax.swing.JPanel();
        lastActivity2UsernameTextField = new javax.swing.JTextField();
        lastActivity2MessageTextField = new javax.swing.JTextField();
        lastActivity3Panel = new javax.swing.JPanel();
        lastActivity3UsernameTextField = new javax.swing.JTextField();
        lastActivity3MessageTextField = new javax.swing.JTextField();
        lastActivity4Panel = new javax.swing.JPanel();
        lastActivity4UsernameTextField = new javax.swing.JTextField();
        lastActivity4MessageTextField = new javax.swing.JTextField();
        lastActivity5Panel = new javax.swing.JPanel();
        lastActivity5UsernameTextField = new javax.swing.JTextField();
        lastActivity5MessageTextField = new javax.swing.JTextField();
        mealDiaryPanel = new javax.swing.JPanel();
        mealDiaryBanner = new javax.swing.JLabel();
        mealListPanel = new javax.swing.JPanel();
        meal1Panel = new javax.swing.JPanel();
        meal1NameTextField = new javax.swing.JTextField();
        meal1KcalText = new javax.swing.JLabel();
        meal1KcalValueTextField = new javax.swing.JTextField();
        meal1ProteinsText = new javax.swing.JLabel();
        meal1ProteinsValueTextField = new javax.swing.JTextField();
        meal1FatsText = new javax.swing.JLabel();
        meal1FatsValueTextField = new javax.swing.JTextField();
        meal1CarbsText = new javax.swing.JLabel();
        meal1CarbsValueTextField = new javax.swing.JTextField();
        meal2Panel = new javax.swing.JPanel();
        meal2NameTextField = new javax.swing.JTextField();
        meal2KcalText = new javax.swing.JLabel();
        meal2KcalValueTextField = new javax.swing.JTextField();
        meal2ProteinsText = new javax.swing.JLabel();
        meal2ProteinsValueTextField = new javax.swing.JTextField();
        meal2FatsText = new javax.swing.JLabel();
        meal2FatsValueTextField = new javax.swing.JTextField();
        meal2CarbsText = new javax.swing.JLabel();
        meal2CarbsValueTextField = new javax.swing.JTextField();
        meal3Panel = new javax.swing.JPanel();
        meal3NameTextField = new javax.swing.JTextField();
        meal3KcalText = new javax.swing.JLabel();
        meal3KcalValueTextField = new javax.swing.JTextField();
        meal3ProteinsText = new javax.swing.JLabel();
        meal3ProteinsValueTextField = new javax.swing.JTextField();
        meal3FatsText = new javax.swing.JLabel();
        meal3FatsValueTextField = new javax.swing.JTextField();
        meal3CarbsText = new javax.swing.JLabel();
        meal3CarbsValueTextField = new javax.swing.JTextField();
        meal4Panel = new javax.swing.JPanel();
        meal4NameTextField = new javax.swing.JTextField();
        meal4KcalText = new javax.swing.JLabel();
        meal4KcalValueTextField = new javax.swing.JTextField();
        meal4ProteinsText = new javax.swing.JLabel();
        meal4ProteinsValueTextField = new javax.swing.JTextField();
        meal4FatsText = new javax.swing.JLabel();
        meal4FatsValueTextField = new javax.swing.JTextField();
        meal4CarbsText = new javax.swing.JLabel();
        meal4CarbsValueTextField = new javax.swing.JTextField();
        meal5Panel = new javax.swing.JPanel();
        meal5NameTextField = new javax.swing.JTextField();
        meal5KcalText = new javax.swing.JLabel();
        meal5KcalValueTextField = new javax.swing.JTextField();
        meal5ProteinsText = new javax.swing.JLabel();
        meal5ProteinsValueTextField = new javax.swing.JTextField();
        meal5FatsText = new javax.swing.JLabel();
        meal5FatsValueTextField = new javax.swing.JTextField();
        meal5CarbsText = new javax.swing.JLabel();
        meal5CarbsValueTextField = new javax.swing.JTextField();
        meal6Panel = new javax.swing.JPanel();
        meal6NameTextField = new javax.swing.JTextField();
        meal6KcalText = new javax.swing.JLabel();
        meal6KcalValueTextField = new javax.swing.JTextField();
        meal6ProteinsText = new javax.swing.JLabel();
        meal6ProteinsValueTextField = new javax.swing.JTextField();
        meal6FatsText = new javax.swing.JLabel();
        meal6FatsValueTextField = new javax.swing.JTextField();
        meal6CarbsText = new javax.swing.JLabel();
        meal6CarbsValueTextField = new javax.swing.JTextField();
        meal7Panel = new javax.swing.JPanel();
        meal7NameTextField = new javax.swing.JTextField();
        meal7KcalText = new javax.swing.JLabel();
        meal7KcalValueTextField = new javax.swing.JTextField();
        meal7ProteinsText = new javax.swing.JLabel();
        meal7ProteinsValueTextField = new javax.swing.JTextField();
        meal7FatsText = new javax.swing.JLabel();
        meal7FatsValueTextField = new javax.swing.JTextField();
        meal7CarbsText = new javax.swing.JLabel();
        meal7CarbsValueTextField = new javax.swing.JTextField();
        meal8Panel = new javax.swing.JPanel();
        meal8NameTextField = new javax.swing.JTextField();
        meal8KcalText = new javax.swing.JLabel();
        meal8KcalValueTextField = new javax.swing.JTextField();
        meal8ProteinsText = new javax.swing.JLabel();
        meal8ProteinsValueTextField = new javax.swing.JTextField();
        meal8FatsText = new javax.swing.JLabel();
        meal8FatsValueTextField = new javax.swing.JTextField();
        meal8CarbsText = new javax.swing.JLabel();
        meal8CarbsValueTextField = new javax.swing.JTextField();
        mealInfoPanel = new javax.swing.JPanel();
        totalKcalText = new javax.swing.JLabel();
        totalKcalValueTextField = new javax.swing.JTextField();
        totalProteinsText = new javax.swing.JLabel();
        totalProteinsValueTextField = new javax.swing.JTextField();
        totalFatsText = new javax.swing.JLabel();
        totalFatsValueTextField = new javax.swing.JTextField();
        totalCarbsText = new javax.swing.JLabel();
        totalCarbsValueTextField = new javax.swing.JTextField();
        addMealButton = new javax.swing.JPanel();
        addMealButtonText = new javax.swing.JLabel();
        closeDayButton = new javax.swing.JPanel();
        closeDayButtonText = new javax.swing.JLabel();
        workoutDiaryPanel = new javax.swing.JPanel();
        workoutDiaryBanner = new javax.swing.JLabel();
        selectSportBar = new javax.swing.JPanel();
        selectRunningBar = new javax.swing.JLabel();
        selectLiftingBar = new javax.swing.JLabel();
        selectBikeRidingBar = new javax.swing.JLabel();
        selectFootballBar = new javax.swing.JLabel();
        selectSwimmingBar = new javax.swing.JLabel();
        selectSkatingBar = new javax.swing.JLabel();
        selectYogaBar = new javax.swing.JLabel();
        selectJumpingRopeBar = new javax.swing.JLabel();
        selectSportPanel = new javax.swing.JPanel();
        selectRunningButton = new javax.swing.JPanel();
        selectRunningBannerBw = new javax.swing.JLabel();
        selectRunningBannerColor = new javax.swing.JLabel();
        selectLiftingButton = new javax.swing.JPanel();
        selectLiftingBannerBw = new javax.swing.JLabel();
        selectLiftingBannerColor = new javax.swing.JLabel();
        selectBikeRidingButton = new javax.swing.JPanel();
        selectBikeRidingBannerBw = new javax.swing.JLabel();
        selectBikeRidingBannerColor = new javax.swing.JLabel();
        selectFootballButton = new javax.swing.JPanel();
        selectFootballBannerBw = new javax.swing.JLabel();
        selectFootballBannerColor = new javax.swing.JLabel();
        selectSwimmingButton = new javax.swing.JPanel();
        selectSwimmingBannerBw = new javax.swing.JLabel();
        selectSwimmingBannerColor = new javax.swing.JLabel();
        selectSkatingButton = new javax.swing.JPanel();
        selectSkatingBannerBw = new javax.swing.JLabel();
        selectSkatingBannerColor = new javax.swing.JLabel();
        selectYogaButton = new javax.swing.JPanel();
        selectYogaBannerBw = new javax.swing.JLabel();
        selectYogaBannerColor = new javax.swing.JLabel();
        selectJumpingRopeButton = new javax.swing.JPanel();
        selectJumpingRopeBannerBw = new javax.swing.JLabel();
        selectJumpingRopeBannerColor = new javax.swing.JLabel();
        workoutDetailsInfoPanel = new javax.swing.JPanel();
        selectSportText = new javax.swing.JLabel();
        workoutDetailsPanel = new javax.swing.JPanel();
        workoutDetailsWeightText = new javax.swing.JLabel();
        workoutDetailsWeightTextField = new javax.swing.JTextField();
        workoutDetailsWeightTextFieldBar = new javax.swing.JLabel();
        workoutDetailsTimeText = new javax.swing.JLabel();
        workoutDetailsTimeTextField = new javax.swing.JTextField();
        workoutDetailsTimeTextFieldBar = new javax.swing.JLabel();
        workoutDetailsIntensityLevelText = new javax.swing.JLabel();
        workoutDetailsIntensityLowText = new javax.swing.JLabel();
        workoutDetailsIntensityMediumText = new javax.swing.JLabel();
        workoutDetailsIntensityHighText = new javax.swing.JLabel();
        workoutDetailsIntensityPanel = new javax.swing.JPanel();
        verticalBar1 = new javax.swing.JLabel();
        verticalBar2 = new javax.swing.JLabel();
        workoutDetailsIntensityLevel1Button = new javax.swing.JPanel();
        workoutDetailsIntensityLevel1ButtonFill = new javax.swing.JLabel();
        workoutDetailsIntensityLevel2Button = new javax.swing.JPanel();
        workoutDetailsIntensityLevel2ButtonFill = new javax.swing.JLabel();
        workoutDetailsIntensityLevel3Button = new javax.swing.JPanel();
        workoutDetailsIntensityLevel3ButtonFill = new javax.swing.JLabel();
        workoutDetailsSportNameTextField = new javax.swing.JTextField();
        workoutDetailsKcalText = new javax.swing.JLabel();
        workoutDetailsKcalValueTextField = new javax.swing.JTextField();
        workoutDetailsSaveButton = new javax.swing.JPanel();
        workoutDetailsSaveButtonText = new javax.swing.JLabel();
        statsPanel = new javax.swing.JPanel();
        statsBanner = new javax.swing.JLabel();
        kcalStatsPanel = new javax.swing.JPanel();
        MealsText = new javax.swing.JLabel();
        averageDailyKcalText = new javax.swing.JLabel();
        averageDailyKcalValueTextField = new javax.swing.JTextField();
        averageDailyMacrosText = new javax.swing.JLabel();
        averageDailyProteinsValueTextField = new javax.swing.JTextField();
        averageDailyFatsValueTextField = new javax.swing.JTextField();
        averageDailyCarbsValueTextField = new javax.swing.JTextField();
        bar1 = new javax.swing.JLabel();
        mostDailyKcalText = new javax.swing.JLabel();
        mostDailyKcalValueTextField = new javax.swing.JTextField();
        mostDailyKcalDateText = new javax.swing.JLabel();
        mostDailyKcalDateTextField = new javax.swing.JTextField();
        bar2 = new javax.swing.JLabel();
        leastDailyKcalText = new javax.swing.JLabel();
        leastDailyKcalValueTextField = new javax.swing.JTextField();
        leastDailyKcalDateText = new javax.swing.JLabel();
        leastDailyKcalDateTextField = new javax.swing.JTextField();
        bar3 = new javax.swing.JLabel();
        kcalSumText = new javax.swing.JLabel();
        kcalSumValueTextField = new javax.swing.JTextField();
        kcalSumDateText = new javax.swing.JLabel();
        kcalSumDateTextField = new javax.swing.JTextField();
        workoutStatsPanel = new javax.swing.JPanel();
        WorkoutsText = new javax.swing.JLabel();
        averageDailyBurnedKcalText = new javax.swing.JLabel();
        averageDailyBurnedKcalValueTextField = new javax.swing.JTextField();
        bar4 = new javax.swing.JLabel();
        mostDailyBurnedKcalText = new javax.swing.JLabel();
        mostDailyBurnedKcalDateText = new javax.swing.JLabel();
        mostDailyBurnedKcalDateTextField = new javax.swing.JTextField();
        bar5 = new javax.swing.JLabel();
        favoriteSportText = new javax.swing.JLabel();
        favoriteSportTextField = new javax.swing.JTextField();
        favoriteSportTrainingsNumberText = new javax.swing.JLabel();
        favoriteSportTrainingsNumberTextField = new javax.swing.JTextField();
        bar6 = new javax.swing.JLabel();
        totalTrainingsNumberText = new javax.swing.JLabel();
        totalTrainingsNumberTextField = new javax.swing.JTextField();
        bar7 = new javax.swing.JLabel();
        burnedKcalSumText = new javax.swing.JLabel();
        burnedKcalSumTextField = new javax.swing.JTextField();
        burnedKcalDateText = new javax.swing.JLabel();
        mostDailyBurnedKcalValueTextField = new javax.swing.JTextField();
        burnedKcalDateTextField = new javax.swing.JTextField();
        mealDiaryDiagramPanel = new javax.swing.JPanel();
        mealDiaryDiagramText = new javax.swing.JLabel();
        mealDiaryDiagram0Text = new javax.swing.JLabel();
        mealDiaryDiagram400Text = new javax.swing.JLabel();
        mealDiaryDiagram800Text = new javax.swing.JLabel();
        mealDiaryDiagram1200Text = new javax.swing.JLabel();
        mealDiaryDiagram1600Text = new javax.swing.JLabel();
        mealDiaryDiagram2000Text = new javax.swing.JLabel();
        mealDiaryDiagram2400Text = new javax.swing.JLabel();
        mealDiaryDiagram2800Text = new javax.swing.JLabel();
        mealDiaryDiagram3200Text = new javax.swing.JLabel();
        mealDiaryDiagram3600Text = new javax.swing.JLabel();
        mealDiaryDiagram4000Text = new javax.swing.JLabel();
        mealDiaryDiagram4400Text = new javax.swing.JLabel();
        mealDiaryDiagram4800Text = new javax.swing.JLabel();
        mealDiaryDiagramKcalText = new javax.swing.JLabel();
        mealDiaryDiagramBar1 = new javax.swing.JLabel();
        mealDiaryDiagramBar1DateTextField = new javax.swing.JTextField();
        mealDiaryDiagramBar2 = new javax.swing.JLabel();
        mealDiaryDiagramBar2DateTextField = new javax.swing.JTextField();
        mealDiaryDiagramBar3 = new javax.swing.JLabel();
        mealDiaryDiagramBar3DateTextField = new javax.swing.JTextField();
        mealDiaryDiagramBar4 = new javax.swing.JLabel();
        mealDiaryDiagramBar4DateTextField = new javax.swing.JTextField();
        mealDiaryDiagramBar5 = new javax.swing.JLabel();
        mealDiaryDiagramBar5DateTextField = new javax.swing.JTextField();
        mealDiaryDiagramBar6 = new javax.swing.JLabel();
        mealDiaryDiagramBar6DateTextField = new javax.swing.JTextField();
        mealDiaryDiagramBar7 = new javax.swing.JLabel();
        mealDiaryDiagramBar7DateTextField = new javax.swing.JTextField();
        workoutDiaryDiagramPanel = new javax.swing.JPanel();
        workoutDiaryDiagramText = new javax.swing.JLabel();
        workoutDiaryDiagram0Text = new javax.swing.JLabel();
        workoutDiaryDiagram100Text = new javax.swing.JLabel();
        workoutDiaryDiagram200Text = new javax.swing.JLabel();
        workoutDiaryDiagram300Text = new javax.swing.JLabel();
        workoutDiaryDiagram400Text = new javax.swing.JLabel();
        workoutDiaryDiagram500Text = new javax.swing.JLabel();
        workoutDiaryDiagram600Text = new javax.swing.JLabel();
        workoutDiaryDiagram700Text = new javax.swing.JLabel();
        workoutDiaryDiagram800Text = new javax.swing.JLabel();
        workoutDiaryDiagram900Text = new javax.swing.JLabel();
        workoutDiaryDiagram1000Text = new javax.swing.JLabel();
        workoutDiaryDiagram1100Text = new javax.swing.JLabel();
        workoutDiaryDiagram1200Text = new javax.swing.JLabel();
        workoutDiaryDiagramKcalText = new javax.swing.JLabel();
        workoutDiaryDiagramBar1 = new javax.swing.JLabel();
        workoutDiaryDiagramBar1DateTextField = new javax.swing.JTextField();
        workoutDiaryDiagramBar2 = new javax.swing.JLabel();
        workoutDiaryDiagramBar2DateTextField = new javax.swing.JTextField();
        workoutDiaryDiagramBar3 = new javax.swing.JLabel();
        workoutDiaryDiagramBar3DateTextField = new javax.swing.JTextField();
        workoutDiaryDiagramBar4 = new javax.swing.JLabel();
        workoutDiaryDiagramBar4DateTextField = new javax.swing.JTextField();
        workoutDiaryDiagramBar5 = new javax.swing.JLabel();
        workoutDiaryDiagramBar5DateTextField = new javax.swing.JTextField();
        workoutDiaryDiagramBar6 = new javax.swing.JLabel();
        workoutDiaryDiagramBar6DateTextField = new javax.swing.JTextField();
        workoutDiaryDiagramBar7 = new javax.swing.JLabel();
        workoutDiaryDiagramBar7DateTextField = new javax.swing.JTextField();
        calcPanel = new javax.swing.JPanel();
        calcBanner = new javax.swing.JLabel();
        calcMenu = new javax.swing.JPanel();
        calcBmrButton = new javax.swing.JPanel();
        bmrButtonText = new javax.swing.JLabel();
        calcBmiButton = new javax.swing.JPanel();
        bmiButtonText = new javax.swing.JLabel();
        calcBfiButton = new javax.swing.JPanel();
        bfiButtonText = new javax.swing.JLabel();
        calcBmrPanel = new javax.swing.JPanel();
        calcBmrTitleText = new javax.swing.JLabel();
        calcBmrWeightText = new javax.swing.JLabel();
        calcBmrWeightValueTextField = new javax.swing.JTextField();
        calcBmrWeightValueTextFieldBar = new javax.swing.JLabel();
        calcBmrKgText = new javax.swing.JLabel();
        calcBmrHeightText = new javax.swing.JLabel();
        calcBmrHeightValueTextField = new javax.swing.JTextField();
        calcBmrHeightValueTextFieldBar = new javax.swing.JLabel();
        calcBmrCmText = new javax.swing.JLabel();
        calcBmrAgeText = new javax.swing.JLabel();
        calcBmrAgeValueTextField = new javax.swing.JTextField();
        calcBmrAgeValueTextFieldBar = new javax.swing.JLabel();
        calcBmrYearsText = new javax.swing.JLabel();
        calcBmrGenderText = new javax.swing.JLabel();
        calcBmrSelectGenderButton = new javax.swing.JPanel();
        calcBmrSelectGenderFemaleButton = new javax.swing.JPanel();
        calcBmrSelectGenderFemaleButtonText = new javax.swing.JLabel();
        calcBmrSelectGenderMaleButton = new javax.swing.JPanel();
        calcBmrSelectGenderMaleButtonText = new javax.swing.JLabel();
        physicalActivityTypeText = new javax.swing.JLabel();
        physicalActivityTypePanel = new javax.swing.JPanel();
        physicalActivityLevel1Button = new javax.swing.JPanel();
        physicalActivityLevel1Text = new javax.swing.JLabel();
        physicalActivityLevel2Button = new javax.swing.JPanel();
        physicalActivityLevel2Text1 = new javax.swing.JLabel();
        physicalActivityLevel2Text2 = new javax.swing.JLabel();
        physicalActivityLevel3Button = new javax.swing.JPanel();
        physicalActivityLevel3Text1 = new javax.swing.JLabel();
        physicalActivityLevel3Text2 = new javax.swing.JLabel();
        physicalActivityLevel4Button = new javax.swing.JPanel();
        physicalActivityLevel4Text1 = new javax.swing.JLabel();
        physicalActivityLevel4Text2 = new javax.swing.JLabel();
        physicalActivityLevel5Button = new javax.swing.JPanel();
        physicalActivityLevel5Text1 = new javax.swing.JLabel();
        physicalActivityLevel5Text2 = new javax.swing.JLabel();
        calculateBmrButton = new javax.swing.JPanel();
        calculateBmrButtonText = new javax.swing.JLabel();
        calcBmrResultPanel = new javax.swing.JPanel();
        calcBmrResultText = new javax.swing.JLabel();
        bmrResultKcalValueTextField = new javax.swing.JTextField();
        bmrResultMacrosText = new javax.swing.JLabel();
        bmrResultProteinsValueTextField = new javax.swing.JTextField();
        bmrResultFatsValueTextField = new javax.swing.JTextField();
        bmrResultCarbsValueTextField = new javax.swing.JTextField();
        calcBmrResultCutText = new javax.swing.JLabel();
        bmrResultKcalCutValueTextField = new javax.swing.JTextField();
        bmrResultCutMacrosText = new javax.swing.JLabel();
        bmrResultProteinsCutValueTextField = new javax.swing.JTextField();
        bmrResultFatsCutValueTextField = new javax.swing.JTextField();
        bmrResultCarbsCutValueTextField = new javax.swing.JTextField();
        calcBmrResultOverText = new javax.swing.JLabel();
        bmrResultKcalOverValueTextField = new javax.swing.JTextField();
        bmrResultOverMacrosText = new javax.swing.JLabel();
        bmrResultProteinsOverValueTextField = new javax.swing.JTextField();
        bmrResultFatsOverValueTextField = new javax.swing.JTextField();
        bmrResultCarbsOverValueTextField = new javax.swing.JTextField();
        calcBmiPanel = new javax.swing.JPanel();
        calcBmiTitleText = new javax.swing.JLabel();
        calcBmiWeightText = new javax.swing.JLabel();
        calcBmiWeightValueTextField = new javax.swing.JTextField();
        calcBmiWeightValueTextFieldBar = new javax.swing.JLabel();
        calcBmiKgText = new javax.swing.JLabel();
        calcBmiHeightText = new javax.swing.JLabel();
        calcBmiHeightValueTextField = new javax.swing.JTextField();
        calcBmiHeightValueTextFieldBar = new javax.swing.JLabel();
        calcBmiCmText = new javax.swing.JLabel();
        calculateBmiButton = new javax.swing.JPanel();
        calculateBmiButtonText = new javax.swing.JLabel();
        calcBmiResultPanel = new javax.swing.JPanel();
        calcBmiResultText = new javax.swing.JLabel();
        bmiResultValueTextField = new javax.swing.JTextField();
        calcBmiResultRateText = new javax.swing.JLabel();
        bmiResultRateTextField = new javax.swing.JTextField();
        calcBfiPanel = new javax.swing.JPanel();
        calcBfiTitleText = new javax.swing.JLabel();
        calcBfiWeightText = new javax.swing.JLabel();
        calcBfiWeightValueTextField = new javax.swing.JTextField();
        calcBfiWeightValueTextFieldBar = new javax.swing.JLabel();
        calcBfiKgText = new javax.swing.JLabel();
        calcBfiWaistText = new javax.swing.JLabel();
        calcBfiWaistValueTextField = new javax.swing.JTextField();
        calcBfiWaistValueTextFieldBar = new javax.swing.JLabel();
        calcBfiCmText = new javax.swing.JLabel();
        calculateBfiButton = new javax.swing.JPanel();
        calculateBfiButtonText = new javax.swing.JLabel();
        calcBfiGenderText = new javax.swing.JLabel();
        calcBfiSelectGenderButton = new javax.swing.JPanel();
        calcBfiSelectGenderFemaleButton = new javax.swing.JPanel();
        calcBfiSelectGenderFemaleButtonText = new javax.swing.JLabel();
        calcBfiSelectGenderMaleButton = new javax.swing.JPanel();
        calcBfiSelectGenderMaleButtonText = new javax.swing.JLabel();
        calcBfiResultPanel = new javax.swing.JPanel();
        calcBfiResultText = new javax.swing.JLabel();
        bfiResultValueTextField = new javax.swing.JTextField();
        calcBfiResultRateText = new javax.swing.JLabel();
        bfiResultRateTextField = new javax.swing.JTextField();
        infoPanel = new javax.swing.JPanel();
        infoBanner = new javax.swing.JLabel();
        dailymeInfoPanel = new javax.swing.JPanel();
        dailymeTextIcon = new javax.swing.JLabel();
        contactText = new javax.swing.JLabel();
        allRightsReservedText = new javax.swing.JLabel();
        githubButton = new javax.swing.JPanel();
        githubIconInactive = new javax.swing.JLabel();
        githubIconActive = new javax.swing.JLabel();
        facebookButton = new javax.swing.JPanel();
        facebookIconInactive = new javax.swing.JLabel();
        facebookIconActive = new javax.swing.JLabel();
        instagramButton = new javax.swing.JPanel();
        instagramIconInactive = new javax.swing.JLabel();
        instagramIconActive = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DailyMe");
        setBackground(new java.awt.Color(34, 40, 49));
        setIconImage(new ImageIcon(getClass().getResource("/resources/d_icon.png")).getImage());
        setName("frame"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        startupPanel.setBackground(new java.awt.Color(57, 62, 70));
        startupPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
        startupPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        startupPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(57, 62, 70));
        loginPanel.setForeground(new java.awt.Color(238, 238, 238));
        loginPanel.setMinimumSize(new java.awt.Dimension(430, 260));
        loginPanel.setPreferredSize(new java.awt.Dimension(430, 260));
        warningText.setVisible(false);
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginIcon.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        loginIcon.setForeground(new java.awt.Color(57, 62, 70));
        loginIcon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        loginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/login_icon.png"))); // NOI18N
        loginPanel.add(loginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 80, 20, 30));

        titleText.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        titleText.setForeground(new java.awt.Color(238, 238, 238));
        titleText.setText("Zaloguj si??");
        loginPanel.add(titleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 410, 70));

        loginTextField.setBackground(new java.awt.Color(57, 62, 70));
        loginTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        loginTextField.setForeground(new java.awt.Color(238, 238, 238));
        loginTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        loginTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        loginTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        loginTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        loginTextField.setMargin(new java.awt.Insets(2, 15, 2, 2));
        loginTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        loginTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginTextFieldKeyPressed(evt);
            }
        });
        loginPanel.add(loginTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 340, 30));

        loginTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        loginTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        loginTextFieldBar.setOpaque(true);
        loginPanel.add(loginTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 320, 1));

        passwordIcon.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        passwordIcon.setForeground(new java.awt.Color(57, 62, 70));
        passwordIcon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/password_icon.png"))); // NOI18N
        loginPanel.add(passwordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 120, 20, 30));

        passwordField.setBackground(new java.awt.Color(57, 62, 70));
        passwordField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(238, 238, 238));
        passwordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        passwordField.setCaretColor(new java.awt.Color(238, 238, 238));
        passwordField.setMargin(new java.awt.Insets(2, 15, 2, 2));
        passwordField.setSelectionColor(new java.awt.Color(0, 173, 181));
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });
        loginPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 340, 30));

        passwordFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        passwordFieldBar.setForeground(new java.awt.Color(238, 238, 238));
        passwordFieldBar.setOpaque(true);
        loginPanel.add(passwordFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 320, 1));

        warningText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        warningText.setForeground(new java.awt.Color(244, 120, 120));
        warningText.setText("Podany login lub has??o s?? nieprawid??owe.");
        warningText.setToolTipText("");
        loginPanel.add(warningText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 155, -1, -1));

        warningText1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        warningText1.setForeground(new java.awt.Color(238, 238, 238));
        warningText1.setText("Nie masz konta?");
        warningText1.setToolTipText("");
        loginPanel.add(warningText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 225, -1, 22));

        registerButton.setBackground(new java.awt.Color(57, 62, 70));
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonMouseExited(evt);
            }
        });
        registerButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerButtonText.setBackground(new java.awt.Color(57, 62, 70));
        registerButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        registerButtonText.setForeground(new java.awt.Color(0, 173, 181));
        registerButtonText.setText("Zarejestruj si??");
        registerButton.add(registerButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 85, 22));

        registerButtonLowerBar.setBackground(new java.awt.Color(0, 173, 181));
        registerButtonLowerBar.setOpaque(true);
        registerButton.add(registerButtonLowerBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 80, 1));

        loginPanel.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 225, 85, 22));

        loginButton.setBackground(new java.awt.Color(0, 173, 181));
        loginButton.setForeground(new java.awt.Color(238, 238, 238));
        loginButton.setToolTipText("");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setOpaque(false);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        loginButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        loginButtonText.setForeground(new java.awt.Color(238, 238, 238));
        loginButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginButtonText.setText("Zaloguj");
        loginButton.add(loginButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 30));

        loginButtonBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/login_button.png"))); // NOI18N
        loginButton.add(loginButtonBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        loginButtonBackgroundActive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/login_button_active.png"))); // NOI18N
        loginButtonBackgroundActive.setVisible(false);
        loginButton.add(loginButtonBackgroundActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 30));

        loginPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 370, 30));

        upperBar.setBackground(new java.awt.Color(0, 173, 181));
        loginPanel.add(upperBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 1));

        startupPanel.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 245, 430, 260));

        startupPanelCloseButton.setBackground(new java.awt.Color(34, 40, 49));
        startupPanelCloseButton.setOpaque(false);
        startupPanelCloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startupPanelCloseButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startupPanelCloseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startupPanelCloseButtonMouseExited(evt);
            }
        });
        startupPanelCloseButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startupPanelCloseButtonInactiveIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close_button2.png"))); // NOI18N
        startupPanelCloseButtonInactiveIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startupPanelCloseButton.add(startupPanelCloseButtonInactiveIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        startupPanelCloseButtonActiveIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close_button2_active.png"))); // NOI18N
        startupPanelCloseButtonActiveIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startupPanelCloseButtonActiveIcon.setVisible(false);
        startupPanelCloseButton.add(startupPanelCloseButtonActiveIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        startupPanel.add(startupPanelCloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1255, 5, -1, -1));

        startupPanelMinimizeButton.setBackground(new java.awt.Color(34, 40, 49));
        startupPanelMinimizeButton.setOpaque(false);
        startupPanelMinimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startupPanelMinimizeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startupPanelMinimizeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startupPanelMinimizeButtonMouseExited(evt);
            }
        });
        startupPanelMinimizeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startupPanelMinimizeButtonInactiveIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/minimize_button2.png"))); // NOI18N
        startupPanelMinimizeButtonInactiveIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startupPanelMinimizeButton.add(startupPanelMinimizeButtonInactiveIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        startupPanelMinimizeButtonActiveIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/minimize_button2_active.png"))); // NOI18N
        startupPanelMinimizeButtonActiveIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startupPanelMinimizeButtonActiveIcon.setVisible(false);
        startupPanelMinimizeButton.add(startupPanelMinimizeButtonActiveIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        startupPanel.add(startupPanelMinimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1228, 5, -1, -1));

        startupPanelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/login_background_dark2.png"))); // NOI18N
        startupPanelBackground.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                startupPanelBackgroundMouseDragged(evt);
            }
        });
        startupPanelBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                startupPanelBackgroundMousePressed(evt);
            }
        });
        startupPanel.add(startupPanelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        mainPanel.setBackground(new java.awt.Color(34, 40, 49));
        mainPanel.setName("background"); // NOI18N
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(34, 40, 49));
        menuPanel.setName("rightMenu"); // NOI18N
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myProfileButton.setBackground(new java.awt.Color(34, 40, 49));
        myProfileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myProfileButton.setName(""); // NOI18N
        myProfileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myProfileButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myProfileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myProfileButtonMouseExited(evt);
            }
        });
        myProfileButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myProfileButtonText.setBackground(new java.awt.Color(238, 238, 238));
        myProfileButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        myProfileButtonText.setForeground(new java.awt.Color(222, 222, 222));
        myProfileButtonText.setText("M??j profil");
        myProfileButton.add(myProfileButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        myProfileButtonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user_26_26.png"))); // NOI18N
        myProfileButton.add(myProfileButtonIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 18, -1, -1));

        myProfileButtonBar.setBackground(new java.awt.Color(0, 173, 181));
        myProfileButtonBar.setName("userBrick"); // NOI18N
        myProfileButtonBar.setOpaque(true);
        myProfileButton.add(myProfileButtonBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 20, 61, 20));

        menuPanel.add(myProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 230, 60));

        mealDiaryButton.setBackground(new java.awt.Color(34, 40, 49));
        mealDiaryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mealDiaryButton.setName(""); // NOI18N
        mealDiaryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mealDiaryButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mealDiaryButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mealDiaryButtonMouseExited(evt);
            }
        });
        mealDiaryButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mealDiaryButtonText.setBackground(new java.awt.Color(0, 173, 181));
        mealDiaryButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        mealDiaryButtonText.setForeground(new java.awt.Color(222, 222, 222));
        mealDiaryButtonText.setText("Dziennik posi??k??w");
        mealDiaryButton.add(mealDiaryButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        mealDiaryButtonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/note_26_26.png"))); // NOI18N
        mealDiaryButton.add(mealDiaryButtonIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 18, -1, -1));

        mealDiaryButtonBar.setBackground(new java.awt.Color(0, 173, 181));
        mealDiaryButtonBar.setName("userBrick"); // NOI18N
        mealDiaryButton.add(mealDiaryButtonBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 20, 108, 20));

        menuPanel.add(mealDiaryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 230, 60));

        workoutDiaryButton.setBackground(new java.awt.Color(34, 40, 49));
        workoutDiaryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        workoutDiaryButton.setName(""); // NOI18N
        workoutDiaryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workoutDiaryButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                workoutDiaryButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                workoutDiaryButtonMouseExited(evt);
            }
        });
        workoutDiaryButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workoutDiaryButtonText.setBackground(new java.awt.Color(238, 238, 238));
        workoutDiaryButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        workoutDiaryButtonText.setForeground(new java.awt.Color(222, 222, 222));
        workoutDiaryButtonText.setText("Dziennik ??wicze??");
        workoutDiaryButton.add(workoutDiaryButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        workoutDiaryButtonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lift_26_26.png"))); // NOI18N
        workoutDiaryButton.add(workoutDiaryButtonIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 18, -1, -1));

        workoutDiaryButtonBar.setBackground(new java.awt.Color(0, 173, 181));
        workoutDiaryButtonBar.setName("userBrick"); // NOI18N
        workoutDiaryButton.add(workoutDiaryButtonBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 20, 104, 20));

        menuPanel.add(workoutDiaryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 230, 60));

        statsButton.setBackground(new java.awt.Color(34, 40, 49));
        statsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statsButton.setName(""); // NOI18N
        statsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                statsButtonMouseExited(evt);
            }
        });
        statsButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statsButtonText.setBackground(new java.awt.Color(238, 238, 238));
        statsButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        statsButtonText.setForeground(new java.awt.Color(222, 222, 222));
        statsButtonText.setText("Statystyki");
        statsButton.add(statsButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        statsButtonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/stats_26_26.png"))); // NOI18N
        statsButton.add(statsButtonIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 18, -1, -1));

        statsButtonBar.setBackground(new java.awt.Color(0, 173, 181));
        statsButtonBar.setName("userBrick"); // NOI18N
        statsButton.add(statsButtonBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 20, 55, 20));

        menuPanel.add(statsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 230, 60));

        calcButton.setBackground(new java.awt.Color(34, 40, 49));
        calcButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcButton.setName(""); // NOI18N
        calcButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcButtonMouseExited(evt);
            }
        });
        calcButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcButtonText.setBackground(new java.awt.Color(238, 238, 238));
        calcButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        calcButtonText.setForeground(new java.awt.Color(222, 222, 222));
        calcButtonText.setText("Kalkulatory");
        calcButton.add(calcButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        calcButtonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/calc_26_26.png"))); // NOI18N
        calcButton.add(calcButtonIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 18, -1, -1));

        calcButtonBar.setBackground(new java.awt.Color(0, 173, 181));
        calcButtonBar.setName("userBrick"); // NOI18N
        calcButton.add(calcButtonBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 20, 67, 20));

        menuPanel.add(calcButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 230, 60));

        infoButton.setBackground(new java.awt.Color(34, 40, 49));
        infoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoButton.setName(""); // NOI18N
        infoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoButtonMouseExited(evt);
            }
        });
        infoButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoButtonText.setBackground(new java.awt.Color(238, 238, 238));
        infoButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        infoButtonText.setForeground(new java.awt.Color(222, 222, 222));
        infoButtonText.setText("Informacje");
        infoButton.add(infoButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        infoButtonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/info_26_26.png"))); // NOI18N
        infoButton.add(infoButtonIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 18, -1, -1));

        infoButtonBar.setBackground(new java.awt.Color(0, 173, 181));
        infoButtonBar.setName("userBrick"); // NOI18N
        infoButton.add(infoButtonBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 20, 66, 20));

        menuPanel.add(infoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 230, 60));

        closeButton.setBackground(new java.awt.Color(34, 40, 49));
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButtonMouseExited(evt);
            }
        });
        closeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeButtonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close_20_20.png"))); // NOI18N
        closeButtonIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.add(closeButtonIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        closeButtonIconActive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close_active_20_20.png"))); // NOI18N
        closeButtonIconActive.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButtonIconActive.setVisible(false);
        closeButton.add(closeButtonIconActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuPanel.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 20, 20));

        minimizeButton.setBackground(new java.awt.Color(34, 40, 49));
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseExited(evt);
            }
        });
        minimizeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizeButtonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/minimize_20_20_2.png"))); // NOI18N
        minimizeButtonIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeButton.add(minimizeButtonIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        minimizeButtonIconActive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/minimize_active_20_20_2.png"))); // NOI18N
        minimizeButtonIconActive.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeButtonIconActive.setVisible(false);
        minimizeButton.add(minimizeButtonIconActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuPanel.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 20, 20));

        loginInfo.setBackground(new java.awt.Color(34, 40, 49));
        loginInfo.setToolTipText("");
        loginInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginInfo.setVisible(false);
        loginInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        menuPanel.add(loginInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 210, 40));

        logoutButton.setBackground(new java.awt.Color(34, 40, 49));
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutButtonMouseExited(evt);
            }
        });
        logoutButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        logoutButtonText.setForeground(new java.awt.Color(172, 172, 172));
        logoutButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutButtonText.setText("Wyloguj si??");
        logoutButton.add(logoutButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 55, 20));

        menuPanel.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 55, 20));

        loginInfoUsernameTextField.setEditable(false);
        loginInfoUsernameTextField.setBackground(new java.awt.Color(34, 40, 49));
        loginInfoUsernameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        loginInfoUsernameTextField.setForeground(new java.awt.Color(172, 172, 172));
        loginInfoUsernameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        loginInfoUsernameTextField.setToolTipText("");
        loginInfoUsernameTextField.setBorder(null);
        loginInfoUsernameTextField.setSelectedTextColor(new java.awt.Color(172, 172, 172));
        loginInfoUsernameTextField.setSelectionColor(new java.awt.Color(34, 40, 49));
        menuPanel.add(loginInfoUsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 5, 100, 20));

        mainPanel.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 230, 720));

        myProfilePanel.setBackground(new java.awt.Color(57, 62, 70));
        myProfilePanel.setMinimumSize(new java.awt.Dimension(1050, 720));
        myProfilePanel.setPreferredSize(new java.awt.Dimension(1050, 720));
        myProfilePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myProfileBanner.setBackground(new java.awt.Color(34, 40, 49));
        myProfileBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/myprofile_banner.png"))); // NOI18N
        myProfileBanner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        myProfileBanner.setOpaque(true);
        myProfileBanner.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                myProfileBannerMouseDragged(evt);
            }
        });
        myProfileBanner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                myProfileBannerMousePressed(evt);
            }
        });
        myProfilePanel.add(myProfileBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        namePanel.setBackground(new java.awt.Color(50, 54, 61));
        namePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profileNameText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        profileNameText.setForeground(new java.awt.Color(138, 152, 173));
        profileNameText.setText("Profil:");
        namePanel.add(profileNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        profileNameLowerBar.setBackground(new java.awt.Color(0, 173, 181));
        profileNameLowerBar.setOpaque(true);
        namePanel.add(profileNameLowerBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 115, 605, 5));

        profileNameTextField.setEditable(false);
        profileNameTextField.setBackground(new java.awt.Color(50, 54, 61));
        profileNameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 82)); // NOI18N
        profileNameTextField.setForeground(new java.awt.Color(238, 238, 238));
        profileNameTextField.setText("-");
        profileNameTextField.setBorder(null);
        profileNameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        profileNameTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        namePanel.add(profileNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, 120));

        myProfilePanel.add(namePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 165, 605, 120));

        kcalPanel.setBackground(new java.awt.Color(50, 54, 61));
        kcalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        todayKcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        todayKcalText.setForeground(new java.awt.Color(138, 152, 173));
        todayKcalText.setText("Dostarczone dzi?? kalorie:");
        kcalPanel.add(todayKcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 7, -1, -1));

        kcalIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kcal_13_13.png"))); // NOI18N
        kcalPanel.add(kcalIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 8, -1, -1));

        kcalValueTextField.setEditable(false);
        kcalValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        kcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 72)); // NOI18N
        kcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        kcalValueTextField.setText("0 kcal");
        kcalValueTextField.setBorder(null);
        kcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        kcalValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        kcalPanel.add(kcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, 580, 70));

        myProfilePanel.add(kcalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 605, 100));

        userParamPanel.setBackground(new java.awt.Color(50, 54, 61));
        maleIcon.setVisible(false);
        femaleIcon.setVisible(false);
        userParamPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bmiText.setBackground(new java.awt.Color(238, 238, 238));
        bmiText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        bmiText.setForeground(new java.awt.Color(138, 152, 173));
        bmiText.setText("BMI:");
        userParamPanel.add(bmiText, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 5, -1, -1));

        bmiValueTextField.setEditable(false);
        bmiValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        bmiValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        bmiValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        bmiValueTextField.setText("-");
        bmiValueTextField.setBorder(null);
        bmiValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bmiValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        userParamPanel.add(bmiValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 18, 100, 40));

        bmiRateText.setBackground(new java.awt.Color(238, 238, 238));
        bmiRateText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        bmiRateText.setForeground(new java.awt.Color(138, 152, 173));
        bmiRateText.setText("Ocena:");
        userParamPanel.add(bmiRateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 62, -1, -1));

        bmiRateValueTextField.setEditable(false);
        bmiRateValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        bmiRateValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        bmiRateValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        bmiRateValueTextField.setText("-");
        bmiRateValueTextField.setToolTipText("");
        bmiRateValueTextField.setBorder(null);
        bmiRateValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bmiRateValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        userParamPanel.add(bmiRateValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 74, 180, 30));

        goalText.setBackground(new java.awt.Color(238, 238, 238));
        goalText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        goalText.setForeground(new java.awt.Color(138, 152, 173));
        goalText.setText("Cel:");
        userParamPanel.add(goalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 105, -1, -1));

        goalValueTextField.setEditable(false);
        goalValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        goalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        goalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        goalValueTextField.setText("-");
        goalValueTextField.setToolTipText("");
        goalValueTextField.setBorder(null);
        goalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        goalValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        userParamPanel.add(goalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 118, 180, 30));

        goalLeftText.setBackground(new java.awt.Color(238, 238, 238));
        goalLeftText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        goalLeftText.setForeground(new java.awt.Color(138, 152, 173));
        goalLeftText.setText("Do celu pozosta??o:");
        userParamPanel.add(goalLeftText, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 150, -1, -1));

        goalLeftTextField.setEditable(false);
        goalLeftTextField.setBackground(new java.awt.Color(50, 54, 61));
        goalLeftTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        goalLeftTextField.setForeground(new java.awt.Color(238, 238, 238));
        goalLeftTextField.setText("-");
        goalLeftTextField.setToolTipText("");
        goalLeftTextField.setBorder(null);
        goalLeftTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        goalLeftTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        userParamPanel.add(goalLeftTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 163, 180, 30));

        bmiValueTextField2.setEditable(false);
        bmiValueTextField2.setBackground(new java.awt.Color(50, 54, 61));
        bmiValueTextField2.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        bmiValueTextField2.setForeground(new java.awt.Color(238, 238, 238));
        bmiValueTextField2.setText("65,2");
        bmiValueTextField2.setBorder(null);
        userParamPanel.add(bmiValueTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 18, 100, 40));

        maleIcon.setBackground(new java.awt.Color(0, 173, 181));
        maleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/male_32_32.png"))); // NOI18N
        userParamPanel.add(maleIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 197, 30, -1));

        femaleIcon.setBackground(new java.awt.Color(0, 173, 181));
        femaleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/female_32_32.png"))); // NOI18N
        userParamPanel.add(femaleIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 197, 30, -1));

        weightValuePanel.setBackground(new java.awt.Color(0, 173, 181));
        weightValuePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        weightText.setBackground(new java.awt.Color(238, 238, 238));
        weightText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        weightText.setForeground(new java.awt.Color(238, 238, 238));
        weightText.setText("Waga (kg):");
        weightValuePanel.add(weightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 5, -1, -1));

        weightValueTextField.setEditable(false);
        weightValueTextField.setBackground(new java.awt.Color(0, 173, 181));
        weightValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 72)); // NOI18N
        weightValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        weightValueTextField.setText("-");
        weightValueTextField.setBorder(null);
        weightValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        weightValueTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        weightValueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                weightValueTextFieldKeyPressed(evt);
            }
        });
        weightValuePanel.add(weightValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 180, 75));

        heightText.setBackground(new java.awt.Color(238, 238, 238));
        heightText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        heightText.setForeground(new java.awt.Color(238, 238, 238));
        heightText.setText("Wzrost (cm):");
        weightValuePanel.add(heightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 95, -1, -1));

        heightValueTextField.setEditable(false);
        heightValueTextField.setBackground(new java.awt.Color(0, 173, 181));
        heightValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        heightValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        heightValueTextField.setText("-");
        heightValueTextField.setBorder(null);
        heightValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        heightValueTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        heightValueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                heightValueTextFieldKeyPressed(evt);
            }
        });
        weightValuePanel.add(heightValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, 80, 50));

        ageText.setBackground(new java.awt.Color(238, 238, 238));
        ageText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        ageText.setForeground(new java.awt.Color(238, 238, 238));
        ageText.setText("Wiek:");
        weightValuePanel.add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 165, -1, -1));

        ageValueTextField.setEditable(false);
        ageValueTextField.setBackground(new java.awt.Color(0, 173, 181));
        ageValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        ageValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        ageValueTextField.setText("-");
        ageValueTextField.setBorder(null);
        ageValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        ageValueTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        ageValueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageValueTextFieldKeyPressed(evt);
            }
        });
        weightValuePanel.add(ageValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, 90, 50));

        modifyParamsToggleButton.setBackground(new java.awt.Color(238, 238, 238));
        modifyParamsToggleButton.setForeground(new java.awt.Color(238, 238, 238));
        modifyParamsToggleButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modifyParamsToggleButtonOn.setBackground(new java.awt.Color(207, 207, 207));
        modifyParamsToggleButtonOn.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        modifyParamsToggleButtonOn.setForeground(new java.awt.Color(172, 172, 172));
        modifyParamsToggleButtonOn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyParamsToggleButtonOn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modifyParamsToggleButtonOn.setOpaque(true);
        modifyParamsToggleButtonOn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyParamsToggleButtonOnMouseClicked(evt);
            }
        });
        modifyParamsToggleButton.add(modifyParamsToggleButtonOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 23, 13));

        modifyParamsToggleButtonOff.setBackground(new java.awt.Color(238, 238, 238));
        modifyParamsToggleButtonOff.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        modifyParamsToggleButtonOff.setForeground(new java.awt.Color(238, 238, 238));
        modifyParamsToggleButtonOff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyParamsToggleButtonOff.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modifyParamsToggleButtonOff.setOpaque(true);
        modifyParamsToggleButtonOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyParamsToggleButtonOffMouseClicked(evt);
            }
        });
        modifyParamsToggleButton.add(modifyParamsToggleButtonOff, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 1, 23, 13));

        weightValuePanel.add(modifyParamsToggleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 215, 50, 15));

        userParamPanel.add(weightValuePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 235));

        myProfilePanel.add(userParamPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 165, 400, 235));

        notesPanel.setBackground(new java.awt.Color(50, 54, 61));
        notesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        notesText.setBackground(new java.awt.Color(238, 238, 238));
        notesText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        notesText.setForeground(new java.awt.Color(138, 152, 173));
        notesText.setText("Notatki:");
        notesPanel.add(notesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 5, -1, -1));

        notesScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        notesScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        notesTextArea.setEditable(false);
        notesTextArea.setBackground(new java.awt.Color(50, 54, 61));
        notesTextArea.setColumns(20);
        notesTextArea.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        notesTextArea.setForeground(new java.awt.Color(238, 238, 238));
        notesTextArea.setLineWrap(true);
        notesTextArea.setRows(6);
        notesTextArea.setBorder(null);
        notesTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        notesTextArea.setDisabledTextColor(new java.awt.Color(238, 238, 238));
        notesTextArea.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        notesTextArea.setSelectionColor(new java.awt.Color(0, 173, 181));
        notesTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                notesTextAreaKeyPressed(evt);
            }
        });
        notesScrollPane.setViewportView(notesTextArea);
        notesScrollPane.setBorder(null);

        notesPanel.add(notesScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 25, 370, 230));

        saveNotesButton.setBackground(new java.awt.Color(63, 69, 79));
        saveNotesButton.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        saveNotesButton.setForeground(new java.awt.Color(238, 238, 238));
        saveNotesButton.setText("    Zapisz");
        saveNotesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveNotesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveNotesButton.setOpaque(true);
        saveNotesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveNotesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveNotesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveNotesButtonMouseExited(evt);
            }
        });
        notesPanel.add(saveNotesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 268, 55, 15));

        modifyNotesButton.setBackground(new java.awt.Color(63, 69, 79));
        modifyNotesButton.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        modifyNotesButton.setForeground(new java.awt.Color(238, 238, 238));
        modifyNotesButton.setText("     Edytuj");
        modifyNotesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyNotesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modifyNotesButton.setOpaque(true);
        modifyNotesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyNotesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modifyNotesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modifyNotesButtonMouseExited(evt);
            }
        });
        notesPanel.add(modifyNotesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 268, 55, 15));

        myProfilePanel.add(notesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 415, 400, 290));

        lastActivitiesPanel.setBackground(new java.awt.Color(50, 54, 61));
        lastActivitiesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lastActivitiesText.setBackground(new java.awt.Color(238, 238, 238));
        lastActivitiesText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lastActivitiesText.setForeground(new java.awt.Color(138, 152, 173));
        lastActivitiesText.setText("Ostatnie aktywno??ci:");
        lastActivitiesPanel.add(lastActivitiesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        lastActivity1Panel.setBackground(new java.awt.Color(52, 56, 63));
        lastActivity1Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lastActivity1Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastActivity1PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastActivity1PanelMouseExited(evt);
            }
        });
        lastActivity1Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lastActivity1UsernameTextField.setEditable(false);
        lastActivity1UsernameTextField.setBackground(new java.awt.Color(52, 56, 63));
        lastActivity1UsernameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lastActivity1UsernameTextField.setForeground(new java.awt.Color(0, 173, 181));
        lastActivity1UsernameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastActivity1UsernameTextField.setBorder(null);
        lastActivity1UsernameTextField.setSelectedTextColor(new java.awt.Color(0, 173, 181));
        lastActivity1UsernameTextField.setSelectionColor(new java.awt.Color(52, 56, 63));
        lastActivity1UsernameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastActivity1PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastActivity1PanelMouseExited(evt);
            }
        });
        lastActivity1Panel.add(lastActivity1UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 20));

        lastActivity1MessageTextField.setEditable(false);
        lastActivity1MessageTextField.setBackground(new java.awt.Color(52, 56, 63));
        lastActivity1MessageTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        lastActivity1MessageTextField.setForeground(new java.awt.Color(238, 238, 238));
        lastActivity1MessageTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastActivity1MessageTextField.setBorder(null);
        lastActivity1MessageTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        lastActivity1MessageTextField.setSelectionColor(new java.awt.Color(52, 56, 63));
        lastActivity1MessageTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastActivity1PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastActivity1PanelMouseExited(evt);
            }
        });
        lastActivity1Panel.add(lastActivity1MessageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 420, 30));

        lastActivitiesPanel.add(lastActivity1Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 585, 42));

        lastActivity2Panel.setBackground(new java.awt.Color(52, 56, 63));
        lastActivity2Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lastActivity2Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastActivity2PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastActivity2PanelMouseExited(evt);
            }
        });
        lastActivity2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lastActivity2UsernameTextField.setEditable(false);
        lastActivity2UsernameTextField.setBackground(new java.awt.Color(52, 56, 63));
        lastActivity2UsernameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lastActivity2UsernameTextField.setForeground(new java.awt.Color(0, 173, 181));
        lastActivity2UsernameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastActivity2UsernameTextField.setBorder(null);
        lastActivity2UsernameTextField.setSelectedTextColor(new java.awt.Color(0, 173, 181));
        lastActivity2UsernameTextField.setSelectionColor(new java.awt.Color(52, 56, 63));
        lastActivity2UsernameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastActivity2PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastActivity2PanelMouseExited(evt);
            }
        });
        lastActivity2Panel.add(lastActivity2UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 20));

        lastActivity2MessageTextField.setEditable(false);
        lastActivity2MessageTextField.setBackground(new java.awt.Color(52, 56, 63));
        lastActivity2MessageTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        lastActivity2MessageTextField.setForeground(new java.awt.Color(238, 238, 238));
        lastActivity2MessageTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastActivity2MessageTextField.setBorder(null);
        lastActivity2MessageTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        lastActivity2MessageTextField.setSelectionColor(new java.awt.Color(52, 56, 63));
        lastActivity2MessageTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastActivity2PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastActivity2PanelMouseExited(evt);
            }
        });
        lastActivity2Panel.add(lastActivity2MessageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 420, 30));

        lastActivitiesPanel.add(lastActivity2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, 585, 42));

        lastActivity3Panel.setBackground(new java.awt.Color(52, 56, 63));
        lastActivity3Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lastActivity3Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastActivity3PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastActivity3PanelMouseExited(evt);
            }
        });
        lastActivity3Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lastActivity3UsernameTextField.setEditable(false);
        lastActivity3UsernameTextField.setBackground(new java.awt.Color(52, 56, 63));
        lastActivity3UsernameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lastActivity3UsernameTextField.setForeground(new java.awt.Color(0, 173, 181));
        lastActivity3UsernameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastActivity3UsernameTextField.setBorder(null);
        lastActivity3UsernameTextField.setSelectedTextColor(new java.awt.Color(0, 173, 181));
        lastActivity3UsernameTextField.setSelectionColor(new java.awt.Color(52, 56, 63));
        lastActivity3UsernameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastActivity3PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastActivity3PanelMouseExited(evt);
            }
        });
        lastActivity3Panel.add(lastActivity3UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 20));

        lastActivity3MessageTextField.setEditable(false);
        lastActivity3MessageTextField.setBackground(new java.awt.Color(52, 56, 63));
        lastActivity3MessageTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        lastActivity3MessageTextField.setForeground(new java.awt.Color(238, 238, 238));
        lastActivity3MessageTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastActivity3MessageTextField.setBorder(null);
        lastActivity3MessageTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        lastActivity3MessageTextField.setSelectionColor(new java.awt.Color(52, 56, 63));
        lastActivity3MessageTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastActivity3PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastActivity3PanelMouseExited(evt);
            }
        });
        lastActivity3Panel.add(lastActivity3MessageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 420, 30));

        lastActivitiesPanel.add(lastActivity3Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, 585, 42));

        lastActivity4Panel.setBackground(new java.awt.Color(52, 56, 63));
        lastActivity4Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lastActivity4Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastActivity4PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastActivity4PanelMouseExited(evt);
            }
        });
        lastActivity4Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lastActivity4UsernameTextField.setEditable(false);
        lastActivity4UsernameTextField.setBackground(new java.awt.Color(52, 56, 63));
        lastActivity4UsernameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lastActivity4UsernameTextField.setForeground(new java.awt.Color(0, 173, 181));
        lastActivity4UsernameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastActivity4UsernameTextField.setBorder(null);
        lastActivity4UsernameTextField.setSelectedTextColor(new java.awt.Color(0, 173, 181));
        lastActivity4UsernameTextField.setSelectionColor(new java.awt.Color(52, 56, 63));
        lastActivity4UsernameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastActivity4PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastActivity4PanelMouseExited(evt);
            }
        });
        lastActivity4Panel.add(lastActivity4UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 20));

        lastActivity4MessageTextField.setEditable(false);
        lastActivity4MessageTextField.setBackground(new java.awt.Color(52, 56, 63));
        lastActivity4MessageTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        lastActivity4MessageTextField.setForeground(new java.awt.Color(238, 238, 238));
        lastActivity4MessageTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastActivity4MessageTextField.setBorder(null);
        lastActivity4MessageTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        lastActivity4MessageTextField.setSelectionColor(new java.awt.Color(52, 56, 63));
        lastActivity4MessageTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastActivity4PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastActivity4PanelMouseExited(evt);
            }
        });
        lastActivity4Panel.add(lastActivity4MessageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 420, 30));

        lastActivitiesPanel.add(lastActivity4Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 186, 585, 42));

        lastActivity5Panel.setBackground(new java.awt.Color(52, 56, 63));
        lastActivity5Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lastActivity5Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastActivity5PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastActivity5PanelMouseExited(evt);
            }
        });
        lastActivity5Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lastActivity5UsernameTextField.setEditable(false);
        lastActivity5UsernameTextField.setBackground(new java.awt.Color(52, 56, 63));
        lastActivity5UsernameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lastActivity5UsernameTextField.setForeground(new java.awt.Color(0, 173, 181));
        lastActivity5UsernameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastActivity5UsernameTextField.setBorder(null);
        lastActivity5UsernameTextField.setSelectedTextColor(new java.awt.Color(0, 173, 181));
        lastActivity5UsernameTextField.setSelectionColor(new java.awt.Color(52, 56, 63));
        lastActivity5UsernameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastActivity5PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastActivity5PanelMouseExited(evt);
            }
        });
        lastActivity5Panel.add(lastActivity5UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 20));

        lastActivity5MessageTextField.setEditable(false);
        lastActivity5MessageTextField.setBackground(new java.awt.Color(52, 56, 63));
        lastActivity5MessageTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        lastActivity5MessageTextField.setForeground(new java.awt.Color(238, 238, 238));
        lastActivity5MessageTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastActivity5MessageTextField.setBorder(null);
        lastActivity5MessageTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        lastActivity5MessageTextField.setSelectionColor(new java.awt.Color(52, 56, 63));
        lastActivity5MessageTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastActivity5PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastActivity5PanelMouseExited(evt);
            }
        });
        lastActivity5Panel.add(lastActivity5MessageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 420, 30));

        lastActivitiesPanel.add(lastActivity5Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 238, 585, 42));
        lastActivity1Panel.setVisible(false);
        lastActivity2Panel.setVisible(false);
        lastActivity3Panel.setVisible(false);
        lastActivity4Panel.setVisible(false);
        lastActivity5Panel.setVisible(false);

        myProfilePanel.add(lastActivitiesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 415, 605, 290));

        mainPanel.add(myProfilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 720));

        mealDiaryPanel.setBackground(new java.awt.Color(57, 62, 70));
        mealDiaryPanel.setMinimumSize(new java.awt.Dimension(1050, 720));
        mealDiaryPanel.setPreferredSize(new java.awt.Dimension(1050, 720));
        mealDiaryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mealDiaryBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/mealdiary_banner_1.png"))); // NOI18N
        mealDiaryBanner.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mealDiaryBannerMouseDragged(evt);
            }
        });
        mealDiaryBanner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mealDiaryBannerMousePressed(evt);
            }
        });
        mealDiaryPanel.add(mealDiaryBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mealListPanel.setBackground(new java.awt.Color(50, 54, 61));
        mealListPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        meal1Panel.setBackground(new java.awt.Color(50, 54, 61));
        meal1Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        meal1NameTextField.setEditable(false);
        meal1NameTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal1NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        meal1NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal1NameTextField.setText("-");
        meal1NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        meal1NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal1NameTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal1Panel.add(meal1NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 30));

        meal1KcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal1KcalText.setForeground(new java.awt.Color(138, 152, 173));
        meal1KcalText.setText("Kalorie:");
        meal1KcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal1Panel.add(meal1KcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 40, -1));

        meal1KcalValueTextField.setEditable(false);
        meal1KcalValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal1KcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal1KcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal1KcalValueTextField.setText("-");
        meal1KcalValueTextField.setBorder(null);
        meal1KcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal1KcalValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal1Panel.add(meal1KcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        meal1ProteinsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal1ProteinsText.setForeground(new java.awt.Color(138, 152, 173));
        meal1ProteinsText.setText("Bia??ko:");
        meal1ProteinsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal1Panel.add(meal1ProteinsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 31, 40, -1));

        meal1ProteinsValueTextField.setEditable(false);
        meal1ProteinsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal1ProteinsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal1ProteinsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal1ProteinsValueTextField.setText("-");
        meal1ProteinsValueTextField.setBorder(null);
        meal1ProteinsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal1ProteinsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal1Panel.add(meal1ProteinsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 40, 100, -1));

        meal1FatsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal1FatsText.setForeground(new java.awt.Color(138, 152, 173));
        meal1FatsText.setText("T??uszcz:");
        meal1FatsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal1Panel.add(meal1FatsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 31, 40, -1));

        meal1FatsValueTextField.setEditable(false);
        meal1FatsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal1FatsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal1FatsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal1FatsValueTextField.setText("-");
        meal1FatsValueTextField.setBorder(null);
        meal1FatsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal1FatsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal1Panel.add(meal1FatsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 100, -1));

        meal1CarbsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal1CarbsText.setForeground(new java.awt.Color(138, 152, 173));
        meal1CarbsText.setText("W??glowodany:");
        meal1CarbsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal1Panel.add(meal1CarbsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 31, 70, -1));

        meal1CarbsValueTextField.setEditable(false);
        meal1CarbsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal1CarbsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal1CarbsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal1CarbsValueTextField.setText("-");
        meal1CarbsValueTextField.setBorder(null);
        meal1CarbsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal1CarbsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal1Panel.add(meal1CarbsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 40, 100, -1));

        mealListPanel.add(meal1Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 67));

        meal2Panel.setBackground(new java.awt.Color(46, 49, 55));
        meal2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        meal2NameTextField.setEditable(false);
        meal2NameTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal2NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        meal2NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal2NameTextField.setText("-");
        meal2NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        meal2NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal2NameTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal2Panel.add(meal2NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 30));

        meal2KcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal2KcalText.setForeground(new java.awt.Color(138, 152, 173));
        meal2KcalText.setText("Kalorie:");
        meal2KcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal2Panel.add(meal2KcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 40, -1));

        meal2KcalValueTextField.setEditable(false);
        meal2KcalValueTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal2KcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal2KcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal2KcalValueTextField.setText("-");
        meal2KcalValueTextField.setBorder(null);
        meal2KcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal2KcalValueTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal2Panel.add(meal2KcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        meal2ProteinsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal2ProteinsText.setForeground(new java.awt.Color(138, 152, 173));
        meal2ProteinsText.setText("Bia??ko:");
        meal2ProteinsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal2Panel.add(meal2ProteinsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 31, 40, -1));

        meal2ProteinsValueTextField.setEditable(false);
        meal2ProteinsValueTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal2ProteinsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal2ProteinsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal2ProteinsValueTextField.setText("-");
        meal2ProteinsValueTextField.setBorder(null);
        meal2ProteinsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal2ProteinsValueTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal2Panel.add(meal2ProteinsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 40, 100, -1));

        meal2FatsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal2FatsText.setForeground(new java.awt.Color(138, 152, 173));
        meal2FatsText.setText("T??uszcz:");
        meal2FatsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal2Panel.add(meal2FatsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 31, 40, -1));

        meal2FatsValueTextField.setEditable(false);
        meal2FatsValueTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal2FatsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal2FatsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal2FatsValueTextField.setText("-");
        meal2FatsValueTextField.setBorder(null);
        meal2FatsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal2FatsValueTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal2Panel.add(meal2FatsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 100, -1));

        meal2CarbsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal2CarbsText.setForeground(new java.awt.Color(138, 152, 173));
        meal2CarbsText.setText("W??glowodany:");
        meal2CarbsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal2Panel.add(meal2CarbsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 31, 70, -1));

        meal2CarbsValueTextField.setEditable(false);
        meal2CarbsValueTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal2CarbsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal2CarbsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal2CarbsValueTextField.setText("-");
        meal2CarbsValueTextField.setBorder(null);
        meal2CarbsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal2CarbsValueTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal2Panel.add(meal2CarbsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 40, 100, -1));

        mealListPanel.add(meal2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 67, 740, 68));

        meal3Panel.setBackground(new java.awt.Color(50, 54, 61));
        meal3Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        meal3NameTextField.setEditable(false);
        meal3NameTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal3NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        meal3NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal3NameTextField.setText("-");
        meal3NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        meal3NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal3NameTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal3Panel.add(meal3NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 30));

        meal3KcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal3KcalText.setForeground(new java.awt.Color(138, 152, 173));
        meal3KcalText.setText("Kalorie:");
        meal3KcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal3Panel.add(meal3KcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 40, -1));

        meal3KcalValueTextField.setEditable(false);
        meal3KcalValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal3KcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal3KcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal3KcalValueTextField.setText("-");
        meal3KcalValueTextField.setBorder(null);
        meal3KcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal3KcalValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal3Panel.add(meal3KcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        meal3ProteinsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal3ProteinsText.setForeground(new java.awt.Color(138, 152, 173));
        meal3ProteinsText.setText("Bia??ko:");
        meal3ProteinsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal3Panel.add(meal3ProteinsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 31, 40, -1));

        meal3ProteinsValueTextField.setEditable(false);
        meal3ProteinsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal3ProteinsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal3ProteinsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal3ProteinsValueTextField.setText("-");
        meal3ProteinsValueTextField.setBorder(null);
        meal3ProteinsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal3ProteinsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal3Panel.add(meal3ProteinsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 40, 100, -1));

        meal3FatsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal3FatsText.setForeground(new java.awt.Color(138, 152, 173));
        meal3FatsText.setText("T??uszcz:");
        meal3FatsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal3Panel.add(meal3FatsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 31, 40, -1));

        meal3FatsValueTextField.setEditable(false);
        meal3FatsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal3FatsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal3FatsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal3FatsValueTextField.setText("-");
        meal3FatsValueTextField.setBorder(null);
        meal3FatsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal3FatsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal3Panel.add(meal3FatsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 100, -1));

        meal3CarbsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal3CarbsText.setForeground(new java.awt.Color(138, 152, 173));
        meal3CarbsText.setText("W??glowodany:");
        meal3CarbsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal3Panel.add(meal3CarbsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 31, 70, -1));

        meal3CarbsValueTextField.setEditable(false);
        meal3CarbsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal3CarbsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal3CarbsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal3CarbsValueTextField.setText("-");
        meal3CarbsValueTextField.setBorder(null);
        meal3CarbsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal3CarbsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal3Panel.add(meal3CarbsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 40, 100, -1));

        mealListPanel.add(meal3Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, 740, 67));

        meal4Panel.setBackground(new java.awt.Color(46, 49, 55));
        meal4Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        meal4NameTextField.setEditable(false);
        meal4NameTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal4NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        meal4NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal4NameTextField.setText("-");
        meal4NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        meal4NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal4NameTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal4Panel.add(meal4NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 30));

        meal4KcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal4KcalText.setForeground(new java.awt.Color(138, 152, 173));
        meal4KcalText.setText("Kalorie:");
        meal4KcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal4Panel.add(meal4KcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 40, -1));

        meal4KcalValueTextField.setEditable(false);
        meal4KcalValueTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal4KcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal4KcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal4KcalValueTextField.setText("-");
        meal4KcalValueTextField.setBorder(null);
        meal4KcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal4KcalValueTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal4Panel.add(meal4KcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        meal4ProteinsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal4ProteinsText.setForeground(new java.awt.Color(138, 152, 173));
        meal4ProteinsText.setText("Bia??ko:");
        meal4ProteinsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal4Panel.add(meal4ProteinsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 31, 40, -1));

        meal4ProteinsValueTextField.setEditable(false);
        meal4ProteinsValueTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal4ProteinsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal4ProteinsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal4ProteinsValueTextField.setText("-");
        meal4ProteinsValueTextField.setBorder(null);
        meal4ProteinsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal4ProteinsValueTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal4Panel.add(meal4ProteinsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 40, 100, -1));

        meal4FatsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal4FatsText.setForeground(new java.awt.Color(138, 152, 173));
        meal4FatsText.setText("T??uszcz:");
        meal4FatsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal4Panel.add(meal4FatsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 31, 40, -1));

        meal4FatsValueTextField.setEditable(false);
        meal4FatsValueTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal4FatsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal4FatsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal4FatsValueTextField.setText("-");
        meal4FatsValueTextField.setBorder(null);
        meal4FatsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal4FatsValueTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal4Panel.add(meal4FatsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 100, -1));

        meal4CarbsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal4CarbsText.setForeground(new java.awt.Color(138, 152, 173));
        meal4CarbsText.setText("W??glowodany:");
        meal4CarbsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal4Panel.add(meal4CarbsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 31, 70, -1));

        meal4CarbsValueTextField.setEditable(false);
        meal4CarbsValueTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal4CarbsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal4CarbsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal4CarbsValueTextField.setText("-");
        meal4CarbsValueTextField.setBorder(null);
        meal4CarbsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal4CarbsValueTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal4Panel.add(meal4CarbsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 40, 100, -1));

        mealListPanel.add(meal4Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 202, 740, 68));

        meal5Panel.setBackground(new java.awt.Color(50, 54, 61));
        meal5Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        meal5NameTextField.setEditable(false);
        meal5NameTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal5NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        meal5NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal5NameTextField.setText("-");
        meal5NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        meal5NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal5NameTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal5Panel.add(meal5NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 30));

        meal5KcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal5KcalText.setForeground(new java.awt.Color(138, 152, 173));
        meal5KcalText.setText("Kalorie:");
        meal5KcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal5Panel.add(meal5KcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 40, -1));

        meal5KcalValueTextField.setEditable(false);
        meal5KcalValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal5KcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal5KcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal5KcalValueTextField.setText("-");
        meal5KcalValueTextField.setBorder(null);
        meal5KcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal5KcalValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal5Panel.add(meal5KcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        meal5ProteinsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal5ProteinsText.setForeground(new java.awt.Color(138, 152, 173));
        meal5ProteinsText.setText("Bia??ko:");
        meal5ProteinsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal5Panel.add(meal5ProteinsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 31, 40, -1));

        meal5ProteinsValueTextField.setEditable(false);
        meal5ProteinsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal5ProteinsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal5ProteinsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal5ProteinsValueTextField.setText("-");
        meal5ProteinsValueTextField.setBorder(null);
        meal5ProteinsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal5ProteinsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal5Panel.add(meal5ProteinsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 40, 100, -1));

        meal5FatsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal5FatsText.setForeground(new java.awt.Color(138, 152, 173));
        meal5FatsText.setText("T??uszcz:");
        meal5FatsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal5Panel.add(meal5FatsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 31, 40, -1));

        meal5FatsValueTextField.setEditable(false);
        meal5FatsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal5FatsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal5FatsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal5FatsValueTextField.setText("-");
        meal5FatsValueTextField.setBorder(null);
        meal5FatsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal5FatsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal5Panel.add(meal5FatsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 100, -1));

        meal5CarbsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal5CarbsText.setForeground(new java.awt.Color(138, 152, 173));
        meal5CarbsText.setText("W??glowodany:");
        meal5CarbsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal5Panel.add(meal5CarbsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 31, 70, -1));

        meal5CarbsValueTextField.setEditable(false);
        meal5CarbsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal5CarbsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal5CarbsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal5CarbsValueTextField.setText("-");
        meal5CarbsValueTextField.setBorder(null);
        meal5CarbsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal5CarbsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal5Panel.add(meal5CarbsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 40, 100, -1));

        mealListPanel.add(meal5Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 740, 67));

        meal6Panel.setBackground(new java.awt.Color(46, 49, 55));
        meal6Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        meal6NameTextField.setEditable(false);
        meal6NameTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal6NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        meal6NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal6NameTextField.setText("-");
        meal6NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        meal6NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal6NameTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal6Panel.add(meal6NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 30));

        meal6KcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal6KcalText.setForeground(new java.awt.Color(138, 152, 173));
        meal6KcalText.setText("Kalorie:");
        meal6KcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal6Panel.add(meal6KcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 40, -1));

        meal6KcalValueTextField.setEditable(false);
        meal6KcalValueTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal6KcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal6KcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal6KcalValueTextField.setText("-");
        meal6KcalValueTextField.setBorder(null);
        meal6KcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal6KcalValueTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal6Panel.add(meal6KcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        meal6ProteinsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal6ProteinsText.setForeground(new java.awt.Color(138, 152, 173));
        meal6ProteinsText.setText("Bia??ko:");
        meal6ProteinsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal6Panel.add(meal6ProteinsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 31, 40, -1));

        meal6ProteinsValueTextField.setEditable(false);
        meal6ProteinsValueTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal6ProteinsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal6ProteinsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal6ProteinsValueTextField.setText("-");
        meal6ProteinsValueTextField.setBorder(null);
        meal6ProteinsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal6ProteinsValueTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal6Panel.add(meal6ProteinsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 40, 100, -1));

        meal6FatsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal6FatsText.setForeground(new java.awt.Color(138, 152, 173));
        meal6FatsText.setText("T??uszcz:");
        meal6FatsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal6Panel.add(meal6FatsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 31, 40, -1));

        meal6FatsValueTextField.setEditable(false);
        meal6FatsValueTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal6FatsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal6FatsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal6FatsValueTextField.setText("-");
        meal6FatsValueTextField.setBorder(null);
        meal6FatsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal6FatsValueTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal6Panel.add(meal6FatsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 100, -1));

        meal6CarbsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal6CarbsText.setForeground(new java.awt.Color(138, 152, 173));
        meal6CarbsText.setText("W??glowodany:");
        meal6CarbsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal6Panel.add(meal6CarbsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 31, 70, -1));

        meal6CarbsValueTextField.setEditable(false);
        meal6CarbsValueTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal6CarbsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal6CarbsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal6CarbsValueTextField.setText("-");
        meal6CarbsValueTextField.setBorder(null);
        meal6CarbsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal6CarbsValueTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal6Panel.add(meal6CarbsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 40, 100, -1));

        mealListPanel.add(meal6Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 337, 740, 68));

        meal7Panel.setBackground(new java.awt.Color(50, 54, 61));
        meal7Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        meal7NameTextField.setEditable(false);
        meal7NameTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal7NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        meal7NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal7NameTextField.setText("-");
        meal7NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        meal7NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal7NameTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal7Panel.add(meal7NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 30));

        meal7KcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal7KcalText.setForeground(new java.awt.Color(138, 152, 173));
        meal7KcalText.setText("Kalorie:");
        meal7KcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal7Panel.add(meal7KcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 40, -1));

        meal7KcalValueTextField.setEditable(false);
        meal7KcalValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal7KcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal7KcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal7KcalValueTextField.setText("-");
        meal7KcalValueTextField.setBorder(null);
        meal7KcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal7KcalValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal7Panel.add(meal7KcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        meal7ProteinsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal7ProteinsText.setForeground(new java.awt.Color(138, 152, 173));
        meal7ProteinsText.setText("Bia??ko:");
        meal7ProteinsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal7Panel.add(meal7ProteinsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 31, 40, -1));

        meal7ProteinsValueTextField.setEditable(false);
        meal7ProteinsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal7ProteinsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal7ProteinsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal7ProteinsValueTextField.setText("-");
        meal7ProteinsValueTextField.setBorder(null);
        meal7ProteinsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal7ProteinsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal7Panel.add(meal7ProteinsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 40, 100, -1));

        meal7FatsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal7FatsText.setForeground(new java.awt.Color(138, 152, 173));
        meal7FatsText.setText("T??uszcz:");
        meal7FatsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal7Panel.add(meal7FatsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 31, 40, -1));

        meal7FatsValueTextField.setEditable(false);
        meal7FatsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal7FatsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal7FatsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal7FatsValueTextField.setText("-");
        meal7FatsValueTextField.setBorder(null);
        meal7FatsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal7FatsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal7Panel.add(meal7FatsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 100, -1));

        meal7CarbsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal7CarbsText.setForeground(new java.awt.Color(138, 152, 173));
        meal7CarbsText.setText("W??glowodany:");
        meal7CarbsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal7Panel.add(meal7CarbsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 31, 70, -1));

        meal7CarbsValueTextField.setEditable(false);
        meal7CarbsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        meal7CarbsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal7CarbsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal7CarbsValueTextField.setText("-");
        meal7CarbsValueTextField.setBorder(null);
        meal7CarbsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal7CarbsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        meal7Panel.add(meal7CarbsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 40, 100, -1));

        mealListPanel.add(meal7Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 405, 740, 67));

        meal8Panel.setBackground(new java.awt.Color(46, 49, 55));
        meal8Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        meal8NameTextField.setEditable(false);
        meal8NameTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal8NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        meal8NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal8NameTextField.setText("-");
        meal8NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        meal8NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal8NameTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal8Panel.add(meal8NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 30));

        meal8KcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal8KcalText.setForeground(new java.awt.Color(138, 152, 173));
        meal8KcalText.setText("Kalorie:");
        meal8KcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal8Panel.add(meal8KcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 40, -1));

        meal8KcalValueTextField.setEditable(false);
        meal8KcalValueTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal8KcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal8KcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal8KcalValueTextField.setText("-");
        meal8KcalValueTextField.setBorder(null);
        meal8KcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal8KcalValueTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal8Panel.add(meal8KcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        meal8ProteinsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal8ProteinsText.setForeground(new java.awt.Color(138, 152, 173));
        meal8ProteinsText.setText("Bia??ko:");
        meal8ProteinsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal8Panel.add(meal8ProteinsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 31, 40, -1));

        meal8ProteinsValueTextField.setEditable(false);
        meal8ProteinsValueTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal8ProteinsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal8ProteinsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal8ProteinsValueTextField.setText("-");
        meal8ProteinsValueTextField.setBorder(null);
        meal8ProteinsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal8ProteinsValueTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal8Panel.add(meal8ProteinsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 40, 100, -1));

        meal8FatsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal8FatsText.setForeground(new java.awt.Color(138, 152, 173));
        meal8FatsText.setText("T??uszcz:");
        meal8FatsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal8Panel.add(meal8FatsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 31, 40, -1));

        meal8FatsValueTextField.setEditable(false);
        meal8FatsValueTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal8FatsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal8FatsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal8FatsValueTextField.setText("-");
        meal8FatsValueTextField.setBorder(null);
        meal8FatsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal8FatsValueTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal8Panel.add(meal8FatsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 100, -1));

        meal8CarbsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        meal8CarbsText.setForeground(new java.awt.Color(138, 152, 173));
        meal8CarbsText.setText("W??glowodany:");
        meal8CarbsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        meal8Panel.add(meal8CarbsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 31, 70, -1));

        meal8CarbsValueTextField.setEditable(false);
        meal8CarbsValueTextField.setBackground(new java.awt.Color(46, 49, 55));
        meal8CarbsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        meal8CarbsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        meal8CarbsValueTextField.setText("-");
        meal8CarbsValueTextField.setBorder(null);
        meal8CarbsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        meal8CarbsValueTextField.setSelectionColor(new java.awt.Color(46, 49, 55));
        meal8Panel.add(meal8CarbsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 40, 100, -1));

        mealListPanel.add(meal8Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 472, 740, 68));

        mealDiaryPanel.add(mealListPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 165, 740, 540));
        meal1Panel.setVisible(false);
        meal2Panel.setVisible(false);
        meal3Panel.setVisible(false);
        meal4Panel.setVisible(false);
        meal5Panel.setVisible(false);
        meal6Panel.setVisible(false);
        meal7Panel.setVisible(false);
        meal8Panel.setVisible(false);

        mealInfoPanel.setBackground(new java.awt.Color(50, 54, 61));
        mealInfoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalKcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        totalKcalText.setForeground(new java.awt.Color(138, 152, 173));
        totalKcalText.setText("Kalorie:");
        totalKcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealInfoPanel.add(totalKcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 40, -1));

        totalKcalValueTextField.setEditable(false);
        totalKcalValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        totalKcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 42)); // NOI18N
        totalKcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        totalKcalValueTextField.setText("0 kcal");
        totalKcalValueTextField.setBorder(null);
        totalKcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        totalKcalValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        mealInfoPanel.add(totalKcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 245, -1));

        totalProteinsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        totalProteinsText.setForeground(new java.awt.Color(138, 152, 173));
        totalProteinsText.setText("Bia??ko:");
        totalProteinsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealInfoPanel.add(totalProteinsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, 40, -1));

        totalProteinsValueTextField.setEditable(false);
        totalProteinsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        totalProteinsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        totalProteinsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        totalProteinsValueTextField.setText("0g");
        totalProteinsValueTextField.setBorder(null);
        totalProteinsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        totalProteinsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        mealInfoPanel.add(totalProteinsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 245, 60));

        totalFatsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        totalFatsText.setForeground(new java.awt.Color(138, 152, 173));
        totalFatsText.setText("T??uszcz:");
        totalFatsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealInfoPanel.add(totalFatsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 186, 40, -1));

        totalFatsValueTextField.setEditable(false);
        totalFatsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        totalFatsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        totalFatsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        totalFatsValueTextField.setText("0g");
        totalFatsValueTextField.setBorder(null);
        totalFatsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        totalFatsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        mealInfoPanel.add(totalFatsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 245, 60));

        totalCarbsText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        totalCarbsText.setForeground(new java.awt.Color(138, 152, 173));
        totalCarbsText.setText("W??glowodany:");
        totalCarbsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealInfoPanel.add(totalCarbsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 251, 80, -1));

        totalCarbsValueTextField.setEditable(false);
        totalCarbsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        totalCarbsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        totalCarbsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        totalCarbsValueTextField.setText("0g");
        totalCarbsValueTextField.setBorder(null);
        totalCarbsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        totalCarbsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        mealInfoPanel.add(totalCarbsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, 245, 60));

        addMealButton.setBackground(new java.awt.Color(0, 173, 181));
        addMealButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMealButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMealButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMealButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMealButtonMouseExited(evt);
            }
        });
        addMealButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addMealButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        addMealButtonText.setForeground(new java.awt.Color(238, 238, 238));
        addMealButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addMealButtonText.setText("Dodaj posi??ek");
        addMealButton.add(addMealButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 255, 50));

        mealInfoPanel.add(addMealButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 255, 50));

        closeDayButton.setBackground(new java.awt.Color(50, 54, 61));
        closeDayButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 173, 181)));
        closeDayButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeDayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeDayButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeDayButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeDayButtonMouseExited(evt);
            }
        });
        closeDayButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeDayButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        closeDayButtonText.setForeground(new java.awt.Color(238, 238, 238));
        closeDayButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeDayButtonText.setText("Zamknij dzie??");
        closeDayButton.add(closeDayButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 255, 40));

        mealInfoPanel.add(closeDayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 495, 255, 40));

        mealDiaryPanel.add(mealInfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 165, 265, 540));

        mainPanel.add(mealDiaryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 720));

        workoutDiaryPanel.setBackground(new java.awt.Color(57, 62, 70));
        workoutDiaryPanel.setMinimumSize(new java.awt.Dimension(1050, 720));
        workoutDiaryPanel.setPreferredSize(new java.awt.Dimension(1050, 720));
        workoutDiaryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workoutDiaryBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/workoutdiary_banner.png"))); // NOI18N
        workoutDiaryBanner.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                workoutDiaryBannerMouseDragged(evt);
            }
        });
        workoutDiaryBanner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                workoutDiaryBannerMousePressed(evt);
            }
        });
        workoutDiaryPanel.add(workoutDiaryBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectSportBar.setBackground(new java.awt.Color(57, 62, 70));
        selectSportBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectRunningBar.setBackground(new java.awt.Color(0, 173, 181));
        selectRunningBar.setLabelFor(selectSportBar);
        selectRunningBar.setMaximumSize(new java.awt.Dimension(131, 5));
        selectRunningBar.setMinimumSize(new java.awt.Dimension(131, 5));
        selectRunningBar.setOpaque(true);
        selectRunningBar.setPreferredSize(new java.awt.Dimension(131, 5));
        selectSportBar.add(selectRunningBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 5));

        selectLiftingBar.setBackground(new java.awt.Color(0, 173, 181));
        selectLiftingBar.setLabelFor(selectSportBar);
        selectLiftingBar.setMaximumSize(new java.awt.Dimension(131, 5));
        selectLiftingBar.setMinimumSize(new java.awt.Dimension(131, 5));
        selectLiftingBar.setOpaque(true);
        selectLiftingBar.setPreferredSize(new java.awt.Dimension(131, 5));
        selectSportBar.add(selectLiftingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 0, 131, 5));

        selectBikeRidingBar.setBackground(new java.awt.Color(0, 173, 181));
        selectBikeRidingBar.setLabelFor(selectSportBar);
        selectBikeRidingBar.setMaximumSize(new java.awt.Dimension(131, 5));
        selectBikeRidingBar.setMinimumSize(new java.awt.Dimension(131, 5));
        selectBikeRidingBar.setOpaque(true);
        selectBikeRidingBar.setPreferredSize(new java.awt.Dimension(131, 5));
        selectSportBar.add(selectBikeRidingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 0, 131, 5));

        selectFootballBar.setBackground(new java.awt.Color(0, 173, 181));
        selectFootballBar.setLabelFor(selectSportBar);
        selectFootballBar.setMaximumSize(new java.awt.Dimension(132, 5));
        selectFootballBar.setMinimumSize(new java.awt.Dimension(132, 5));
        selectFootballBar.setOpaque(true);
        selectFootballBar.setPreferredSize(new java.awt.Dimension(132, 5));
        selectSportBar.add(selectFootballBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 0, 132, 5));

        selectSwimmingBar.setBackground(new java.awt.Color(0, 173, 181));
        selectSwimmingBar.setLabelFor(selectSportBar);
        selectSwimmingBar.setMaximumSize(new java.awt.Dimension(131, 5));
        selectSwimmingBar.setMinimumSize(new java.awt.Dimension(131, 5));
        selectSwimmingBar.setOpaque(true);
        selectSwimmingBar.setPreferredSize(new java.awt.Dimension(131, 5));
        selectSportBar.add(selectSwimmingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 0, 131, 5));

        selectSkatingBar.setBackground(new java.awt.Color(0, 173, 181));
        selectSkatingBar.setLabelFor(selectSportBar);
        selectSkatingBar.setMaximumSize(new java.awt.Dimension(131, 5));
        selectSkatingBar.setMinimumSize(new java.awt.Dimension(131, 5));
        selectSkatingBar.setOpaque(true);
        selectSkatingBar.setPreferredSize(new java.awt.Dimension(131, 5));
        selectSportBar.add(selectSkatingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 0, 131, 5));

        selectYogaBar.setBackground(new java.awt.Color(0, 173, 181));
        selectYogaBar.setLabelFor(selectSportBar);
        selectYogaBar.setMaximumSize(new java.awt.Dimension(131, 5));
        selectYogaBar.setMinimumSize(new java.awt.Dimension(131, 5));
        selectYogaBar.setOpaque(true);
        selectYogaBar.setPreferredSize(new java.awt.Dimension(131, 5));
        selectSportBar.add(selectYogaBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 0, 131, 5));

        selectJumpingRopeBar.setBackground(new java.awt.Color(0, 173, 181));
        selectJumpingRopeBar.setLabelFor(selectSportBar);
        selectJumpingRopeBar.setMaximumSize(new java.awt.Dimension(132, 5));
        selectJumpingRopeBar.setMinimumSize(new java.awt.Dimension(132, 5));
        selectJumpingRopeBar.setOpaque(true);
        selectJumpingRopeBar.setPreferredSize(new java.awt.Dimension(132, 5));
        selectSportBar.add(selectJumpingRopeBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(918, 0, 132, 5));

        workoutDiaryPanel.add(selectSportBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1050, 5));

        selectSportPanel.setBackground(new java.awt.Color(50, 54, 61));
        selectSportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectRunningButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectRunningButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectRunningButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectRunningButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectRunningButtonMouseExited(evt);
            }
        });
        selectRunningButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectRunningBannerBw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/running_bw.png"))); // NOI18N
        selectRunningButton.add(selectRunningBannerBw, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectRunningBannerColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/running_color.png"))); // NOI18N
        selectRunningButton.add(selectRunningBannerColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectSportPanel.add(selectRunningButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 131, 320));

        selectLiftingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectLiftingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectLiftingButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectLiftingButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectLiftingButtonMouseExited(evt);
            }
        });
        selectLiftingButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectLiftingBannerBw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lifting_bw.png"))); // NOI18N
        selectLiftingButton.add(selectLiftingBannerBw, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectLiftingBannerColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lifting_color.png"))); // NOI18N
        selectLiftingButton.add(selectLiftingBannerColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectSportPanel.add(selectLiftingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 0, 131, 320));

        selectBikeRidingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectBikeRidingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectBikeRidingButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectBikeRidingButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectBikeRidingButtonMouseExited(evt);
            }
        });
        selectBikeRidingButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectBikeRidingBannerBw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bikeriding_bw.png"))); // NOI18N
        selectBikeRidingButton.add(selectBikeRidingBannerBw, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectBikeRidingBannerColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bikeriding_color.png"))); // NOI18N
        selectBikeRidingButton.add(selectBikeRidingBannerColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectSportPanel.add(selectBikeRidingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 0, 131, 320));

        selectFootballButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectFootballButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectFootballButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectFootballButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectFootballButtonMouseExited(evt);
            }
        });
        selectFootballButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectFootballBannerBw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/football_bw.png"))); // NOI18N
        selectFootballButton.add(selectFootballBannerBw, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectFootballBannerColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/football_color.png"))); // NOI18N
        selectFootballButton.add(selectFootballBannerColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectSportPanel.add(selectFootballButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 0, 132, 320));

        selectSwimmingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectSwimmingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectSwimmingButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectSwimmingButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectSwimmingButtonMouseExited(evt);
            }
        });
        selectSwimmingButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectSwimmingBannerBw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/swimming_bw.png"))); // NOI18N
        selectSwimmingButton.add(selectSwimmingBannerBw, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectSwimmingBannerColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/swimming_color.png"))); // NOI18N
        selectSwimmingButton.add(selectSwimmingBannerColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectSportPanel.add(selectSwimmingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 0, 131, 320));

        selectSkatingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectSkatingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectSkatingButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectSkatingButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectSkatingButtonMouseExited(evt);
            }
        });
        selectSkatingButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectSkatingBannerBw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/skating_bw.png"))); // NOI18N
        selectSkatingButton.add(selectSkatingBannerBw, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectSkatingBannerColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/skating_color.png"))); // NOI18N
        selectSkatingButton.add(selectSkatingBannerColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectSportPanel.add(selectSkatingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 0, 131, 320));

        selectYogaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectYogaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectYogaButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectYogaButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectYogaButtonMouseExited(evt);
            }
        });
        selectYogaButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectYogaBannerBw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/yoga_bw.png"))); // NOI18N
        selectYogaButton.add(selectYogaBannerBw, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectYogaBannerColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/yoga_color.png"))); // NOI18N
        selectYogaButton.add(selectYogaBannerColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectSportPanel.add(selectYogaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 0, 131, 320));

        selectJumpingRopeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectJumpingRopeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectJumpingRopeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectJumpingRopeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectJumpingRopeButtonMouseExited(evt);
            }
        });
        selectJumpingRopeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectJumpingRopeBannerBw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/jumpingrope_bw.png"))); // NOI18N
        selectJumpingRopeButton.add(selectJumpingRopeBannerBw, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectJumpingRopeBannerColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/jumpingrope_color.png"))); // NOI18N
        selectJumpingRopeButton.add(selectJumpingRopeBannerColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        selectSportPanel.add(selectJumpingRopeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(918, 0, 132, 320));

        workoutDiaryPanel.add(selectSportPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 1050, 320));

        workoutDetailsInfoPanel.setBackground(new java.awt.Color(50, 54, 61));
        workoutDetailsPanel.setVisible(false);
        workoutDetailsInfoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectSportText.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        selectSportText.setForeground(new java.awt.Color(138, 152, 173));
        selectSportText.setText("Wybierz dyscyplin?? aby kontynuowa??...");
        selectSportText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDetailsInfoPanel.add(selectSportText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 520, 40));

        workoutDiaryPanel.add(workoutDetailsInfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 490, 1020, 215));

        workoutDetailsPanel.setBackground(new java.awt.Color(50, 54, 61));
        workoutDetailsPanel.setVisible(false);
        workoutDetailsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workoutDetailsWeightText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        workoutDetailsWeightText.setForeground(new java.awt.Color(138, 152, 173));
        workoutDetailsWeightText.setText("Masa cia??a (kg):");
        workoutDetailsWeightText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDetailsPanel.add(workoutDetailsWeightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 30));

        workoutDetailsWeightTextField.setBackground(new java.awt.Color(50, 54, 61));
        workoutDetailsWeightTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        workoutDetailsWeightTextField.setForeground(new java.awt.Color(238, 238, 238));
        workoutDetailsWeightTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        workoutDetailsWeightTextField.setBorder(null);
        workoutDetailsWeightTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        workoutDetailsWeightTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        workoutDetailsWeightTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                workoutDetailsWeightTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                workoutDetailsWeightTextFieldKeyReleased(evt);
            }
        });
        workoutDetailsPanel.add(workoutDetailsWeightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 50));

        workoutDetailsWeightTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        workoutDetailsWeightTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        workoutDetailsWeightTextFieldBar.setOpaque(true);
        workoutDetailsPanel.add(workoutDetailsWeightTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, 1));

        workoutDetailsTimeText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        workoutDetailsTimeText.setForeground(new java.awt.Color(138, 152, 173));
        workoutDetailsTimeText.setText("Czas treningu (min):");
        workoutDetailsTimeText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDetailsPanel.add(workoutDetailsTimeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        workoutDetailsTimeTextField.setBackground(new java.awt.Color(50, 54, 61));
        workoutDetailsTimeTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        workoutDetailsTimeTextField.setForeground(new java.awt.Color(238, 238, 238));
        workoutDetailsTimeTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        workoutDetailsTimeTextField.setBorder(null);
        workoutDetailsTimeTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        workoutDetailsTimeTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        workoutDetailsTimeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                workoutDetailsTimeTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                workoutDetailsTimeTextFieldKeyReleased(evt);
            }
        });
        workoutDetailsPanel.add(workoutDetailsTimeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 50));

        workoutDetailsTimeTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        workoutDetailsTimeTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        workoutDetailsTimeTextFieldBar.setOpaque(true);
        workoutDetailsPanel.add(workoutDetailsTimeTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 170, 1));

        workoutDetailsIntensityLevelText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        workoutDetailsIntensityLevelText.setForeground(new java.awt.Color(138, 152, 173));
        workoutDetailsIntensityLevelText.setText("Poziom intensywno??ci:");
        workoutDetailsIntensityLevelText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDetailsPanel.add(workoutDetailsIntensityLevelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 0, 160, 30));

        workoutDetailsIntensityLowText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        workoutDetailsIntensityLowText.setForeground(new java.awt.Color(238, 238, 238));
        workoutDetailsIntensityLowText.setText("Niski");
        workoutDetailsIntensityLowText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDetailsPanel.add(workoutDetailsIntensityLowText, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 35, 60, 20));

        workoutDetailsIntensityMediumText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        workoutDetailsIntensityMediumText.setForeground(new java.awt.Color(238, 238, 238));
        workoutDetailsIntensityMediumText.setText("??redni");
        workoutDetailsIntensityMediumText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDetailsPanel.add(workoutDetailsIntensityMediumText, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 93, 60, 20));

        workoutDetailsIntensityHighText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        workoutDetailsIntensityHighText.setForeground(new java.awt.Color(238, 238, 238));
        workoutDetailsIntensityHighText.setText("Wysoki");
        workoutDetailsIntensityHighText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDetailsPanel.add(workoutDetailsIntensityHighText, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 60, 20));

        workoutDetailsIntensityPanel.setBackground(new java.awt.Color(50, 54, 61));
        workoutDetailsIntensityPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        workoutDetailsIntensityPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verticalBar1.setBackground(new java.awt.Color(63, 66, 71));
        verticalBar1.setOpaque(true);
        workoutDetailsIntensityPanel.add(verticalBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, 1, 29));

        verticalBar2.setBackground(new java.awt.Color(63, 66, 71));
        verticalBar2.setOpaque(true);
        workoutDetailsIntensityPanel.add(verticalBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 87, 1, 29));

        workoutDetailsIntensityLevel1Button.setBackground(new java.awt.Color(50, 54, 61));
        workoutDetailsIntensityLevel1Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workoutDetailsIntensityLevel1ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                workoutDetailsIntensityLevel1ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                workoutDetailsIntensityLevel1ButtonMouseExited(evt);
            }
        });
        workoutDetailsIntensityLevel1Button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workoutDetailsIntensityLevel1ButtonFill.setBackground(new java.awt.Color(63, 66, 71));
        workoutDetailsIntensityLevel1ButtonFill.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        workoutDetailsIntensityLevel1ButtonFill.setForeground(new java.awt.Color(238, 238, 238));
        workoutDetailsIntensityLevel1ButtonFill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workoutDetailsIntensityLevel1ButtonFill.setOpaque(true);
        workoutDetailsIntensityLevel1Button.add(workoutDetailsIntensityLevel1ButtonFill, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 20, 20));

        workoutDetailsIntensityPanel.add(workoutDetailsIntensityLevel1Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        workoutDetailsIntensityLevel2Button.setBackground(new java.awt.Color(50, 54, 61));
        workoutDetailsIntensityLevel2Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workoutDetailsIntensityLevel2ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                workoutDetailsIntensityLevel2ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                workoutDetailsIntensityLevel2ButtonMouseExited(evt);
            }
        });
        workoutDetailsIntensityLevel2Button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workoutDetailsIntensityLevel2ButtonFill.setBackground(new java.awt.Color(0, 173, 181));
        workoutDetailsIntensityLevel2ButtonFill.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        workoutDetailsIntensityLevel2ButtonFill.setForeground(new java.awt.Color(238, 238, 238));
        workoutDetailsIntensityLevel2ButtonFill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workoutDetailsIntensityLevel2ButtonFill.setOpaque(true);
        workoutDetailsIntensityLevel2ButtonFill.setVerifyInputWhenFocusTarget(false);
        workoutDetailsIntensityLevel2Button.add(workoutDetailsIntensityLevel2ButtonFill, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 20, 20));

        workoutDetailsIntensityPanel.add(workoutDetailsIntensityLevel2Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 30, 30));

        workoutDetailsIntensityLevel3Button.setBackground(new java.awt.Color(50, 54, 61));
        workoutDetailsIntensityLevel3Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workoutDetailsIntensityLevel3ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                workoutDetailsIntensityLevel3ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                workoutDetailsIntensityLevel3ButtonMouseExited(evt);
            }
        });
        workoutDetailsIntensityLevel3Button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workoutDetailsIntensityLevel3ButtonFill.setBackground(new java.awt.Color(63, 66, 71));
        workoutDetailsIntensityLevel3ButtonFill.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        workoutDetailsIntensityLevel3ButtonFill.setForeground(new java.awt.Color(238, 238, 238));
        workoutDetailsIntensityLevel3ButtonFill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workoutDetailsIntensityLevel3ButtonFill.setOpaque(true);
        workoutDetailsIntensityLevel3ButtonFill.setVerifyInputWhenFocusTarget(false);
        workoutDetailsIntensityLevel3Button.add(workoutDetailsIntensityLevel3ButtonFill, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 20, 20));

        workoutDetailsIntensityPanel.add(workoutDetailsIntensityLevel3Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 115, 30, 30));

        workoutDetailsPanel.add(workoutDetailsIntensityPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 30, 145));

        workoutDetailsSportNameTextField.setEditable(false);
        workoutDetailsSportNameTextField.setBackground(new java.awt.Color(50, 54, 61));
        workoutDetailsSportNameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        workoutDetailsSportNameTextField.setForeground(new java.awt.Color(238, 238, 238));
        workoutDetailsSportNameTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        workoutDetailsSportNameTextField.setText("Bieganie");
        workoutDetailsSportNameTextField.setBorder(null);
        workoutDetailsSportNameTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        workoutDetailsSportNameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        workoutDetailsSportNameTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutDetailsPanel.add(workoutDetailsSportNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 440, 50));

        workoutDetailsKcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        workoutDetailsKcalText.setForeground(new java.awt.Color(138, 152, 173));
        workoutDetailsKcalText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workoutDetailsKcalText.setText("Spalone kalorie:");
        workoutDetailsKcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDetailsPanel.add(workoutDetailsKcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 100, 30));

        workoutDetailsKcalValueTextField.setEditable(false);
        workoutDetailsKcalValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        workoutDetailsKcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 72)); // NOI18N
        workoutDetailsKcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        workoutDetailsKcalValueTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        workoutDetailsKcalValueTextField.setText("-");
        workoutDetailsKcalValueTextField.setToolTipText("");
        workoutDetailsKcalValueTextField.setBorder(null);
        workoutDetailsKcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        workoutDetailsKcalValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutDetailsPanel.add(workoutDetailsKcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 490, 80));

        workoutDetailsSaveButton.setBackground(new java.awt.Color(0, 173, 181));
        workoutDetailsSaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        workoutDetailsSaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workoutDetailsSaveButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                workoutDetailsSaveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                workoutDetailsSaveButtonMouseExited(evt);
            }
        });
        workoutDetailsSaveButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workoutDetailsSaveButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        workoutDetailsSaveButtonText.setForeground(new java.awt.Color(238, 238, 238));
        workoutDetailsSaveButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workoutDetailsSaveButtonText.setText("Zapisz");
        workoutDetailsSaveButton.add(workoutDetailsSaveButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 35));

        workoutDetailsPanel.add(workoutDetailsSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 165, 240, 35));

        workoutDiaryPanel.add(workoutDetailsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 490, 1020, 215));

        mainPanel.add(workoutDiaryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 720));
        selectRunningBannerColor.setVisible(true);
        selectRunningBannerColor.setVisible(false);
        selectRunningBar.setVisible(false);
        selectLiftingBannerColor.setVisible(true);
        selectLiftingBannerColor.setVisible(false);
        selectLiftingBar.setVisible(false);
        selectBikeRidingBannerColor.setVisible(true);
        selectBikeRidingBannerColor.setVisible(false);
        selectBikeRidingBar.setVisible(false);
        selectFootballBannerColor.setVisible(true);
        selectFootballBannerColor.setVisible(false);
        selectFootballBar.setVisible(false);
        selectSwimmingBannerColor.setVisible(true);
        selectSwimmingBannerColor.setVisible(false);
        selectSwimmingBar.setVisible(false);
        selectSkatingBannerColor.setVisible(true);
        selectSkatingBannerColor.setVisible(false);
        selectSkatingBar.setVisible(false);
        selectYogaBannerColor.setVisible(true);
        selectYogaBannerColor.setVisible(false);
        selectYogaBar.setVisible(false);
        selectJumpingRopeBannerColor.setVisible(true);
        selectJumpingRopeBannerColor.setVisible(false);
        selectJumpingRopeBar.setVisible(false);

        statsPanel.setBackground(new java.awt.Color(57, 62, 70));
        statsPanel.setMinimumSize(new java.awt.Dimension(1050, 720));
        statsPanel.setPreferredSize(new java.awt.Dimension(1050, 720));
        statsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statsBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/stats_banner_1.png"))); // NOI18N
        statsBanner.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                statsBannerMouseDragged(evt);
            }
        });
        statsBanner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                statsBannerMousePressed(evt);
            }
        });
        statsPanel.add(statsBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        kcalStatsPanel.setBackground(new java.awt.Color(50, 54, 61));
        kcalStatsPanel.setMinimumSize(new java.awt.Dimension(420, 315));
        kcalStatsPanel.setPreferredSize(new java.awt.Dimension(420, 315));
        kcalStatsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MealsText.setBackground(new java.awt.Color(46, 49, 55));
        MealsText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        MealsText.setForeground(new java.awt.Color(238, 238, 238));
        MealsText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MealsText.setText("POSI??KI");
        MealsText.setOpaque(true);
        MealsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kcalStatsPanel.add(MealsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 20));

        averageDailyKcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        averageDailyKcalText.setForeground(new java.awt.Color(138, 152, 173));
        averageDailyKcalText.setText("??rednie dzienne spo??ycie kalorii:");
        averageDailyKcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kcalStatsPanel.add(averageDailyKcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 30));

        averageDailyKcalValueTextField.setEditable(false);
        averageDailyKcalValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        averageDailyKcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 41)); // NOI18N
        averageDailyKcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        averageDailyKcalValueTextField.setText("-");
        averageDailyKcalValueTextField.setToolTipText("");
        averageDailyKcalValueTextField.setBorder(null);
        averageDailyKcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        averageDailyKcalValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        kcalStatsPanel.add(averageDailyKcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 260, 50));

        averageDailyMacrosText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        averageDailyMacrosText.setForeground(new java.awt.Color(138, 152, 173));
        averageDailyMacrosText.setText("Bia??ko:                  T??uszcz:                  W??glowodany:");
        averageDailyMacrosText.setToolTipText("");
        averageDailyMacrosText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kcalStatsPanel.add(averageDailyMacrosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 88, 260, 30));

        averageDailyProteinsValueTextField.setEditable(false);
        averageDailyProteinsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        averageDailyProteinsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        averageDailyProteinsValueTextField.setForeground(new java.awt.Color(186, 196, 211));
        averageDailyProteinsValueTextField.setText("-");
        averageDailyProteinsValueTextField.setToolTipText("");
        averageDailyProteinsValueTextField.setBorder(null);
        averageDailyProteinsValueTextField.setSelectedTextColor(new java.awt.Color(186, 196, 211));
        averageDailyProteinsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        kcalStatsPanel.add(averageDailyProteinsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, 80, 40));

        averageDailyFatsValueTextField.setEditable(false);
        averageDailyFatsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        averageDailyFatsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        averageDailyFatsValueTextField.setForeground(new java.awt.Color(186, 196, 211));
        averageDailyFatsValueTextField.setText("-");
        averageDailyFatsValueTextField.setToolTipText("");
        averageDailyFatsValueTextField.setBorder(null);
        averageDailyFatsValueTextField.setSelectedTextColor(new java.awt.Color(186, 196, 211));
        averageDailyFatsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        kcalStatsPanel.add(averageDailyFatsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 105, 80, 40));

        averageDailyCarbsValueTextField.setEditable(false);
        averageDailyCarbsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        averageDailyCarbsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        averageDailyCarbsValueTextField.setForeground(new java.awt.Color(186, 196, 211));
        averageDailyCarbsValueTextField.setText("-");
        averageDailyCarbsValueTextField.setToolTipText("");
        averageDailyCarbsValueTextField.setBorder(null);
        averageDailyCarbsValueTextField.setSelectedTextColor(new java.awt.Color(186, 196, 211));
        averageDailyCarbsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        kcalStatsPanel.add(averageDailyCarbsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 105, 80, 40));

        bar1.setBackground(new java.awt.Color(72, 77, 87));
        bar1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        bar1.setForeground(new java.awt.Color(138, 152, 173));
        bar1.setOpaque(true);
        bar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kcalStatsPanel.add(bar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 260, 1));

        mostDailyKcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        mostDailyKcalText.setForeground(new java.awt.Color(138, 152, 173));
        mostDailyKcalText.setText("Najwi??cej spo??ytych kalorii:");
        mostDailyKcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kcalStatsPanel.add(mostDailyKcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, 30));

        mostDailyKcalValueTextField.setEditable(false);
        mostDailyKcalValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        mostDailyKcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 41)); // NOI18N
        mostDailyKcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        mostDailyKcalValueTextField.setText("-");
        mostDailyKcalValueTextField.setToolTipText("");
        mostDailyKcalValueTextField.setBorder(null);
        mostDailyKcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        mostDailyKcalValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        kcalStatsPanel.add(mostDailyKcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 260, 50));

        mostDailyKcalDateText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        mostDailyKcalDateText.setForeground(new java.awt.Color(138, 152, 173));
        mostDailyKcalDateText.setText("Data:");
        mostDailyKcalDateText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kcalStatsPanel.add(mostDailyKcalDateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 218, 200, 30));

        mostDailyKcalDateTextField.setEditable(false);
        mostDailyKcalDateTextField.setBackground(new java.awt.Color(50, 54, 61));
        mostDailyKcalDateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        mostDailyKcalDateTextField.setForeground(new java.awt.Color(186, 196, 211));
        mostDailyKcalDateTextField.setText("-");
        mostDailyKcalDateTextField.setToolTipText("");
        mostDailyKcalDateTextField.setBorder(null);
        mostDailyKcalDateTextField.setSelectedTextColor(new java.awt.Color(186, 196, 211));
        mostDailyKcalDateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        kcalStatsPanel.add(mostDailyKcalDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 235, 250, 40));

        bar2.setBackground(new java.awt.Color(72, 77, 87));
        bar2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        bar2.setForeground(new java.awt.Color(138, 152, 173));
        bar2.setOpaque(true);
        bar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kcalStatsPanel.add(bar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 279, 260, 1));

        leastDailyKcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        leastDailyKcalText.setForeground(new java.awt.Color(138, 152, 173));
        leastDailyKcalText.setText("Najmniej spo??ytych kalorii:");
        leastDailyKcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kcalStatsPanel.add(leastDailyKcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 200, 30));

        leastDailyKcalValueTextField.setEditable(false);
        leastDailyKcalValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        leastDailyKcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 41)); // NOI18N
        leastDailyKcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        leastDailyKcalValueTextField.setText("-");
        leastDailyKcalValueTextField.setToolTipText("");
        leastDailyKcalValueTextField.setBorder(null);
        leastDailyKcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        leastDailyKcalValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        kcalStatsPanel.add(leastDailyKcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 260, 50));

        leastDailyKcalDateText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        leastDailyKcalDateText.setForeground(new java.awt.Color(138, 152, 173));
        leastDailyKcalDateText.setText("Data:");
        leastDailyKcalDateText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kcalStatsPanel.add(leastDailyKcalDateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 348, 200, 30));

        leastDailyKcalDateTextField.setEditable(false);
        leastDailyKcalDateTextField.setBackground(new java.awt.Color(50, 54, 61));
        leastDailyKcalDateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        leastDailyKcalDateTextField.setForeground(new java.awt.Color(186, 196, 211));
        leastDailyKcalDateTextField.setText("-");
        leastDailyKcalDateTextField.setToolTipText("");
        leastDailyKcalDateTextField.setBorder(null);
        leastDailyKcalDateTextField.setSelectedTextColor(new java.awt.Color(186, 196, 211));
        leastDailyKcalDateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        kcalStatsPanel.add(leastDailyKcalDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 365, 250, 40));

        bar3.setBackground(new java.awt.Color(72, 77, 87));
        bar3.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        bar3.setForeground(new java.awt.Color(138, 152, 173));
        bar3.setOpaque(true);
        bar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kcalStatsPanel.add(bar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 260, 1));

        kcalSumText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        kcalSumText.setForeground(new java.awt.Color(138, 152, 173));
        kcalSumText.setText("????czne spo??ycie kalorii:");
        kcalSumText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kcalStatsPanel.add(kcalSumText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 200, 30));

        kcalSumValueTextField.setEditable(false);
        kcalSumValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        kcalSumValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 41)); // NOI18N
        kcalSumValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        kcalSumValueTextField.setText("-");
        kcalSumValueTextField.setToolTipText("");
        kcalSumValueTextField.setBorder(null);
        kcalSumValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        kcalSumValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        kcalStatsPanel.add(kcalSumValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 260, 50));

        kcalSumDateText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        kcalSumDateText.setForeground(new java.awt.Color(138, 152, 173));
        kcalSumDateText.setText("Od:");
        kcalSumDateText.setToolTipText("");
        kcalSumDateText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kcalStatsPanel.add(kcalSumDateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 478, 200, 30));

        kcalSumDateTextField.setEditable(false);
        kcalSumDateTextField.setBackground(new java.awt.Color(50, 54, 61));
        kcalSumDateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        kcalSumDateTextField.setForeground(new java.awt.Color(186, 196, 211));
        kcalSumDateTextField.setText("-");
        kcalSumDateTextField.setToolTipText("");
        kcalSumDateTextField.setBorder(null);
        kcalSumDateTextField.setSelectedTextColor(new java.awt.Color(186, 196, 211));
        kcalSumDateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        kcalStatsPanel.add(kcalSumDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 495, 250, 40));

        statsPanel.add(kcalStatsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 165, 280, 540));

        workoutStatsPanel.setBackground(new java.awt.Color(50, 54, 61));
        workoutStatsPanel.setMinimumSize(new java.awt.Dimension(420, 315));
        workoutStatsPanel.setPreferredSize(new java.awt.Dimension(420, 315));
        workoutStatsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WorkoutsText.setBackground(new java.awt.Color(46, 49, 55));
        WorkoutsText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        WorkoutsText.setForeground(new java.awt.Color(238, 238, 238));
        WorkoutsText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WorkoutsText.setText("TRENINGI");
        WorkoutsText.setToolTipText("");
        WorkoutsText.setOpaque(true);
        WorkoutsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutStatsPanel.add(WorkoutsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 20));

        averageDailyBurnedKcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        averageDailyBurnedKcalText.setForeground(new java.awt.Color(138, 152, 173));
        averageDailyBurnedKcalText.setText("??rednie dzienne spalenie kalorii:");
        averageDailyBurnedKcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutStatsPanel.add(averageDailyBurnedKcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 30));

        averageDailyBurnedKcalValueTextField.setEditable(false);
        averageDailyBurnedKcalValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        averageDailyBurnedKcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 41)); // NOI18N
        averageDailyBurnedKcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        averageDailyBurnedKcalValueTextField.setText("-");
        averageDailyBurnedKcalValueTextField.setToolTipText("");
        averageDailyBurnedKcalValueTextField.setBorder(null);
        averageDailyBurnedKcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        averageDailyBurnedKcalValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutStatsPanel.add(averageDailyBurnedKcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 260, 50));

        bar4.setBackground(new java.awt.Color(72, 77, 87));
        bar4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        bar4.setForeground(new java.awt.Color(138, 152, 173));
        bar4.setOpaque(true);
        bar4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutStatsPanel.add(bar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 260, 1));

        mostDailyBurnedKcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        mostDailyBurnedKcalText.setForeground(new java.awt.Color(138, 152, 173));
        mostDailyBurnedKcalText.setText("Najwi??cej spalonych kalorii:");
        mostDailyBurnedKcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutStatsPanel.add(mostDailyBurnedKcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, 200, 30));

        mostDailyBurnedKcalDateText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        mostDailyBurnedKcalDateText.setForeground(new java.awt.Color(138, 152, 173));
        mostDailyBurnedKcalDateText.setText("Data:");
        mostDailyBurnedKcalDateText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutStatsPanel.add(mostDailyBurnedKcalDateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, 30));

        mostDailyBurnedKcalDateTextField.setEditable(false);
        mostDailyBurnedKcalDateTextField.setBackground(new java.awt.Color(50, 54, 61));
        mostDailyBurnedKcalDateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        mostDailyBurnedKcalDateTextField.setForeground(new java.awt.Color(186, 196, 211));
        mostDailyBurnedKcalDateTextField.setText("-");
        mostDailyBurnedKcalDateTextField.setToolTipText("");
        mostDailyBurnedKcalDateTextField.setBorder(null);
        mostDailyBurnedKcalDateTextField.setSelectedTextColor(new java.awt.Color(186, 196, 211));
        mostDailyBurnedKcalDateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutStatsPanel.add(mostDailyBurnedKcalDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 177, 250, 40));

        bar5.setBackground(new java.awt.Color(72, 77, 87));
        bar5.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        bar5.setForeground(new java.awt.Color(138, 152, 173));
        bar5.setOpaque(true);
        bar5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutStatsPanel.add(bar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 222, 260, 1));

        favoriteSportText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        favoriteSportText.setForeground(new java.awt.Color(138, 152, 173));
        favoriteSportText.setText("Ulubiona dyscyplina:");
        favoriteSportText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutStatsPanel.add(favoriteSportText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 222, 200, 30));

        favoriteSportTextField.setEditable(false);
        favoriteSportTextField.setBackground(new java.awt.Color(50, 54, 61));
        favoriteSportTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 28)); // NOI18N
        favoriteSportTextField.setForeground(new java.awt.Color(238, 238, 238));
        favoriteSportTextField.setText("-");
        favoriteSportTextField.setToolTipText("");
        favoriteSportTextField.setBorder(null);
        favoriteSportTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        favoriteSportTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutStatsPanel.add(favoriteSportTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 235, 260, 50));

        favoriteSportTrainingsNumberText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        favoriteSportTrainingsNumberText.setForeground(new java.awt.Color(138, 152, 173));
        favoriteSportTrainingsNumberText.setText("Ilo???? trening??w:");
        favoriteSportTrainingsNumberText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutStatsPanel.add(favoriteSportTrainingsNumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 277, 200, 30));

        favoriteSportTrainingsNumberTextField.setEditable(false);
        favoriteSportTrainingsNumberTextField.setBackground(new java.awt.Color(50, 54, 61));
        favoriteSportTrainingsNumberTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        favoriteSportTrainingsNumberTextField.setForeground(new java.awt.Color(186, 196, 211));
        favoriteSportTrainingsNumberTextField.setText("-");
        favoriteSportTrainingsNumberTextField.setToolTipText("");
        favoriteSportTrainingsNumberTextField.setBorder(null);
        favoriteSportTrainingsNumberTextField.setSelectedTextColor(new java.awt.Color(186, 196, 211));
        favoriteSportTrainingsNumberTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutStatsPanel.add(favoriteSportTrainingsNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 294, 250, 40));

        bar6.setBackground(new java.awt.Color(72, 77, 87));
        bar6.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        bar6.setForeground(new java.awt.Color(138, 152, 173));
        bar6.setOpaque(true);
        bar6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutStatsPanel.add(bar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 339, 260, 1));

        totalTrainingsNumberText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        totalTrainingsNumberText.setForeground(new java.awt.Color(138, 152, 173));
        totalTrainingsNumberText.setText("Ilo???? wszystkich trening??w:");
        totalTrainingsNumberText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutStatsPanel.add(totalTrainingsNumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 339, 200, 30));

        totalTrainingsNumberTextField.setEditable(false);
        totalTrainingsNumberTextField.setBackground(new java.awt.Color(50, 54, 61));
        totalTrainingsNumberTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        totalTrainingsNumberTextField.setForeground(new java.awt.Color(238, 238, 238));
        totalTrainingsNumberTextField.setText("-");
        totalTrainingsNumberTextField.setToolTipText("");
        totalTrainingsNumberTextField.setBorder(null);
        totalTrainingsNumberTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        totalTrainingsNumberTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutStatsPanel.add(totalTrainingsNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 357, 260, 50));

        bar7.setBackground(new java.awt.Color(72, 77, 87));
        bar7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        bar7.setForeground(new java.awt.Color(138, 152, 173));
        bar7.setOpaque(true);
        bar7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutStatsPanel.add(bar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 260, 1));

        burnedKcalSumText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        burnedKcalSumText.setForeground(new java.awt.Color(138, 152, 173));
        burnedKcalSumText.setText("????cznie spalonych kalorii:");
        burnedKcalSumText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutStatsPanel.add(burnedKcalSumText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 200, 30));

        burnedKcalSumTextField.setEditable(false);
        burnedKcalSumTextField.setBackground(new java.awt.Color(50, 54, 61));
        burnedKcalSumTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 41)); // NOI18N
        burnedKcalSumTextField.setForeground(new java.awt.Color(238, 238, 238));
        burnedKcalSumTextField.setText("-");
        burnedKcalSumTextField.setToolTipText("");
        burnedKcalSumTextField.setBorder(null);
        burnedKcalSumTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        burnedKcalSumTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutStatsPanel.add(burnedKcalSumTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 260, 50));

        burnedKcalDateText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        burnedKcalDateText.setForeground(new java.awt.Color(138, 152, 173));
        burnedKcalDateText.setText("Od:");
        burnedKcalDateText.setToolTipText("");
        burnedKcalDateText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutStatsPanel.add(burnedKcalDateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 478, 200, 30));

        mostDailyBurnedKcalValueTextField.setEditable(false);
        mostDailyBurnedKcalValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        mostDailyBurnedKcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 41)); // NOI18N
        mostDailyBurnedKcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        mostDailyBurnedKcalValueTextField.setText("-");
        mostDailyBurnedKcalValueTextField.setToolTipText("");
        mostDailyBurnedKcalValueTextField.setBorder(null);
        mostDailyBurnedKcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        mostDailyBurnedKcalValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutStatsPanel.add(mostDailyBurnedKcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 113, 260, 50));

        burnedKcalDateTextField.setEditable(false);
        burnedKcalDateTextField.setBackground(new java.awt.Color(50, 54, 61));
        burnedKcalDateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        burnedKcalDateTextField.setForeground(new java.awt.Color(186, 196, 211));
        burnedKcalDateTextField.setText("-");
        burnedKcalDateTextField.setToolTipText("");
        burnedKcalDateTextField.setBorder(null);
        burnedKcalDateTextField.setSelectedTextColor(new java.awt.Color(186, 196, 211));
        burnedKcalDateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutStatsPanel.add(burnedKcalDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 495, 250, 40));

        statsPanel.add(workoutStatsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 165, 280, 540));

        mealDiaryDiagramPanel.setBackground(new java.awt.Color(50, 54, 61));
        mealDiaryDiagramPanel.setMinimumSize(new java.awt.Dimension(420, 315));
        mealDiaryDiagramPanel.setPreferredSize(new java.awt.Dimension(420, 315));
        mealDiaryDiagramPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mealDiaryDiagramText.setBackground(new java.awt.Color(46, 49, 55));
        mealDiaryDiagramText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        mealDiaryDiagramText.setForeground(new java.awt.Color(238, 238, 238));
        mealDiaryDiagramText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mealDiaryDiagramText.setText("DOSTARCZONE KALORIE - OSTATNIE 7 DNI");
        mealDiaryDiagramText.setOpaque(true);
        mealDiaryDiagramText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagramPanel.add(mealDiaryDiagramText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 20));

        mealDiaryDiagram0Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagram0Text.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagram0Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mealDiaryDiagram0Text.setText("0");
        mealDiaryDiagram0Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagram0Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagramPanel.add(mealDiaryDiagram0Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 230, 20, 16));

        mealDiaryDiagram400Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagram400Text.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagram400Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mealDiaryDiagram400Text.setText("400");
        mealDiaryDiagram400Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagram400Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagramPanel.add(mealDiaryDiagram400Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 214, 20, 16));

        mealDiaryDiagram800Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagram800Text.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagram800Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mealDiaryDiagram800Text.setText("800");
        mealDiaryDiagram800Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagram800Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagramPanel.add(mealDiaryDiagram800Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 198, 20, 16));

        mealDiaryDiagram1200Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagram1200Text.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagram1200Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mealDiaryDiagram1200Text.setText("1200");
        mealDiaryDiagram1200Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagram1200Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagramPanel.add(mealDiaryDiagram1200Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 182, 20, 16));

        mealDiaryDiagram1600Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagram1600Text.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagram1600Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mealDiaryDiagram1600Text.setText("1600");
        mealDiaryDiagram1600Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagram1600Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagramPanel.add(mealDiaryDiagram1600Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 166, -1, 16));

        mealDiaryDiagram2000Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagram2000Text.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagram2000Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mealDiaryDiagram2000Text.setText("2000");
        mealDiaryDiagram2000Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagram2000Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagramPanel.add(mealDiaryDiagram2000Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 150, 20, 16));

        mealDiaryDiagram2400Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagram2400Text.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagram2400Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mealDiaryDiagram2400Text.setText("2400");
        mealDiaryDiagram2400Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagram2400Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagramPanel.add(mealDiaryDiagram2400Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 134, 20, 16));

        mealDiaryDiagram2800Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagram2800Text.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagram2800Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mealDiaryDiagram2800Text.setText("2800");
        mealDiaryDiagram2800Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagram2800Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagramPanel.add(mealDiaryDiagram2800Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 118, -1, 16));

        mealDiaryDiagram3200Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagram3200Text.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagram3200Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mealDiaryDiagram3200Text.setText("3200");
        mealDiaryDiagram3200Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagram3200Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagramPanel.add(mealDiaryDiagram3200Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 102, 20, 16));

        mealDiaryDiagram3600Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagram3600Text.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagram3600Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mealDiaryDiagram3600Text.setText("3600");
        mealDiaryDiagram3600Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagram3600Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagramPanel.add(mealDiaryDiagram3600Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 86, 20, 16));

        mealDiaryDiagram4000Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagram4000Text.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagram4000Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mealDiaryDiagram4000Text.setText("4000");
        mealDiaryDiagram4000Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagram4000Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagramPanel.add(mealDiaryDiagram4000Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 70, 20, 16));

        mealDiaryDiagram4400Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagram4400Text.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagram4400Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mealDiaryDiagram4400Text.setText("4400");
        mealDiaryDiagram4400Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagram4400Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagramPanel.add(mealDiaryDiagram4400Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 54, 20, 16));

        mealDiaryDiagram4800Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagram4800Text.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagram4800Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mealDiaryDiagram4800Text.setText(">4800");
        mealDiaryDiagram4800Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagram4800Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagramPanel.add(mealDiaryDiagram4800Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 38, 30, 16));

        mealDiaryDiagramKcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        mealDiaryDiagramKcalText.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagramKcalText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mealDiaryDiagramKcalText.setText("kcal");
        mealDiaryDiagramKcalText.setToolTipText("");
        mealDiaryDiagramKcalText.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagramKcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mealDiaryDiagramPanel.add(mealDiaryDiagramKcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 22, 20, 16));

        mealDiaryDiagramBar1.setBackground(new java.awt.Color(0, 173, 181));
        mealDiaryDiagramBar1.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagramBar1.setForeground(new java.awt.Color(238, 238, 238));
        mealDiaryDiagramBar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mealDiaryDiagramBar1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        mealDiaryDiagramBar1.setOpaque(true);
        mealDiaryDiagramPanel.add(mealDiaryDiagramBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 239, 35, 1));

        mealDiaryDiagramBar1DateTextField.setEditable(false);
        mealDiaryDiagramBar1DateTextField.setBackground(new java.awt.Color(50, 54, 61));
        mealDiaryDiagramBar1DateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagramBar1DateTextField.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagramBar1DateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mealDiaryDiagramBar1DateTextField.setText("-");
        mealDiaryDiagramBar1DateTextField.setBorder(null);
        mealDiaryDiagramBar1DateTextField.setSelectedTextColor(new java.awt.Color(138, 152, 173));
        mealDiaryDiagramBar1DateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        mealDiaryDiagramPanel.add(mealDiaryDiagramBar1DateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 35, 16));

        mealDiaryDiagramBar2.setBackground(new java.awt.Color(0, 173, 181));
        mealDiaryDiagramBar2.setOpaque(true);
        mealDiaryDiagramPanel.add(mealDiaryDiagramBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 239, 35, 1));

        mealDiaryDiagramBar2DateTextField.setEditable(false);
        mealDiaryDiagramBar2DateTextField.setBackground(new java.awt.Color(50, 54, 61));
        mealDiaryDiagramBar2DateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagramBar2DateTextField.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagramBar2DateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mealDiaryDiagramBar2DateTextField.setText("-");
        mealDiaryDiagramBar2DateTextField.setBorder(null);
        mealDiaryDiagramBar2DateTextField.setSelectedTextColor(new java.awt.Color(138, 152, 173));
        mealDiaryDiagramBar2DateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        mealDiaryDiagramPanel.add(mealDiaryDiagramBar2DateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 240, 35, 16));

        mealDiaryDiagramBar3.setBackground(new java.awt.Color(0, 173, 181));
        mealDiaryDiagramBar3.setOpaque(true);
        mealDiaryDiagramPanel.add(mealDiaryDiagramBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 239, 35, 1));

        mealDiaryDiagramBar3DateTextField.setEditable(false);
        mealDiaryDiagramBar3DateTextField.setBackground(new java.awt.Color(50, 54, 61));
        mealDiaryDiagramBar3DateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagramBar3DateTextField.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagramBar3DateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mealDiaryDiagramBar3DateTextField.setText("-");
        mealDiaryDiagramBar3DateTextField.setBorder(null);
        mealDiaryDiagramBar3DateTextField.setSelectedTextColor(new java.awt.Color(138, 152, 173));
        mealDiaryDiagramBar3DateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        mealDiaryDiagramPanel.add(mealDiaryDiagramBar3DateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 240, 35, 16));

        mealDiaryDiagramBar4.setBackground(new java.awt.Color(0, 173, 181));
        mealDiaryDiagramBar4.setOpaque(true);
        mealDiaryDiagramPanel.add(mealDiaryDiagramBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 239, 35, 1));

        mealDiaryDiagramBar4DateTextField.setEditable(false);
        mealDiaryDiagramBar4DateTextField.setBackground(new java.awt.Color(50, 54, 61));
        mealDiaryDiagramBar4DateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagramBar4DateTextField.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagramBar4DateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mealDiaryDiagramBar4DateTextField.setText("-");
        mealDiaryDiagramBar4DateTextField.setBorder(null);
        mealDiaryDiagramBar4DateTextField.setSelectedTextColor(new java.awt.Color(138, 152, 173));
        mealDiaryDiagramBar4DateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        mealDiaryDiagramPanel.add(mealDiaryDiagramBar4DateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 240, 35, 16));

        mealDiaryDiagramBar5.setBackground(new java.awt.Color(0, 173, 181));
        mealDiaryDiagramBar5.setOpaque(true);
        mealDiaryDiagramPanel.add(mealDiaryDiagramBar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 239, 35, 1));

        mealDiaryDiagramBar5DateTextField.setEditable(false);
        mealDiaryDiagramBar5DateTextField.setBackground(new java.awt.Color(50, 54, 61));
        mealDiaryDiagramBar5DateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagramBar5DateTextField.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagramBar5DateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mealDiaryDiagramBar5DateTextField.setText("-");
        mealDiaryDiagramBar5DateTextField.setBorder(null);
        mealDiaryDiagramBar5DateTextField.setSelectedTextColor(new java.awt.Color(138, 152, 173));
        mealDiaryDiagramBar5DateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        mealDiaryDiagramPanel.add(mealDiaryDiagramBar5DateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 240, 35, 16));

        mealDiaryDiagramBar6.setBackground(new java.awt.Color(0, 173, 181));
        mealDiaryDiagramBar6.setOpaque(true);
        mealDiaryDiagramPanel.add(mealDiaryDiagramBar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 239, 35, 1));

        mealDiaryDiagramBar6DateTextField.setEditable(false);
        mealDiaryDiagramBar6DateTextField.setBackground(new java.awt.Color(50, 54, 61));
        mealDiaryDiagramBar6DateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagramBar6DateTextField.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagramBar6DateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mealDiaryDiagramBar6DateTextField.setText("-");
        mealDiaryDiagramBar6DateTextField.setBorder(null);
        mealDiaryDiagramBar6DateTextField.setSelectedTextColor(new java.awt.Color(138, 152, 173));
        mealDiaryDiagramBar6DateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        mealDiaryDiagramPanel.add(mealDiaryDiagramBar6DateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 35, 16));

        mealDiaryDiagramBar7.setBackground(new java.awt.Color(0, 173, 181));
        mealDiaryDiagramBar7.setOpaque(true);
        mealDiaryDiagramPanel.add(mealDiaryDiagramBar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 239, 35, 1));

        mealDiaryDiagramBar7DateTextField.setEditable(false);
        mealDiaryDiagramBar7DateTextField.setBackground(new java.awt.Color(50, 54, 61));
        mealDiaryDiagramBar7DateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        mealDiaryDiagramBar7DateTextField.setForeground(new java.awt.Color(138, 152, 173));
        mealDiaryDiagramBar7DateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mealDiaryDiagramBar7DateTextField.setText("-");
        mealDiaryDiagramBar7DateTextField.setBorder(null);
        mealDiaryDiagramBar7DateTextField.setSelectedTextColor(new java.awt.Color(138, 152, 173));
        mealDiaryDiagramBar7DateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        mealDiaryDiagramPanel.add(mealDiaryDiagramBar7DateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 240, 35, 16));

        statsPanel.add(mealDiaryDiagramPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 165, 430, 260));

        workoutDiaryDiagramPanel.setBackground(new java.awt.Color(50, 54, 61));
        workoutDiaryDiagramPanel.setMinimumSize(new java.awt.Dimension(420, 315));
        workoutDiaryDiagramPanel.setPreferredSize(new java.awt.Dimension(420, 315));
        workoutDiaryDiagramPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workoutDiaryDiagramText.setBackground(new java.awt.Color(46, 49, 55));
        workoutDiaryDiagramText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        workoutDiaryDiagramText.setForeground(new java.awt.Color(238, 238, 238));
        workoutDiaryDiagramText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workoutDiaryDiagramText.setText("SPALONE KALORIE - OSTATNIE 7 DNI");
        workoutDiaryDiagramText.setOpaque(true);
        workoutDiaryDiagramText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagramText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 20));

        workoutDiaryDiagram0Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagram0Text.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagram0Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workoutDiaryDiagram0Text.setText("0");
        workoutDiaryDiagram0Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagram0Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagram0Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 230, 20, 16));

        workoutDiaryDiagram100Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagram100Text.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagram100Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workoutDiaryDiagram100Text.setText("100");
        workoutDiaryDiagram100Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagram100Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagram100Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 214, 20, 16));

        workoutDiaryDiagram200Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagram200Text.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagram200Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workoutDiaryDiagram200Text.setText("200");
        workoutDiaryDiagram200Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagram200Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagram200Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 198, 20, 16));

        workoutDiaryDiagram300Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagram300Text.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagram300Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workoutDiaryDiagram300Text.setText("300");
        workoutDiaryDiagram300Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagram300Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagram300Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 182, 20, 16));

        workoutDiaryDiagram400Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagram400Text.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagram400Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workoutDiaryDiagram400Text.setText("400");
        workoutDiaryDiagram400Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagram400Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagram400Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 166, 20, 16));

        workoutDiaryDiagram500Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagram500Text.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagram500Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workoutDiaryDiagram500Text.setText("500");
        workoutDiaryDiagram500Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagram500Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagram500Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 150, 20, 16));

        workoutDiaryDiagram600Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagram600Text.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagram600Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workoutDiaryDiagram600Text.setText("600");
        workoutDiaryDiagram600Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagram600Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagram600Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 134, 20, 16));

        workoutDiaryDiagram700Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagram700Text.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagram700Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workoutDiaryDiagram700Text.setText("700");
        workoutDiaryDiagram700Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagram700Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagram700Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 118, 20, 16));

        workoutDiaryDiagram800Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagram800Text.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagram800Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workoutDiaryDiagram800Text.setText("800");
        workoutDiaryDiagram800Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagram800Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagram800Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 102, 20, 16));

        workoutDiaryDiagram900Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagram900Text.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagram900Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workoutDiaryDiagram900Text.setText("900");
        workoutDiaryDiagram900Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagram900Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagram900Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 86, 20, 16));

        workoutDiaryDiagram1000Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagram1000Text.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagram1000Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workoutDiaryDiagram1000Text.setText("1000");
        workoutDiaryDiagram1000Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagram1000Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagram1000Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 70, 20, 16));

        workoutDiaryDiagram1100Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagram1100Text.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagram1100Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workoutDiaryDiagram1100Text.setText("1100");
        workoutDiaryDiagram1100Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagram1100Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagram1100Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 54, 20, 16));

        workoutDiaryDiagram1200Text.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagram1200Text.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagram1200Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workoutDiaryDiagram1200Text.setText(">1200");
        workoutDiaryDiagram1200Text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagram1200Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagram1200Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 38, 30, 16));

        workoutDiaryDiagramKcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        workoutDiaryDiagramKcalText.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagramKcalText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workoutDiaryDiagramKcalText.setText("kcal");
        workoutDiaryDiagramKcalText.setToolTipText("");
        workoutDiaryDiagramKcalText.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagramKcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagramKcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 22, 20, 16));

        workoutDiaryDiagramBar1.setBackground(new java.awt.Color(0, 173, 181));
        workoutDiaryDiagramBar1.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagramBar1.setForeground(new java.awt.Color(238, 238, 238));
        workoutDiaryDiagramBar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workoutDiaryDiagramBar1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        workoutDiaryDiagramBar1.setOpaque(true);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 239, 35, 1));

        workoutDiaryDiagramBar1DateTextField.setEditable(false);
        workoutDiaryDiagramBar1DateTextField.setBackground(new java.awt.Color(50, 54, 61));
        workoutDiaryDiagramBar1DateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagramBar1DateTextField.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagramBar1DateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workoutDiaryDiagramBar1DateTextField.setText("-");
        workoutDiaryDiagramBar1DateTextField.setBorder(null);
        workoutDiaryDiagramBar1DateTextField.setSelectedTextColor(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagramBar1DateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar1DateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 35, 16));

        workoutDiaryDiagramBar2.setBackground(new java.awt.Color(0, 173, 181));
        workoutDiaryDiagramBar2.setOpaque(true);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 239, 35, 1));

        workoutDiaryDiagramBar2DateTextField.setEditable(false);
        workoutDiaryDiagramBar2DateTextField.setBackground(new java.awt.Color(50, 54, 61));
        workoutDiaryDiagramBar2DateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagramBar2DateTextField.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagramBar2DateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workoutDiaryDiagramBar2DateTextField.setText("-");
        workoutDiaryDiagramBar2DateTextField.setBorder(null);
        workoutDiaryDiagramBar2DateTextField.setSelectedTextColor(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagramBar2DateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar2DateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 240, 35, 16));

        workoutDiaryDiagramBar3.setBackground(new java.awt.Color(0, 173, 181));
        workoutDiaryDiagramBar3.setOpaque(true);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 239, 35, 1));

        workoutDiaryDiagramBar3DateTextField.setEditable(false);
        workoutDiaryDiagramBar3DateTextField.setBackground(new java.awt.Color(50, 54, 61));
        workoutDiaryDiagramBar3DateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagramBar3DateTextField.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagramBar3DateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workoutDiaryDiagramBar3DateTextField.setText("-");
        workoutDiaryDiagramBar3DateTextField.setBorder(null);
        workoutDiaryDiagramBar3DateTextField.setSelectedTextColor(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagramBar3DateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar3DateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 240, 35, 16));

        workoutDiaryDiagramBar4.setBackground(new java.awt.Color(0, 173, 181));
        workoutDiaryDiagramBar4.setOpaque(true);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 239, 35, 1));

        workoutDiaryDiagramBar4DateTextField.setEditable(false);
        workoutDiaryDiagramBar4DateTextField.setBackground(new java.awt.Color(50, 54, 61));
        workoutDiaryDiagramBar4DateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagramBar4DateTextField.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagramBar4DateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workoutDiaryDiagramBar4DateTextField.setText("-");
        workoutDiaryDiagramBar4DateTextField.setBorder(null);
        workoutDiaryDiagramBar4DateTextField.setSelectedTextColor(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagramBar4DateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar4DateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 240, 35, 16));

        workoutDiaryDiagramBar5.setBackground(new java.awt.Color(0, 173, 181));
        workoutDiaryDiagramBar5.setOpaque(true);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 239, 35, 1));

        workoutDiaryDiagramBar5DateTextField.setEditable(false);
        workoutDiaryDiagramBar5DateTextField.setBackground(new java.awt.Color(50, 54, 61));
        workoutDiaryDiagramBar5DateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagramBar5DateTextField.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagramBar5DateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workoutDiaryDiagramBar5DateTextField.setText("-");
        workoutDiaryDiagramBar5DateTextField.setBorder(null);
        workoutDiaryDiagramBar5DateTextField.setSelectedTextColor(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagramBar5DateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar5DateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 240, 35, 16));

        workoutDiaryDiagramBar6.setBackground(new java.awt.Color(0, 173, 181));
        workoutDiaryDiagramBar6.setOpaque(true);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 239, 35, 1));

        workoutDiaryDiagramBar6DateTextField.setEditable(false);
        workoutDiaryDiagramBar6DateTextField.setBackground(new java.awt.Color(50, 54, 61));
        workoutDiaryDiagramBar6DateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagramBar6DateTextField.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagramBar6DateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workoutDiaryDiagramBar6DateTextField.setText("-");
        workoutDiaryDiagramBar6DateTextField.setBorder(null);
        workoutDiaryDiagramBar6DateTextField.setSelectedTextColor(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagramBar6DateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar6DateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 35, 16));

        workoutDiaryDiagramBar7.setBackground(new java.awt.Color(0, 173, 181));
        workoutDiaryDiagramBar7.setOpaque(true);
        workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 239, 35, 1));

        workoutDiaryDiagramBar7DateTextField.setEditable(false);
        workoutDiaryDiagramBar7DateTextField.setBackground(new java.awt.Color(50, 54, 61));
        workoutDiaryDiagramBar7DateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        workoutDiaryDiagramBar7DateTextField.setForeground(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagramBar7DateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workoutDiaryDiagramBar7DateTextField.setText("-");
        workoutDiaryDiagramBar7DateTextField.setBorder(null);
        workoutDiaryDiagramBar7DateTextField.setSelectedTextColor(new java.awt.Color(138, 152, 173));
        workoutDiaryDiagramBar7DateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar7DateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 240, 35, 16));

        statsPanel.add(workoutDiaryDiagramPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 440, 430, 260));

        mainPanel.add(statsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 720));

        calcPanel.setBackground(new java.awt.Color(57, 62, 70));
        calcPanel.setMinimumSize(new java.awt.Dimension(1050, 720));
        calcPanel.setPreferredSize(new java.awt.Dimension(1050, 720));
        calcPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/calc_banner.png"))); // NOI18N
        calcBanner.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                calcBannerMouseDragged(evt);
            }
        });
        calcBanner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                calcBannerMousePressed(evt);
            }
        });
        calcPanel.add(calcBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        calcMenu.setBackground(new java.awt.Color(50, 54, 61));
        calcMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcBmrButton.setBackground(new java.awt.Color(50, 54, 61));
        calcBmrButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcBmrButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcBmrButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBmrButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBmrButtonMouseExited(evt);
            }
        });
        calcBmrButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bmrButtonText.setBackground(new java.awt.Color(0, 173, 181));
        bmrButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        bmrButtonText.setForeground(new java.awt.Color(238, 238, 238));
        bmrButtonText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bmrButtonText.setText("   BMR (Zapotrzebowanie kalorycze)");
        bmrButtonText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bmrButtonText.setOpaque(true);
        calcBmrButton.add(bmrButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 410, 60));

        calcMenu.add(calcBmrButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 70));

        calcBmiButton.setBackground(new java.awt.Color(50, 54, 61));
        calcBmiButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcBmiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcBmiButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBmiButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBmiButtonMouseExited(evt);
            }
        });
        calcBmiButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bmiButtonText.setBackground(new java.awt.Color(0, 173, 181));
        bmiButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        bmiButtonText.setForeground(new java.awt.Color(238, 238, 238));
        bmiButtonText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bmiButtonText.setText("   BMI (Wska??nik masy cia??a)");
        bmiButtonText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcBmiButton.add(bmiButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 410, 60));

        calcMenu.add(calcBmiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 420, 70));

        calcBfiButton.setBackground(new java.awt.Color(50, 54, 61));
        calcBfiButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcBfiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcBfiButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBfiButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBfiButtonMouseExited(evt);
            }
        });
        calcBfiButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bfiButtonText.setBackground(new java.awt.Color(0, 173, 181));
        bfiButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        bfiButtonText.setForeground(new java.awt.Color(238, 238, 238));
        bfiButtonText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bfiButtonText.setText("   BFI (Poziom tkanki t??uszczowej)");
        bfiButtonText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcBfiButton.add(bfiButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 410, 60));

        calcMenu.add(calcBfiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 420, 70));

        calcPanel.add(calcMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 165, 420, 210));

        calcBmrPanel.setBackground(new java.awt.Color(50, 54, 61));
        calcBmrPanel.setMinimumSize(new java.awt.Dimension(585, 540));
        calcBmrPanel.setPreferredSize(new java.awt.Dimension(585, 540));
        calcBmrPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcBmrTitleText.setFont(new java.awt.Font("Segoe UI Light", 0, 26)); // NOI18N
        calcBmrTitleText.setForeground(new java.awt.Color(238, 238, 238));
        calcBmrTitleText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        calcBmrTitleText.setText("Oblicz swoje zapotrzebowanie kaloryczne");
        calcBmrPanel.add(calcBmrTitleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 3, 570, 40));

        calcBmrWeightText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        calcBmrWeightText.setForeground(new java.awt.Color(138, 152, 173));
        calcBmrWeightText.setText("Waga:");
        calcBmrPanel.add(calcBmrWeightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 60, -1, -1));

        calcBmrWeightValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        calcBmrWeightValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        calcBmrWeightValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        calcBmrWeightValueTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        calcBmrWeightValueTextField.setBorder(null);
        calcBmrWeightValueTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        calcBmrWeightValueTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        calcBmrWeightValueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calcBmrWeightValueTextFieldKeyPressed(evt);
            }
        });
        calcBmrPanel.add(calcBmrWeightValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 90, 170, 50));

        calcBmrWeightValueTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        calcBmrWeightValueTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        calcBmrWeightValueTextFieldBar.setOpaque(true);
        calcBmrPanel.add(calcBmrWeightValueTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, 170, 1));

        calcBmrKgText.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        calcBmrKgText.setForeground(new java.awt.Color(238, 238, 238));
        calcBmrKgText.setText("kg");
        calcBmrKgText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBmrPanel.add(calcBmrKgText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 90, -1, 50));

        calcBmrHeightText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        calcBmrHeightText.setForeground(new java.awt.Color(138, 152, 173));
        calcBmrHeightText.setText("Wzrost:");
        calcBmrPanel.add(calcBmrHeightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 155, -1, -1));

        calcBmrHeightValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        calcBmrHeightValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        calcBmrHeightValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        calcBmrHeightValueTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        calcBmrHeightValueTextField.setBorder(null);
        calcBmrHeightValueTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        calcBmrHeightValueTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        calcBmrHeightValueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calcBmrHeightValueTextFieldKeyPressed(evt);
            }
        });
        calcBmrPanel.add(calcBmrHeightValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 185, 170, 50));

        calcBmrHeightValueTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        calcBmrHeightValueTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        calcBmrHeightValueTextFieldBar.setOpaque(true);
        calcBmrPanel.add(calcBmrHeightValueTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 235, 170, 1));

        calcBmrCmText.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        calcBmrCmText.setForeground(new java.awt.Color(238, 238, 238));
        calcBmrCmText.setText("cm");
        calcBmrCmText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBmrPanel.add(calcBmrCmText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 185, -1, 50));

        calcBmrAgeText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        calcBmrAgeText.setForeground(new java.awt.Color(138, 152, 173));
        calcBmrAgeText.setText("Wiek:");
        calcBmrPanel.add(calcBmrAgeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 250, -1, -1));

        calcBmrAgeValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        calcBmrAgeValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        calcBmrAgeValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        calcBmrAgeValueTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        calcBmrAgeValueTextField.setBorder(null);
        calcBmrAgeValueTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        calcBmrAgeValueTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        calcBmrAgeValueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calcBmrAgeValueTextFieldKeyPressed(evt);
            }
        });
        calcBmrPanel.add(calcBmrAgeValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 280, 170, 50));

        calcBmrAgeValueTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        calcBmrAgeValueTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        calcBmrAgeValueTextFieldBar.setOpaque(true);
        calcBmrPanel.add(calcBmrAgeValueTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 330, 170, 1));

        calcBmrYearsText.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        calcBmrYearsText.setForeground(new java.awt.Color(238, 238, 238));
        calcBmrYearsText.setText("lat");
        calcBmrYearsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBmrPanel.add(calcBmrYearsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 280, -1, 50));

        calcBmrGenderText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        calcBmrGenderText.setForeground(new java.awt.Color(138, 152, 173));
        calcBmrGenderText.setText("P??e??:");
        calcBmrPanel.add(calcBmrGenderText, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 345, -1, -1));

        calcBmrSelectGenderButton.setBackground(new java.awt.Color(59, 63, 70));
        calcBmrSelectGenderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcBmrSelectGenderButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcBmrSelectGenderFemaleButton.setBackground(new java.awt.Color(59, 63, 70));
        calcBmrSelectGenderFemaleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcBmrSelectGenderFemaleButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBmrSelectGenderFemaleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBmrSelectGenderFemaleButtonMouseExited(evt);
            }
        });
        calcBmrSelectGenderFemaleButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcBmrSelectGenderFemaleButtonText.setBackground(new java.awt.Color(0, 173, 181));
        calcBmrSelectGenderFemaleButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        calcBmrSelectGenderFemaleButtonText.setForeground(new java.awt.Color(238, 238, 238));
        calcBmrSelectGenderFemaleButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calcBmrSelectGenderFemaleButtonText.setText("Kobieta");
        calcBmrSelectGenderFemaleButtonText.setOpaque(true);
        calcBmrSelectGenderFemaleButton.add(calcBmrSelectGenderFemaleButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 132, 40));

        calcBmrSelectGenderButton.add(calcBmrSelectGenderFemaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        calcBmrSelectGenderMaleButton.setBackground(new java.awt.Color(59, 63, 70));
        calcBmrSelectGenderMaleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcBmrSelectGenderMaleButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBmrSelectGenderMaleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBmrSelectGenderMaleButtonMouseExited(evt);
            }
        });
        calcBmrSelectGenderMaleButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcBmrSelectGenderMaleButtonText.setBackground(new java.awt.Color(0, 173, 181));
        calcBmrSelectGenderMaleButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        calcBmrSelectGenderMaleButtonText.setForeground(new java.awt.Color(238, 238, 238));
        calcBmrSelectGenderMaleButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calcBmrSelectGenderMaleButtonText.setText("M????czyzna");
        calcBmrSelectGenderMaleButton.add(calcBmrSelectGenderMaleButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 5, 133, 40));

        calcBmrSelectGenderButton.add(calcBmrSelectGenderMaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 140, 50));

        calcBmrPanel.add(calcBmrSelectGenderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 375, 280, 50));

        physicalActivityTypeText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        physicalActivityTypeText.setForeground(new java.awt.Color(238, 238, 238));
        physicalActivityTypeText.setText("Rodzaj aktywno??ci fizycznej:");
        calcBmrPanel.add(physicalActivityTypeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        physicalActivityTypePanel.setBackground(new java.awt.Color(59, 63, 70));
        physicalActivityTypePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        physicalActivityTypePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        physicalActivityLevel1Button.setBackground(new java.awt.Color(59, 63, 70));
        physicalActivityLevel1Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                physicalActivityLevel1ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                physicalActivityLevel1ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                physicalActivityLevel1ButtonMouseExited(evt);
            }
        });
        physicalActivityLevel1Button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        physicalActivityLevel1Text.setBackground(new java.awt.Color(0, 173, 181));
        physicalActivityLevel1Text.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        physicalActivityLevel1Text.setForeground(new java.awt.Color(238, 238, 238));
        physicalActivityLevel1Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        physicalActivityLevel1Text.setText("Brak aktywno??ci, praca siedz??ca");
        physicalActivityLevel1Text.setOpaque(true);
        physicalActivityLevel1Button.add(physicalActivityLevel1Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 240, 38));

        physicalActivityTypePanel.add(physicalActivityLevel1Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 48));

        physicalActivityLevel2Button.setBackground(new java.awt.Color(59, 63, 70));
        physicalActivityLevel2Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                physicalActivityLevel2ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                physicalActivityLevel2ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                physicalActivityLevel2ButtonMouseExited(evt);
            }
        });
        physicalActivityLevel2Button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        physicalActivityLevel2Text1.setBackground(new java.awt.Color(0, 173, 181));
        physicalActivityLevel2Text1.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        physicalActivityLevel2Text1.setForeground(new java.awt.Color(238, 238, 238));
        physicalActivityLevel2Text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        physicalActivityLevel2Text1.setText("Niska aktywno???? (praca siedz??ca");
        physicalActivityLevel2Text1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        physicalActivityLevel2Text1.setVerifyInputWhenFocusTarget(false);
        physicalActivityLevel2Button.add(physicalActivityLevel2Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 240, 19));

        physicalActivityLevel2Text2.setBackground(new java.awt.Color(0, 173, 181));
        physicalActivityLevel2Text2.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        physicalActivityLevel2Text2.setForeground(new java.awt.Color(238, 238, 238));
        physicalActivityLevel2Text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        physicalActivityLevel2Text2.setText(" i 1-2 treningi w tygodniu)");
        physicalActivityLevel2Text2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        physicalActivityLevel2Text2.setVerifyInputWhenFocusTarget(false);
        physicalActivityLevel2Button.add(physicalActivityLevel2Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 22, 240, 21));

        physicalActivityTypePanel.add(physicalActivityLevel2Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 250, 48));

        physicalActivityLevel3Button.setBackground(new java.awt.Color(59, 63, 70));
        physicalActivityLevel3Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                physicalActivityLevel3ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                physicalActivityLevel3ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                physicalActivityLevel3ButtonMouseExited(evt);
            }
        });
        physicalActivityLevel3Button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        physicalActivityLevel3Text1.setBackground(new java.awt.Color(0, 173, 181));
        physicalActivityLevel3Text1.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        physicalActivityLevel3Text1.setForeground(new java.awt.Color(238, 238, 238));
        physicalActivityLevel3Text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        physicalActivityLevel3Text1.setText("??rednia aktywno???? (praca siedz??ca");
        physicalActivityLevel3Text1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        physicalActivityLevel3Text1.setVerifyInputWhenFocusTarget(false);
        physicalActivityLevel3Button.add(physicalActivityLevel3Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 240, 19));

        physicalActivityLevel3Text2.setBackground(new java.awt.Color(0, 173, 181));
        physicalActivityLevel3Text2.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        physicalActivityLevel3Text2.setForeground(new java.awt.Color(238, 238, 238));
        physicalActivityLevel3Text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        physicalActivityLevel3Text2.setText(" i 3-4 treningi w tygodniu)");
        physicalActivityLevel3Text2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        physicalActivityLevel3Text2.setVerifyInputWhenFocusTarget(false);
        physicalActivityLevel3Button.add(physicalActivityLevel3Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 22, 240, 21));

        physicalActivityTypePanel.add(physicalActivityLevel3Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 250, 48));

        physicalActivityLevel4Button.setBackground(new java.awt.Color(59, 63, 70));
        physicalActivityLevel4Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                physicalActivityLevel4ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                physicalActivityLevel4ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                physicalActivityLevel4ButtonMouseExited(evt);
            }
        });
        physicalActivityLevel4Button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        physicalActivityLevel4Text1.setBackground(new java.awt.Color(0, 173, 181));
        physicalActivityLevel4Text1.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        physicalActivityLevel4Text1.setForeground(new java.awt.Color(238, 238, 238));
        physicalActivityLevel4Text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        physicalActivityLevel4Text1.setText("Wysoka aktywno???? (praca fizyczna");
        physicalActivityLevel4Text1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        physicalActivityLevel4Text1.setVerifyInputWhenFocusTarget(false);
        physicalActivityLevel4Button.add(physicalActivityLevel4Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 240, 19));

        physicalActivityLevel4Text2.setBackground(new java.awt.Color(0, 173, 181));
        physicalActivityLevel4Text2.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        physicalActivityLevel4Text2.setForeground(new java.awt.Color(238, 238, 238));
        physicalActivityLevel4Text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        physicalActivityLevel4Text2.setText("i 3-4 treningi w tygodniu)");
        physicalActivityLevel4Text2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        physicalActivityLevel4Text2.setVerifyInputWhenFocusTarget(false);
        physicalActivityLevel4Button.add(physicalActivityLevel4Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 22, 240, 21));

        physicalActivityTypePanel.add(physicalActivityLevel4Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 144, 250, 48));

        physicalActivityLevel5Button.setBackground(new java.awt.Color(59, 63, 70));
        physicalActivityLevel5Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                physicalActivityLevel5ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                physicalActivityLevel5ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                physicalActivityLevel5ButtonMouseExited(evt);
            }
        });
        physicalActivityLevel5Button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        physicalActivityLevel5Text1.setBackground(new java.awt.Color(0, 173, 181));
        physicalActivityLevel5Text1.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        physicalActivityLevel5Text1.setForeground(new java.awt.Color(238, 238, 238));
        physicalActivityLevel5Text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        physicalActivityLevel5Text1.setText("Bardzo wysoka aktywno???? (zawodowi");
        physicalActivityLevel5Text1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        physicalActivityLevel5Text1.setVerifyInputWhenFocusTarget(false);
        physicalActivityLevel5Button.add(physicalActivityLevel5Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 240, 19));

        physicalActivityLevel5Text2.setBackground(new java.awt.Color(0, 173, 181));
        physicalActivityLevel5Text2.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        physicalActivityLevel5Text2.setForeground(new java.awt.Color(238, 238, 238));
        physicalActivityLevel5Text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        physicalActivityLevel5Text2.setText("sportowcy, osoby codziennie trenuj??ce)");
        physicalActivityLevel5Text2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        physicalActivityLevel5Text2.setVerifyInputWhenFocusTarget(false);
        physicalActivityLevel5Button.add(physicalActivityLevel5Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 22, 240, 21));

        physicalActivityTypePanel.add(physicalActivityLevel5Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 192, 250, 48));

        calcBmrPanel.add(physicalActivityTypePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 250, 240));

        calculateBmrButton.setBackground(new java.awt.Color(0, 173, 181));
        calculateBmrButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculateBmrButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateBmrButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculateBmrButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calculateBmrButtonMouseExited(evt);
            }
        });
        calculateBmrButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calculateBmrButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        calculateBmrButtonText.setForeground(new java.awt.Color(238, 238, 238));
        calculateBmrButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculateBmrButtonText.setText("Oblicz");
        calculateBmrButton.add(calculateBmrButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 555, 50));

        calcBmrPanel.add(calculateBmrButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 475, 555, 50));

        calcPanel.add(calcBmrPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 165, 585, 540));

        calcBmrResultPanel.setBackground(new java.awt.Color(50, 54, 61));
        calcBmrResultPanel.setMinimumSize(new java.awt.Dimension(420, 315));
        calcBmrResultPanel.setPreferredSize(new java.awt.Dimension(420, 315));
        calcBmrResultPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcBmrResultText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        calcBmrResultText.setForeground(new java.awt.Color(138, 152, 173));
        calcBmrResultText.setText("Twoje podstawowe zapotrzebowanie\n kaloryczne wynosi:");
        calcBmrResultText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBmrResultPanel.add(calcBmrResultText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 435, 30));

        bmrResultKcalValueTextField.setEditable(false);
        bmrResultKcalValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        bmrResultKcalValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 72)); // NOI18N
        bmrResultKcalValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        bmrResultKcalValueTextField.setText("-");
        bmrResultKcalValueTextField.setToolTipText("");
        bmrResultKcalValueTextField.setBorder(null);
        bmrResultKcalValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bmrResultKcalValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        calcBmrResultPanel.add(bmrResultKcalValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 330, 80));

        bmrResultMacrosText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        bmrResultMacrosText.setForeground(new java.awt.Color(138, 152, 173));
        bmrResultMacrosText.setText("Bia??ko:                  T??uszcz:                  W??glowodany:");
        bmrResultMacrosText.setToolTipText("");
        bmrResultMacrosText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBmrResultPanel.add(bmrResultMacrosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 435, 30));
        bmrResultMacrosText.getAccessibleContext().setAccessibleName("Bia??ko:");

        bmrResultProteinsValueTextField.setEditable(false);
        bmrResultProteinsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        bmrResultProteinsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        bmrResultProteinsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        bmrResultProteinsValueTextField.setText("-");
        bmrResultProteinsValueTextField.setToolTipText("");
        bmrResultProteinsValueTextField.setBorder(null);
        bmrResultProteinsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bmrResultProteinsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        calcBmrResultPanel.add(bmrResultProteinsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, 50));

        bmrResultFatsValueTextField.setEditable(false);
        bmrResultFatsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        bmrResultFatsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        bmrResultFatsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        bmrResultFatsValueTextField.setText("-");
        bmrResultFatsValueTextField.setToolTipText("");
        bmrResultFatsValueTextField.setBorder(null);
        bmrResultFatsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bmrResultFatsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        calcBmrResultPanel.add(bmrResultFatsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 110, 50));

        bmrResultCarbsValueTextField.setEditable(false);
        bmrResultCarbsValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        bmrResultCarbsValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        bmrResultCarbsValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        bmrResultCarbsValueTextField.setText("-");
        bmrResultCarbsValueTextField.setToolTipText("");
        bmrResultCarbsValueTextField.setBorder(null);
        bmrResultCarbsValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bmrResultCarbsValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        calcBmrResultPanel.add(bmrResultCarbsValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 110, 50));

        calcBmrResultCutText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        calcBmrResultCutText.setForeground(new java.awt.Color(138, 152, 173));
        calcBmrResultCutText.setText("Redukcja wagi:");
        calcBmrResultCutText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBmrResultPanel.add(calcBmrResultCutText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, 110, 30));

        bmrResultKcalCutValueTextField.setEditable(false);
        bmrResultKcalCutValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        bmrResultKcalCutValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        bmrResultKcalCutValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        bmrResultKcalCutValueTextField.setText("-");
        bmrResultKcalCutValueTextField.setToolTipText("");
        bmrResultKcalCutValueTextField.setBorder(null);
        bmrResultKcalCutValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bmrResultKcalCutValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        calcBmrResultPanel.add(bmrResultKcalCutValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, 110, 30));

        bmrResultCutMacrosText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        bmrResultCutMacrosText.setForeground(new java.awt.Color(138, 152, 173));
        bmrResultCutMacrosText.setText("B:                      T:                       W:");
        bmrResultCutMacrosText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBmrResultPanel.add(bmrResultCutMacrosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 175, 230, 30));
        bmrResultCutMacrosText.getAccessibleContext().setAccessibleName("Bia??ko:               T??uszcz             W??glowodany:");
        bmrResultCutMacrosText.getAccessibleContext().setAccessibleDescription("");

        bmrResultProteinsCutValueTextField.setEditable(false);
        bmrResultProteinsCutValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        bmrResultProteinsCutValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        bmrResultProteinsCutValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        bmrResultProteinsCutValueTextField.setText("-");
        bmrResultProteinsCutValueTextField.setToolTipText("");
        bmrResultProteinsCutValueTextField.setBorder(null);
        bmrResultProteinsCutValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bmrResultProteinsCutValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        calcBmrResultPanel.add(bmrResultProteinsCutValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 195, 60, 30));

        bmrResultFatsCutValueTextField.setEditable(false);
        bmrResultFatsCutValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        bmrResultFatsCutValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        bmrResultFatsCutValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        bmrResultFatsCutValueTextField.setText("-");
        bmrResultFatsCutValueTextField.setToolTipText("");
        bmrResultFatsCutValueTextField.setBorder(null);
        bmrResultFatsCutValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bmrResultFatsCutValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        calcBmrResultPanel.add(bmrResultFatsCutValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 195, 60, 30));

        bmrResultCarbsCutValueTextField.setEditable(false);
        bmrResultCarbsCutValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        bmrResultCarbsCutValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        bmrResultCarbsCutValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        bmrResultCarbsCutValueTextField.setText("-");
        bmrResultCarbsCutValueTextField.setToolTipText("");
        bmrResultCarbsCutValueTextField.setBorder(null);
        bmrResultCarbsCutValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bmrResultCarbsCutValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        calcBmrResultPanel.add(bmrResultCarbsCutValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 195, 60, 30));

        calcBmrResultOverText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        calcBmrResultOverText.setForeground(new java.awt.Color(138, 152, 173));
        calcBmrResultOverText.setText("Budowanie masy:");
        calcBmrResultOverText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBmrResultPanel.add(calcBmrResultOverText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 110, 30));

        bmrResultKcalOverValueTextField.setEditable(false);
        bmrResultKcalOverValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        bmrResultKcalOverValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        bmrResultKcalOverValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        bmrResultKcalOverValueTextField.setText("-");
        bmrResultKcalOverValueTextField.setToolTipText("");
        bmrResultKcalOverValueTextField.setBorder(null);
        bmrResultKcalOverValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bmrResultKcalOverValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        calcBmrResultPanel.add(bmrResultKcalOverValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, 110, 30));

        bmrResultOverMacrosText.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        bmrResultOverMacrosText.setForeground(new java.awt.Color(138, 152, 173));
        bmrResultOverMacrosText.setText("B:                      T:                       W:");
        bmrResultOverMacrosText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBmrResultPanel.add(bmrResultOverMacrosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 230, 30));

        bmrResultProteinsOverValueTextField.setEditable(false);
        bmrResultProteinsOverValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        bmrResultProteinsOverValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        bmrResultProteinsOverValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        bmrResultProteinsOverValueTextField.setText("-");
        bmrResultProteinsOverValueTextField.setToolTipText("");
        bmrResultProteinsOverValueTextField.setBorder(null);
        bmrResultProteinsOverValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bmrResultProteinsOverValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        calcBmrResultPanel.add(bmrResultProteinsOverValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 255, 60, 30));

        bmrResultFatsOverValueTextField.setEditable(false);
        bmrResultFatsOverValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        bmrResultFatsOverValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        bmrResultFatsOverValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        bmrResultFatsOverValueTextField.setText("-");
        bmrResultFatsOverValueTextField.setToolTipText("");
        bmrResultFatsOverValueTextField.setBorder(null);
        bmrResultFatsOverValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bmrResultFatsOverValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        calcBmrResultPanel.add(bmrResultFatsOverValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 255, 60, 30));

        bmrResultCarbsOverValueTextField.setEditable(false);
        bmrResultCarbsOverValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        bmrResultCarbsOverValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        bmrResultCarbsOverValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        bmrResultCarbsOverValueTextField.setText("-");
        bmrResultCarbsOverValueTextField.setToolTipText("");
        bmrResultCarbsOverValueTextField.setBorder(null);
        bmrResultCarbsOverValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bmrResultCarbsOverValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        calcBmrResultPanel.add(bmrResultCarbsOverValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 255, 60, 30));

        calcPanel.add(calcBmrResultPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 390, 420, 315));

        calcBmiPanel.setBackground(new java.awt.Color(50, 54, 61));
        calcBmiPanel.setMinimumSize(new java.awt.Dimension(585, 540));
        calcBmiPanel.setPreferredSize(new java.awt.Dimension(585, 540));
        calcBmiPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcBmiTitleText.setFont(new java.awt.Font("Segoe UI Light", 0, 26)); // NOI18N
        calcBmiTitleText.setForeground(new java.awt.Color(238, 238, 238));
        calcBmiTitleText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        calcBmiTitleText.setText("Oblicz sw??j wska??nik masy cia??a");
        calcBmiPanel.add(calcBmiTitleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 3, 570, 40));

        calcBmiWeightText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        calcBmiWeightText.setForeground(new java.awt.Color(238, 238, 238));
        calcBmiWeightText.setText("Waga:");
        calcBmiPanel.add(calcBmiWeightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 60, -1, -1));

        calcBmiWeightValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        calcBmiWeightValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        calcBmiWeightValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        calcBmiWeightValueTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        calcBmiWeightValueTextField.setBorder(null);
        calcBmiWeightValueTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        calcBmiWeightValueTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        calcBmiWeightValueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calcBmiWeightValueTextFieldKeyPressed(evt);
            }
        });
        calcBmiPanel.add(calcBmiWeightValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 90, 170, 50));

        calcBmiWeightValueTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        calcBmiWeightValueTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        calcBmiWeightValueTextFieldBar.setOpaque(true);
        calcBmiPanel.add(calcBmiWeightValueTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, 170, 1));

        calcBmiKgText.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        calcBmiKgText.setForeground(new java.awt.Color(238, 238, 238));
        calcBmiKgText.setText("kg");
        calcBmiKgText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBmiPanel.add(calcBmiKgText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 90, -1, 50));

        calcBmiHeightText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        calcBmiHeightText.setForeground(new java.awt.Color(238, 238, 238));
        calcBmiHeightText.setText("Wzrost:");
        calcBmiPanel.add(calcBmiHeightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 155, -1, -1));

        calcBmiHeightValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        calcBmiHeightValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        calcBmiHeightValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        calcBmiHeightValueTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        calcBmiHeightValueTextField.setBorder(null);
        calcBmiHeightValueTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        calcBmiHeightValueTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        calcBmiHeightValueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calcBmiHeightValueTextFieldKeyPressed(evt);
            }
        });
        calcBmiPanel.add(calcBmiHeightValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 185, 170, 50));

        calcBmiHeightValueTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        calcBmiHeightValueTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        calcBmiHeightValueTextFieldBar.setOpaque(true);
        calcBmiPanel.add(calcBmiHeightValueTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 235, 170, 1));

        calcBmiCmText.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        calcBmiCmText.setForeground(new java.awt.Color(238, 238, 238));
        calcBmiCmText.setText("cm");
        calcBmiCmText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBmiPanel.add(calcBmiCmText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 185, -1, 50));

        calculateBmiButton.setBackground(new java.awt.Color(0, 173, 181));
        calculateBmiButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculateBmiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateBmiButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculateBmiButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calculateBmiButtonMouseExited(evt);
            }
        });
        calculateBmiButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calculateBmiButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        calculateBmiButtonText.setForeground(new java.awt.Color(238, 238, 238));
        calculateBmiButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculateBmiButtonText.setText("Oblicz");
        calculateBmiButton.add(calculateBmiButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 555, 50));

        calcBmiPanel.add(calculateBmiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 475, 555, 50));

        calcPanel.add(calcBmiPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 165, 585, 540));

        calcBmiResultPanel.setBackground(new java.awt.Color(50, 54, 61));
        calcBmiResultPanel.setMinimumSize(new java.awt.Dimension(420, 315));
        calcBmiResultPanel.setPreferredSize(new java.awt.Dimension(420, 315));
        calcBmiResultPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcBmiResultText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        calcBmiResultText.setForeground(new java.awt.Color(138, 152, 173));
        calcBmiResultText.setText("Tw??j indeks masy cia??a wynosi:");
        calcBmiResultText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBmiResultPanel.add(calcBmiResultText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 435, 30));

        bmiResultValueTextField.setEditable(false);
        bmiResultValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        bmiResultValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 72)); // NOI18N
        bmiResultValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        bmiResultValueTextField.setText("-");
        bmiResultValueTextField.setToolTipText("");
        bmiResultValueTextField.setBorder(null);
        bmiResultValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bmiResultValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        calcBmiResultPanel.add(bmiResultValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 330, 80));

        calcBmiResultRateText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        calcBmiResultRateText.setForeground(new java.awt.Color(138, 152, 173));
        calcBmiResultRateText.setText("Ocena:");
        calcBmiResultRateText.setToolTipText("");
        calcBmiResultRateText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBmiResultPanel.add(calcBmiResultRateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 390, 30));

        bmiResultRateTextField.setBackground(new java.awt.Color(50, 54, 61));
        bmiResultRateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        bmiResultRateTextField.setForeground(new java.awt.Color(238, 238, 238));
        bmiResultRateTextField.setText("-");
        bmiResultRateTextField.setBorder(null);
        bmiResultRateTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bmiResultRateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        calcBmiResultPanel.add(bmiResultRateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 400, -1));

        calcPanel.add(calcBmiResultPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 390, 420, 315));

        calcBfiPanel.setBackground(new java.awt.Color(50, 54, 61));
        calcBfiPanel.setMinimumSize(new java.awt.Dimension(585, 540));
        calcBfiPanel.setPreferredSize(new java.awt.Dimension(585, 540));
        calcBmrPanel.setVisible(true);
        calcBmrResultPanel.setVisible(true);
        calcBmiPanel.setVisible(false);  
        calcBmiResultPanel.setVisible(false);
        calcBfiPanel.setVisible(false);
        calcBfiResultPanel.setVisible(false);
        calcBfiPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcBfiTitleText.setFont(new java.awt.Font("Segoe UI Light", 0, 26)); // NOI18N
        calcBfiTitleText.setForeground(new java.awt.Color(238, 238, 238));
        calcBfiTitleText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        calcBfiTitleText.setText("Oblicz sw??j poziom tkanki t??uszczowej");
        calcBfiPanel.add(calcBfiTitleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 3, 570, 40));

        calcBfiWeightText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        calcBfiWeightText.setForeground(new java.awt.Color(238, 238, 238));
        calcBfiWeightText.setText("Waga:");
        calcBfiPanel.add(calcBfiWeightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 60, -1, -1));

        calcBfiWeightValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        calcBfiWeightValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        calcBfiWeightValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        calcBfiWeightValueTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        calcBfiWeightValueTextField.setBorder(null);
        calcBfiWeightValueTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        calcBfiWeightValueTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        calcBfiWeightValueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calcBfiWeightValueTextFieldKeyPressed(evt);
            }
        });
        calcBfiPanel.add(calcBfiWeightValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 90, 170, 50));

        calcBfiWeightValueTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        calcBfiWeightValueTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        calcBfiWeightValueTextFieldBar.setOpaque(true);
        calcBfiPanel.add(calcBfiWeightValueTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, 170, 1));

        calcBfiKgText.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        calcBfiKgText.setForeground(new java.awt.Color(238, 238, 238));
        calcBfiKgText.setText("kg");
        calcBfiKgText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBfiPanel.add(calcBfiKgText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 90, -1, 50));

        calcBfiWaistText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        calcBfiWaistText.setForeground(new java.awt.Color(238, 238, 238));
        calcBfiWaistText.setText("Obw??d pasa (talii):");
        calcBfiPanel.add(calcBfiWaistText, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 155, -1, -1));

        calcBfiWaistValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        calcBfiWaistValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        calcBfiWaistValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        calcBfiWaistValueTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        calcBfiWaistValueTextField.setBorder(null);
        calcBfiWaistValueTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        calcBfiWaistValueTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        calcBfiWaistValueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calcBfiWaistValueTextFieldKeyPressed(evt);
            }
        });
        calcBfiPanel.add(calcBfiWaistValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 185, 170, 50));

        calcBfiWaistValueTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        calcBfiWaistValueTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        calcBfiWaistValueTextFieldBar.setOpaque(true);
        calcBfiPanel.add(calcBfiWaistValueTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 235, 170, 1));

        calcBfiCmText.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        calcBfiCmText.setForeground(new java.awt.Color(238, 238, 238));
        calcBfiCmText.setText("cm");
        calcBfiCmText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBfiPanel.add(calcBfiCmText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 185, -1, 50));

        calculateBfiButton.setBackground(new java.awt.Color(0, 173, 181));
        calculateBfiButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculateBfiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateBfiButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculateBfiButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calculateBfiButtonMouseExited(evt);
            }
        });
        calculateBfiButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calculateBfiButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        calculateBfiButtonText.setForeground(new java.awt.Color(238, 238, 238));
        calculateBfiButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculateBfiButtonText.setText("Oblicz");
        calculateBfiButton.add(calculateBfiButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 555, 50));

        calcBfiPanel.add(calculateBfiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 475, 555, 50));

        calcBfiGenderText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        calcBfiGenderText.setForeground(new java.awt.Color(238, 238, 238));
        calcBfiGenderText.setText("P??e??:");
        calcBfiPanel.add(calcBfiGenderText, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 250, -1, -1));

        calcBfiSelectGenderButton.setBackground(new java.awt.Color(59, 63, 70));
        calcBfiSelectGenderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcBfiSelectGenderButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcBfiSelectGenderFemaleButton.setBackground(new java.awt.Color(59, 63, 70));
        calcBfiSelectGenderFemaleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcBfiSelectGenderFemaleButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBfiSelectGenderFemaleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBfiSelectGenderFemaleButtonMouseExited(evt);
            }
        });
        calcBfiSelectGenderFemaleButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcBfiSelectGenderFemaleButtonText.setBackground(new java.awt.Color(0, 173, 181));
        calcBfiSelectGenderFemaleButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        calcBfiSelectGenderFemaleButtonText.setForeground(new java.awt.Color(238, 238, 238));
        calcBfiSelectGenderFemaleButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calcBfiSelectGenderFemaleButtonText.setText("Kobieta");
        calcBfiSelectGenderFemaleButtonText.setOpaque(true);
        calcBfiSelectGenderFemaleButton.add(calcBfiSelectGenderFemaleButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 132, 40));

        calcBfiSelectGenderButton.add(calcBfiSelectGenderFemaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        calcBfiSelectGenderMaleButton.setBackground(new java.awt.Color(59, 63, 70));
        calcBfiSelectGenderMaleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcBfiSelectGenderMaleButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBfiSelectGenderMaleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBfiSelectGenderMaleButtonMouseExited(evt);
            }
        });
        calcBfiSelectGenderMaleButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcBfiSelectGenderMaleButtonText.setBackground(new java.awt.Color(0, 173, 181));
        calcBfiSelectGenderMaleButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        calcBfiSelectGenderMaleButtonText.setForeground(new java.awt.Color(238, 238, 238));
        calcBfiSelectGenderMaleButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calcBfiSelectGenderMaleButtonText.setText("M????czyzna");
        calcBfiSelectGenderMaleButton.add(calcBfiSelectGenderMaleButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 5, 133, 40));

        calcBfiSelectGenderButton.add(calcBfiSelectGenderMaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 140, 50));

        calcBfiPanel.add(calcBfiSelectGenderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 280, 280, 50));

        calcPanel.add(calcBfiPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 165, 585, 540));

        calcBfiResultPanel.setBackground(new java.awt.Color(50, 54, 61));
        calcBfiResultPanel.setMinimumSize(new java.awt.Dimension(420, 315));
        calcBfiResultPanel.setPreferredSize(new java.awt.Dimension(420, 315));
        calcBfiResultPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcBfiResultText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        calcBfiResultText.setForeground(new java.awt.Color(138, 152, 173));
        calcBfiResultText.setText("Tw??j przybli??ony poziom tkanki t??uszczowej wynosi:");
        calcBfiResultText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBfiResultPanel.add(calcBfiResultText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, 30));

        bfiResultValueTextField.setEditable(false);
        bfiResultValueTextField.setBackground(new java.awt.Color(50, 54, 61));
        bfiResultValueTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 72)); // NOI18N
        bfiResultValueTextField.setForeground(new java.awt.Color(238, 238, 238));
        bfiResultValueTextField.setText("-");
        bfiResultValueTextField.setToolTipText("");
        bfiResultValueTextField.setBorder(null);
        bfiResultValueTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bfiResultValueTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        calcBfiResultPanel.add(bfiResultValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 330, 80));

        calcBfiResultRateText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        calcBfiResultRateText.setForeground(new java.awt.Color(138, 152, 173));
        calcBfiResultRateText.setText("Klasyfikacja:");
        calcBfiResultRateText.setToolTipText("");
        calcBfiResultRateText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcBfiResultPanel.add(calcBfiResultRateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 390, 30));

        bfiResultRateTextField.setBackground(new java.awt.Color(50, 54, 61));
        bfiResultRateTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        bfiResultRateTextField.setForeground(new java.awt.Color(238, 238, 238));
        bfiResultRateTextField.setText("-");
        bfiResultRateTextField.setBorder(null);
        bfiResultRateTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        bfiResultRateTextField.setSelectionColor(new java.awt.Color(50, 54, 61));
        calcBfiResultPanel.add(bfiResultRateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 400, -1));

        calcPanel.add(calcBfiResultPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 390, 420, 315));

        mainPanel.add(calcPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 720));

        infoPanel.setBackground(new java.awt.Color(57, 62, 70));
        infoPanel.setMinimumSize(new java.awt.Dimension(1050, 720));
        infoPanel.setPreferredSize(new java.awt.Dimension(1050, 720));
        startupPanel.setVisible(true);
        myProfilePanel.setVisible(false);
        mealDiaryPanel.setVisible(false);
        workoutDiaryPanel.setVisible(false);
        statsPanel.setVisible(false);
        calcPanel.setVisible(false);
        infoPanel.setVisible(false);
        infoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/info_banner.png"))); // NOI18N
        infoBanner.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                infoBannerMouseDragged(evt);
            }
        });
        infoBanner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                infoBannerMousePressed(evt);
            }
        });
        infoPanel.add(infoBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        dailymeInfoPanel.setBackground(new java.awt.Color(50, 54, 61));
        dailymeInfoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dailymeTextIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/dailyme_text_30.png"))); // NOI18N
        dailymeInfoPanel.add(dailymeTextIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        contactText.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        contactText.setForeground(new java.awt.Color(238, 238, 238));
        contactText.setText("Kontakt:  contact@dailyme.com");
        dailymeInfoPanel.add(contactText, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 45, -1, -1));

        allRightsReservedText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        allRightsReservedText.setForeground(new java.awt.Color(238, 238, 238));
        allRightsReservedText.setText("?? 2021 Wszelkie prawa zastrze??one.");
        dailymeInfoPanel.add(allRightsReservedText, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 80, 310, -1));

        infoPanel.add(dailymeInfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 165, 1020, 110));

        githubButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        githubButton.setOpaque(false);
        githubButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                githubButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                githubButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                githubButtonMouseExited(evt);
            }
        });
        githubButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        githubIconInactive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/github_icon.png"))); // NOI18N
        githubButton.add(githubIconInactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        githubIconActive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/github_icon_active.png"))); // NOI18N
        githubButton.add(githubIconActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        infoPanel.add(githubButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 48, 48));

        facebookButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facebookButton.setOpaque(false);
        facebookButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebookButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facebookButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facebookButtonMouseExited(evt);
            }
        });
        facebookButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        facebookIconInactive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/facebook_icon.png"))); // NOI18N
        facebookButton.add(facebookIconInactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        facebookIconActive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/facebook_icon_active.png"))); // NOI18N
        facebookButton.add(facebookIconActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        infoPanel.add(facebookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 290, 48, 48));

        instagramButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        instagramButton.setOpaque(false);
        instagramButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instagramButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                instagramButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                instagramButtonMouseExited(evt);
            }
        });
        instagramButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        instagramIconInactive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/instagram_icon.png"))); // NOI18N
        instagramButton.add(instagramIconInactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        githubIconActive.setVisible(false);
        facebookIconActive.setVisible(false);
        instagramIconActive.setVisible(false);

        instagramIconActive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/instagram_icon_active.png"))); // NOI18N
        instagramButton.add(instagramIconActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        infoPanel.add(instagramButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 48, 48));

        mainPanel.add(infoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(startupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(startupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        startupPanel.setVisible(true);
        mainPanel.setVisible(false);

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void moveLastActivityBars(int option) {
        if(lastActivitiesCounter == 0)
            lastActivity1Panel.setVisible(true);
        if(lastActivitiesCounter == 1)
            lastActivity2Panel.setVisible(true);
        if(lastActivitiesCounter == 2)
            lastActivity3Panel.setVisible(true);
        if(lastActivitiesCounter == 3)
            lastActivity4Panel.setVisible(true);
        if(lastActivitiesCounter == 4)
            lastActivity5Panel.setVisible(true);
        if(option == 1) {
            lastActivity5UsernameTextField.setText(lastActivity4UsernameTextField.getText());
            lastActivity4UsernameTextField.setText(lastActivity3UsernameTextField.getText());
            lastActivity3UsernameTextField.setText(lastActivity2UsernameTextField.getText());
            lastActivity2UsernameTextField.setText(lastActivity1UsernameTextField.getText());
        }
        if(option == 2) {
            lastActivity5MessageTextField.setText(lastActivity4MessageTextField.getText());
            lastActivity4MessageTextField.setText(lastActivity3MessageTextField.getText());
            lastActivity3MessageTextField.setText(lastActivity2MessageTextField.getText());
            lastActivity2MessageTextField.setText(lastActivity1MessageTextField.getText());
        }
    }
    
    private void initDatabase() {
        try {
            DatabaseOperations.connectToDatabase();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Connection error: " + exception.getMessage());
        }
    }
    
    protected void setUserParameters() {
        try {
            DatabaseOperations.setParameters(this);
            DatabaseOperations.loadNotes(this);
            totalKcal = 0.0;
            totalProteins = 0.0;
            totalFats = 0.0;
            totalCarbs = 0.0;
            loginInfoUsernameTextField.setText("[" + LoginSession.nickname + "]");
            weightValueTextField.setText(String.valueOf(df.format(LoginSession.userWeight)));
            heightValueTextField.setText(String.valueOf(LoginSession.userHeight));
            ageValueTextField.setText(String.valueOf(LoginSession.userAge));
            notesTextArea.setText(LoginSession.userNotes);
            if(!(weightValueTextField.getText().equals("") || heightValueTextField.getText().equals("") || ageValueTextField.getText().equals(""))) {
                bmiValueTextField.setText(String.valueOf(df.format(bmiCalc.calculateBmi(LoginSession.userWeight, (double)LoginSession.userHeight))));
                bmiRateValueTextField.setText(bmiCalc.rateBmi(bmiCalc.bmi));
                goalValueTextField.setText(String.valueOf(df.format(LoginSession.userWeightGoal)) + "kg");
                goalLeftTextField.setText(String.valueOf(df.format(LoginSession.userWeightGoal - LoginSession.userWeight)) + "kg");
                profileNameTextField.setText(LoginSession.userName);
                if(LoginSession.userGender == 0) {
                    femaleIcon.setVisible(true);
                    maleIcon.setVisible(false);
                }
                else if(LoginSession.userGender == 1) {
                    maleIcon.setVisible(true);
                    femaleIcon.setVisible(false);
                }
            
            }
            loadLastMeals();
            DatabaseOperations.loadDiaryDates(this);
            setMealsStats();
            setWorkoutStats();
            setMealDiaryDiagram();
            setWorkoutDiaryDiagram();
            
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Error: " + exception.getMessage());
        }
    }
    
    private void resetAllParameters() {
        kcalValueTextField.setText("0 kcal");
        weightValueTextField.setText("-");
        heightValueTextField.setText("-");
        ageValueTextField.setText("-");
        bmiValueTextField.setText("-");
        bmiRateValueTextField.setText("-");
        goalValueTextField.setText("-");
        goalLeftTextField.setText("-");
        profileNameTextField.setText("-");
        
        lastActivitiesCounter = 0;
        lastActivity1UsernameTextField.setText("");
        lastActivity1MessageTextField.setText("");
        lastActivity1Panel.setVisible(false);
        lastActivity2UsernameTextField.setText("");
        lastActivity2MessageTextField.setText("");
        lastActivity2Panel.setVisible(false);
        lastActivity3UsernameTextField.setText("");
        lastActivity3MessageTextField.setText("");
        lastActivity3Panel.setVisible(false);
        lastActivity4UsernameTextField.setText("");
        lastActivity4MessageTextField.setText("");
        lastActivity4Panel.setVisible(false);
        lastActivity5UsernameTextField.setText("");
        lastActivity5MessageTextField.setText("");
        lastActivity5Panel.setVisible(false);
        
        femaleIcon.setVisible(false);
        maleIcon.setVisible(false);
    }
    
    private void myProfileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileButtonMouseClicked
        menuBar(myProfileButtonBar);
        myProfilePanel.setVisible(true);
        mealDiaryPanel.setVisible(false);
        workoutDiaryPanel.setVisible(false);
        statsPanel.setVisible(false);
        calcPanel.setVisible(false);
        infoPanel.setVisible(false);   
    }//GEN-LAST:event_myProfileButtonMouseClicked

    private void myProfileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileButtonMouseEntered
         myProfileButton.setBackground(Color.decode("#20242c"));   
    }//GEN-LAST:event_myProfileButtonMouseEntered

    private void myProfileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileButtonMouseExited
        myProfileButton.setBackground(Color.decode("#222831"));       
    }//GEN-LAST:event_myProfileButtonMouseExited

    private void mealDiaryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mealDiaryButtonMouseClicked
        menuBar(mealDiaryButtonBar);
        mealDiaryPanel.setVisible(true);
        myProfilePanel.setVisible(false);
        workoutDiaryPanel.setVisible(false);
        statsPanel.setVisible(false);
        calcPanel.setVisible(false);
        infoPanel.setVisible(false);    
    }//GEN-LAST:event_mealDiaryButtonMouseClicked

    private void mealDiaryButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mealDiaryButtonMouseEntered
        mealDiaryButton.setBackground(Color.decode("#20242c"));     
    }//GEN-LAST:event_mealDiaryButtonMouseEntered

    private void mealDiaryButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mealDiaryButtonMouseExited
        mealDiaryButton.setBackground(Color.decode("#222831"));
    }//GEN-LAST:event_mealDiaryButtonMouseExited

    private void workoutDiaryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDiaryButtonMouseClicked
        menuBar(workoutDiaryButtonBar);
        workoutDiaryPanel.setVisible(true);
        myProfilePanel.setVisible(false);
        mealDiaryPanel.setVisible(false);
        statsPanel.setVisible(false);
        calcPanel.setVisible(false);
        infoPanel.setVisible(false);   
    }//GEN-LAST:event_workoutDiaryButtonMouseClicked

    private void workoutDiaryButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDiaryButtonMouseEntered
        workoutDiaryButton.setBackground(Color.decode("#20242c"));      
    }//GEN-LAST:event_workoutDiaryButtonMouseEntered

    private void workoutDiaryButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDiaryButtonMouseExited
        workoutDiaryButton.setBackground(Color.decode("#222831"));   
    }//GEN-LAST:event_workoutDiaryButtonMouseExited

    private void statsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statsButtonMouseClicked
        menuBar(statsButtonBar);
        statsPanel.setVisible(true);
        myProfilePanel.setVisible(false);
        mealDiaryPanel.setVisible(false);
        workoutDiaryPanel.setVisible(false);
        calcPanel.setVisible(false);
        infoPanel.setVisible(false); 
    }//GEN-LAST:event_statsButtonMouseClicked

    private void statsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statsButtonMouseEntered
        statsButton.setBackground(Color.decode("#20242c"));       
    }//GEN-LAST:event_statsButtonMouseEntered

    private void statsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statsButtonMouseExited
        statsButton.setBackground(Color.decode("#222831"));  
    }//GEN-LAST:event_statsButtonMouseExited

    private void calcButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcButtonMouseClicked
        menuBar(calcButtonBar);
        calcPanel.setVisible(true);
        myProfilePanel.setVisible(false);
        mealDiaryPanel.setVisible(false);
        workoutDiaryPanel.setVisible(false);
        statsPanel.setVisible(false);
        infoPanel.setVisible(false);            
    }//GEN-LAST:event_calcButtonMouseClicked

    private void calcButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcButtonMouseEntered
        calcButton.setBackground(Color.decode("#20242c"));   
    }//GEN-LAST:event_calcButtonMouseEntered

    private void calcButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcButtonMouseExited
        calcButton.setBackground(Color.decode("#222831"));      
    }//GEN-LAST:event_calcButtonMouseExited

    private void infoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoButtonMouseClicked
        menuBar(infoButtonBar);
        infoPanel.setVisible(true);
        myProfilePanel.setVisible(false);
        mealDiaryPanel.setVisible(false);
        workoutDiaryPanel.setVisible(false);
        statsPanel.setVisible(false);
        calcPanel.setVisible(false);   
    }//GEN-LAST:event_infoButtonMouseClicked

    private void infoButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoButtonMouseEntered
        infoButton.setBackground(Color.decode("#20242c"));    
    }//GEN-LAST:event_infoButtonMouseEntered

    private void infoButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoButtonMouseExited
        infoButton.setBackground(Color.decode("#222831"));
    }//GEN-LAST:event_infoButtonMouseExited

    private void modifyNotesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyNotesButtonMouseClicked
        notesEditable = true;
        notesTextArea.setEditable(true);
        modifyNotesButtonActive = true;
        if(modifyNotesButtonActive == true)
            modifyNotesButton.setBackground(Color.decode("#00ADB5"));      
    }//GEN-LAST:event_modifyNotesButtonMouseClicked

    private void saveNotesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveNotesButtonMouseClicked
        notesEditable = false;
        notesTextArea.setEditable(false);
        modifyNotesButtonActive = false;
        try {
            DatabaseOperations.saveNotes(notesTextArea.getText(), this);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Error: " + exception.getMessage());
        }
        modifyNotesButton.setBackground(Color.decode("#3F454F"));   
    }//GEN-LAST:event_saveNotesButtonMouseClicked

    private void saveNotesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveNotesButtonMouseEntered
        saveNotesButton.setBackground(Color.decode("#4A515D"));     
    }//GEN-LAST:event_saveNotesButtonMouseEntered

    private void saveNotesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveNotesButtonMouseExited
        saveNotesButton.setBackground(Color.decode("#3F454F"));      
    }//GEN-LAST:event_saveNotesButtonMouseExited

    private void modifyNotesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyNotesButtonMouseEntered
        if(modifyNotesButtonActive == false)
            modifyNotesButton.setBackground(Color.decode("#4A515D"));      
    }//GEN-LAST:event_modifyNotesButtonMouseEntered

    private void modifyNotesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyNotesButtonMouseExited
        if(modifyNotesButtonActive == false)
            modifyNotesButton.setBackground(Color.decode("#3F454F"));      
    }//GEN-LAST:event_modifyNotesButtonMouseExited

    private void modifyParamsToggleButtonOnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyParamsToggleButtonOnMouseClicked
        modifyParamsToggleButtonOn.setBackground(Color.decode("#EEEEEE"));
        modifyParamsToggleButtonOff.setBackground(Color.decode("#00ADB5"));
        weightValueTextField.setEditable(true);
        heightValueTextField.setEditable(true);
        ageValueTextField.setEditable(true);
    }//GEN-LAST:event_modifyParamsToggleButtonOnMouseClicked

    private void modifyParamsToggleButtonOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyParamsToggleButtonOffMouseClicked
        modifyParamsToggleButtonOn.setBackground(Color.decode("#CFCFCF"));
        modifyParamsToggleButtonOff.setBackground(Color.decode("#EEEEEE"));
        weightValueTextField.setEditable(false);
        heightValueTextField.setEditable(false);
        ageValueTextField.setEditable(false);
        
        if(!(weightValueTextField.getText().equals("") || heightValueTextField.getText().equals("") || ageValueTextField.getText().equals(""))) {
            weight = Double.parseDouble(weightValueTextField.getText());
            height = Integer.parseInt(heightValueTextField.getText());
            age = Integer.parseInt(ageValueTextField.getText());
            bmiValueTextField.setText(String.valueOf(df.format(bmiCalc.calculateBmi(weight, (double)height))));
            bmiRateValueTextField.setText(bmiCalc.rateBmi(bmiCalc.bmi));
            goalLeftTextField.setText(String.valueOf(df.format(LoginSession.userWeightGoal - Double.parseDouble(weightValueTextField.getText()))) + "kg");
            try {
                DatabaseOperations.updateUserParameters(weight, height, age, LoginSession.userID, this);
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this, "Error: " + exception.getMessage());
            }      
        }
    }//GEN-LAST:event_modifyParamsToggleButtonOffMouseClicked

    private void calcBfiButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBfiButtonMouseExited
        calcBfiButton.setBackground(Color.decode("#32363D"));
    }//GEN-LAST:event_calcBfiButtonMouseExited

    private void calcBfiButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBfiButtonMouseEntered
        calcBfiButton.setBackground(Color.decode("#3E4248"));
    }//GEN-LAST:event_calcBfiButtonMouseEntered

    private void calcBfiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBfiButtonMouseClicked
        bfiButtonText.setOpaque(true);
        bmrButtonText.setOpaque(false);
        bmiButtonText.setOpaque(false);
        
        repaintCalcButtons();
        
        calcBfiPanel.setVisible(true);
        calcBfiResultPanel.setVisible(true);
        calcBmrPanel.setVisible(false);
        calcBmrResultPanel.setVisible(false);
        calcBmiPanel.setVisible(false);
        calcBmiResultPanel.setVisible(false);
        
        calcGender = 0;
    }//GEN-LAST:event_calcBfiButtonMouseClicked

    private void calcBmiButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBmiButtonMouseExited
        calcBmiButton.setBackground(Color.decode("#32363D"));
    }//GEN-LAST:event_calcBmiButtonMouseExited

    private void calcBmiButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBmiButtonMouseEntered
        calcBmiButton.setBackground(Color.decode("#3E4248"));
    }//GEN-LAST:event_calcBmiButtonMouseEntered

    private void calcBmiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBmiButtonMouseClicked
        bmiButtonText.setOpaque(true);
        bmrButtonText.setOpaque(false);
        bfiButtonText.setOpaque(false);
        
        repaintCalcButtons();
        
        calcBmiPanel.setVisible(true);
        calcBmiResultPanel.setVisible(true);
        calcBmrPanel.setVisible(false);
        calcBmrResultPanel.setVisible(false);
        calcBfiPanel.setVisible(false);
        calcBfiResultPanel.setVisible(false);
        
        calcGender = 0;
    }//GEN-LAST:event_calcBmiButtonMouseClicked

    private void calcBmrButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBmrButtonMouseExited
        calcBmrButton.setBackground(Color.decode("#32363D"));
    }//GEN-LAST:event_calcBmrButtonMouseExited

    private void calcBmrButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBmrButtonMouseEntered
        calcBmrButton.setBackground(Color.decode("#3E4248"));
    }//GEN-LAST:event_calcBmrButtonMouseEntered

    private void calcBmrButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBmrButtonMouseClicked
        bmrButtonText.setOpaque(true);
        bmiButtonText.setOpaque(false);
        bfiButtonText.setOpaque(false);
        
        repaintCalcButtons();
        
        calcBmrPanel.setVisible(true);
        calcBmrResultPanel.setVisible(true);
        calcBmiPanel.setVisible(false);
        calcBmiResultPanel.setVisible(false);
        calcBfiPanel.setVisible(false);
        calcBfiResultPanel.setVisible(false);
        
        calcGender = 0;
    }//GEN-LAST:event_calcBmrButtonMouseClicked

    private void calcBmrSelectGenderFemaleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBmrSelectGenderFemaleButtonMouseClicked
        calcBmrSelectGenderFemaleButtonText.setOpaque(true);
        calcBmrSelectGenderMaleButtonText.setOpaque(false);
        repaintSelectGenderButtons();
        calcGender = 0;
    }//GEN-LAST:event_calcBmrSelectGenderFemaleButtonMouseClicked

    private void calcBmrSelectGenderMaleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBmrSelectGenderMaleButtonMouseClicked
        calcBmrSelectGenderMaleButtonText.setOpaque(true);
        calcBmrSelectGenderFemaleButtonText.setOpaque(false);
        repaintSelectGenderButtons();
        calcGender = 1;
    }//GEN-LAST:event_calcBmrSelectGenderMaleButtonMouseClicked

    private void calcBmrSelectGenderFemaleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBmrSelectGenderFemaleButtonMouseEntered
        calcBmrSelectGenderFemaleButton.setBackground(Color.decode("#444952"));
    }//GEN-LAST:event_calcBmrSelectGenderFemaleButtonMouseEntered

    private void calcBmrSelectGenderFemaleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBmrSelectGenderFemaleButtonMouseExited
        calcBmrSelectGenderFemaleButton.setBackground(Color.decode("#3B3F46"));
    }//GEN-LAST:event_calcBmrSelectGenderFemaleButtonMouseExited

    private void calcBmrSelectGenderMaleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBmrSelectGenderMaleButtonMouseEntered
        calcBmrSelectGenderMaleButton.setBackground(Color.decode("#444952"));
    }//GEN-LAST:event_calcBmrSelectGenderMaleButtonMouseEntered

    private void calcBmrSelectGenderMaleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBmrSelectGenderMaleButtonMouseExited
        calcBmrSelectGenderMaleButton.setBackground(Color.decode("#3B3F46"));
    }//GEN-LAST:event_calcBmrSelectGenderMaleButtonMouseExited

    private void calculateBmrButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateBmrButtonMouseEntered
        calculateBmrButton.setBackground(Color.decode("#009BA3"));
    }//GEN-LAST:event_calculateBmrButtonMouseEntered

    private void calculateBmrButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateBmrButtonMouseExited
        calculateBmrButton.setBackground(Color.decode("#00ADB5"));
    }//GEN-LAST:event_calculateBmrButtonMouseExited

    private void calculateBmrButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateBmrButtonMouseClicked
        if(!(calcBmrWeightValueTextField.getText().equals("") || calcBmrHeightValueTextField.getText().equals("") || calcBmrAgeValueTextField.getText().equals(""))) {
            weight = Double.parseDouble(calcBmrWeightValueTextField.getText());
            height = Integer.parseInt(calcBmrHeightValueTextField.getText());
            age = Integer.parseInt(calcBmrAgeValueTextField.getText());

            bmrResultKcalValueTextField.setText(String.valueOf(bmrCalc.calculateKcalAmount(weight, height, age, activityLevel, calcGender)) + " kcal");
            bmrResultKcalCutValueTextField.setText(String.valueOf(bmrCalc.calculateKcalCutAmount(bmrCalc.kcalAmount)) + " kcal");
            bmrResultKcalOverValueTextField.setText(String.valueOf(bmrCalc.calculateKcalOverAmount(bmrCalc.kcalAmount)) + " kcal");

            bmrResultProteinsValueTextField.setText(String.valueOf(bmrCalc.calculateProteinsAmount(weight)) + "g");
            bmrResultFatsValueTextField.setText(String.valueOf(bmrCalc.calculateFatsAmount(bmrCalc.kcalAmount)) + "g");
            bmrResultCarbsValueTextField.setText(String.valueOf(bmrCalc.calculateCarbsAmount(bmrCalc.kcalAmount, bmrCalc.proteinsAmount, bmrCalc.fatsAmount)) + "g");

            bmrResultProteinsCutValueTextField.setText(String.valueOf(bmrCalc.calculateProteinsAmount(weight)) + "g");
            bmrResultFatsCutValueTextField.setText(String.valueOf(bmrCalc.calculateFatsCutAmount(bmrCalc.kcalCutAmount)) + "g");
            bmrResultCarbsCutValueTextField.setText(String.valueOf(bmrCalc.calculateCarbsCutAmount(bmrCalc.kcalCutAmount, bmrCalc.proteinsAmount, bmrCalc.fatsCutAmount)) + "g");

            bmrResultProteinsOverValueTextField.setText(String.valueOf(bmrCalc.calculateProteinsAmount(weight)) + "g");
            bmrResultFatsOverValueTextField.setText(String.valueOf(bmrCalc.calculateFatsOverAmount(bmrCalc.kcalOverAmount)) + "g");
            bmrResultCarbsOverValueTextField.setText(String.valueOf(bmrCalc.calculateCarbsOverAmount(bmrCalc.kcalOverAmount, bmrCalc.proteinsAmount, bmrCalc.fatsOverAmount)) + "g");
        }
    }//GEN-LAST:event_calculateBmrButtonMouseClicked

    private void physicalActivityLevel1ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physicalActivityLevel1ButtonMouseClicked
        activityBar(physicalActivityLevel1Text, physicalActivityLevel1Text);
        activityLevel=1.2;
    }//GEN-LAST:event_physicalActivityLevel1ButtonMouseClicked

    private void physicalActivityLevel1ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physicalActivityLevel1ButtonMouseEntered
        physicalActivityLevel1Button.setBackground(Color.decode("#444952"));
    }//GEN-LAST:event_physicalActivityLevel1ButtonMouseEntered

    private void physicalActivityLevel1ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physicalActivityLevel1ButtonMouseExited
        physicalActivityLevel1Button.setBackground(Color.decode("#3B3F46"));
    }//GEN-LAST:event_physicalActivityLevel1ButtonMouseExited

    private void physicalActivityLevel2ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physicalActivityLevel2ButtonMouseClicked
        activityBar(physicalActivityLevel2Text1, physicalActivityLevel2Text2);
        activityLevel=1.35;
    }//GEN-LAST:event_physicalActivityLevel2ButtonMouseClicked

    private void physicalActivityLevel2ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physicalActivityLevel2ButtonMouseEntered
        physicalActivityLevel2Button.setBackground(Color.decode("#444952"));
    }//GEN-LAST:event_physicalActivityLevel2ButtonMouseEntered

    private void physicalActivityLevel2ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physicalActivityLevel2ButtonMouseExited
        physicalActivityLevel2Button.setBackground(Color.decode("#3B3F46"));
    }//GEN-LAST:event_physicalActivityLevel2ButtonMouseExited

    private void physicalActivityLevel3ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physicalActivityLevel3ButtonMouseClicked
        activityBar(physicalActivityLevel3Text1, physicalActivityLevel3Text2);
        activityLevel=1.55;
    }//GEN-LAST:event_physicalActivityLevel3ButtonMouseClicked

    private void physicalActivityLevel3ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physicalActivityLevel3ButtonMouseEntered
        physicalActivityLevel3Button.setBackground(Color.decode("#444952"));
    }//GEN-LAST:event_physicalActivityLevel3ButtonMouseEntered

    private void physicalActivityLevel3ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physicalActivityLevel3ButtonMouseExited
        physicalActivityLevel3Button.setBackground(Color.decode("#3B3F46"));
    }//GEN-LAST:event_physicalActivityLevel3ButtonMouseExited

    private void physicalActivityLevel4ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physicalActivityLevel4ButtonMouseClicked
        activityBar(physicalActivityLevel4Text1, physicalActivityLevel4Text2);
        activityLevel=1.75;
    }//GEN-LAST:event_physicalActivityLevel4ButtonMouseClicked

    private void physicalActivityLevel4ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physicalActivityLevel4ButtonMouseEntered
        physicalActivityLevel4Button.setBackground(Color.decode("#444952"));
    }//GEN-LAST:event_physicalActivityLevel4ButtonMouseEntered

    private void physicalActivityLevel4ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physicalActivityLevel4ButtonMouseExited
        physicalActivityLevel4Button.setBackground(Color.decode("#3B3F46"));
    }//GEN-LAST:event_physicalActivityLevel4ButtonMouseExited

    private void physicalActivityLevel5ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physicalActivityLevel5ButtonMouseClicked
        activityBar(physicalActivityLevel5Text1, physicalActivityLevel5Text2);
        activityLevel=2.15;
    }//GEN-LAST:event_physicalActivityLevel5ButtonMouseClicked

    private void physicalActivityLevel5ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physicalActivityLevel5ButtonMouseEntered
        physicalActivityLevel5Button.setBackground(Color.decode("#444952"));
    }//GEN-LAST:event_physicalActivityLevel5ButtonMouseEntered

    private void physicalActivityLevel5ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physicalActivityLevel5ButtonMouseExited
        physicalActivityLevel5Button.setBackground(Color.decode("#3B3F46"));
    }//GEN-LAST:event_physicalActivityLevel5ButtonMouseExited

    private void calcBmrWeightValueTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcBmrWeightValueTextFieldKeyPressed
        val.floatNumberVal(evt, calcBmrWeightValueTextField);
    }//GEN-LAST:event_calcBmrWeightValueTextFieldKeyPressed

    private void calcBmrHeightValueTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcBmrHeightValueTextFieldKeyPressed
        val.intNumberVal(evt, calcBmrHeightValueTextField);
    }//GEN-LAST:event_calcBmrHeightValueTextFieldKeyPressed

    private void calcBmrAgeValueTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcBmrAgeValueTextFieldKeyPressed
        val.intNumberVal(evt, calcBmrAgeValueTextField);
    }//GEN-LAST:event_calcBmrAgeValueTextFieldKeyPressed

    private void calcBmiWeightValueTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcBmiWeightValueTextFieldKeyPressed
        val.floatNumberVal(evt, calcBmiWeightValueTextField);
    }//GEN-LAST:event_calcBmiWeightValueTextFieldKeyPressed

    private void calcBmiHeightValueTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcBmiHeightValueTextFieldKeyPressed
        val.intNumberVal(evt, calcBmiHeightValueTextField);
    }//GEN-LAST:event_calcBmiHeightValueTextFieldKeyPressed

    private void calculateBmiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateBmiButtonMouseClicked
        if(!(calcBmiWeightValueTextField.getText().equals("") || calcBmiHeightValueTextField.getText().equals(""))) {
            weight = Double.parseDouble(calcBmiWeightValueTextField.getText());
            height = Integer.parseInt(calcBmiHeightValueTextField.getText());

            bmiResultValueTextField.setText(String.valueOf(df.format(bmiCalc.calculateBmi(weight, (double)height))));
            bmiResultRateTextField.setText(bmiCalc.rateBmi(bmiCalc.bmi));
        }
    }//GEN-LAST:event_calculateBmiButtonMouseClicked

    private void calculateBmiButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateBmiButtonMouseEntered
        calculateBmiButton.setBackground(Color.decode("#009BA3"));
    }//GEN-LAST:event_calculateBmiButtonMouseEntered

    private void calculateBmiButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateBmiButtonMouseExited
        calculateBmiButton.setBackground(Color.decode("#00ADB5"));
    }//GEN-LAST:event_calculateBmiButtonMouseExited

    private void calcBfiWeightValueTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcBfiWeightValueTextFieldKeyPressed
        val.floatNumberVal(evt, calcBfiWeightValueTextField);
    }//GEN-LAST:event_calcBfiWeightValueTextFieldKeyPressed

    private void calcBfiWaistValueTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcBfiWaistValueTextFieldKeyPressed
        val.intNumberVal(evt, calcBfiWaistValueTextField);
    }//GEN-LAST:event_calcBfiWaistValueTextFieldKeyPressed

    private void calculateBfiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateBfiButtonMouseClicked
        if(!(calcBfiWeightValueTextField.getText().equals("") || calcBfiWaistValueTextField.getText().equals(""))) {
            weight = Double.parseDouble(calcBfiWeightValueTextField.getText());
            waist = Integer.parseInt(calcBfiWaistValueTextField.getText());

            bfiResultValueTextField.setText(String.valueOf(df.format(bfiCalc.calculateBfi(weight, (double)waist, calcGender))) + "%");
            bfiResultRateTextField.setText(bfiCalc.rateBfi(bfiCalc.bfi, calcGender));
        }
    }//GEN-LAST:event_calculateBfiButtonMouseClicked

    private void calculateBfiButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateBfiButtonMouseEntered
        calculateBfiButton.setBackground(Color.decode("#009BA3"));
    }//GEN-LAST:event_calculateBfiButtonMouseEntered

    private void calculateBfiButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateBfiButtonMouseExited
        calculateBfiButton.setBackground(Color.decode("#00ADB5"));
    }//GEN-LAST:event_calculateBfiButtonMouseExited

    private void calcBfiSelectGenderFemaleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBfiSelectGenderFemaleButtonMouseClicked
        calcBfiSelectGenderFemaleButtonText.setOpaque(true);
        calcBfiSelectGenderMaleButtonText.setOpaque(false);
        repaintSelectGenderButtons();
        calcGender = 0;
    }//GEN-LAST:event_calcBfiSelectGenderFemaleButtonMouseClicked

    private void calcBfiSelectGenderFemaleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBfiSelectGenderFemaleButtonMouseEntered
        calcBfiSelectGenderFemaleButton.setBackground(Color.decode("#444952"));
    }//GEN-LAST:event_calcBfiSelectGenderFemaleButtonMouseEntered

    private void calcBfiSelectGenderFemaleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBfiSelectGenderFemaleButtonMouseExited
        calcBfiSelectGenderFemaleButton.setBackground(Color.decode("#3B3F46"));
    }//GEN-LAST:event_calcBfiSelectGenderFemaleButtonMouseExited

    private void calcBfiSelectGenderMaleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBfiSelectGenderMaleButtonMouseClicked
        calcBfiSelectGenderMaleButtonText.setOpaque(true);
        calcBfiSelectGenderFemaleButtonText.setOpaque(false);
        repaintSelectGenderButtons();
        calcGender = 1;
    }//GEN-LAST:event_calcBfiSelectGenderMaleButtonMouseClicked

    private void calcBfiSelectGenderMaleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBfiSelectGenderMaleButtonMouseEntered
        calcBfiSelectGenderFemaleButton.setBackground(Color.decode("#444952"));
    }//GEN-LAST:event_calcBfiSelectGenderMaleButtonMouseEntered

    private void calcBfiSelectGenderMaleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBfiSelectGenderMaleButtonMouseExited
        calcBfiSelectGenderFemaleButton.setBackground(Color.decode("#3B3F46"));
    }//GEN-LAST:event_calcBfiSelectGenderMaleButtonMouseExited

    private void weightValueTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightValueTextFieldKeyPressed
        val.floatNumberVal(evt, weightValueTextField);
    }//GEN-LAST:event_weightValueTextFieldKeyPressed

    private void heightValueTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightValueTextFieldKeyPressed
        val.intNumberVal(evt, heightValueTextField);
    }//GEN-LAST:event_heightValueTextFieldKeyPressed

    private void ageValueTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageValueTextFieldKeyPressed
        val.intNumberVal(evt, heightValueTextField); 
    }//GEN-LAST:event_ageValueTextFieldKeyPressed

    private void selectRunningButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectRunningButtonMouseEntered
        if(sportSelected != 1) {
            selectRunningBannerColor.setVisible(true);
            selectRunningBannerBw.setVisible(false);
            selectRunningBar.setVisible(true);
        }
    }//GEN-LAST:event_selectRunningButtonMouseEntered

    private void selectRunningButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectRunningButtonMouseExited
        if(sportSelected != 1) {
            selectRunningBannerBw.setVisible(true);
            selectRunningBannerColor.setVisible(false);
            selectRunningBar.setVisible(false);
        }
    }//GEN-LAST:event_selectRunningButtonMouseExited

    private void selectLiftingButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectLiftingButtonMouseEntered
        if(sportSelected != 2) {
            selectLiftingBannerColor.setVisible(true);
            selectLiftingBannerBw.setVisible(false);
            selectLiftingBar.setVisible(true);
        }
    }//GEN-LAST:event_selectLiftingButtonMouseEntered

    private void selectLiftingButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectLiftingButtonMouseExited
        if(sportSelected != 2) {
            selectLiftingBannerBw.setVisible(true);
            selectLiftingBannerColor.setVisible(false);
            selectLiftingBar.setVisible(false);
        }
    }//GEN-LAST:event_selectLiftingButtonMouseExited

    private void selectBikeRidingButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectBikeRidingButtonMouseEntered
        if(sportSelected != 3) {
            selectBikeRidingBannerColor.setVisible(true);
            selectBikeRidingBannerBw.setVisible(false);
            selectBikeRidingBar.setVisible(true);
        }
    }//GEN-LAST:event_selectBikeRidingButtonMouseEntered

    private void selectBikeRidingButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectBikeRidingButtonMouseExited
        if(sportSelected != 3) {
            selectBikeRidingBannerBw.setVisible(true);
            selectBikeRidingBannerColor.setVisible(false);
            selectBikeRidingBar.setVisible(false);
        }
    }//GEN-LAST:event_selectBikeRidingButtonMouseExited

    private void selectFootballButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectFootballButtonMouseEntered
        if(sportSelected != 4) {
            selectFootballBannerColor.setVisible(true);
            selectFootballBannerBw.setVisible(false);
            selectFootballBar.setVisible(true);
        }
    }//GEN-LAST:event_selectFootballButtonMouseEntered

    private void selectFootballButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectFootballButtonMouseExited
        if(sportSelected != 4) {
            selectFootballBannerBw.setVisible(true);
            selectFootballBannerColor.setVisible(false);
            selectFootballBar.setVisible(false);
        }
    }//GEN-LAST:event_selectFootballButtonMouseExited

    private void selectSwimmingButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectSwimmingButtonMouseEntered
        if(sportSelected != 5) {
            selectSwimmingBannerColor.setVisible(true);
            selectSwimmingBannerBw.setVisible(false);
            selectSwimmingBar.setVisible(true);
        }
    }//GEN-LAST:event_selectSwimmingButtonMouseEntered

    private void selectSwimmingButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectSwimmingButtonMouseExited
        if(sportSelected != 5) {
            selectSwimmingBannerBw.setVisible(true);
            selectSwimmingBannerColor.setVisible(false);
            selectSwimmingBar.setVisible(false);
        }
    }//GEN-LAST:event_selectSwimmingButtonMouseExited

    private void selectSkatingButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectSkatingButtonMouseEntered
        if(sportSelected != 6) {
            selectSkatingBannerColor.setVisible(true);
            selectSkatingBannerBw.setVisible(false);
            selectSkatingBar.setVisible(true);
        }
    }//GEN-LAST:event_selectSkatingButtonMouseEntered

    private void selectSkatingButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectSkatingButtonMouseExited
        if(sportSelected != 6) {
            selectSkatingBannerBw.setVisible(true);
            selectSkatingBannerColor.setVisible(false);
            selectSkatingBar.setVisible(false);
        }
    }//GEN-LAST:event_selectSkatingButtonMouseExited

    private void selectYogaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectYogaButtonMouseEntered
        if(sportSelected != 7) {
            selectYogaBannerColor.setVisible(true);
            selectYogaBannerBw.setVisible(false);
            selectYogaBar.setVisible(true);
        }
    }//GEN-LAST:event_selectYogaButtonMouseEntered

    private void selectYogaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectYogaButtonMouseExited
        if(sportSelected != 7) {
            selectYogaBannerBw.setVisible(true);
            selectYogaBannerColor.setVisible(false);
            selectYogaBar.setVisible(false);
        }
    }//GEN-LAST:event_selectYogaButtonMouseExited

    private void selectJumpingRopeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectJumpingRopeButtonMouseEntered
        if(sportSelected != 8) {
            selectJumpingRopeBannerColor.setVisible(true);
            selectJumpingRopeBannerBw.setVisible(false);
            selectJumpingRopeBar.setVisible(true);
        }
    }//GEN-LAST:event_selectJumpingRopeButtonMouseEntered

    private void selectJumpingRopeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectJumpingRopeButtonMouseExited
        if(sportSelected != 8) {
            selectJumpingRopeBannerBw.setVisible(true);
            selectJumpingRopeBannerColor.setVisible(false);
            selectJumpingRopeBar.setVisible(false);
        }
    }//GEN-LAST:event_selectJumpingRopeButtonMouseExited
    
    private void selectSportResetImages() {
        selectRunningBannerColor.setVisible(false);
        selectRunningBannerBw.setVisible(true);
        selectRunningBar.setVisible(false);
        selectLiftingBannerColor.setVisible(false);
        selectLiftingBannerBw.setVisible(true);
        selectLiftingBar.setVisible(false);
        selectBikeRidingBannerColor.setVisible(false);
        selectBikeRidingBannerBw.setVisible(true);
        selectBikeRidingBar.setVisible(false);
        selectFootballBannerColor.setVisible(false);
        selectFootballBannerBw.setVisible(true);
        selectFootballBar.setVisible(false);
        selectSwimmingBannerColor.setVisible(false);
        selectSwimmingBannerBw.setVisible(true);
        selectSwimmingBar.setVisible(false);
        selectSkatingBannerColor.setVisible(false);
        selectSkatingBannerBw.setVisible(true);
        selectSkatingBar.setVisible(false);
        selectYogaBannerColor.setVisible(false);
        selectYogaBannerBw.setVisible(true);
        selectYogaBar.setVisible(false);
        selectJumpingRopeBannerColor.setVisible(false);
        selectJumpingRopeBannerBw.setVisible(true);
        selectJumpingRopeBar.setVisible(false);
    }
    
    private void selectSportButtonClicked(JLabel bannerColor, JLabel bannerBw, JLabel bar, int sportId) {
        sportSelected = sportId;
        selectSportResetImages();
        bannerColor.setVisible(true);
        bannerBw.setVisible(false);
        bar.setVisible(true);
    }
    
    private void selectRunningButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectRunningButtonMouseClicked
        selectSportButtonClicked(selectRunningBannerColor, selectRunningBannerBw, selectRunningBar, 1);
        workoutDetailsInfoPanel.setVisible(false);
        workoutDetailsPanel.setVisible(true);
        workoutDetailsSportNameTextField.setText("Bieganie");
        workoutDetailsCalculateKcal();
    }//GEN-LAST:event_selectRunningButtonMouseClicked

    private void selectLiftingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectLiftingButtonMouseClicked
        selectSportButtonClicked(selectLiftingBannerColor, selectLiftingBannerBw, selectLiftingBar, 2);
        workoutDetailsInfoPanel.setVisible(false);
        workoutDetailsPanel.setVisible(true);
        workoutDetailsSportNameTextField.setText("Trening si??owy");
        workoutDetailsCalculateKcal();
    }//GEN-LAST:event_selectLiftingButtonMouseClicked

    private void selectBikeRidingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectBikeRidingButtonMouseClicked
        selectSportButtonClicked(selectBikeRidingBannerColor, selectBikeRidingBannerBw, selectBikeRidingBar, 3);
        workoutDetailsInfoPanel.setVisible(false);
        workoutDetailsPanel.setVisible(true);
        workoutDetailsSportNameTextField.setText("Jazda na rowerze");
        workoutDetailsCalculateKcal();
    }//GEN-LAST:event_selectBikeRidingButtonMouseClicked

    private void selectFootballButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectFootballButtonMouseClicked
        selectSportButtonClicked(selectFootballBannerColor, selectFootballBannerBw, selectFootballBar, 4);
        workoutDetailsInfoPanel.setVisible(false);
        workoutDetailsPanel.setVisible(true);
        workoutDetailsSportNameTextField.setText("Pi??ka no??na");
        workoutDetailsCalculateKcal();
    }//GEN-LAST:event_selectFootballButtonMouseClicked

    private void selectSwimmingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectSwimmingButtonMouseClicked
        selectSportButtonClicked(selectSwimmingBannerColor, selectSwimmingBannerBw, selectSwimmingBar, 5);
        workoutDetailsInfoPanel.setVisible(false);
        workoutDetailsPanel.setVisible(true);
        workoutDetailsSportNameTextField.setText("P??ywanie");
        workoutDetailsCalculateKcal();
    }//GEN-LAST:event_selectSwimmingButtonMouseClicked

    private void selectSkatingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectSkatingButtonMouseClicked
        selectSportButtonClicked(selectSkatingBannerColor, selectSkatingBannerBw, selectSkatingBar, 6);
        workoutDetailsInfoPanel.setVisible(false);
        workoutDetailsPanel.setVisible(true);
        workoutDetailsSportNameTextField.setText("Jazda na rolkach");
        workoutDetailsCalculateKcal();
    }//GEN-LAST:event_selectSkatingButtonMouseClicked

    private void selectYogaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectYogaButtonMouseClicked
        selectSportButtonClicked(selectYogaBannerColor, selectYogaBannerBw, selectYogaBar, 7);
        workoutDetailsInfoPanel.setVisible(false);
        workoutDetailsPanel.setVisible(true);
        workoutDetailsSportNameTextField.setText("Joga");
        workoutDetailsCalculateKcal();
    }//GEN-LAST:event_selectYogaButtonMouseClicked

    private void selectJumpingRopeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectJumpingRopeButtonMouseClicked
        selectSportButtonClicked(selectJumpingRopeBannerColor, selectJumpingRopeBannerBw, selectJumpingRopeBar, 8);
        workoutDetailsInfoPanel.setVisible(false);
        workoutDetailsPanel.setVisible(true);
        workoutDetailsSportNameTextField.setText("Skakanie na skakance");
        workoutDetailsCalculateKcal();
    }//GEN-LAST:event_selectJumpingRopeButtonMouseClicked
        
    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        saveLastMeals();
        out.println("DSC");
        threadExit = true;
        LoginSession.isLoggedIn = false; 
        displayLoadingDialog(2);
        try {
            Thread.sleep(10);
        } catch (InterruptedException exception) {
            JOptionPane.showMessageDialog(null, "Error: " + exception.getMessage());
        }
        LoginSession.resetParameters();
        resetAllParameters();
        selectSportResetImages();
        loginInfo.setVisible(false);
        logoutButton.setVisible(false);
        menuBar(myProfileButtonBar);
        mainPanel.setVisible(false);
        myProfilePanel.setVisible(false);
        mealDiaryPanel.setVisible(false);
        workoutDetailsPanel.setVisible(false);
        workoutDetailsInfoPanel.setVisible(true);
        workoutDiaryPanel.setVisible(false);
        statsPanel.setVisible(false);
        calcPanel.setVisible(false);
        infoPanel.setVisible(false);
        startupPanel.setVisible(true);
        loginPanel.setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void addMealButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMealButtonMouseEntered
        addMealButton.setBackground(Color.decode("#009BA3"));
    }//GEN-LAST:event_addMealButtonMouseEntered

    private void addMealButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMealButtonMouseExited
        addMealButton.setBackground(Color.decode("#00ADB5"));
    }//GEN-LAST:event_addMealButtonMouseExited

    private void closeDayButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeDayButtonMouseEntered
        closeDayButton.setBackground(Color.decode("#2C2F34"));
    }//GEN-LAST:event_closeDayButtonMouseEntered

    private void closeDayButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeDayButtonMouseExited
        closeDayButton.setBackground(Color.decode("#32363D"));
    }//GEN-LAST:event_closeDayButtonMouseExited

    private void addMealButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMealButtonMouseClicked
        this.addMealDialog = new AddMealDialog(null, true);
        if(LoginSession.mealsNumber < 8 ) {
            addMealDialog.setVisible(true);
            while(true) {
                if(!addMealDialog.isShowing()) {
                    if(LoginSession.mealKcal > 0 && !(LoginSession.mealName.equals("")) && LoginSession.isMealAdded == true) {
                        if(LoginSession.mealsNumber == 1) {
                            meal1Panel.setVisible(true);
                            setMealInfo(meal1NameTextField, meal1KcalValueTextField, meal1ProteinsValueTextField, meal1FatsValueTextField, meal1CarbsValueTextField, 0);      
                        }
                        if(LoginSession.mealsNumber == 2) {
                            meal2Panel.setVisible(true);
                            setMealInfo(meal2NameTextField, meal2KcalValueTextField, meal2ProteinsValueTextField, meal2FatsValueTextField, meal2CarbsValueTextField, 1);
                        }
                        if(LoginSession.mealsNumber == 3) {
                            meal3Panel.setVisible(true);
                            setMealInfo(meal3NameTextField, meal3KcalValueTextField, meal3ProteinsValueTextField, meal3FatsValueTextField, meal3CarbsValueTextField, 2);
                        }
                        if(LoginSession.mealsNumber == 4) {
                            meal4Panel.setVisible(true);
                            setMealInfo(meal4NameTextField, meal4KcalValueTextField, meal4ProteinsValueTextField, meal4FatsValueTextField, meal4CarbsValueTextField, 3);
                        }
                        if(LoginSession.mealsNumber == 5) {
                            meal5Panel.setVisible(true);
                            setMealInfo(meal5NameTextField, meal5KcalValueTextField, meal5ProteinsValueTextField, meal5FatsValueTextField, meal5CarbsValueTextField, 4);
                        }
                        if(LoginSession.mealsNumber == 6) {
                            meal6Panel.setVisible(true);
                            setMealInfo(meal6NameTextField, meal6KcalValueTextField, meal6ProteinsValueTextField, meal6FatsValueTextField, meal6CarbsValueTextField, 5);
                        }
                        if(LoginSession.mealsNumber == 7) {
                            meal7Panel.setVisible(true);
                            setMealInfo(meal7NameTextField, meal7KcalValueTextField, meal7ProteinsValueTextField, meal7FatsValueTextField, meal7CarbsValueTextField, 6);
                        }
                        if(LoginSession.mealsNumber == 8) {
                            meal8Panel.setVisible(true);
                            setMealInfo(meal8NameTextField, meal8KcalValueTextField, meal8ProteinsValueTextField, meal8FatsValueTextField, meal8CarbsValueTextField, 7);
                        }
                    }
                    break;
                }
            }
        }
        else if(LoginSession.mealsNumber == 8) {
            this.msgDialog = new TextMessageDialog(null, true, 4);
            msgDialog.setVisible(true);
        }
    }//GEN-LAST:event_addMealButtonMouseClicked

    private void setMealInfo(JTextField nameField, JTextField kcalField, JTextField proteinsField, JTextField fatsField, JTextField carbsField, int i) {
        totalKcal += LoginSession.mealKcal;
        totalProteins += LoginSession.mealProteins;
        totalFats += LoginSession.mealFats;
        totalCarbs += LoginSession.mealCarbs;
        
        LoginSession.mealNameArray[i] = LoginSession.mealName;
        LoginSession.mealKcalArray[i] = LoginSession.mealKcal;
        LoginSession.mealProteinsArray[i] = LoginSession.mealProteins;
        LoginSession.mealFatsArray[i] = LoginSession.mealFats;
        LoginSession.mealCarbsArray[i] = LoginSession.mealCarbs;
                    
        nameField.setText(LoginSession.mealName);
        kcalField.setText(String.valueOf(df.format(LoginSession.mealKcal)) + " kcal");
        proteinsField.setText(String.valueOf(df.format(LoginSession.mealProteins)) + "g");
        fatsField.setText(String.valueOf(df.format(LoginSession.mealFats)) + "g");
        carbsField.setText(String.valueOf(df.format(LoginSession.mealCarbs)) + "g");
        
        setTotalValues();
    }
    
    private void setTotalValues() {
        totalKcalValueTextField.setText(String.valueOf(df.format(totalKcal)) + " kcal");
        totalProteinsValueTextField.setText(String.valueOf(df.format(totalProteins)) + "g");
        totalFatsValueTextField.setText(String.valueOf(df.format(totalFats)) + "g");
        totalCarbsValueTextField.setText(String.valueOf(df.format(totalCarbs)) + "g");
        kcalValueTextField.setText(String.valueOf(df.format(totalKcal)) + " kcal");
    }
    
    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        saveLastMeals();
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void closeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseEntered
        closeButtonIconActive.setVisible(true);
        closeButtonIcon.setVisible(false);
    }//GEN-LAST:event_closeButtonMouseEntered

    private void closeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseExited
        closeButtonIcon.setVisible(true);
        closeButtonIconActive.setVisible(false);
    }//GEN-LAST:event_closeButtonMouseExited

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        setExtendedState(Frame.ICONIFIED);  
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void minimizeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseEntered
        minimizeButtonIconActive.setVisible(true);
        minimizeButtonIcon.setVisible(false);
    }//GEN-LAST:event_minimizeButtonMouseEntered

    private void minimizeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseExited
        minimizeButtonIcon.setVisible(true);
        minimizeButtonIconActive.setVisible(false);
    }//GEN-LAST:event_minimizeButtonMouseExited

    private void logoutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseEntered
        logoutButtonText.setForeground(Color.decode("#939393"));
    }//GEN-LAST:event_logoutButtonMouseEntered

    private void logoutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseExited
        logoutButtonText.setForeground(Color.decode("#ACACAC"));
    }//GEN-LAST:event_logoutButtonMouseExited

    private void closeDayButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeDayButtonMouseClicked
        try {
            DatabaseOperations.archiveMealDiary(totalKcal, totalProteins, totalFats, totalCarbs, this);
            DatabaseOperations.deleteLastMeals(this);
            this.msgDialog = new TextMessageDialog(null, true, 2);
            msgDialog.setVisible(true);
            emptyMealDiary();
            totalKcal = 0.0;
            totalProteins = 0.0;
            totalFats = 0.0;
            totalCarbs = 0.0;
            LoginSession.mealsNumber = 0;
            setMealsStats();
            setWorkoutStats();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Error: " + exception.getMessage());
        }  
    }//GEN-LAST:event_closeDayButtonMouseClicked
    
    private void saveLastMeals() {
        if(LoginSession.mealsNumber > 0) {
            try {
                DatabaseOperations.deleteLastMeals(this);
                for(int i=0; i<LoginSession.mealsNumber; i++) {
                    DatabaseOperations.archiveLastMeals(LoginSession.mealNameArray[i], LoginSession.mealKcalArray[i], LoginSession.mealProteinsArray[i], 
                            LoginSession.mealFatsArray[i], LoginSession.mealCarbsArray[i], this);
                }
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this, "Error: " + exception.getMessage());
            }
        }
    }
    
    private void loadLastMeals() {
        try {
            DatabaseOperations.loadLastMeals(this);
            if(LoginSession.mealsNumber > 0)
                setMealValues(0, meal1Panel, meal1NameTextField, meal1KcalValueTextField, meal1ProteinsValueTextField, meal1FatsValueTextField, meal1CarbsValueTextField);
            if(LoginSession.mealsNumber > 1)
                setMealValues(1, meal2Panel, meal2NameTextField, meal2KcalValueTextField, meal2ProteinsValueTextField, meal2FatsValueTextField, meal2CarbsValueTextField);
            if(LoginSession.mealsNumber > 2)
                setMealValues(2, meal3Panel, meal3NameTextField, meal3KcalValueTextField, meal3ProteinsValueTextField, meal3FatsValueTextField, meal3CarbsValueTextField);
            if(LoginSession.mealsNumber > 3)
                setMealValues(3, meal4Panel, meal4NameTextField, meal4KcalValueTextField, meal4ProteinsValueTextField, meal4FatsValueTextField, meal4CarbsValueTextField);
            if(LoginSession.mealsNumber > 4)
                setMealValues(4, meal5Panel, meal5NameTextField, meal5KcalValueTextField, meal5ProteinsValueTextField, meal5FatsValueTextField, meal5CarbsValueTextField);
            if(LoginSession.mealsNumber > 5)
                setMealValues(5, meal6Panel, meal6NameTextField, meal6KcalValueTextField, meal6ProteinsValueTextField, meal6FatsValueTextField, meal6CarbsValueTextField);
            if(LoginSession.mealsNumber > 6)
                setMealValues(6, meal7Panel, meal7NameTextField, meal7KcalValueTextField, meal7ProteinsValueTextField, meal7FatsValueTextField, meal7CarbsValueTextField);
            if(LoginSession.mealsNumber > 7)
                setMealValues(7, meal8Panel, meal8NameTextField, meal8KcalValueTextField, meal8ProteinsValueTextField, meal8FatsValueTextField, meal8CarbsValueTextField);
            for(int i=0; i<LoginSession.mealsNumber; i++) {
                totalKcal += LoginSession.mealKcalArray[i];
                totalProteins += LoginSession.mealProteinsArray[i];
                totalFats += LoginSession.mealFatsArray[i];
                totalCarbs += LoginSession.mealCarbsArray[i];
            }
            setTotalValues();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Error: " + exception.getMessage());
        }
    }
    
    private void setMealValues(int index, JPanel panel, JTextField nameField, JTextField kcalField, JTextField proteinsField, JTextField fatsField, JTextField carbsField) {
        panel.setVisible(true);
        nameField.setText(LoginSession.mealNameArray[index]);
        kcalField.setText(String.valueOf(df.format(LoginSession.mealKcalArray[index])) + " kcal");
        proteinsField.setText(String.valueOf(df.format(LoginSession.mealProteinsArray[index])) + "g");
        fatsField.setText(String.valueOf(df.format(LoginSession.mealFatsArray[index])) + "g");
        carbsField.setText(String.valueOf(df.format(LoginSession.mealCarbsArray[index])) + "g");
    }
    
    private void emptyMealDiary() {
        meal1NameTextField.setText("-");
        meal1KcalValueTextField.setText("-");
        meal1ProteinsValueTextField.setText("-");
        meal1FatsValueTextField.setText("-");
        meal1CarbsValueTextField.setText("-");
        meal1Panel.setVisible(false);
        
        meal2NameTextField.setText("-");
        meal2KcalValueTextField.setText("-");
        meal2ProteinsValueTextField.setText("-");
        meal2FatsValueTextField.setText("-");
        meal2CarbsValueTextField.setText("-");
        meal2Panel.setVisible(false);
        
        meal3NameTextField.setText("-");
        meal3KcalValueTextField.setText("-");
        meal3ProteinsValueTextField.setText("-");
        meal3FatsValueTextField.setText("-");
        meal3CarbsValueTextField.setText("-");
        meal3Panel.setVisible(false);
        
        meal4NameTextField.setText("-");
        meal4KcalValueTextField.setText("-");
        meal4ProteinsValueTextField.setText("-");
        meal4FatsValueTextField.setText("-");
        meal4CarbsValueTextField.setText("-");
        meal4Panel.setVisible(false);
        
        meal5NameTextField.setText("-");
        meal5KcalValueTextField.setText("-");
        meal5ProteinsValueTextField.setText("-");
        meal5FatsValueTextField.setText("-");
        meal5CarbsValueTextField.setText("-");
        meal5Panel.setVisible(false);
        
        meal6NameTextField.setText("-");
        meal6KcalValueTextField.setText("-");
        meal6ProteinsValueTextField.setText("-");
        meal6FatsValueTextField.setText("-");
        meal6CarbsValueTextField.setText("-");
        meal6Panel.setVisible(false);
        
        meal7NameTextField.setText("-");
        meal7KcalValueTextField.setText("-");
        meal7ProteinsValueTextField.setText("-");
        meal7FatsValueTextField.setText("-");
        meal7CarbsValueTextField.setText("-");
        meal7Panel.setVisible(false);
        
        meal8NameTextField.setText("-");
        meal8KcalValueTextField.setText("-");
        meal8ProteinsValueTextField.setText("-");
        meal8FatsValueTextField.setText("-");
        meal8CarbsValueTextField.setText("-");
        meal8Panel.setVisible(false);
        
        totalKcalValueTextField.setText("0 kcal");
        totalProteinsValueTextField.setText("0g");
        totalFatsValueTextField.setText("0g");
        totalCarbsValueTextField.setText("0g");
        
        totalKcalValueTextField.setText("0 kcal");
    }
    
    public void displayLoadingDialog(int type) {
        this.loadingDialog = new LoadingDialog(null, true, type);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                loadingDialog.setLocation(getLocation());
                loadingDialog.setVisible(true);
            }
        });
    }
    
    private void lastActivitiesService() {
        Socket socket;
        try {
            socket = new Socket(hostAddress, PORT);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            while(!threadExit) {
                receivedMessage = in.readLine();
                if(receivedMessage != null) {
                    if(receivedMessage.startsWith("GETNAME")) 
                        out.println(LoginSession.nickname);
                    else if(receivedMessage.startsWith("USERNAME")) {
                        moveLastActivityBars(1);
                        lastActivity1UsernameTextField.setText(receivedMessage.substring(9));
                    }
                    else if(receivedMessage.startsWith("MSG")) {
                        moveLastActivityBars(2);
                        lastActivity1MessageTextField.setText(receivedMessage.substring(4));
                        lastActivitiesCounter++;
                    }
                }
            }
            socket.close();
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    private void login() {
        try {
            if(DatabaseOperations.isLogin(username, encryptedPassword, usertype, null)) {
                username = null;
                encryptedPassword = null;
                
                threadExit = false;
                displayLoadingDialog(1);
                Thread.sleep(30);
                LoginSession.isLoggedIn = true;
                this.broadcastThread = new Thread(new Runnable() {
                    public void run() {
                        lastActivitiesService();
                    }
                });
                broadcastThread.start();
                warningText.setVisible(false);
                emptyFields();
                loginPanel.setVisible(false);
                startupPanel.setVisible(false);
                mainPanel.setVisible(true);
                myProfilePanel.setVisible(true);
                logoutButton.setVisible(true);
                setUserParameters();
            }
            else
                warningText.setVisible(true);
            } catch (InterruptedException exception) {
                JOptionPane.showMessageDialog(this, "Error: " + exception.getMessage());
            }  
    }
    
    private void loginButtonClicked() throws NoSuchAlgorithmException {        
        username = loginTextField.getText();
        password = new String(passwordField.getPassword());
        usertype = "regular";
        
        if(!(username.equals("") || password.equals(""))) {
            encryptedPassword = sha256.encryptPassword(password, DatabaseOperations.getHashSalt(username, this));
            password = null;
            this.loadingThread = new Thread(new Runnable() {
                public void run() {
                    login(); 
                }
            });
            loadingThread.start();
        } 
        else
            warningText.setVisible(true);
    }

    protected void emptyFields() {
        loginTextField.setText("");
        passwordField.setText("");
    }
    
    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
        registerButtonText.setForeground(Color.decode("#00ADB5"));
        registerButtonLowerBar.setBackground(Color.decode("#00ADB5"));
    }//GEN-LAST:event_registerButtonMouseExited

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        registerButtonText.setForeground(Color.decode("#009BA3"));
        registerButtonLowerBar.setBackground(Color.decode("#009BA3"));
    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        this.registerDialog = new RegisterDialog(null, true);
        registerDialog.setVisible(true);
    }//GEN-LAST:event_registerButtonMouseClicked

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        val.limitCharVal(evt, passwordField);
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER)
            try {
                loginButtonClicked();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void loginTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginTextFieldKeyPressed
        val.limitCharVal(evt, loginTextField);
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER)
            try {
                loginButtonClicked();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginTextFieldKeyPressed

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        loginButtonBackground.setVisible(true);
        loginButtonBackgroundActive.setVisible(false);
    }//GEN-LAST:event_loginButtonMouseExited

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        loginButtonBackgroundActive.setVisible(true);
        loginButtonBackground.setVisible(false);
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        try {
            loginButtonClicked();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void startupPanelCloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startupPanelCloseButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_startupPanelCloseButtonMouseClicked

    private void startupPanelCloseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startupPanelCloseButtonMouseEntered
        startupPanelCloseButtonActiveIcon.setVisible(true);
        startupPanelCloseButtonInactiveIcon.setVisible(false);
    }//GEN-LAST:event_startupPanelCloseButtonMouseEntered

    private void startupPanelCloseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startupPanelCloseButtonMouseExited
        startupPanelCloseButtonInactiveIcon.setVisible(true);
        startupPanelCloseButtonActiveIcon.setVisible(false);
    }//GEN-LAST:event_startupPanelCloseButtonMouseExited

    private void startupPanelMinimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startupPanelMinimizeButtonMouseClicked
        setExtendedState(Frame.ICONIFIED);  
    }//GEN-LAST:event_startupPanelMinimizeButtonMouseClicked

    private void startupPanelMinimizeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startupPanelMinimizeButtonMouseEntered
        startupPanelMinimizeButtonActiveIcon.setVisible(true);
        startupPanelMinimizeButtonInactiveIcon.setVisible(false);
    }//GEN-LAST:event_startupPanelMinimizeButtonMouseEntered

    private void startupPanelMinimizeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startupPanelMinimizeButtonMouseExited
        startupPanelMinimizeButtonInactiveIcon.setVisible(true);
        startupPanelMinimizeButtonActiveIcon.setVisible(false);
    }//GEN-LAST:event_startupPanelMinimizeButtonMouseExited
    
    private void intensityLevelButtonsFill(JLabel label1) {
        workoutDetailsIntensityLevel1ButtonFill.setBackground(Color.decode("#3F4247"));
        workoutDetailsIntensityLevel2ButtonFill.setBackground(Color.decode("#3F4247"));
        workoutDetailsIntensityLevel3ButtonFill.setBackground(Color.decode("#3F4247"));
        
        label1.setBackground(Color.decode("#00ADB5"));
        
        workoutDetailsIntensityLevel1ButtonFill.repaint();
        workoutDetailsIntensityLevel2ButtonFill.repaint();
        workoutDetailsIntensityLevel3ButtonFill.repaint();
    }
    
    private void workoutDetailsIntensityLevel1ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDetailsIntensityLevel1ButtonMouseClicked
        intensityLevelButtonsFill(workoutDetailsIntensityLevel1ButtonFill);
        intensityLevel = 1;
        workoutDetailsCalculateKcal();
    }//GEN-LAST:event_workoutDetailsIntensityLevel1ButtonMouseClicked

    private void workoutDetailsIntensityLevel1ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDetailsIntensityLevel1ButtonMouseEntered
        if(intensityLevel != 1)
            workoutDetailsIntensityLevel1ButtonFill.setBackground(Color.decode("#525458"));
    }//GEN-LAST:event_workoutDetailsIntensityLevel1ButtonMouseEntered

    private void workoutDetailsIntensityLevel1ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDetailsIntensityLevel1ButtonMouseExited
        if(intensityLevel != 1)
            workoutDetailsIntensityLevel1ButtonFill.setBackground(Color.decode("#3F4247"));
    }//GEN-LAST:event_workoutDetailsIntensityLevel1ButtonMouseExited

    private void workoutDetailsIntensityLevel2ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDetailsIntensityLevel2ButtonMouseClicked
        intensityLevelButtonsFill(workoutDetailsIntensityLevel2ButtonFill);
        intensityLevel = 2;
        workoutDetailsCalculateKcal();
    }//GEN-LAST:event_workoutDetailsIntensityLevel2ButtonMouseClicked

    private void workoutDetailsIntensityLevel2ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDetailsIntensityLevel2ButtonMouseEntered
        if(intensityLevel != 2)
            workoutDetailsIntensityLevel2ButtonFill.setBackground(Color.decode("#525458"));
    }//GEN-LAST:event_workoutDetailsIntensityLevel2ButtonMouseEntered

    private void workoutDetailsIntensityLevel2ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDetailsIntensityLevel2ButtonMouseExited
        if(intensityLevel != 2)
            workoutDetailsIntensityLevel2ButtonFill.setBackground(Color.decode("#3F4247"));
    }//GEN-LAST:event_workoutDetailsIntensityLevel2ButtonMouseExited

    private void workoutDetailsIntensityLevel3ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDetailsIntensityLevel3ButtonMouseClicked
        intensityLevelButtonsFill(workoutDetailsIntensityLevel3ButtonFill);
        intensityLevel = 3;
        workoutDetailsCalculateKcal();
    }//GEN-LAST:event_workoutDetailsIntensityLevel3ButtonMouseClicked

    private void workoutDetailsIntensityLevel3ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDetailsIntensityLevel3ButtonMouseEntered
        if(intensityLevel != 3)
            workoutDetailsIntensityLevel3ButtonFill.setBackground(Color.decode("#525458"));
    }//GEN-LAST:event_workoutDetailsIntensityLevel3ButtonMouseEntered

    private void workoutDetailsIntensityLevel3ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDetailsIntensityLevel3ButtonMouseExited
        if(intensityLevel != 3)
            workoutDetailsIntensityLevel3ButtonFill.setBackground(Color.decode("#3F4247"));
    }//GEN-LAST:event_workoutDetailsIntensityLevel3ButtonMouseExited

    private void workoutDetailsWeightTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_workoutDetailsWeightTextFieldKeyPressed
        val.floatNumberVal(evt, workoutDetailsWeightTextField);
    }//GEN-LAST:event_workoutDetailsWeightTextFieldKeyPressed

    private void workoutDetailsTimeTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_workoutDetailsTimeTextFieldKeyPressed
        val.intNumberVal(evt, workoutDetailsTimeTextField);
    }//GEN-LAST:event_workoutDetailsTimeTextFieldKeyPressed

    private void workoutDetailsCalculateKcal() {
        if(!(workoutDetailsWeightTextField.getText().equals("") || workoutDetailsTimeTextField.getText().equals(""))) {
            weight = Double.parseDouble(workoutDetailsWeightTextField.getText());
            time = Integer.parseInt(workoutDetailsTimeTextField.getText());
            if(sportSelected == 1)
                kcal = workoutCalc.running(weight, time, intensityLevel);
            if(sportSelected == 2)
                kcal = workoutCalc.lifting(time, intensityLevel);
            if(sportSelected == 3)
                kcal = workoutCalc.bikeRiding(weight, time, intensityLevel);
            if(sportSelected == 4)
                kcal = workoutCalc.football(weight, time, intensityLevel);
            if(sportSelected == 5)
                kcal = workoutCalc.swimming(weight, time, intensityLevel);
            if(sportSelected == 6)
                kcal = workoutCalc.skating(weight, time, intensityLevel);
            if(sportSelected == 7)
                kcal = workoutCalc.yoga(weight, time, intensityLevel);
            if(sportSelected == 8)
                kcal = workoutCalc.jumpingRope(weight, time, intensityLevel);
            workoutDetailsKcalValueTextField.setText(String.valueOf(df.format(kcal)) + "kcal");
        }
    }
    
    private void workoutDetailsSaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDetailsSaveButtonMouseClicked
        if(!(workoutDetailsWeightTextField.getText().equals("") || workoutDetailsTimeTextField.getText().equals(""))) {
            try {
                DatabaseOperations.archiveWorkoutDiary(workoutDetailsSportNameTextField.getText(), weight, time, intensityLevel, workoutCalc.kcal, this);
                this.msgDialog = new TextMessageDialog(null, true, 3);
                msgDialog.setVisible(true);
                out.println(workoutDetailsSportNameTextField.getText() + " [" + time + "min | " + df.format(kcal) + " kcal]");
                workoutDetailsWeightTextField.setText("");
                workoutDetailsTimeTextField.setText("");
                intensityLevelButtonsFill(workoutDetailsIntensityLevel2ButtonFill);
                intensityLevel = 2;
                workoutDetailsKcalValueTextField.setText("-");
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this, "Error: " + exception.getMessage());
            }        
        }
    }//GEN-LAST:event_workoutDetailsSaveButtonMouseClicked

    private void workoutDetailsSaveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDetailsSaveButtonMouseEntered
       workoutDetailsSaveButton.setBackground(Color.decode("#009BA3"));
    }//GEN-LAST:event_workoutDetailsSaveButtonMouseEntered

    private void workoutDetailsSaveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDetailsSaveButtonMouseExited
        workoutDetailsSaveButton.setBackground(Color.decode("#00ADB5"));
    }//GEN-LAST:event_workoutDetailsSaveButtonMouseExited

    private void workoutDetailsWeightTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_workoutDetailsWeightTextFieldKeyReleased
        workoutDetailsCalculateKcal();
    }//GEN-LAST:event_workoutDetailsWeightTextFieldKeyReleased

    private void workoutDetailsTimeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_workoutDetailsTimeTextFieldKeyReleased
        workoutDetailsCalculateKcal();
    }//GEN-LAST:event_workoutDetailsTimeTextFieldKeyReleased

    private void githubButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_githubButtonMouseEntered
        githubIconActive.setVisible(true);
        githubIconInactive.setVisible(false);
    }//GEN-LAST:event_githubButtonMouseEntered

    private void githubButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_githubButtonMouseExited
        githubIconInactive.setVisible(true);
        githubIconActive.setVisible(false);
    }//GEN-LAST:event_githubButtonMouseExited

    private void facebookButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookButtonMouseEntered
        facebookIconActive.setVisible(true);
        facebookIconInactive.setVisible(false);
    }//GEN-LAST:event_facebookButtonMouseEntered

    private void facebookButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookButtonMouseExited
        facebookIconInactive.setVisible(true);
        facebookIconActive.setVisible(false);
    }//GEN-LAST:event_facebookButtonMouseExited

    private void instagramButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagramButtonMouseEntered
        instagramIconActive.setVisible(true);
        instagramIconInactive.setVisible(false);
    }//GEN-LAST:event_instagramButtonMouseEntered

    private void instagramButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagramButtonMouseExited
        instagramIconInactive.setVisible(true);
        instagramIconActive.setVisible(false);
    }//GEN-LAST:event_instagramButtonMouseExited

    private void githubButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_githubButtonMouseClicked
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/dwarazybe/DailyMe"));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_githubButtonMouseClicked

    private void facebookButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookButtonMouseClicked
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI("https://facebook.com/"));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_facebookButtonMouseClicked

    private void instagramButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagramButtonMouseClicked
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI("https://instagram.com/"));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_instagramButtonMouseClicked

    private void getPosition(MouseEvent evt) {
        positionX = evt.getX();
        positionY = evt.getY();
    }
    
    private void setFrameLocation(MouseEvent evt) {
        this.setLocation(evt.getXOnScreen() - positionX, evt.getYOnScreen() - positionY);
    }
    
    private void myProfileBannerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileBannerMouseDragged
        setFrameLocation(evt);
    }//GEN-LAST:event_myProfileBannerMouseDragged

    private void myProfileBannerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileBannerMousePressed
        getPosition(evt);
    }//GEN-LAST:event_myProfileBannerMousePressed

    private void mealDiaryBannerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mealDiaryBannerMouseDragged
        setFrameLocation(evt);
    }//GEN-LAST:event_mealDiaryBannerMouseDragged

    private void mealDiaryBannerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mealDiaryBannerMousePressed
        getPosition(evt);
    }//GEN-LAST:event_mealDiaryBannerMousePressed

    private void workoutDiaryBannerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDiaryBannerMouseDragged
        setFrameLocation(evt);
    }//GEN-LAST:event_workoutDiaryBannerMouseDragged

    private void workoutDiaryBannerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workoutDiaryBannerMousePressed
        getPosition(evt);
    }//GEN-LAST:event_workoutDiaryBannerMousePressed

    private void statsBannerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statsBannerMouseDragged
        setFrameLocation(evt);
    }//GEN-LAST:event_statsBannerMouseDragged

    private void statsBannerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statsBannerMousePressed
        getPosition(evt);
    }//GEN-LAST:event_statsBannerMousePressed

    private void calcBannerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBannerMouseDragged
        setFrameLocation(evt);
    }//GEN-LAST:event_calcBannerMouseDragged

    private void calcBannerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcBannerMousePressed
        getPosition(evt);
    }//GEN-LAST:event_calcBannerMousePressed

    private void infoBannerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBannerMouseDragged
        setFrameLocation(evt);
    }//GEN-LAST:event_infoBannerMouseDragged

    private void infoBannerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBannerMousePressed
        getPosition(evt);
    }//GEN-LAST:event_infoBannerMousePressed

    private void startupPanelBackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startupPanelBackgroundMouseDragged
        setFrameLocation(evt);
    }//GEN-LAST:event_startupPanelBackgroundMouseDragged

    private void startupPanelBackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startupPanelBackgroundMousePressed
        getPosition(evt);
    }//GEN-LAST:event_startupPanelBackgroundMousePressed

    private void lastActivityPanelRepaint(JPanel panel, JTextField field1, JTextField field2, int type) {
        if(type == 1) {
            panel.setBackground(Color.decode("#3D4047"));
            field1.setBackground(Color.decode("#3D4047"));
            field2.setBackground(Color.decode("#3D4047"));
        }
        else if(type == 2) {
            panel.setBackground(Color.decode("#34383F"));
            field1.setBackground(Color.decode("#34383F"));
            field2.setBackground(Color.decode("#34383F"));
        }
        panel.repaint();
    }
    
    private void lastActivity1PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastActivity1PanelMouseEntered
        lastActivityPanelRepaint(lastActivity1Panel, lastActivity1UsernameTextField, lastActivity1MessageTextField, 1);
    }//GEN-LAST:event_lastActivity1PanelMouseEntered
    
    private void lastActivity1PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastActivity1PanelMouseExited
        lastActivityPanelRepaint(lastActivity1Panel, lastActivity1UsernameTextField, lastActivity1MessageTextField, 2);
    }//GEN-LAST:event_lastActivity1PanelMouseExited

    private void lastActivity2PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastActivity2PanelMouseEntered
        lastActivityPanelRepaint(lastActivity2Panel, lastActivity2UsernameTextField, lastActivity2MessageTextField, 1);
    }//GEN-LAST:event_lastActivity2PanelMouseEntered

    private void lastActivity2PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastActivity2PanelMouseExited
        lastActivityPanelRepaint(lastActivity2Panel, lastActivity2UsernameTextField, lastActivity2MessageTextField, 2);
    }//GEN-LAST:event_lastActivity2PanelMouseExited

    private void lastActivity3PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastActivity3PanelMouseEntered
        lastActivityPanelRepaint(lastActivity3Panel, lastActivity3UsernameTextField, lastActivity3MessageTextField, 1);
    }//GEN-LAST:event_lastActivity3PanelMouseEntered

    private void lastActivity3PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastActivity3PanelMouseExited
        lastActivityPanelRepaint(lastActivity3Panel, lastActivity3UsernameTextField, lastActivity3MessageTextField, 2);
    }//GEN-LAST:event_lastActivity3PanelMouseExited

    private void lastActivity4PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastActivity4PanelMouseEntered
        lastActivityPanelRepaint(lastActivity4Panel, lastActivity4UsernameTextField, lastActivity4MessageTextField, 1);
    }//GEN-LAST:event_lastActivity4PanelMouseEntered

    private void lastActivity4PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastActivity4PanelMouseExited
        lastActivityPanelRepaint(lastActivity4Panel, lastActivity4UsernameTextField, lastActivity4MessageTextField, 2);
    }//GEN-LAST:event_lastActivity4PanelMouseExited

    private void lastActivity5PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastActivity5PanelMouseEntered
        lastActivityPanelRepaint(lastActivity5Panel, lastActivity5UsernameTextField, lastActivity5MessageTextField, 1);
    }//GEN-LAST:event_lastActivity5PanelMouseEntered

    private void lastActivity5PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastActivity5PanelMouseExited
        lastActivityPanelRepaint(lastActivity5Panel, lastActivity5UsernameTextField, lastActivity5MessageTextField, 2);
    }//GEN-LAST:event_lastActivity5PanelMouseExited

    private void notesTextAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notesTextAreaKeyPressed
        if(notesEditable)
            val.notesVal(evt, notesTextArea);
    }//GEN-LAST:event_notesTextAreaKeyPressed
      
    private void setMealsStats() {
        try {
            DatabaseOperations.loadMealsStats(this);
            averageDailyKcalValueTextField.setText(String.valueOf(df.format(LoginSession.averageKcal)) + " kcal");
            averageDailyProteinsValueTextField.setText(String.valueOf(df.format(LoginSession.averageProteins)) + "g");
            averageDailyFatsValueTextField.setText(String.valueOf(df.format(LoginSession.averageFats)) + "g");
            averageDailyCarbsValueTextField.setText(String.valueOf(df.format(LoginSession.averageCarbs)) + "g");
            mostDailyKcalValueTextField.setText(String.valueOf(df.format(LoginSession.maxKcal)) + " kcal");
            mostDailyKcalDateTextField.setText(LoginSession.maxKcalDate);
            leastDailyKcalValueTextField.setText(String.valueOf(df.format(LoginSession.minKcal)) + " kcal");
            leastDailyKcalDateTextField.setText(LoginSession.minKcalDate);
            kcalSumValueTextField.setText(String.valueOf(df.format(LoginSession.totalKcal)) + " kcal");
            kcalSumDateTextField.setText(LoginSession.firstDiaryDate);
        } catch (Exception exception) {
                    JOptionPane.showMessageDialog(this, "Error: " + exception.getMessage());
        }    
    }
    
    private void setWorkoutStats() {
        try {
            DatabaseOperations.loadWorkoutStats(this);
            averageDailyBurnedKcalValueTextField.setText(String.valueOf(df.format(LoginSession.averageBurnedKcal)) + " kcal");
            mostDailyBurnedKcalValueTextField.setText(String.valueOf(df.format(LoginSession.maxBurnedKcal)) + " kcal");
            mostDailyBurnedKcalDateTextField.setText(LoginSession.maxBurnedKcalDate);
            favoriteSportTextField.setText(LoginSession.favoriteSport);
            favoriteSportTrainingsNumberTextField.setText(String.valueOf(LoginSession.favoriteSportCount));
            totalTrainingsNumberTextField.setText(String.valueOf(LoginSession.trainingsCount));
            burnedKcalSumTextField.setText(String.valueOf(df.format(LoginSession.totalBurnedKcal)) + " kcal");
            burnedKcalDateTextField.setText(LoginSession.firstTrainingDate);
        } catch (Exception exception) {
                    JOptionPane.showMessageDialog(this, "Error: " + exception.getMessage());
        }    
    }
    
    private void setMealDiaryDiagram() {
        try {
            DatabaseOperations.loadMealDiaryDiagramData(this);
            mealDiaryDiagramPanel.add(mealDiaryDiagramBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, (240 - LoginSession.mealDiaryInterval7Kcal), 35, LoginSession.mealDiaryInterval7Kcal));
            mealDiaryDiagramBar1DateTextField.setText(LoginSession.diaryInterval7Date); 
            mealDiaryDiagramPanel.add(mealDiaryDiagramBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, (240 - LoginSession.mealDiaryInterval6Kcal), 35, LoginSession.mealDiaryInterval6Kcal));
            mealDiaryDiagramBar2DateTextField.setText(LoginSession.diaryInterval6Date);
            mealDiaryDiagramPanel.add(mealDiaryDiagramBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, (240 - LoginSession.mealDiaryInterval5Kcal), 35, LoginSession.mealDiaryInterval5Kcal));
            mealDiaryDiagramBar3DateTextField.setText(LoginSession.diaryInterval5Date);
            mealDiaryDiagramPanel.add(mealDiaryDiagramBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, (240 - LoginSession.mealDiaryInterval4Kcal), 35, LoginSession.mealDiaryInterval4Kcal));
            mealDiaryDiagramBar4DateTextField.setText(LoginSession.diaryInterval4Date);
            mealDiaryDiagramPanel.add(mealDiaryDiagramBar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, (240 - LoginSession.mealDiaryInterval3Kcal), 35, LoginSession.mealDiaryInterval3Kcal));
            mealDiaryDiagramBar5DateTextField.setText(LoginSession.diaryInterval3Date);
            mealDiaryDiagramPanel.add(mealDiaryDiagramBar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, (240 - LoginSession.mealDiaryInterval2Kcal), 35, LoginSession.mealDiaryInterval2Kcal));
            mealDiaryDiagramBar6DateTextField.setText(LoginSession.diaryInterval2Date);
            mealDiaryDiagramPanel.add(mealDiaryDiagramBar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, (240 - LoginSession.mealDiaryInterval1Kcal), 35, LoginSession.mealDiaryInterval1Kcal));
            mealDiaryDiagramBar7DateTextField.setText(LoginSession.diaryInterval1Date);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Error: " + exception.getMessage());
        } 
    }
    
    private void setWorkoutDiaryDiagram() {
        try {
            DatabaseOperations.loadWorkoutDiaryDiagramData(this);
            workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, (240 - LoginSession.workoutDiaryInterval7Kcal), 35, LoginSession.workoutDiaryInterval7Kcal));
            workoutDiaryDiagramBar1DateTextField.setText(LoginSession.diaryInterval7Date);
            workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, (240 - LoginSession.workoutDiaryInterval6Kcal), 35, LoginSession.workoutDiaryInterval6Kcal));
            workoutDiaryDiagramBar2DateTextField.setText(LoginSession.diaryInterval6Date);
            workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, (240 - LoginSession.workoutDiaryInterval5Kcal), 35, LoginSession.workoutDiaryInterval5Kcal));
            workoutDiaryDiagramBar3DateTextField.setText(LoginSession.diaryInterval5Date); 
            workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, (240 - LoginSession.workoutDiaryInterval4Kcal), 35, LoginSession.workoutDiaryInterval4Kcal));
            workoutDiaryDiagramBar4DateTextField.setText(LoginSession.diaryInterval4Date);
            workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, (240 - LoginSession.workoutDiaryInterval3Kcal), 35, LoginSession.workoutDiaryInterval3Kcal));
            workoutDiaryDiagramBar5DateTextField.setText(LoginSession.diaryInterval3Date);
            workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, (240 - LoginSession.workoutDiaryInterval2Kcal), 35, LoginSession.workoutDiaryInterval2Kcal));
            workoutDiaryDiagramBar6DateTextField.setText(LoginSession.diaryInterval2Date);
            workoutDiaryDiagramPanel.add(workoutDiaryDiagramBar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, (240 - LoginSession.workoutDiaryInterval1Kcal), 35, LoginSession.workoutDiaryInterval1Kcal));
            workoutDiaryDiagramBar7DateTextField.setText(LoginSession.diaryInterval1Date);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Error: " + exception.getMessage());
        } 
    }
    
    private void repaintSelectGenderButtons() {
        calcBmrSelectGenderFemaleButton.repaint();
        calcBmrSelectGenderMaleButton.repaint();
        calcBfiSelectGenderFemaleButton.repaint();
        calcBfiSelectGenderMaleButton.repaint();
    }
    
    protected void repaintCalcButtons() {
        calcBmrButton.repaint();
        calcBmiButton.repaint();
        calcBfiButton.repaint();
    }
    
    private void activityBar(JLabel label1, JLabel label2) {
        physicalActivityLevel1Text.setOpaque(false);
        physicalActivityLevel2Text1.setOpaque(false);
        physicalActivityLevel2Text2.setOpaque(false);
        physicalActivityLevel3Text1.setOpaque(false);
        physicalActivityLevel3Text2.setOpaque(false);
        physicalActivityLevel4Text1.setOpaque(false);
        physicalActivityLevel4Text2.setOpaque(false);
        physicalActivityLevel5Text1.setOpaque(false);
        physicalActivityLevel5Text2.setOpaque(false);
        
        label1.setOpaque(true);
        label2.setOpaque(true);
        
        physicalActivityLevel1Button.repaint();
        physicalActivityLevel2Button.repaint();
        physicalActivityLevel3Button.repaint();
        physicalActivityLevel4Button.repaint();
        physicalActivityLevel5Button.repaint();
    }
    
    private void menuBar(JLabel label) {
        myProfileButtonBar.setOpaque(false);
        mealDiaryButtonBar.setOpaque(false);
        workoutDiaryButtonBar.setOpaque(false);
        statsButtonBar.setOpaque(false);
        calcButtonBar.setOpaque(false);
        infoButtonBar.setOpaque(false);
        
        label.setOpaque(true);
        
        myProfileButtonBar.repaint();
        mealDiaryButtonBar.repaint();
        workoutDiaryButtonBar.repaint();
        statsButtonBar.repaint();
        calcButtonBar.repaint();
        infoButtonBar.repaint();
    }
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
                    UIManager.getLookAndFeelDefaults().put("ProgressBar[Enabled].backgroundPainter", new Color(0,173,181)); 
                    UIManager.getLookAndFeelDefaults().put("ProgressBar[Disabled].backgroundPainter", new Color(0,173,181)); 
                    UIManager.getLookAndFeelDefaults().put("ProgressBar[Enabled+Indeterminate].progressPadding", new Color(0,173,181)); 
                    UIManager.getLookAndFeelDefaults().put("ProgressBar[Enabled].foregroundPainter", new Color(0,173,181)); 
                    UIManager.getLookAndFeelDefaults().put("ProgressBar[Disabled].foregroundPainter", new Color(0,173,181)); 
                    UIManager.getLookAndFeelDefaults().put("ProgressBar[Enabled+Finished].foregroundPainter", new Color(0,173,181)); 
                    UIManager.getLookAndFeelDefaults().put("ProgressBar[Disabled+Finished].foregroundPainter", new Color(0,173,181)); 
                    UIManager.getLookAndFeelDefaults().put("ProgressBar[Disabled+Indeterminate].foregroundPainter", new Color(0,173,181)); 
                    UIManager.getLookAndFeelDefaults().put("ProgressBar[Enabled+Indeterminate].foregroundPainter", new Color(0,173,181));   
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            
            new MainFrame().setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MealsText;
    private javax.swing.JLabel WorkoutsText;
    private javax.swing.JPanel addMealButton;
    private javax.swing.JLabel addMealButtonText;
    private javax.swing.JLabel ageText;
    protected javax.swing.JTextField ageValueTextField;
    private javax.swing.JLabel allRightsReservedText;
    private javax.swing.JLabel averageDailyBurnedKcalText;
    private javax.swing.JTextField averageDailyBurnedKcalValueTextField;
    private javax.swing.JTextField averageDailyCarbsValueTextField;
    private javax.swing.JTextField averageDailyFatsValueTextField;
    private javax.swing.JLabel averageDailyKcalText;
    private javax.swing.JTextField averageDailyKcalValueTextField;
    private javax.swing.JLabel averageDailyMacrosText;
    private javax.swing.JTextField averageDailyProteinsValueTextField;
    private javax.swing.JLabel bar1;
    private javax.swing.JLabel bar2;
    private javax.swing.JLabel bar3;
    private javax.swing.JLabel bar4;
    private javax.swing.JLabel bar5;
    private javax.swing.JLabel bar6;
    private javax.swing.JLabel bar7;
    private javax.swing.JLabel bfiButtonText;
    private javax.swing.JTextField bfiResultRateTextField;
    private javax.swing.JTextField bfiResultValueTextField;
    private javax.swing.JLabel bmiButtonText;
    private javax.swing.JLabel bmiRateText;
    protected javax.swing.JTextField bmiRateValueTextField;
    private javax.swing.JTextField bmiResultRateTextField;
    private javax.swing.JTextField bmiResultValueTextField;
    private javax.swing.JLabel bmiText;
    protected javax.swing.JTextField bmiValueTextField;
    private javax.swing.JTextField bmiValueTextField2;
    private javax.swing.JLabel bmrButtonText;
    private javax.swing.JTextField bmrResultCarbsCutValueTextField;
    private javax.swing.JTextField bmrResultCarbsOverValueTextField;
    private javax.swing.JTextField bmrResultCarbsValueTextField;
    private javax.swing.JLabel bmrResultCutMacrosText;
    private javax.swing.JTextField bmrResultFatsCutValueTextField;
    private javax.swing.JTextField bmrResultFatsOverValueTextField;
    private javax.swing.JTextField bmrResultFatsValueTextField;
    private javax.swing.JTextField bmrResultKcalCutValueTextField;
    private javax.swing.JTextField bmrResultKcalOverValueTextField;
    private javax.swing.JTextField bmrResultKcalValueTextField;
    private javax.swing.JLabel bmrResultMacrosText;
    private javax.swing.JLabel bmrResultOverMacrosText;
    private javax.swing.JTextField bmrResultProteinsCutValueTextField;
    private javax.swing.JTextField bmrResultProteinsOverValueTextField;
    private javax.swing.JTextField bmrResultProteinsValueTextField;
    private javax.swing.JLabel burnedKcalDateText;
    private javax.swing.JTextField burnedKcalDateTextField;
    private javax.swing.JLabel burnedKcalSumText;
    private javax.swing.JTextField burnedKcalSumTextField;
    private javax.swing.JLabel calcBanner;
    private javax.swing.JPanel calcBfiButton;
    private javax.swing.JLabel calcBfiCmText;
    private javax.swing.JLabel calcBfiGenderText;
    private javax.swing.JLabel calcBfiKgText;
    private javax.swing.JPanel calcBfiPanel;
    private javax.swing.JPanel calcBfiResultPanel;
    private javax.swing.JLabel calcBfiResultRateText;
    private javax.swing.JLabel calcBfiResultText;
    private javax.swing.JPanel calcBfiSelectGenderButton;
    private javax.swing.JPanel calcBfiSelectGenderFemaleButton;
    private javax.swing.JLabel calcBfiSelectGenderFemaleButtonText;
    private javax.swing.JPanel calcBfiSelectGenderMaleButton;
    private javax.swing.JLabel calcBfiSelectGenderMaleButtonText;
    private javax.swing.JLabel calcBfiTitleText;
    private javax.swing.JLabel calcBfiWaistText;
    private javax.swing.JTextField calcBfiWaistValueTextField;
    private javax.swing.JLabel calcBfiWaistValueTextFieldBar;
    private javax.swing.JLabel calcBfiWeightText;
    private javax.swing.JTextField calcBfiWeightValueTextField;
    private javax.swing.JLabel calcBfiWeightValueTextFieldBar;
    private javax.swing.JPanel calcBmiButton;
    private javax.swing.JLabel calcBmiCmText;
    private javax.swing.JLabel calcBmiHeightText;
    private javax.swing.JTextField calcBmiHeightValueTextField;
    private javax.swing.JLabel calcBmiHeightValueTextFieldBar;
    private javax.swing.JLabel calcBmiKgText;
    private javax.swing.JPanel calcBmiPanel;
    private javax.swing.JPanel calcBmiResultPanel;
    private javax.swing.JLabel calcBmiResultRateText;
    private javax.swing.JLabel calcBmiResultText;
    private javax.swing.JLabel calcBmiTitleText;
    private javax.swing.JLabel calcBmiWeightText;
    private javax.swing.JTextField calcBmiWeightValueTextField;
    private javax.swing.JLabel calcBmiWeightValueTextFieldBar;
    private javax.swing.JLabel calcBmrAgeText;
    private javax.swing.JTextField calcBmrAgeValueTextField;
    private javax.swing.JLabel calcBmrAgeValueTextFieldBar;
    private javax.swing.JPanel calcBmrButton;
    private javax.swing.JLabel calcBmrCmText;
    private javax.swing.JLabel calcBmrGenderText;
    private javax.swing.JLabel calcBmrHeightText;
    private javax.swing.JTextField calcBmrHeightValueTextField;
    private javax.swing.JLabel calcBmrHeightValueTextFieldBar;
    private javax.swing.JLabel calcBmrKgText;
    private javax.swing.JPanel calcBmrPanel;
    private javax.swing.JLabel calcBmrResultCutText;
    private javax.swing.JLabel calcBmrResultOverText;
    private javax.swing.JPanel calcBmrResultPanel;
    private javax.swing.JLabel calcBmrResultText;
    private javax.swing.JPanel calcBmrSelectGenderButton;
    private javax.swing.JPanel calcBmrSelectGenderFemaleButton;
    private javax.swing.JLabel calcBmrSelectGenderFemaleButtonText;
    private javax.swing.JPanel calcBmrSelectGenderMaleButton;
    private javax.swing.JLabel calcBmrSelectGenderMaleButtonText;
    private javax.swing.JLabel calcBmrTitleText;
    private javax.swing.JLabel calcBmrWeightText;
    private javax.swing.JTextField calcBmrWeightValueTextField;
    private javax.swing.JLabel calcBmrWeightValueTextFieldBar;
    private javax.swing.JLabel calcBmrYearsText;
    private javax.swing.JPanel calcButton;
    private javax.swing.JLabel calcButtonBar;
    private javax.swing.JLabel calcButtonIcon;
    private javax.swing.JLabel calcButtonText;
    private javax.swing.JPanel calcMenu;
    private javax.swing.JPanel calcPanel;
    private javax.swing.JPanel calculateBfiButton;
    private javax.swing.JLabel calculateBfiButtonText;
    private javax.swing.JPanel calculateBmiButton;
    private javax.swing.JLabel calculateBmiButtonText;
    private javax.swing.JPanel calculateBmrButton;
    private javax.swing.JLabel calculateBmrButtonText;
    private javax.swing.JPanel closeButton;
    private javax.swing.JLabel closeButtonIcon;
    private javax.swing.JLabel closeButtonIconActive;
    private javax.swing.JPanel closeDayButton;
    private javax.swing.JLabel closeDayButtonText;
    private javax.swing.JLabel contactText;
    private javax.swing.JPanel dailymeInfoPanel;
    private javax.swing.JLabel dailymeTextIcon;
    private javax.swing.JPanel facebookButton;
    private javax.swing.JLabel facebookIconActive;
    private javax.swing.JLabel facebookIconInactive;
    private javax.swing.JLabel favoriteSportText;
    private javax.swing.JTextField favoriteSportTextField;
    private javax.swing.JLabel favoriteSportTrainingsNumberText;
    private javax.swing.JTextField favoriteSportTrainingsNumberTextField;
    protected javax.swing.JLabel femaleIcon;
    private javax.swing.JPanel githubButton;
    private javax.swing.JLabel githubIconActive;
    private javax.swing.JLabel githubIconInactive;
    private javax.swing.JLabel goalLeftText;
    protected javax.swing.JTextField goalLeftTextField;
    private javax.swing.JLabel goalText;
    protected javax.swing.JTextField goalValueTextField;
    private javax.swing.JLabel heightText;
    protected javax.swing.JTextField heightValueTextField;
    private javax.swing.JLabel infoBanner;
    private javax.swing.JPanel infoButton;
    private javax.swing.JLabel infoButtonBar;
    private javax.swing.JLabel infoButtonIcon;
    private javax.swing.JLabel infoButtonText;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JPanel instagramButton;
    private javax.swing.JLabel instagramIconActive;
    private javax.swing.JLabel instagramIconInactive;
    private javax.swing.JLabel kcalIcon;
    private javax.swing.JPanel kcalPanel;
    private javax.swing.JPanel kcalStatsPanel;
    private javax.swing.JLabel kcalSumDateText;
    private javax.swing.JTextField kcalSumDateTextField;
    private javax.swing.JLabel kcalSumText;
    private javax.swing.JTextField kcalSumValueTextField;
    protected javax.swing.JTextField kcalValueTextField;
    private javax.swing.JPanel lastActivitiesPanel;
    private javax.swing.JLabel lastActivitiesText;
    private javax.swing.JTextField lastActivity1MessageTextField;
    private javax.swing.JPanel lastActivity1Panel;
    private javax.swing.JTextField lastActivity1UsernameTextField;
    private javax.swing.JTextField lastActivity2MessageTextField;
    private javax.swing.JPanel lastActivity2Panel;
    private javax.swing.JTextField lastActivity2UsernameTextField;
    private javax.swing.JTextField lastActivity3MessageTextField;
    private javax.swing.JPanel lastActivity3Panel;
    private javax.swing.JTextField lastActivity3UsernameTextField;
    private javax.swing.JTextField lastActivity4MessageTextField;
    private javax.swing.JPanel lastActivity4Panel;
    private javax.swing.JTextField lastActivity4UsernameTextField;
    private javax.swing.JTextField lastActivity5MessageTextField;
    private javax.swing.JPanel lastActivity5Panel;
    private javax.swing.JTextField lastActivity5UsernameTextField;
    private javax.swing.JLabel leastDailyKcalDateText;
    private javax.swing.JTextField leastDailyKcalDateTextField;
    private javax.swing.JLabel leastDailyKcalText;
    private javax.swing.JTextField leastDailyKcalValueTextField;
    private javax.swing.JPanel loginButton;
    private javax.swing.JLabel loginButtonBackground;
    private javax.swing.JLabel loginButtonBackgroundActive;
    private javax.swing.JLabel loginButtonText;
    private javax.swing.JLabel loginIcon;
    protected javax.swing.JPanel loginInfo;
    protected javax.swing.JTextField loginInfoUsernameTextField;
    private javax.swing.JPanel loginPanel;
    protected javax.swing.JTextField loginTextField;
    private javax.swing.JLabel loginTextFieldBar;
    protected javax.swing.JPanel logoutButton;
    protected javax.swing.JLabel logoutButtonText;
    private javax.swing.JPanel mainPanel;
    protected javax.swing.JLabel maleIcon;
    private javax.swing.JLabel meal1CarbsText;
    private javax.swing.JTextField meal1CarbsValueTextField;
    private javax.swing.JLabel meal1FatsText;
    private javax.swing.JTextField meal1FatsValueTextField;
    private javax.swing.JLabel meal1KcalText;
    private javax.swing.JTextField meal1KcalValueTextField;
    private javax.swing.JTextField meal1NameTextField;
    protected javax.swing.JPanel meal1Panel;
    private javax.swing.JLabel meal1ProteinsText;
    private javax.swing.JTextField meal1ProteinsValueTextField;
    private javax.swing.JLabel meal2CarbsText;
    private javax.swing.JTextField meal2CarbsValueTextField;
    private javax.swing.JLabel meal2FatsText;
    private javax.swing.JTextField meal2FatsValueTextField;
    private javax.swing.JLabel meal2KcalText;
    private javax.swing.JTextField meal2KcalValueTextField;
    private javax.swing.JTextField meal2NameTextField;
    protected javax.swing.JPanel meal2Panel;
    private javax.swing.JLabel meal2ProteinsText;
    private javax.swing.JTextField meal2ProteinsValueTextField;
    private javax.swing.JLabel meal3CarbsText;
    private javax.swing.JTextField meal3CarbsValueTextField;
    private javax.swing.JLabel meal3FatsText;
    private javax.swing.JTextField meal3FatsValueTextField;
    private javax.swing.JLabel meal3KcalText;
    private javax.swing.JTextField meal3KcalValueTextField;
    private javax.swing.JTextField meal3NameTextField;
    protected javax.swing.JPanel meal3Panel;
    private javax.swing.JLabel meal3ProteinsText;
    private javax.swing.JTextField meal3ProteinsValueTextField;
    private javax.swing.JLabel meal4CarbsText;
    private javax.swing.JTextField meal4CarbsValueTextField;
    private javax.swing.JLabel meal4FatsText;
    private javax.swing.JTextField meal4FatsValueTextField;
    private javax.swing.JLabel meal4KcalText;
    private javax.swing.JTextField meal4KcalValueTextField;
    private javax.swing.JTextField meal4NameTextField;
    protected javax.swing.JPanel meal4Panel;
    private javax.swing.JLabel meal4ProteinsText;
    private javax.swing.JTextField meal4ProteinsValueTextField;
    private javax.swing.JLabel meal5CarbsText;
    private javax.swing.JTextField meal5CarbsValueTextField;
    private javax.swing.JLabel meal5FatsText;
    private javax.swing.JTextField meal5FatsValueTextField;
    private javax.swing.JLabel meal5KcalText;
    private javax.swing.JTextField meal5KcalValueTextField;
    private javax.swing.JTextField meal5NameTextField;
    protected javax.swing.JPanel meal5Panel;
    private javax.swing.JLabel meal5ProteinsText;
    private javax.swing.JTextField meal5ProteinsValueTextField;
    private javax.swing.JLabel meal6CarbsText;
    private javax.swing.JTextField meal6CarbsValueTextField;
    private javax.swing.JLabel meal6FatsText;
    private javax.swing.JTextField meal6FatsValueTextField;
    private javax.swing.JLabel meal6KcalText;
    private javax.swing.JTextField meal6KcalValueTextField;
    private javax.swing.JTextField meal6NameTextField;
    protected javax.swing.JPanel meal6Panel;
    private javax.swing.JLabel meal6ProteinsText;
    private javax.swing.JTextField meal6ProteinsValueTextField;
    private javax.swing.JLabel meal7CarbsText;
    private javax.swing.JTextField meal7CarbsValueTextField;
    private javax.swing.JLabel meal7FatsText;
    private javax.swing.JTextField meal7FatsValueTextField;
    private javax.swing.JLabel meal7KcalText;
    private javax.swing.JTextField meal7KcalValueTextField;
    private javax.swing.JTextField meal7NameTextField;
    protected javax.swing.JPanel meal7Panel;
    private javax.swing.JLabel meal7ProteinsText;
    private javax.swing.JTextField meal7ProteinsValueTextField;
    private javax.swing.JLabel meal8CarbsText;
    private javax.swing.JTextField meal8CarbsValueTextField;
    private javax.swing.JLabel meal8FatsText;
    private javax.swing.JTextField meal8FatsValueTextField;
    private javax.swing.JLabel meal8KcalText;
    private javax.swing.JTextField meal8KcalValueTextField;
    private javax.swing.JTextField meal8NameTextField;
    protected javax.swing.JPanel meal8Panel;
    private javax.swing.JLabel meal8ProteinsText;
    private javax.swing.JTextField meal8ProteinsValueTextField;
    private javax.swing.JLabel mealDiaryBanner;
    private javax.swing.JPanel mealDiaryButton;
    private javax.swing.JLabel mealDiaryButtonBar;
    private javax.swing.JLabel mealDiaryButtonIcon;
    private javax.swing.JLabel mealDiaryButtonText;
    private javax.swing.JLabel mealDiaryDiagram0Text;
    private javax.swing.JLabel mealDiaryDiagram1200Text;
    private javax.swing.JLabel mealDiaryDiagram1600Text;
    private javax.swing.JLabel mealDiaryDiagram2000Text;
    private javax.swing.JLabel mealDiaryDiagram2400Text;
    private javax.swing.JLabel mealDiaryDiagram2800Text;
    private javax.swing.JLabel mealDiaryDiagram3200Text;
    private javax.swing.JLabel mealDiaryDiagram3600Text;
    private javax.swing.JLabel mealDiaryDiagram4000Text;
    private javax.swing.JLabel mealDiaryDiagram400Text;
    private javax.swing.JLabel mealDiaryDiagram4400Text;
    private javax.swing.JLabel mealDiaryDiagram4800Text;
    private javax.swing.JLabel mealDiaryDiagram800Text;
    private javax.swing.JLabel mealDiaryDiagramBar1;
    private javax.swing.JTextField mealDiaryDiagramBar1DateTextField;
    private javax.swing.JLabel mealDiaryDiagramBar2;
    private javax.swing.JTextField mealDiaryDiagramBar2DateTextField;
    private javax.swing.JLabel mealDiaryDiagramBar3;
    private javax.swing.JTextField mealDiaryDiagramBar3DateTextField;
    private javax.swing.JLabel mealDiaryDiagramBar4;
    private javax.swing.JTextField mealDiaryDiagramBar4DateTextField;
    private javax.swing.JLabel mealDiaryDiagramBar5;
    private javax.swing.JTextField mealDiaryDiagramBar5DateTextField;
    private javax.swing.JLabel mealDiaryDiagramBar6;
    private javax.swing.JTextField mealDiaryDiagramBar6DateTextField;
    private javax.swing.JLabel mealDiaryDiagramBar7;
    private javax.swing.JTextField mealDiaryDiagramBar7DateTextField;
    private javax.swing.JLabel mealDiaryDiagramKcalText;
    private javax.swing.JPanel mealDiaryDiagramPanel;
    private javax.swing.JLabel mealDiaryDiagramText;
    private javax.swing.JPanel mealDiaryPanel;
    private javax.swing.JPanel mealInfoPanel;
    protected javax.swing.JPanel mealListPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel minimizeButton;
    private javax.swing.JLabel minimizeButtonIcon;
    private javax.swing.JLabel minimizeButtonIconActive;
    private javax.swing.JLabel modifyNotesButton;
    private javax.swing.JPanel modifyParamsToggleButton;
    private javax.swing.JLabel modifyParamsToggleButtonOff;
    private javax.swing.JLabel modifyParamsToggleButtonOn;
    private javax.swing.JLabel mostDailyBurnedKcalDateText;
    private javax.swing.JTextField mostDailyBurnedKcalDateTextField;
    private javax.swing.JLabel mostDailyBurnedKcalText;
    private javax.swing.JTextField mostDailyBurnedKcalValueTextField;
    private javax.swing.JLabel mostDailyKcalDateText;
    private javax.swing.JTextField mostDailyKcalDateTextField;
    private javax.swing.JLabel mostDailyKcalText;
    private javax.swing.JTextField mostDailyKcalValueTextField;
    private javax.swing.JLabel myProfileBanner;
    private javax.swing.JPanel myProfileButton;
    private javax.swing.JLabel myProfileButtonBar;
    private javax.swing.JLabel myProfileButtonIcon;
    private javax.swing.JLabel myProfileButtonText;
    private javax.swing.JPanel myProfilePanel;
    private javax.swing.JPanel namePanel;
    private javax.swing.JPanel notesPanel;
    private javax.swing.JScrollPane notesScrollPane;
    private javax.swing.JLabel notesText;
    protected javax.swing.JTextArea notesTextArea;
    protected javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordFieldBar;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JPanel physicalActivityLevel1Button;
    private javax.swing.JLabel physicalActivityLevel1Text;
    private javax.swing.JPanel physicalActivityLevel2Button;
    private javax.swing.JLabel physicalActivityLevel2Text1;
    private javax.swing.JLabel physicalActivityLevel2Text2;
    private javax.swing.JPanel physicalActivityLevel3Button;
    private javax.swing.JLabel physicalActivityLevel3Text1;
    private javax.swing.JLabel physicalActivityLevel3Text2;
    private javax.swing.JPanel physicalActivityLevel4Button;
    private javax.swing.JLabel physicalActivityLevel4Text1;
    private javax.swing.JLabel physicalActivityLevel4Text2;
    private javax.swing.JPanel physicalActivityLevel5Button;
    private javax.swing.JLabel physicalActivityLevel5Text1;
    private javax.swing.JLabel physicalActivityLevel5Text2;
    private javax.swing.JPanel physicalActivityTypePanel;
    private javax.swing.JLabel physicalActivityTypeText;
    protected javax.swing.JLabel profileNameLowerBar;
    private javax.swing.JLabel profileNameText;
    protected javax.swing.JTextField profileNameTextField;
    private javax.swing.JPanel registerButton;
    private javax.swing.JLabel registerButtonLowerBar;
    private javax.swing.JLabel registerButtonText;
    private javax.swing.JLabel saveNotesButton;
    private javax.swing.JLabel selectBikeRidingBannerBw;
    private javax.swing.JLabel selectBikeRidingBannerColor;
    private javax.swing.JLabel selectBikeRidingBar;
    private javax.swing.JPanel selectBikeRidingButton;
    private javax.swing.JLabel selectFootballBannerBw;
    private javax.swing.JLabel selectFootballBannerColor;
    private javax.swing.JLabel selectFootballBar;
    private javax.swing.JPanel selectFootballButton;
    private javax.swing.JLabel selectJumpingRopeBannerBw;
    private javax.swing.JLabel selectJumpingRopeBannerColor;
    private javax.swing.JLabel selectJumpingRopeBar;
    private javax.swing.JPanel selectJumpingRopeButton;
    private javax.swing.JLabel selectLiftingBannerBw;
    private javax.swing.JLabel selectLiftingBannerColor;
    private javax.swing.JLabel selectLiftingBar;
    private javax.swing.JPanel selectLiftingButton;
    private javax.swing.JLabel selectRunningBannerBw;
    private javax.swing.JLabel selectRunningBannerColor;
    private javax.swing.JLabel selectRunningBar;
    private javax.swing.JPanel selectRunningButton;
    private javax.swing.JLabel selectSkatingBannerBw;
    private javax.swing.JLabel selectSkatingBannerColor;
    private javax.swing.JLabel selectSkatingBar;
    private javax.swing.JPanel selectSkatingButton;
    private javax.swing.JPanel selectSportBar;
    private javax.swing.JPanel selectSportPanel;
    private javax.swing.JLabel selectSportText;
    private javax.swing.JLabel selectSwimmingBannerBw;
    private javax.swing.JLabel selectSwimmingBannerColor;
    private javax.swing.JLabel selectSwimmingBar;
    private javax.swing.JPanel selectSwimmingButton;
    private javax.swing.JLabel selectYogaBannerBw;
    private javax.swing.JLabel selectYogaBannerColor;
    private javax.swing.JLabel selectYogaBar;
    private javax.swing.JPanel selectYogaButton;
    private javax.swing.JPanel startupPanel;
    private javax.swing.JLabel startupPanelBackground;
    private javax.swing.JPanel startupPanelCloseButton;
    private javax.swing.JLabel startupPanelCloseButtonActiveIcon;
    private javax.swing.JLabel startupPanelCloseButtonInactiveIcon;
    private javax.swing.JPanel startupPanelMinimizeButton;
    private javax.swing.JLabel startupPanelMinimizeButtonActiveIcon;
    private javax.swing.JLabel startupPanelMinimizeButtonInactiveIcon;
    private javax.swing.JLabel statsBanner;
    private javax.swing.JPanel statsButton;
    private javax.swing.JLabel statsButtonBar;
    private javax.swing.JLabel statsButtonIcon;
    private javax.swing.JLabel statsButtonText;
    private javax.swing.JPanel statsPanel;
    private javax.swing.JLabel titleText;
    private javax.swing.JLabel todayKcalText;
    private javax.swing.JLabel totalCarbsText;
    private javax.swing.JTextField totalCarbsValueTextField;
    private javax.swing.JLabel totalFatsText;
    private javax.swing.JTextField totalFatsValueTextField;
    private javax.swing.JLabel totalKcalText;
    private javax.swing.JTextField totalKcalValueTextField;
    private javax.swing.JLabel totalProteinsText;
    private javax.swing.JTextField totalProteinsValueTextField;
    private javax.swing.JLabel totalTrainingsNumberText;
    private javax.swing.JTextField totalTrainingsNumberTextField;
    private javax.swing.JLabel upperBar;
    private javax.swing.JPanel userParamPanel;
    private javax.swing.JLabel verticalBar1;
    private javax.swing.JLabel verticalBar2;
    protected javax.swing.JLabel warningText;
    protected javax.swing.JLabel warningText1;
    private javax.swing.JLabel weightText;
    protected javax.swing.JPanel weightValuePanel;
    protected javax.swing.JTextField weightValueTextField;
    private javax.swing.JPanel workoutDetailsInfoPanel;
    private javax.swing.JLabel workoutDetailsIntensityHighText;
    private javax.swing.JPanel workoutDetailsIntensityLevel1Button;
    private javax.swing.JLabel workoutDetailsIntensityLevel1ButtonFill;
    private javax.swing.JPanel workoutDetailsIntensityLevel2Button;
    private javax.swing.JLabel workoutDetailsIntensityLevel2ButtonFill;
    private javax.swing.JPanel workoutDetailsIntensityLevel3Button;
    private javax.swing.JLabel workoutDetailsIntensityLevel3ButtonFill;
    private javax.swing.JLabel workoutDetailsIntensityLevelText;
    private javax.swing.JLabel workoutDetailsIntensityLowText;
    private javax.swing.JLabel workoutDetailsIntensityMediumText;
    private javax.swing.JPanel workoutDetailsIntensityPanel;
    private javax.swing.JLabel workoutDetailsKcalText;
    private javax.swing.JTextField workoutDetailsKcalValueTextField;
    private javax.swing.JPanel workoutDetailsPanel;
    private javax.swing.JPanel workoutDetailsSaveButton;
    private javax.swing.JLabel workoutDetailsSaveButtonText;
    private javax.swing.JTextField workoutDetailsSportNameTextField;
    private javax.swing.JLabel workoutDetailsTimeText;
    private javax.swing.JTextField workoutDetailsTimeTextField;
    private javax.swing.JLabel workoutDetailsTimeTextFieldBar;
    private javax.swing.JLabel workoutDetailsWeightText;
    private javax.swing.JTextField workoutDetailsWeightTextField;
    private javax.swing.JLabel workoutDetailsWeightTextFieldBar;
    private javax.swing.JLabel workoutDiaryBanner;
    private javax.swing.JPanel workoutDiaryButton;
    private javax.swing.JLabel workoutDiaryButtonBar;
    private javax.swing.JLabel workoutDiaryButtonIcon;
    private javax.swing.JLabel workoutDiaryButtonText;
    private javax.swing.JLabel workoutDiaryDiagram0Text;
    private javax.swing.JLabel workoutDiaryDiagram1000Text;
    private javax.swing.JLabel workoutDiaryDiagram100Text;
    private javax.swing.JLabel workoutDiaryDiagram1100Text;
    private javax.swing.JLabel workoutDiaryDiagram1200Text;
    private javax.swing.JLabel workoutDiaryDiagram200Text;
    private javax.swing.JLabel workoutDiaryDiagram300Text;
    private javax.swing.JLabel workoutDiaryDiagram400Text;
    private javax.swing.JLabel workoutDiaryDiagram500Text;
    private javax.swing.JLabel workoutDiaryDiagram600Text;
    private javax.swing.JLabel workoutDiaryDiagram700Text;
    private javax.swing.JLabel workoutDiaryDiagram800Text;
    private javax.swing.JLabel workoutDiaryDiagram900Text;
    private javax.swing.JLabel workoutDiaryDiagramBar1;
    private javax.swing.JTextField workoutDiaryDiagramBar1DateTextField;
    private javax.swing.JLabel workoutDiaryDiagramBar2;
    private javax.swing.JTextField workoutDiaryDiagramBar2DateTextField;
    private javax.swing.JLabel workoutDiaryDiagramBar3;
    private javax.swing.JTextField workoutDiaryDiagramBar3DateTextField;
    private javax.swing.JLabel workoutDiaryDiagramBar4;
    private javax.swing.JTextField workoutDiaryDiagramBar4DateTextField;
    private javax.swing.JLabel workoutDiaryDiagramBar5;
    private javax.swing.JTextField workoutDiaryDiagramBar5DateTextField;
    private javax.swing.JLabel workoutDiaryDiagramBar6;
    private javax.swing.JTextField workoutDiaryDiagramBar6DateTextField;
    private javax.swing.JLabel workoutDiaryDiagramBar7;
    private javax.swing.JTextField workoutDiaryDiagramBar7DateTextField;
    private javax.swing.JLabel workoutDiaryDiagramKcalText;
    private javax.swing.JPanel workoutDiaryDiagramPanel;
    private javax.swing.JLabel workoutDiaryDiagramText;
    private javax.swing.JPanel workoutDiaryPanel;
    private javax.swing.JPanel workoutStatsPanel;
    // End of variables declaration//GEN-END:variables
}
