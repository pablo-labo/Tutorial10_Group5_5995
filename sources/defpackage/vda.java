package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vda extends ha1 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vda(xed xedVar, int i) {
        super(xedVar);
        this.d = i;
    }

    @Override // defpackage.ha1
    public final String d() {
        switch (this.d) {
            case 0:
                return "DELETE FROM NavBarLeftItem";
            default:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }
}
