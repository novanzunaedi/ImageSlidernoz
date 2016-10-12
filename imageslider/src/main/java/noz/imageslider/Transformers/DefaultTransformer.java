package noz.imageslider.Transformers;

import android.view.View;

/**
 * Created by CLient-Pc on 13/10/2016.
 */
public class DefaultTransformer extends BaseTransformer {

    @Override
    protected void onTransform(View view, float position) {
    }

    @Override
    public boolean isPagingEnabled() {
        return true;
    }

}
