package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$onDeleteWorkExperience$3", f = "ProfileSectionsViewModel.kt", l = {476}, m = "invokeSuspend")
public final class vwb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $onComplete;
    final /* synthetic */ String $workExperienceIdToDelete;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwb(lu2 lu2Var, gu5 gu5Var, yvb yvbVar, String str) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$onComplete = gu5Var;
        this.$workExperienceIdToDelete = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        vwb vwbVar = new vwb(lu2Var, this.$onComplete, this.this$0, this.$workExperienceIdToDelete);
        vwbVar.L$0 = obj;
        return vwbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((vwb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        yvb yvbVar;
        Object objZ;
        gu5<j6g> gu5Var;
        String str;
        e13 e13Var = (e13) this.L$0;
        g13 g13Var = g13.a;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            String str2 = this.this$0.v().a;
            if (str2 == null) {
                this.$onComplete.invoke();
                return j6g.a;
            }
            yvbVar = this.this$0;
            String str3 = this.$workExperienceIdToDelete;
            gu5<j6g> gu5Var2 = this.$onComplete;
            zcd zcdVar = yvbVar.b;
            List listZ = u63.Z(str3);
            this.L$0 = e13Var;
            this.L$1 = yvbVar;
            this.L$2 = gu5Var2;
            this.L$3 = null;
            this.I$0 = 0;
            this.label = 1;
            objZ = zcdVar.z(str2, listZ, this);
            if (objZ == g13Var) {
                return g13Var;
            }
            gu5Var = gu5Var2;
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gu5Var = (gu5) this.L$2;
            yvb yvbVar2 = (yvb) this.L$1;
            r7d.b(obj);
            yvbVar = yvbVar2;
            objZ = obj;
        }
        List list = (List) objZ;
        if (list != null && (str = (String) z92.Q0(list)) != null) {
            synchronized (e13Var) {
                try {
                    List<j2h> list2 = yvbVar.v().g;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        if (!((j2h) obj2).a.equals(str)) {
                            arrayList.add(obj2);
                        }
                    }
                    ((gme) yvbVar.d).setValue(svb.a(yvbVar.v(), null, null, false, null, null, null, arrayList, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -65, 8388607));
                    yvbVar.L();
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ((gme) yvbVar.e).setValue(b5g.a);
        gu5Var.invoke();
        return j6g.a;
    }
}
