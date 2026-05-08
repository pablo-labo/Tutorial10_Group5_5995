package defpackage;

import defpackage.rsc;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.searchoverlay.ui.SearchOverlayViewModel$getNewJobsCounts$1$1", f = "SearchOverlayViewModel.kt", l = {447}, m = "invokeSuspend")
public final class dud extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ lsc $recentSearch;
    int label;
    final /* synthetic */ cud this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dud(cud cudVar, lsc lscVar, lu2<? super dud> lu2Var) {
        super(2, lu2Var);
        this.this$0 = cudVar;
        this.$recentSearch = lscVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new dud(this.this$0, this.$recentSearch, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((dud) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        g13 g13Var = g13.a;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            oha ohaVar = this.this$0.c;
            lsc lscVar = this.$recentSearch;
            this.label = 1;
            obj = ohaVar.a(lscVar, this);
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
        int iIntValue = ((Number) obj).intValue();
        cud cudVar = this.this$0;
        lsc lscVar2 = this.$recentSearch;
        Integer num = new Integer(iIntValue);
        synchronized (cudVar) {
            rsc rscVarK = cudVar.k();
            rsc.a aVar = rscVarK instanceof rsc.a ? (rsc.a) rscVarK : null;
            if (aVar != null) {
                LinkedHashMap linkedHashMapI0 = lc9.i0(aVar.a);
                lsc lscVar3 = (lsc) linkedHashMapI0.get(lscVar2.a);
                if (lscVar3 != null) {
                    linkedHashMapI0.put(lscVar3.a, lsc.a(lscVar3, num, 23));
                }
                ((gme) cudVar.j0).setValue(rsc.a.b(aVar, linkedHashMapI0, 6));
                j6g j6gVar = j6g.a;
            }
        }
        return j6g.a;
    }
}
