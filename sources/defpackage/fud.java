package defpackage;

import defpackage.rsc;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.searchoverlay.ui.SearchOverlayViewModel$getRecentSearches$1$1", f = "SearchOverlayViewModel.kt", l = {463}, m = "invokeSuspend")
public final class fud extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ cud this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fud(cud cudVar, lu2<? super fud> lu2Var) {
        super(2, lu2Var);
        this.this$0 = cudVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new fud(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((fud) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        rsc.a aVar;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            qsc qscVar = this.this$0.b;
            this.label = 1;
            obj = qscVar.a(this);
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
        List list = (List) obj;
        cud cudVar = this.this$0;
        if (list.isEmpty()) {
            aVar = new rsc.a(3, bs4.a, false);
        } else {
            List list2 = list;
            int iV = kc9.V(t92.r0(list2, 10));
            if (iV < 16) {
                iV = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
            for (Object obj2 : list2) {
                linkedHashMap.put(((lsc) obj2).a, obj2);
            }
            aVar = new rsc.a(3, linkedHashMap, this.this$0.n() == kyg.c);
        }
        ((gme) cudVar.j0).setValue(aVar);
        cud cudVar2 = this.this$0;
        rsc rscVarK = cudVar2.k();
        if (rscVarK instanceof rsc.a) {
            Iterator<T> it = ((rsc.a) rscVarK).a.values().iterator();
            while (it.hasNext()) {
                u63.Y(ee3.p(cudVar2), null, null, new dud(cudVar2, (lsc) it.next(), null), 3);
            }
        }
        return j6g.a;
    }
}
