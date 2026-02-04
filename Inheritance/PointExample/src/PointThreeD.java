public class PointThreeD extends PointTwoD{
private float z=0.0f;

public PointThreeD(float x, float y, float z){
super(x,y);
this.z=z;
}

public PointThreeD(){
}

public float getZ(){
return z;
}

public void setZ(float z){
this.z=z;
}


public void setXYZ(float x,  float y, float z){
setXY(x,y);
this.z=z;
}

public float[] getXYZ(){
return new float[]{getX(), getY(),z};
}

public void getPointThreeDDetails(){
System.out.println("x :"+getX());
System.out.println("y :"+getY());
float arr[]=getXYZ();
System.out.println("X, Y, Z :"+arr[0]+", "+arr[1]+", "+arr[2]);
}
}