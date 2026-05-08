package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ih implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ ih(iba ibaVar, int i) {
        this.a = i;
        this.b = ibaVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        iba ibaVar = this.b;
        switch (i) {
            case 0:
                ibaVar.p("LOCATION");
                break;
            case 1:
                ibaVar.p("FIELD_OF_STUDY");
                break;
            default:
                ibaVar.r();
                break;
        }
        return j6g.a;
    }
}
