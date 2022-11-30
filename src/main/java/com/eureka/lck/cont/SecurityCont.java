package com.eureka.lck.cont;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SecurityCont {


    private final PasswordEncoder passwordEncoder;

    @GetMapping("/encrypt_pw")
    private String securityPassword(@RequestParam("pw") String pw) {
        return passwordEncoder.encode(pw);
    }

}
