package defpackage;

import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", f = "InvalidationTracker.kt", l = {233, 233, 237}, m = "invokeSuspend")
public final class buf extends c1f implements Function2<wi5<? super Set<? extends String>>, lu2<? super j6g>, Object> {
    final /* synthetic */ boolean $emitInitialState;
    final /* synthetic */ String[] $resolvedTableNames;
    final /* synthetic */ int[] $tableIds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ztf this$0;

    @uh3(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", f = "InvalidationTracker.kt", l = {233}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;
        final /* synthetic */ ztf this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ztf ztfVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = ztfVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                ztf ztfVar = this.this$0;
                this.label = 1;
                Object objG = ztfVar.g(this);
                g13 g13Var = g13.a;
                if (objG == g13Var) {
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

    public static final class b<T> implements wi5 {
        public final /* synthetic */ luc<int[]> a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ wi5<Set<String>> c;
        public final /* synthetic */ String[] d;
        public final /* synthetic */ int[] e;

        @uh3(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", f = "InvalidationTracker.kt", l = {241, 250}, m = "emit")
        public static final class a extends pu2 {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ b<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, lu2<? super a> lu2Var) {
                super(lu2Var);
                this.this$0 = bVar;
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(luc<int[]> lucVar, boolean z, wi5<? super Set<String>> wi5Var, String[] strArr, int[] iArr) {
            this.a = lucVar;
            this.b = z;
            this.c = wi5Var;
            this.d = strArr;
            this.e = iArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        
            if (r9.a(r2, r3) == r10) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
        
            if (r9.a(r2, r3) == r10) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
        
            return r10;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        @Override // defpackage.wi5
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(int[] r18, defpackage.lu2<? super defpackage.j6g> r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                boolean r3 = r2 instanceof buf.b.a
                if (r3 == 0) goto L19
                r3 = r2
                buf$b$a r3 = (buf.b.a) r3
                int r4 = r3.label
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = r4 & r5
                if (r6 == 0) goto L19
                int r4 = r4 - r5
                r3.label = r4
                goto L1e
            L19:
                buf$b$a r3 = new buf$b$a
                r3.<init>(r0, r2)
            L1e:
                java.lang.Object r2 = r3.result
                int r4 = r3.label
                r5 = 0
                r6 = 2
                r7 = 1
                if (r4 == 0) goto L44
                if (r4 == r7) goto L32
                if (r4 != r6) goto L2c
                goto L32
            L2c:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r0)
                return r5
            L32:
                java.lang.Object r0 = r3.L$1
                int[] r0 = (int[]) r0
                java.lang.Object r1 = r3.L$0
                buf$b r1 = (buf.b) r1
                defpackage.r7d.b(r2)
                r16 = r1
                r1 = r0
                r0 = r16
                goto Lb0
            L44:
                defpackage.r7d.b(r2)
                luc<int[]> r2 = r0.a
                T r4 = r2.element
                java.lang.String[] r8 = r0.d
                wi5<java.util.Set<java.lang.String>> r9 = r0.c
                g13 r10 = defpackage.g13.a
                if (r4 != 0) goto L68
                boolean r2 = r0.b
                if (r2 == 0) goto Lb0
                java.util.Set r2 = defpackage.ut0.I0(r8)
                r3.L$0 = r0
                r3.L$1 = r1
                r3.label = r7
                java.lang.Object r2 = r9.a(r2, r3)
                if (r2 != r10) goto Lb0
                goto Laf
            L68:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                int r7 = r8.length
                r11 = 0
                r12 = r11
            L70:
                if (r11 >= r7) goto L99
                r13 = r8[r11]
                int r14 = r12 + 1
                T r15 = r2.element
                if (r15 == 0) goto L91
                int[] r15 = (int[]) r15
                r19 = r5
                int[] r5 = r0.e
                r5 = r5[r12]
                r12 = r15[r5]
                r5 = r1[r5]
                if (r12 == r5) goto L8b
                r4.add(r13)
            L8b:
                int r11 = r11 + 1
                r5 = r19
                r12 = r14
                goto L70
            L91:
                r19 = r5
                java.lang.String r0 = "Required value was null."
                defpackage.r6.g(r0)
                return r19
            L99:
                boolean r2 = r4.isEmpty()
                if (r2 != 0) goto Lb0
                java.util.Set r2 = defpackage.z92.E1(r4)
                r3.L$0 = r0
                r3.L$1 = r1
                r3.label = r6
                java.lang.Object r2 = r9.a(r2, r3)
                if (r2 != r10) goto Lb0
            Laf:
                return r10
            Lb0:
                luc<int[]> r0 = r0.a
                r0.element = r1
                j6g r0 = defpackage.j6g.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: buf.b.a(int[], lu2):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buf(ztf ztfVar, int[] iArr, boolean z, String[] strArr, lu2<? super buf> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ztfVar;
        this.$tableIds = iArr;
        this.$emitInitialState = z;
        this.$resolvedTableNames = strArr;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        buf bufVar = new buf(this.this$0, this.$tableIds, this.$emitInitialState, this.$resolvedTableNames, lu2Var);
        bufVar.L$0 = obj;
        return bufVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super Set<? extends String>> wi5Var, lu2<? super j6g> lu2Var) throws Throwable {
        ((buf) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
        return g13.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (defpackage.u63.q0((defpackage.v03) r2, r3, r23) != r9) goto L33;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
