package classroomsize;

public enum harfnotu {	
	AA(4),BA(3.5),BB(3),CB(2.5),CC(2),F(0);
	


    public double numVal;
    
    harfnotu(double numVal) {
        this.numVal = numVal;
    }

    public double getNumVal() {
        return numVal;
    }

}
