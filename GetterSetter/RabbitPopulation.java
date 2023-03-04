/*
Instance fields:
population

Constructor:
Default Constructor
Alternate Constructor

Methods:
Getters and setters for all of the fields
matingSeason – method that triples the current population
huntingSeason – reduces the current population by 43%

 */

package GetterSetter;

public class RabbitPopulation {

    private int population;

    public RabbitPopulation(){
    }

    public RabbitPopulation(int pop){
        this.population = pop;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int rpop) {
        this.population = rpop;
    }

    public void matingSeason() {
        population = population *3;
    }

    public void HuntingSeason(){
        population = (population/100)*57;

    }
}