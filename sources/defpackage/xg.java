package defpackage;

import androidx.navigation.e;
import defpackage.sp7;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xg implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ xg(iba ibaVar, int i) {
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
                ibaVar.p("TIME_PERIOD");
                break;
            case 3:
                ibaVar.p("FIELD_OF_STUDY");
                break;
            default:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("messagingConversationDetails", "messagingConversationDetailsSpam", null, null, 12));
                e.q(ibaVar, a3d.INSTANCE);
                break;
        }
        return j6g.a;
    }
}
