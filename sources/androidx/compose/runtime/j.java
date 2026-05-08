package androidx.compose.runtime;

import defpackage.b0d;
import defpackage.nr0;
import defpackage.p3a;
import defpackage.pxf;
import defpackage.wk2;
import defpackage.z2a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class j<N> implements nr0<N> {
    public final z2a a = new z2a();
    public final p3a<Object> b = new p3a<>((Object) null);
    public final N c;

    public j(N n) {
        this.c = n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(nr0<N> nr0Var, b0d b0dVar) {
        Exception exc;
        int i;
        z2a z2aVar = this.a;
        int i2 = z2aVar.b;
        p3a p3aVar = new p3a((Object) null);
        nr0Var.getClass();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            p3a<Object> p3aVar2 = this.b;
            if (i3 >= i2) {
                if (i4 != p3aVar2.b) {
                    d.c("Applier operation size mismatch");
                }
                p3aVar2.i();
                z2aVar.b = 0;
                nr0Var.h();
                return;
            }
            int i5 = i3 + 1;
            try {
                try {
                    switch (z2aVar.a(i3)) {
                        case 0:
                            nr0Var.p();
                            i3 = i5;
                            break;
                        case 1:
                            int i6 = i4 + 1;
                            nr0Var.m(p3aVar2.b(i4));
                            i4 = i6;
                            i3 = i5;
                            break;
                        case 2:
                            int i7 = i3 + 2;
                            i3 += 3;
                            nr0Var.f(z2aVar.a(i5), z2aVar.a(i7));
                            break;
                        case 3:
                            int i8 = i3 + 2;
                            try {
                                int i9 = i3 + 3;
                                try {
                                    i3 += 4;
                                    nr0Var.e(z2aVar.a(i5), z2aVar.a(i8), z2aVar.a(i9));
                                } catch (Exception e) {
                                    exc = e;
                                    i3 = i9;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i3 = i8;
                            }
                            break;
                        case 4:
                            nr0Var.clear();
                            i3 = i5;
                            break;
                        case 5:
                            i3 += 2;
                            i = i4 + 1;
                            nr0Var.l(z2aVar.a(i5), p3aVar2.b(i4));
                            i4 = i;
                            break;
                        case 6:
                            i3 += 2;
                            try {
                                i = i4 + 1;
                                nr0Var.g(z2aVar.a(i5), p3aVar2.b(i4));
                                i4 = i;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i10 = i4 + 1;
                            Object objB = p3aVar2.b(i4);
                            objB.getClass();
                            pxf.d(2, objB);
                            i4 += 2;
                            nr0Var.b(p3aVar2.b(i10), (Function2) objB);
                            i3 = i5;
                            break;
                        case 8:
                            Object objC = nr0Var.c();
                            if (objC instanceof wk2) {
                                wk2 wk2Var = (wk2) objC;
                                if (b0dVar.f.j(wk2Var)) {
                                    wk2Var.c();
                                }
                            }
                            p3aVar.g(objC);
                            nr0Var.n();
                            i3 = i5;
                            break;
                        default:
                            i3 = i5;
                            break;
                    }
                } catch (Throwable th) {
                    nr0Var.h();
                    throw th;
                }
            } catch (Exception e4) {
                exc = e4;
                i3 = i5;
            }
            exc = e3;
            throw new ComposePausableCompositionException(p3aVar2, p3aVar, z2aVar, i3, exc);
        }
    }

    @Override // defpackage.nr0
    public final void b(Object obj, Function2 function2) {
        this.a.c(7);
        p3a<Object> p3aVar = this.b;
        p3aVar.g(function2);
        p3aVar.g(obj);
    }

    @Override // defpackage.nr0
    public final N c() {
        return this.c;
    }

    @Override // defpackage.nr0
    public final void clear() {
        this.a.c(4);
    }

    @Override // defpackage.nr0
    public final void e(int i, int i2, int i3) {
        z2a z2aVar = this.a;
        z2aVar.c(3);
        z2aVar.c(i);
        z2aVar.c(i2);
        z2aVar.c(i3);
    }

    @Override // defpackage.nr0
    public final void f(int i, int i2) {
        z2a z2aVar = this.a;
        z2aVar.c(2);
        z2aVar.c(i);
        z2aVar.c(i2);
    }

    @Override // defpackage.nr0
    public final void g(int i, N n) {
        z2a z2aVar = this.a;
        z2aVar.c(6);
        z2aVar.c(i);
        this.b.g(n);
    }

    @Override // defpackage.nr0
    public final void l(int i, N n) {
        z2a z2aVar = this.a;
        z2aVar.c(5);
        z2aVar.c(i);
        this.b.g(n);
    }

    @Override // defpackage.nr0
    public final void m(N n) {
        this.a.c(1);
        this.b.g(n);
    }

    @Override // defpackage.nr0
    public final void n() {
        this.a.c(8);
    }

    @Override // defpackage.nr0
    public final void p() {
        this.a.c(0);
    }
}
