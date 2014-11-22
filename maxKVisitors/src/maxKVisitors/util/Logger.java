package maxKVisitors.util;

public class Logger {

    public enum LEVEL {
        /* Print to stdout everytime a constructor is called */
        LEVEL_CTOR,
        /* Print to stdout everytime an ADT is visited */
        LEVEL_VISIT,
        /* Don't print anything */
        LEVEL_NONE
    }

    private static LEVEL sLevel = LEVEL.LEVEL_NONE;
	
    private static Logger sLogger = null;

    private Logger() {}

    public static Logger getInstance() {
        if(sLogger == null) {
            synchronized(Logger.class) {
                if(sLogger == null) {
                    sLogger = new Logger();
                }
            }
        }

        return sLogger;
    }
    
    // accessor and mutator for DEBUG_VALUE
    public static LEVEL getDebugValue() {
        return sLevel;
    }

    /* 
      @return void
    */
    public static void setDebugValue(LEVEL level) {
        sLevel = level;
    }

    /* 
      @return void
    */
    public void write(LEVEL level, String msg) {
        if(sLevel == level) {
            System.out.println("[DEBUG] " + msg);
        }
    }
}
