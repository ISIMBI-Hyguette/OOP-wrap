public class Box {
    private int width;
    private int height;
    private int depth;

    public int volume(){
       // int volume=width*height*depth;
        return width*height*depth;
    }
    public Box(){

    }
    public Box(int width,int height,int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;

    }
    public Box(int width,int height){
        this.width=width;
        this.height=height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
