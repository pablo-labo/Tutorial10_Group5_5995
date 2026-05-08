package defpackage;

import com.indeed.android.jobsearch.tare.debug.ProfileFormsDebugFragment;
import defpackage.e46;
import defpackage.xj8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tare.debug.ProfileFormsDebugFragment$fetchLanguageSkills$2", f = "ProfileFormsDebugFragment.kt", l = {222}, m = "invokeSuspend")
public final class rqb extends c1f implements Function2<e13, lu2<? super List<? extends wj8>>, Object> {
    int label;
    final /* synthetic */ ProfileFormsDebugFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqb(ProfileFormsDebugFragment profileFormsDebugFragment, lu2<? super rqb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = profileFormsDebugFragment;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new rqb(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super List<? extends wj8>> lu2Var) {
        return ((rqb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        xj8.f fVar;
        xj8.g gVar;
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                zcd zcdVar = this.this$0.b;
                this.label = 1;
                obj = zcdVar.I(this);
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
            List list = (List) ((Pair) obj).b();
            e46.o oVar = list != null ? (e46.o) z92.Q0(list) : null;
            if (oVar != null) {
                ArrayList arrayList = oVar.n;
                ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    xj8 xj8Var = ((e46.h) it.next()).b;
                    String str = xj8Var.a;
                    xj8.e eVar = xj8Var.b;
                    String str2 = eVar != null ? eVar.a : null;
                    String str3 = (eVar == null || (gVar = eVar.b) == null) ? null : gVar.d;
                    xj8.h hVar = xj8Var.c;
                    arrayList2.add(new wj8(32, str, str2, str3, hVar != null ? hVar.a : null, (hVar == null || (fVar = hVar.b) == null) ? null : fVar.d));
                }
                return arrayList2;
            }
        } catch (Exception unused) {
        }
        return zr4.a;
    }
}
