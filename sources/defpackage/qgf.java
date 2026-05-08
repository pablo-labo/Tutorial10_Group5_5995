package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1", f = "TextFieldSelectionManager.kt", l = {539}, m = "invokeSuspend")
public final class qgf extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ roa $offsetMapping;
    final /* synthetic */ dcb $platformSelectionBehaviors;
    final /* synthetic */ kjf $selection;
    final /* synthetic */ String $text;
    final /* synthetic */ long $transformedSelection;
    int label;
    final /* synthetic */ rgf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgf(dcb dcbVar, String str, long j, kjf kjfVar, rgf rgfVar, roa roaVar, lu2<? super qgf> lu2Var) {
        super(2, lu2Var);
        this.$platformSelectionBehaviors = dcbVar;
        this.$text = str;
        this.$transformedSelection = j;
        this.$selection = kjfVar;
        this.this$0 = rgfVar;
        this.$offsetMapping = roaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new qgf(this.$platformSelectionBehaviors, this.$text, this.$transformedSelection, this.$selection, this.this$0, this.$offsetMapping, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((qgf) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            dcb dcbVar = this.$platformSelectionBehaviors;
            String str = this.$text;
            long j = this.$transformedSelection;
            this.label = 1;
            obj = dcbVar.b(str, j, this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        kjf kjfVar = (kjf) obj;
        if (kjfVar == null) {
            return j6g.a;
        }
        roa roaVar = this.$offsetMapping;
        long j2 = kjfVar.a;
        long jC = cr8.c(roaVar.a((int) (j2 >> 32)), roaVar.a((int) (j2 & 4294967295L)));
        if (!kjf.a(this.$selection, jC) && wl7.b(this.this$0.m().a.b, this.$text)) {
            roa roaVar2 = this.$offsetMapping;
            rgf rgfVar = this.this$0;
            if (roaVar2 == rgfVar.b) {
                rgfVar.c.invoke(rgf.e(rgfVar.m().a, jC));
                this.this$0.w = new kjf(jC);
            }
        }
        return j6g.a;
    }
}
