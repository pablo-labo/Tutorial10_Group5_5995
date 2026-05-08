package defpackage;

import defpackage.e0b;
import defpackage.kza;
import defpackage.mza;
import defpackage.r2b;
import defpackage.xz8;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class rza<Key, Value> {
    public final Key a;
    public final r2b<Key, Value> b;
    public final h4 c;
    public final vi5<j6g> d;
    public final y0d<Key, Value> e;
    public final s2b<Key, Value> f;
    public final yh6 g;
    public final AtomicBoolean h;
    public final go1 i;
    public final e0b.a<Key, Value> j;
    public final qy7 k;
    public final mj5 l;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[zz8.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rza(Object obj, r2b r2bVar, h4 h4Var, jo2 jo2Var, y0d y0dVar, s2b s2bVar, mza.b.a aVar) {
        r2bVar.getClass();
        jo2Var.getClass();
        this.a = obj;
        this.b = r2bVar;
        this.c = h4Var;
        this.d = jo2Var;
        this.e = y0dVar;
        this.f = s2bVar;
        this.g = new yh6();
        this.h = new AtomicBoolean(false);
        this.i = h22.a(-2, 6, null);
        this.j = new e0b.a<>(h4Var);
        qy7 qy7VarF = u63.f();
        this.k = qy7VarF;
        this.l = new mj5(nfe.a(new mw1(qy7VarF, new zza(this, null), null)), new b0b(this, null));
    }

    public static final Object a(rza rzaVar, mj5 mj5Var, zz8 zz8Var, c1f c1fVar) {
        rzaVar.getClass();
        vi5 vi5VarA = nfe.a(new cj5(mj5Var, new sza(null, rzaVar, zz8Var), null));
        tza tzaVar = new tza(zz8Var, null);
        vi5VarA.getClass();
        Object objE = wg2.l(new kjd(new aj5(vi5VarA, tzaVar, null)), -1).e(new uza(rzaVar, zz8Var), c1fVar);
        return objE == g13.a ? objE : j6g.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x036c, code lost:
    
        r0 = r5;
        r5 = r7;
        r7 = r10;
        r10 = r13;
        r13 = r14;
        r12 = r19;
        r8 = r20;
        r16 = 10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:199:0x0618, B:202:0x0621], limit reached: 247 */
    /* JADX WARN: Path cross not found for [B:205:0x0626, B:208:0x062e], limit reached: 247 */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05c3 A[Catch: all -> 0x05d2, TryCatch #1 {all -> 0x05d2, blocks: (B:180:0x0597, B:181:0x05a9, B:183:0x05c3, B:185:0x05cb, B:187:0x05cf, B:191:0x05d8, B:190:0x05d6, B:192:0x05db), top: B:242:0x0597 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05cf A[Catch: all -> 0x05d2, TryCatch #1 {all -> 0x05d2, blocks: (B:180:0x0597, B:181:0x05a9, B:183:0x05c3, B:185:0x05cb, B:187:0x05cf, B:191:0x05d8, B:190:0x05d6, B:192:0x05db), top: B:242:0x0597 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05d6 A[Catch: all -> 0x05d2, TryCatch #1 {all -> 0x05d2, blocks: (B:180:0x0597, B:181:0x05a9, B:183:0x05c3, B:185:0x05cb, B:187:0x05cf, B:191:0x05d8, B:190:0x05d6, B:192:0x05db), top: B:242:0x0597 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0338 A[Catch: all -> 0x035c, TRY_LEAVE, TryCatch #5 {all -> 0x035c, blocks: (B:72:0x0322, B:74:0x0338), top: B:250:0x0322 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03cd  */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v118 */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v120 */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, rza] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, zz8] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v43, types: [java.lang.Object, zz8] */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v37, types: [java.lang.Object, rza] */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, rza] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v24, types: [java.lang.Object, rza] */
    /* JADX WARN: Type inference failed for: r14v26, types: [java.lang.Object, zz8] */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v30, types: [zz8] */
    /* JADX WARN: Type inference failed for: r14v31, types: [java.lang.Enum, java.lang.Object, zz8] */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v9, types: [qsg] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [z4a] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41, types: [z4a] */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14, types: [T] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v56, types: [rza] */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, zz8] */
    /* JADX WARN: Type inference failed for: r4v66, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v31, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v27, types: [rza] */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Object, rza] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object, rza] */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r8v5, types: [qsg] */
    /* JADX WARN: Type inference failed for: r8v9, types: [h3a] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:216:0x065d -> B:254:0x0663). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.rza r22, defpackage.zz8 r23, defpackage.tw5 r24, defpackage.lu2 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rza.b(rza, zz8, tw5, lu2):java.lang.Object");
    }

    public static final Object c(rza rzaVar, zz8 zz8Var, qsg qsgVar, a0b a0bVar) throws Throwable {
        rzaVar.getClass();
        if (a.a[zz8Var.ordinal()] == 1) {
            Object objF = rzaVar.f(a0bVar);
            return objF == g13.a ? objF : j6g.a;
        }
        if (qsgVar == null) {
            r6.g("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
            return null;
        }
        yh6 yh6Var = rzaVar.g;
        yh6Var.getClass();
        if (zz8Var == zz8.b || zz8Var == zz8.c) {
            yh6Var.a.a(null, new zh6(zz8Var, qsgVar));
            return j6g.a;
        }
        v40.n(zz8Var, "invalid load type for reset: ");
        return null;
    }

    public static final void d(rza rzaVar, e13 e13Var) {
        h4 h4Var = rzaVar.c;
        u63.Y(e13Var, null, null, new c0b(rzaVar, null), 3);
        u63.Y(e13Var, null, null, new d0b(rzaVar, null), 3);
    }

    public static String h(zz8 zz8Var, Object obj, r2b.b bVar) {
        if (bVar == null) {
            return "End " + zz8Var + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + zz8Var + " with loadKey " + obj + ". Returned " + bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.pu2 r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.wza
            if (r0 == 0) goto L13
            r0 = r5
            wza r0 = (defpackage.wza) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            wza r0 = new wza
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L34
            java.lang.Object r4 = r0.L$2
            z4a r4 = (defpackage.z4a) r4
            java.lang.Object r1 = r0.L$1
            e0b$a r1 = (e0b.a) r1
            java.lang.Object r0 = r0.L$0
            rza r0 = (defpackage.rza) r0
            defpackage.r7d.b(r5)
            r5 = r4
            r4 = r0
            goto L52
        L34:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r3
        L3a:
            defpackage.r7d.b(r5)
            e0b$a<Key, Value> r1 = r4.j
            a5a r5 = r1.a
            r0.L$0 = r4
            r0.L$1 = r1
            r0.L$2 = r5
            r0.label = r2
            java.lang.Object r0 = r5.h(r0)
            g13 r2 = defpackage.g13.a
            if (r0 != r2) goto L52
            return r2
        L52:
            e0b<Key, Value> r0 = r1.b     // Catch: java.lang.Throwable -> L62
            yh6 r4 = r4.g     // Catch: java.lang.Throwable -> L62
            yh6$b r4 = r4.a     // Catch: java.lang.Throwable -> L62
            qsg$a r4 = r4.c     // Catch: java.lang.Throwable -> L62
            s2b r4 = r0.a(r4)     // Catch: java.lang.Throwable -> L62
            r5.p(r3)
            return r4
        L62:
            r4 = move-exception
            r5.p(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rza.e(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0146 A[PHI: r0 r1
  0x0146: PHI (r0v12 rza<Key, Value>) = (r0v8 rza<Key, Value>), (r0v15 rza<Key, Value>) binds: [B:45:0x0142, B:26:0x00b4] A[DONT_GENERATE, DONT_INLINE]
  0x0146: PHI (r1v9 java.lang.Object) = (r1v8 java.lang.Object), (r1v1 java.lang.Object) binds: [B:45:0x0142, B:26:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017e A[Catch: all -> 0x0182, TRY_ENTER, TryCatch #2 {all -> 0x0182, blocks: (B:53:0x0164, B:56:0x017e, B:59:0x0185, B:61:0x018c), top: B:143:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018c A[Catch: all -> 0x0182, TRY_LEAVE, TryCatch #2 {all -> 0x0182, blocks: (B:53:0x0164, B:56:0x017e, B:59:0x0185, B:61:0x018c), top: B:143:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.pu2 r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rza.f(pu2):java.lang.Object");
    }

    public final r2b.a<Key> g(zz8 zz8Var, Key key) {
        int i = zz8Var == zz8.a ? 20 : 10;
        zz8Var.getClass();
        int iOrdinal = zz8Var.ordinal();
        if (iOrdinal == 0) {
            return new r2b.a.c(key, i);
        }
        if (iOrdinal == 1) {
            if (key != null) {
                return new r2b.a.b(key, i);
            }
            l5.q("key cannot be null for prepend");
            return null;
        }
        if (iOrdinal != 2) {
            l.g();
            return null;
        }
        if (key != null) {
            return new r2b.a.C0405a(key, i);
        }
        l5.q("key cannot be null for append");
        return null;
    }

    public final Key i(e0b<Key, Value> e0bVar, zz8 zz8Var, int i, int i2) {
        e0bVar.getClass();
        int iOrdinal = zz8Var.ordinal();
        if (iOrdinal == 0) {
            l5.q("Cannot get loadId for loadType: REFRESH");
            return null;
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            l.g();
            return null;
        }
        if (i != 0 || (e0bVar.j.a(zz8Var) instanceof xz8.a) || i2 >= 10) {
            return null;
        }
        ArrayList arrayList = e0bVar.c;
        return zz8Var == zz8.b ? ((r2b.b.c) z92.O0(arrayList)).b : ((r2b.b.c) z92.Y0(arrayList)).c;
    }

    public final Object j(e0b e0bVar, zz8 zz8Var, xz8.a aVar, pu2 pu2Var) {
        h3a h3aVar = e0bVar.j;
        if (wl7.b(h3aVar.a(zz8Var), aVar)) {
            return j6g.a;
        }
        h3aVar.c(zz8Var, aVar);
        Object objB = this.i.b(pu2Var, new kza.c(h3aVar.d(), null));
        return objB == g13.a ? objB : j6g.a;
    }

    public final Object k(e0b e0bVar, zz8 zz8Var, pu2 pu2Var) {
        h3a h3aVar = e0bVar.j;
        xz8 xz8VarA = h3aVar.a(zz8Var);
        xz8.b bVar = xz8.b.b;
        if (wl7.b(xz8VarA, bVar)) {
            return j6g.a;
        }
        h3aVar.c(zz8Var, bVar);
        Object objB = this.i.b(pu2Var, new kza.c(h3aVar.d(), null));
        return objB == g13.a ? objB : j6g.a;
    }
}
