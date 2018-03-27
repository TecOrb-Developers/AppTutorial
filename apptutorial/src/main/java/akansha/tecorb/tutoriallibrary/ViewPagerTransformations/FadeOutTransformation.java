package akansha.tecorb.tutoriallibrary.ViewPagerTransformations;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by tecorb on 27/3/18.
 */

public class FadeOutTransformation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {
        page.setTranslationX(-position*page.getWidth());

        page.setAlpha(1-Math.abs(position));
    }
}
