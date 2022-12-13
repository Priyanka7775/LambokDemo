package org.example;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private String studentName;
    private String studentAddress;
    private double studentMarks;

}
