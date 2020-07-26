package com.forum.units;

public class Question extends AbstractEntity {


	private String title;
	private String message;

	private User user;
	private int upvoteCount = 0;
	private static Long lastEntry = 0L;

	public void autoGenerateId() {
		lastEntry = lastEntry + 1L;
		super.setId(lastEntry);
	}
	public String getTitle() {

		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {

		return message ;
	}

	public void setMessage(String message) {

		this.message = message;
	}
	public User getUser() {

		return user ;
	}


	public void setUser(User user) {

		this.user = user ;
	}
	public int getUpvoteCount() {

		return upvoteCount;
	}
	public void increaseUpvoteCount() {
		upvoteCount += 1;
		
	}

}
