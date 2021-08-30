class Name{
	private First;
	private Middle;
	private Last;

	public Name(String theFirst, String theMiddle, String theLast){
	First = theFirst;
	Middle = theMiddle;
	Last = theLast;
	}

public Name(String theFirst, String thelastName){
	First = theFirst;
	Middle = "" ;
	Last = theLast;
	}

	public String getFirst{
	return First;
	}
	public String getMiddle{
	return Middle;
	}
	public String getLast{
	return Last;
	}
	public static void setFirst(String theFirst){
	First = theFirst;
	}
	public static void setMiddle(String theMiddle){
	Middle = theMiddle;
	}
	public static void setLast(String theLast){
	Last = theLast;
	}

}