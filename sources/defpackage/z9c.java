package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z9c extends ha1 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9c(xed xedVar, int i) {
        super(xedVar);
        this.d = i;
    }

    @Override // defpackage.ha1
    public final String d() {
        switch (this.d) {
            case 0:
                return "DELETE from queuedevent WHERE 1 = 1";
            default:
                return "DELETE FROM workspec WHERE id=?";
        }
    }
}
