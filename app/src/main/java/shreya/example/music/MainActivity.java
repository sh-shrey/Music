package shreya.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/miniproject-62af1.appspot.com/o/At_the_Center_Is_Love.mp3?alt=media&token=1c9c5b73-b7d1-4dcb-8030-1e0263b5e631";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/miniproject-62af1.appspot.com/o/breatheinme.mp3?alt=media&token=4d89402a-4343-444d-b651-be365971b853";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/miniproject-62af1.appspot.com/o/meditation.mp3?alt=media&token=2fc27579-5aa8-4138-af7f-01e06c58be78";
        JcPlayerView jcPlayerView = findViewById(R.id.jcplayer);

        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Song1",url1));
        jcAudios.add(JcAudio.createFromURL("Song2",url2));
        jcAudios.add(JcAudio.createFromURL("Song3",url3));
       // jcAudios.add(JcAudio.createFromAssets("Asset audio", "audio.mp3"));
        // jcAudios.add(JcAudio.createFromRaw("Raw audio", R.raw.audio));

        jcPlayerView.initPlaylist(jcAudios, null); // initializing jc player view

        jcPlayerView.createNotification();
    }
}