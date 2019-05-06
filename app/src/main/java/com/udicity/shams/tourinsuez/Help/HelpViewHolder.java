package com.udicity.shams.tourinsuez.Help;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 06/07/17.
 */

public class HelpViewHolder {

    private ImageView helpProviderImage;
    private TextView helpProviderName;
    private TextView helpProviderPhone;
    private TextView helpProviderAddress;

    public HelpViewHolder(View view) {
        this.helpProviderImage = view.findViewById(R.id.help_provider_image_view);
        this.helpProviderName = view.findViewById(R.id.help_provider_name_text_view);
        this.helpProviderPhone = view.findViewById(R.id.help_provider_phone_number_text_view);
        this.helpProviderAddress = view.findViewById(R.id.help_provider_address_text_view);
    }

    public ImageView getHelpProviderImage() {
        return helpProviderImage;
    }

    public TextView getHelpProviderName() {
        return helpProviderName;
    }

    public TextView getHelpProviderPhone() {
        return helpProviderPhone;
    }

    public TextView getHelpProviderAddress() {
        return helpProviderAddress;
    }
}
