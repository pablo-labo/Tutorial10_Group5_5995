package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", f = "PlatformSelectionBehaviors.android.kt", l = {351, 158}, m = "invokeSuspend")
public final class hcb extends c1f implements Function2<TextClassifier, lu2<? super kjf>, Object> {
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ icb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcb(long j, lu2 lu2Var, icb icbVar, CharSequence charSequence) {
        super(2, lu2Var);
        this.$text = charSequence;
        this.$selection = j;
        this.this$0 = icbVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        hcb hcbVar = new hcb(this.$selection, lu2Var, this.this$0, this.$text);
        hcbVar.L$0 = obj;
        return hcbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TextClassifier textClassifier, lu2<? super kjf> lu2Var) {
        return ((hcb) create(textClassifier, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        long j;
        icb icbVar;
        z4a z4aVar;
        TextSelection textSelection;
        CharSequence charSequence;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            TextSelection.Request.Builder defaultLocales = new TextSelection.Request.Builder(this.$text, kjf.f(this.$selection), kjf.e(this.$selection)).setDefaultLocales(this.this$0.e());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jC = cr8.c(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            g13 g13Var = g13.a;
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                icb icbVar2 = this.this$0;
                CharSequence charSequence2 = this.$text;
                this.J$0 = jC;
                this.label = 2;
                if (icb.c(icbVar2, charSequence2, jC, textClassifier, this) != g13Var) {
                    j = jC;
                }
            } else {
                icbVar = this.this$0;
                z4aVar = icbVar.e;
                CharSequence charSequence3 = this.$text;
                this.L$0 = textSelectionSuggestSelection;
                this.L$1 = z4aVar;
                this.L$2 = icbVar;
                this.L$3 = charSequence3;
                this.J$0 = jC;
                this.label = 1;
                if (z4aVar.h(this) != g13Var) {
                    textSelection = textSelectionSuggestSelection;
                    charSequence = charSequence3;
                    j = jC;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    ((gme) icbVar.g).setValue(new tcf(charSequence, j, textClassification));
                    j6g j6gVar = j6g.a;
                }
            }
            return g13Var;
        }
        if (i == 1) {
            j = this.J$0;
            charSequence = (CharSequence) this.L$3;
            icbVar = (icb) this.L$2;
            z4aVar = (z4a) this.L$1;
            textSelection = (TextSelection) this.L$0;
            r7d.b(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                ((gme) icbVar.g).setValue(new tcf(charSequence, j, textClassification2));
                j6g j6gVar2 = j6g.a;
            } finally {
                z4aVar.p(null);
            }
        } else {
            if (i != 2) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            r7d.b(obj);
        }
        return new kjf(j);
    }
}
