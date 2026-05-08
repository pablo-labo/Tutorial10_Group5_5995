package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes.dex */
public final class ey0 {
    public static AudioManager a;

    public static synchronized AudioManager a(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                a = null;
            }
            AudioManager audioManager = a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                sn2 sn2Var = new sn2();
                q71.a().execute(new n60(2, applicationContext, sn2Var));
                sn2Var.b();
                AudioManager audioManager2 = a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th) {
            throw th;
        }
    }
}
