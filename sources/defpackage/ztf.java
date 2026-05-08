package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ztf {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final xed a;
    public final HashMap b;
    public final HashMap c;
    public final boolean d;
    public final lm7 e;
    public final String[] g;
    public final coa h;
    public final eoa i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public gu5<Boolean> k = new zw(22);
    public final LinkedHashMap f = new LinkedHashMap();

    public static final class a {
    }

    @uh3(c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", f = "InvalidationTracker.kt", l = {389}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ gu5<j6g> $onRefreshCompleted;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gu5<j6g> gu5Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$onRefreshCompleted = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return ztf.this.new b(this.$onRefreshCompleted, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    ztf ztfVar = ztf.this;
                    this.label = 1;
                    obj = ztfVar.d(this);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                this.$onRefreshCompleted.invoke();
                return j6g.a;
            } catch (Throwable th) {
                this.$onRefreshCompleted.invoke();
                throw th;
            }
        }
    }

    public ztf(xed xedVar, HashMap map, HashMap map2, String[] strArr, boolean z, lm7 lm7Var) {
        String lowerCase;
        this.a = xedVar;
        this.b = map;
        this.c = map2;
        this.d = z;
        this.e = lm7Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap = this.f;
                linkedHashMap.put(lowerCase4, lc9.Y(lowerCase3, linkedHashMap));
            }
        }
        this.h = new coa(this.g.length);
        this.i = new eoa(this.g.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.ztf r4, defpackage.dgb r5, defpackage.pu2 r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof defpackage.auf
            if (r0 == 0) goto L16
            r0 = r6
            auf r0 = (defpackage.auf) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            auf r0 = new auf
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r4 = r0.result
            int r6 = r0.label
            r1 = 2
            r2 = 1
            g13 r3 = defpackage.g13.a
            if (r6 == 0) goto L40
            if (r6 == r2) goto L38
            if (r6 != r1) goto L31
            java.lang.Object r5 = r0.L$0
            java.util.Set r5 = (java.util.Set) r5
            defpackage.r7d.b(r4)
            return r5
        L31:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L38:
            java.lang.Object r5 = r0.L$0
            dgb r5 = (defpackage.dgb) r5
            defpackage.r7d.b(r4)
            goto L57
        L40:
            defpackage.r7d.b(r4)
            bh r4 = new bh
            r6 = 11
            r4.<init>(r6)
            r0.L$0 = r5
            r0.label = r2
            java.lang.String r6 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.b(r6, r4, r0)
            if (r4 != r3) goto L57
            goto L6e
        L57:
            java.util.Set r4 = (java.util.Set) r4
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L6f
            r0.L$0 = r4
            r0.label = r1
            java.lang.String r6 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = defpackage.erf.a(r5, r6, r0)
            if (r5 != r3) goto L6f
        L6e:
            return r3
        L6f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztf.a(ztf, dgb, pu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008a, code lost:
    
        if (defpackage.erf.a(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ea, code lost:
    
        if (defpackage.erf.a(r10, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ec, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ea -> B:28:0x00ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.ztf r17, defpackage.drf r18, int r19, defpackage.pu2 r20) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztf.b(ztf, drf, int, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0087 -> B:19:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.ztf r7, defpackage.drf r8, int r9, defpackage.pu2 r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.guf
            if (r0 == 0) goto L16
            r0 = r10
            guf r0 = (defpackage.guf) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            guf r0 = new guf
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L41
            if (r1 != r2) goto L3a
            int r7 = r0.I$1
            int r8 = r0.I$0
            java.lang.Object r9 = r0.L$2
            java.lang.String[] r9 = (java.lang.String[]) r9
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r0.L$0
            dgb r3 = (defpackage.dgb) r3
            defpackage.r7d.b(r10)
            r10 = r9
            r9 = r3
            goto L8a
        L3a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            r7 = 0
            return r7
        L41:
            defpackage.r7d.b(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = defpackage.ztf.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L53:
            if (r8 >= r7) goto L8c
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = defpackage.ja.f(r5, r4, r3)
            r0.L$0 = r9
            r0.L$1 = r1
            r0.L$2 = r10
            r0.I$0 = r8
            r0.I$1 = r7
            r0.label = r2
            java.lang.Object r3 = defpackage.erf.a(r9, r3, r0)
            g13 r4 = defpackage.g13.a
            if (r3 != r4) goto L8a
            return r4
        L8a:
            int r8 = r8 + r2
            goto L53
        L8c:
            j6g r7 = defpackage.j6g.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztf.c(ztf, drf, int, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.pu2 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztf.d(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String[] r5, defpackage.gu5 r6, defpackage.gu5 r7, defpackage.pu2 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.euf
            if (r0 == 0) goto L13
            r0 = r8
            euf r0 = (defpackage.euf) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            euf r0 = new euf
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L30
            java.lang.Object r4 = r0.L$1
            int[] r4 = (int[]) r4
            java.lang.Object r5 = r0.L$0
            r7 = r5
            gu5 r7 = (defpackage.gu5) r7
            defpackage.r7d.b(r8)     // Catch: java.lang.Throwable -> L2e
            goto L57
        L2e:
            r4 = move-exception
            goto L85
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L37:
            defpackage.r7d.b(r8)
            kotlin.Pair r5 = r4.h(r5)
            java.lang.Object r5 = r5.b()
            int[] r5 = (int[]) r5
            r6.invoke()
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L2e
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L2e
            r0.label = r2     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = r4.d(r0)     // Catch: java.lang.Throwable -> L2e
            g13 r4 = defpackage.g13.a
            if (r8 != r4) goto L56
            return r4
        L56:
            r4 = r5
        L57:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L2e
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2e
            r6 = 0
            if (r5 != 0) goto L68
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L2e
            boolean r4 = r8.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r4 != 0) goto L66
            goto L7d
        L66:
            r2 = r6
            goto L7d
        L68:
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2e
            r0 = r6
        L6a:
            if (r0 >= r5) goto L66
            r1 = r4[r0]     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r3 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r8.contains(r3)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L7a
            goto L7d
        L7a:
            int r0 = r0 + 1
            goto L6a
        L7d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L2e
            r7.invoke()
            return r4
        L85:
            r7.invoke()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztf.e(java.lang.String[], gu5, gu5, pu2):java.lang.Object");
    }

    public final void f(gu5<j6g> gu5Var, gu5<j6g> gu5Var2) {
        gu5Var.getClass();
        gu5Var2.getClass();
        if (this.j.compareAndSet(false, true)) {
            gu5Var.invoke();
            u63.Y(this.a.j(), new c13("Room Invalidation Tracker Refresh"), null, new b(gu5Var2, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.pu2 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.huf
            if (r0 == 0) goto L13
            r0 = r6
            huf r0 = (defpackage.huf) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            huf r0 = new huf
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            java.lang.Object r5 = r0.L$0
            f82 r5 = (defpackage.f82) r5
            defpackage.r7d.b(r6)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L2a:
            r6 = move-exception
            goto L59
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r2
        L32:
            defpackage.r7d.b(r6)
            xed r6 = r5.a
            f82 r1 = r6.g
            boolean r4 = r1.a()
            if (r4 == 0) goto L5d
            iuf r4 = new iuf     // Catch: java.lang.Throwable -> L57
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L57
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L57
            r0.label = r3     // Catch: java.lang.Throwable -> L57
            r5 = 0
            java.lang.Object r5 = r6.x(r5, r4, r0)     // Catch: java.lang.Throwable -> L57
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L52
            return r6
        L52:
            r5 = r1
        L53:
            r5.b()
            goto L5d
        L57:
            r6 = move-exception
            r5 = r1
        L59:
            r5.b()
            throw r6
        L5d:
            j6g r5 = defpackage.j6g.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztf.g(pu2):java.lang.Object");
    }

    public final Pair<String[], int[]> h(String[] strArr) {
        strArr.getClass();
        fae faeVar = new fae();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) this.c.get(lowerCase);
            if (set != null) {
                faeVar.addAll(set);
            } else {
                faeVar.add(str);
            }
        }
        String[] strArr2 = (String[]) faeVar.b().toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) this.f.get(lowerCase2);
            if (num == null) {
                l5.q("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return new Pair<>(strArr2, iArr);
    }
}
