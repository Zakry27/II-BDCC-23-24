package org.sid.chatbotrag.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
    @Id @GeneratedValue
    private Long id ;
    @Size(min = 4 , max = 100)
    private String name ;
    @Email
    private String email ;
}
