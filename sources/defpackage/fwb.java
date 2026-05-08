package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$deleteEducation$2$1", f = "ProfileSectionsViewModel.kt", l = {1653}, m = "invokeSuspend")
public final class fwb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $deleteItemId;
    final /* synthetic */ gu5<j6g> $onComplete;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwb(lu2 lu2Var, gu5 gu5Var, yvb yvbVar, String str) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$onComplete = gu5Var;
        this.$deleteItemId = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        fwb fwbVar = new fwb(lu2Var, this.$onComplete, this.this$0, this.$deleteItemId);
        fwbVar.L$0 = obj;
        return fwbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((fwb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        yvb yvbVar;
        Object objR;
        e13 e13Var = (e13) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            String str = this.this$0.v().a;
            if (str != null) {
                yvbVar = this.this$0;
                String str2 = this.$deleteItemId;
                ((gme) yvbVar.e).setValue(b5g.b);
                zcd zcdVar = yvbVar.b;
                List listZ = u63.Z(str2);
                this.L$0 = e13Var;
                this.L$1 = yvbVar;
                this.L$2 = null;
                this.I$0 = 0;
                this.label = 1;
                objR = zcdVar.r(str, listZ, this);
                g13 g13Var = g13.a;
                if (objR == g13Var) {
                    return g13Var;
                }
            }
            this.$onComplete.invoke();
            return j6g.a;
        }
        if (i != 1) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yvb yvbVar2 = (yvb) this.L$1;
        r7d.b(obj);
        yvbVar = yvbVar2;
        objR = obj;
        List list = (List) objR;
        ((gme) yvbVar.e).setValue(b5g.a);
        if (list != null) {
            Map<String, jo4> map = yvbVar.v().z;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, jo4> entry : map.entrySet()) {
                if (!list.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ((gme) yvbVar.d).setValue(svb.a(yvbVar.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, linkedHashMap, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -33554433, 8388607));
        } else {
            ((gme) yvbVar.e).setValue(b5g.c);
        }
        this.$onComplete.invoke();
        return j6g.a;
    }
}
