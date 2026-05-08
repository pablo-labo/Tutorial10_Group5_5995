package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z12<T> implements xv5<T> {
    public final v03 a;
    public final int b;
    public final eo1 c;

    public z12(v03 v03Var, int i, eo1 eo1Var) {
        this.a = v03Var;
        this.b = i;
        this.c = eo1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // defpackage.xv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.vi5<T> d(defpackage.v03 r5, int r6, defpackage.eo1 r7) {
        /*
            r4 = this;
            v03 r0 = r4.a
            v03 r5 = r5.d1(r0)
            eo1 r1 = defpackage.eo1.a
            eo1 r2 = r4.c
            int r3 = r4.b
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = defpackage.wl7.b(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            z12 r4 = r4.k(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z12.d(v03, int, eo1):vi5");
    }

    @Override // defpackage.vi5
    public Object e(wi5<? super T> wi5Var, lu2<? super j6g> lu2Var) {
        Object objD = f13.d(new x12(wi5Var, this, null), lu2Var);
        return objD == g13.a ? objD : j6g.a;
    }

    public String g() {
        return null;
    }

    public abstract Object j(upb<? super T> upbVar, lu2<? super j6g> lu2Var);

    public abstract z12<T> k(v03 v03Var, int i, eo1 eo1Var);

    public vi5<T> l() {
        return null;
    }

    public dsc<T> m(e13 e13Var) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        Function2 y12Var = new y12(this, null);
        rpb rpbVar = new rpb(x03.b(e13Var, this.a), h22.a(i, 4, this.c));
        rpbVar.l0(i13.c, rpbVar, y12Var);
        return rpbVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strG = g();
        if (strG != null) {
            arrayList.add(strG);
        }
        vr4 vr4Var = vr4.a;
        v03 v03Var = this.a;
        if (v03Var != vr4Var) {
            arrayList.add("context=" + v03Var);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        eo1 eo1Var = eo1.a;
        eo1 eo1Var2 = this.c;
        if (eo1Var2 != eo1Var) {
            arrayList.add("onBufferOverflow=" + eo1Var2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return w40.f(sb, z92.W0(arrayList, ", ", null, null, null, 62), ']');
    }
}
