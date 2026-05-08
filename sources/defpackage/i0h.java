package defpackage;

import android.view.View;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {227}, m = "invokeSuspend")
public final class i0h extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ xsc $newRecomposer;
    final /* synthetic */ View $rootView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0h(xsc xscVar, View view, lu2<? super i0h> lu2Var) {
        super(2, lu2Var);
        this.$newRecomposer = xscVar;
        this.$rootView = view;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new i0h(this.$newRecomposer, this.$rootView, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((i0h) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                xsc xscVar = this.$newRecomposer;
                this.label = 1;
                Object objC = wg2.C(xscVar.t, new ysc(2, null), this);
                Object obj2 = g13.a;
                if (objC != obj2) {
                    objC = j6g.a;
                }
                if (objC == obj2) {
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
        } finally {
            if (o0h.b(this.$rootView) == this.$newRecomposer) {
                this.$rootView.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
