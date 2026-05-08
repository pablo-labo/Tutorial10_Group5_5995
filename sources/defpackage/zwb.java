package defpackage;

import defpackage.fdg;
import defpackage.hva;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$updateMilitaryService$1$1", f = "ProfileSectionsViewModel.kt", l = {658}, m = "invokeSuspend")
public final class zwb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ mt9 $militaryServiceItem;
    final /* synthetic */ gu5<j6g> $onComplete;
    final /* synthetic */ String $resumeId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwb(yvb yvbVar, mt9 mt9Var, String str, gu5<j6g> gu5Var, lu2<? super zwb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$militaryServiceItem = mt9Var;
        this.$resumeId = str;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        zwb zwbVar = new zwb(this.this$0, this.$militaryServiceItem, this.$resumeId, this.$onComplete, lu2Var);
        zwbVar.L$0 = obj;
        return zwbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((zwb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objS;
        e13 e13Var = (e13) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            yvb yvbVar = this.this$0;
            ig3 ig3Var = this.$militaryServiceItem.f;
            yvbVar.getClass();
            a18 a18VarZ = yvb.z(ig3Var);
            zcd zcdVar = this.this$0.b;
            String str = this.$resumeId;
            mt9 mt9Var = this.$militaryServiceItem;
            String str2 = mt9Var.a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            String str4 = mt9Var.b;
            hva cVar = str4 == null ? hva.a.a : new hva.c(str4);
            String str5 = this.$militaryServiceItem.c;
            hva cVar2 = str5 == null ? hva.a.a : new hva.c(str5);
            String str6 = this.$militaryServiceItem.d;
            hva cVar3 = str6 == null ? hva.a.a : new hva.c(str6);
            String str7 = this.$militaryServiceItem.e;
            List listZ = u63.Z(new cdg(cVar2, cVar3, cVar, str7 == null ? hva.a.a : new hva.c(str7), a18VarZ == null ? hva.a.a : new hva.c(a18VarZ), str3));
            this.L$0 = e13Var;
            this.L$1 = null;
            this.label = 1;
            objS = zcdVar.S(str, listZ, this);
            g13 g13Var = g13.a;
            if (objS == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            objS = obj;
        }
        List list = (List) objS;
        yvb yvbVar2 = this.this$0;
        if (list != null) {
            gu5<j6g> gu5Var = this.$onComplete;
            it9 it9Var = ((fdg.b) list.get(0)).b;
            List<it9> list2 = yvbVar2.v().k;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (!((it9) obj2).a.equals(it9Var.a)) {
                    arrayList.add(obj2);
                }
            }
            ((gme) yvbVar2.d).setValue(svb.a(yvbVar2.v(), null, null, false, null, null, null, null, null, false, null, z92.g1(it9Var, new ArrayList(arrayList)), null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1025, 8388607));
            ((gme) yvbVar2.e).setValue(b5g.a);
            gu5Var.invoke();
        } else {
            ((gme) yvbVar2.e).setValue(b5g.c);
        }
        return j6g.a;
    }
}
