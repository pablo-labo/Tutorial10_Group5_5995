package defpackage;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rz2 extends e.c implements c5e {
    public boolean d0;
    public final boolean e0;
    public Function1<? super s5e, j6g> f0;

    public rz2(boolean z, boolean z2, Function1<? super s5e, j6g> function1) {
        this.d0 = z;
        this.e0 = z2;
        this.f0 = function1;
    }

    @Override // defpackage.c5e
    public final void F0(s5e s5eVar) {
        this.f0.invoke(s5eVar);
    }

    @Override // defpackage.c5e
    public final boolean L1() {
        return this.d0;
    }

    @Override // defpackage.c5e
    public final boolean c0() {
        return this.e0;
    }
}
