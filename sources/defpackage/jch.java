package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class jch {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
