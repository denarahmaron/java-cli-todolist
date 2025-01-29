package test.view;

import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;
import view.TodolistView;

public class TodolistViewTest {
    public static void main(String[] args) {
        testShowTodolist();
    }

    public static void testShowTodolist(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addTodolist("Belajar JAVA");
        todolistService.addTodolist("Belajar OOP");

        todolistView.showTodolist();
    }
}
