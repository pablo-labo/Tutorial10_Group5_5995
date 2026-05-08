package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m0<TAnnotation> {
    public static final LinkedHashMap c;
    public final nw7 a;
    public final ConcurrentHashMap<Object, TAnnotation> b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ef0 ef0Var : ef0.values()) {
            String strA = ef0Var.a();
            if (linkedHashMap.get(strA) == null) {
                linkedHashMap.put(strA, ef0Var);
            }
        }
        c = linkedHashMap;
    }

    public m0(nw7 nw7Var) {
        nw7Var.getClass();
        this.a = nw7Var;
        this.b = new ConcurrentHashMap<>();
    }

    public abstract ArrayList a(Object obj, boolean z);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.sw7 b(defpackage.sw7 r14, defpackage.lf0 r15) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0.b(sw7, lf0):sw7");
    }

    public final TAnnotation c(TAnnotation tannotation, mq5 mq5Var) {
        for (TAnnotation tannotation2 : f(tannotation)) {
            if (wl7.b(d(tannotation2), mq5Var)) {
                return tannotation2;
            }
        }
        return null;
    }

    public abstract mq5 d(TAnnotation tannotation);

    public abstract t52 e(Object obj);

    public abstract Iterable<TAnnotation> f(TAnnotation tannotation);

    public final boolean g(TAnnotation tannotation, mq5 mq5Var) {
        Iterable<TAnnotation> iterableF = f(tannotation);
        if ((iterableF instanceof Collection) && ((Collection) iterableF).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = iterableF.iterator();
        while (it.hasNext()) {
            if (wl7.b(d(it.next()), mq5Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r8.equals("ALWAYS") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r8.equals("UNKNOWN") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r8.equals("NEVER") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        if (r8.equals("MAYBE") == false) goto L43;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mma h(TAnnotation r9, boolean r10) {
        /*
            r8 = this;
            mq5 r0 = r8.d(r9)
            r1 = 0
            if (r0 != 0) goto L9
            goto L8d
        L9:
            nw7 r2 = r8.a
            kotlin.jvm.functions.Function1<mq5, v2d> r2 = r2.b
            java.lang.Object r2 = r2.invoke(r0)
            v2d r2 = (defpackage.v2d) r2
            r2.getClass()
            v2d r3 = defpackage.v2d.IGNORE
            if (r2 != r3) goto L1b
            return r1
        L1b:
            java.util.Set<mq5> r3 = defpackage.lc8.k
            boolean r3 = r3.contains(r0)
            lma r4 = defpackage.lma.c
            r5 = 0
            if (r3 == 0) goto L27
            goto L7f
        L27:
            java.util.Set<mq5> r3 = defpackage.lc8.l
            boolean r3 = r3.contains(r0)
            lma r6 = defpackage.lma.b
            if (r3 == 0) goto L33
        L31:
            r4 = r6
            goto L7f
        L33:
            java.util.Set<mq5> r3 = defpackage.lc8.m
            boolean r3 = r3.contains(r0)
            lma r7 = defpackage.lma.a
            if (r3 == 0) goto L3f
        L3d:
            r4 = r7
            goto L7f
        L3f:
            mq5 r3 = defpackage.lc8.g
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L8d
            java.util.ArrayList r8 = r8.a(r9, r5)
            java.lang.Object r8 = defpackage.z92.P0(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L7f
            int r9 = r8.hashCode()
            switch(r9) {
                case 73135176: goto L76;
                case 74175084: goto L6d;
                case 433141802: goto L64;
                case 1933739535: goto L5b;
                default: goto L5a;
            }
        L5a:
            goto L8d
        L5b:
            java.lang.String r9 = "ALWAYS"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L8d
            goto L7f
        L64:
            java.lang.String r9 = "UNKNOWN"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L3d
            goto L8d
        L6d:
            java.lang.String r9 = "NEVER"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L31
            goto L8d
        L76:
            java.lang.String r9 = "MAYBE"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L31
            goto L8d
        L7f:
            mma r8 = new mma
            v2d r9 = defpackage.v2d.WARN
            if (r2 != r9) goto L86
            goto L88
        L86:
            if (r10 == 0) goto L89
        L88:
            r5 = 1
        L89:
            r8.<init>(r4, r5)
            return r8
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0.h(java.lang.Object, boolean):mma");
    }

    public final v2d i(TAnnotation tannotation) {
        String str;
        nw7 nw7Var = this.a;
        v2d v2dVar = nw7Var.a.c.get(d(tannotation));
        if (v2dVar != null) {
            return v2dVar;
        }
        TAnnotation tannotationC = c(tannotation, lc8.q);
        if (tannotationC == null || (str = (String) z92.P0(a(tannotationC, false))) == null) {
            return null;
        }
        v2d v2dVar2 = nw7Var.a.b;
        if (v2dVar2 != null) {
            return v2dVar2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return v2d.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return v2d.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return v2d.WARN;
        }
        return null;
    }

    public final TAnnotation j(TAnnotation tannotation) {
        TAnnotation tannotationJ;
        tannotation.getClass();
        if (!this.a.a.d) {
            if (z92.I0(lc8.j, d(tannotation)) || g(tannotation, lc8.d)) {
                return tannotation;
            }
            if (g(tannotation, lc8.e)) {
                t52 t52VarE = e(tannotation);
                ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.b;
                TAnnotation tannotation2 = concurrentHashMap.get(t52VarE);
                if (tannotation2 != null) {
                    return tannotation2;
                }
                Iterator<TAnnotation> it = f(tannotation).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        tannotationJ = null;
                        break;
                    }
                    tannotationJ = j(it.next());
                    if (tannotationJ != null) {
                        break;
                    }
                }
                if (tannotationJ != null) {
                    TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(t52VarE, tannotationJ);
                    return tannotationPutIfAbsent == null ? tannotationJ : tannotationPutIfAbsent;
                }
            }
        }
        return null;
    }
}
