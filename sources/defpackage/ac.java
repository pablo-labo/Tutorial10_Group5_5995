package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ac implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ ac(iba ibaVar, int i) {
        this.a = i;
        this.b = ibaVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        iba ibaVar = this.b;
        switch (i) {
            case 0:
                ibaVar.p("DESCRIPTION");
                break;
            case 1:
                ibaVar.p("LICENSE_TYPE_SELECTOR");
                break;
            case 2:
                ibaVar.p("SCHOOL_COUNTRY");
                break;
            case 3:
                ibaVar.p("STATE_SELECTOR");
                break;
            case 4:
                ibaVar.p("URL");
                break;
            case 5:
                ibaVar.r();
                break;
            default:
                ibaVar.r();
                break;
        }
        return j6g.a;
    }
}
