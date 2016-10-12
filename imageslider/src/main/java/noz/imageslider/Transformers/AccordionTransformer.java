package noz.imageslider.Transformers;

import android.view.View;

import com.nineoldandroids.view.ViewHelper;

/**
 * Created by CLient-Pc on 13/10/2016.
 */
public class AccordionTransformer extends BaseTransformer {

    @Override
    protected void onTransform(View view, float position) {
        ViewHelper.setPivotX(view,position < 0 ? 0 : view.getWidth());
        ViewHelper.setScaleX(view,position < 0 ? 1f + position : 1f - position);
    }

}
