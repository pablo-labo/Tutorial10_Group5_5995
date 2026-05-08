package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.regpromo.RegPromoFragment;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.tare.backend.OnegraphRetrofitApiResolver;
import com.indeed.android.jobsearch.viewjob.a;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.b;
import defpackage.bad;
import defpackage.hsa;
import defpackage.jq7;
import defpackage.s87;
import defpackage.sp7;
import defpackage.yj3;
import java.io.File;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zh implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        FrameworkSQLiteOpenHelper.OpenHelper openHelper;
        int i = this.a;
        ps7 ps7Var = ps7.d;
        b5g b5gVar = b5g.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bi biVar = (bi) obj;
                ((gme) biVar.Q().e).setValue(b5gVar);
                biVar.close();
                Function2<? super ps7, ? super tr7, j6g> function2 = biVar.h0;
                if (function2 != null) {
                    function2.invoke(ps7Var, null);
                }
                return j6g.a;
            case 1:
                return new bxb(((pv) obj).g0);
            case 2:
                return new bxb(((vw) obj).g0);
            case 3:
                ((tp7) cr8.p(tp7.class)).b(new sp7.h(12, "messagingAttachmentBanner", "CAMERA", null));
                ((ra9) obj).a("android.permission.CAMERA");
                return j6g.a;
            case 4:
                ((gme) ((y91) obj).e).setValue(Boolean.FALSE);
                return j6g.a;
            case 5:
                return u63.Z((yj3.a) obj);
            case 6:
                ((gr2) obj).close();
                return j6g.a;
            case 7:
                FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper = (FrameworkSQLiteOpenHelper) obj;
                String str = frameworkSQLiteOpenHelper.b;
                if (str == null || !frameworkSQLiteOpenHelper.d) {
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(frameworkSQLiteOpenHelper.a, frameworkSQLiteOpenHelper.b, new FrameworkSQLiteOpenHelper.a(), frameworkSQLiteOpenHelper.c, frameworkSQLiteOpenHelper.e);
                } else {
                    Context context = frameworkSQLiteOpenHelper.a;
                    context.getClass();
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(frameworkSQLiteOpenHelper.a, new File(noBackupFilesDir, str).getAbsolutePath(), new FrameworkSQLiteOpenHelper.a(), frameworkSQLiteOpenHelper.c, frameworkSQLiteOpenHelper.e);
                }
                openHelper.setWriteAheadLoggingEnabled(frameworkSQLiteOpenHelper.V);
                return openHelper;
            case 8:
                ((ut5) obj).N().h(false);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                FrameLayout frameLayout = (FrameLayout) obj;
                frameLayout.post(new qx0(frameLayout, 7));
                return j6g.a;
            case 10:
                IanMainFragment ianMainFragment = (IanMainFragment) obj;
                ((gme) ((jn0) ianMainFragment.l0.getValue()).b).setValue(Boolean.FALSE);
                ((in0) ianMainFragment.e.getValue()).getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("homePage", "suggestAppUpgradeAction", u63.Z("suggestUpgradePrompt"), null, 8));
                ((hn0) ianMainFragment.x0.getValue()).b(null);
                return j6g.a;
            case 11:
                ((IndeedApplyWebViewFragment) obj).F(false, false);
                return j6g.a;
            case 12:
                return Float.valueOf(x0f.h(((e13) obj).getCoroutineContext()));
            case 13:
                ((o99) obj).Q().k();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                b bVar = (b) obj;
                ((gme) bVar.Q().e).setValue(b5gVar);
                Function2<? super ps7, ? super List<qs7>, j6g> function22 = bVar.l0;
                bVar.l0 = null;
                bVar.close();
                if (function22 != null) {
                    function22.invoke(ps7Var, null);
                }
                return j6g.a;
            case 15:
                fma fmaVar = (fma) obj;
                int i2 = fma.s0;
                if (Build.VERSION.SDK_INT >= 33) {
                    ((at7) cr8.p(at7.class)).b();
                    w29 w29Var = fmaVar.o0;
                    if (w29Var != null) {
                        o8c o8cVar = (o8c) w29Var.a;
                        s8c s8cVar = (s8c) ((gme) o8cVar.c).getValue();
                        if (s8cVar != null) {
                            p8c p8cVar = (p8c) w29Var.c;
                            String strA = s8cVar.a();
                            p8cVar.getClass();
                            strA.getClass();
                            ((tp7) cr8.p(tp7.class)).b(new sp7.b("push-notification-primer-inline", "skip-for-now", null, new ux4(strA, 4), 4));
                        }
                        ((gme) o8cVar.b).setValue(Boolean.FALSE);
                    }
                }
                return j6g.a;
            case 16:
                hsa hsaVar = (hsa) obj;
                bad.b bVar2 = new bad.b();
                bVar2.c(hsaVar.b);
                bVar2.a("https://apis.indeed.com/");
                ra8 ra8Var = hsaVar.d;
                MediaType.e.getClass();
                bVar2.d.add(ewa.q(ra8Var, MediaType.Companion.a("application/json")));
                return new hsa.a(hsaVar, (OnegraphRetrofitApiResolver) bVar2.b().b(OnegraphRetrofitApiResolver.class));
            case 17:
                return x7b.i((x7b) obj);
            case 18:
                qlb qlbVar = (qlb) obj;
                ((gme) qlbVar.R().e).setValue(b5gVar);
                qlbVar.Q(hs7.c, null);
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return new bxb(((crb) obj).e);
            case 20:
                bub bubVar = (bub) obj;
                return new n2c(bubVar.g0, bubVar.h0);
            case 21:
                RegPromoFragment regPromoFragment = (RegPromoFragment) obj;
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = regPromoFragment.requireActivity().u();
                lr5VarU.getClass();
                rq7Var.f(lr5VarU, mh2.k(regPromoFragment), jq7.d.INSTANCE, "reg-promo-native");
                regPromoFragment.E("do-not-sell-my-personal-info");
                return j6g.a;
            case 22:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj;
                searchOverlayFragment.H().f();
                searchOverlayFragment.I().i();
                return j6g.a;
            case 23:
                x8f x8fVar = (x8f) obj;
                rq7 rq7Var2 = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU2 = x8fVar.requireActivity().u();
                lr5VarU2.getClass();
                rq7Var2.f(lr5VarU2, mh2.k(x8fVar), jq7.u.INSTANCE, "tare-debug-screen");
                return j6g.a;
            case 24:
                return (khf) obj;
            case 25:
                ((hnf) obj).B0.invoke(Boolean.valueOf(!r0.A0));
                return j6g.a;
            case 26:
                igg iggVar = (igg) obj;
                ((gme) iggVar.Q().e).setValue(b5gVar);
                iggVar.close();
                Function2<? super ps7, ? super ss7, j6g> function23 = iggVar.i0;
                if (function23 != null) {
                    function23.invoke(ps7Var, null);
                }
                return j6g.a;
            default:
                a aVar = (a) obj;
                int i3 = a.H0;
                lqg lqgVarQ = aVar.Q();
                ((gme) lqgVarQ.b).setValue(jqg.a(lqgVarQ.g(), false, false, false, true, ex4.a, false, null, null, 0.0f, false, false, 4036));
                com.google.android.material.bottomsheet.b bVar3 = aVar.o0;
                if (bVar3 == null) {
                    wl7.g("bottomSheetDialog");
                    throw null;
                }
                bVar3.h().H(3);
                Lazy<s87> lazy = s87.f;
                s87.a.a(aVar.P(), tx5.e(aVar.t0, "http-error", "view-job-bottom-sheet", null, 12));
                return j6g.a;
        }
    }
}
