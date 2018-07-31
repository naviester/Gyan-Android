package aneil.customfonts.customcomponents

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet
import aneil.customfonts.R
import aneil.customfonts.utils.FontManager

class CFTextView : AppCompatTextView {
    constructor(context: Context?) : super(context) {
        setCustomFont(context, null)
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        setCustomFont(context, attrs)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        setCustomFont(context, attrs)
    }


    /**
     * Sets custom font to textview
     *
     * @param context
     */
    @SuppressLint("CustomViewStyleable")
    private fun setCustomFont(context: Context?, attrs: AttributeSet?) {
        var fontType = FontManager.GOTHAMSSM_BLACK
        if (null != attrs) {
            val array = context?.obtainStyledAttributes(attrs, R.styleable.cfView)
            val fontTypeInt = array?.getInt(R.styleable.cfView_cfFontStyle, CFFontStyle.GOTHAMSSM_BLACK.index)
            array?.recycle()
            fontType = CFFontStyle.getORFontStyle(fontTypeInt).fontName
        }
        typeface = FontManager.getTypeface(context, fontType)
    }
}