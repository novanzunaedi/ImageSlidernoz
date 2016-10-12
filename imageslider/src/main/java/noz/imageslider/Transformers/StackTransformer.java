package noz.imageslider.Transformers;

import android.view.View;

import com.nineoldandroids.view.ViewHelper;

/**
 * Created by CLient-Pc on 13/10/2016.
 */
public class StackTransformer extends BaseTransformer {

    @Override
    protected void onTransform(View view, float position) {
        ViewHelper.setTranslationX(view,position < 0 ? 0f : -view.getWidth() * position);
    }

}
