package Project.Robbery;

public class RobberyApp {
    public static void main(String[] args) {
        City city = new City();
        Gang theGang = new Gang();
        Police police = new Police();
        theGang.getGangInfo();
        theGang.letsRob(city.getBuildings());
        police.catchCriminals(theGang);
    }
}
