package defpackage;

import defpackage.hva;
import defpackage.r6c;
import defpackage.tdg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$editPublication$1$1", f = "ProfileSectionsViewModel.kt", l = {817}, m = "invokeSuspend")
public final class rwb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $onComplete;
    final /* synthetic */ p6c $publicationItem;
    final /* synthetic */ String $resumeId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwb(yvb yvbVar, p6c p6cVar, String str, gu5<j6g> gu5Var, lu2<? super rwb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$publicationItem = p6cVar;
        this.$resumeId = str;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        rwb rwbVar = new rwb(this.this$0, this.$publicationItem, this.$resumeId, this.$onComplete, lu2Var);
        rwbVar.L$0 = obj;
        return rwbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((rwb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objU;
        e13 e13Var = (e13) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            ((gme) this.this$0.e).setValue(b5g.b);
            yvb yvbVar = this.this$0;
            tg3 tg3Var = this.$publicationItem.b;
            yvbVar.getClass();
            d18 d18VarA = yvb.A(tg3Var);
            zcd zcdVar = this.this$0.b;
            String str = this.$resumeId;
            p6c p6cVar = this.$publicationItem;
            String str2 = p6cVar.a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            String str4 = p6cVar.d;
            hva cVar = str4 == null ? hva.a.a : new hva.c(str4);
            hva cVar2 = d18VarA == null ? hva.a.a : new hva.c(d18VarA);
            String str5 = this.$publicationItem.e;
            hva cVar3 = str5 == null ? hva.a.a : new hva.c(str5);
            String str6 = this.$publicationItem.c;
            List listZ = u63.Z(new tag(str3, cVar, cVar2, str6 == null ? hva.a.a : new hva.c(str6), cVar3));
            this.L$0 = e13Var;
            this.L$1 = null;
            this.label = 1;
            objU = zcdVar.U(str, listZ, this);
            g13 g13Var = g13.a;
            if (objU == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            objU = obj;
        }
        List list = (List) objU;
        yvb yvbVar2 = this.this$0;
        if (list != null) {
            gu5<j6g> gu5Var = this.$onComplete;
            List list2 = list;
            ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                r6c r6cVar = ((tdg.b) it.next()).b;
                String str7 = r6cVar.a;
                r6c.a aVar = r6cVar.b;
                arrayList.add(new p6c(str7, aVar != null ? aVar.b : null, r6cVar.c, r6cVar.d, r6cVar.e));
            }
            List<p6c> list3 = yvbVar2.v().n;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                String str8 = ((p6c) obj2).a;
                p6c p6cVar2 = (p6c) z92.Q0(arrayList);
                if (!wl7.b(str8, p6cVar2 != null ? p6cVar2.a : null)) {
                    arrayList2.add(obj2);
                }
            }
            ((gme) yvbVar2.d).setValue(svb.a(yvbVar2.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, z92.h1(new ArrayList(arrayList2), arrayList), false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -8193, 8388607));
            ((gme) yvbVar2.e).setValue(b5g.a);
            gu5Var.invoke();
        } else {
            ((gme) yvbVar2.e).setValue(b5g.c);
        }
        return j6g.a;
    }
}
