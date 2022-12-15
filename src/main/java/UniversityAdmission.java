
public class UniversityAdmission {
	
	private int form6Note = 0;
	private boolean IsSchoolFeesPaid = true;
	
	
	public boolean checkStudentForm6Notes(int form6Note) {
		if(form6Note > 80 && form6Note <= 100) {
		
			return true;
		}
		else 
			return false;
	}
	
	public boolean checkSchoolFeesPaid() {
		return IsSchoolFeesPaid;
	}

	public boolean checkUniversityAdmission() {
		return checkStudentForm6Notes(form6Note) && checkSchoolFeesPaid();
	}

//	public int getForm6Note() {
//		return form6Note;
//	}

	public void setForm6Note(int form6Note) {
		this.form6Note = form6Note;
	}

//	public boolean isCheckSchoolFeesPaid() {
//		return IsSchoolFeesPaid;
//	}

	public void setIsSchoolFeesPaid(boolean IsSchoolFeesPaid) {
		this.IsSchoolFeesPaid = IsSchoolFeesPaid;
	}
}
