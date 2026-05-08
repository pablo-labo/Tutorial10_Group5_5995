package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ys9 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092 A[EDGE_INSN: B:45:0x0092->B:41:0x0092 BREAK  A[LOOP:0: B:11:0x0014->B:49:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<defpackage.xs9> a(xed.e r9, int r10, int r11) {
        /*
            r9.getClass()
            if (r10 != r11) goto L8
            zr4 r9 = defpackage.zr4.a
            return r9
        L8:
            r0 = 0
            r1 = 1
            if (r11 <= r10) goto Le
            r2 = r1
            goto Lf
        Le:
            r2 = r0
        Lf:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L14:
            if (r2 == 0) goto L19
            if (r10 >= r11) goto L93
            goto L1b
        L19:
            if (r10 <= r11) goto L93
        L1b:
            java.util.LinkedHashMap r4 = r9.a
            r5 = 0
            if (r2 == 0) goto L38
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L2e
        L2c:
            r7 = r5
            goto L4e
        L2e:
            java.util.NavigableSet r6 = r4.descendingKeySet()
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r4, r6)
            goto L4e
        L38:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L45
            goto L2c
        L45:
            java.util.Set r6 = r4.keySet()
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r4, r6)
        L4e:
            if (r7 != 0) goto L51
            goto L92
        L51:
            java.lang.Object r4 = r7.a()
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r6 = r7.b()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8f
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L7a
            int r8 = r10 + 1
            if (r8 > r7) goto L61
            if (r7 > r11) goto L61
            goto L7e
        L7a:
            if (r11 > r7) goto L61
            if (r7 >= r10) goto L61
        L7e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r4.get(r10)
            r10.getClass()
            r3.add(r10)
            r4 = r1
            r10 = r7
            goto L90
        L8f:
            r4 = r0
        L90:
            if (r4 != 0) goto L14
        L92:
            return r5
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys9.a(xed$e, int, int):java.util.List");
    }

    public static final boolean b(qf3 qf3Var, int i, int i2) {
        qf3Var.getClass();
        if (i > i2 && qf3Var.l) {
            return false;
        }
        Set<Integer> set = qf3Var.m;
        return qf3Var.k && (set == null || !set.contains(Integer.valueOf(i)));
    }
}
