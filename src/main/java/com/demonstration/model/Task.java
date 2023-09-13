package com.demonstration.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Task extends Audit {

	 	@NotNull
	    private String title;
	 	@Column(nullable = false)
	    private boolean completed;
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public boolean isCompleted() {
			return completed;
		}
		public void setCompleted(boolean completed) {
			this.completed = completed;
		}
		public Task( @NotNull String title, boolean completed) {
			super();
			this.title = title;
			this.completed = completed;
		}
		public Task() {
			super();
			// TODO Auto-generated constructor stub
		}
	 	

}
