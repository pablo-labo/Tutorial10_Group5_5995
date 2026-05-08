package defpackage;

import defpackage.rc1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2", f = "BasicTextContextMenuProvider.kt", l = {130}, m = "invokeSuspend")
public final class sc1 extends c1f implements Function1<lu2<? super j6g>, Object> {
    final /* synthetic */ rc1.a $localSession;
    int label;
    final /* synthetic */ rc1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc1(rc1 rc1Var, rc1.a aVar, lu2<? super sc1> lu2Var) {
        super(1, lu2Var);
        this.this$0 = rc1Var;
        this.$localSession = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new sc1(this.this$0, this.$localSession, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((sc1) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                rc1 rc1Var = this.this$0;
                ((gme) rc1Var.c).setValue(this.$localSession);
                rc1.a aVar = this.$localSession;
                this.label = 1;
                Object objC = aVar.b.c(this);
                g13 g13Var = g13.a;
                if (objC != g13Var) {
                    objC = j6g.a;
                }
                if (objC == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            ((gme) this.this$0.c).setValue(null);
            return j6g.a;
        } catch (Throwable th) {
            ((gme) this.this$0.c).setValue(null);
            throw th;
        }
    }
}
