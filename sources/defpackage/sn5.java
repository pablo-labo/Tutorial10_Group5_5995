package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class sn5 {
    public static final qn5 a(Context context) {
        return new qn5(new o70(context), new q70(Build.VERSION.SDK_INT >= 31 ? uo5.a.a(context) : 0));
    }
}
