package defpackage;

import defpackage.gq2;

/* JADX INFO: loaded from: classes.dex */
public abstract class ezg implements ny3 {
    public int a;
    public gq2 b;
    public nhd c;
    public gq2.a d;
    public final v44 e = new v44(this);
    public int f = 0;
    public boolean g = false;
    public final ry3 h = new ry3(this);
    public final ry3 i = new ry3(this);
    public a j = a.a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("NONE", 0);
            a = aVar;
            a aVar2 = new a("START", 1);
            a aVar3 = new a("END", 2);
            a aVar4 = new a("CENTER", 3);
            b = aVar4;
            c = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public ezg(gq2 gq2Var) {
        this.b = gq2Var;
    }

    public static void b(ry3 ry3Var, ry3 ry3Var2, int i) {
        ry3Var.l.add(ry3Var2);
        ry3Var.f = i;
        ry3Var2.k.add(ry3Var);
    }

    public static ry3 h(wp2 wp2Var) {
        wp2 wp2Var2 = wp2Var.f;
        if (wp2Var2 == null) {
            return null;
        }
        gq2 gq2Var = wp2Var2.d;
        int iOrdinal = wp2Var2.e.ordinal();
        if (iOrdinal == 1) {
            return gq2Var.d.h;
        }
        if (iOrdinal == 2) {
            return gq2Var.e.h;
        }
        if (iOrdinal == 3) {
            return gq2Var.d.i;
        }
        if (iOrdinal == 4) {
            return gq2Var.e.i;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return gq2Var.e.k;
    }

    public static ry3 i(wp2 wp2Var, int i) {
        wp2 wp2Var2 = wp2Var.f;
        if (wp2Var2 == null) {
            return null;
        }
        gq2 gq2Var = wp2Var2.d;
        ezg ezgVar = i == 0 ? gq2Var.d : gq2Var.e;
        int iOrdinal = wp2Var2.e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return ezgVar.h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return ezgVar.i;
        }
        return null;
    }

    @Override // defpackage.ny3
    public void a(ny3 ny3Var) {
    }

    public final void c(ry3 ry3Var, ry3 ry3Var2, int i, v44 v44Var) {
        ry3Var.l.add(ry3Var2);
        ry3Var.l.add(this.e);
        ry3Var.h = i;
        ry3Var.i = v44Var;
        ry3Var2.k.add(ry3Var);
        v44Var.k.add(ry3Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        gq2 gq2Var = this.b;
        if (i2 == 0) {
            int i3 = gq2Var.u;
            int iMax = Math.max(gq2Var.t, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = gq2Var.x;
            int iMax2 = Math.max(gq2Var.w, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        if (this.e.j) {
            return r2.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.wp2 r13, defpackage.wp2 r14, int r15) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezg.l(wp2, wp2, int):void");
    }
}
