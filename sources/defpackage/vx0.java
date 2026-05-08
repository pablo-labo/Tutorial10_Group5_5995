package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.viewjob.a;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jsmappservices.bridge.BridgeDispatcher;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.jsmappservices.bridge.ShowSearchOverlayData;
import com.indeed.android.jsmappservices.bridge.results.PushReengagementResult;
import defpackage.et7;
import defpackage.jq7;
import defpackage.lx5;
import defpackage.os7;
import defpackage.s87;
import defpackage.sp7;
import defpackage.ur7;
import expo.modules.imagepicker.FailedToReadFileException;
import expo.modules.imagepicker.MissingModuleException;
import expo.modules.video.player.VideoPlayer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vx0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vx0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r8v22, types: [T, java.lang.Object, kotlinx.serialization.json.JsonElement] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws MissingModuleException, FailedToReadFileException {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                weakReference.getClass();
                return Boolean.valueOf(wl7.b(weakReference.get(), (VideoPlayer) obj2));
            case 1:
                int i2 = ec1.s0;
                ((ShowSearchOverlayData) obj).getClass();
                ArrayList arrayList = lz2.a;
                lz2.b(((ec1) obj2).P(), "onShowSearchOverlay is called unexpectedly", false, new Exception());
                return j6g.a;
            case 2:
                zs7 zs7Var = (zs7) obj;
                zs7Var.getClass();
                ((BridgeDispatcher.c) obj2).a(new PushReengagementResult(rm1.c(zs7Var)));
                return j6g.a;
            case 3:
                ((gu5) obj2).invoke();
                return j6g.a;
            case 4:
                String str = (String) obj;
                str.getClass();
                ((IndeedApplyWebViewFragment) obj2).S(str);
                return j6g.a;
            case 5:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                Function1<hr7, j6g> function1 = ((sp7.g) obj2).a;
                if (function1 != null) {
                    function1.invoke(new yp7(bVar));
                }
                return j6g.a;
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-language", "delete", null, null, 12));
                ((Function1) obj2).invoke(str2);
                return j6g.a;
            case 7:
                String str3 = (String) obj;
                str3.getClass();
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((o99) obj2).requireActivity().u();
                lr5VarU.getClass();
                vr7Var.b(lr5VarU, new os7.b(null, new hm0(11)), new ur7.c(str3));
                return j6g.a;
            case 8:
                fma fmaVar = (fma) obj2;
                et7 et7Var = (et7) obj;
                int i3 = fma.s0;
                et7Var.getClass();
                if (et7Var instanceof et7.b) {
                    s8c s8cVar = (s8c) ((gme) ((o8c) fmaVar.m0.getValue()).c).getValue();
                    String strA = s8cVar != null ? s8cVar.a() : null;
                    if (strA != null) {
                        if (((et7.b) et7Var).a == ft7.c) {
                            ((o2g) cr8.p(o2g.class)).e(strA);
                        } else {
                            ((o2g) cr8.p(o2g.class)).a(strA);
                        }
                    }
                }
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj2;
                int iIntValue = ((Integer) obj).intValue();
                aud audVarH = searchOverlayFragment.H();
                audVarH.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(audVarH.a(), audVarH.b.l(ak2.M(SearchType.b), "what-suggestion-option", zr4.a, m93.c));
                searchOverlayFragment.I().s(iIntValue, true);
                return j6g.a;
            case 10:
                ((fm5) obj2).t(false);
                return j6g.a;
            case 11:
                x8f x8fVar = (x8f) obj2;
                String str4 = (String) obj;
                str4.getClass();
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU2 = x8fVar.requireActivity().u();
                lr5VarU2.getClass();
                rq7Var.f(lr5VarU2, mh2.k(x8fVar), new jq7.e0(new jq7.n.c(new q97().a(str4, null))), "tare-debug-screen");
                return j6g.a;
            case 12:
                ?? r8 = (JsonElement) obj;
                r8.getClass();
                ((luc) obj2).element = r8;
                return j6g.a;
            case 13:
                igg iggVar = (igg) obj2;
                String str5 = (String) obj;
                str5.getClass();
                yvb yvbVarQ = iggVar.Q();
                ti tiVar = new ti(13, iggVar, str5);
                if (yvbVarQ.v().c) {
                    tiVar.invoke();
                } else {
                    u63.Y(ee3.p(yvbVarQ), null, null, new axb(null, tiVar, yvbVarQ, str5), 3);
                }
                return j6g.a;
            default:
                a aVar = (a) obj2;
                String str6 = (String) obj;
                int i4 = a.H0;
                str6.getClass();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                LaunchActivity launchActivity = aVar.A0;
                if (launchActivity == null) {
                    wl7.g("launchActivity");
                    throw null;
                }
                if (intent.resolveActivity(launchActivity.getPackageManager()) != null) {
                    LaunchActivity launchActivity2 = aVar.A0;
                    if (launchActivity2 == null) {
                        wl7.g("launchActivity");
                        throw null;
                    }
                    launchActivity2.startActivity(intent);
                } else {
                    Exception exc = new Exception("package manager returned null");
                    ArrayList arrayList2 = lz2.a;
                    lz2.b("view-job-bottom-sheet", "no supported app found on the device to open the Url", false, exc);
                }
                return j6g.a;
        }
    }
}
