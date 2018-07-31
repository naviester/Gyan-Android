package aneil.customfontsjava.customcomponents;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import aneil.customfontsjava.R;
import aneil.customfontsjava.utils.FontManager;


/**
 * Created by neil.agarwal on 26/7/2018.
 * Custom implementation of Textview to adhere to custom font typeface
 */
public class CFTextView extends AppCompatTextView {

    public CFTextView(Context context) {
        super(context);
        setCustomFont(context, null);
    }

    public CFTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomFont(context, attrs);
    }

    public CFTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setCustomFont(context, attrs);
    }

    /**
     * Sets custom font to textview
     *
     * @param context
     */
    @SuppressLint("CustomViewStyleable")
    private void setCustomFont(Context context, AttributeSet attrs) {
        String fontType = FontManager.MONTSERRAT_BLACK;
        if (null != attrs) {
            TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.cfjView);
            int fontTypeInt = array.getInt(R.styleable.cfjView_cfFontStyle, CFFontStyle.MONTSERRAT_BLACK.getIndex());
            array.recycle();
            fontType = CFFontStyle.getORFontStyle(fontTypeInt).getFontName();
        }
        setTypeface(FontManager.getTypeface(context, fontType));
    }
}
