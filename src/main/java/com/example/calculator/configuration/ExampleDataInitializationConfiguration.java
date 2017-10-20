package com.example.calculator.configuration;

import com.example.calculator.domain.entity.JournalRecord;
import com.example.calculator.domain.repository.JournalRecordRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.UUID;

@Configuration
public class ExampleDataInitializationConfiguration {
    @Bean
    InitializingBean prepareData(final JournalRecordRepository journalRepository) {
        return () -> {
            journalRepository.save(new JournalRecord(null, new Date(), "<h1>Title 1</h1>: Memo " + UUID.randomUUID()));
            journalRepository.save(new JournalRecord(null, new Date(), "<h1>Title 2</h1>: Memo " + UUID.randomUUID()));
            journalRepository.save(new JournalRecord(null, new Date(), "<h1>Title 3</h1>: Memo " + UUID.randomUUID()));
            journalRepository.save(new JournalRecord(null, new Date(), "<h1>Title 4</h1>: Memo " + UUID.randomUUID()));
            journalRepository.save(new JournalRecord(null, new Date(), "<h1>Title 5</h1>: Memo " + UUID.randomUUID()));
            journalRepository.save(new JournalRecord(null, new Date(), "<h1>Title 6</h1>: Memo " + UUID.randomUUID()));
        };
    }
}
