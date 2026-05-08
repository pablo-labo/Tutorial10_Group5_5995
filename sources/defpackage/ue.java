package defpackage;

import android.util.Log;
import androidx.compose.animation.a;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jsmappservices.bridge.ShowSearchOverlayData;
import com.indeed.android.myjobs.data.remote.api.AppstatusJobsService;
import com.indeed.android.myjobs.data.remote.api.BrandedAdsApiService;
import com.indeed.android.myjobs.data.remote.api.BrandedAdsLoggingApiService;
import com.indeed.android.myjobs.data.remote.api.ButtonRestApiService;
import com.indeed.android.myjobs.data.remote.api.HomepageLoggingService;
import com.indeed.android.myjobs.data.remote.api.InterviewJobsService;
import com.indeed.android.myjobs.data.remote.api.LoggingApiService;
import com.indeed.android.myjobs.data.remote.api.ResumeContactsService;
import defpackage.fx8;
import defpackage.mj;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ue implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ue(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 6;
        foe foeVar = null;
        foeVar = null;
        int i2 = 1;
        int i3 = 2;
        int i4 = 3;
        byte b = 0;
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new qf(0);
            case 1:
                ((m74) obj).getClass();
                return new mj.g();
            case 2:
                ((m74) obj).getClass();
                return new vs();
            case 3:
                ((m74) obj).getClass();
                return new ez(b);
            case 4:
                ((Boolean) obj).booleanValue();
                return j6g.a;
            case 5:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.i(s5eVar, 0);
                return j6g.a;
            case 6:
                rx9 rx9Var = (rx9) obj;
                rx9Var.getClass();
                lve lveVar = new lve("MyjobsRetrofit");
                kk2 kk2Var = new kk2(i3);
                iwc iwcVar = fwc.a;
                yd8 yd8VarB = iwcVar.b(bad.class);
                lve lveVar2 = zpd.c;
                uh8 uh8Var = uh8.a;
                rx9Var.a(new vge(new ue1(lveVar2, yd8VarB, lveVar, kk2Var, uh8Var)));
                int i5 = 4;
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(bad.class), new lve("ApplyRetrofit"), new c10(i5), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(bad.class), new lve("BrandedAdsRetrofit"), new fj2(3, (byte) 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(bad.class), new lve("BrandedAdsLoggingRetrofit"), new cm0(i4), uh8Var)));
                int i6 = 5;
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(String.class), new lve("apiUrl"), new dm0(i6, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(String.class), new lve("applyButtonUrl"), new em0(i5), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(String.class), new lve("brandedAdsUrl"), new fm0(i), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(String.class), new lve("brandedAdsLoggingUrl"), new gm0(i6, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(String.class), new lve("resumeContactsBaseUrl"), new hm0(i5), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(OkHttpClient.class), null, new im0(3, (byte) 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(be6.class), null, new jm0(i5), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(AppstatusJobsService.class), null, new vj2(i3), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(InterviewJobsService.class), null, new fn0(4, (byte) 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(LoggingApiService.class), null, new ih2(i4), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(ButtonRestApiService.class), null, new mj2(2, (byte) 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(BrandedAdsApiService.class), null, new kh2(i4), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(BrandedAdsLoggingApiService.class), null, new lh2(i6, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(bad.class), new lve("ResumeContactsRetrofit"), new ey1(i4, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(ResumeContactsService.class), null, new bj2(i3, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(HomepageLoggingService.class), null, new zk0(4, (byte) 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(i88.class), null, new zh1(i4), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(f88.class), null, new ph2(i5), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(d88.class), null, new vb2(i4), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(e08.class), null, new cj2(i3), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(cm1.class), null, new us0(i2), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar2, iwcVar.b(g8a.class), null, new rh2(i4, b), uh8Var)));
                v40.l(new ue1(lveVar2, iwcVar.b(gub.class), null, new ej2(i4, b), uh8Var), rx9Var);
                return j6g.a;
            case 7:
                y98 y98Var = (y98) obj;
                y98Var.getClass();
                y98Var.b = true;
                return j6g.a;
            case 8:
                ((String) obj).getClass();
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((vnd) obj).getClass();
                return j6g.a;
            case 10:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.k(s5eVar2);
                return j6g.a;
            case 11:
                y98 y98Var2 = (y98) obj;
                y98Var2.getClass();
                y98Var2.b = true;
                y98Var2.c = true;
                return j6g.a;
            case 12:
                ((dd0) obj).getClass();
                return a.c(ku4.d(zd0.d(300, 0, null, 6), 2), ku4.e(zd0.d(210, 0, null, 6), 2));
            case 13:
                String str = (String) obj;
                hvb hvbVar = hvb.b;
                if (str != null) {
                    m2c.b(hvbVar, str);
                } else {
                    m2c.a(hvbVar);
                }
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                hr7 hr7Var = (hr7) obj;
                hr7Var.getClass();
                hr7Var.a("fromScreenName", "POST_APPLY");
                hr7Var.a("pushPrimerButtonName", "AllowNotifications");
                return j6g.a;
            case 15:
                s5e s5eVar3 = (s5e) obj;
                s5eVar3.getClass();
                o5e.c(s5eVar3);
                return j6g.a;
            case 16:
                List list = (List) obj;
                list.getClass();
                Object obj2 = list.get(0);
                obj2.getClass();
                f7d f7dVar = new f7d(((Boolean) obj2).booleanValue(), (Long) list.get(1));
                ((gme) f7dVar.d).setValue((Integer) list.get(2));
                return f7dVar;
            case 17:
                obj.getClass();
                List list2 = (List) obj;
                Object obj3 = list2.get(0);
                Function1 function1 = (Function1) wld.h.b;
                Boolean bool = Boolean.FALSE;
                foe foeVar2 = (wl7.b(obj3, bool) || obj3 == null) ? null : (foe) function1.invoke(obj3);
                Object obj4 = list2.get(1);
                foe foeVar3 = (wl7.b(obj4, bool) || obj4 == null) ? null : (foe) function1.invoke(obj4);
                Object obj5 = list2.get(2);
                foe foeVar4 = (wl7.b(obj5, bool) || obj5 == null) ? null : (foe) function1.invoke(obj5);
                Object obj6 = list2.get(3);
                if (!wl7.b(obj6, bool) && obj6 != null) {
                    foeVar = (foe) function1.invoke(obj6);
                }
                return new rif(foeVar2, foeVar3, foeVar4, foeVar);
            case 18:
                obj.getClass();
                List list3 = (List) obj;
                Object obj7 = list3.get(0);
                fx8.a aVar = obj7 != null ? (fx8.a) obj7 : null;
                aVar.getClass();
                float f = aVar.a;
                Object obj8 = list3.get(1);
                fx8.c cVar = obj8 != null ? (fx8.c) obj8 : null;
                cVar.getClass();
                int i7 = cVar.a;
                Object obj9 = list3.get(2);
                (obj9 != null ? (fx8.b) obj9 : null).getClass();
                return new fx8(f, i7);
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                zs7 zs7Var = (zs7) obj;
                zs7Var.getClass();
                int iOrdinal = zs7Var.ordinal();
                if (iOrdinal == 0) {
                    ArrayList arrayList = lz2.a;
                    Log.d("TareDebugFragment", "Re-engagement Canceled: Auth state not .denied", null);
                } else if (iOrdinal == 1) {
                    ArrayList arrayList2 = lz2.a;
                    Log.d("TareDebugFragment", "Re-engagement Canceled: Cooldown not met", null);
                } else if (iOrdinal == 2) {
                    ArrayList arrayList3 = lz2.a;
                    Log.d("TareDebugFragment", "Re-engagement: User snoozed", null);
                } else {
                    if (iOrdinal != 3) {
                        l.g();
                        return null;
                    }
                    ArrayList arrayList4 = lz2.a;
                    Log.d("TareDebugFragment", "Re-engagement: User chose to allow notifications", null);
                }
                return j6g.a;
            case 20:
                fe0 fe0Var = (fe0) obj;
                return new qtc(fe0Var.a, fe0Var.b, fe0Var.c, fe0Var.d);
            default:
                int i8 = com.indeed.android.jobsearch.viewjob.a.H0;
                ((ShowSearchOverlayData) obj).getClass();
                ArrayList arrayList5 = lz2.a;
                lz2.b("view-job-bottom-sheet", "onShowSearchOverlay called unexpectedly", false, new Exception());
                return j6g.a;
        }
    }
}
