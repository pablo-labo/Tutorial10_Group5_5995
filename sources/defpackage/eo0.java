package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class eo0 extends ene implements mtc {
    public final int a;
    public p54 b;

    public eo0(Context context, int i) {
        this.a = i;
        this.b = new p54(new File(context.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // defpackage.mtc
    public final ene b(Context context) {
        this.b = new p54(new File(context.getApplicationInfo().nativeLibraryDir), this.a | 1);
        return this;
    }

    @Override // defpackage.ene
    public final String c() {
        return "ApplicationSoSource";
    }

    @Override // defpackage.ene
    public final int d(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.b.d(str, i, threadPolicy);
    }

    @Override // defpackage.ene
    public final void e(int i) {
        this.b.getClass();
    }

    @Override // defpackage.ene
    public final String toString() {
        return "ApplicationSoSource[" + this.b.toString() + "]";
    }
}
