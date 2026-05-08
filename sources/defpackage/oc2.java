package defpackage;

import defpackage.pw8;
import defpackage.r2b;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class oc2<Value> {
    public static final r2b.b.C0406b<Object, Object> i = new r2b.b.C0406b<>();
    public final String[] a;
    public final pw8<Value> b;
    public final pw8.a c;
    public final xed d;
    public final kfd e;
    public final AtomicInteger f = new AtomicInteger(-1);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public uqe h;

    @uh3(c = "androidx.room.paging.CommonLimitOffsetImpl", f = "LimitOffsetPagingSource.kt", l = {100, 102}, m = "load")
    public static final class a extends pu2 {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ oc2<Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(oc2<Value> oc2Var, lu2<? super a> lu2Var) {
            super(lu2Var);
            this.this$0 = oc2Var;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, this);
        }
    }

    @uh3(c = "androidx.room.paging.CommonLimitOffsetImpl$load$2", f = "LimitOffsetPagingSource.kt", l = {87}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;
        final /* synthetic */ oc2<Value> this$0;

        public static final class a<T> implements wi5 {
            public final /* synthetic */ oc2<Value> a;

            public a(oc2<Value> oc2Var) {
                this.a = oc2Var;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                oc2<Value> oc2Var = this.a;
                if (oc2Var.b.getInvalid()) {
                    throw new CancellationException("PagingSource is invalid");
                }
                oc2Var.b.invalidate();
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oc2<Value> oc2Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.this$0 = oc2Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                km7 km7VarK = this.this$0.d.k();
                String[] strArr = this.this$0.a;
                vi5<Set<String>> vi5VarA = km7VarK.a((String[]) Arrays.copyOf(strArr, strArr.length), false);
                a aVar = new a(this.this$0);
                this.label = 1;
                Object objE = ((e2) vi5VarA).e(aVar, this);
                g13 g13Var = g13.a;
                if (objE == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public oc2(String[] strArr, pw8 pw8Var, pw8.a aVar) {
        this.a = strArr;
        this.b = pw8Var;
        this.c = aVar;
        this.d = pw8Var.getDb();
        this.e = pw8Var.getSourceQuery();
        pw8Var.registerInvalidatedCallback(new qq(this, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r9 == r6) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(r2b.a<java.lang.Integer> r8, defpackage.lu2<? super r2b.b<java.lang.Integer, Value>> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof oc2.a
            if (r0 == 0) goto L13
            r0 = r9
            oc2$a r0 = (oc2.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            oc2$a r0 = new oc2$a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L2f
            if (r1 != r3) goto L29
            defpackage.r7d.b(r9)     // Catch: java.lang.Exception -> L86
            goto L83
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L2f:
            defpackage.r7d.b(r9)     // Catch: java.lang.Exception -> L86
            goto L77
        L33:
            defpackage.r7d.b(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.g
            r1 = 0
            boolean r9 = r9.compareAndSet(r1, r4)
            xed r1 = r7.d
            if (r9 == 0) goto L51
            e13 r9 = r1.j()
            oc2$b r5 = new oc2$b
            r5.<init>(r7, r2)
            r6 = 3
            uqe r9 = defpackage.u63.Y(r9, r2, r2, r5, r6)
            r7.h = r9
        L51:
            java.util.concurrent.atomic.AtomicInteger r9 = r7.f
            int r9 = r9.get()
            r5 = -1
            g13 r6 = defpackage.g13.a
            if (r9 != r5) goto L7a
            r0.label = r4     // Catch: java.lang.Exception -> L86
            nc2 r9 = new nc2     // Catch: java.lang.Exception -> L86
            r9.<init>(r7, r8, r2)     // Catch: java.lang.Exception -> L86
            e13 r7 = r1.j()     // Catch: java.lang.Exception -> L86
            eu2 r7 = (defpackage.eu2) r7     // Catch: java.lang.Exception -> L86
            v03 r7 = r7.a     // Catch: java.lang.Exception -> L86
            zed r8 = new zed     // Catch: java.lang.Exception -> L86
            r8.<init>(r1, r9, r2)     // Catch: java.lang.Exception -> L86
            java.lang.Object r9 = defpackage.u63.q0(r7, r8, r0)     // Catch: java.lang.Exception -> L86
            if (r9 != r6) goto L77
            goto L82
        L77:
            r2b$b r9 = (r2b.b) r9     // Catch: java.lang.Exception -> L86
            return r9
        L7a:
            r0.label = r3     // Catch: java.lang.Exception -> L86
            java.lang.Object r9 = r7.b(r8, r9, r0)     // Catch: java.lang.Exception -> L86
            if (r9 != r6) goto L83
        L82:
            return r6
        L83:
            r2b$b r9 = (r2b.b) r9     // Catch: java.lang.Exception -> L86
            return r9
        L86:
            r7 = move-exception
            r2b$b$a r8 = new r2b$b$a
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc2.a(r2b$a, lu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(r2b.a r8, int r9, defpackage.pu2 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.pc2
            if (r0 == 0) goto L13
            r0 = r10
            pc2 r0 = (defpackage.pc2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            pc2 r0 = new pc2
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L41
            if (r1 == r4) goto L39
            if (r1 != r3) goto L33
            java.lang.Object r7 = r0.L$1
            r2b$b r7 = (r2b.b) r7
            java.lang.Object r8 = r0.L$0
            oc2 r8 = (defpackage.oc2) r8
            defpackage.r7d.b(r10)
            goto L75
        L33:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L39:
            java.lang.Object r7 = r0.L$0
            oc2 r7 = (defpackage.oc2) r7
            defpackage.r7d.b(r10)
            goto L53
        L41:
            defpackage.r7d.b(r10)
            r0.L$0 = r7
            r0.label = r4
            kfd r10 = r7.e
            pw8$a r1 = r7.c
            java.lang.Object r10 = defpackage.hfd.a(r8, r10, r9, r1, r0)
            if (r10 != r5) goto L53
            goto L71
        L53:
            r8 = r10
            r2b$b r8 = (r2b.b) r8
            xed r9 = r7.d
            e13 r9 = r9.j()
            eu2 r9 = (defpackage.eu2) r9
            v03 r9 = r9.a
            qc2 r10 = new qc2
            r10.<init>(r7, r2)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = defpackage.u63.q0(r9, r10, r0)
            if (r9 != r5) goto L72
        L71:
            return r5
        L72:
            r6 = r8
            r8 = r7
            r7 = r6
        L75:
            pw8<Value> r8 = r8.b
            boolean r8 = r8.getInvalid()
            if (r8 == 0) goto L82
            r2b$b$b<java.lang.Object, java.lang.Object> r7 = defpackage.oc2.i
            r7.getClass()
        L82:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc2.b(r2b$a, int, pu2):java.lang.Object");
    }
}
