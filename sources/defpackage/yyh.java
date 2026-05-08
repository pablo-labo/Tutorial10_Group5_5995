package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class yyh {
    public final String a;
    public boolean b;
    public String c;
    public final /* synthetic */ eyh d;

    public yyh(eyh eyhVar, String str) {
        this.d = eyhVar;
        fib.f(str);
        this.a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.n().getString(this.a, null);
        }
        return this.c;
    }

    public final void b(String str) {
        eyh eyhVar = this.d;
        if (eyhVar.a.V.k(null, djh.w0) || !yei.f0(str, this.c)) {
            SharedPreferences.Editor editorEdit = eyhVar.n().edit();
            editorEdit.putString(this.a, str);
            editorEdit.apply();
            this.c = str;
        }
    }
}
