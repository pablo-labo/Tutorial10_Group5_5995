package defpackage;

import androidx.navigation.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bs implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ bs(iba ibaVar, int i) {
        this.a = i;
        this.b = ibaVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        iba ibaVar = this.b;
        switch (i) {
            case 0:
                ibaVar.p("BRANCH");
                break;
            case 1:
                ibaVar.p("LOCATION");
                break;
            case 2:
                ibaVar.r();
                break;
            case 3:
                ibaVar.p("COUNTRY");
                break;
            case 4:
                ibaVar.p("COUNTRY_SELECTOR");
                break;
            case 5:
                ibaVar.r();
                break;
            case 6:
                qm4.b(in4.a, "Edit");
                ibaVar.p("EDIT_SKILL_NAME_AUTOCOMPLETE");
                break;
            default:
                e.q(ibaVar, qw0.INSTANCE);
                break;
        }
        return j6g.a;
    }
}
