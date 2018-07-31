package aneil.customfontsjava.customcomponents;

import aneil.customfontsjava.utils.FontManager;

/**
 * Enum for font style
 */
public enum CFFontStyle {
    GOTHAMSSM_BLACK(0, FontManager.GOTHAMSSM_BLACK),
    GOTHAMSSM_BLACK_ITALIC(1, FontManager.GOTHAMSSM_BLACK_ITALIC),
    GOTHAMSSM_BOLD(2, FontManager.GOTHAMSSM_BOLD),
    GOTHAMSSM_BOLD_ITALIC(3, FontManager.GOTHAMSSM_BOLD_ITALIC),
    GOTHAMSSM_BOOK(4, FontManager.GOTHAMSSM_BOOK),
    GOTHAMSSM_BOOK_ITALIC(5, FontManager.GOTHAMSSM_BOOK_ITALIC),
    GOTHAMSSM_LIGHT(6, FontManager.GOTHAMSSM_LIGHT),
    GOTHAMSSM_LIGHT_ITALIC(7, FontManager.GOTHAMSSM_LIGHT_ITALIC),
    GOTHAMSSM_MEDIUM(8, FontManager.GOTHAMSSM_MEDIUM),
    GOTHAMSSM_MEDIUM_ITALIC(9, FontManager.GOTHAMSSM_MEDIUM_ITALIC),
    GOTHAMSSM_EXTRA_LIGHT(10, FontManager.GOTHAMSSM_EXTRA_LIGHT),
    GOTHAMSSM_EXTRA_LIGHT_ITALIC(11, FontManager.GOTHAMSSM_EXTRA_LIGHT_ITALIC);

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
        return GOTHAMSSM_BLACK;
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
