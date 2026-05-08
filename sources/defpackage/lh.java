package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lh implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ lh(iba ibaVar, int i) {
        this.a = i;
        this.b = ibaVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        iba ibaVar = this.b;
        switch (i) {
            case 0:
                ibaVar.p("STATE_SELECTOR");
                break;
            case 1:
                ibaVar.r();
                break;
            case 2:
                ibaVar.p("DESCRIPTION");
                break;
            case 3:
                ibaVar.p("BRANCH");
                break;
            case 4:
                ibaVar.r();
                break;
            default:
                ibaVar.p("JOB_TITLE");
                break;
        }
        return j6g.a;
    }
}
