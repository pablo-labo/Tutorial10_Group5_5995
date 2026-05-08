package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tda extends ha1 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tda(xed xedVar, int i) {
        super(xedVar);
        this.d = i;
    }

    @Override // defpackage.ha1
    public final String d() {
        switch (this.d) {
            case 0:
                return "DELETE FROM HamburgerMenuItem WHERE isLoggedIn=? AND locale=?";
            case 1:
                return "DELETE FROM WorkProgress";
            default:
                return "UPDATE workspec SET output=? WHERE id=?";
        }
    }
}
