package defpackage;

import android.content.Context;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jsmappservices.bridge.BridgeDispatcher;
import com.indeed.android.jsmappservices.bridge.results.ApplyResult;
import com.indeed.android.jsmappservices.bridge.results.IndeedApplyCompletionResult;
import defpackage.fr0;
import defpackage.ra3;
import defpackage.sp7;
import defpackage.ude;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qj implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        String str;
        int i = this.a;
        ps7 ps7Var = ps7.b;
        ps7 ps7Var2 = ps7.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                rj rjVar = (rj) obj2;
                xr7 xr7VarR = jsb.r((lu0) obj);
                rjVar.close();
                Function2<? super ps7, ? super xr7, j6g> function2 = rjVar.i0;
                if (function2 != null) {
                    if (rjVar.j0) {
                        ps7Var = ps7Var2;
                    }
                    function2.invoke(ps7Var, xr7VarR);
                }
                break;
            case 1:
                gy gyVar = (gy) obj2;
                g2h g2hVar = (g2h) obj;
                if (gyVar.l0) {
                    ps7Var = ps7Var2;
                }
                vs7 vs7VarK = jsb.k(g2hVar);
                gyVar.close();
                Function2<? super ps7, ? super vs7, j6g> function22 = gyVar.k0;
                if (function22 != null) {
                    function22.invoke(ps7Var, vs7VarK);
                }
                break;
            case 2:
                ((fr0) obj2).r(new fr0.b.d((s9) obj));
                break;
            case 3:
                hne hneVar = (hne) obj2;
                gu5 gu5Var = (gu5) obj;
                if (hneVar != null) {
                    hneVar.c();
                }
                gu5Var.invoke();
                break;
            case 4:
                ((BridgeDispatcher.c) obj2).a(new IndeedApplyCompletionResult(ApplyResult.b, (String) obj));
                break;
            case 5:
                u63.Y((e13) obj2, null, null, new ra3.a((gu5) obj, null), 3);
                break;
            case 6:
                ((g4a) obj).setValue(Boolean.FALSE);
                ((gu5) obj2).invoke();
                break;
            case 7:
                n76.h((g4a) obj2, (g4a) obj);
                break;
            case 8:
                ou6 ou6Var = (ou6) obj2;
                ou6Var.c.invoke();
                ((c3a) obj).h(ou6Var.a);
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                w47 w47Var = (w47) obj2;
                Function1 function1 = (Function1) obj;
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
                function1.invoke(w47.INBOX);
                break;
            case 10:
                break;
            case 11:
                ((Function1) obj2).invoke(((dub) obj).c);
                break;
            case 12:
                ude udeVar = (ude) obj2;
                Context context = (Context) obj;
                String string = context.getString(R.string.not_seeing_a_job);
                string.getClass();
                String string2 = context.getString(R.string.saved_tab_dialog_body);
                string2.getClass();
                udeVar.m(new ude.c.a0(string, string2, "app-tracker-saved-emptytabmodalcta"));
                udeVar.m(new ude.c.s("Saved"));
                break;
            case 13:
                ((Function1) obj2).invoke(vje.g((yie) obj));
                break;
            default:
                ((Function1) obj2).invoke((List) ((g4a) obj).getValue());
                break;
        }
        return j6g.a;
    }
}
