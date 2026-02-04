public class PointTwoD{
private float x=0.0f;
private float y=0.0f;

public PointTwoD(float x,float y){
this.x=x;
this.y=y;
}

public PointTwoD(){
}

public float getX(){
return x;
}

public void setX(float x){
this.x=x;
}

public float getY(){
return y;
}

public void setY(float y){
this.y=y;
}

public void setXY(float x, float y){
this.x=x;
this.y=y;
}

public float[] getXY(){
return  new float[]{x,y};
}

public void getPointTwoDDetails(){
System.out.println("x :"+x);
System.out.println("y :"+y);
float arr[]=getXY();
System.out.println("x and y :"+arr[0]+", "+arr[1]);
}
}