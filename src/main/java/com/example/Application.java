package com.example;

import com.example.controller.NoteController;
import com.example.entity.Note;
import com.example.services.NoteService;
import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {


	@SneakyThrows
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//		NoteService ns = new NoteService();
//		Note note1 = new Note(1L, "NOTE-1", "It's note 1 content");
//		Note note2 = new Note(2L, "NOTE-2", "It's note 2 content");
//		Note note3 = new Note(3L, "NOTE-3", "It's note 3 content");
//		Note note4 = new Note(4L, "NOTE-4", "It's note 4 content");
//		Note note5 = new Note(5L, "NOTE-5", "It's note 5 content");
//		Note noteUpdate = new Note(2L, "NOTE-2Updated", "It's note 2 updated content");
//
////add note to list
//		System.out.println("new NoteService().add(note) = " + ns.add(note1));
//		System.out.println("new NoteService().add(note) = " + ns.add(note2));
//		System.out.println("new NoteService().add(note) = " + ns.add(note3));
//		System.out.println("new NoteService().add(note) = " + ns.add(note4));
//		System.out.println("new NoteService().add(note) = " + ns.add(note5));
//
//
////show all notes
//		System.out.println("ns.listAll() = " + ns.listAll());
////show note by id
//		System.out.println("ns.getById(2l) = " + ns.getById(2L));
////delete note by id
//		ns.deleteById(1L);
//		System.out.println("ns.listAll() = " + ns.listAll());
////update note
//		ns.update(noteUpdate);
//		System.out.println("ns.getById(2l) = " + ns.getById(2L));


	}

}






