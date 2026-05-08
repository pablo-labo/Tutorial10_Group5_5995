package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$deleteMilitaryService$2$1$1", f = "ProfileSectionsViewModel.kt", l = {695}, m = "invokeSuspend")
public final class hwb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $deleteItemId;
    final /* synthetic */ gu5<j6g> $onComplete;
    final /* synthetic */ String $resumeId;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hwb(yvb yvbVar, String str, String str2, gu5<j6g> gu5Var, lu2<? super hwb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$resumeId = str;
        this.$deleteItemId = str2;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new hwb(this.this$0, this.$resumeId, this.$deleteItemId, this.$onComplete, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((hwb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objV;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            zcd zcdVar = this.this$0.b;
            String str = this.$resumeId;
            List listZ = u63.Z(this.$deleteItemId);
            this.label = 1;
            objV = zcdVar.v(str, listZ, this);
            g13 g13Var = g13.a;
            if (objV == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            objV = obj;
        }
        List list = (List) objV;
        if (list != null) {
            yvb yvbVar = this.this$0;
            List<it9> list2 = yvbVar.v().k;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (!((it9) obj2).a.equals(z92.O0(list))) {
                    arrayList.add(obj2);
                }
            }
            ((gme) yvbVar.d).setValue(svb.a(yvbVar.v(), null, null, false, null, null, null, null, null, false, null, arrayList, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1025, 8388607));
        }
        ((gme) this.this$0.e).setValue(b5g.a);
        this.$onComplete.invoke();
        return j6g.a;
    }
}
