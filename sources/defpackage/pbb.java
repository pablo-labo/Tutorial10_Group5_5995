package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class pbb {
    public final xcb a;

    public pbb() {
        this.a = Build.VERSION.SDK_INT >= 28 ? new k51() : new hh1(26);
    }
}
