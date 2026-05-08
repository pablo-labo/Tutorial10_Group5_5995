package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class sc4 {
    public final d40<uc4> a;

    public sc4(uc4 uc4Var, Function1<? super uc4, Boolean> function1) {
        this.a = new d40<>(uc4Var, new hg(this, 2), new ig(this, 3), nc4.a, function1);
    }

    public final iy3 a() {
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }
}
