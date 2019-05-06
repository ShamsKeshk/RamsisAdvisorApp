package com.udicity.shams.tourinsuez.AboutSuez;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 06/07/17.
 */

public class AboutSuezViewHolder {

    private TextView mTopicHeader;
    private TextView mTopicOneExplain;
    private TextView mTopicTwoExplain;
    private ImageView mTopicOneImage;
    private ImageView mTopicTwoImage;

    public AboutSuezViewHolder(View view) {
        this.mTopicHeader = view.findViewById(R.id.topic_id);
        this.mTopicOneExplain = view.findViewById(R.id.topic_one_explain_id);
        this.mTopicOneImage = view.findViewById(R.id.topic_one_image_view_id);
        this.mTopicTwoExplain = view.findViewById(R.id.topic_two_explain_id);
        this.mTopicTwoImage = view.findViewById(R.id.topic_two_image_view_id);
    }

    public TextView getmTopicHeader() {
        return mTopicHeader;
    }

    public TextView getmTopicOneExplain() {
        return mTopicOneExplain;
    }

    public TextView getmTopicTwoExplain() {
        return mTopicTwoExplain;
    }

    public ImageView getmTopicOneImage() {
        return mTopicOneImage;
    }

    public ImageView getmTopicTwoImage() {
        return mTopicTwoImage;
    }

}
