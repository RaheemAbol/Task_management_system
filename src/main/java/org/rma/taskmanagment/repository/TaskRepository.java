package org.rma.taskmanagment.repository;


import org.rma.taskmanagment.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
