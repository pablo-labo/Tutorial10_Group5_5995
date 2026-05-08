package defpackage;

import defpackage.x1f;

/* JADX INFO: loaded from: classes3.dex */
public final class zje extends o4b {
    public final q4b d;

    public zje(x1f.m mVar, q4b q4bVar, q4b q4bVar2) {
        super(mVar, q4bVar);
        this.d = q4bVar2;
    }

    public final void f(int i) {
        while (true) {
            int i2 = this.c;
            if (i >= i2) {
                return;
            }
            int i3 = i2 - 1;
            x1f x1fVar = this.b[i3];
            x1f.j jVar = x1fVar.a;
            x1f.j jVar2 = x1f.j.a;
            q4b q4bVar = this.d;
            if (jVar == jVar2) {
                x1f x1fVar2 = q4bVar.d.b[r0.c - 1];
                if (x1fVar2 == x1f.c) {
                    q4bVar.Y0();
                } else if (x1fVar2 == x1f.d) {
                    q4bVar.O0();
                } else if (x1fVar2 == x1f.e) {
                    q4bVar.V0();
                } else if (x1fVar2 == x1f.f) {
                    q4bVar.W0();
                } else if (x1fVar2 == x1f.V) {
                    q4bVar.T0();
                } else if (x1fVar2 == x1f.W) {
                    q4bVar.Q0();
                } else if (x1fVar2 == x1f.X) {
                    q4bVar.i1();
                } else if (x1fVar2 == x1f.Y) {
                    q4bVar.f1();
                } else if (x1fVar2 == x1f.a0) {
                    q4bVar.R0();
                } else {
                    x1f.o oVar = x1f.Z;
                    if (x1fVar2 == oVar) {
                        zkg zkgVar = (zkg) q4bVar;
                        zje zjeVar = zkgVar.d;
                        zjeVar.a(oVar);
                        zkgVar.e.g1(((x1f.i) zjeVar.b()).j0);
                    } else if (x1fVar2 == x1f.b0) {
                        q4bVar.U0();
                    } else if (x1fVar2 == x1f.c0) {
                        q4bVar.e1();
                    } else if (x1fVar2 == x1f.e0) {
                        q4bVar.h1();
                    }
                }
            } else if (jVar == x1f.j.f || jVar == x1f.j.V) {
                d5d d5dVar = (d5d) q4bVar;
                zje zjeVar2 = d5dVar.d;
                x1f x1fVarB = zjeVar2.b();
                if (x1fVarB instanceof x1f.l) {
                    zjeVar2.e(((x1f.l) x1fVarB).k0);
                } else if (x1fVarB instanceof x1f.n) {
                    zjeVar2.e(((x1f.n) x1fVarB).k0);
                } else if (x1fVarB instanceof x1f.q) {
                    zjeVar2.e(((x1f.b) zjeVar2.b()).j0[d5dVar.e.U0()]);
                } else if (x1fVarB instanceof x1f.e) {
                    r40.l(((x1f.e) x1fVarB).k0);
                    return;
                } else if (x1fVarB instanceof x1f.c) {
                    d5dVar.f = d5dVar.e;
                    d5dVar.e = bk3.a(((x1f.c) x1fVarB).k0);
                } else if (x1fVarB == x1f.i0) {
                    d5dVar.e = d5dVar.f;
                }
            } else {
                this.c = i3;
                d(x1fVar);
            }
        }
    }
}
