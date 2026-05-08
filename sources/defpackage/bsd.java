package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.uiplugin.tab.ScrollUtils$scrollToTop$1", f = "ScrollUtils.kt", l = {20}, m = "invokeSuspend")
public final class bsd extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ zrd $this_scrollToTop;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsd(zrd zrdVar, lu2<? super bsd> lu2Var) {
        super(2, lu2Var);
        this.$this_scrollToTop = zrdVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new bsd(this.$this_scrollToTop, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((bsd) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            zrd zrdVar = this.$this_scrollToTop;
            dvf dvfVar = csd.a;
            this.label = 1;
            Object objG = wab.g(zrdVar, 0 - ((dme) zrdVar.a).e(), dvfVar, this);
            Object obj2 = g13.a;
            if (objG != obj2) {
                objG = j6g.a;
            }
            if (objG == obj2) {
                return obj2;
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
