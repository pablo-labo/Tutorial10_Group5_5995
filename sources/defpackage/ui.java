package defpackage;

import android.content.Intent;
import com.canhub.cropper.CropImageActivity;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.jsmappservices.bridge.ShowSearchOverlayData;
import com.indeed.android.profile.screens.sheets.profilesubtab.certifications.a;
import com.indeed.android.reactnative.rntarebridge.nav.RNJSTNavigator;
import defpackage.et7;
import defpackage.lb8;
import defpackage.oq7;
import defpackage.qme;
import defpackage.s87;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ui implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ui(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((luc) obj2).element = (String) obj;
                return j6g.a;
            case 1:
                p91 p91Var = (p91) obj2;
                ShowSearchOverlayData showSearchOverlayData = (ShowSearchOverlayData) obj;
                qf8<Object>[] qf8VarArr = p91.i0;
                showSearchOverlayData.getClass();
                p91Var.g0 = true;
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = p91Var.requireActivity().u();
                lr5VarU.getClass();
                jt7 jt7VarL = ak2.L(showSearchOverlayData);
                p91Var.getQ0().name();
                rq7Var.h(lr5VarU, jt7VarL, showSearchOverlayData.d, new k91(p91Var));
                return j6g.a;
            case 2:
                e23 e23Var = (e23) obj2;
                z13 z13Var = (z13) obj;
                z13Var.getClass();
                x1c x1cVar = (x1c) e23Var.i0.getValue();
                yz7 yz7VarA = yz7.a(x1cVar.m(), null, null, null, null, null, null, null, null, z13Var, null, null, null, null, null, 16127);
                g4a g4aVar = x1cVar.X;
                ((gme) g4aVar).setValue(yz7VarA);
                jhf jhfVar = x1cVar.m().d;
                if (jhfVar != null) {
                    String strJ = q92.j(z13Var.a, jhfVar.a.b, true);
                    yz7 yz7VarM = x1cVar.m();
                    int length = strJ.length();
                    ((gme) g4aVar).setValue(yz7.a(yz7VarM, null, null, null, new jhf(strJ, cr8.c(length, length), 4), null, null, null, null, null, null, null, null, null, null, 16375));
                }
                e23Var.close();
                return j6g.a;
            case 3:
                int i3 = CropImageActivity.x0;
                ((wpa) obj).getClass();
                ((CropImageActivity) obj2).D();
                return j6g.a;
            case 4:
                gu5 gu5Var = (gu5) obj2;
                if (((Boolean) obj).booleanValue()) {
                    gu5Var.invoke();
                }
                return j6g.a;
            case 5:
                a aVar = (a) obj2;
                hz1 hz1Var = (hz1) obj;
                hz1Var.getClass();
                yvb yvbVarR = aVar.R();
                boolean z = aVar.k0;
                yp0 yp0Var = new yp0(2, aVar, hz1Var);
                if (z) {
                    yp0Var.invoke();
                } else {
                    String str = yvbVarR.v().a;
                    if (str != null) {
                        a18 a18VarZ = yvb.z(hz1Var.c);
                        ((gme) yvbVarR.e).setValue(b5g.b);
                        u63.Y(ee3.p(yvbVarR), null, null, new owb(yvbVarR, str, hz1Var, a18VarZ, yp0Var, null), 3);
                    }
                }
                return j6g.a;
            case 6:
                s8c s8cVar = (s8c) obj2;
                et7 et7Var = (et7) obj;
                et7Var.getClass();
                if (et7Var instanceof et7.b) {
                    if (((et7.b) et7Var).a == ft7.c) {
                        ((o2g) cr8.p(o2g.class)).b("pushFeatureNotificationPrimer", s8cVar.toString());
                    } else {
                        ((o2g) cr8.p(o2g.class)).c("pushFeatureNotificationPrimer", s8cVar.toString());
                    }
                }
                return j6g.a;
            case 7:
                ((iy3) obj).getClass();
                return new lh7(((long) gf9.b(((Number) ((ese) obj2).getValue()).floatValue())) & 4294967295L);
            case 8:
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) obj2;
                Intent intent = (Intent) obj;
                intent.getClass();
                ((gme) indeedApplyWebViewFragment.Q().W).setValue(Boolean.TRUE);
                indeedApplyWebViewFragment.y0.a(intent);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                q87 q87Var = (q87) obj2;
                rx9 rx9Var = (rx9) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                rx9Var.getClass();
                int i4 = 8;
                gm0 gm0Var = new gm0(i4, b8 == true ? 1 : 0);
                lve lveVar = zpd.c;
                uh8 uh8Var = uh8.a;
                iwc iwcVar = fwc.a;
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(g87.class), null, gm0Var, uh8Var)));
                int i5 = 5;
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(p87.class), null, new js0(q87Var, i5), uh8Var)));
                int i6 = 6;
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(jsa.class), null, new yo0(q87Var, i6), uh8Var)));
                int i7 = 10;
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(z77.class), new lve("COOKIE_HANDLER_INDEED_MOBILE"), new c10(i7), uh8Var)));
                int i8 = 9;
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(y45.class), null, new zh1(i8), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(z4b.class), null, new ph2(i7), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(gsa.class), null, new cj2(i4), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(wp9.class), null, new us0(i5), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(wla.class), null, new rh2(i4, b7 == true ? 1 : 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(dca.class), null, new ej2(i8, b6 == true ? 1 : 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(eca.class), null, new hm0(i8), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(tid.class), null, new im0(i4, b5 == true ? 1 : 0), uh8Var)));
                int i9 = 7;
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(OkHttpClient.class), new lve("SSE_CLIENT"), new jm0(i9), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(OkHttpClient.class), new lve("NATIVE_FETCH_CLIENT"), new vj2(i6), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(mig.class), null, new fn0(i4, b4 == true ? 1 : 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(nig.class), null, new ih2(i9), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(chg.class), null, new kh2(i9), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(zcd.class), null, new lh2(i8, b3 == true ? 1 : 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(rbf.class), null, new ey1(i9, b2 == true ? 1 : 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(s66.class), null, new so0(i4), uh8Var)));
                v40.l(new ue1(lveVar, iwcVar.b(x76.class), null, new bj2(i6, b == true ? 1 : 0), uh8Var), rx9Var);
                return j6g.a;
            case 10:
                bqe bqeVar = (bqe) obj;
                bqeVar.getClass();
                for (Object obj3 : ((lb8.a) obj2).b) {
                    int i10 = i2 + 1;
                    if (i2 < 0) {
                        u63.o0();
                        throw null;
                    }
                    bqeVar.n(i2, (String) obj3);
                    i2 = i10;
                }
                return j6g.a;
            case 11:
                ((qlb) obj2).Q(hs7.a, (cs7) obj);
                return j6g.a;
            case 12:
                return RNJSTNavigator.openModal$lambda$15$lambda$4((Promise) obj2, (oq7.i) obj);
            case 13:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj2;
                String str2 = (String) obj;
                str2.getClass();
                aud audVarH = searchOverlayFragment.H();
                audVarH.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(audVarH.a(), tx5.k(audVarH.b, ak2.M(SearchType.b), "delete-recent-search", null, 12));
                searchOverlayFragment.I().h(str2);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                qme qmeVar = (qme) obj2;
                synchronized (qmeVar.g) {
                    qme.a aVar2 = qmeVar.i;
                    aVar2.getClass();
                    Object obj4 = aVar2.b;
                    obj4.getClass();
                    int i11 = aVar2.d;
                    o3a<Object> o3aVar = aVar2.c;
                    if (o3aVar == null) {
                        o3aVar = new o3a<>((Object) null);
                        aVar2.c = o3aVar;
                        aVar2.f.m(obj4, o3aVar);
                        j6g j6gVar = j6g.a;
                    }
                    aVar2.c(obj, i11, obj4, o3aVar);
                }
                return j6g.a;
            case 15:
                b7f b7fVar = (b7f) obj2;
                f7f f7fVar = (f7f) obj;
                f7fVar.getClass();
                return Boolean.valueOf(f7fVar.a == b7fVar);
            default:
                igf igfVar = (igf) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                x2a x2aVar = igfVar.a;
                cme cmeVar = (cme) x2aVar;
                float fG = cmeVar.g() + fFloatValue;
                cme cmeVar2 = (cme) igfVar.b;
                if (fG > cmeVar2.g()) {
                    fFloatValue = cmeVar2.g() - cmeVar.g();
                } else if (fG < 0.0f) {
                    fFloatValue = -cmeVar.g();
                }
                ((cme) x2aVar).q(cmeVar.g() + fFloatValue);
                return Float.valueOf(fFloatValue);
        }
    }
}
