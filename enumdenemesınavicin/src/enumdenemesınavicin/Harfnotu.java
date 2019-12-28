package enumdenemesýnavicin;

public enum Harfnotu {
	AA(4),BA(3.5),BB(3),CB(2.5),CC(2),F(0);
	


    public double numVal;
    
    Harfnotu(double numVal) {
        this.numVal = numVal;
    }

    public double getNumVal() {
        return numVal;
    }

}
