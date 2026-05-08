package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.uiplugin.tab.TabPluginFragment$ScrollListener$2$1", f = "TabPluginFragment.kt", l = {}, m = "invokeSuspend")
public final class l6f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ int $marginTop;
    final /* synthetic */ zrd $scrollState;
    final /* synthetic */ b6f $tabEventManager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6f(zrd zrdVar, int i, b6f b6fVar, lu2<? super l6f> lu2Var) {
        super(2, lu2Var);
        this.$scrollState = zrdVar;
        this.$marginTop = i;
        this.$tabEventManager = b6fVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new l6f(this.$scrollState, this.$marginTop, this.$tabEventManager, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((l6f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$tabEventManager.a(((dme) this.$scrollState.a).e() <= this.$marginTop, ((Boolean) ((gme) this.$scrollState.f.e).getValue()).booleanValue() ? prd.b : prd.a);
        return j6g.a;
    }
}
