package com.omkar.resumeanalyzer1.repository;

import com.omkar.resumeanalyzer1.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepository
        extends JpaRepository<Resume, Long> {

}