package defpackage;

import android.util.Log;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileViewModel$dismissRdiAlert$1", f = "ProfileViewModel.kt", l = {718}, m = "invokeSuspend")
public final class z1c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $currentFileId;
    int label;
    final /* synthetic */ x1c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1c(x1c x1cVar, String str, lu2<? super z1c> lu2Var) {
        super(2, lu2Var);
        this.this$0 = x1cVar;
        this.$currentFileId = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new z1c(this.this$0, this.$currentFileId, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((z1c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                ArrayList arrayList = lz2.a;
                Log.d("ProfileViewModel", "RDI DEBUG: User dismissed RDI alert", null);
                zcd zcdVar = this.this$0.c;
                String str = this.$currentFileId;
                u8d u8dVar = u8d.c;
                this.label = 1;
                Object objN = zcdVar.n(str, "jsma-droid", u8dVar, this);
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
            }
            x1c x1cVar = this.this$0;
            ((gme) x1cVar.c0).setValue(hjc.a(x1cVar.p(), false, false, 6));
        } catch (Exception e) {
            ArrayList arrayList2 = lz2.a;
            o6.l("Error dismissing RDI alert: ", e, "ProfileViewModel", false, e);
        }
        return j6g.a;
    }
}
