package GUISwing.login_system_app;

public class Main {
    public static void main(String[] args) {


        IDandPasswords idandPasswords = new IDandPasswords();

        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());




    }
}
