import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UniversityAdmissionTest {
	
	private UniversityAdmission testAdmissionBoundary;
	
	@BeforeEach
	public void setUp() {
		testAdmissionBoundary = new UniversityAdmission();
	}
	
	@AfterEach
	public void tearDown() {
		testAdmissionBoundary = null;
	}
	
	//Equivalence class checkStudentForm6Notes()
	
	@Test
	public void checkStudentForm6Notes_validClass() {
		UniversityAdmission testAdmissionValidClass = new UniversityAdmission();
		Assertions.assertTrue(testAdmissionValidClass.checkStudentForm6Notes(90));
	}
	
	@Test
	public void checkStudentForm6Notes_inValidClassBigger100() {
		UniversityAdmission testAdmissionInvalidClassBigger100 = new UniversityAdmission();
		Assertions.assertFalse(testAdmissionInvalidClassBigger100.checkStudentForm6Notes(150));
	}
	
	@Test
	public void checkStudentForm6Notes_inValidClassLess80() {
		UniversityAdmission testAdmissionInvalidClassLess80 = new UniversityAdmission();
		Assertions.assertFalse(testAdmissionInvalidClassLess80.checkStudentForm6Notes(70));
		
	}
	
	//Boundary Value Analysis checkStudentForm6Notes()
	
	@Test
	public void checkStudentForm6Notes_BoundaryValue79() {
		Assertions.assertFalse(testAdmissionBoundary.checkStudentForm6Notes(79));
	}
	
	@Test
	public void checkStudentForm6Notes_BoundaryValue80() {
		Assertions.assertFalse(testAdmissionBoundary.checkStudentForm6Notes(80));
	}
	
	@Test
	public void checkStudentForm6Notes_BoundaryValue81() {
		Assertions.assertTrue(testAdmissionBoundary.checkStudentForm6Notes(81));
	}
	
	@Test
	public void checkStudentForm6Notes_BoundaryValue99() {
		Assertions.assertTrue(testAdmissionBoundary.checkStudentForm6Notes(99));
	}
	
	@Test
	public void checkStudentForm6Notes_BoundaryValue100() {
		Assertions.assertTrue(testAdmissionBoundary.checkStudentForm6Notes(100));
	}
	
	@Test
	public void checkStudentForm6Notes_BoundaryValue101() {
		Assertions.assertFalse(testAdmissionBoundary.checkStudentForm6Notes(101));
	}
	
	//checkSchoolFeesPaid()
	
	@Test
	public void checkSchoolFeesPaid_True() {
		testAdmissionBoundary.setForm6Note(90);
		testAdmissionBoundary.setIsSchoolFeesPaid(true);
		Assertions.assertTrue(testAdmissionBoundary.checkSchoolFeesPaid());
	}
	
	@Test
	public void checkSchoolFeesPaid_False() {
		testAdmissionBoundary.setForm6Note(90);
		testAdmissionBoundary.setIsSchoolFeesPaid(false);
		Assertions.assertFalse(testAdmissionBoundary.checkSchoolFeesPaid());
	}
	
	
//	//Decision Table -  checkAdmission()
//
//	@Test
//	public void checkAdmission_DecisionTableTT() {
//		UniversityAdmission testAdmissionDecisionTable = new UniversityAdmission();
//		testAdmissionDecisionTable.setForm6Note(90);
//		testAdmissionDecisionTable.setIsSchoolFeesPaid(true);
//		Assertions.assertTrue(testAdmissionDecisionTable.checkUniversityAdmission());
//	}
//	
//	@Test
//	public void checkAdmission_DecisionTableTF() {
//		UniversityAdmission testAdmissionDecisionTable = new UniversityAdmission();
//		testAdmissionDecisionTable.setForm6Note(90);
//		testAdmissionDecisionTable.setIsSchoolFeesPaid(false);
//		Assertions.assertFalse(testAdmissionDecisionTable.checkUniversityAdmission());
//	}
//	
//	@Test
//	public void checkAdmission_DecisionTableFT() {
//		UniversityAdmission testAdmissionDecisionTable = new UniversityAdmission();
//		testAdmissionDecisionTable.setForm6Note(64);
//		testAdmissionDecisionTable.setIsSchoolFeesPaid(true);
//		Assertions.assertFalse(testAdmissionDecisionTable.checkUniversityAdmission());
//	}
	

}
