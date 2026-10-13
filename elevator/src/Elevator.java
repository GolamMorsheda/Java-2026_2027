public class Elevator {
    int n_floors;
    int current_floor;
    boolean open;

    public Elevator(int n_floors){
        this.n_floors = n_floors;
        if (n_floors < 2){
            this.n_floors = 2;
        }
        this.current_floor = 0;
        open = false;
    }

    public int getFloors(){
        return n_floors;
    }
    public int getFloor(){
        return current_floor;
    }

    public boolean open(){
        return open = true;
    }
    public boolean close(){
        return open = false;
    }

    public boolean goUp(){
        if (open != true && current_floor < n_floors){
            this.current_floor++;
            return true;
        }
        return false;
    }

    public  boolean goDown(){
        if (open != true && current_floor > 0){
            current_floor--;
            return true;
        }
        return false;
    }

    public boolean goToFloor(int reach_floor){
        if (reach_floor < n_floors && reach_floor > -1){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "The elevator serves " + n_floors + " floors, it is currently at "
                + current_floor + " and the doors are " + open;
    }
}
