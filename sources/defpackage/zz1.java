package defpackage;

import androidx.compose.runtime.r;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {237}, m = "invokeSuspend")
public final class zz1 extends c1f implements Function2<j6g, lu2<?>, Object> {
    final /* synthetic */ ucb $parentSession;
    final /* synthetic */ ncb $request;
    int label;
    final /* synthetic */ b02 this$0;

    public static final class a extends mj8 implements gu5<mcb> {
        final /* synthetic */ b02 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b02 b02Var) {
            super(0);
            this.this$0 = b02Var;
        }

        @Override // defpackage.gu5
        public final mcb invoke() {
            this.this$0.getClass();
            throw null;
        }
    }

    @uh3(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {238}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<mcb, lu2<? super j6g>, Object> {
        final /* synthetic */ ucb $parentSession;
        final /* synthetic */ ncb $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ncb ncbVar, ucb ucbVar, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$request = ncbVar;
            this.$parentSession = ucbVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            b bVar = new b(this.$request, this.$parentSession, lu2Var);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(mcb mcbVar, lu2<? super j6g> lu2Var) {
            ((b) create(mcbVar, lu2Var)).invokeSuspend(j6g.a);
            return g13.a;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                mcb mcbVar = (mcb) this.L$0;
                this.label = 1;
                Object objA = mcbVar.a();
                g13 g13Var = g13.a;
                if (objA == g13Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz1(b02 b02Var, ncb ncbVar, ucb ucbVar, lu2<? super zz1> lu2Var) {
        super(2, lu2Var);
        this.this$0 = b02Var;
        this.$request = ncbVar;
        this.$parentSession = ucbVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new zz1(this.this$0, this.$request, this.$parentSession, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(j6g j6gVar, lu2<?> lu2Var) {
        ((zz1) create(j6gVar, lu2Var)).invokeSuspend(j6g.a);
        return g13.a;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            kjd kjdVarH = r.h(new a(this.this$0));
            b bVar = new b(this.$request, this.$parentSession, null);
            this.label = 1;
            Object objQ = wg2.q(kjdVarH, bVar, this);
            g13 g13Var = g13.a;
            if (objQ == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        r6.g("Interceptors flow should never terminate.");
        return null;
    }
}
