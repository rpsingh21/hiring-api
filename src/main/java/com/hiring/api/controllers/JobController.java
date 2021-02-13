package com.hiring.api.controllers;

import com.hiring.api.models.Job;
import com.hiring.api.repositories.JobRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/jobs")
public class JobController {
    final JobRepository jobRepository;
    public JobController(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @GetMapping("")
    public List<Job> listJob() {
        return jobRepository.findAll();
    }
}
