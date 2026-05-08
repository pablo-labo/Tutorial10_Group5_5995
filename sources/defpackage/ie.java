package defpackage;

import androidx.navigation.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ie implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ ie(iba ibaVar, int i) {
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
                ibaVar.p("SCHOOL_LOCATION");
                break;
            case 2:
                ibaVar.r();
                break;
            case 3:
                ibaVar.r();
                break;
            case 4:
                ibaVar.r();
                break;
            case 5:
                ibaVar.p("STATE_SELECTOR");
                break;
            default:
                e.q(ibaVar, vw0.INSTANCE);
                break;
        }
        return j6g.a;
    }
}
