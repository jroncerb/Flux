package com.nttdata.recativeThymeleaf;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class PersonListController {

	@GetMapping(path="/persona-list-1")
	public Flux<Person>PersonList1(){
	Flux<Person>flux1 = Flux.just(new Person("Raul","Gonzalez",7)).delayElements(Duration.ofSeconds(5));	
	return flux1;
	}

	@GetMapping(path="/persona-list-2")
	public Flux<Person>PersonList2(){
	Flux<Person>flux2 = Flux.just(new Person("Zinedine","zidane",5)).delayElements(Duration.ofSeconds(5));	
	return flux2;
	}
	@GetMapping(path="/persona-list-3")
	public Flux<Person>PersonList3(){
	Flux<Person>flux3 = Flux.just(new Person("Karím","Benzema",9)).delayElements(Duration.ofSeconds(5));	
	return flux3;
	}
	@GetMapping(path="/persona-list-4")
	public Flux<Person>PersonList4(){
	Flux<Person>flux4 = Flux.just(new Person("Iker","Casillas",1)).delayElements(Duration.ofSeconds(5));	
	return flux4;
	}

}
