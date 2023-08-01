package tw.ycw.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controller {
    @Value("${server.name}")
    private String serverName;

    @GetMapping("/check_server")
    public HttpEntity<String> get(HttpServletResponse response) {
        Cookie cookie = new Cookie("myCookie", serverName);
        response.addCookie(cookie);
        return ResponseEntity.ok().body(serverName);
    }
}