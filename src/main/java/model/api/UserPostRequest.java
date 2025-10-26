package model.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data               // Generates getters, setters, toString(), equals(), hashCode()
@Builder (toBuilder = true)// Allows creating objects with fluent syntax
@NoArgsConstructor  // Generates a no-argument constructor
@AllArgsConstructor
public class UserPostRequest {
    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private int userStatus;
}
