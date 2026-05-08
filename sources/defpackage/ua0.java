package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import defpackage.sa0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2", f = "AndroidTextContextMenuToolbarProvider.android.kt", l = {180}, m = "invokeSuspend")
public final class ua0 extends c1f implements Function1<lu2<? super j6g>, Object> {
    final /* synthetic */ zcf $dataProvider;
    int label;
    final /* synthetic */ sa0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua0(sa0 sa0Var, zcf zcfVar, lu2<? super ua0> lu2Var) {
        super(1, lu2Var);
        this.this$0 = sa0Var;
        this.$dataProvider = zcfVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new ua0(this.this$0, this.$dataProvider, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((ua0) create(lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        ccf ccfVarInvoke;
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                sa0.b bVar = new sa0.b();
                sa0 sa0Var = this.this$0;
                zcf zcfVar = this.$dataProvider;
                sa0Var.getClass();
                int i2 = 0;
                ccf aVar = new sa0.a(bVar, new oa0(i2, sa0Var, zcfVar), new pa0(i2, sa0Var, zcfVar), sa0Var.a);
                Function1<ccf, ccf> function1 = sa0Var.b;
                if (function1 != null && (ccfVarInvoke = function1.invoke(aVar)) != null) {
                    aVar = ccfVarInvoke;
                }
                Looper looperMyLooper = Looper.myLooper();
                Handler handler = this.this$0.a.getHandler();
                Looper looper = handler != null ? handler.getLooper() : null;
                sa0 sa0Var2 = this.this$0;
                if (looperMyLooper != looper) {
                    ta0 ta0Var = sa0Var2.i;
                    if (ta0Var == null) {
                        ta0Var = new ta0(i2, sa0Var2, aVar, bVar);
                        sa0Var2.i = ta0Var;
                    }
                    sa0Var2.a.post(ta0Var);
                } else {
                    ActionMode actionModeStartActionMode = sa0Var2.a.startActionMode(new ti5(aVar), 1);
                    if (actionModeStartActionMode == null) {
                        return j6g.a;
                    }
                    sa0Var2.h = actionModeStartActionMode;
                }
                this.label = 1;
                Object objC = bVar.a.c(this);
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
            this.this$0.e.a();
            ActionMode actionMode = this.this$0.h;
            if (actionMode != null) {
                actionMode.finish();
            }
            sa0 sa0Var3 = this.this$0;
            ta0 ta0Var2 = sa0Var3.i;
            if (ta0Var2 != null) {
                sa0Var3.a.removeCallbacks(ta0Var2);
            }
            this.this$0.h = null;
            return j6g.a;
        } catch (Throwable th) {
            this.this$0.e.a();
            ActionMode actionMode2 = this.this$0.h;
            if (actionMode2 != null) {
                actionMode2.finish();
            }
            sa0 sa0Var4 = this.this$0;
            ta0 ta0Var3 = sa0Var4.i;
            if (ta0Var3 != null) {
                sa0Var4.a.removeCallbacks(ta0Var3);
            }
            this.this$0.h = null;
            throw th;
        }
    }
}
