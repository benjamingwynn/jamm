package com.xenxier.jamm;

import org.apache.logging.log4j.Level;
import cpw.mods.fml.common.FMLLog;

public class JammLog {
    public static void log(char level, Object object) {
    	if ( level == 'F') {
    		fmlLog(Level.FATAL, object);
    	} else if ( level == 'E' ) {
    		fmlLog(Level.FATAL, object);
    	} else if ( level == 'W' ) {
    		fmlLog(Level.WARN, object);
    	} else if ( level == 'I' ) {
    		fmlLog(Level.INFO, object);
    	} else if ( level == 'D' ) {
    		fmlLog(Level.DEBUG, object);
    	} else if ( level == 'T' ) {
    		fmlLog(Level.TRACE, object);
    	} else {  // If unknown then assume info
    		fmlLog(Level.INFO, object);
    	}
    }
    
    public static void fmlLog(Level logLevel, Object object) {
		FMLLog.log(JammID.mod.MODNAME, logLevel, String.valueOf(object));
    }
}
