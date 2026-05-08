package androidx.compose.foundation.lazy.layout;

import defpackage.c0h;
import defpackage.de7;
import defpackage.f3a;
import defpackage.j4a;
import defpackage.mj7;
import defpackage.mna;
import defpackage.o3a;
import defpackage.o6;
import defpackage.oh7;
import defpackage.uq8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class j implements uq8 {
    public final o3a a;
    public final Object[] b;
    public final int c;

    public j(oh7 oh7Var, b<?> bVar) {
        f3a f3aVarF = bVar.f();
        final int i = oh7Var.a;
        if (i < 0) {
            de7.c("negative nearestRange.first");
        }
        final int iMin = Math.min(oh7Var.b, f3aVarF.a - 1);
        if (iMin < i) {
            o3a<Object> o3aVar = mna.a;
            o3aVar.getClass();
            this.a = o3aVar;
            this.b = new Object[0];
            this.c = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.b = new Object[i2];
        this.c = i;
        final o3a o3aVar2 = new o3a(i2);
        Function1 function1 = new Function1() { // from class: androidx.compose.foundation.lazy.layout.i
            /* JADX WARN: Removed duplicated region for block: B:10:0x0041 A[LOOP:0: B:4:0x001d->B:10:0x0041, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[EDGE_INSN: B:13:0x0044->B:11:0x0044 BREAK  A[LOOP:0: B:4:0x001d->B:10:0x0041], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r7) {
                /*
                    r6 = this;
                    mj7 r7 = (defpackage.mj7) r7
                    androidx.compose.foundation.lazy.layout.b$a r0 = r7.c
                    kotlin.jvm.functions.Function1 r0 = r0.getKey()
                    int r1 = r7.a
                    int r2 = r1
                    int r2 = java.lang.Math.max(r2, r1)
                    int r7 = r7.b
                    int r7 = r7 + r1
                    int r7 = r7 + (-1)
                    int r3 = r2
                    int r7 = java.lang.Math.min(r3, r7)
                    if (r2 > r7) goto L44
                L1d:
                    if (r0 == 0) goto L2b
                    int r3 = r2 - r1
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    java.lang.Object r3 = r0.invoke(r3)
                    if (r3 != 0) goto L30
                L2b:
                    androidx.compose.foundation.lazy.layout.DefaultLazyKey r3 = new androidx.compose.foundation.lazy.layout.DefaultLazyKey
                    r3.<init>(r2)
                L30:
                    o3a r4 = r3
                    r4.h(r2, r3)
                    androidx.compose.foundation.lazy.layout.j r4 = r4
                    java.lang.Object[] r5 = r4.b
                    int r4 = r4.c
                    int r4 = r2 - r4
                    r5[r4] = r3
                    if (r2 == r7) goto L44
                    int r2 = r2 + 1
                    goto L1d
                L44:
                    j6g r6 = defpackage.j6g.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.i.invoke(java.lang.Object):java.lang.Object");
            }
        };
        j4a j4aVar = (j4a) f3aVarF.b;
        if (i < 0 || i >= f3aVarF.a) {
            StringBuilder sbG = o6.g(i, "Index ", ", size ");
            sbG.append(f3aVarF.a);
            de7.e(sbG.toString());
        }
        if (iMin < 0 || iMin >= f3aVarF.a) {
            StringBuilder sbG2 = o6.g(iMin, "Index ", ", size ");
            sbG2.append(f3aVarF.a);
            de7.e(sbG2.toString());
        }
        if (iMin < i) {
            de7.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iE = c0h.e(i, j4aVar);
        int i3 = ((mj7) j4aVar.a[iE]).a;
        while (i3 <= iMin) {
            mj7 mj7Var = (mj7) j4aVar.a[iE];
            function1.invoke(mj7Var);
            i3 += mj7Var.b;
            iE++;
        }
        this.a = o3aVar2;
    }

    public final Object a(int i) {
        int i2 = i - this.c;
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = this.b;
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }

    @Override // defpackage.uq8
    public final int c(Object obj) {
        o3a o3aVar = this.a;
        int iD = o3aVar.d(obj);
        if (iD >= 0) {
            return o3aVar.c[iD];
        }
        return -1;
    }
}
