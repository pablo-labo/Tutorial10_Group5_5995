package defpackage;

import android.os.Bundle;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.tare.nav.a;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.jq7;
import defpackage.ns7;
import defpackage.sp7;
import defpackage.ur7;
import defpackage.us2;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nw0 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nw0(lr5 lr5Var, String str, a aVar, vg vgVar) {
        this.a = 3;
        this.b = lr5Var;
        this.c = str;
        this.d = vgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        String str;
        int i = this.a;
        String str2 = null;
        byte b = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                EventRecord.Attachment attachment = (EventRecord.Attachment) obj3;
                Function1 function1 = (Function1) obj2;
                Function1 function12 = (Function1) obj;
                if (attachment.getStatus() == EventRecord.AttachmentSentStatus.FAILURE && function1 != null) {
                    function1.invoke(attachment);
                } else if (function12 != null) {
                    function12.invoke(attachment);
                }
                break;
            case 1:
                us2 us2Var = (us2) obj3;
                s7g s7gVar = (s7g) obj2;
                mn1 mn1Var = (mn1) obj;
                en1 en1Var = us2Var.h0;
                while (true) {
                    j4a<us2.a> j4aVar = en1Var.a;
                    int i2 = j4aVar.c;
                    if (i2 != 0) {
                        if (i2 == 0) {
                            s6.j("MutableVector is empty.");
                            break;
                        } else {
                            qtc qtcVar = (qtc) j4aVar.a[i2 - 1].a.invoke();
                            if (qtcVar == null ? true : us2Var.e2(qtcVar, us2Var.l0)) {
                                j4a<us2.a> j4aVar2 = en1Var.a;
                                j4aVar2.k(j4aVar2.c - 1).b.resumeWith(j6g.a);
                            }
                        }
                    }
                }
                if (us2Var.j0) {
                    qtc qtcVarD2 = us2Var.d2();
                    if (qtcVarD2 != null && us2Var.e2(qtcVarD2, us2Var.l0)) {
                        us2Var.j0 = false;
                    }
                }
                s7gVar.e = us2.c2(us2Var, mn1Var);
                break;
            case 2:
                g gVar = (g) obj3;
                String str3 = (String) obj2;
                iba ibaVar = (iba) obj;
                if (gVar != null) {
                    Function1<lx5, j6g> function13 = c05.a;
                    c05.b(str3, new gb(3));
                    rq7 rq7Var = (rq7) cr8.p(rq7.class);
                    lr5 lr5VarU = gVar.u();
                    lr5VarU.getClass();
                    rq7Var.f(lr5VarU, ibaVar, new jq7.l(str2, (hq7) (b == true ? 1 : 0), 7), str3);
                }
                break;
            case 3:
                String str4 = (String) obj2;
                vg vgVar = (vg) obj;
                oj ojVar = new oj(vgVar, 12);
                fy fyVar = new fy(vgVar, 13);
                str4.getClass();
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = new IndeedApplyWebViewFragment();
                Bundle bundle = new Bundle();
                bundle.putString("KEY_APPLY_URL", str4);
                indeedApplyWebViewFragment.setArguments(bundle);
                indeedApplyWebViewFragment.G0 = ojVar;
                indeedApplyWebViewFragment.H0 = fyVar;
                indeedApplyWebViewFragment.L((lr5) obj3, "IndeedApplyWebViewFragment");
                break;
            case 4:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab-job-title-preference", "save", null, null, 12));
                Boolean bool = (Boolean) ((g4a) obj2).getValue();
                bool.booleanValue();
                ((Function2) obj3).invoke(bool, (List) ((g4a) obj).getValue());
                break;
            case 5:
                ((wu5) obj3).q((String) obj2, (String) obj, "move");
                break;
            default:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU2 = ((g) obj3).u();
                lr5VarU2.getClass();
                ns7.b bVar = new ns7.b(null, new szb((wu5) obj, 0));
                hz1 hz1Var = (hz1) z92.Q0(((svb) obj2).G);
                if (hz1Var == null || (str = hz1Var.a) == null) {
                    str = "";
                }
                vr7Var.e(lr5VarU2, "ProfileUIPlatformDebugScreen", bVar, new ur7.c(str));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ nw0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
