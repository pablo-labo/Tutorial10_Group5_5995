package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class deb {
    public final /* synthetic */ xh3 a;

    public deb(xh3 xh3Var) {
        this.a = xh3Var;
    }

    public final Object a(qf8 qf8Var, Object obj) {
        String string;
        qf8Var.getClass();
        SharedPreferences sharedPreferences = this.a.a;
        if (sharedPreferences.contains("indeedDevEnvOverride") && (string = sharedPreferences.getString("indeedDevEnvOverride", null)) != null) {
            return string;
        }
        return null;
    }
}
