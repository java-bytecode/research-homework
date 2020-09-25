package SportsComplex.Sport;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.Map;

public class BoxCricket extends Sport {

    // Init Block
    {
        time = LocalTime.parse("09:30:00");
        createSlots();
    }

    @Override
    public void viewSlots() {
        System.out.println("Box Cricket");
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
        // 5 slots ( 2 hours each)
        for(int i = 1; i <= 5; i++){
            time = time.plusHours(2);
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
