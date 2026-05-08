package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.gq2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pc1 {
    public final ArrayList<gq2> a = new ArrayList<>();
    public final a b = new a();
    public final hq2 c;

    public static class a {
        public gq2.a a;
        public gq2.a b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    public interface b {
    }

    public pc1(hq2 hq2Var) {
        this.c = hq2Var;
    }

    public final boolean a(int i, b bVar, gq2 gq2Var) {
        gq2.a[] aVarArr = gq2Var.T;
        int[] iArr = gq2Var.s;
        gq2.a aVar = aVarArr[0];
        a aVar2 = this.b;
        aVar2.a = aVar;
        aVar2.b = aVarArr[1];
        aVar2.c = gq2Var.l();
        aVar2.d = gq2Var.i();
        aVar2.i = false;
        aVar2.j = i;
        gq2.a aVar3 = aVar2.a;
        gq2.a aVar4 = gq2.a.c;
        boolean z = aVar3 == aVar4;
        boolean z2 = aVar2.b == aVar4;
        boolean z3 = z && gq2Var.X > 0.0f;
        boolean z4 = z2 && gq2Var.X > 0.0f;
        gq2.a aVar5 = gq2.a.a;
        if (z3 && iArr[0] == 4) {
            aVar2.a = aVar5;
        }
        if (z4 && iArr[1] == 4) {
            aVar2.b = aVar5;
        }
        ((ConstraintLayout.b) bVar).b(gq2Var, aVar2);
        gq2Var.F(aVar2.e);
        gq2Var.C(aVar2.f);
        gq2Var.D = aVar2.h;
        int i2 = aVar2.g;
        gq2Var.b0 = i2;
        gq2Var.D = i2 > 0;
        aVar2.j = 0;
        return aVar2.i;
    }

    public final void b(hq2 hq2Var, int i, int i2, int i3) {
        int i4 = hq2Var.c0;
        int i5 = hq2Var.d0;
        hq2Var.c0 = 0;
        hq2Var.d0 = 0;
        hq2Var.F(i2);
        hq2Var.C(i3);
        if (i4 < 0) {
            hq2Var.c0 = 0;
        } else {
            hq2Var.c0 = i4;
        }
        if (i5 < 0) {
            hq2Var.d0 = 0;
        } else {
            hq2Var.d0 = i5;
        }
        hq2 hq2Var2 = this.c;
        hq2Var2.t0 = i;
        hq2Var2.I();
    }

    public final void c(hq2 hq2Var) {
        ArrayList<gq2> arrayList = this.a;
        arrayList.clear();
        int size = hq2Var.q0.size();
        for (int i = 0; i < size; i++) {
            gq2 gq2Var = hq2Var.q0.get(i);
            gq2.a[] aVarArr = gq2Var.T;
            gq2.a aVar = aVarArr[0];
            gq2.a aVar2 = gq2.a.c;
            if (aVar == aVar2 || aVarArr[1] == aVar2) {
                arrayList.add(gq2Var);
            }
        }
        hq2Var.s0.b = true;
    }
}
