package defpackage;

import defpackage.sp7;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zr implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ zr(iba ibaVar, int i) {
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
                ibaVar.p("EDIT_ROOT_PAGE");
                break;
            default:
                ((tp7) cr8.p(tp7.class)).b(new sp7.e("messagingReportSpam", "messagingConversationDetails"));
                ibaVar.r();
                break;
        }
        return j6g.a;
    }
}
