package ejercicio.pkg11;

public class State {
    private class City{
        private String cityName;
        private Integer cityPolpulation;
        
        private City(String cityName,Integer cityPopulation){
            this.cityName=cityName;
            this.cityPolpulation=cityPopulation;
        }

        public String getCityName() {
            return cityName;
        }

        public Integer getCityPolpulation() {
            return cityPolpulation;
        }   

        @Override
        public String toString() {
            return "City{" + "cityName=" + cityName + ", cityPolpulation=" + cityPolpulation + '}';
        }
        
    }
    private String stateName;
    private Integer polpulation;
    private City capital;
    private City mostPopularCity;

    public State(String stateName,Integer polpulation,String cityNameCapital,Integer cityPopulationCapital,String cityNamePopular,Integer cityPopulationPopular){
        this.stateName=stateName;
        this.polpulation=polpulation;
        capital=new City(cityNameCapital,cityPopulationCapital);
        mostPopularCity=new City(cityNamePopular,cityPopulationPopular);
    }
    
    public String getStateName() {
        return stateName;
    }

    public Integer getPolpulation() {
        return polpulation;
    }

    public String getNameCityCapital() {
        return capital.getCityName();
    }

    public Integer getPopulationCityCapital() {
        return capital.getCityPolpulation();
    }
    public String getNameCityPopular() {
        return mostPopularCity.getCityName();
    }

    public Integer getPopulationCityPopular() {
        return mostPopularCity.getCityPolpulation();
    }

    @Override
    public String toString() {
        return "State{" + "stateName=" + stateName + ", polpulation=" + polpulation + ", capital=" + capital.toString() + ", mostPopularCity=" + mostPopularCity.toString() + '}';
    }
    
    
}
