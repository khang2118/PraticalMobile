package vn.edu.usth.weather;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class RawtoExternal {
    public RawtoExternal(WeatherActivity weatherActivity) {
    }

    void copyFileToSdCard(Context context) {
        // Input from res/raw
        InputStream in = context.getResources().openRawResource(R.raw.music);

        // Output to external storage (sdcard)
        File outFile = new File(Environment.getExternalStorageDirectory(), "mysong.mp3");

        try {
            OutputStream out = new FileOutputStream(outFile);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            in.close();
            out.close();

            Log.i("CopyFile", "File copied to " + outFile.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void playMusicFromSdCard() {
        File file = new File(Environment.getExternalStorageDirectory(), "mysong.mp3");

        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(file.getAbsolutePath());
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}