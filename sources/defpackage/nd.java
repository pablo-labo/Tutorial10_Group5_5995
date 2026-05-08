package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nd implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ nd(iba ibaVar, int i) {
        this.a = i;
        this.b = ibaVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        iba ibaVar = this.b;
        switch (i) {
            case 0:
                ibaVar.r();
                break;
            case 1:
                ibaVar.p("SCHOOL_NAME");
                break;
            case 2:
                ibaVar.r();
                break;
            case 3:
                ibaVar.r();
                break;
            case 4:
                ibaVar.p("COUNTRY_SELECTOR");
                break;
            case 5:
                ibaVar.p("STATE_SELECTOR");
                break;
            case 6:
                ibaVar.p("SCHOOL_COUNTRY_SELECTOR");
                break;
            case 7:
                ibaVar.p("LANGUAGE_NAME");
                break;
            default:
                ibaVar.r();
                break;
        }
        return j6g.a;
    }
}
