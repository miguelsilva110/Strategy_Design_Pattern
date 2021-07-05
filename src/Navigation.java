public class Navigation {

    private Route route;

    public Navigation(){
        route = getBestRout();
    }

    public Route getBestRout(){
        Route1 route1 = new Route1();
        Route2 route2 = new Route2();


        // GET TRAFFIC

        if(route1.getTraffic() == Traffic.LOW_TRAFFIC && route2.getTraffic() == Traffic.HIGH_TRAFFIC){
            System.out.println("Selecting Low Traffic rout - Route 1");
            return route1;
        }
        System.out.println("Selecting Route 2");
        return route2;
    }

    public void navigate(){
        route.getDirections();
    }
}
