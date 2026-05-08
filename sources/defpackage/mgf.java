package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", l = {816}, m = "invokeSuspend")
public final class mgf extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ boolean $cancelSelection;
    int label;
    final /* synthetic */ rgf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgf(rgf rgfVar, boolean z, lu2<? super mgf> lu2Var) {
        super(2, lu2Var);
        this.this$0 = rgfVar;
        this.$cancelSelection = z;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new mgf(this.this$0, this.$cancelSelection, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((mgf) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            if (kjf.c(this.this$0.m().b)) {
                return j6g.a;
            }
            rgf rgfVar = this.this$0;
            y72 y72Var = rgfVar.g;
            if (y72Var != null) {
                x72 x72VarA = a82.a(ojd.c(rgfVar.m()));
                this.label = 1;
                j6g j6gVarB = y72Var.b(x72VarA);
                g13 g13Var = g13.a;
                if (j6gVarB == g13Var) {
                    return g13Var;
                }
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        if (!this.$cancelSelection) {
            return j6g.a;
        }
        int iE = kjf.e(this.this$0.m().b);
        jhf jhfVarE = rgf.e(this.this$0.m().a, cr8.c(iE, iE));
        this.this$0.c.invoke(jhfVarE);
        this.this$0.w = new kjf(jhfVarE.b);
        this.this$0.p(mf6.a);
        return j6g.a;
    }
}
