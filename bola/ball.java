package bola;

public class ball{
    private String color;
    private int size;
    private Boolean moveStatus;
        

        public void moveStatus(){
            moveStatus = true;
            System.out.println("The ball is moving");
        }

        public void stop(){
            moveStatus = false;
            System.out.println("The ball has stopped");
        }

        public void showColor(){
            System.out.println("The ball is " + color);
        }

        public void showSize(){
            System.out.println("The ball is " + size);
        }

        public void showMoveStatus(){
            String moveStatus = this.moveStatus ? "moving" : "stopped";
            System.out.println("The ball is " + moveStatus);
        }

        // constructor
        public ball(String color, int size, Boolean moveStatus){
            this.color = color;
            this.size = size;
            this.moveStatus = moveStatus;
        }

        public static void main(String[] args){
            ball ball1 = new ball("red", 10, false);
            ball1.showColor();
            ball1.showSize();
            ball1.showMoveStatus();
            ball1.moveStatus();
            ball1.showMoveStatus();
            ball1.stop();
            ball1.showMoveStatus();
        }

    }