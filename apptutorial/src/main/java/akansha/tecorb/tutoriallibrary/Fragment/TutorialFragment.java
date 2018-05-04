package akansha.tecorb.tutoriallibrary.Fragment;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import akansha.tecorb.tutoriallibrary.R;
import akansha.tecorb.tutoriallibrary.TutorialPages;
import akansha.tecorb.tutoriallibrary.databinding.FragmentTutorialBinding;

import static android.databinding.DataBindingUtil.inflate;

/**
 * Created by tecorb on 26/3/18.
 */

public class TutorialFragment extends Fragment {

    private static final String TITLE = "title";
    private static final String TITLE_COLOR = "title_color";
    private static final String TITLE_TEXT_SIZE = "title_text_size";
    private static final String TITLE_DESCRIPTION = "description";
    private static final String DESCRIPTION_COLOR = "description_color";
    private static final String DESCRIPTION_TEXT_SIZE = "description_text_size";
    private static final String IMAGE_ID = "image_id";

    public static TutorialFragment newInstance(TutorialPages tutorialPages) {
        Bundle args = new Bundle();
        args.putString(TITLE, tutorialPages.getTitle());
        args.putString(TITLE_DESCRIPTION, tutorialPages.getDescription());
        args.putInt(TITLE_COLOR, tutorialPages.getTitleTextColor());
        args.putInt(DESCRIPTION_COLOR, tutorialPages.getDescriptionTextColor());
        args.putInt(IMAGE_ID, tutorialPages.getImageResourceId());
        args.putInt(TITLE_TEXT_SIZE,tutorialPages.getTitleTextSize());
        args.putInt(DESCRIPTION_TEXT_SIZE,tutorialPages.getDescriptionTextSize());
        args.putFloat(TITLE_TEXT_SIZE, tutorialPages.getTitleTextSize());
        args.putFloat(DESCRIPTION_TEXT_SIZE, tutorialPages.getDescriptionTextSize());
        TutorialFragment fragment = new TutorialFragment();
        fragment.setArguments(args);
        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        String title = bundle.getString(TITLE, null);
        int titleColor = bundle.getInt(TITLE_COLOR, 0);
        int titleTextSize = bundle.getInt(TITLE_TEXT_SIZE, 18);
        String description = bundle.getString(TITLE_DESCRIPTION, null);
        int descriptionColor = bundle.getInt(DESCRIPTION_COLOR, 0);
        int descriptionTextSize = bundle.getInt(DESCRIPTION_TEXT_SIZE, 16);
        int imageResId = bundle.getInt(IMAGE_ID, 0);

        FragmentTutorialBinding tutorialBinding = inflate(inflater,R.layout.fragment_tutorial,
                container,false);
        View  view = tutorialBinding.getRoot() ;

        if (title != null) {
            tutorialBinding.tutorialTitleTV.setText(title);
        }
        if(description !=null){
            tutorialBinding.tutorialDescriptionTV.setText(description);
        }
        if(titleColor !=0){
            tutorialBinding.tutorialTitleTV.setTextColor(getResources().getColor(titleColor));
        }
        if(descriptionColor!=0){
            tutorialBinding.tutorialDescriptionTV.setTextColor(getResources().getColor(descriptionColor));
        }
        if(titleTextSize !=0){
            tutorialBinding.tutorialTitleTV.setTextSize(TypedValue.COMPLEX_UNIT_SP, titleTextSize);
        }
        if(descriptionTextSize!=0){
            tutorialBinding.tutorialDescriptionTV.setTextSize(TypedValue.COMPLEX_UNIT_SP, descriptionTextSize);
        }
        if(imageResId!=0){
            tutorialBinding.tutorialIV.setImageDrawable(ContextCompat.getDrawable(getActivity(),imageResId));
        }

        return view ;
    }

    public float dpToPixels(int dp, Context context) {
        return dp * (context.getResources().getDisplayMetrics().density);
    }

}
