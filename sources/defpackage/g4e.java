package defpackage;

import defpackage.u2e;

/* JADX INFO: loaded from: classes.dex */
public final class g4e implements udf {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ j4e b;

    public g4e(boolean z, j4e j4eVar) {
        this.a = z;
        this.b = j4eVar;
    }

    @Override // defpackage.udf
    public final void a() {
        p2e p2eVarG;
        sl8 sl8VarD;
        boolean z = this.a;
        j4e j4eVar = this.b;
        if ((z ? (ooa) ((gme) j4eVar.q).getValue() : (ooa) ((gme) j4eVar.r).getValue()) == null || (p2eVarG = j4eVar.g()) == null) {
            return;
        }
        uzd uzdVarD = j4eVar.d(z ? p2eVarG.a : p2eVarG.b);
        if (uzdVarD == null || (sl8VarD = uzdVarD.d()) == null) {
            return;
        }
        long jA = uzdVarD.a(p2eVarG, z);
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            return;
        }
        ((gme) j4eVar.t).setValue(new ooa(j4eVar.k().G(sl8VarD, t3e.a(jA))));
        ((gme) j4eVar.s).setValue(z ? jf6.b : jf6.c);
        j4eVar.y = false;
        j4eVar.p();
    }

    @Override // defpackage.udf
    public final void b(long j) {
        j4e j4eVar = this.b;
        if (j4eVar.f() == null) {
            return;
        }
        p2e p2eVarG = j4eVar.g();
        p2eVarG.getClass();
        boolean z = this.a;
        uzd uzdVarB = j4eVar.a.c.b((z ? p2eVarG.a : p2eVarG.b).c);
        if (uzdVarB == null) {
            de7.d("SelectionRegistrar should contain the current selection's selectableIds");
            r40.e();
            return;
        }
        uzd uzdVar = uzdVarB;
        sl8 sl8VarD = uzdVar.d();
        if (sl8VarD == null) {
            de7.d("Current selectable should have layout coordinates.");
            r40.e();
            return;
        }
        long jA = uzdVar.a(p2eVarG, z);
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            return;
        }
        ((gme) j4eVar.o).setValue(new ooa(j4eVar.k().G(sl8VarD, t3e.a(jA))));
        ((gme) j4eVar.p).setValue(new ooa(0L));
    }

    @Override // defpackage.udf
    public final void c() {
        j4e j4eVar = this.b;
        j4eVar.y = true;
        j4eVar.p();
        ((gme) j4eVar.s).setValue(null);
        ((gme) j4eVar.t).setValue(null);
    }

    @Override // defpackage.udf
    public final void d(long j) {
        j4e j4eVar = this.b;
        g4a g4aVar = j4eVar.o;
        g4a g4aVar2 = j4eVar.p;
        if (j4eVar.f() == null) {
            return;
        }
        ((gme) g4aVar2).setValue(new ooa(ooa.f(((ooa) ((gme) g4aVar2).getValue()).a, j)));
        long jF = ooa.f(((ooa) ((gme) g4aVar).getValue()).a, ((ooa) ((gme) g4aVar2).getValue()).a);
        if (j4eVar.o(jF, ((ooa) ((gme) j4eVar.o).getValue()).a, this.a, u2e.a.d)) {
            ((gme) g4aVar).setValue(new ooa(jF));
            ((gme) g4aVar2).setValue(new ooa(0L));
        }
    }

    @Override // defpackage.udf
    public final void onCancel() {
        j4e j4eVar = this.b;
        j4eVar.y = true;
        j4eVar.p();
        ((gme) j4eVar.s).setValue(null);
        ((gme) j4eVar.t).setValue(null);
    }

    @Override // defpackage.udf
    public final void onStop() {
        j4e j4eVar = this.b;
        j4eVar.y = true;
        j4eVar.p();
        ((gme) j4eVar.s).setValue(null);
        ((gme) j4eVar.t).setValue(null);
    }
}
