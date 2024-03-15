package org.pinsoft.interview.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
    private Long id;
    public String name;
    public String surname;
    public String nick;
}
