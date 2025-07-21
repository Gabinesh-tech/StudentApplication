package com.student;

import com.student.model.Student;
import com.student.repository.StudentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class StudentControllerTest {

   /* @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void testCreateStudent() throws Exception {
        Student student = new Student("John", "john@example.com", 23);

        mockMvc.perform(post("/api/students")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(student)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("John"));
    }

    @Test
    void testGetAllStudents() throws Exception {
        mockMvc.perform(get("/api/students"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    void testGetStudentById_NotFound() throws Exception {
        mockMvc.perform(get("/api/students/999"))
                .andExpect(status().isNotFound());
    }

    @Test
    void testUpdateStudent() throws Exception {
        Student student = studentRepository.save(new Student("Jane", "jane@example.com", 22));
        student.setName("Jane Updated");

        mockMvc.perform(put("/api/students/" + student.getId())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(student)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Jane Updated"));
    }

    @Test
    void testDeleteStudent() throws Exception {
        Student student = studentRepository.save(new Student("Mark", "mark@example.com", 25));

        mockMvc.perform(delete("/api/students/" + student.getId()))
                .andExpect(status().isNoContent());
    }*/
}
