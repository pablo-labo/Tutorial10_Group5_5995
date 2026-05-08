package defpackage;

import coil3.network.HttpException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", f = "NetworkFetcher.kt", l = {204}, m = "invokeSuspend")
public final class dga extends c1f implements Function2<xga, lu2<Object>, Object> {
    final /* synthetic */ Function2<xga, lu2<Object>, Object> $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dga(Function2<? super xga, ? super lu2<Object>, ? extends Object> function2, lu2<? super dga> lu2Var) {
        super(2, lu2Var);
        this.$block = function2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        dga dgaVar = new dga(this.$block, lu2Var);
        dgaVar.L$0 = obj;
        return dgaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xga xgaVar, lu2<Object> lu2Var) {
        return ((dga) create(xgaVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        xga xgaVar = (xga) this.L$0;
        int i2 = xgaVar.a;
        if ((200 > i2 || i2 >= 300) && i2 != 304) {
            throw new HttpException(xgaVar);
        }
        Function2<xga, lu2<Object>, Object> function2 = this.$block;
        this.label = 1;
        Object objInvoke = function2.invoke(xgaVar, this);
        g13 g13Var = g13.a;
        return objInvoke == g13Var ? g13Var : objInvoke;
    }
}
