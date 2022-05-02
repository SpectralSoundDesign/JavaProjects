package gamelist;

public class Games {
	

	private String title;
	private String platform;
	private int releaseDate;
	private char ageRating;
	private int reviewScore;
	private int numberOfGames;
	
	public Games(String title, String platform, int releaseDate, char ageRating, int reviewScore) {
		super();
		this.title = title;
		this.platform = platform;
		this.releaseDate = releaseDate;
		this.ageRating = ageRating;
		this.reviewScore = reviewScore;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public char getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(char ageRating) {
		this.ageRating = ageRating;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	
	

	@Override
	public String toString() {
		return "Title: " + title + "\n" + "Platform: " + platform + "\n" + "Release Date: " + releaseDate + "\n" + "Age Rating: "
				+ ageRating + "\n" + "Review Score: " + reviewScore + "\n";
	}
	
	
	public void displayProgram() {
	
	
		
	System.out.println("=============================");
	System.out.println("Virtual Video Game Collection");
	System.out.println("=============================");
	
	
	
	
	}
	
	
	
	

}
