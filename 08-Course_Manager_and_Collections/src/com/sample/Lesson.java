package com.sample;

public class Lesson implements Comparable<Lesson> {

	private String title;
	private int time;

	public Lesson(String title, int time) {
		this.title = title;
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public int getTime() {
		return time;
	}
	
	//Overriding the toString method
	@Override
	public String toString() {
		return "[Lesson: " + this.title + ", " + this.time + " minutes]";
	}

	/*
	 * This sets what should be compared between 2 Lessons
	 * 
	 * Which in this case is the title
	 */
	@Override
	public int compareTo(Lesson anotherLesson) {
		return this.title.compareTo(anotherLesson.getTitle());
	}
}
