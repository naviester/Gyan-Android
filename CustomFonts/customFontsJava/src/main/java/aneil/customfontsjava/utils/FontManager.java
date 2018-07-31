package aneil.customfontsjava.utils;

import android.content.Context;
import android.graphics.Typeface;

public class FontManager {
    private static final String ROOT = "fonts/";
    public static final String MONTSERRAT_BLACK = ROOT + "Montserrat-Black.otf";
    public static final String MONTSERRAT_BOLD = ROOT + "Montserrat-Bold.otf";
    public static final String MONTSERRAT_EXTRA_BOLD = ROOT + "Montserrat-ExtraBold.otf";
    public static final String MONTSERRAT_EXTRA_LIGHT = ROOT + "Montserrat-ExtraLight.otf";
    public static final String MONTSERRAT_HAIRLINE = ROOT + "Montserrat-Hairline.otf";
    public static final String MONTSERRAT_LIGHT = ROOT + "Montserrat-Light.otf";
    public static final String MONTSERRAT_REGULAR = ROOT + "Montserrat-Regular.otf";
    public static final String MONTSERRAT_SEMI_BOLD = ROOT + "Montserrat-SemiBold.otf";
    public static final String MONTSERRAT_THIN = ROOT + "Montserrat-Thin.otf";
    public static final String MONTSERRAT_ULTRA_LIGHT = ROOT + "Montserrat-UltraLight.otf";

    public static Typeface getTypeface(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets(), font);
    }
}
