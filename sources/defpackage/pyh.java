package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class pyh {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ eyh e;

    public pyh(eyh eyhVar, String str, boolean z) {
        this.e = eyhVar;
        fib.f(str);
        this.a = str;
        this.b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor editorEdit = this.e.n().edit();
        editorEdit.putBoolean(this.a, z);
        editorEdit.apply();
        this.d = z;
    }

    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.n().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
