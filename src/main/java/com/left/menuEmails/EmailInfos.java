package com.left.menuEmails;

public class EmailInfos {
        private String link;
        private String nomePasso;
        private int id;
    
        public EmailInfos(String link, String nomePasso, int id) {
            this.link = link;
            this.nomePasso = nomePasso;
            this.id = id;
        }
    
        // Métodos getter e setter
    
        public String getLink() {
            return link;
        }
    
        public void setLink(String link) {
            //#TODO Adicionar logica de verificação para passar apenas links google
            //#TODO retornar true ou false se o link foi atualizado
            this.link = link;
        }
    
        public String getNomePasso() {
            return nomePasso;
        }
    
        public void setNomePasso(String nomePasso) {
            this.nomePasso = nomePasso;
        }
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
}
