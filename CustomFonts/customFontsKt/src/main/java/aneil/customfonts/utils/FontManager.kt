package aneil.customfonts.utils

import android.content.Context
import android.graphics.Typeface

object FontManager {

    private val ROOT = "fonts/"
    val MONTSERRAT_BLACK = ROOT + "Montserrat-Black.otf"
    val MONTSERRAT_BOLD = ROOT + "Montserrat-Bold.otf"
    val MONTSERRAT_EXTRA_BOLD = ROOT + "Montserrat-ExtraBold.otf"
    val MONTSERRAT_EXTRA_LIGHT = ROOT + "Montserrat-ExtraLight.otf"
    val MONTSERRAT_HAIRLINE = ROOT + "Montserrat-Hairline.otf"
    val MONTSERRAT_LIGHT = ROOT + "Montserrat-Light.otf"
    val MONTSERRAT_REGULAR = ROOT + "Montserrat-Regular.otf"
    val MONTSERRAT_SEMI_BOLD = ROOT + "Montserrat-SemiBold.otf"
    val MONTSERRAT_THIN = ROOT + "Montserrat-Thin.otf"
    val MONTSERRAT_ULTRA_LIGHT = ROOT + "Montserrat-UltraLight.otf"

    fun getTypeface(context: Context?, font: String?): Typeface {
        return Typeface.createFromAsset(context?.assets, font)
    }

}