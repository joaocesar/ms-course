package br.dev.jcp.hrworker.repositories;

import br.dev.jcp.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
