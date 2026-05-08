package defpackage;

import androidx.navigation.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fh implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ fh(iba ibaVar, int i) {
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
                ibaVar.p("PATENT_NUMBER");
                break;
            case 2:
                ibaVar.r();
                break;
            case 3:
                qa9.b(ca9.c, "Edit");
                ibaVar.p("SKILL_NAME_AUTOCOMPLETE");
                break;
            default:
                e.q(ibaVar, uv2.INSTANCE);
                break;
        }
        return j6g.a;
    }
}
