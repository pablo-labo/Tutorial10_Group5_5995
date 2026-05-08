package defpackage;

import defpackage.ex7;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class gja extends q1 implements ex7 {
    public static final gja b = new gja(ex7.a.a);

    @Override // defpackage.ex7
    @sy3
    public final CancellationException G() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.ex7
    @sy3
    public final d42 L0(d78 d78Var) {
        return jja.a;
    }

    @Override // defpackage.ex7
    public final r6e<ex7> a() {
        return hs4.a;
    }

    @Override // defpackage.ex7
    @sy3
    public final o74 d0(Function1<? super Throwable, j6g> function1) {
        return jja.a;
    }

    @Override // defpackage.ex7
    @sy3
    public final void h(CancellationException cancellationException) {
    }

    @Override // defpackage.ex7
    public final boolean isActive() {
        return true;
    }

    @Override // defpackage.ex7
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.ex7
    @sy3
    public final Object s0(pu2 pu2Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.ex7
    @sy3
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.ex7
    @sy3
    public final o74 v(boolean z, boolean z2, wy7 wy7Var) {
        return jja.a;
    }
}
