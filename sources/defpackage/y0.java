package defpackage;

import defpackage.ere;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y0 extends a5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(aue aueVar) {
        super(aueVar);
        if (aueVar != null) {
        } else {
            o(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void o(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y0.o(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[RETURN] */
    @Override // defpackage.u62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(defpackage.v62 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.t52
            r1 = 0
            if (r0 == 0) goto L71
            t52 r4 = r4.d()
            r4.getClass()
            n8a r0 = r4.getName()
            n8a r2 = r5.getName()
            boolean r0 = defpackage.wl7.b(r0, r2)
            r2 = 1
            if (r0 != 0) goto L1d
        L1b:
            r4 = r1
            goto L6e
        L1d:
            aj3 r4 = r4.d()
            aj3 r5 = r5.d()
        L25:
            if (r4 == 0) goto L4f
            if (r5 == 0) goto L4f
            boolean r0 = r4 instanceof defpackage.xx9
            if (r0 == 0) goto L30
            boolean r4 = r5 instanceof defpackage.xx9
            goto L6e
        L30:
            boolean r0 = r5 instanceof defpackage.xx9
            if (r0 == 0) goto L35
            goto L1b
        L35:
            boolean r0 = r4 instanceof defpackage.lya
            if (r0 == 0) goto L51
            boolean r0 = r5 instanceof defpackage.lya
            if (r0 == 0) goto L1b
            lya r4 = (defpackage.lya) r4
            mq5 r4 = r4.h()
            lya r5 = (defpackage.lya) r5
            mq5 r5 = r5.h()
            boolean r4 = defpackage.wl7.b(r4, r5)
            if (r4 == 0) goto L1b
        L4f:
            r4 = r2
            goto L6e
        L51:
            boolean r0 = r5 instanceof defpackage.lya
            if (r0 == 0) goto L56
            goto L1b
        L56:
            n8a r0 = r4.getName()
            n8a r3 = r5.getName()
            boolean r0 = defpackage.wl7.b(r0, r3)
            if (r0 != 0) goto L65
            goto L1b
        L65:
            aj3 r4 = r4.d()
            aj3 r5 = r5.d()
            goto L25
        L6e:
            if (r4 == 0) goto L71
            return r2
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y0.f(v62):boolean");
    }

    @Override // defpackage.a5
    public final ui8 h() {
        t52 t52VarD = d();
        if (t52VarD == null) {
            ei8.a(107);
            throw null;
        }
        n8a n8aVar = ei8.e;
        if (ei8.b(t52VarD, ere.a.a) || ei8.b(t52VarD, ere.a.b)) {
            return null;
        }
        return l().e();
    }

    @Override // defpackage.a5
    public final Collection<ui8> i(boolean z) {
        aj3 aj3VarD = d().d();
        if (!(aj3VarD instanceof t52)) {
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            o(3);
            throw null;
        }
        lke lkeVar = new lke();
        t52 t52Var = (t52) aj3VarD;
        lkeVar.add(t52Var.o());
        t52 t52VarM0 = t52Var.m0();
        if (z && t52VarM0 != null) {
            lkeVar.add(t52VarM0.o());
        }
        return lkeVar;
    }

    @Override // defpackage.kwf
    public final ei8 l() {
        ei8 ei8VarE = b04.e(d());
        if (ei8VarE != null) {
            return ei8VarE;
        }
        o(1);
        throw null;
    }

    @Override // defpackage.kwf
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract t52 d();
}
