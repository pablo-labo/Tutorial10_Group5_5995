package defpackage;

import android.os.Bundle;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.foundation.text.modifiers.b;
import androidx.compose.ui.layout.w;
import androidx.fragment.app.g;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.Logger;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.reactnative.rntarebridge.nav.RNJSTNavigator;
import defpackage.oq7;
import defpackage.pgd;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g activity;
        dqa dqaVarR;
        int i = this.a;
        boolean z = true;
        int i2 = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((luc) obj2).element = (String) obj;
                return j6g.a;
            case 1:
                pgd.x xVar = (pgd.x) obj;
                qf8<Object>[] qf8VarArr = p91.i0;
                xVar.getClass();
                ((p91) obj2).I(xVar);
                return j6g.a;
            case 2:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.d(s5eVar, new i92(((ConversationRecord) obj2).getFolder() != w47.SPAM ? 2 : 1, 1));
                return j6g.a;
            case 3:
                return o6.a((p63) obj, (t41) obj2);
            case 4:
                sf5 sf5Var = (sf5) obj2;
                qx4 qx4Var = (qx4) obj;
                qx4Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("uid", qx4Var.a.toString());
                for (n3b n3bVar : qx4Var.c) {
                    if (n3bVar instanceof k59) {
                        k59 k59Var = (k59) n3bVar;
                        bundle.putLong(k59Var.a, k59Var.b);
                    } else if (n3bVar instanceof x84) {
                        bundle.putDouble(null, 0.0d);
                    } else if (n3bVar instanceof kve) {
                        kve kveVar = (kve) n3bVar;
                        String str = kveVar.a;
                        String strConcat = kveVar.b;
                        if (strConcat.length() > 100) {
                            strConcat = strConcat.substring(0, 97).concat("...");
                        }
                        bundle.putString(str, strConcat);
                    } else if (n3bVar instanceof g59) {
                        g59 g59Var = (g59) n3bVar;
                        bundle.putLongArray(g59Var.a, z92.A1(g59Var.b.values()));
                    } else {
                        if (!(n3bVar instanceof gve)) {
                            l.g();
                            return null;
                        }
                        gve gveVar = (gve) n3bVar;
                        String str2 = gveVar.a;
                        String string = gveVar.b.toString();
                        if (string.length() > 100) {
                            string = string.substring(0, 97).concat("...");
                        }
                        bundle.putString(str2, string);
                    }
                }
                FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) sf5Var.c.getValue();
                String str3 = qx4Var.b;
                mhh mhhVar = firebaseAnalytics.a;
                mhhVar.getClass();
                mhhVar.c(new lmh(mhhVar, null, str3, bundle, false));
                return j6g.a;
            case 5:
                ((Boolean) obj).getClass();
                ((IndeedApplyWebViewFragment) obj2).O();
                return j6g.a;
            case 6:
                rx9 rx9Var = (rx9) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                rx9Var.getClass();
                int i3 = 5;
                fn0 fn0Var = new fn0(i3, b7 == true ? 1 : 0);
                iwc iwcVar = fwc.a;
                yd8 yd8VarB = iwcVar.b(nl0.class);
                lve lveVar = zpd.c;
                uh8 uh8Var = uh8.a;
                rx9Var.a(new vge(new ue1(lveVar, yd8VarB, null, fn0Var, uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(g00.class), null, new ey1(i3, b6 == true ? 1 : 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(sf5.class), null, new ov(i3, b5 == true ? 1 : 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(s87.class), null, new bj2(3, b4 == true ? 1 : 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(ba5.class), null, new zk0(i3, b3 == true ? 1 : 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(gz4.class), null, new c10((JobSearchApplication) obj2), uh8Var)));
                int i4 = 6;
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(n9a.class), null, new zh1(i4), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(Logger.class), null, new ph2(7), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(vwg.class), null, new vb2(i3), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(zk6.class), null, new cj2(i3), uh8Var)));
                int i5 = 4;
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(p8c.class), null, new ih2(i5), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(yof.class), null, new mj2(i5, b2 == true ? 1 : 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(x02.class), null, new kh2(i5), uh8Var)));
                v40.l(new ue1(lveVar, iwcVar.b(mka.class), null, new lh2(i4, b == true ? 1 : 0), uh8Var), rx9Var);
                return j6g.a;
            case 7:
                ((Long) obj).getClass();
                return Boolean.valueOf(sm5.b((sm5) obj2));
            case 8:
                c cVarInvoke = ((ur8) obj2).d0.invoke();
                int iA = cVarInvoke.a();
                while (true) {
                    if (i2 >= iA) {
                        i2 = -1;
                    } else if (!cVarInvoke.g(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            case DatadogLogGenerator.CRASH /* 9 */:
                return Boolean.valueOf(((lu8) obj2).r.b(((s37) obj).a));
            case 10:
                ((gu5) obj2).invoke();
                return j6g.a;
            case 11:
                ((w.a) obj).r((w) obj2, 0, 0, 0.0f);
                return j6g.a;
            case 12:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return serialDescriptor.e(iIntValue) + ": " + serialDescriptor.h(iIntValue).getA();
            case 13:
                fpb fpbVar = (fpb) obj2;
                p81 p81Var = (p81) obj;
                if (p81Var != null) {
                    ArrayList arrayList = lz2.a;
                    lz2.b("ProctorRefreshManager", "Proctor refresh failure", false, p81Var.getCause());
                    ((tob) fpbVar.c.getValue()).c();
                }
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                crb crbVar = (crb) obj2;
                if (((j6g) ((jz2) obj).a()) != null && (activity = crbVar.getActivity()) != null && (dqaVarR = activity.r()) != null) {
                    dqaVarR.d();
                }
                return j6g.a;
            case 15:
                cd6 cd6Var = (cd6) obj;
                cd6Var.e(((cme) ((g7c) obj2).e).g() - Float.intBitsToFloat((int) (cd6Var.c() & 4294967295L)));
                return j6g.a;
            case 16:
                xac xacVar = (xac) obj2;
                Boolean bool = (Boolean) ((jz2) obj).a();
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    xacVar.P(!zBooleanValue);
                    if (zBooleanValue) {
                        xacVar.Q();
                    }
                }
                return j6g.a;
            case 17:
                return RNJSTNavigator.openModal$lambda$15$lambda$11((Promise) obj2, (oq7.j) obj);
            case 18:
                ((zmc) obj2).d();
                ((xmc) obj).getClass();
                return null;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                iid iidVar = (iid) obj;
                iidVar.getClass();
                ((Function1) obj2).invoke(new yf1(iidVar));
                return j6g.a;
            case 20:
                j4e j4eVar = (j4e) obj2;
                if (j4eVar.a.b().a(((Long) obj).longValue())) {
                    j4eVar.j();
                    j4eVar.m(null);
                }
                return j6g.a;
            default:
                b bVar = (b) obj2;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                b.a aVar = bVar.t0;
                if (aVar == null) {
                    z = false;
                } else {
                    Function1<? super b.a, j6g> function1 = bVar.p0;
                    if (function1 != null) {
                        function1.invoke(aVar);
                    }
                    b.a aVar2 = bVar.t0;
                    if (aVar2 != null) {
                        aVar2.c = zBooleanValue2;
                    }
                    us3.f(bVar).U();
                    us3.f(bVar).S();
                    fb4.a(bVar);
                }
                return Boolean.valueOf(z);
        }
    }
}
