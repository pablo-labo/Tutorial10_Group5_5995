package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.screens.sheets.preferences.WorkSchedulePreferencesBottomSheet$getUpdatedPreferences$1", f = "WorkSchedulePreferencesBottomSheet.kt", l = {105}, m = "invokeSuspend")
public final class i3h extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ j3h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3h(j3h j3hVar, lu2<? super i3h> lu2Var) {
        super(2, lu2Var);
        this.this$0 = j3hVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new i3h(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((i3h) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            aub aubVarQ = this.this$0.Q();
            this.label = 1;
            Serializable serializableS = aubVarQ.s(this);
            g13 g13Var = g13.a;
            if (serializableS == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        this.this$0.P(false);
        return j6g.a;
    }
}
