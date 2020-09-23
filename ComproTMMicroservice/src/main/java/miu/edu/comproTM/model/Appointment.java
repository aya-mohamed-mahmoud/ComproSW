package miu.edu.comproTM.model;

import java.time.LocalDate;

public class Appointment {
   private LocalDate date;
   private boolean isAttendant;

   
   public Appointment() {
	super();
}


public LocalDate getDate() {
	return date;
}


public void setDate(LocalDate date) {
	this.date = date;
}


public boolean isAttendant() {
	return isAttendant;
}


public void setAttendant(boolean isAttendant) {
	this.isAttendant = isAttendant;
}
   
   
}
