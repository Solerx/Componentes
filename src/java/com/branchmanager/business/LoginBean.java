/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.branchmanager.business;

import com.branchmanager.entity.Company;
import com.branchmanager.entity.User;
import com.branchmanagerdData.CompanyData;
import com.branchmanagerdData.UserData;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author Soler
 */
@ManagedBean(name = "LOGINBEAN")
@SessionScoped

public class LoginBean {

    private String msgError;
    private boolean msg = false;
    private User logginUser = new User();
    private User loggedUser = new User();
    private Company userCompany = new Company();
    
    public LoginBean() {

    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }

    public Company getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(Company userCompany) {
        this.userCompany = userCompany;
    }
    
    public User getLogginUser() {
        return logginUser;
    }

    public void setLogginUser(User logginUser) {
        this.logginUser = logginUser;
    }

    
    
    public String getMsgError() {
        return msgError;
    }

    public void setMsgError(String msgError) {
        this.msgError = msgError;
    }


    public boolean isMsg() {
        return msg;
    }

    public void setMsg(boolean msg) {
        this.msg = msg;
    }

    public String verifyUser() {

        String url = "";

        UserData ud = new UserData();
        CompanyData cd = new CompanyData();
        
        User u = ud.getUserByEmail(logginUser.getEmail());
        
            if (u != null) {
                
                if (u.getPassword().equals(logginUser.getPassword())) {
                    url = "/home.xhtml";
                    msgError = "";
                    loggedUser = u;
                    userCompany = cd.getCompany(u);
                    
                } else {
                    //password incorrecto
                    //url = "/login.xhtml";
                    msgError = "Contraseña incorrecta.";
                    msg = true;
                }
                
            } else {
                //el usuario no existe
                //url = "/login.xhtml";
                msgError = "El usuario no existe.";
                msg = true;
            }
        
        return url;

    }

    //Invalidate session
}
