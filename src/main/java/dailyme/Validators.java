package dailyme;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class Validators {
    protected void lettersVal(java.awt.event.KeyEvent evt, JTextField field) {
        String fieldString = field.getText();
        int fieldStringLength = fieldString.length();
        if((evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z') 
                || (evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z')) {
            if(fieldStringLength < 35) {
                field.setEditable(true);
            }
            else {
                field.setEditable(false);
            }
        }
        else {
            if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                field.setEditable(true);
            }
            else {
                field.setEditable(false);
            }
        }
    }
    
    protected void lettersAndNumbersVal(java.awt.event.KeyEvent evt, JTextField field) {
        String fieldString = field.getText();
        int fieldStringLength = fieldString.length();
        if((evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z') 
                || (evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || evt.getKeyChar() == ' ') {
            if(fieldStringLength < 35) {
                field.setEditable(true);
            }
            else {
                field.setEditable(false);
            }
        }
        else {
            if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                field.setEditable(true);
            }
            else {
                field.setEditable(false);
            }
        }
    }
    
    protected void limitCharVal(java.awt.event.KeyEvent evt, JTextField field) {
        String fieldString = field.getText();
        int fieldStringLength = fieldString.length();
        if((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z') 
                || (evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || evt.getKeyChar() == '@' || evt.getKeyChar() == '.' 
                || evt.getKeyChar() == '-' || evt.getKeyChar() == '_' || evt.getKeyChar() == '!' || evt.getKeyChar() == '$' || evt.getKeyChar() == '#') {
            if(fieldStringLength < 35) {
                field.setEditable(true);
            }
            else {
                field.setEditable(false);
            }
        }
        else {
            if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                field.setEditable(true);
            }
            else {
                field.setEditable(false);
            }
        }
    }
    
    protected void intNumberVal(java.awt.event.KeyEvent evt, JTextField field) {
        String fieldString = field.getText();
        int fieldStringLength = fieldString.length();
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if(fieldStringLength < 3) {
                field.setEditable(true);
            }
            else {
                field.setEditable(false);
            }
        }
        else {
            if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                field.setEditable(true);
            }
            else {
                field.setEditable(false);
            }
        }
    }
    
    protected void floatNumberVal(java.awt.event.KeyEvent evt, JTextField field) {
        String fieldString = field.getText();
        int fieldStringLength = fieldString.length();
        if((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || evt.getKeyChar() == '.') {
            if(fieldStringLength < 5) {
                field.setEditable(true);
            }
            else {
                field.setEditable(false);
            }
        }
        else {
            if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                field.setEditable(true);
            }
            else {
                field.setEditable(false);
            }
        }
    }
}
