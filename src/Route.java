public interface Route {

    void getDirections();
    int getTotalDistance();
    Enum<Traffic> getTraffic();

}
