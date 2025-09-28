package com.user.usersignin.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_data")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String name;
  private String email;
  private String password;
}
