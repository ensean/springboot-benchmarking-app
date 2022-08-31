package xyz.xtree.springbootbenchmarkingapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BenchmarkingDemo {

    private static double monteCarlo(int n) {
        int insidePoints = 0;//在圆中的点个数
        int totalPoints = n;//在正方形中点个数
        int R = 100;//圆半径
        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * (2 * R));
            int y = (int) (Math.random() * (2 * R));
            if (contain(x, y, R)) {
                insidePoints++;
            }
        }
        return 4 * 1.0 * insidePoints / totalPoints;
    }

    private static boolean contain(int x, int y, int R) {
        return Math.pow(x - R, 2) + Math.pow(y - R, 2) <= R * R;
    }
    

    @GetMapping("/echo")
    public String echo() {
        return "Hello World";
    }

    @GetMapping("/pi")
    /**
     * 蒙特卡罗计算PI
     * param: steps, 蒙特卡罗步数
     */
    public double calcPi(String steps) {
        int intSteps = Integer.parseInt(steps);
        return monteCarlo(intSteps);
    }
}
