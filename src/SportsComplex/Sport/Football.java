package SportsComplex.Sport;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.Map;

public class Football extends Sport {

    // Init Block
    {
        time = LocalTime.parse("08:30:00");
        createSlots();
    }

    @Override
    public void viewSlots() {
        System.out.println("Football");
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
        //  20 slots (30 mins for each slot)
        for(int i = 1; i <= 20; i++){
            time = time.plusMinutes(30);
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
