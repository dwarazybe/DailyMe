package com.mycompany.dailyme;

import javax.swing.JFrame;

public class LogoutSession {
    public static void logout(JFrame context, GUI loginScreen) {
        LoginSession.isLoggedIn = false;
    }
}