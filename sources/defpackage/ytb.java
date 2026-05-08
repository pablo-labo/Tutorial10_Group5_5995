package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfilePreferencesViewModel$updateWorkSchedulePreferences$1", f = "ProfilePreferencesViewModel.kt", l = {835, 846}, m = "invokeSuspend")
public final class ytb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ List<sjb> $daysPreferences;
    final /* synthetic */ Function1<ws7, j6g> $onComplete;
    final /* synthetic */ List<sjb> $schedulesPreferences;
    final /* synthetic */ List<sjb> $shiftsPreferences;
    boolean Z$0;
    int label;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ytb(aub aubVar, List<sjb> list, List<sjb> list2, List<sjb> list3, Function1<? super ws7, j6g> function1, lu2<? super ytb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aubVar;
        this.$daysPreferences = list;
        this.$shiftsPreferences = list2;
        this.$schedulesPreferences = list3;
        this.$onComplete = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ytb(this.this$0, this.$daysPreferences, this.$shiftsPreferences, this.$schedulesPreferences, this.$onComplete, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ytb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (r13.s(r11) == r3) goto L18;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ytb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
