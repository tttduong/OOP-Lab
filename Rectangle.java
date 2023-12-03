public class Rectangle {
    private float width, length;
    public Rectangle (float width, float length){
        if (width < 0){
            System.out.println("Error!");
            this.width = 1;
        }
        else {
            this.width = width;
        }

        if (width < 0){
            System.out.println("Error!");
            this.length = 1;
        }
        else {
            this.length = length;
        }

    }

    public float getWidth(){
        return this.width;
    }
    public float getLength(){
        return this.length;
    }

    public void visualize(){
        for (int i = 0 ; i < width; i++) {
            for (int j = 0 ; j < length; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
    }
}
