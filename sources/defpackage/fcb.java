package defpackage;

import android.view.textclassifier.TextClassifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenu$2", f = "PlatformSelectionBehaviors.android.kt", l = {168}, m = "invokeSuspend")
public final class fcb extends c1f implements Function2<TextClassifier, lu2<? super j6g>, Object> {
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ icb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcb(long j, lu2 lu2Var, icb icbVar, CharSequence charSequence) {
        super(2, lu2Var);
        this.this$0 = icbVar;
        this.$text = charSequence;
        this.$selection = j;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        fcb fcbVar = new fcb(this.$selection, lu2Var, this.this$0, this.$text);
        fcbVar.L$0 = obj;
        return fcbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TextClassifier textClassifier, lu2<? super j6g> lu2Var) {
        return ((fcb) create(textClassifier, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            icb icbVar = this.this$0;
            CharSequence charSequence = this.$text;
            long j = this.$selection;
            this.label = 1;
            Object objC = icb.c(icbVar, charSequence, j, textClassifier, this);
            g13 g13Var = g13.a;
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
        return j6g.a;
    }
}
