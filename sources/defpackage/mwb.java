package defpackage;

import defpackage.hva;
import defpackage.ibg;
import defpackage.mu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$editAssociation$1$1", f = "ProfileSectionsViewModel.kt", l = {1305}, m = "invokeSuspend")
public final class mwb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ lu0 $associationItem;
    final /* synthetic */ gu5<j6g> $onComplete;
    final /* synthetic */ String $resumeId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwb(yvb yvbVar, lu0 lu0Var, String str, gu5<j6g> gu5Var, lu2<? super mwb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$associationItem = lu0Var;
        this.$resumeId = str;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        mwb mwbVar = new mwb(this.this$0, this.$associationItem, this.$resumeId, this.$onComplete, lu2Var);
        mwbVar.L$0 = obj;
        return mwbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((mwb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objL;
        e13 e13Var = (e13) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            yvb yvbVar = this.this$0;
            ig3 ig3Var = this.$associationItem.c;
            yvbVar.getClass();
            a18 a18VarZ = yvb.z(ig3Var);
            ((gme) this.this$0.e).setValue(b5g.b);
            zcd zcdVar = this.this$0.b;
            String str = this.$resumeId;
            lu0 lu0Var = this.$associationItem;
            String str2 = lu0Var.a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = lu0Var.b;
            hva cVar = str3 == null ? hva.a.a : new hva.c(str3);
            hva cVar2 = a18VarZ == null ? hva.a.a : new hva.c(a18VarZ);
            String str4 = this.$associationItem.d;
            List listZ = u63.Z(new h9g(cVar2, str4 == null ? hva.a.a : new hva.c(str4), cVar, str2));
            this.L$0 = e13Var;
            this.L$1 = null;
            this.label = 1;
            objL = zcdVar.L(str, listZ, this);
            g13 g13Var = g13.a;
            if (objL == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            objL = obj;
        }
        List list = (List) objL;
        yvb yvbVar2 = this.this$0;
        if (list != null) {
            gu5<j6g> gu5Var = this.$onComplete;
            List list2 = list;
            ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                mu0 mu0Var = ((ibg.a) it.next()).b;
                String str5 = mu0Var.d;
                mu0.a aVar = mu0Var.c;
                arrayList.add(new lu0(str5, mu0Var.a, aVar != null ? aVar.b : null, mu0Var.b));
            }
            List<lu0> list3 = yvbVar2.v().C;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                String str6 = ((lu0) obj2).a;
                lu0 lu0Var2 = (lu0) z92.Q0(arrayList);
                if (!wl7.b(str6, lu0Var2 != null ? lu0Var2.a : null)) {
                    arrayList2.add(obj2);
                }
            }
            ((gme) yvbVar2.d).setValue(svb.a(yvbVar2.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, z92.h1(new ArrayList(arrayList2), arrayList), false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -268435457, 8388607));
            ((gme) yvbVar2.e).setValue(b5g.a);
            gu5Var.invoke();
        } else {
            ((gme) yvbVar2.e).setValue(b5g.c);
        }
        return j6g.a;
    }
}
