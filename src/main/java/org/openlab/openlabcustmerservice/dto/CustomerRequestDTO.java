// ceer un objet DTO request
package org.openlab.openlabcustmerservice.dto;





import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@AllArgsConstructor

public class CustomerRequestDTO {

    private int id;
    private String name;
    private String email;

    public CustomerRequestDTO(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}


