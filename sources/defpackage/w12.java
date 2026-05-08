package defpackage;

import defpackage.go1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public class w12<E> extends p1<j6g> implements u12<E> {
    public final go1 d;

    public w12(v03 v03Var, go1 go1Var) {
        super(v03Var, true);
        this.d = go1Var;
    }

    @Override // defpackage.g6e
    public final Object b(lu2 lu2Var, Object obj) {
        return this.d.b(lu2Var, obj);
    }

    @Override // defpackage.dsc
    public final Object c(lu2<? super E> lu2Var) {
        return this.d.c(lu2Var);
    }

    @Override // defpackage.g6e
    public final void e(Function1<? super Throwable, j6g> function1) {
        this.d.e(function1);
    }

    @Override // defpackage.g6e
    public final Object f(E e) {
        return this.d.f(e);
    }

    @Override // defpackage.d78, defpackage.ex7
    public final void h(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(x(), null, this);
        }
        t(cancellationException);
    }

    @Override // defpackage.dsc
    public final Object i(rb2 rb2Var) {
        go1 go1Var = this.d;
        go1Var.getClass();
        return go1.D(go1Var, rb2Var);
    }

    @Override // defpackage.dsc
    public final g22<E> iterator() {
        go1 go1Var = this.d;
        go1Var.getClass();
        return new go1.a();
    }

    @Override // defpackage.dsc
    public final Object j() {
        return this.d.j();
    }

    @Override // defpackage.g6e
    public final boolean k(Throwable th) {
        return this.d.n(th, false);
    }

    @Override // defpackage.g6e
    public final boolean l() {
        return this.d.l();
    }

    @Override // defpackage.d78
    public final void t(CancellationException cancellationException) {
        this.d.n(cancellationException, true);
        q(cancellationException);
    }
}
