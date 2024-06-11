public class Eagle extends Bird  implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!flying && this.altitude == 0) {
          System.out.println(this.getName() + " is taking off in the sky.");
          this.flying = true;
        }
    }

    @Override
    public int ascend(int meters) {
        if (flying) {
            this.altitude += meters;
        System.out.println(this.getName() + " flies upward, altitude : " + this.altitude );
    }
            
        return this.altitude;
    }

    @Override
    public void glide() {
        if (this.flying && this.altitude >=150) {
            System.out.println(this.getName() + " glides into the air.");
            
        }
       
    }

    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude -=  meters;
            System.out.println(this.getName() + " flies downward, altitude : " + this.altitude );
            
        }
        return  this.altitude;
    }

    @Override
    public void land() {
        if (this.altitude == 0 || this.altitude < 10) {
            System.out.println(this.getName() + " lands on the ground.");
        } else {
            System.out.println(this.getName() + " is too high, it can't land. ");
            
        }
    }
}
