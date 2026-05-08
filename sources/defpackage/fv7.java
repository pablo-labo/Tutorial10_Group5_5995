package defpackage;

import defpackage.f55;
import defpackage.rd8;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class fv7 implements f55 {

    public static final class a {
        public static boolean a(fv1 fv1Var, fv1 fv1Var2) {
            fv1Var.getClass();
            fv1Var2.getClass();
            if (!(fv1Var2 instanceof iv7) || !(fv1Var instanceof kv5)) {
                return false;
            }
            iv7 iv7Var = (iv7) fv1Var2;
            iv7Var.i().size();
            kv5 kv5Var = (kv5) fv1Var;
            kv5Var.i().size();
            List<rlg> listI = iv7Var.a().i();
            listI.getClass();
            List<rlg> listI2 = kv5Var.a().i();
            listI2.getClass();
            for (Pair pair : z92.H1(listI, listI2)) {
                rlg rlgVar = (rlg) pair.a();
                rlg rlgVar2 = (rlg) pair.b();
                rlgVar.getClass();
                boolean z = b((kv5) fv1Var2, rlgVar) instanceof rd8.c;
                rlgVar2.getClass();
                if (z != (b(kv5Var, rlgVar2) instanceof rd8.c)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
        
            if (defpackage.b04.g(r0).equals(defpackage.b04.g(r2)) == false) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static defpackage.rd8 b(defpackage.kv5 r6, defpackage.rlg r7) {
            /*
                Method dump skipped, instruction units count: 299
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fv7.a.b(kv5, rlg):rd8");
        }
    }

    @Override // defpackage.f55
    public final f55.a a() {
        return f55.a.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    @Override // defpackage.f55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f55.b b(defpackage.fv1 r5, defpackage.fv1 r6, defpackage.t52 r7) {
        /*
            r4 = this;
            r5.getClass()
            r6.getClass()
            boolean r4 = r5 instanceof defpackage.hv1
            if (r4 == 0) goto L9d
            boolean r4 = r6 instanceof defpackage.kv5
            if (r4 == 0) goto L9d
            boolean r4 = defpackage.ei8.A(r6)
            if (r4 == 0) goto L16
            goto L9d
        L16:
            int r4 = defpackage.pp1.l
            r4 = r6
            kv5 r4 = (defpackage.kv5) r4
            n8a r0 = r4.getName()
            r0.getClass()
            java.util.Set<n8a> r1 = defpackage.qoe.e
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3c
            java.util.ArrayList r0 = defpackage.qoe.a
            n8a r0 = r4.getName()
            r0.getClass()
            java.util.HashSet r1 = defpackage.qoe.j
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3c
            goto L9d
        L3c:
            r0 = r5
            hv1 r0 = (defpackage.hv1) r0
            hv1 r0 = defpackage.ooe.c(r0)
            boolean r1 = r5 instanceof defpackage.kv5
            if (r1 == 0) goto L4b
            r2 = r5
            kv5 r2 = (defpackage.kv5) r2
            goto L4c
        L4b:
            r2 = 0
        L4c:
            if (r2 == 0) goto L59
            boolean r3 = r4.B0()
            boolean r2 = r2.B0()
            if (r3 != r2) goto L59
            goto L62
        L59:
            if (r0 == 0) goto La3
            boolean r2 = r4.B0()
            if (r2 != 0) goto L62
            goto La3
        L62:
            boolean r2 = r7 instanceof defpackage.pu7
            if (r2 == 0) goto L9d
            kv5 r2 = r4.s0()
            if (r2 == 0) goto L6d
            goto L9d
        L6d:
            if (r0 == 0) goto L9d
            boolean r7 = defpackage.ooe.d(r7, r0)
            if (r7 == 0) goto L76
            goto L9d
        L76:
            boolean r7 = r0 instanceof defpackage.kv5
            if (r7 == 0) goto La3
            if (r1 == 0) goto La3
            kv5 r0 = (defpackage.kv5) r0
            kv5 r7 = defpackage.pp1.a(r0)
            if (r7 == 0) goto La3
            r7 = 2
            java.lang.String r4 = defpackage.vs9.a(r4, r7)
            r0 = r5
            kv5 r0 = (defpackage.kv5) r0
            kv5 r0 = r0.a()
            r0.getClass()
            java.lang.String r7 = defpackage.vs9.a(r0, r7)
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto La3
        L9d:
            boolean r4 = fv7.a.a(r5, r6)
            if (r4 == 0) goto La6
        La3:
            f55$b r4 = f55.b.b
            return r4
        La6:
            f55$b r4 = f55.b.c
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv7.b(fv1, fv1, t52):f55$b");
    }
}
