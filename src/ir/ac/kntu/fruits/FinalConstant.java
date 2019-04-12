public class FinalConstant{
    // The int enum pattern - severely deficient! NOT RECOMMANDED!
    // how to fix this problem?
    public static final int APPLE_FUJI         = 0;
    public static final int APPLE_PIPPIN       = 1;
    public static final int APPLE_GRANNY_SMITH = 2;

    public static final int ORANGE_NAVEL  = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD  = 2; 
}


 // prefer this pattern
enum Apple  { FUJI, PIPPIN, GRANNY_SMITH }

enum Orange { NAVEL, TEMPLE, BLOOD } 