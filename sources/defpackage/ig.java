package defpackage;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.c;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.ReadableNativeMap;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment;
import com.indeed.android.jobsearch.webview.external.ExternalActivity;
import defpackage.jq7;
import defpackage.kbc;
import defpackage.s87;
import defpackage.sp7;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.util.Arrays;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ig implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ig(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws PendingIntent.CanceledException {
        int i = this.a;
        int i2 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                jg jgVar = (jg) obj;
                ((gme) ((yvb) jgVar.h0.getValue()).e).setValue(b5g.a);
                jgVar.close();
                Function1<? super ps7, j6g> function1 = jgVar.i0;
                if (function1 != null) {
                    function1.invoke(ps7.d);
                }
                return j6g.a;
            case 1:
                Lazy lazy = ((nl0) obj).b;
                ((mm0) lazy.getValue()).getClass();
                String strB = ((kq7) cr8.p(kq7.class)).b("App", "ageSignalsInstallId", null);
                if (strB != null) {
                    return strB;
                }
                String string = UUID.randomUUID().toString();
                string.getClass();
                String strConcat = "u-".concat(string.substring(0, 13));
                ((mm0) lazy.getValue()).getClass();
                ((kq7) cr8.p(kq7.class)).f("App", "ageSignalsInstallId", strConcat);
                return strConcat;
            case 2:
                return ((c) obj).R();
            case 3:
                iy3 iy3VarA = ((sc4) obj).a();
                dvf<Float> dvfVar = nc4.a;
                return Float.valueOf(iy3VarA.t1(400.0f));
            case 4:
                of4 of4Var = (of4) obj;
                of4Var.close();
                Function1<? super ps7, j6g> function12 = of4Var.j0;
                if (function12 != null) {
                    function12.invoke(ps7.b);
                }
                return j6g.a;
            case 5:
                return new bxb(((rh4) obj).g0);
            case 6:
                ((z35) obj).e();
                return new tp5();
            case 7:
                return (ExternalActivity) obj;
            case 8:
                GhostwriterDebugFragment ghostwriterDebugFragment = (GhostwriterDebugFragment) obj;
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = ghostwriterDebugFragment.requireActivity().u();
                lr5VarU.getClass();
                rq7Var.f(lr5VarU, mh2.k(ghostwriterDebugFragment), new jq7.i(null), "tare-debug-screen");
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                qj6 qj6Var = (qj6) obj;
                int i3 = qj6.r0;
                bp6 bp6Var = qj6Var.Y;
                bp6Var.getClass();
                Lazy<s87> lazy2 = s87.f;
                s87.a.a(bp6Var.a(), tx5.k(bp6Var.b, "ian-main-screen", "top-nav-sign-in", null, 12));
                qj6Var.e0();
                return j6g.a;
            case 10:
                return Integer.valueOf((int) ((JavaScriptTypedArray) obj).getProperty("byteOffset").getDouble());
            case 11:
                ggg gggVar = ((c88) obj).B;
                gggVar.g.invoke(gggVar.f);
                return j6g.a;
            case 12:
                fma fmaVar = (fma) obj;
                int i4 = fma.s0;
                fmaVar.Y.i("NOTIFICATIONS");
                fmaVar.Y();
                return j6g.a;
            case 13:
                return Integer.valueOf(((e2b) obj).k());
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((gme) ((h5b) obj).P().f).setValue(Boolean.FALSE);
                return j6g.a;
            case 15:
                vpb vpbVar = (vpb) obj;
                spb spbVar = vpbVar.b;
                it5.a();
                opb<vs4> opbVarA = vpbVar.a();
                spbVar.getClass();
                return new l1f(opbVarA);
            case 16:
                ((Function1) obj).invoke(pjb.V);
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab", "edit-work-areas-preference", null, null, 12));
                return j6g.a;
            case 17:
                ksb ksbVar = (ksb) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("rich-profile-home-screen", "instant-resume-report", null, null, 12));
                ksbVar.close();
                ksbVar.Q().s(ksbVar.getActivity(), mh2.k(ksbVar));
                return j6g.a;
            case 18:
                kbc.a aVar = kbc.p0;
                return new f24((kbc) obj, i2);
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return ReadableNativeMap.keys_delegate$lambda$1((ReadableNativeMap) obj);
            case 20:
                Bundle bundleA = aq1.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                ((lkd) obj).b.b(bundleA);
                if (bundleA.isEmpty()) {
                    return null;
                }
                return bundleA;
            case 21:
                ((tp7) cr8.p(tp7.class)).b(new sp7.h(12, "messagingAttachmentBanner", "FILES", null));
                ((ra9) obj).a("*/*");
                return j6g.a;
            case 22:
                j4e j4eVar = (j4e) obj;
                return Boolean.valueOf((j4eVar.y && j4eVar.h()) ? false : true);
            case 23:
                ha1 ha1Var = (ha1) obj;
                String strD = ha1Var.d();
                xed xedVar = (xed) ha1Var.a;
                xedVar.getClass();
                xedVar.a();
                xedVar.b();
                return xedVar.l().getWritableDatabase().O0(strD);
            case 24:
                x8f x8fVar = (x8f) obj;
                x8fVar.R().g(true);
                u63.Y(hh1.A(x8fVar), null, null, new w8f(x8fVar, null), 3);
                return j6g.a;
            case 25:
                PendingIntent actionIntent = ((RemoteAction) obj).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    scf.a(actionIntent);
                } else {
                    actionIntent.send();
                }
                return j6g.a;
            default:
                g3a<jz2<j6g>> g3aVar = ((w0g) obj).N().e;
                j6g j6gVar = j6g.a;
                g3aVar.k(new jz2<>(j6gVar));
                return j6gVar;
        }
    }
}
