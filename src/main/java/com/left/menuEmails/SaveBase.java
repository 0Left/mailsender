package com.left.menuEmails;

import java.util.ArrayList;

public class SaveBase {
    private ArrayList<EmailInfos> emailList;

    public SaveBase() {
        this.emailList = new ArrayList<>();
    }

    public void addEmail(EmailInfos email) {
        // Implemente a lógica para adicionar um email
    }

    public void removeEmail(int id) {
        // Implemente a lógica para remover um email por ID
    }

    public void editEmail(int id, EmailInfos newEmail) {
        // Implemente a lógica para editar um email por ID
    }

    public void displayEmails() {
        // Implemente a lógica para exibir a lista de emails
    }
}
