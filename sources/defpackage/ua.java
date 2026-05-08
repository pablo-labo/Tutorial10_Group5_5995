package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ua implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ ua(iba ibaVar, int i) {
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
                ibaVar.p("TITLE");
                break;
            default:
                ibaVar.p("COUNTRY_SELECTOR");
                break;
        }
        return j6g.a;
    }
}
