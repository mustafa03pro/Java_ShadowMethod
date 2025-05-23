package com.may14;

public class ToDoListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToDoList t1=new ToDoList("harry", "pottre", "high",false);
		
		t1.updateDescription("this is agood book");
		t1.updatePriority("low");
		t1.markAsCompleted();
		System.out.println("task titel"+t1.getTitle());
		System.out.println("task description"+t1.getDescription());
		System.out.println("task priority"+t1.getPriority());
		System.out.println("the task complited?"+t1.taskComplited());

	}

}
