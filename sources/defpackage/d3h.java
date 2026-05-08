package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d3h extends ha1 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3h(xed xedVar, int i) {
        super(xedVar);
        this.d = i;
    }

    @Override // defpackage.ha1
    public final String d() {
        switch (this.d) {
            case 0:
                return "DELETE from WorkProgress where work_spec_id=?";
            default:
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }
}
