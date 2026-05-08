package defpackage;

import defpackage.hva;
import defpackage.pbg;
import defpackage.s61;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$editAward$1$1", f = "ProfileSectionsViewModel.kt", l = {1161}, m = "invokeSuspend")
public final class nwb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ d18 $awardInputDateType;
    final /* synthetic */ m61 $awardItem;
    final /* synthetic */ gu5<j6g> $onComplete;
    final /* synthetic */ String $resumeId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwb(yvb yvbVar, String str, m61 m61Var, d18 d18Var, gu5<j6g> gu5Var, lu2<? super nwb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$resumeId = str;
        this.$awardItem = m61Var;
        this.$awardInputDateType = d18Var;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        nwb nwbVar = new nwb(this.this$0, this.$resumeId, this.$awardItem, this.$awardInputDateType, this.$onComplete, lu2Var);
        nwbVar.L$0 = obj;
        return nwbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((nwb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objM;
        e13 e13Var = (e13) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            ((gme) this.this$0.e).setValue(b5g.b);
            zcd zcdVar = this.this$0.b;
            String str = this.$resumeId;
            m61 m61Var = this.$awardItem;
            String str2 = m61Var.a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = m61Var.d;
            String str4 = str3 != null ? str3 : "";
            d18 d18Var = this.$awardInputDateType;
            hva cVar = d18Var == null ? hva.a.a : new hva.c(d18Var);
            String str5 = this.$awardItem.c;
            List listZ = u63.Z(new j9g(str2, cVar, str5 == null ? hva.a.a : new hva.c(str5), str4));
            this.L$0 = e13Var;
            this.label = 1;
            objM = zcdVar.M(str, listZ, this);
            g13 g13Var = g13.a;
            if (objM == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            objM = obj;
        }
        List list = (List) objM;
        yvb yvbVar = this.this$0;
        if (list != null) {
            gu5<j6g> gu5Var = this.$onComplete;
            List list2 = list;
            ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                s61 s61Var = ((pbg.a) it.next()).b;
                String str6 = s61Var.a;
                s61.a aVar = s61Var.b;
                arrayList.add(new m61(str6, aVar != null ? aVar.b : null, s61Var.c, s61Var.d));
            }
            List<m61> list3 = yvbVar.v().v;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                String str7 = ((m61) obj2).a;
                m61 m61Var2 = (m61) z92.Q0(arrayList);
                if (!wl7.b(str7, m61Var2 != null ? m61Var2.a : null)) {
                    arrayList2.add(obj2);
                }
            }
            ((gme) yvbVar.d).setValue(svb.a(yvbVar.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, z92.h1(new ArrayList(arrayList2), arrayList), null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -2097153, 8388607));
            ((gme) yvbVar.e).setValue(b5g.a);
            gu5Var.invoke();
        } else {
            ((gme) yvbVar.e).setValue(b5g.c);
        }
        return j6g.a;
    }
}
