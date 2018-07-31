package aneil.customfontsjava.utils;

import android.content.Context;
import android.graphics.Typeface;

public class FontManager {
    private static final String ROOT = "fonts/";
    public static final String GOTHAMSSM_BLACK = ROOT + "GothamSSm-Black.otf";
    public static final String GOTHAMSSM_BLACK_ITALIC = ROOT + "GothamSSm-BlackItalic.otf";
    public static final String GOTHAMSSM_BOLD = ROOT + "GothamSSm-Bold.otf";
    public static final String GOTHAMSSM_BOLD_ITALIC = ROOT + "GothamSSm-BoldItalic.otf";
    public static final String GOTHAMSSM_BOOK = ROOT + "GothamSSm-Book.otf";
    public static final String GOTHAMSSM_BOOK_ITALIC = ROOT + "GothamSSm-BookItalic.otf";
    public static final String GOTHAMSSM_LIGHT = ROOT + "GothamSSm-Light.otf";
    public static final String GOTHAMSSM_LIGHT_ITALIC = ROOT + "GothamSSm-LightItalic.otf";
    public static final String GOTHAMSSM_MEDIUM = ROOT + "GothamSSm-Medium.otf";
    public static final String GOTHAMSSM_MEDIUM_ITALIC = ROOT + "GothamSSm-MediumItalic.otf";
    public static final String GOTHAMSSM_EXTRA_LIGHT = ROOT + "GothamSSm-XLight.otf";
    public static final String GOTHAMSSM_EXTRA_LIGHT_ITALIC = ROOT + "GothamSSm-XLightItalic.otf";

    public static Typeface getTypeface(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets(), font);
    }
}
