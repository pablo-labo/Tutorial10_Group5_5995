package defpackage;

import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class op7 implements np7 {
    @Override // defpackage.np7
    public final void a(String str, String str2) {
        ArrayList arrayList = lz2.a;
        Log.d(str, str2, null);
    }

    @Override // defpackage.np7
    public final void c(String str, String str2, boolean z, Throwable th) {
        ArrayList arrayList = lz2.a;
        lz2.b(str, str2, z, th);
    }

    @Override // defpackage.np7
    public final void e(String str, String str2) {
        ArrayList arrayList = lz2.a;
        lz2.d(str, str2, false, null);
    }

    @Override // defpackage.np7
    public final void f(String str, String str2, boolean z, Exception exc) {
        ArrayList arrayList = lz2.a;
        lz2.g(str, str2, z, exc);
    }
}
