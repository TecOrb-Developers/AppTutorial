# AppTutorial
Simplify the process of handling AppTutorial UI in android.

![AppTutorial](/tutorial.gif)

To implement AppTutorial view into your project, add this AppTutorial library to your project and extend
TutorialActivity into your main Activity. You can also grab it via Gradle:

Gradle
------------
Add it in your root build.gradle at the end of repositories:

```groovy
dependencies {
	compile 'com.github.SharmaAkansha:AppTutorial:-SNAPSHOT'
}
```

# Usage
--------
java
```
Extend TutorialActivity in your activity and create a list by calling TutorialPages constructor pass custom title,description and image
in that constructor and finally add that. 

public class MainActivity extends TutorialActivity

TutorialPages pageOne = new TutorialPages("Find Restaurant", "Find the best restaurant in your neighborhood.",R.drawable.ic_splash);
TutorialPages pageTwo = new TutorialPages("Pick the best", "Pick the right place using trusted ratings and reviews.",R.drawable.ic_tutone);
TutorialPages pageThree = new TutorialPages("Choose your meal", "Easily find the type of food you're craving.",R.drawable.ic_tuttwo);
TutorialPages pageFour = new TutorialPages("Meal is on the way", "Get ready and comfortable while our biker bring your meal at your door.",R.drawable.ic_tut_three);

        List<TutorialPages> pages = new ArrayList<>();

        pages.add(pageOne);
        pages.add(pageTwo);
        pages.add(pageThree);
        pages.add(pageFour);

        for (TutorialPages page : pages) {
            page.setTitleColor(R.color.black);
            page.setDescriptionColor(R.color.black);
            page.setTitleTextSize(22);
            page.setDescriptionTextSize(18);
        }
        
        setTutorialPages(pages);
```

## Methods:

You may use the following methods in your activity to customize your AppTutorial.

*`setInactiveIndicatorColor(your_color_id);` By using above method you can set inactive Indicator color.

*`setActiveIndicatorColor(your_color_id);` By using above method you can set active indicator color

*`changePreviousImageIcon(your_drawable_id);` By using above method you can change the previous back icon image.

*`changeSkipTextColor(your_color_id);` By using above method you can change skip textColor according to your need.

*`setLogoIcon(your_drawable_id);` By using above method you can add image at the top-left corner in tutorial.

*`setPageTransformer(PagerTransformations.getDepthTransformation());` you can add list of numbers of transformation.

## List of Transformations

Here is the list of transformations which you can check by clicking them :
* [Depth Transformation](https://github.com/SharmaAkansha/AppTutorial/blob/master/apptutorial/src/main/java/akansha/tecorb/tutoriallibrary/ViewPagerTransformations/DepthTransformation.java)
* [Zoom Out Transformation](https://github.com/SharmaAkansha/AppTutorial/blob/master/apptutorial/src/main/java/akansha/tecorb/tutoriallibrary/ViewPagerTransformations/ZoomOutTransformation.java)
* [Fidget Spin Transformation](https://github.com/SharmaAkansha/AppTutorial/blob/master/apptutorial/src/main/java/akansha/tecorb/tutoriallibrary/ViewPagerTransformations/FidgetSpinTransformation.java)
* [Vertical Flip Transformation](https://github.com/SharmaAkansha/AppTutorial/blob/master/apptutorial/src/main/java/akansha/tecorb/tutoriallibrary/ViewPagerTransformations/VerticalFlipTransformation.java)
* [Pop Transformation](https://github.com/SharmaAkansha/AppTutorial/blob/master/apptutorial/src/main/java/akansha/tecorb/tutoriallibrary/ViewPagerTransformations/PopTransformation.java)
* [Fade Out Transformation](https://github.com/SharmaAkansha/AppTutorial/blob/master/apptutorial/src/main/java/akansha/tecorb/tutoriallibrary/ViewPagerTransformations/FadeOutTransformation.java)
* [Hinge Transformation](https://github.com/SharmaAkansha/AppTutorial/blob/master/apptutorial/src/main/java/akansha/tecorb/tutoriallibrary/ViewPagerTransformations/HingeTransformation.java)
* [Vertical Shut Transformation](https://github.com/SharmaAkansha/AppTutorial/blob/master/apptutorial/src/main/java/akansha/tecorb/tutoriallibrary/ViewPagerTransformations/VerticalShutTransformation.java)

### Full Java Code:
```
public class MainActivity extends TutorialActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TutorialPages pageOne = new TutorialPages("Find Restaurant", "Find the best restaurant in your neighborhood.",R.drawable.ic_splash);
        TutorialPages pageTwo = new TutorialPages("Pick the best", "Pick the right place using trusted ratings and reviews.",R.drawable.ic_tutone);
        TutorialPages pageThree = new TutorialPages("Choose your meal", "Easily find the type of food you're craving.",R.drawable.ic_tuttwo);
        TutorialPages pageFour = new TutorialPages("Meal is on the way", "Get ready and comfortable while our biker bring your meal at your door.",R.drawable.ic_tut_three);

        List<TutorialPages> pages = new ArrayList<>();

        pages.add(pageOne);
        pages.add(pageTwo);
        pages.add(pageThree);
        pages.add(pageFour);

        for (TutorialPages page : pages) {
            page.setTitleColor(R.color.black);
            page.setDescriptionColor(R.color.black);
            page.setTitleTextSize(22);
            page.setDescriptionTextSize(18);
        }

        setPageTransformer(PagerTransformations.getDepthTransformation());
        setInactiveIndicatorColor(R.color.grey_600);
        setActiveIndicatorColor(R.color.colorWhite);
        setTutorialPages(pages);
        changePreviousImageIcon(R.drawable.ic_back_black);
        changeSkipTextColor(R.color.black);
    }

    @Override
    public void previousBtnClicked() {

    }

    @Override
    public void skipBtnClicked() {
        finish();
    }

    @Override
    public void getStartedBtnClicked() {}
```

Developed By
--------

Akansha Sharma
<a href="https://www.linkedin.com/in/akansha-sharma-479228114/">
 <img alt="Follow me on LinkedIn"
 src="http://data.pkmmte.com/temp/social_linkedin_logo.png" />
</a>

<a href="https://tecorb.com/">TecOrb Technologies</a>
