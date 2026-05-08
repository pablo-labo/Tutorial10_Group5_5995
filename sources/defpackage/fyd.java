package defpackage;

import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", l = {489}, m = "invokeSuspend")
public final class fyd extends c1f implements Function1<lu2<? super j6g>, Object> {
    final /* synthetic */ float $fraction;
    final /* synthetic */ Object $oldTargetState;
    final /* synthetic */ Object $targetState;
    final /* synthetic */ csf<Object> $transition;
    int label;
    final /* synthetic */ cyd<Object> this$0;

    @uh3(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", l = {511}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ float $fraction;
        final /* synthetic */ Object $oldTargetState;
        final /* synthetic */ Object $targetState;
        final /* synthetic */ csf<Object> $transition;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ cyd<Object> this$0;

        /* JADX INFO: renamed from: fyd$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", l = {DataOkHttpUploader.HTTP_INSUFFICIENT_STORAGE}, m = "invokeSuspend")
        public static final class C0245a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ cyd<Object> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0245a(cyd<Object> cydVar, lu2<? super C0245a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = cydVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0245a(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0245a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    cyd<Object> cydVar = this.this$0;
                    this.label = 1;
                    Object objG = cyd.g(cydVar, this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, cyd<Object> cydVar, csf<Object> csfVar, float f, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$targetState = obj;
            this.$oldTargetState = obj2;
            this.this$0 = cydVar;
            this.$transition = csfVar;
            this.$fraction = f;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                e13 e13Var = (e13) this.L$0;
                boolean zB = wl7.b(this.$targetState, this.$oldTargetState);
                cyd<Object> cydVar = this.this$0;
                if (zB) {
                    cydVar.n = null;
                    if (wl7.b(((gme) cydVar.c).getValue(), this.$targetState)) {
                        return j6g.a;
                    }
                } else {
                    cyd.f(cydVar);
                }
                if (!wl7.b(this.$targetState, this.$oldTargetState)) {
                    this.$transition.q(this.$targetState);
                    this.$transition.o(0L);
                    cyd<Object> cydVar2 = this.this$0;
                    ((gme) cydVar2.b).setValue(this.$targetState);
                    this.$transition.k(this.$fraction);
                }
                cyd<Object> cydVar3 = this.this$0;
                float f = this.$fraction;
                ce0 ce0Var = cyd.r;
                cydVar3.o(f);
                boolean zE = this.this$0.m.e();
                cyd<Object> cydVar4 = this.this$0;
                if (zE) {
                    u63.Y(e13Var, null, null, new C0245a(cydVar4, null), 3);
                } else {
                    cydVar4.l = Long.MIN_VALUE;
                }
                cyd<Object> cydVar5 = this.this$0;
                this.label = 1;
                Object objI = cyd.i(cydVar5, this);
                g13 g13Var = g13.a;
                if (objI == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            cyd<Object> cydVar6 = this.this$0;
            ce0 ce0Var2 = cyd.r;
            cydVar6.n();
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyd(Object obj, Object obj2, cyd<Object> cydVar, csf<Object> csfVar, float f, lu2<? super fyd> lu2Var) {
        super(1, lu2Var);
        this.$targetState = obj;
        this.$oldTargetState = obj2;
        this.this$0 = cydVar;
        this.$transition = csfVar;
        this.$fraction = f;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new fyd(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((fyd) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            a aVar = new a(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, null);
            this.label = 1;
            Object objD = f13.d(aVar, this);
            g13 g13Var = g13.a;
            if (objD == g13Var) {
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
