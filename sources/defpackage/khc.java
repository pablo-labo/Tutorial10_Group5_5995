package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.reactnative.rntarebridge.topnav.RNTareTopNav$updateTopNavState$1$1", f = "RNTareTopNav.kt", l = {}, m = "invokeSuspend")
public final class khc extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ k3g $host;
    final /* synthetic */ c4g $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khc(k3g k3gVar, c4g c4gVar, lu2<? super khc> lu2Var) {
        super(2, lu2Var);
        this.$host = k3gVar;
        this.$state = c4gVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new khc(this.$host, this.$state, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((khc) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$host.z(this.$state.a);
        this.$host.m(this.$state.b);
        this.$host.v(this.$state.c);
        this.$host.a(this.$state.d);
        return j6g.a;
    }
}
