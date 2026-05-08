package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import androidx.compose.material.a;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import com.indeed.android.profile.screens.sheets.profilesubtab.certifications.a;
import defpackage.fr0;
import defpackage.jq7;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yp0 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yp0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() throws PendingIntent.CanceledException {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((fr0) obj2).r(new fr0.b.k(((SavedJobsDto) obj).getJobkey()));
                break;
            case 1:
                ((Function1) obj2).invoke((z13) obj);
                break;
            case 2:
                a aVar = (a) obj2;
                hz1 hz1Var = (hz1) obj;
                hz1Var.getClass();
                String str = hz1Var.b;
                ig3 ig3Var = hz1Var.c;
                qr7 qr7Var = new qr7(str, ig3Var != null ? jsb.d(ig3Var) : null, hz1Var.d);
                Function2<? super ps7, ? super qr7, j6g> function2 = aVar.j0;
                aVar.j0 = null;
                if (function2 != null) {
                    function2.invoke(aVar.k0 ? ps7.a : ps7.b, qr7Var);
                }
                aVar.Q();
                break;
            case 3:
                Function1 function1 = (Function1) obj2;
                yie yieVar = ((zie) obj).j;
                String str2 = yieVar != null ? yieVar.a : null;
                if (str2 == null) {
                    str2 = "";
                }
                function1.invoke(str2);
                break;
            case 4:
                e eVar = (e) obj2;
                FragmentManager fragmentManager = (FragmentManager) obj;
                if (eVar != null && fragmentManager != null) {
                    ((tp7) cr8.p(tp7.class)).b(new sp7.g("messagingEmptyInbox", "findJobCta", null, null, 12));
                    ((rq7) cr8.p(rq7.class)).f(fragmentManager, eVar, new jq7.i(null), "droid-messages");
                }
                break;
            case 5:
                ((Function1) obj2).invoke((nj8) ((g4a) obj).getValue());
                break;
            case 6:
                hw9 hw9Var = (hw9) obj2;
                e13 e13Var = (e13) obj;
                if (hw9Var.c.d.invoke(iw9.b).booleanValue()) {
                    u63.Y(e13Var, null, null, new a.c(hw9Var, null), 3);
                }
                break;
            case 7:
                break;
            case 8:
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((g4a) obj).setValue(Boolean.FALSE);
                ((gu5) obj2).invoke();
                break;
            case 10:
                ((tp7) cr8.p(tp7.class)).b(new sp7.e("messagingAttachmentDownloadPreview", "messagingConversation"));
                ((y1e) obj2).h();
                ((gu5) obj).invoke();
                break;
            default:
                Context context = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    scf.a(activity);
                } else {
                    activity.send();
                }
                break;
        }
        return j6g.a;
    }
}
