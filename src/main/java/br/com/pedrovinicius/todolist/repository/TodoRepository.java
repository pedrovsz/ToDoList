package br.com.pedrovinicius.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedrovinicius.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
