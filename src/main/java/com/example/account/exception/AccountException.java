package com.example.account.exception;

import com.example.account.type.ErrorCode;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountException extends RuntimeException{
    private ErrorCode errorCode;
    private String erorMassage;

    public AccountException(ErrorCode errorCode) {
        this.errorCode = errorCode;
        this.erorMassage = errorCode.getDescription();
    }
}
