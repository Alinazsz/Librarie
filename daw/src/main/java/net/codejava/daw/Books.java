package net.codejava.daw;

import java.util.Currency;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Books{
		private Long Id;
		private String NumeCarte;
		private String NumeAutor;
		private String Editura;
		private Float Pret;
		
		protected Books() {
			super();
		}
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		public Long getId() {
			return Id;
		}
		public void setId(Long Id) {
			this.Id=Id;
		}
		public String getNumeCarte() {
			return NumeCarte;
		}
		public void setNumeCarte(String NumeCarte) {
			this.NumeCarte=NumeCarte;
		}
		public String getNumeAutor() {
			return NumeAutor;
		}
		public void setNumeAutor(String NumeAutor) {
			this.NumeAutor=NumeAutor;
		}
		public String getEditura() {
			return Editura;
		}
		public void setEditura(String Editura) {
			this.Editura=Editura;
		}
		public Float getPret() {
			return Pret;
		}
		public void setPret(Float Pret) {
			this.Pret=Pret;
		}

	}
