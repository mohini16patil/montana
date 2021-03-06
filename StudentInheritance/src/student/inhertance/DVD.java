package student.inhertance;

// Define your DVD class here, as a subclass of Item.
enum Genre {
	U("Universal"),
	Y("Youth"), 
	A("Adult"),
	C("Children"), 
	F("Fiction"), 
	NF("Non-Fiction");
	
	public String type;
	Genre(String type)
	{
		this.type = type;
	}

	
};

public class DVD extends Item {

	int playingTime;
	Genre genre;

	DVD(String Title, Genre genre, int playingTime) {
		super(Title);
		this.playingTime = playingTime;
		this.genre = genre;
	}

	@override
	public boolean canBeBorrowedBy(Member mem) {
		if (this.genre == Genre.Y && mem.getAge() < 12)
			return false;
		if (this.genre == Genre.A && mem.getAge() < 18)
			return false;
		else{return true;}
	}
	
	@override
	public String toString()
	{
		StringBuilder ret = new StringBuilder();
		ret.append(super.toString());
		ret.append("\n Genre: "+ this.genre.type);
		ret.append("\n Playing time :"+ this.playingTime);
		return ret.toString();
	}
}