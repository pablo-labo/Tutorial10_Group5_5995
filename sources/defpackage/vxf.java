package defpackage;

import defpackage.j29;

/* JADX INFO: loaded from: classes3.dex */
public final class vxf {
    public final beb a;
    public final d2f b;
    public final j29.k c;

    public static final class a {
        public final rxf a;
        public final lw7 b;

        public a(rxf rxfVar, lw7 lw7Var) {
            rxfVar.getClass();
            lw7Var.getClass();
            this.a = rxfVar;
            this.b = lw7Var;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(aVar.a, this.a) && wl7.b(aVar.b, this.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode();
            return this.b.hashCode() + (iHashCode * 31) + iHashCode;
        }

        public final String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.b + ')';
        }
    }

    public vxf(beb bebVar) {
        this.a = bebVar;
        j29 j29Var = new j29("Type parameter upper bound erasure results");
        int i = 2;
        this.b = new d2f(new de8(this, i));
        this.c = j29Var.g(new x52(this, i));
    }

    public final p7g a(lw7 lw7Var) {
        p7g p7gVarL;
        mge mgeVar = lw7Var.g;
        return (mgeVar == null || (p7gVarL = boa.L(mgeVar)) == null) ? (hx4) this.b.getValue() : p7gVarL;
    }

    public final ui8 b(rxf rxfVar, lw7 lw7Var) {
        rxfVar.getClass();
        lw7Var.getClass();
        return (ui8) this.c.invoke(new a(rxfVar, lw7Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.fae c(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r17, java.util.List r18, defpackage.lw7 r19) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxf.c(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor, java.util.List, lw7):fae");
    }
}
