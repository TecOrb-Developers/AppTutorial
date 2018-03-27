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

    public static DepthTransformation setDepthTransformation(){
        return new DepthTransformation();
    }
    public static FadeOutTransformation setFadeOutTansformation(){
        return new FadeOutTransformation() ;
    }
    public static FidgetSpinTransformation setFidgetSpinTransformation(){
        return new FidgetSpinTransformation();
    }
    public static HingeTransformation setHingeTransformation(){
        return new HingeTransformation() ;
    }
    public static PopTransformation setPopTransformation(){
        return new PopTransformation() ;
    }

    public static VerticalFlipTransformation setVerticalFlipTransformation(){
        return new VerticalFlipTransformation() ;
    }

    public static VerticalShutTransformation setVerticalShutTransformation(){
        return new VerticalShutTransformation() ;
    }
    public static ZoomOutTransformation setZoomOutTransformation(){
        return new ZoomOutTransformation() ;
    }




}
