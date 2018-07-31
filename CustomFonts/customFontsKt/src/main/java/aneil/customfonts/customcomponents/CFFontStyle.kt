package aneil.customfonts.customcomponents

import aneil.customfonts.utils.FontManager

/**
 * Enum for font style
 */
enum class CFFontStyle constructor(
        /**
         * @return
         */
        val index: Int,
        /**
         * @return
         */
        val fontName: String) {
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


    companion object {

        /**
         * @param id
         * @return
         */
        fun getORFontStyle(id: Int?): CFFontStyle {
            for (ORFontStyle in CFFontStyle.values()) {
                if (ORFontStyle.index == id) return ORFontStyle
            }
            return GOTHAMSSM_BLACK
        }
    }
}
