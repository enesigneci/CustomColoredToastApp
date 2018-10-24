package com.enesigneci.customcoloredtoastlibrary;

import android.content.Context;
import android.widget.Toast;

public class CustomColoredToast {
    public static final int LENGTH_SHORT=0;
    public static final int LENGTH_LONG=1;

    public static void makeCustomColoredToast(Context context, String text, int duration,int color){
        Toast toast = Toast.makeText(context,text,duration);
        toast.getView().setBackgroundColor(color);
        toast.show();
    }
}
