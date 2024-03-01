public class BouncingBall {
    public static void main(String[] args) {
    // initializes the canvas and the ball’s values... (previous slide)
    // main animation loop
    while (true) {
    // if the ball hits the wall, update the velocity
    // according to law of elastic collision
    if (Math.abs(x + vx) > 1.0 - radius) vx = -vx;
    if (Math.abs(y + vy) > 1.0 - radius) vy = -vy;
    // updates ball’s position
    x = x + vx;
    y = y + vy;
    // clears the canvas, and re-draws the ball
    StdDraw.clear(StdDraw.LIGHT_GRAY);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.filledCircle(x, y, radius);
    // copies offscreen buffer to onscreen, and pauses briefly
    StdDraw.show();
    StdDraw.pause(20);
    }
    }
    }