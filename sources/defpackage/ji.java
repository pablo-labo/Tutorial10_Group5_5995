package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.viewjob.a;
import com.indeed.android.jsmappservices.bridge.SearchType;
import defpackage.lx5;
import defpackage.s87;
import defpackage.sjf;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ji implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ji(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = true;
        int i2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ?? r7 = (String) obj;
                r7.getClass();
                ((luc) obj2).element = r7;
                break;
            case 1:
                nr nrVar = (nr) obj2;
                String str = (String) obj;
                str.getClass();
                Bundle arguments = nrVar.getArguments();
                if ((arguments == null || !arguments.containsKey("KEY_IS_BUILD_SUGGESTION")) ? false : arguments.getBoolean("KEY_IS_BUILD_SUGGESTION")) {
                    zr7 zr7Var = new zr7(str);
                    nrVar.close();
                    Function2<? super ps7, ? super zr7, j6g> function2 = nrVar.h0;
                    if (function2 != null) {
                        function2.invoke(ps7.a, zr7Var);
                    }
                } else {
                    yvb yvbVarQ = nrVar.Q();
                    u63.Y(ee3.p(yvbVarQ), null, null, new twb(yvbVarQ, new mr(i2, nrVar, str), null), 3);
                }
                break;
            case 2:
                p91 p91Var = (p91) obj2;
                qf8<Object>[] qf8VarArr = p91.i0;
                if (((i6f) ((jz2) obj).a()) != null) {
                    p91Var.V();
                }
                break;
            case 3:
                f51 f51Var = (f51) obj2;
                String str2 = (String) obj;
                str2.getClass();
                if (c0h.F()) {
                    f51Var.k(str2);
                } else {
                    f51Var.m(str2);
                }
                break;
            case 4:
                c88 c88Var = (c88) obj2;
                lx5.b bVar = (lx5.b) obj;
                bVar.a("jobKey", c88Var.a);
                bVar.a("newAppStatus", c88Var.o);
                break;
            case 5:
                ro7 ro7Var = (ro7) obj2;
                int i3 = ro7.n0;
                if (new d8c(w8c.c).c(ro7Var.l0, false)) {
                    ro7Var.R().h(s8c.WEBVIEW_INBOX);
                } else {
                    ro7Var.R().g(false);
                }
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                crb crbVar = (crb) obj2;
                Pair pair = (Pair) ((jz2) obj).a();
                if (pair != null) {
                    crbVar.R().j((Uri) pair.e(), (String) pair.d());
                }
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                f8d f8dVar = (f8d) obj2;
                ms7 ms7Var = (ms7) obj;
                ms7Var.getClass();
                int iOrdinal = ms7Var.ordinal();
                if (iOrdinal == 0) {
                    f8dVar.Q().u();
                } else if (iOrdinal == 1 || iOrdinal == 2) {
                    f8dVar.Q().t();
                } else {
                    l.g();
                }
                f8dVar.close();
                break;
            case 10:
                ((upb) obj2).k((Throwable) obj);
                break;
            case 11:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj2;
                int iIntValue = ((Integer) obj).intValue();
                aud audVarH = searchOverlayFragment.H();
                audVarH.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(audVarH.a(), audVarH.b.l(ak2.M(SearchType.c), "where-suggestion-option", zr4.a, m93.c));
                searchOverlayFragment.I().t(iIntValue);
                break;
            case 12:
                huc hucVar = (huc) obj2;
                if (((vzd) obj).f.a.a.b.length() > 0) {
                    hucVar.element = false;
                }
                break;
            case 13:
                ArrayList arrayList = (ArrayList) obj2;
                ko8 ko8Var = (ko8) obj;
                ko8Var.getClass();
                ko8Var.a(arrayList.size(), new k4f(arrayList, r74.d), new ah2(699646206, new l4f(arrayList), true));
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                m6f m6fVar = (m6f) obj2;
                g7f g7fVar = (g7f) ((jz2) obj).a();
                if (g7fVar != null) {
                    m6fVar.L(g7fVar.b);
                }
                break;
            case 15:
                sjf sjfVar = (sjf) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                sjf.a aVar = sjfVar.o0;
                if (aVar == null) {
                    z = false;
                } else {
                    aVar.c = zBooleanValue;
                    us3.f(sjfVar).U();
                    us3.f(sjfVar).S();
                    fb4.a(sjfVar);
                }
                break;
            case 16:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                Function1<s5e, j6g> function1 = ((sof) obj2).e;
                if (function1 != null) {
                    function1.invoke(s5eVar);
                }
                break;
            default:
                Intent intent = (Intent) obj;
                int i4 = a.H0;
                intent.getClass();
                ((a) obj2).r0.a(intent);
                break;
        }
        return j6g.a;
    }
}
