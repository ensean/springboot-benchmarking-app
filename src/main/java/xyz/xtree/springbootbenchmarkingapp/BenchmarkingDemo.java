package xyz.xtree.springbootbenchmarkingapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BenchmarkingDemo {
    @GetMapping("/echo")
    public String echo() {
        return "Hello World";
    }

    @GetMapping("/pi/{steps}")
    public int calcPi(String steps) {

        return Integer.parseInt(steps);
    }
}
