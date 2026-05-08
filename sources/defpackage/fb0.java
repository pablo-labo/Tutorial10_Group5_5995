package defpackage;

import android.os.Build;
import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class fb0 {
    public static final void a(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }
}
