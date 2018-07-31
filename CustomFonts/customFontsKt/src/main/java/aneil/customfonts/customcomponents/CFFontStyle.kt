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

    companion object {

        /**
         * @param id
         * @return
         */
        fun getORFontStyle(id: Int?): CFFontStyle {
            for (ORFontStyle in CFFontStyle.values()) {
                if (ORFontStyle.index == id) return ORFontStyle
            }
            return MONTSERRAT_BLACK
        }
    }
}
