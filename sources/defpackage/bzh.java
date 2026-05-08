package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class bzh {

    @VisibleForTesting
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final /* synthetic */ eyh e;

    public bzh(eyh eyhVar, long j) {
        this.e = eyhVar;
        fib.f("health_monitor");
        fib.b(j > 0);
        this.a = "health_monitor".concat(":start");
        this.b = "health_monitor".concat(":count");
        this.c = "health_monitor".concat(":value");
        this.d = j;
    }

    public final void a() {
        eyh eyhVar = this.e;
        eyhVar.b();
        eyhVar.a.c0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = eyhVar.n().edit();
        editorEdit.remove(this.b);
        editorEdit.remove(this.c);
        editorEdit.putLong(this.a, jCurrentTimeMillis);
        editorEdit.apply();
    }
}
