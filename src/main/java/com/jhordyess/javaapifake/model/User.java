package com.jhordyess.javaapifake.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private String username;
  private String fullName;
  private String phoneNumber;
  private Timestamp birthDate;

}
