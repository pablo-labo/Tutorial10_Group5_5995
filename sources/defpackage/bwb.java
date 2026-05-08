package defpackage;

import defpackage.wje;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$checkSkillsSuggestionsDismissStatus$1", f = "ProfileSectionsViewModel.kt", l = {2966}, m = "invokeSuspend")
public final class bwb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwb(yvb yvbVar, lu2<? super bwb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new bwb(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((bwb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objB;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            c0g c0gVar = this.this$0.c;
            this.label = 1;
            objB = c0gVar.b(this);
            g13 g13Var = g13.a;
            if (objB == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            objB = obj;
        }
        wje wjeVar = (wje) objB;
        if (wjeVar instanceof wje.a) {
            long jCurrentTimeMillis = System.currentTimeMillis() - ((wje.a) wjeVar).a;
            yvb yvbVar = this.this$0;
            ((gme) yvbVar.d).setValue(svb.a(yvbVar.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, jCurrentTimeMillis > 1209600000, null, false, null, null, null, -1, 8257535));
        } else if (wjeVar instanceof wje.c) {
            yvb yvbVar2 = this.this$0;
            ((gme) yvbVar2.d).setValue(svb.a(yvbVar2.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, true, null, false, null, null, null, -1, 8257535));
        } else {
            if (!(wjeVar instanceof wje.b)) {
                l.g();
                return null;
            }
            yvb yvbVar3 = this.this$0;
            ((gme) yvbVar3.d).setValue(svb.a(yvbVar3.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8257535));
        }
        return j6g.a;
    }
}
