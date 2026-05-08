package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.searchoverlay.ui.SearchOverlayViewModel$getProfileLocation$1", f = "SearchOverlayViewModel.kt", l = {536}, m = "invokeSuspend")
public final class eud extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ cud this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eud(cud cudVar, lu2<? super eud> lu2Var) {
        super(2, lu2Var);
        this.this$0 = cudVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new eud(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((eud) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        cud cudVar;
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                cudVar = this.this$0;
                wrb wrbVar = cudVar.e;
                this.L$0 = cudVar;
                this.label = 1;
                obj = wrbVar.a(this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cudVar = (cud) this.L$0;
                r7d.b(obj);
            }
            cudVar.l0 = (String) obj;
            cud cudVar2 = this.this$0;
            ((gme) cudVar2.f0).setValue(((zyg) ((gme) cudVar2.f0).getValue()) == zyg.b ? zyg.d : zyg.e);
        } catch (Exception e) {
            ArrayList arrayList = lz2.a;
            lz2.g("SearchOverlayViewModel", "Error getting formatted profile location", false, e);
        }
        return j6g.a;
    }
}
