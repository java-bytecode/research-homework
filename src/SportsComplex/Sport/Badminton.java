package SportsComplex.Sport;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.Map;

public class Badminton extends Sport {

    // Init Block
    {
        time = LocalTime.parse("07:30:00");
        createSlots();
    }

    @Override
    public void viewSlots() {
        System.out.println("Badminton");
        System.out.println("Slot\t" + "Time");
        Iterator itr = slots.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry pair = (Map.Entry) itr.next();
            System.out.println(pair.getKey() + "\t    " + pair.getValue());
            //itr.remove();
        }
    }

    @Override
    public String bookSlot(int slotID) {
        return deleteSlot(slotID);
    }

    @Override
    protected void createSlots() {
        // 10 slots each with timings against each (1 hour per each slot)
        for(int i = 1; i <= 10; i++){
            time = time.plusHours(1);
            slots.put(i, time);
        }
    }

    @Override
    protected String deleteSlot(int slotID) {
        String getTime = slots.get(slotID).toString();
        slots.remove(slotID);
        return getTime;
    }
}
