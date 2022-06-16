package com.example.solidbankapp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Column(value = "id")
    private @Id int id;
    @Column(value = "username")
    private String username;
    @Column(value = "user_password")
    private String password;
    @Column(value = "role_id")
    private int role_id;


//    @Override
//    public String toString() {
//
//        return "Account{" +
//                ", id='" + id + '\'' +
//                ", clientID='" + clientId + '\'' +
//                ", balance=" + balance +
//                '}';
//    }
}
