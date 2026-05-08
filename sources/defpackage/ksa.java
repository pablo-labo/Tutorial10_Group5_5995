package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public interface ksa extends qc6 {

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        /* JADX WARN: Type inference failed for: r11v1, types: [zr4] */
        /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object a(defpackage.hsa r9, defpackage.lea r10, kotlin.jvm.functions.Function2 r11, defpackage.pu2 r12) throws com.indeed.android.backendservices.graphql.NotInitializedException {
            /*
                boolean r0 = r12 instanceof defpackage.ssa
                if (r0 == 0) goto L14
                r0 = r12
                ssa r0 = (defpackage.ssa) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.label = r1
            L12:
                r6 = r0
                goto L1a
            L14:
                ssa r0 = new ssa
                r0.<init>(r12)
                goto L12
            L1a:
                java.lang.Object r12 = r6.result
                int r0 = r6.label
                r8 = 0
                r1 = 1
                if (r0 == 0) goto L32
                if (r0 != r1) goto L2c
                java.lang.Object r9 = r6.L$0
                java.lang.String r9 = (java.lang.String) r9
                defpackage.r7d.b(r12)
                goto L5b
            L2c:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r9)
                return r8
            L32:
                defpackage.r7d.b(r12)
                wg2 r12 = defpackage.ewa.c
                if (r12 == 0) goto Lb6
                java.lang.String r3 = r12.H()
                wg2 r12 = defpackage.ewa.c
                if (r12 == 0) goto Lb0
                java.lang.String r2 = defpackage.d93.a()
                hig r4 = new hig
                r4.<init>(r10)
                r6.L$0 = r3
                r6.label = r1
                r7 = 4
                r1 = r9
                r5 = r11
                java.lang.Object r12 = qc6.a.a(r1, r2, r3, r4, r5, r6, r7)
                g13 r9 = defpackage.g13.a
                if (r12 != r9) goto L5a
                return r9
            L5a:
                r9 = r3
            L5b:
                wg0 r12 = (defpackage.wg0) r12
                boolean r10 = r12.d()
                if (r10 == 0) goto Laf
                java.lang.Object r10 = r12.b()
                hig$a r10 = (hig.a) r10
                if (r10 == 0) goto Laf
                hig$c r10 = r10.a
                if (r10 == 0) goto La7
                java.util.ArrayList r10 = r10.a
                java.util.ArrayList r11 = new java.util.ArrayList
                r12 = 10
                int r12 = defpackage.t92.r0(r10, r12)
                r11.<init>(r12)
                java.util.Iterator r10 = r10.iterator()
            L80:
                boolean r12 = r10.hasNext()
                if (r12 == 0) goto La9
                java.lang.Object r12 = r10.next()
                hig$b r12 = (hig.b) r12
                java.lang.Object r0 = r12.a
                java.lang.String r0 = r0.toString()
                vca r1 = r12.b
                java.lang.String r1 = r1.toString()
                java.lang.String r12 = r12.c
                if (r12 != 0) goto L9e
                java.lang.String r12 = ""
            L9e:
                fig r2 = new fig
                r2.<init>(r1, r9, r0, r12)
                r11.add(r2)
                goto L80
            La7:
                zr4 r11 = defpackage.zr4.a
            La9:
                rig r10 = new rig
                r10.<init>(r9, r11)
                return r10
            Laf:
                return r8
            Lb0:
                com.indeed.android.backendservices.graphql.NotInitializedException r9 = new com.indeed.android.backendservices.graphql.NotInitializedException
                r9.<init>()
                throw r9
            Lb6:
                com.indeed.android.backendservices.graphql.NotInitializedException r9 = new com.indeed.android.backendservices.graphql.NotInitializedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ksa.a.a(hsa, lea, kotlin.jvm.functions.Function2, pu2):java.lang.Object");
        }
    }

    Object A(String str, String str2, boolean z, mu9 mu9Var, ArrayList arrayList, List list, gx0 gx0Var, Function2 function2, List list2, dpb dpbVar);

    Object B(ih2 ih2Var, l8d l8dVar);

    Object C(wnf wnfVar, cj2 cj2Var, x56 x56Var);

    Object E(String str, String str2, String str3, b8c b8cVar, String str4, e77 e77Var, js0 js0Var, d97 d97Var);

    Object H(zt3 zt3Var, ih2 ih2Var, k8d k8dVar);

    Object J(String str, String str2, fj2 fj2Var, f83 f83Var);

    Object K(pa paVar, sga sgaVar);

    Object M(ih2 ih2Var, p8d p8dVar);

    Object N(List list, dm0 dm0Var, kkb kkbVar);

    Object Q(List list, Function2 function2, pu2 pu2Var);

    Object R(lr lrVar, a2g a2gVar);

    wg0 f(e45 e45Var);

    Object h(xd xdVar, pga pgaVar);

    Object k(ih2 ih2Var, n8d n8dVar);

    Object l(lea leaVar, Function2 function2, pig pigVar);

    Object m(mm mmVar, ih2 ih2Var, p8d p8dVar);

    Object o(String str, cm0 cm0Var, g83 g83Var);

    Object q(ArrayList arrayList, dm0 dm0Var, pu2 pu2Var);

    Object t(u58 u58Var, dm0 dm0Var, pu2 pu2Var);

    Object u(ov ovVar, el0 el0Var);

    Object v(us0 us0Var, l36 l36Var);

    Object x(rh2 rh2Var, f16 f16Var);
}
