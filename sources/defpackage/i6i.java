package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class i6i implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ m4i b;

    public i6i(m4i m4iVar, boolean z) {
        this.b = m4iVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m4i m4iVar = this.b;
        m4iVar.b();
        m4iVar.g();
        m4iVar.k();
        jwh jwhVar = m4iVar.zzr().b0;
        boolean z = this.a;
        jwhVar.a(Boolean.valueOf(z), "Setting app measurement enabled (FE)");
        eyh eyhVarF = m4iVar.f();
        eyhVarF.b();
        SharedPreferences.Editor editorEdit = eyhVarF.n().edit();
        editorEdit.putBoolean("measurement_enabled", z);
        editorEdit.apply();
        m4iVar.x();
    }
}
