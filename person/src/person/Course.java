package person;

public class Course {
	protected String levelofstudy,coursecode,coursename;
	protected double ects;
	protected String languageofistruction,offeredsemester,coordinator;
	
	public Course(String levelofstudy, String coursecode, String coursename, double ects,
			String languageofistruction, String offeredsemester, String coordinator) {
		this.levelofstudy = levelofstudy;
		this.coursecode = coursecode;
		this.coursename = coursename;
		this.ects = ects;
		this.languageofistruction = languageofistruction;
		this.offeredsemester = offeredsemester;
		this.coordinator = coordinator;
	}

	protected String getLevelofstudy() {
		return levelofstudy;
	}

	protected void setLevelofstudy(String levelofstudy) {
		this.levelofstudy = levelofstudy;
	}

	protected String getCoursecode() {
		return coursecode;
	}

	protected void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}

	protected String getCoursename() {
		return coursename;
	}

	protected void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	protected double getEcts() {
		return ects;
	}

	protected void setEcts(double ects) {
		this.ects = ects;
	}

	protected String getLanguageofistruction() {
		return languageofistruction;
	}

	protected void setLanguageofistruction(String languageofistruction) {
		this.languageofistruction = languageofistruction;
	}

	protected String getOfferedsemester() {
		return offeredsemester;
	}

	protected void setOfferedsemester(String offeredsemester) {
		this.offeredsemester = offeredsemester;
	}

	protected String getCoordinator() {
		return coordinator;
	}

	protected void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}
	
	
public Course() {}

public String toString() {
	return coursename;
}
}
