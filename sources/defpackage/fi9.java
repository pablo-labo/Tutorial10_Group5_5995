package defpackage;

import androidx.media3.session.g;
import androidx.media3.session.j;
import androidx.media3.session.k;
import androidx.media3.session.m;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fi9 implements k.c, m.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fi9(int i, qyc qycVar) {
        this.a = i;
        this.b = qycVar;
    }

    @Override // androidx.media3.session.m.a
    public void f(final k kVar) {
        List list = (List) this.b;
        if (kVar.o0()) {
            qyc qycVar = kVar.t;
            qyc qycVar2 = kVar.u;
            kVar.r = e47.j(list);
            qyc qycVarQ1 = k.q1(kVar.s, list, kVar.v, kVar.y, kVar.I);
            kVar.t = qycVarQ1;
            kVar.u = k.p1(qycVarQ1, list, kVar.I, kVar.v, kVar.y);
            final boolean z = !kVar.t.equals(qycVar);
            final boolean z2 = !kVar.u.equals(qycVar2);
            j jVarZ0 = kVar.Z0();
            final int i = this.a;
            jVarZ0.o0(new wq2(z2, z, i) { // from class: vg9
                public final /* synthetic */ boolean b;
                public final /* synthetic */ int c;

                {
                    this.b = z;
                    this.c = i;
                }

                @Override // defpackage.wq2
                public final void accept(Object obj) {
                    j.a aVar = (j.a) obj;
                    aVar.getClass();
                    u37 u37VarC = j.a.C();
                    if (this.b) {
                        aVar.x();
                    }
                    u37VarC.a(new yg9(this.a, u37VarC, this.c), h54.a);
                }
            });
        }
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        k kVar = (k) this.b;
        gVar.W0(kVar.c, i, this.a);
    }

    public /* synthetic */ fi9(k kVar, int i) {
        this.b = kVar;
        this.a = i;
    }
}
