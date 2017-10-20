package com.example.calculator.domain.repository;

import com.example.calculator.domain.entity.JournalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRecordRepository extends JpaRepository<JournalRecord, Long> {
}
