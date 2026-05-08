package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class txh {
    public static final Charset d = Charset.forName("UTF-8");
    public static final fyh e = new fyh();
    public final Context a;
    public final String b;
    public final SharedPreferences c;

    public txh(Context context, String str) {
        this.a = context;
        this.b = str;
        this.c = context.getSharedPreferences("com.google.firebase.remoteconfig_legacy_settings", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap a(defpackage.iyh r12) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txh.a(iyh):java.util.HashMap");
    }
}
