package com.shreyasvenkat.noemojiedittext;

import android.content.Context;
import android.graphics.Typeface;
import android.text.InputType;
import android.util.AttributeSet;

public class NoEmojiEditText extends androidx.appcompat.widget.AppCompatEditText {

    public NoEmojiEditText(Context context) {
        super(context);
        init();
    }

    public NoEmojiEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public NoEmojiEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setInputType(getInputType() | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);

        // Set the default typeface to maintain consistent font appearance
        setTypeface(Typeface.DEFAULT);
    }

    @Override
    public int getInputType() {
        return android.text.InputType.TYPE_CLASS_TEXT |
                InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD;
    }
}