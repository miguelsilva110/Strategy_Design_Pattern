import java.util.Random;

public class Route2 implements Route {




        @Override
        public void getDirections() {
            System.out.println("Turn right after 200 meters");
        }

        @Override
        public int getTotalDistance() {
            return 15;
        }

        @Override
        public Enum<Traffic> getTraffic() {
            Random random = new Random();
            if(random.nextBoolean()){
                System.out.println("High Traffic on Route 2");
                return Traffic.HIGH_TRAFFIC;
            }
            System.out.println("Low Traffic on route 2");
            return Traffic.LOW_TRAFFIC;
        }
    }

