package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend")
public final class o93 extends c1f implements Function2<e13, lu2<? super Boolean>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ p93 this$0;

    @uh3(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {72, 77, 79, 81}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ ex7 $oldJob;
        int label;
        final /* synthetic */ p93 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ex7 ex7Var, p93 p93Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$oldJob = ex7Var;
            this.this$0 = p93Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$oldJob, this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            return g13.a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
        
            if (defpackage.u63.p(r11, r10) == r9) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        
            if (defpackage.ls3.b(500, r10) != r9) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0063 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0017, B:33:0x0075, B:27:0x005a, B:30:0x0063, B:14:0x0024, B:15:0x0028, B:16:0x0030, B:23:0x0045, B:25:0x0054), top: B:37:0x000d }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0072 -> B:33:0x0075). Please report as a decompilation issue!!! */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                int r0 = r10.label
                r1 = 0
                r2 = 500(0x1f4, double:2.47E-321)
                r4 = 1065353216(0x3f800000, float:1.0)
                r5 = 4
                r6 = 3
                r7 = 2
                r8 = 1
                g13 r9 = defpackage.g13.a
                if (r0 == 0) goto L35
                if (r0 == r8) goto L31
                if (r0 == r7) goto L28
                if (r0 == r6) goto L24
                if (r0 != r5) goto L1d
                defpackage.r7d.b(r11)     // Catch: java.lang.Throwable -> L1b
                goto L75
            L1b:
                r11 = move-exception
                goto L7f
            L1d:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r10)
                r10 = 0
                return r10
            L24:
                defpackage.r7d.b(r11)     // Catch: java.lang.Throwable -> L1b
                goto L63
            L28:
                defpackage.r7d.b(r11)     // Catch: java.lang.Throwable -> L1b
                kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1b
                r11.<init>()     // Catch: java.lang.Throwable -> L1b
                throw r11     // Catch: java.lang.Throwable -> L1b
            L31:
                defpackage.r7d.b(r11)
                goto L45
            L35:
                defpackage.r7d.b(r11)
                ex7 r11 = r10.$oldJob
                if (r11 == 0) goto L45
                r10.label = r8
                java.lang.Object r11 = defpackage.u63.p(r11, r10)
                if (r11 != r9) goto L45
                goto L74
            L45:
                p93 r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                x2a r11 = r11.c     // Catch: java.lang.Throwable -> L1b
                cme r11 = (defpackage.cme) r11     // Catch: java.lang.Throwable -> L1b
                r11.q(r4)     // Catch: java.lang.Throwable -> L1b
                p93 r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                boolean r11 = r11.a     // Catch: java.lang.Throwable -> L1b
                if (r11 != 0) goto L5a
                r10.label = r7     // Catch: java.lang.Throwable -> L1b
                defpackage.ls3.a(r10)     // Catch: java.lang.Throwable -> L1b
                return r9
            L5a:
                r10.label = r6     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r11 = defpackage.ls3.b(r2, r10)     // Catch: java.lang.Throwable -> L1b
                if (r11 != r9) goto L63
                goto L74
            L63:
                p93 r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                x2a r11 = r11.c     // Catch: java.lang.Throwable -> L1b
                cme r11 = (defpackage.cme) r11     // Catch: java.lang.Throwable -> L1b
                r11.q(r1)     // Catch: java.lang.Throwable -> L1b
                r10.label = r5     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r11 = defpackage.ls3.b(r2, r10)     // Catch: java.lang.Throwable -> L1b
                if (r11 != r9) goto L75
            L74:
                return r9
            L75:
                p93 r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                x2a r11 = r11.c     // Catch: java.lang.Throwable -> L1b
                cme r11 = (defpackage.cme) r11     // Catch: java.lang.Throwable -> L1b
                r11.q(r4)     // Catch: java.lang.Throwable -> L1b
                goto L5a
            L7f:
                p93 r10 = r10.this$0
                x2a r10 = r10.c
                cme r10 = (defpackage.cme) r10
                r10.q(r1)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o93.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o93(p93 p93Var, lu2<? super o93> lu2Var) {
        super(2, lu2Var);
        this.this$0 = p93Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        o93 o93Var = new o93(this.this$0, lu2Var);
        o93Var.L$0 = obj;
        return o93Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super Boolean> lu2Var) {
        return ((o93) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        boolean z;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        e13 e13Var = (e13) this.L$0;
        ex7 andSet = this.this$0.b.getAndSet(null);
        p93 p93Var = this.this$0;
        AtomicReference<ex7> atomicReference = p93Var.b;
        uqe uqeVarY = u63.Y(e13Var, null, null, new a(andSet, p93Var, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, uqeVarY)) {
                z = true;
                break;
            }
            if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
