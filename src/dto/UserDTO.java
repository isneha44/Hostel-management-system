package dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class UserDTO {

    private String userName;
    private String contact;
    private String email;
    private String password;
}
