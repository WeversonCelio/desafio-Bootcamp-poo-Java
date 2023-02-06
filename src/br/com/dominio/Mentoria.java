package br.com.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
        private LocalDate date = LocalDate.now();

        public Mentoria(String titulo, String descricao) {
            super(titulo, descricao);
             
        }

        @Override
        public double calcularXp() {
            // TODO Auto-generated method stub
            return XP_PADRAO +5;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() +", date=" + date + "]";
        }

      
      

        

      
        

        
        
        
        

}
