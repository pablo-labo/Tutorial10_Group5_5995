package defpackage;

import defpackage.xle;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pea extends d4a {
    public final d4a p;
    public boolean q;

    public pea(long j, zle zleVar, Function1<Object, j6g> function1, Function1<Object, j6g> function12, d4a d4aVar) {
        super(j, zleVar, function1, function12);
        this.p = d4aVar;
        d4aVar.k();
    }

    @Override // defpackage.d4a, defpackage.wle
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.q) {
            return;
        }
        this.q = true;
        this.p.l();
    }

    @Override // defpackage.d4a
    public final xle w() {
        pea peaVar;
        d4a d4aVar = this.p;
        if (d4aVar.n || d4aVar.c) {
            return new xle.a(this);
        }
        a4a<pse> a4aVar = this.i;
        long j = this.b;
        HashMap mapB = a4aVar != null ? ame.b(d4aVar.g(), this, this.p.d()) : null;
        Object obj = ame.c;
        synchronized (obj) {
            try {
                ame.c(this);
                if (a4aVar == null || a4aVar.d == 0) {
                    peaVar = this;
                    peaVar.a();
                    j6g j6gVar = j6g.a;
                } else {
                    peaVar = this;
                    xle xleVarZ = peaVar.z(this.p.g(), a4aVar, mapB, this.p.d());
                    if (!wl7.b(xleVarZ, xle.b.a)) {
                        return xleVarZ;
                    }
                    a4a<pse> a4aVarX = peaVar.p.x();
                    if (a4aVarX != null) {
                        a4aVarX.j(a4aVar);
                    } else {
                        peaVar.p.B(a4aVar);
                        peaVar.i = null;
                    }
                }
                if (wl7.d(peaVar.p.g(), j) < 0) {
                    peaVar.p.v();
                }
                d4a d4aVar2 = peaVar.p;
                d4aVar2.r(d4aVar2.d().b(j).a(peaVar.k));
                peaVar.p.A(j);
                d4a d4aVar3 = peaVar.p;
                int i = peaVar.d;
                peaVar.d = -1;
                if (i >= 0) {
                    int[] iArr = d4aVar3.l;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    d4aVar3.l = iArrCopyOf;
                } else {
                    d4aVar3.getClass();
                }
                d4a d4aVar4 = peaVar.p;
                zle zleVar = peaVar.k;
                d4aVar4.getClass();
                synchronized (obj) {
                    d4aVar4.k = d4aVar4.k.f(zleVar);
                    j6g j6gVar2 = j6g.a;
                    d4a d4aVar5 = peaVar.p;
                    int[] iArr2 = peaVar.l;
                    d4aVar5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = d4aVar5.l;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        d4aVar5.l = iArr2;
                    }
                }
                peaVar.n = true;
                if (!peaVar.q) {
                    peaVar.q = true;
                    peaVar.p.l();
                }
                return xle.b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
