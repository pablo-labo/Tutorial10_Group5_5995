package defpackage;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.e;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.jq7;
import defpackage.rq7;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h57 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h57(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                hee heeVar = (hee) obj2;
                u63.Y((e13) obj3, null, null, new s57(heeVar, null), 3).d0(new w34(4, heeVar, (g4a) obj));
                break;
            case 1:
                rq7.a aVar = (rq7.a) obj2;
                nn0 nn0Var = nn0.a;
                nn0.f((Activity) obj3, aVar.a, aVar.c);
                ((xdc) obj).invoke(nt7.a);
                break;
            default:
                FragmentManager fragmentManager = (FragmentManager) obj3;
                e eVar = (e) obj2;
                ConversationRecord conversationRecord = (ConversationRecord) obj;
                if (fragmentManager != null && eVar != null) {
                    ((rq7) cr8.p(rq7.class)).f(fragmentManager, eVar, new jq7.e0(new jq7.n.b(conversationRecord.getJob().getJobKey())), "droid-messages");
                }
                break;
        }
        return j6g.a;
    }
}
