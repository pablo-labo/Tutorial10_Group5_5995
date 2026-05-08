package defpackage;

import defpackage.ch5;
import defpackage.e5c;
import defpackage.gd8;
import defpackage.od8;
import defpackage.rw5;
import defpackage.u4c;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class pd8 {
    public static final s45 a;

    static {
        s45 s45Var = new s45();
        s45Var.a(od8.a);
        s45Var.a(od8.b);
        s45Var.a(od8.c);
        s45Var.a(od8.d);
        s45Var.a(od8.e);
        s45Var.a(od8.f);
        s45Var.a(od8.g);
        s45Var.a(od8.h);
        s45Var.a(od8.i);
        s45Var.a(od8.j);
        s45Var.a(od8.k);
        s45Var.a(od8.l);
        s45Var.a(od8.m);
        s45Var.a(od8.n);
        a = s45Var;
    }

    public static gd8.b a(w4c w4cVar, o8a o8aVar, hyf hyfVar) {
        String strW0;
        w4cVar.getClass();
        o8aVar.getClass();
        hyfVar.getClass();
        rw5.e<w4c, od8.b> eVar = od8.a;
        eVar.getClass();
        od8.b bVar = (od8.b) r5c.a(w4cVar, eVar);
        String string = (bVar == null || !bVar.p()) ? "<init>" : o8aVar.getString(bVar.n());
        if (bVar == null || !bVar.o()) {
            List<n5c> listC = w4cVar.C();
            listC.getClass();
            List<n5c> list = listC;
            ArrayList arrayList = new ArrayList(t92.r0(list, 10));
            for (n5c n5cVar : list) {
                n5cVar.getClass();
                String strE = e(y5c.e(n5cVar, hyfVar), o8aVar);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strW0 = z92.W0(arrayList, "", "(", ")V", null, 56);
        } else {
            strW0 = o8aVar.getString(bVar.m());
        }
        return new gd8.b(string, strW0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 java.lang.String, still in use, count: 2, list:
          (r3v2 java.lang.String) from 0x0053: IF  (r3v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0055 A[HIDDEN]
          (r3v2 java.lang.String) from 0x0056: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:22:0x0053, B:20:0x0042] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static gd8.a b(defpackage.g5c r3, defpackage.o8a r4, defpackage.hyf r5, boolean r6) {
        /*
            r3.getClass()
            r4.getClass()
            r5.getClass()
            rw5$e<g5c, od8$c> r0 = defpackage.od8.d
            r0.getClass()
            java.lang.Object r0 = defpackage.r5c.a(r3, r0)
            od8$c r0 = (od8.c) r0
            r1 = 0
            if (r0 != 0) goto L18
            goto L55
        L18:
            boolean r2 = r0.v()
            if (r2 == 0) goto L23
            od8$a r0 = r0.q()
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 != 0) goto L29
            if (r6 == 0) goto L29
            goto L55
        L29:
            if (r0 == 0) goto L36
            boolean r6 = r0.p()
            if (r6 == 0) goto L36
            int r6 = r0.n()
            goto L3a
        L36:
            int r6 = r3.S()
        L3a:
            if (r0 == 0) goto L4b
            boolean r2 = r0.o()
            if (r2 == 0) goto L4b
            int r3 = r0.m()
            java.lang.String r3 = r4.getString(r3)
            goto L56
        L4b:
            j5c r3 = defpackage.y5c.d(r3, r5)
            java.lang.String r3 = e(r3, r4)
            if (r3 != 0) goto L56
        L55:
            return r1
        L56:
            gd8$a r5 = new gd8$a
            java.lang.String r4 = r4.getString(r6)
            r5.<init>(r4, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd8.b(g5c, o8a, hyf, boolean):gd8$a");
    }

    public static gd8.b c(b5c b5cVar, o8a o8aVar, hyf hyfVar) {
        String strConcat;
        b5cVar.getClass();
        o8aVar.getClass();
        hyfVar.getClass();
        rw5.e<b5c, od8.b> eVar = od8.b;
        eVar.getClass();
        od8.b bVar = (od8.b) r5c.a(b5cVar, eVar);
        int iT = (bVar == null || !bVar.p()) ? b5cVar.T() : bVar.n();
        if (bVar == null || !bVar.o()) {
            List listB0 = u63.b0(y5c.b(b5cVar, hyfVar));
            List<n5c> listB02 = b5cVar.b0();
            listB02.getClass();
            List<n5c> list = listB02;
            ArrayList arrayList = new ArrayList(t92.r0(list, 10));
            for (n5c n5cVar : list) {
                n5cVar.getClass();
                arrayList.add(y5c.e(n5cVar, hyfVar));
            }
            ArrayList arrayListH1 = z92.h1(listB0, arrayList);
            ArrayList arrayList2 = new ArrayList(t92.r0(arrayListH1, 10));
            Iterator it = arrayListH1.iterator();
            while (it.hasNext()) {
                String strE = e((j5c) it.next(), o8aVar);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(y5c.c(b5cVar, hyfVar), o8aVar);
            if (strE2 == null) {
                return null;
            }
            strConcat = z92.W0(arrayList2, "", "(", ")", null, 56).concat(strE2);
        } else {
            strConcat = o8aVar.getString(bVar.m());
        }
        return new gd8.b(o8aVar.getString(iT), strConcat);
    }

    public static final boolean d(g5c g5cVar) {
        g5cVar.getClass();
        ch5.a aVar = zc8.a;
        Object objL = g5cVar.l(od8.e);
        objL.getClass();
        return aVar.c(((Number) objL).intValue()).booleanValue();
    }

    public static String e(j5c j5cVar, o8a o8aVar) {
        if (j5cVar.a0()) {
            return e62.b(o8aVar.b(j5cVar.N()));
        }
        return null;
    }

    public static final Pair<hd8, u4c> f(String[] strArr, String[] strArr2) throws InvalidProtocolBufferException {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ag1.a(strArr));
        hd8 hd8VarG = g(byteArrayInputStream, strArr2);
        u4c.a aVar = u4c.b;
        aVar.getClass();
        e92 e92Var = new e92(byteArrayInputStream);
        rp9 rp9Var = (rp9) aVar.a(e92Var, a);
        try {
            e92Var.a(0);
            p3.b(rp9Var);
            return new Pair<>(hd8VarG, (u4c) rp9Var);
        } catch (InvalidProtocolBufferException e) {
            e.b(rp9Var);
            throw e;
        }
    }

    public static hd8 g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        od8.d dVar = (od8.d) od8.d.b.c(byteArrayInputStream, a);
        dVar.getClass();
        strArr.getClass();
        List<Integer> listN = dVar.n();
        Set setE1 = listN.isEmpty() ? is4.a : z92.E1(listN);
        List<od8.d.c> listO = dVar.o();
        listO.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(listO.size());
        for (od8.d.c cVar : listO) {
            int iV = cVar.v();
            for (int i = 0; i < iV; i++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return new hd8(strArr, setE1, arrayList);
    }

    public static final Pair<hd8, e5c> h(String[] strArr, String[] strArr2) throws InvalidProtocolBufferException {
        strArr.getClass();
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ag1.a(strArr));
        hd8 hd8VarG = g(byteArrayInputStream, strArr2);
        e5c.a aVar = e5c.b;
        aVar.getClass();
        e92 e92Var = new e92(byteArrayInputStream);
        rp9 rp9Var = (rp9) aVar.a(e92Var, a);
        try {
            e92Var.a(0);
            p3.b(rp9Var);
            return new Pair<>(hd8VarG, (e5c) rp9Var);
        } catch (InvalidProtocolBufferException e) {
            e.b(rp9Var);
            throw e;
        }
    }
}
