package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.kotlin.ModuleHolder$registerContracts$1$1", f = "ModuleHolder.kt", l = {173}, m = "invokeSuspend")
public final class ay9 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function2<hk0, lu2<? super j6g>, Object> $it;
    int label;
    final /* synthetic */ zx9<sx9> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ay9(Function2<? super hk0, ? super lu2<? super j6g>, ? extends Object> function2, zx9<sx9> zx9Var, lu2<? super ay9> lu2Var) {
        super(2, lu2Var);
        this.$it = function2;
        this.this$0 = zx9Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ay9(this.$it, this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ay9) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            Function2<hk0, lu2<? super j6g>, Object> function2 = this.$it;
            gl3 gl3Var = this.this$0.a.b().j;
            this.label = 1;
            Object objInvoke = function2.invoke(gl3Var, this);
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
        return j6g.a;
    }
}
