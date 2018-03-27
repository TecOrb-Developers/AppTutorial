package akansha.tecorb.tutorialscreen;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import akansha.tecorb.tutoriallibrary.Activity.TutorialActivity;
import akansha.tecorb.tutoriallibrary.TutorialPages;
import akansha.tecorb.tutoriallibrary.Utilities.PagerTransformations;

public class MainActivity extends TutorialActivity{

    Context context ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this ;

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

        setPageTransformer(PagerTransformations.setDepthTransformation());
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
    public void getStartedBtnClicked() {

    }
}
