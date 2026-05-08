package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import androidx.navigation.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jsmappservices.bridge.results.ApplyResult;
import com.indeed.android.jsmappservices.bridge.results.IndeedApplyCompletionResult;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.jq7;
import defpackage.ns7;
import defpackage.sp7;
import defpackage.ude;
import defpackage.ur7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ry implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ry(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        String str;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((iba) obj2).p("COUNTRY");
                ((g4a) obj).setValue(null);
                break;
            case 1:
                Context context = (Context) obj;
                String string = context.getString(R.string.not_seeing_an_application);
                string.getClass();
                String string2 = context.getString(R.string.applied_tab_dialog_body);
                string2.getClass();
                ((ude) obj2).m(new ude.c.a0(string, string2, "app-tracker-applied-emptytabmodalcta"));
                break;
            case 2:
                ((Function1) obj2).invoke((wj1) obj);
                break;
            case 3:
                ((Function1) obj2).invoke((ConversationRecord) obj);
                break;
            case 4:
                aw4 aw4Var = (aw4) obj2;
                String str2 = (String) obj;
                uv4 uv4Var = aw4Var.b;
                if (uv4Var == null) {
                    Enum[] enumArr = aw4Var.a;
                    uv4Var = new uv4(str2, enumArr.length);
                    for (Enum r0 : enumArr) {
                        uv4Var.k(r0.name(), false);
                    }
                }
                break;
            case 5:
                ((Function1) obj2).invoke(((lu0) obj).a);
                break;
            case 6:
                e eVar = (e) obj2;
                FragmentManager fragmentManager = (FragmentManager) obj;
                if (eVar != null && fragmentManager != null) {
                    ((tp7) cr8.p(tp7.class)).b(new sp7.g("messagingEmptyInbox", "findJobCta", null, null, 12));
                    ((rq7) cr8.p(rq7.class)).f(fragmentManager, eVar, new jq7.i(null), "droid-messages");
                }
                break;
            case 7:
                u67 u67Var = (u67) obj2;
                w47 w47Var = ((t67) ((g4a) obj).getValue()).e;
                w47Var.getClass();
                tp7 tp7Var = (tp7) cr8.p(tp7.class);
                int iOrdinal = w47Var.ordinal();
                if (iOrdinal == 0) {
                    str = "messagingInbox";
                } else if (iOrdinal == 1) {
                    str = "messagingArchive";
                } else if (iOrdinal == 2) {
                    str = "messagingSpam";
                } else if (iOrdinal != 3) {
                    l.g();
                } else {
                    str = "messagingDrafts";
                }
                tp7Var.b(new sp7.e(str, "messagingInbox"));
                u67Var.h(w47.INBOX);
                break;
            case 8:
                ka2.H((String) obj2, false, false, (FragmentManager) obj);
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj2).u();
                lr5VarU.getClass();
                vr7Var.e(lr5VarU, "ProfileUIPlatformDebugScreen", new ns7.e(null, new rzb((wu5) obj, 0)), ur7.a.a);
                break;
            case 10:
                qhc.b.a(new IndeedApplyCompletionResult(ApplyResult.b, (String) obj2));
                ((Promise) obj).resolve("SUCCESS");
                break;
            default:
                Function1 function1 = (Function1) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("messagingFailedToLoad", "refresh", null, null, 12));
                ConversationRecord conversationRecord = ((x1e) obj2).a;
                if (conversationRecord != null) {
                    function1.invoke(conversationRecord.getId());
                }
                break;
        }
        return j6g.a;
    }
}
