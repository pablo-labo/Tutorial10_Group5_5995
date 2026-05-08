package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import defpackage.fy0;

/* JADX INFO: loaded from: classes.dex */
public final class hl3 {
    public final Context a;
    public Boolean b;

    public static final class a {
        public static fy0 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
                return fy0.d;
            }
            fy0.a aVar = new fy0.a();
            aVar.a = true;
            aVar.c = z;
            return aVar.a();
        }
    }

    public static final class b {
        public static fy0 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return fy0.d;
            }
            fy0.a aVar = new fy0.a();
            boolean z2 = Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2;
            aVar.a = true;
            aVar.b = z2;
            aVar.c = z;
            return aVar.a();
        }
    }

    public hl3(Context context) {
        this.a = context.getApplicationContext();
    }
}
