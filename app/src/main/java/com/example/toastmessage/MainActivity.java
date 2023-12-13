package com.example.toastmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toast = findViewById(R.id.toast);
        String text = "Humans inhabited Jamaica from as early as 4000–1000 BC.\n" +
                "Little is known of these early peoples. A group known as the\n" +
                "&quot;Redware people&quot; after their pottery arrived circa 600 AD, followed\n" +
                "by the Taíno circa 800 AD, who most likely came from South\n" +
                "America. They practised an agrarian and fishing economy, and at\n" +
                "their height are thought to have numbered some 60,000 people,\n" +
                "grouped into around 200 villages headed by caciques (chiefs). The\n" +
                "south coast of Jamaica was the most populated, especially around\n" +
                "the area now known as Old Harbour.";

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG).show();
            }
        });



    }
}