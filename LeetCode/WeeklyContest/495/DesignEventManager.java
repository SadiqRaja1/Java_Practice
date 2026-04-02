//  incomplete

import java.util.*;
public class DesignEventManager {
    public static void main (String args [] ) {
        int neww [] [] = {{5,7},
                         {2,7},
                         {9,4}
                        };
        // EventManager eventManager = new EventManager(neww);

    }  
    
    class EventManager {
        public EventManager(int [][] events) {
            for(int i=0; i<events.length; i++) {
                System.out.println(Arrays.toString(events[i]));
            }
            return;
        }

        public void updatePriority (int eventsId, int newPriority) {

        }

        public int pollHighest () {
            return -1;
        }
    }
}
