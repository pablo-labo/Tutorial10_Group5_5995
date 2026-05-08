package defpackage;

import defpackage.rs2;

/* JADX INFO: loaded from: classes.dex */
public final class o03 extends zs3 implements c5e {
    public vrf f0;
    public jhf g0;
    public lu8 h0;
    public boolean i0;
    public boolean j0;
    public roa k0;
    public rgf l0;
    public t37 m0;
    public sm5 n0;

    public static void f2(lu8 lu8Var, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        whf whfVar = lu8Var.e;
        pq pqVar = lu8Var.v;
        if (whfVar == null) {
            int length = str.length();
            pqVar.invoke(new jhf(str, cr8.c(length, length), 4));
        } else {
            jhf jhfVarA = lu8Var.d.a(u63.a0(new xt3(), new kc2(str, 1)));
            whfVar.a(null, jhfVarA);
            pqVar.invoke(jhfVarA);
        }
    }

    @Override // defpackage.c5e
    public final void F0(s5e s5eVar) {
        le0 le0Var = this.g0.a;
        qf8<Object>[] qf8VarArr = o5e.a;
        r5e<le0> r5eVar = k5e.D;
        qf8<Object>[] qf8VarArr2 = o5e.a;
        qf8<Object> qf8Var = qf8VarArr2[17];
        s5eVar.a(r5eVar, le0Var);
        le0 le0Var2 = this.f0.a;
        r5e<le0> r5eVar2 = k5e.E;
        qf8<Object> qf8Var2 = qf8VarArr2[18];
        s5eVar.a(r5eVar2, le0Var2);
        long j = this.g0.b;
        r5e<kjf> r5eVar3 = k5e.F;
        qf8<Object> qf8Var3 = qf8VarArr2[19];
        s5eVar.a(r5eVar3, new kjf(j));
        r5e<rs2> r5eVar4 = k5e.r;
        qf8<Object> qf8Var4 = qf8VarArr2[9];
        s5eVar.a(r5eVar4, rs2.a.a);
        s5eVar.a(v4e.g, new r5(null, new a3(this, 8)));
        if (!this.j0) {
            s5eVar.a(k5e.i, j6g.a);
        }
        int i = 0;
        boolean z = this.j0 && !this.i0;
        r5e<Boolean> r5eVar5 = k5e.M;
        qf8<Object> qf8Var5 = qf8VarArr2[25];
        s5eVar.a(r5eVar5, Boolean.valueOf(z));
        o5e.b(s5eVar, new wi(this, 3));
        int i2 = 5;
        if (z) {
            s5eVar.a(v4e.j, new r5(null, new tv(this, i2)));
            s5eVar.a(v4e.n, new r5(null, new qs0(3, this, s5eVar)));
        }
        s5eVar.a(v4e.i, new r5(null, new n03(this, i)));
        int i3 = this.m0.e;
        vv vvVar = new vv(this, 3);
        s5eVar.a(k5e.G, new s37(i3));
        s5eVar.a(v4e.o, new r5(null, vvVar));
        s5eVar.a(v4e.b, new r5(null, new oa(this, 4)));
        int i4 = 6;
        s5eVar.a(v4e.c, new r5(null, new nv(this, i4)));
        if (!kjf.c(this.g0.b)) {
            s5eVar.a(v4e.p, new r5(null, new oj(this, 6)));
            if (this.j0 && !this.i0) {
                s5eVar.a(v4e.q, new r5(null, new fy(this, 5)));
            }
        }
        if (!this.j0 || this.i0) {
            return;
        }
        s5eVar.a(v4e.r, new r5(null, new k30(this, i4)));
    }

    @Override // defpackage.c5e
    public final boolean L1() {
        return true;
    }
}
