package com.micro.school;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer schoolId;
    private String name;
    private String email;
}
