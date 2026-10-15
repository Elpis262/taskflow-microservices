   package com.example.project_service.controller;

   import com.example.project_service.model.Project;
   import com.example.project_service.repository.ProjectRepository;
   import org.springframework.web.bind.annotation.*;
   import java.util.List;

   @RestController
   @RequestMapping("/api/projects")
   public class ProjectController {

       private final ProjectRepository projectRepository;

       public ProjectController(ProjectRepository projectRepository) {
           this.projectRepository = projectRepository;
       }

       @PostMapping
       public Project createProject(@RequestBody Project project) {
           return projectRepository.save(project);
       }

       @GetMapping
       public List<Project> getAllProjects() {
           return projectRepository.findAll();
       }
   }