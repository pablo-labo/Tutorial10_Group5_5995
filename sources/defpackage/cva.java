package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class cva extends o81 {
    public final LinkedHashMap d;

    public static final class a {
        public gtc a;
    }

    public static final class b {
        public final Set<String> a;
        public final boolean b;

        public b(Set<String> set, boolean z) {
            this.a = set;
            this.b = z;
        }
    }

    public cva() {
        super(5);
        this.d = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    @Override // defpackage.o81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection<defpackage.gtc> F(java.util.Collection<java.lang.String> r6, defpackage.lt1 r7) {
        /*
            r5 = this;
            r7.getClass()
            java.lang.Object r0 = r5.c
            o81 r0 = (defpackage.o81) r0
            if (r0 == 0) goto L3a
            java.util.Collection r7 = r0.F(r6, r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r0 = 10
            int r0 = defpackage.t92.r0(r7, r0)
            int r0 = defpackage.kc9.V(r0)
            r1 = 16
            if (r0 >= r1) goto L1e
            r0 = r1
        L1e:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L27:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r7.next()
            r2 = r0
            gtc r2 = (defpackage.gtc) r2
            java.lang.String r2 = r2.a
            r1.put(r2, r0)
            goto L27
        L3a:
            bs4 r1 = defpackage.bs4.a
        L3c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L47:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r1.get(r0)
            gtc r2 = (defpackage.gtc) r2
            java.util.LinkedHashMap r3 = r5.d
            java.lang.Object r0 = r3.get(r0)
            cva$a r0 = (cva.a) r0
            if (r0 == 0) goto L79
            if (r2 == 0) goto L77
            gtc r3 = r0.a
            r3.getClass()
            r4 = 0
            kotlin.Pair r2 = r2.b(r3, r4)
            java.lang.Object r2 = r2.d()
            gtc r2 = (defpackage.gtc) r2
            if (r2 != 0) goto L79
        L77:
            gtc r2 = r0.a
        L79:
            if (r2 == 0) goto L47
            r7.add(r2)
            goto L47
        L7f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cva.F(java.util.Collection, lt1):java.util.Collection");
    }

    @Override // defpackage.o81
    public final Set<String> G(Collection<gtc> collection, lt1 lt1Var) {
        collection.getClass();
        lt1Var.getClass();
        o81 o81Var = (o81) this.c;
        return o81Var != null ? o81Var.G(collection, lt1Var) : is4.a;
    }
}
