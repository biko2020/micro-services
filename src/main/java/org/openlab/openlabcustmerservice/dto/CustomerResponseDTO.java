// ceer un objet DTO Response
package org.openlab.openlabcustmerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@AllArgsConstructor

public class CustomerResponseDTO {
    private int id;
    private String name;
    private String email;

    public CustomerResponseDTO(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}


