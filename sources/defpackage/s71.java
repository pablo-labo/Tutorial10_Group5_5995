package defpackage;

import androidx.fragment.app.FragmentManager;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.jq7;
import defpackage.pld;
import defpackage.rh3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s71 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s71(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                t71 t71Var = (t71) obj2;
                sm8 sm8Var = (sm8) obj;
                t71Var.l0 = t71Var.g0.a(sm8Var.a.c(), sm8Var.getLayoutDirection(), sm8Var);
                break;
            case 1:
                u63.Y((e13) obj2, null, null, new db3((hw9) obj, null), 3);
                break;
            case 2:
                ((edf) obj2).d.invoke((kdf) obj);
                break;
            case 3:
                ka2.H((String) obj2, false, false, (FragmentManager) obj);
                break;
            case 4:
                ((rq7) cr8.p(rq7.class)).f((lr5) obj2, mh2.k((dr9) obj), jq7.u.INSTANCE, "MessagingFragment");
                break;
            case 5:
                rh3.d dVar = (rh3.d) obj;
                ((Function2) obj2).invoke(dVar.b, dVar.c);
                break;
            case 6:
                ((pld) obj2).q(new pld.c.d((s9) obj));
                break;
            case 7:
                Function1 function1 = (Function1) obj;
                ConversationRecord conversationRecord = ((x1e) obj2).a;
                if (conversationRecord != null) {
                    function1.invoke(conversationRecord.getId());
                }
                break;
            default:
                ((Function1) obj2).invoke((String) obj);
                break;
        }
        return j6g.a;
    }
}
