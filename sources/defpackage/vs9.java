package defpackage;

import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes3.dex */
public final class vs9 {
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(defpackage.kv5 r5, int r6) {
        /*
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r6 = r6 & 2
            if (r6 == 0) goto Le
            r1 = r2
        Le:
            r5.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r1 == 0) goto L2d
            boolean r1 = r5 instanceof defpackage.uq2
            if (r1 == 0) goto L1f
            java.lang.String r1 = "<init>"
            goto L2a
        L1f:
            n8a r1 = r5.getName()
            java.lang.String r1 = r1.c()
            r1.getClass()
        L2a:
            r6.append(r1)
        L2d:
            java.lang.String r1 = "("
            r6.append(r1)
            hsc r1 = r5.O()
            vv5 r2 = defpackage.vv5.a
            if (r1 == 0) goto L4c
            ui8 r1 = r1.getType()
            r1.getClass()
            qxf r3 = defpackage.qxf.k
            java.lang.Object r1 = defpackage.ojh.u(r1, r3, r2)
            rd8 r1 = (defpackage.rd8) r1
            r6.append(r1)
        L4c:
            java.util.List r1 = r5.i()
            java.util.Iterator r1 = r1.iterator()
        L54:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L73
            java.lang.Object r3 = r1.next()
            rlg r3 = (defpackage.rlg) r3
            ui8 r3 = r3.getType()
            r3.getClass()
            qxf r4 = defpackage.qxf.k
            java.lang.Object r3 = defpackage.ojh.u(r3, r4, r2)
            rd8 r3 = (defpackage.rd8) r3
            r6.append(r3)
            goto L54
        L73:
            java.lang.String r1 = ")"
            r6.append(r1)
            if (r0 == 0) goto Lb9
            boolean r0 = r5 instanceof defpackage.uq2
            if (r0 == 0) goto L7f
            goto La1
        L7f:
            ui8 r0 = r5.getReturnType()
            r0.getClass()
            n8a r1 = defpackage.ei8.e
            nq5 r1 = ere.a.d
            boolean r0 = defpackage.ei8.E(r0, r1)
            if (r0 == 0) goto La7
            ui8 r0 = r5.getReturnType()
            r0.getClass()
            boolean r0 = defpackage.kyf.e(r0)
            if (r0 != 0) goto La7
            boolean r0 = r5 instanceof defpackage.f4c
            if (r0 != 0) goto La7
        La1:
            java.lang.String r5 = "V"
            r6.append(r5)
            goto Lb9
        La7:
            ui8 r5 = r5.getReturnType()
            r5.getClass()
            qxf r0 = defpackage.qxf.k
            java.lang.Object r5 = defpackage.ojh.u(r5, r0, r2)
            rd8 r5 = (defpackage.rd8) r5
            r6.append(r5)
        Lb9:
            java.lang.String r5 = r6.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs9.a(kv5, int):java.lang.String");
    }

    public static final String b(fv1 fv1Var) {
        fv1Var.getClass();
        if (!yz3.o(fv1Var)) {
            aj3 aj3VarD = fv1Var.d();
            t52 t52Var = aj3VarD instanceof t52 ? (t52) aj3VarD : null;
            if (t52Var != null && !t52Var.getName().b) {
                fv1 fv1VarA = fv1Var.a();
                sfe sfeVar = fv1VarA instanceof sfe ? (sfe) fv1VarA : null;
                if (sfeVar != null) {
                    String strA = a(sfeVar, 3);
                    String str = iw7.a;
                    a62 a62VarG = iw7.g(b04.g(t52Var).a);
                    return g7.e(JwtParser.SEPARATOR_CHAR, a62VarG != null ? xc8.e(a62VarG) : ojh.j(t52Var, jh2.Z), strA);
                }
            }
        }
        return null;
    }
}
