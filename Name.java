public class Name{
	private String first;
	private String middle;
	private String last;

	public Name(String theFirst, String theMiddle, String theLast){
		first = theFirst;
		middle = theMiddle;
		last = theLast;
	}

	public Name(String theFirst, String thelastName){
		first = theFirst;
		middle = "";
		last = thelastName;
	}

	public String getFirst(){
		return first;
	}
	public String getMiddle(){
		return middle;
	}
	public String getLast(){
		return last;
	}
	public void setFirst(String theFirst){
		first = theFirst;
	}
	public void setMiddle(String theMiddle){
		middle = theMiddle;
	}
	public void setLast(String theLast){
		last = theLast;
	}

	public String toString(){
		if(middle.isEmpty()){
			return first + " " + last;
		}else{
			return first + " " + middle + " " + last;
		}
	}

}