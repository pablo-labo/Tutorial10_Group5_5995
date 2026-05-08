package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface wca {

    public static final class a {

        /* JADX INFO: renamed from: wca$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.backendservices.data.navigationmenu.NavigationMenuDao$DefaultImpls", f = "NavigationMenuDao.kt", l = {23, 24}, m = "insertCategorizedHamburgerMenu")
        public static final class C0467a extends pu2 {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return a.a(null, null, this);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
        
            if (r7.q(r9, r0) == r5) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object a(defpackage.wca r7, java.util.List<defpackage.we6> r8, defpackage.lu2<? super defpackage.j6g> r9) {
            /*
                boolean r0 = r9 instanceof wca.a.C0467a
                if (r0 == 0) goto L13
                r0 = r9
                wca$a$a r0 = (wca.a.C0467a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                wca$a$a r0 = new wca$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                int r1 = r0.label
                r2 = 0
                r3 = 2
                r4 = 1
                g13 r5 = defpackage.g13.a
                if (r1 == 0) goto L3f
                if (r1 == r4) goto L32
                if (r1 != r3) goto L2c
                defpackage.r7d.b(r9)
                goto L9f
            L2c:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r7)
                return r2
            L32:
                java.lang.Object r7 = r0.L$1
                r8 = r7
                java.util.List r8 = (java.util.List) r8
                java.lang.Object r7 = r0.L$0
                wca r7 = (defpackage.wca) r7
                defpackage.r7d.b(r9)
                goto L73
            L3f:
                defpackage.r7d.b(r9)
                r9 = r8
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r1 = new java.util.ArrayList
                r6 = 10
                int r6 = defpackage.t92.r0(r9, r6)
                r1.<init>(r6)
                java.util.Iterator r9 = r9.iterator()
            L54:
                boolean r6 = r9.hasNext()
                if (r6 == 0) goto L66
                java.lang.Object r6 = r9.next()
                we6 r6 = (defpackage.we6) r6
                ve6 r6 = r6.a
                r1.add(r6)
                goto L54
            L66:
                r0.L$0 = r7
                r0.L$1 = r8
                r0.label = r4
                java.lang.Object r9 = r7.a(r1, r0)
                if (r9 != r5) goto L73
                goto L9e
            L73:
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.Iterator r8 = r8.iterator()
            L7e:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L92
                java.lang.Object r1 = r8.next()
                we6 r1 = (defpackage.we6) r1
                java.util.List<xy1> r1 = r1.b
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                defpackage.w92.w0(r9, r1)
                goto L7e
            L92:
                r0.L$0 = r2
                r0.L$1 = r2
                r0.label = r3
                java.lang.Object r7 = r7.q(r9, r0)
                if (r7 != r5) goto L9f
            L9e:
                return r5
            L9f:
                j6g r7 = defpackage.j6g.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: wca.a.a(wca, java.util.List, lu2):java.lang.Object");
        }
    }

    Object a(ArrayList arrayList, a.C0467a c0467a);

    kl5 b();

    Object c(List list, fca fcaVar);

    Object d(fca fcaVar);

    kl5 e();

    Object f(String str, fca fcaVar);

    Object g(List list, fca fcaVar);

    kl5 h();

    Object i(List list, fca fcaVar);

    ArrayList j();

    Object k(List list, fca fcaVar);

    ArrayList l();

    Object m(boolean z, String str, fca fcaVar);

    ArrayList n();

    Object o(fca fcaVar);

    Object p(List list, fca fcaVar);

    Object q(ArrayList arrayList, a.C0467a c0467a);

    ArrayList r();

    Object s(boolean z, String str, fca fcaVar);
}
