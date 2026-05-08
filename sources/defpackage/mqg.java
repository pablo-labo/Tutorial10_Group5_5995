package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {410, 412}, m = "invokeSuspend")
public final class mqg extends n7d implements Function2<t6e<? super View>, lu2<? super j6g>, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqg(View view, lu2<? super mqg> lu2Var) {
        super(2, lu2Var);
        this.$this_allViews = view;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        mqg mqgVar = new mqg(this.$this_allViews, lu2Var);
        mqgVar.L$0 = obj;
        return mqgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(t6e<? super View> t6eVar, lu2<? super j6g> lu2Var) {
        return ((mqg) create(t6eVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        g13 g13Var = g13.a;
        if (i == 0) {
            r7d.b(obj);
            t6e t6eVar = (t6e) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = t6eVar;
            this.label = 1;
            t6eVar.a(this, view);
            return g13Var;
        }
        if (i == 1) {
            t6e t6eVar2 = (t6e) this.L$0;
            r7d.b(obj);
            View view2 = this.$this_allViews;
            if (view2 instanceof ViewGroup) {
                this.L$0 = null;
                this.label = 2;
                t6eVar2.getClass();
                Object objB = t6eVar2.b(new ntf(new knc((ViewGroup) view2, 1), oy5.d), this);
                if (objB != g13Var) {
                    objB = j6g.a;
                }
                if (objB == g13Var) {
                    return g13Var;
                }
            }
        } else {
            if (i != 2) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
