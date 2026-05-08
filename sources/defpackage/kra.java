package defpackage;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kra extends e.c implements ql8 {
    public Function1<? super th7, j6g> d0;
    public final boolean e0 = true;
    public long f0 = -9223372034707292160L;

    public kra(Function1<? super th7, j6g> function1) {
        this.d0 = function1;
    }

    @Override // defpackage.ql8
    public final void G(long j) {
        if (th7.b(this.f0, j)) {
            return;
        }
        this.d0.invoke(new th7(j));
        this.f0 = j;
    }

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return this.e0;
    }
}
