package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ib implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ ib(iba ibaVar, int i) {
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
                ibaVar.r();
                break;
            case 2:
                ibaVar.p("LOCATION");
                break;
            case 3:
                ibaVar.p("SCHOOL_LOCATION");
                break;
            case 4:
                ibaVar.r();
                break;
            default:
                ibaVar.r();
                break;
        }
        return j6g.a;
    }
}
