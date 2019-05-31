
package finalex2_1;

/**
 *
 * @author APLOMB
 */
public class points {
    public double x;
    public double y;

    public int ID;

    public int clusterClosestTo;

    public points(double x, double y){
        this.x = x;
        this.y = y;
        this.ID = 0;
        this.clusterClosestTo = 0;
    }

    public points(double x, double y, int ID){
        this.x = x;
        this.y = y;
        this.ID = ID;
        this.clusterClosestTo = 0;
    }

    public points distanceTo(points cluster){
        return new points(x - cluster.x, y - cluster.y);
    }

    public double square(){
        return x*x + y*y;
    }

    public void updateWeights(points p, double learningConstant){
        this.x += learningConstant*(p.x - this.x);
        this.y += learningConstant*(p.y - this.y);
    }

    @Override
    public String toString(){
        return String.format("(%f, %f),", this.x, this.y);
    }

}
