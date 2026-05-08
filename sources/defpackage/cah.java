package defpackage;

import android.os.Looper;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes2.dex */
public final class cah extends m9h {

    @NotOnlyInitialized
    public final ma6 b;

    public cah(ma6 ma6Var) {
        this.b = ma6Var;
    }

    @Override // defpackage.pa6
    public final Looper a() {
        return this.b.f;
    }
}
