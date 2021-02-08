package util;

public class Path {

    // The @Getter methods are needed in order to access
    // the variables from Velocity Templates
    public static class Web {

        //public static final String CREATE_PREFERENCE = "/preference/";
        public static final String HOME_VELOCITY = "/preference/button";

    }
    public static class Template{
        public final static String CREATE_PREFERENCE_BUTTON = "/velocity/preference.vm";
    }

}
