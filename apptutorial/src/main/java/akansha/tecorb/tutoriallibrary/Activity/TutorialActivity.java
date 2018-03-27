package akansha.tecorb.tutoriallibrary.Activity;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.List;
import akansha.tecorb.tutoriallibrary.Adapter.TutorialAdapter;
import akansha.tecorb.tutoriallibrary.R;
import akansha.tecorb.tutoriallibrary.TutorialPages;
import akansha.tecorb.tutoriallibrary.ViewPagerTransformations.FadeOutTransformation;
import akansha.tecorb.tutoriallibrary.ViewPagerTransformations.PopTransformation;
import akansha.tecorb.tutoriallibrary.ViewPagerTransformations.VerticalShutTransformation;
import akansha.tecorb.tutoriallibrary.databinding.ActivityTutorialBinding;

public abstract class TutorialActivity extends AppCompatActivity
        implements ViewPager.OnPageChangeListener ,View.OnClickListener {

    ActivityTutorialBinding tutorialBinding ;
    private List<TutorialPages> pages;
    TutorialAdapter tutorialAdapter ;
    private ViewPager.PageTransformer pageTransformer;
    Context context ;

    public void setPageTransformer(ViewPager.PageTransformer pageTransformer) {
        this.pageTransformer = pageTransformer;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fullScreen();
        tutorialBinding = DataBindingUtil.setContentView(this,R.layout.activity_tutorial);
        context = this ;
        tutorialBinding.tutorialViewPager.addOnPageChangeListener(this);
        tutorialBinding.previousIV.setOnClickListener(this);
        tutorialBinding.skipTutorialView.setOnClickListener(this);

    }

    private void fullScreen() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    public void hideActionBar() {
        if(getSupportActionBar()!=null)
            getSupportActionBar().hide();
    }

    public void setTutorialPages(List<TutorialPages>tutorialPages){
        this.pages = tutorialPages ;
        tutorialAdapter = new TutorialAdapter(pages,getSupportFragmentManager());
        tutorialBinding.tutorialViewPager.setAdapter(tutorialAdapter);
        if(pageTransformer==null)
            pageTransformer = new FadeOutTransformation();
        tutorialBinding.circleIndicator.setPageIndicators(pages.size());

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

        int firstPagePosition = 0;
        int lastPagePosition = tutorialAdapter.getCount() - 1;
        tutorialBinding.circleIndicator.setCurrentPage(position);

        if (position == lastPagePosition) {
            showSkipToStarted();
        } else if (position == firstPagePosition) {
            hidePreviousImage();
        } else {
            showSkip();
            showPreviousImage();
        }

    }

    public void setLogoIcon(int icon){
        tutorialBinding.logoIV.setVisibility(View.VISIBLE);
        tutorialBinding.logoIV.setImageResource(icon);
    }


    public void showSkipToStarted() {
        tutorialBinding.skipTutorialView.setText("Get Started");

    }
    public void showSkip() {

        tutorialBinding.skipTutorialView.setText("Skip");
    }

    public void hidePreviousImage(){

        tutorialBinding.previousIV.setVisibility(View.INVISIBLE);
    }
    public void showPreviousImage(){
        tutorialBinding.previousIV.setVisibility(View.VISIBLE);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public void changePreviousImageIcon(int image){
        tutorialBinding.previousIV.setImageResource(image);
    }
    public void changeSkipTextColor(int color) {
        tutorialBinding.skipTutorialView.setTextColor(ContextCompat.getColor(context, color));
    }


    public void setInactiveIndicatorColor(int color) {
        tutorialBinding.circleIndicator.setInactiveIndicatorColor(color);
    }
    public void setActiveIndicatorColor(int color) {
        tutorialBinding.circleIndicator.setActiveIndicatorColor(color);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId() ;

        boolean isAtFirstPage = tutorialBinding.tutorialViewPager.getCurrentItem() == 0;
        boolean isAtLastPage = tutorialBinding.tutorialViewPager.getCurrentItem() == tutorialAdapter.getCount() - 1;


        if(id==R.id.previousIV && !isAtFirstPage){
            tutorialBinding.tutorialViewPager.setCurrentItem(tutorialBinding.tutorialViewPager.getCurrentItem() - 1);
            previousBtnClicked();

        }else if(id==R.id.skipTutorialView && !isAtLastPage){
            skipBtnClicked();

        } else if(id== R.id.skipTutorialView && isAtLastPage){
            getStartedBtnClicked();
        }
    }

    public abstract void previousBtnClicked();
    public abstract void skipBtnClicked();
    public abstract void getStartedBtnClicked();
}
