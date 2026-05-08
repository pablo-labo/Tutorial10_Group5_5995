package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.deeplink.b;
import com.indeed.android.jobsearch.launch.LaunchFragment;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.reactnative.rntarebridge.nav.RNJSTNavigator;
import defpackage.lx5;
import defpackage.oq7;
import defpackage.pld;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pq implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        ps7 ps7Var = ps7.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                sq sqVar = (sq) obj2;
                wj8 wj8Var = (wj8) obj;
                wj8Var.getClass();
                Bundle arguments = sqVar.getArguments();
                if ((arguments == null || !arguments.containsKey("KEY_IS_BUILD_SUGGESTION")) ? false : arguments.getBoolean("KEY_IS_BUILD_SUGGESTION")) {
                    yr7 yr7VarE = jsb.e(wj8Var);
                    sqVar.close();
                    Function2<? super ps7, ? super yr7, j6g> function2 = sqVar.j0;
                    if (function2 != null) {
                        function2.invoke(ps7Var, yr7VarE);
                    }
                } else {
                    sqVar.Q().g(wj8Var, new za(2, sqVar, wj8Var));
                }
                return j6g.a;
            case 1:
                return new xd1((fe1) obj2);
            case 2:
                n97 n97Var = (n97) obj;
                h12 h12VarG = ((w02) obj2).G();
                if (n97Var == null || (str = n97Var.a) == null) {
                    str = "";
                }
                h12VarG.k(i12.a(h12VarG.g(), null, null, null, str, null, null, null, false, 247));
                return j6g.a;
            case 3:
                x1c x1cVar = (x1c) obj2;
                o18 o18Var = (o18) obj;
                yz7 yz7VarM = x1cVar.m();
                if (o18Var == null) {
                    o18Var = o18.c;
                }
                String country = Locale.US.getCountry();
                country.getClass();
                ((gme) x1cVar.X).setValue(yz7.a(yz7VarM, null, null, null, null, null, null, null, null, null, null, null, null, u63.Z(new to7(o18Var, country)), null, 12287));
                return j6g.a;
            case 4:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                p5e.a(s5eVar);
                o5e.d(s5eVar, new i92(((List) obj2).size(), 1));
                return j6g.a;
            case 5:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                Uri uri = ((b.c) obj2).f;
                uri.getClass();
                HashMap map = new HashMap();
                String queryParameter = uri.getQueryParameter("utm_source");
                if (queryParameter != null) {
                }
                String queryParameter2 = uri.getQueryParameter("utm_medium");
                if (queryParameter2 != null) {
                }
                String queryParameter3 = uri.getQueryParameter("utm_campaign");
                if (queryParameter3 != null) {
                }
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(entry.getKey() + "=" + entry.getValue());
                }
                bVar.a("utmParams", z92.W0(arrayList, ",", null, null, null, 62));
                String queryParameter4 = uri.getQueryParameter("from");
                if (queryParameter4 != null) {
                    bVar.a("urlFrom", queryParameter4);
                }
                return j6g.a;
            case 6:
                gi4 gi4Var = (gi4) obj2;
                go4 go4Var = (go4) obj;
                go4Var.getClass();
                if (gi4Var.l0) {
                    gi4Var.Q(ps7Var, jsb.q(go4Var));
                } else {
                    yvb yvbVarR = gi4Var.R();
                    za zaVar = new za(3, gi4Var, go4Var);
                    String str2 = yvbVarR.v().a;
                    if (str2 != null) {
                        u63.Y(ee3.p(yvbVarR), null, null, new pwb(yvbVarR, go4Var, str2, zaVar, null), 3);
                    }
                }
                return j6g.a;
            case 7:
                gzf gzfVar = (gzf) obj;
                return ((qn5) obj2).b(new gzf(null, gzfVar.b, gzfVar.c, gzfVar.d, gzfVar.e)).getValue();
            case 8:
                ((IndeedApplyWebViewFragment) obj2).R("DoUpdateVisitedHistoryComponent", ((Boolean) obj).booleanValue());
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                String str3 = (String) obj;
                int i2 = LaunchActivity.e1;
                str3.getClass();
                Uri.encode(str3);
                ((LaunchActivity) obj2).E();
                throw null;
            case 10:
                y3b y3bVar = (y3b) obj;
                y3bVar.getClass();
                y3bVar.b("ctk", (String) ((LaunchFragment) obj2).f.getValue());
                y3bVar.a(System.currentTimeMillis(), NdkCrashLog.TIMESTAMP_KEY_NAME);
                return j6g.a;
            case 11:
                lu8 lu8Var = (lu8) obj2;
                g4a g4aVar = lu8Var.t;
                jhf jhfVar = (jhf) obj;
                String str4 = jhfVar.a.b;
                le0 le0Var = lu8Var.j;
                if (!wl7.b(str4, le0Var != null ? le0Var.b : null)) {
                    ((gme) lu8Var.k).setValue(mf6.a);
                    if (((Boolean) ((gme) g4aVar).getValue()).booleanValue()) {
                        ((gme) g4aVar).setValue(Boolean.FALSE);
                    } else {
                        ((gme) lu8Var.s).setValue(Boolean.FALSE);
                    }
                }
                long j = kjf.b;
                lu8Var.f(j);
                lu8Var.e(j);
                lu8Var.u.invoke(jhfVar);
                lu8Var.b.invalidate();
                return j6g.a;
            case 12:
                return Integer.valueOf(((p0a) obj2).a.a(((q0a) obj).e));
            case 13:
                m8c m8cVar = (m8c) obj2;
                String str5 = (String) obj;
                int i3 = m8c.r0;
                str5.getClass();
                d8c d8cVar = m8cVar.k0;
                s8c s8cVar = m8cVar.m0;
                d8cVar.a(s8cVar, m8cVar.Q());
                p8c p8cVar = (p8c) m8cVar.j0.getValue();
                String string = s8cVar.toString();
                boolean zQ = m8cVar.Q();
                p8cVar.getClass();
                p8c.c(string, str5, zQ);
                m8cVar.D();
                m8cVar.P(false);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return RNJSTNavigator.openModal$lambda$15$lambda$9((Promise) obj2, (oq7.h) obj);
            case 15:
                ((pld) obj2).q(new pld.c.e(((Boolean) obj).booleanValue()));
                return j6g.a;
            case 16:
                xd0 xd0Var = (xd0) obj;
                ((Function2) obj2).invoke(((gme) xd0Var.e).getValue(), q92.c0.b.invoke(xd0Var.f));
                return j6g.a;
            default:
                androidx.compose.foundation.text.modifiers.b bVar2 = (androidx.compose.foundation.text.modifiers.b) obj2;
                List list = (List) obj;
                mif mifVar = bVar2.d2().n;
                if (mifVar != null) {
                    kif kifVar = mifVar.a;
                    le0 le0Var2 = kifVar.a;
                    tjf tjfVar = bVar2.e0;
                    oa2 oa2Var = bVar2.o0;
                    mifVar = new mif(new kif(le0Var2, tjf.e(tjfVar, oa2Var != null ? oa2Var.a() : da2.i, 0L, null, null, null, 0L, null, 0, 0L, 16777214), kifVar.c, kifVar.d, kifVar.e, kifVar.f, kifVar.g, kifVar.h, kifVar.i, kifVar.j), mifVar.b, mifVar.c);
                    list.add(mifVar);
                }
                return Boolean.valueOf(mifVar != null);
        }
    }
}
