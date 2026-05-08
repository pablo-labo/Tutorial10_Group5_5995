package defpackage;

import app.rive.runtime.kotlin.renderers.RendererMetrics;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend")
public final class rb2 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<Object[]> $arrayFactory;
    final /* synthetic */ vi5<Object>[] $flows;
    final /* synthetic */ wi5<Object> $this_combineInternal;
    final /* synthetic */ wu5<wi5<Object>, Object[], lu2<? super j6g>, Object> $transform;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    @uh3(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ vi5<Object>[] $flows;
        final /* synthetic */ int $i;
        final /* synthetic */ AtomicInteger $nonClosed;
        final /* synthetic */ u12<ma7<Object>> $resultChannel;
        int label;

        /* JADX INFO: renamed from: rb2$a$a, reason: collision with other inner class name */
        public static final class C0408a<T> implements wi5 {
            public final /* synthetic */ u12<ma7<Object>> a;
            public final /* synthetic */ int b;

            /* JADX INFO: renamed from: rb2$a$a$a, reason: collision with other inner class name */
            @uh3(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {29, RendererMetrics.SAMPLES}, m = "emit")
            public static final class C0409a extends pu2 {
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C0408a<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0409a(C0408a<? super T> c0408a, lu2<? super C0409a> lu2Var) {
                    super(lu2Var);
                    this.this$0 = c0408a;
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.a(null, this);
                }
            }

            public C0408a(u12<ma7<Object>> u12Var, int i) {
                this.a = u12Var;
                this.b = i;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
            
                if (defpackage.hwf.f(r0) == r4) goto L21;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // defpackage.wi5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(T r6, defpackage.lu2<? super defpackage.j6g> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof rb2.a.C0408a.C0409a
                    if (r0 == 0) goto L13
                    r0 = r7
                    rb2$a$a$a r0 = (rb2.a.C0408a.C0409a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    rb2$a$a$a r0 = new rb2$a$a$a
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.result
                    int r1 = r0.label
                    r2 = 2
                    r3 = 1
                    g13 r4 = defpackage.g13.a
                    if (r1 == 0) goto L35
                    if (r1 == r3) goto L31
                    if (r1 != r2) goto L2a
                    defpackage.r7d.b(r7)
                    goto L53
                L2a:
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r5)
                    r5 = 0
                    return r5
                L31:
                    defpackage.r7d.b(r7)
                    goto L4a
                L35:
                    defpackage.r7d.b(r7)
                    ma7 r7 = new ma7
                    int r1 = r5.b
                    r7.<init>(r1, r6)
                    r0.label = r3
                    u12<ma7<java.lang.Object>> r5 = r5.a
                    java.lang.Object r5 = r5.b(r0, r7)
                    if (r5 != r4) goto L4a
                    goto L52
                L4a:
                    r0.label = r2
                    java.lang.Object r5 = defpackage.hwf.f(r0)
                    if (r5 != r4) goto L53
                L52:
                    return r4
                L53:
                    j6g r5 = defpackage.j6g.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: rb2.a.C0408a.a(java.lang.Object, lu2):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vi5<Object>[] vi5VarArr, int i, AtomicInteger atomicInteger, u12<ma7<Object>> u12Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$flows = vi5VarArr;
            this.$i = i;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = u12Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            AtomicInteger atomicInteger;
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    vi5<Object>[] vi5VarArr = this.$flows;
                    int i2 = this.$i;
                    vi5<Object> vi5Var = vi5VarArr[i2];
                    C0408a c0408a = new C0408a(this.$resultChannel, i2);
                    this.label = 1;
                    Object objE = vi5Var.e(c0408a, this);
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
                if (atomicInteger.decrementAndGet() == 0) {
                    this.$resultChannel.k(null);
                }
                return j6g.a;
            } finally {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    this.$resultChannel.k(null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rb2(vi5<Object>[] vi5VarArr, gu5<Object[]> gu5Var, wu5<? super wi5<Object>, ? super Object[], ? super lu2<? super j6g>, ? extends Object> wu5Var, wi5<Object> wi5Var, lu2<? super rb2> lu2Var) {
        super(2, lu2Var);
        this.$flows = vi5VarArr;
        this.$arrayFactory = gu5Var;
        this.$transform = wu5Var;
        this.$this_combineInternal = wi5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        rb2 rb2Var = new rb2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, lu2Var);
        rb2Var.L$0 = obj;
        return rb2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((rb2) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        if (r6 != 0) goto L20;
     */
    /* JADX WARN: Path cross not found for [B:20:0x008e, B:35:0x00cf], limit reached: 44 */
    /* JADX WARN: Path cross not found for [B:34:0x00cd, B:32:0x00be], limit reached: 44 */
    /* JADX WARN: Path cross not found for [B:37:0x00d9, B:40:0x00f0], limit reached: 44 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae A[LOOP:0: B:27:0x00ae->B:45:?, LOOP_START, PHI: r6 r12
  0x00ae: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:24:0x00a9, B:45:?] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r12v4 ma7) = (r12v3 ma7), (r12v10 ma7) binds: [B:24:0x00a9, B:45:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ed -> B:20:0x008e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0109 -> B:20:0x008e). Please report as a decompilation issue!!! */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
