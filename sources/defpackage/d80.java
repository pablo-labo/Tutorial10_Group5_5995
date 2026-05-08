package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class d80 extends o81 {
    @Override // defpackage.o81
    public final void D(tu8 tu8Var, String str) {
        int iOrdinal = tu8Var.ordinal();
        if (iOrdinal == 0) {
            Log.d("[Koin]", str);
            return;
        }
        if (iOrdinal == 1) {
            Log.i("[Koin]", str);
            return;
        }
        if (iOrdinal == 2) {
            Log.w("[Koin]", str);
        } else if (iOrdinal != 3) {
            Log.e("[Koin]", str);
        } else {
            Log.e("[Koin]", str);
        }
    }
}
