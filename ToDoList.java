package com.may14;

public class ToDoList {
	private String title;			
	private String description;	        
	private String priority	;
	boolean mar=false;
	public ToDoList(String title, String description, String priority,boolean mar) {
		
		super();
		if(title.isEmpty()) {
			System.err.println("title should present");
			System.exit(0);
		}
		if(description.isEmpty()) {
			System.err.println("description should present");
			System.exit(0);
		}
		if(title.isEmpty()) {
			System.err.println("priority should present");
			System.exit(0);
		}
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.mar=false;
	}
	public void updateDescription(String newDescription) {
		 this.description=newDescription;
		
	}
	public void updatePriority(String newPriority) {
		this.priority=newPriority;
		
	}
	public void markAsCompleted() {
		 
		this.mar=false;
		
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return  description ;
	}
	public String getPriority() {
		return  priority ;
		
	}
	public boolean taskComplited() {
	   return mar=false;
	}
	
	
	


}
