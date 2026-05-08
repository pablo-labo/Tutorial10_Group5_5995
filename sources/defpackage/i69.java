package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", l = {269}, m = "invokeSuspend")
public final class i69 extends c1f implements Function1<lu2<? super j6g>, Object> {
    final /* synthetic */ q69 $cancellationBehavior;
    final /* synthetic */ r69 $clipSpec;
    final /* synthetic */ s69 $composition;
    final /* synthetic */ boolean $continueFromPreviousAnimate;
    final /* synthetic */ float $initialProgress;
    final /* synthetic */ int $iteration;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ float $speed;
    final /* synthetic */ boolean $useCompositionFrameRate;
    int label;
    final /* synthetic */ l69 this$0;

    @uh3(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", l = {277}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ q69 $cancellationBehavior;
        final /* synthetic */ int $iteration;
        final /* synthetic */ int $iterations;
        final /* synthetic */ ex7 $parentJob;
        int label;
        final /* synthetic */ l69 this$0;

        /* JADX INFO: renamed from: i69$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0263a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[q69.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q69 q69Var, ex7 ex7Var, int i, int i2, l69 l69Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$cancellationBehavior = q69Var;
            this.$parentJob = ex7Var;
            this.$iterations = i;
            this.$iteration = i2;
            this.this$0 = l69Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$cancellationBehavior, this.$parentJob, this.$iterations, this.$iteration, this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:23:0x005d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                int r0 = r3.label
                r1 = 1
                if (r0 == 0) goto L12
                if (r0 != r1) goto Lb
                defpackage.r7d.b(r4)
                goto L5d
            Lb:
                java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r3)
                r3 = 0
                return r3
            L12:
                defpackage.r7d.b(r4)
            L15:
                q69 r4 = r3.$cancellationBehavior
                int[] r0 = i69.a.C0263a.a
                int r4 = r4.ordinal()
                r4 = r0[r4]
                if (r4 != r1) goto L2f
                ex7 r4 = r3.$parentJob
                boolean r4 = r4.isActive()
                if (r4 == 0) goto L2c
                int r4 = r3.$iterations
                goto L31
            L2c:
                int r4 = r3.$iteration
                goto L31
            L2f:
                int r4 = r3.$iterations
            L31:
                l69 r0 = r3.this$0
                r3.label = r1
                r0.getClass()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r2) goto L47
                j69 r2 = new j69
                r2.<init>(r0, r4)
                java.lang.Object r4 = defpackage.hc7.a(r2, r3)
                goto L58
            L47:
                k69 r2 = new k69
                r2.<init>(r0, r4)
                v03 r4 = r3.getContext()
                ky9 r4 = defpackage.ly9.a(r4)
                java.lang.Object r4 = r4.W(r2, r3)
            L58:
                g13 r0 = defpackage.g13.a
                if (r4 != r0) goto L5d
                return r0
            L5d:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L15
                j6g r3 = defpackage.j6g.a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: i69.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i69(l69 l69Var, int i, int i2, boolean z, float f, r69 r69Var, s69 s69Var, float f2, boolean z2, boolean z3, q69 q69Var, lu2<? super i69> lu2Var) {
        super(1, lu2Var);
        this.this$0 = l69Var;
        this.$iteration = i;
        this.$iterations = i2;
        this.$reverseOnRepeat = z;
        this.$speed = f;
        this.$clipSpec = r69Var;
        this.$composition = s69Var;
        this.$initialProgress = f2;
        this.$useCompositionFrameRate = z2;
        this.$continueFromPreviousAnimate = z3;
        this.$cancellationBehavior = q69Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new i69(this.this$0, this.$iteration, this.$iterations, this.$reverseOnRepeat, this.$speed, this.$clipSpec, this.$composition, this.$initialProgress, this.$useCompositionFrameRate, this.$continueFromPreviousAnimate, this.$cancellationBehavior, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((i69) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        v03 v03Var;
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                this.this$0.y(this.$iteration);
                l69 l69Var = this.this$0;
                int i2 = this.$iterations;
                ((gme) l69Var.c).setValue(Integer.valueOf(i2));
                l69 l69Var2 = this.this$0;
                boolean z = this.$reverseOnRepeat;
                ((gme) l69Var2.d).setValue(Boolean.valueOf(z));
                l69 l69Var3 = this.this$0;
                float f = this.$speed;
                ((gme) l69Var3.f).setValue(Float.valueOf(f));
                l69 l69Var4 = this.this$0;
                ((gme) l69Var4.e).setValue(this.$clipSpec);
                l69 l69Var5 = this.this$0;
                ((gme) l69Var5.X).setValue(this.$composition);
                this.this$0.z(this.$initialProgress);
                l69 l69Var6 = this.this$0;
                boolean z2 = this.$useCompositionFrameRate;
                ((gme) l69Var6.V).setValue(Boolean.valueOf(z2));
                if (!this.$continueFromPreviousAnimate) {
                    ((gme) this.this$0.a0).setValue(Long.MIN_VALUE);
                }
                if (this.$composition == null) {
                    l69.n(this.this$0, false);
                    return j6g.a;
                }
                boolean zIsInfinite = Float.isInfinite(this.$speed);
                l69 l69Var7 = this.this$0;
                if (zIsInfinite) {
                    l69Var7.z(l69Var7.o());
                    l69.n(this.this$0, false);
                    this.this$0.y(this.$iterations);
                    return j6g.a;
                }
                l69.n(l69Var7, true);
                int iOrdinal = this.$cancellationBehavior.ordinal();
                if (iOrdinal == 0) {
                    v03Var = vr4.a;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    v03Var = gja.b;
                }
                a aVar = new a(this.$cancellationBehavior, u63.I(getContext()), this.$iterations, this.$iteration, this.this$0, null);
                this.label = 1;
                Object objQ0 = u63.q0(v03Var, aVar, this);
                g13 g13Var = g13.a;
                if (objQ0 == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            u63.u(getContext());
            l69.n(this.this$0, false);
            return j6g.a;
        } catch (Throwable th) {
            l69.n(this.this$0, false);
            throw th;
        }
    }
}
