package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$deleteSkills$2$1", f = "ProfileSectionsViewModel.kt", l = {2557, 2563}, m = "invokeSuspend")
public final class kwb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $onComplete;
    final /* synthetic */ String $resumeId;
    final /* synthetic */ List<String> $skillIds;
    Object L$0;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwb(yvb yvbVar, String str, List<String> list, gu5<j6g> gu5Var, lu2<? super kwb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$resumeId = str;
        this.$skillIds = list;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new kwb(this.this$0, this.$resumeId, this.$skillIds, this.$onComplete, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((kwb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r2 == r5) goto L15;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r64) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
