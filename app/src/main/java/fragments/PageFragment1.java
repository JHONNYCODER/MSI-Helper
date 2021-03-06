package fragments;

import android.content.Intent;
import com.MSI.Helper.R;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PageFragment1 extends Fragment {

    private ImageView img1,img2,img3;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @NonNull ViewGroup container,
                             @NonNull Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_admin1, container, false);

        img1 = rootView.findViewById(R.id.github);
        img2 = rootView.findViewById(R.id.linkedin);
        img3 = rootView.findViewById(R.id.instagram);




        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open("https://github.com/iamanshuman");
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open("https://www.linkedin.com/in/anshuman-shekhar-0735231a6/");
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open("https://www.instagram.com/__iamanshuman/?hl=en");
            }
        });

        textView = rootView.findViewById(R.id.text4);
        textView.setMovementMethod(new ScrollingMovementMethod());

        return rootView;
    }

    private void open(String s) {
        Uri uri = Uri.parse(s);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

}