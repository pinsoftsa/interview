package org.pinsoft.interview.domain.repo.entity;

import org.pinsoft.interview.domain.dto.UserDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    public String name;

    @Column
    public String surname;

    @Column
    public String nick;

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity fromDto(UserDto dto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(dto.getId());
        userEntity.setName(dto.getName());
        userEntity.setSurname(dto.getSurname());
        userEntity.setNick(dto.getNick());
        return userEntity;
    }

    public UserDto toDto() {
        return UserDto.builder()
                .id(this.id)
                .name(this.name)
                .surname(this.surname)
                .nick(this.nick)
                .build();
    }
}
