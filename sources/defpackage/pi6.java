package defpackage;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class pi6 {
    public final sl8 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final p3a<e.c> f = new p3a<>((Object) null);
    public final eja g = new eja();
    public final k3a<p3a<qia>> h = new k3a<>(10);

    public static final class a extends mj8 implements gu5<j6g> {
        final /* synthetic */ e.c $pointerInputNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e.c cVar) {
            super(0);
            this.$pointerInputNode = cVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            pi6.this.d(this.$pointerInputNode);
            return j6g.a;
        }
    }

    public pi6(sl8 sl8Var) {
        this.a = sl8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r19, java.util.List<? extends androidx.compose.ui.e.c> r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi6.a(long, java.util.List, boolean):void");
    }

    public final boolean b(aj7 aj7Var, boolean z) {
        r59<yeb> r59Var = aj7Var.a;
        sl8 sl8Var = this.a;
        eja ejaVar = this.g;
        boolean zA = ejaVar.a(r59Var, sl8Var, aj7Var, z);
        j4a<qia> j4aVar = ejaVar.a;
        if (!zA) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        qia[] qiaVarArr = j4aVar.a;
        int i = j4aVar.c;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = qiaVarArr[i2].e(aj7Var, z) || z3;
        }
        qia[] qiaVarArr2 = j4aVar.a;
        int i3 = j4aVar.c;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = qiaVarArr2[i4].d(aj7Var) || z4;
        }
        ejaVar.b(aj7Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            p3a<e.c> p3aVar = this.f;
            int i5 = p3aVar.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d(p3aVar.b(i6));
            }
            p3aVar.i();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            ejaVar.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        eja ejaVar = this.g;
        j4a<qia> j4aVar = ejaVar.a;
        qia[] qiaVarArr = j4aVar.a;
        int i = j4aVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            qiaVarArr[i2].c();
        }
        if (this.d) {
            this.d = true;
        } else {
            ejaVar.a.g();
        }
    }

    public final void d(e.c cVar) {
        if (this.b) {
            this.e = true;
            this.f.g(cVar);
            return;
        }
        eja ejaVar = this.g;
        p3a<eja> p3aVar = ejaVar.b;
        p3aVar.i();
        p3aVar.g(ejaVar);
        while (p3aVar.e()) {
            eja ejaVarK = p3aVar.k(p3aVar.b - 1);
            int i = 0;
            while (true) {
                j4a<qia> j4aVar = ejaVarK.a;
                if (i < j4aVar.c) {
                    qia qiaVar = j4aVar.a[i];
                    if (wl7.b(qiaVar.c, cVar)) {
                        ejaVarK.a.j(qiaVar);
                        qiaVar.c();
                    } else {
                        p3aVar.g(qiaVar);
                        i++;
                    }
                }
            }
        }
    }
}
