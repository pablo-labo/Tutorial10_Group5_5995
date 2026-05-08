package defpackage;

import defpackage.hva;
import defpackage.ldg;
import defpackage.q5b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$editPatent$1$1", f = "ProfileSectionsViewModel.kt", l = {976}, m = "invokeSuspend")
public final class qwb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $onComplete;
    final /* synthetic */ n5b $patentItem;
    final /* synthetic */ String $resumeId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwb(yvb yvbVar, n5b n5bVar, String str, gu5<j6g> gu5Var, lu2<? super qwb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$patentItem = n5bVar;
        this.$resumeId = str;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        qwb qwbVar = new qwb(this.this$0, this.$patentItem, this.$resumeId, this.$onComplete, lu2Var);
        qwbVar.L$0 = obj;
        return qwbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((qwb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objT;
        e13 e13Var = (e13) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            yvb yvbVar = this.this$0;
            tg3 tg3Var = this.$patentItem.b;
            yvbVar.getClass();
            d18 d18VarA = yvb.A(tg3Var);
            zcd zcdVar = this.this$0.b;
            String str = this.$resumeId;
            n5b n5bVar = this.$patentItem;
            String str2 = n5bVar.a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            String str4 = n5bVar.d;
            hva cVar = str4 == null ? hva.a.a : new hva.c(str4);
            String str5 = this.$patentItem.f;
            hva cVar2 = str5 == null ? hva.a.a : new hva.c(str5);
            hva cVar3 = d18VarA == null ? hva.a.a : new hva.c(d18VarA);
            String str6 = this.$patentItem.e;
            hva cVar4 = str6 == null ? hva.a.a : new hva.c(str6);
            String str7 = this.$patentItem.c;
            List listZ = u63.Z(new rag(cVar, cVar2, cVar3, str7 == null ? hva.a.a : new hva.c(str7), cVar4, str3));
            this.L$0 = e13Var;
            this.L$1 = null;
            this.label = 1;
            objT = zcdVar.T(str, listZ, this);
            g13 g13Var = g13.a;
            if (objT == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            objT = obj;
        }
        List list = (List) objT;
        yvb yvbVar2 = this.this$0;
        if (list != null) {
            gu5<j6g> gu5Var = this.$onComplete;
            List list2 = list;
            ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                q5b q5bVar = ((ldg.b) it.next()).b;
                String str8 = q5bVar.a;
                q5b.a aVar = q5bVar.b;
                arrayList.add(new n5b(str8, aVar != null ? aVar.b : null, q5bVar.d, q5bVar.e, q5bVar.f, q5bVar.c));
            }
            List<n5b> list3 = yvbVar2.v().r;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                String str9 = ((n5b) obj2).a;
                n5b n5bVar2 = (n5b) z92.Q0(arrayList);
                if (!wl7.b(str9, n5bVar2 != null ? n5bVar2.a : null)) {
                    arrayList2.add(obj2);
                }
            }
            ((gme) yvbVar2.d).setValue(svb.a(yvbVar2.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, z92.h1(new ArrayList(arrayList2), arrayList), false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -131073, 8388607));
            ((gme) yvbVar2.e).setValue(b5g.a);
            gu5Var.invoke();
        } else {
            ((gme) yvbVar2.e).setValue(b5g.c);
        }
        return j6g.a;
    }
}
