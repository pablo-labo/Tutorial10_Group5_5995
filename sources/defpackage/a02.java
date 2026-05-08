package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {248}, m = "invokeSuspend")
public final class a02 extends c1f implements Function2<ucb, lu2<?>, Object> {
    final /* synthetic */ Function2<ucb, lu2<?>, Object> $session;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b02 this$0;

    public static final class a implements ucb {
        public final /* synthetic */ ucb a;
        public final /* synthetic */ ucb b;
        public final /* synthetic */ AtomicReference c;
        public final /* synthetic */ b02 d;

        public a(ucb ucbVar, AtomicReference atomicReference, b02 b02Var) {
            this.b = ucbVar;
            this.c = atomicReference;
            this.d = b02Var;
            this.a = ucbVar;
        }

        @Override // defpackage.tcb
        public final View b() {
            return this.a.b();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // defpackage.tcb
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(defpackage.mu8 r6, defpackage.pu2 r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof defpackage.xz1
                if (r0 == 0) goto L13
                r0 = r7
                xz1 r0 = (defpackage.xz1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                xz1 r0 = new xz1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                int r1 = r0.label
                r2 = 1
                if (r1 == 0) goto L2b
                if (r1 == r2) goto L27
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r5)
                return
            L27:
                defpackage.r7d.b(r7)
                goto L4c
            L2b:
                defpackage.r7d.b(r7)
                zz1 r7 = new zz1
                b02 r1 = r5.d
                ucb r3 = r5.b
                r4 = 0
                r7.<init>(r1, r6, r3, r4)
                r0.label = r2
                u9e r6 = new u9e
                yz1 r1 = defpackage.yz1.a
                java.util.concurrent.atomic.AtomicReference r5 = r5.c
                r6.<init>(r1, r5, r7, r4)
                java.lang.Object r5 = defpackage.f13.d(r6, r0)
                g13 r6 = defpackage.g13.a
                if (r5 != r6) goto L4c
                return
            L4c:
                defpackage.r40.e()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a02.a.c(mu8, pu2):void");
        }

        @Override // defpackage.e13
        public final v03 getCoroutineContext() {
            return this.a.getCoroutineContext();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a02(Function2<? super ucb, ? super lu2<?>, ? extends Object> function2, b02 b02Var, lu2<? super a02> lu2Var) {
        super(2, lu2Var);
        this.$session = function2;
        this.this$0 = b02Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        a02 a02Var = new a02(this.$session, this.this$0, lu2Var);
        a02Var.L$0 = obj;
        return a02Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ucb ucbVar, lu2<?> lu2Var) {
        ((a02) create(ucbVar, lu2Var)).invokeSuspend(j6g.a);
        return g13.a;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            a aVar = new a((ucb) this.L$0, new AtomicReference(null), this.this$0);
            Function2<ucb, lu2<?>, Object> function2 = this.$session;
            this.label = 1;
            Object objInvoke = function2.invoke(aVar, this);
            g13 g13Var = g13.a;
            if (objInvoke == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        r40.e();
        return null;
    }
}
