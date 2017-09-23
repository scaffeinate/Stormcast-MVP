package io.stormcast.app.stormcast.views.text;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by sudharti on 9/23/17.
 */

public class TypeFaceUtil {
    protected static Typeface getTypeFace(Context context, String fontWeight) {
        if(fontWeight != null) {
            if (fontWeight.equals("bold")) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/FuturaPTMedium.otf");
            } else if (fontWeight.equals("bolder")) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/FuturaPTDemi.otf");
            }
        }
        return Typeface.createFromAsset(context.getAssets(), "fonts/FuturaPTBook.otf");
    }
}