package defpackage;

import defpackage.ccg;
import defpackage.hva;
import defpackage.jo4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$editEducation$1$1", f = "ProfileSectionsViewModel.kt", l = {1579}, m = "invokeSuspend")
public final class pwb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ go4 $educationItem;
    final /* synthetic */ String $indeedResumeId;
    final /* synthetic */ gu5<j6g> $onComplete;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwb(yvb yvbVar, go4 go4Var, String str, gu5<j6g> gu5Var, lu2<? super pwb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$educationItem = go4Var;
        this.$indeedResumeId = str;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        pwb pwbVar = new pwb(this.this$0, this.$educationItem, this.$indeedResumeId, this.$onComplete, lu2Var);
        pwbVar.L$0 = obj;
        return pwbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((pwb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objO;
        e13 e13Var = (e13) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            ((gme) this.this$0.e).setValue(b5g.b);
            yvb yvbVar = this.this$0;
            go4 go4Var = this.$educationItem;
            yvbVar.getClass();
            Pair pairB = yvb.B(go4Var);
            a18 a18Var = (a18) pairB.a();
            p38 p38Var = (p38) pairB.b();
            zcd zcdVar = this.this$0.b;
            String str = this.$indeedResumeId;
            hva hvaVarA = hva.b.a(this.$educationItem.c);
            hva hvaVarA2 = hva.b.a(this.$educationItem.e);
            go4 go4Var2 = this.$educationItem;
            jo4.b bVar = go4Var2.b;
            String str2 = go4Var2.d;
            String str3 = bVar != null ? bVar.c : "";
            hva hvaVarA3 = hva.b.a(str2 != null ? new xeg(hva.b.a(go4Var2.c), hva.b.a(str2), 28) : null);
            go4 go4Var3 = this.$educationItem;
            hva hvaVarA4 = hva.b.a(new v9g(str3, hvaVarA, hvaVarA2, hvaVarA3, hva.b.a(go4Var3.f != null ? new xeg(hva.b.a(go4Var3.e), hva.b.a(go4Var3.f), 28) : null)));
            hva hvaVarA5 = hva.b.a(a18Var);
            hva hvaVarA6 = hva.b.a(p38Var);
            hva hvaVarA7 = hva.b.a(this.$educationItem.g);
            String str4 = this.$educationItem.a;
            String str5 = str4 == null ? "" : str4;
            jo4 jo4Var = this.this$0.v().z.get(this.$educationItem.a);
            List listZ = u63.Z(new x9g(hvaVarA5, hvaVarA4, hvaVarA6, hvaVarA7, hva.b.a(jo4Var != null ? jo4Var.f : null), str5));
            this.L$0 = e13Var;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            objO = zcdVar.O(str, listZ, this);
            g13 g13Var = g13.a;
            if (objO == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            objO = obj;
        }
        List list = (List) objO;
        yvb yvbVar2 = this.this$0;
        if (list != null) {
            gu5<j6g> gu5Var = this.$onComplete;
            LinkedHashMap linkedHashMapI0 = lc9.i0(yvbVar2.v().z);
            List list2 = list;
            ArrayList<jo4> arrayList = new ArrayList(t92.r0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ccg.b) it.next()).b);
            }
            for (jo4 jo4Var2 : arrayList) {
                linkedHashMapI0.put(jo4Var2.a, jo4Var2);
            }
            ((gme) yvbVar2.d).setValue(svb.a(yvbVar2.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, lc9.g0(linkedHashMapI0), null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -33554433, 8388607));
            ((gme) yvbVar2.e).setValue(b5g.a);
            gu5Var.invoke();
        } else {
            ((gme) yvbVar2.e).setValue(b5g.c);
        }
        return j6g.a;
    }
}
