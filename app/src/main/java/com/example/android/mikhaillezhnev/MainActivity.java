package com.example.android.mikhaillezhnev;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//
//    /**
//     * Opens google maps to show the location
//     * @param view
//     */
//    public void showLocation (View view) {
//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        intent.setData(Uri.parse("geo:56.818378, 59.904656"));
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        }
//    }
//
//    /**
//     * Dials the phone number via google Phone app
//     * @param view
//     */
//    public void dialPhoneNumber (View view) {
//        Intent intent = new Intent(Intent.ACTION_DIAL);
//        intent.setData(Uri.parse("tel:" + "+79089014136"));
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        }
//    }
//
//    /**
//     * Opens the link to Instagram account
//     * @param View
//     */
//    public void openApp (View View) {
//        Uri uri = Uri.parse("https://www.instagram.com/mihail_lezhnev/");
//        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
//
//        likeIng.setPackage("com.instagram.android");
//
//        try {
//            startActivity(likeIng);
//        } catch (ActivityNotFoundException e) {
//            startActivity(new Intent(Intent.ACTION_VIEW,
//                    Uri.parse("https://www.instagram.com/mihail_lezhnev/")));
//        }
//    }

}

