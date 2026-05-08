package defpackage;

import android.app.Application;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.compose.ui.layout.w;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.deeplink.b;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl;
import com.indeed.android.messaging.data.events.EventRecord;
import com.indeed.android.reactnative.nativemodules.RNCoreNativeModule;
import com.indeed.android.reactnative.rntarebridge.nav.RNJSTNavigator;
import com.swmansion.rnscreens.gamma.tabs.TabScreenViewManager;
import defpackage.ahg;
import defpackage.lx5;
import defpackage.ns7;
import defpackage.oq7;
import defpackage.os7;
import defpackage.p2e;
import defpackage.ur7;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pe0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pe0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p2e.a aVar;
        p2e.a aVar2;
        int i = this.a;
        byte b = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                w.a aVar3 = (w.a) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    w.a.y(aVar3, (w) arrayList.get(i2), 0, 0);
                }
                return j6g.a;
            case 1:
                return Boolean.valueOf(AttachmentsRepositoryImpl.doUpload$lambda$5((ahg.c) obj2, (EventRecord.Attachment) obj));
            case 2:
                c52 c52Var = (c52) obj2;
                String str = (String) obj;
                str.getClass();
                f51 f51Var = (f51) c52Var.g0.getValue();
                Locale locale = ((x1c) c52Var.j0.getValue()).m().h;
                f51Var.y(str, locale != null ? locale.getCountry() : null);
                return j6g.a;
            case 3:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("url", wea.i(true, ((b.g) obj2).f));
                return j6g.a;
            case 4:
                return o6.a((p63) obj, (t41) obj2);
            case 5:
                IanMainFragment ianMainFragment = (IanMainFragment) obj2;
                if (((j6g) ((jz2) obj).a()) != null) {
                    dr5 dr5Var = ianMainFragment.c0;
                    dr5Var.getClass();
                    Integer numValueOf = Integer.valueOf(dr5Var.c.getId());
                    dr5 dr5Var2 = ianMainFragment.c0;
                    dr5Var2.getClass();
                    Integer numValueOf2 = Integer.valueOf(dr5Var2.e.getId());
                    dr5 dr5Var3 = ianMainFragment.c0;
                    dr5Var3.getClass();
                    ianMainFragment.S(4, u63.a0(numValueOf, numValueOf2, Integer.valueOf(dr5Var3.d.getId())));
                }
                return j6g.a;
            case 6:
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) obj2;
                String str2 = (String) obj;
                str2.getClass();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                if (intent.resolveActivity(indeedApplyWebViewFragment.M().getPackageManager()) != null) {
                    indeedApplyWebViewFragment.M().startActivity(intent);
                } else {
                    Exception exc = new Exception("package manager returned null");
                    ArrayList arrayList2 = lz2.a;
                    lz2.b("IndeedApplyWebViewFragment", "no supported app found on the device to open the Url", false, exc);
                }
                return j6g.a;
            case 7:
                com.indeed.android.profile.screens.sheets.profilesubtab.skills.b bVar2 = (com.indeed.android.profile.screens.sheets.profilesubtab.skills.b) obj2;
                List list = (List) obj;
                list.getClass();
                bVar2.Q().m(list, bVar2.k0);
                return j6g.a;
            case 8:
                ((Float) obj).getClass();
                return Float.valueOf(((iy3) obj2).t1(56.0f));
            case DatadogLogGenerator.CRASH /* 9 */:
                crb crbVar = (crb) obj2;
                hvb hvbVar = (hvb) obj;
                hvbVar.getClass();
                int i3 = 12;
                int i4 = 11;
                int i5 = 9;
                int i6 = 10;
                switch (hvbVar.ordinal()) {
                    case 0:
                        ((vr7) cr8.p(vr7.class)).b(t40.g(crbVar), new os7.g(null, new jm0(i4)), ur7.a.a);
                        break;
                    case 1:
                        ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.i(null, new mj2(i6, b)), ur7.a.a);
                        break;
                    case 2:
                        ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.c(null, new kh2(i3)), ur7.a.a);
                        break;
                    case 3:
                        ((vr7) cr8.p(vr7.class)).b(t40.g(crbVar), new os7.a(null, new lh2(13, b)), ur7.a.a);
                        break;
                    case 4:
                        ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.a(null, new ey1(i4, b)), ur7.a.a);
                        break;
                    case 5:
                        ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.b(null, new ov(i5, b)), ur7.a.a);
                        break;
                    case 6:
                        ((i1g) cr8.p(i1g.class)).a(t40.g(crbVar), new ra());
                        break;
                    case 7:
                        ((i1g) cr8.p(i1g.class)).a(t40.g(crbVar), new dt());
                        break;
                    case 8:
                        ((i1g) cr8.p(i1g.class)).a(t40.g(crbVar), new jg());
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.d(null, new bj2(i5, b)), ur7.a.a);
                        break;
                    case 10:
                        ((vr7) cr8.p(vr7.class)).b(t40.g(crbVar), new os7.b(null, new zk0(8, b)), ur7.a.a);
                        break;
                    case 11:
                        ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.e(null, new c10(i3)), ur7.a.a);
                        break;
                    case 12:
                        ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.f(null, new zh1(i4)), ur7.a.a);
                        break;
                    case 13:
                        ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.g(null, new vj2(i5)), ur7.a.a);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.h(null, new fn0(i6, b)), ur7.a.a);
                        break;
                    case 15:
                        ((vr7) cr8.p(vr7.class)).b(t40.g(crbVar), new os7.d(null, new ih2(i6)), ur7.a.a);
                        break;
                    default:
                        l.g();
                        return null;
                }
                return j6g.a;
            case 10:
                return RNJSTNavigator.openModal$lambda$15$lambda$12((Promise) obj2, (oq7.f) obj);
            case 11:
                ahc ahcVar = (ahc) obj2;
                jz2 jz2Var = (jz2) obj;
                if (((asd) jz2Var.a).a == yrd.a) {
                    if (((asd) jz2Var.a()) == null) {
                        return j6g.a;
                    }
                    Application application = ahcVar.requireActivity().getApplication();
                    application.getClass();
                    rkc rkcVarB = ((pjc) application).b();
                    ReactContext reactContextA = rkcVarB != null ? rkcVarB.a() : null;
                    if (reactContextA != null) {
                        RNCoreNativeModule rNCoreNativeModule = (RNCoreNativeModule) reactContextA.getNativeModule(RNCoreNativeModule.class);
                        if (rNCoreNativeModule != null) {
                            rNCoreNativeModule.signalScrollMainContentToTop(ahcVar.G());
                        }
                    } else {
                        ((np7) cr8.p(np7.class)).f("RNScrollableTabFragment", "React context was null while handling scrollToTop for RnHomePageFragment", false, new Exception("React context was null while handling scrollToTop for RnHomePageFragment"));
                    }
                }
                return j6g.a;
            case 12:
                mfd mfdVar = (mfd) obj2;
                iid iidVar = (iid) obj;
                iidVar.getClass();
                int i7 = mfdVar.W;
                if (1 <= i7) {
                    int i8 = 1;
                    while (true) {
                        int i9 = mfdVar.V[i8];
                        if (i9 == 1) {
                            iidVar.u(i8);
                        } else if (i9 == 2) {
                            iidVar.q(i8, mfdVar.c[i8]);
                        } else if (i9 == 3) {
                            iidVar.e(i8, mfdVar.d[i8]);
                        } else if (i9 == 4) {
                            String str3 = mfdVar.e[i8];
                            if (str3 == null) {
                                l5.q("Required value was null.");
                                return null;
                            }
                            iidVar.R(i8, str3);
                        } else if (i9 == 5) {
                            byte[] bArr = mfdVar.f[i8];
                            if (bArr == null) {
                                l5.q("Required value was null.");
                                return null;
                            }
                            iidVar.r(i8, bArr);
                        }
                        if (i8 != i7) {
                            i8++;
                        }
                    }
                }
                return j6g.a;
            case 13:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj2;
                String str4 = (String) obj;
                str4.getClass();
                searchOverlayFragment.H().g();
                searchOverlayFragment.I().A(str4, false);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                j4e j4eVar = (j4e) obj2;
                long jLongValue = ((Long) obj).longValue();
                p2e p2eVarG = j4eVar.g();
                if (p2eVarG != null && (aVar2 = p2eVarG.a) != null && jLongValue == aVar2.c) {
                    ((gme) j4eVar.q).setValue(null);
                }
                p2e p2eVarG2 = j4eVar.g();
                if (p2eVarG2 != null && (aVar = p2eVarG2.b) != null && jLongValue == aVar.c) {
                    ((gme) j4eVar.r).setValue(null);
                }
                if (j4eVar.a.b().a(jLongValue)) {
                    j4eVar.p();
                }
                return j6g.a;
            case 15:
                return TabScreenViewManager.setIconResource$lambda$1((b7f) obj2, (Drawable) obj);
            case 16:
                return (ooa) ((gu5) obj2).invoke();
            default:
                j3h j3hVar = (j3h) obj2;
                ws7 ws7Var = (ws7) obj;
                ws7Var.getClass();
                j3hVar.close();
                Function2<? super hs7, ? super ws7, j6g> function2 = j3hVar.h0;
                if (function2 != null) {
                    function2.invoke(hs7.a, ws7Var);
                }
                return j6g.a;
        }
    }
}
