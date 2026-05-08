package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class uyh {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ eyh e;

    public uyh(eyh eyhVar, String str, long j) {
        this.e = eyhVar;
        fib.f(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.n().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.e.n().edit();
        editorEdit.putLong(this.a, j);
        editorEdit.apply();
        this.d = j;
    }
}
