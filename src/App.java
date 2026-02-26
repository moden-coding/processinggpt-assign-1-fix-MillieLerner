import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }
    public void setting(){
        size(400,400);
    }
    public void setup(){
        background(20,150,80);
        fill(90,82,100);
        stroke(255);
        strokeWeight(2);
        ellipse(50,50,50,50);
        fill(255,255,255);
        stroke(0);
        strokeWeight(9);
        rect(1,1,15,15);

        strokeWeight(4);
        line(16,16,200,200);
    }
    }

