package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class co7 extends bz7 {
    public final Function1<Throwable, j6g> e;

    /* JADX WARN: Multi-variable type inference failed */
    public co7(Function1<? super Throwable, j6g> function1) {
        this.e = function1;
    }

    @Override // defpackage.bz7
    public final boolean i() {
        return false;
    }

    @Override // defpackage.bz7
    public final void j(Throwable th) {
        this.e.invoke(th);
    }
}
