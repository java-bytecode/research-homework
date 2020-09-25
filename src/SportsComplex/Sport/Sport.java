package SportsComplex.Sport;

import java.time.LocalTime;
import java.util.HashMap;

public abstract class Sport {

    protected int slot;
    protected LocalTime time;
    public HashMap<Integer, LocalTime> slots;

    public Sport(){
        slots = new HashMap<>();
    }

    public Sport(int slot, LocalTime time){
        this.slot = slot;
        this.time = time;
    }

    public Sport(int slot, LocalTime time, HashMap<Integer, LocalTime> slots){
        this.slot = slot;
        this.time = time;
        this.slots = slots;
    }

    public abstract void viewSlots();
    public abstract String bookSlot(int slotID);
    protected abstract void createSlots();
    protected abstract String deleteSlot(int slotID);
}
