package aneil.customfontsjava.customcomponents;

import aneil.customfontsjava.utils.FontManager;

/**
 * Enum for font style
 */
public enum CFFontStyle {
    MONTSERRAT_BLACK(0, FontManager.MONTSERRAT_BLACK),
    MONTSERRAT_BOLD(1, FontManager.MONTSERRAT_BOLD),
    MONTSERRAT_EXTRA_BOLD(2, FontManager.MONTSERRAT_EXTRA_BOLD),
    MONTSERRAT_EXTRA_LIGHT(3, FontManager.MONTSERRAT_EXTRA_LIGHT),
    MONTSERRAT_HAIRLINE(4, FontManager.MONTSERRAT_HAIRLINE),
    MONTSERRAT_LIGHT(5, FontManager.MONTSERRAT_LIGHT),
    MONTSERRAT_REGULAR(6, FontManager.MONTSERRAT_REGULAR),
    MONTSERRAT_SEMI_BOLD(7, FontManager.MONTSERRAT_SEMI_BOLD),
    MONTSERRAT_THIN(8, FontManager.MONTSERRAT_THIN),
    MONTSERRAT_ULTRA_LIGHT(9, FontManager.MONTSERRAT_ULTRA_LIGHT);

    private final int id;
    private final String fontName;

    CFFontStyle(int id, String fontName) {
        this.id = id;
        this.fontName = fontName;
    }

    /**
     * @param id
     * @return
     */
    public static CFFontStyle getORFontStyle(int id) {
        for (CFFontStyle CFFontStyle : CFFontStyle.values()) {
            if (CFFontStyle.id == id) return CFFontStyle;
        }
        return MONTSERRAT_BLACK;
    }

    /**
     * @return
     */
    public int getIndex() {
        return id;
    }

    /**
     * @return
     */
    public String getFontName() {
        return fontName;
    }
}
