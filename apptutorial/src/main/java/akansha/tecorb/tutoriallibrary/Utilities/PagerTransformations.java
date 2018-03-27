package akansha.tecorb.tutoriallibrary.Utilities;

import akansha.tecorb.tutoriallibrary.ViewPagerTransformations.DepthTransformation;
import akansha.tecorb.tutoriallibrary.ViewPagerTransformations.FadeOutTransformation;
import akansha.tecorb.tutoriallibrary.ViewPagerTransformations.FidgetSpinTransformation;
import akansha.tecorb.tutoriallibrary.ViewPagerTransformations.HingeTransformation;
import akansha.tecorb.tutoriallibrary.ViewPagerTransformations.PopTransformation;
import akansha.tecorb.tutoriallibrary.ViewPagerTransformations.VerticalFlipTransformation;
import akansha.tecorb.tutoriallibrary.ViewPagerTransformations.VerticalShutTransformation;
import akansha.tecorb.tutoriallibrary.ViewPagerTransformations.ZoomOutTransformation;

/**
 * Created by tecorb on 27/3/18.
 */

public class PagerTransformations {

    public static DepthTransformation getDepthTransformation(){
        return new DepthTransformation();
    }
    public static FadeOutTransformation getFadeOutTansformation(){
        return new FadeOutTransformation() ;
    }
    public static FidgetSpinTransformation getFidgetSpinTransformation(){
        return new FidgetSpinTransformation();
    }
    public static HingeTransformation getHingeTransformation(){
        return new HingeTransformation() ;
    }
    public static PopTransformation getPopTransformation(){
        return new PopTransformation() ;
    }

    public static VerticalFlipTransformation getVerticalFlipTransformation(){
        return new VerticalFlipTransformation() ;
    }

    public static VerticalShutTransformation getVerticalShutTransformation(){
        return new VerticalShutTransformation() ;
    }
    public static ZoomOutTransformation getZoomOutTransformation(){
        return new ZoomOutTransformation() ;
    }




}
