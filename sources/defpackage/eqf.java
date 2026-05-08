package defpackage;

import android.os.SystemClock;
import androidx.media3.exoplayer.upstream.b;

/* JADX INFO: loaded from: classes.dex */
public final class eqf {
    public static b.a a(p35 p35Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = p35Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (p35Var.a(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new b.a(1, 0, length, i);
    }
}
