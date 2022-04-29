package ar.edu.um.qrsec.qrsecbackend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Guest {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String dni;
    private String phone;

}