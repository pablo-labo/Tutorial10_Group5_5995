package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class elf {
    public static final long a;

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        a = id;
    }
}
