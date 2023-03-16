package FairyQin.HomeLove.BikeExample;

/**
 * @author Black_ghost
 * @title: Bike
 * @projectName DesignModelAll
 * @description :616  An unchanging God  Qin_Love
 * @CreateDate 2023-03-16 20:41:38
 * @Description 复杂产品类
 **/
public class Bike {
    /**
     * frame 车架
     * seat 坐垫
    */
    private String frame;
    private String seat;

    public Bike(){}
    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
