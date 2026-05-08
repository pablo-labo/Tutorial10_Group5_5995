package defpackage;

import defpackage.hva;
import defpackage.nz1;
import defpackage.wbg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$editCertification$1$1", f = "ProfileSectionsViewModel.kt", l = {1787}, m = "invokeSuspend")
public final class owb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ hz1 $certification;
    final /* synthetic */ a18 $inputDateRange;
    final /* synthetic */ gu5<j6g> $onComplete;
    final /* synthetic */ String $resumeId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owb(yvb yvbVar, String str, hz1 hz1Var, a18 a18Var, gu5<j6g> gu5Var, lu2<? super owb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$resumeId = str;
        this.$certification = hz1Var;
        this.$inputDateRange = a18Var;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        owb owbVar = new owb(this.this$0, this.$resumeId, this.$certification, this.$inputDateRange, this.$onComplete, lu2Var);
        owbVar.L$0 = obj;
        return owbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((owb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objN;
        e13 e13Var = (e13) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            zcd zcdVar = this.this$0.b;
            String str = this.$resumeId;
            hz1 hz1Var = this.$certification;
            String str2 = hz1Var.a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = hz1Var.b;
            hva cVar = str3 == null ? hva.a.a : new hva.c(str3);
            a18 a18Var = this.$inputDateRange;
            hva cVar2 = a18Var == null ? hva.a.a : new hva.c(a18Var);
            String str4 = this.$certification.d;
            List listZ = u63.Z(new l9g(cVar2, str4 == null ? hva.a.a : new hva.c(str4), cVar, str2));
            this.L$0 = e13Var;
            this.label = 1;
            objN = zcdVar.N(str, listZ, this);
            g13 g13Var = g13.a;
            if (objN == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            objN = obj;
        }
        List list = (List) objN;
        yvb yvbVar = this.this$0;
        if (list != null) {
            gu5<j6g> gu5Var = this.$onComplete;
            List list2 = list;
            ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                nz1 nz1Var = ((wbg.a) it.next()).b;
                String str5 = nz1Var.d;
                nz1.a aVar = nz1Var.c;
                arrayList.add(new hz1(str5, nz1Var.a, aVar != null ? aVar.b : null, nz1Var.b, 4));
            }
            List<hz1> list3 = yvbVar.v().G;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                String str6 = ((hz1) obj2).a;
                hz1 hz1Var2 = (hz1) z92.Q0(arrayList);
                if (!wl7.b(str6, hz1Var2 != null ? hz1Var2.a : null)) {
                    arrayList2.add(obj2);
                }
            }
            ((gme) yvbVar.d).setValue(svb.a(yvbVar.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, z92.h1(new ArrayList(arrayList2), arrayList), false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8388606));
            ((gme) yvbVar.e).setValue(b5g.a);
            gu5Var.invoke();
        } else {
            ((gme) yvbVar.e).setValue(b5g.c);
        }
        return j6g.a;
    }
}
