package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uda extends ha1 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uda(xed xedVar, int i) {
        super(xedVar);
        this.d = i;
    }

    @Override // defpackage.ha1
    public final String d() {
        switch (this.d) {
            case 0:
                return "DELETE FROM HamburgerMenuCategory WHERE isLoggedIn=? AND locale=?";
            default:
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }
}
