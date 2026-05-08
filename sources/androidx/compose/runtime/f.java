package androidx.compose.runtime;

import defpackage.e13;
import defpackage.eu2;
import defpackage.f13;
import defpackage.im2;
import defpackage.j6g;
import defpackage.k0d;
import defpackage.lu2;
import defpackage.u63;
import defpackage.uqe;
import defpackage.v03;
import defpackage.vr4;
import defpackage.z03;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class f implements k0d, z03 {
    public final v03 a;
    public final Function2<e13, lu2<? super j6g>, Object> b;
    public final eu2 c;
    public uqe d;

    /* JADX WARN: Multi-variable type inference failed */
    public f(v03 v03Var, Function2<? super e13, ? super lu2<? super j6g>, ? extends Object> function2) {
        this.a = v03Var;
        this.b = function2;
        this.c = f13.a(v03Var.d1(v03Var.h1(im2.b) != null ? this : vr4.a));
    }

    @Override // defpackage.z03
    public final void N0(v03 v03Var, Throwable th) throws Throwable {
        im2 im2Var = (im2) v03Var.h1(im2.b);
        if (im2Var != null) {
            im2Var.c(this, th);
        }
        z03 z03Var = (z03) this.a.h1(z03.a.a);
        if (z03Var == null) {
            throw th;
        }
        z03Var.N0(v03Var, th);
    }

    @Override // defpackage.v03
    public final v03 P(v03.b<?> bVar) {
        return v03.a.C0438a.b(this, bVar);
    }

    @Override // defpackage.k0d
    public final void b() {
        uqe uqeVar = this.d;
        if (uqeVar != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            uqeVar.h(cancellationException);
        }
        this.d = u63.Y(this.c, null, null, this.b, 3);
    }

    @Override // defpackage.k0d
    public final void d() {
        uqe uqeVar = this.d;
        if (uqeVar != null) {
            uqeVar.t(new LeftCompositionCancellationException());
        }
        this.d = null;
    }

    @Override // defpackage.v03
    public final v03 d1(v03 v03Var) {
        return v03.a.C0438a.c(this, v03Var);
    }

    @Override // defpackage.k0d
    public final void e() {
        uqe uqeVar = this.d;
        if (uqeVar != null) {
            uqeVar.t(new LeftCompositionCancellationException());
        }
        this.d = null;
    }

    @Override // v03.a
    public final v03.b<?> getKey() {
        return z03.a.a;
    }

    @Override // defpackage.v03
    public final <E extends v03.a> E h1(v03.b<E> bVar) {
        return (E) v03.a.C0438a.a(this, bVar);
    }

    @Override // defpackage.v03
    public final <R> R j1(R r, Function2<? super R, ? super v03.a, ? extends R> function2) {
        return function2.invoke(r, this);
    }
}
