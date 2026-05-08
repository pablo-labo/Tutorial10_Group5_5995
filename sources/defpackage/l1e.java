package defpackage;

import com.indeed.android.messaging.data.conversations.model.AiMessagingButtonType;
import defpackage.sp7;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l1e extends qv5 implements gu5<j6g> {
    @Override // defpackage.gu5
    public final j6g invoke() {
        String str;
        Object value;
        y1e y1eVar = (y1e) this.receiver;
        gse gseVar = y1eVar.c0;
        AiMessagingButtonType aiMessagingButtonType = ((x1e) y1eVar.d0.getValue()).u;
        aiMessagingButtonType.getClass();
        int i = br9.b[aiMessagingButtonType.ordinal()];
        if (i == 1) {
            str = "messagingReturnToOptionsAssistedMessaging";
        } else {
            if (i != 2) {
                l.g();
                return null;
            }
            str = "messagingRewriteAssistedMessaging";
        }
        ((tp7) cr8.p(tp7.class)).b(new sp7.g("messagingConversation", str, null, null, 12));
        if (((x1e) gseVar.getValue()).u == AiMessagingButtonType.BACK_TO_OPTIONS && !((x1e) gseVar.getValue()).q.isEmpty() && ((x1e) gseVar.getValue()).o) {
            do {
                value = gseVar.getValue();
            } while (!gseVar.h(value, x1e.a((x1e) value, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, true, false, 0, null, null, null, null, false, null, 66715647)));
        } else {
            u63.Y(ee3.p(y1eVar), null, null, new c2e(null, y1eVar), 3);
        }
        return j6g.a;
    }
}
