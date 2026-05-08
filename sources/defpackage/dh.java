package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import defpackage.ap0;
import defpackage.cv8;
import defpackage.e9a;
import defpackage.sp7;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dh implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dh(Function2 function2, gu5 gu5Var, g4a g4aVar, g4a g4aVar2, g4a g4aVar3) {
        this.a = 2;
        this.b = function2;
        this.f = gu5Var;
        this.c = g4aVar;
        this.d = g4aVar2;
        this.e = g4aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-driving-license", "save", null, null, 12));
                ((Function1) obj5).invoke(new av8((String) null, (String) ((g4a) obj4).getValue(), (List) ((g4a) obj).getValue(), (cv8.d) null, new cv8.b(null, null, null, null, null, null, null, null, (String) ((g4a) obj3).getValue()), k38.d, (ig3) ((g4a) obj2).getValue(), 137));
                break;
            case 1:
                FragmentManager fragmentManager = (FragmentManager) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                hq7 hq7Var = (hq7) obj2;
                String str3 = (String) obj;
                kqg.b(fragmentManager);
                Fragment fragmentD = fragmentManager.D("IndeedApplyWebViewFragment");
                if (fragmentD != null) {
                    ((IndeedApplyWebViewFragment) fragmentD).E();
                }
                i1g i1gVar = (i1g) cr8.p(i1g.class);
                jdc jdcVar = new jdc();
                jdcVar.setArguments(aq1.a(new Pair("interview-prep-props", e9a.a.a(null, null).toBundle()), new Pair("occupationSuid", str), new Pair("occupationLabel", str2), new Pair("jobDetails", aq1.a(new Pair("jobKey", hq7Var != null ? hq7Var.a : null), new Pair("jobTitle", hq7Var != null ? hq7Var.b : null))), new Pair("from", str3)));
                i1gVar.e(fragmentManager, jdcVar);
                break;
            case 2:
                Function2 function2 = (Function2) obj5;
                gu5 gu5Var = (gu5) obj;
                g4a g4aVar = (g4a) obj4;
                g4a g4aVar2 = (g4a) obj3;
                g4a g4aVar3 = (g4a) obj2;
                int iOrdinal = ((oy9) g4aVar.getValue()).ordinal();
                if (iOrdinal == 0) {
                    g4aVar.setValue(oy9.b);
                } else if (iOrdinal != 1) {
                    l.g();
                } else {
                    function2.invoke((s38) g4aVar2.getValue(), (Integer) g4aVar3.getValue());
                    gu5Var.invoke();
                }
                break;
            default:
                ap0 ap0Var = (ap0) obj5;
                ap0.a.b bVar = new ap0.a.b(new tr2(1, (Context) obj4, (String) obj3, (String) obj2), new vv((ude) obj, 13));
                ap0Var.getClass();
                u63.Y(ee3.p(ap0Var), null, null, new bp0(bVar, ap0Var, null), 3);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ dh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
