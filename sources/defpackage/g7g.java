package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.components.UnsaveComponentKt$UnsaveJobCard$1$2$1", f = "UnsaveComponent.kt", l = {}, m = "invokeSuspend")
public final class g7g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ sm5 $focusRequester;
    final /* synthetic */ String $titleName;
    final /* synthetic */ String $unSavemessage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7g(Context context, String str, String str2, sm5 sm5Var, lu2<? super g7g> lu2Var) {
        super(2, lu2Var);
        this.$context = context;
        this.$titleName = str;
        this.$unSavemessage = str2;
        this.$focusRequester = sm5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new g7g(this.$context, this.$titleName, this.$unSavemessage, this.$focusRequester, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((g7g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        h7g.b(this.$context, this.$titleName + " " + this.$unSavemessage);
        sm5.b(this.$focusRequester);
        return j6g.a;
    }
}
