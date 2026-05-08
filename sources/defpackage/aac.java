package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aac extends ha1 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aac(xed xedVar, int i) {
        super(xedVar);
        this.d = i;
    }

    @Override // defpackage.ha1
    public final String d() {
        switch (this.d) {
            case 0:
                return "DELETE FROM queuedevent WHERE createdAt < ?";
            default:
                return "UPDATE workspec SET state=? WHERE id=?";
        }
    }
}
