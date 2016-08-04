/* package codechef; // don't place package name! */

class TapeDeck {
    boolean canRecord = false;
    
    void playTape() {
        System.out.println("tape playing");
    }
    
    void recordTape() {
        System.out.println("tape recording");
    }
}

class TapeDeckTestDrive {
    public static void main (String[] args) {
        /* code */TapeDeck t = new TapeDeck();
        
        t.canRecord = true;
        t.playTape();
        
        if(t.canRecord == true) {
            t.recordTape();
        }
    } 
}
