package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.services.UDPInteractionService", f = "UDPInteractionService.kt", l = {25}, m = "getSkillsSuggestionsDismissalStatus")
public final class b0g extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c0g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0g(c0g c0gVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = c0gVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
