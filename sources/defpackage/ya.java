package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ya implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ ya(iba ibaVar, int i) {
        this.a = i;
        this.b = ibaVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        iba ibaVar = this.b;
        switch (i) {
            case 0:
                ibaVar.p("TIME_PERIOD");
                break;
            case 1:
                ibaVar.r();
                break;
            case 2:
                ibaVar.p("ENDORSEMENTS");
                break;
            case 3:
                ibaVar.r();
                break;
            case 4:
                ibaVar.r();
                break;
            case 5:
                ibaVar.p("COMPANY");
                break;
            case 6:
                ibaVar.r();
                break;
            case 7:
                ibaVar.p("EDUCATION_LEVEL");
                break;
            default:
                ibaVar.p("LICENSE_TYPE_SELECTOR");
                break;
        }
        return j6g.a;
    }
}
