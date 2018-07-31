package aneil.customfonts.utils

import android.content.Context
import android.graphics.Typeface

object FontManager {

    private val ROOT = "fonts/"
    val GOTHAMSSM_BLACK = ROOT + "GothamSSm-Black.otf"
    val GOTHAMSSM_BLACK_ITALIC = ROOT + "GothamSSm-BlackItalic.otf"
    val GOTHAMSSM_BOLD = ROOT + "GothamSSm-Bold.otf"
    val GOTHAMSSM_BOLD_ITALIC = ROOT + "GothamSSm-BoldItalic.otf"
    val GOTHAMSSM_BOOK = ROOT + "GothamSSm-Book.otf"
    val GOTHAMSSM_BOOK_ITALIC = ROOT + "GothamSSm-BookItalic.otf"
    val GOTHAMSSM_LIGHT = ROOT + "GothamSSm-Light.otf"
    val GOTHAMSSM_LIGHT_ITALIC = ROOT + "GothamSSm-LightItalic.otf"
    val GOTHAMSSM_MEDIUM = ROOT + "GothamSSm-Medium.otf"
    val GOTHAMSSM_MEDIUM_ITALIC = ROOT + "GothamSSm-MediumItalic.otf"
    val GOTHAMSSM_EXTRA_LIGHT = ROOT + "GothamSSm-XLight.otf"
    val GOTHAMSSM_EXTRA_LIGHT_ITALIC = ROOT + "GothamSSm-XLightItalic.otf"

    fun getTypeface(context: Context?, font: String?): Typeface {
        return Typeface.createFromAsset(context?.assets, font)
    }

}