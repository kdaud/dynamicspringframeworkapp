package com.concept.patientword;


public class Doctor {
	
	private Hospital welcomeNote;
	
	public void setWelcomeNote(Hospital welcomeNote) {
		this.welcomeNote = welcomeNote;
	}
	
	public void printDoctorMetadata() {
		welcomeNote.myMedicationStatus();
	}

}
