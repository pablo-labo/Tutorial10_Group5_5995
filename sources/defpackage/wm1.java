package defpackage;

import android.content.ContentResolver;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.locationselector.LocationSelectorFragment;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.a;
import defpackage.h5b;
import defpackage.jq7;
import defpackage.s87;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.sse.EventSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wm1 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wm1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws IOException {
        int i = this.a;
        ps7 ps7Var = ps7.c;
        int i2 = 0;
        int i3 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                InputStream inputStreamOpen = ((LaunchActivity) ((rj0) obj).a).getAssets().open("jsma-js-bridge-internal-private-core-iife.js");
                inputStreamOpen.getClass();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, a32.b), 8192);
                try {
                    String strY = nn2.y(bufferedReader);
                    bufferedReader.close();
                    return strY;
                } finally {
                }
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                rh4 rh4Var = (rh4) obj;
                rh4Var.close();
                Function1<? super ps7, j6g> function1 = rh4Var.i0;
                if (function1 != null) {
                    function1.invoke(ps7Var);
                }
                return j6g.a;
            case 3:
                ((bj4) obj).Q(ps7Var, null);
                return j6g.a;
            case 4:
                a aVar = (a) obj;
                Function2<? super ps7, ? super qs7, j6g> function2 = aVar.k0;
                aVar.k0 = null;
                if (function2 != null) {
                    function2.invoke(ps7Var, null);
                }
                aVar.close();
                return j6g.a;
            case 5:
                f45 f45Var = (f45) obj;
                ReactApplicationContext reactApplicationContextD = f45Var.b().d();
                reactApplicationContextD.getClass();
                return new h45(reactApplicationContextD, new e45(f45Var, i2));
            case 6:
                fx4 fx4VarE = ((ut5) obj).E();
                ((gme) fx4VarE.b).setValue(dx4.a(fx4VarE.g(), false, null, false, 63));
                return j6g.a;
            case 7:
                qj6 qj6Var = (qj6) obj;
                int i4 = qj6.r0;
                qj6Var.Y.i("HOME");
                qj6Var.Y();
                return j6g.a;
            case 8:
                IanMainFragment ianMainFragment = (IanMainFragment) obj;
                bp6 bp6Var = ianMainFragment.c;
                bp6Var.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(bp6Var.a(), tx5.k(bp6Var.b, "IanLogger", "report-the-issue", null, 12));
                ianMainFragment.F("topNavHamburgerMenu", new o7(3), new pp6(ianMainFragment, i3));
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((c88) obj).l.invoke();
                return j6g.a;
            case 10:
                LocationSelectorFragment locationSelectorFragment = (LocationSelectorFragment) obj;
                qf8<Object>[] qf8VarArr = LocationSelectorFragment.f;
                Lazy<s87> lazy2 = s87.f;
                s87.a.a((gz4) locationSelectorFragment.d.getValue(), tx5.k(locationSelectorFragment.e, "country-selector", "country-close", new cd(locationSelectorFragment, 8), 4));
                ((m99) locationSelectorFragment.b.getValue()).Z.j(Boolean.TRUE);
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = locationSelectorFragment.requireActivity().u();
                lr5VarU.getClass();
                rq7Var.f(lr5VarU, mh2.k(locationSelectorFragment), new jq7.i(null), "country-selector");
                return j6g.a;
            case 11:
                return ((yw9) obj).M();
            case 12:
                ((h5b) obj).O(h5b.a.a);
                return j6g.a;
            case 13:
                vpb vpbVar = (vpb) obj;
                spb spbVar = vpbVar.b;
                ExecutorService executorServiceH = spbVar.i.h();
                yn9 yn9Var = spbVar.j;
                ContentResolver contentResolver = spbVar.a;
                k09 k09Var = new k09(executorServiceH, yn9Var, contentResolver);
                s15 s15Var = spbVar.i;
                return vpbVar.i(k09Var, new olf[]{new l09(s15Var.h(), yn9Var, contentResolver), new LocalExifThumbnailProducer(s15Var.i(), yn9Var, contentResolver)});
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((i1g) cr8.p(i1g.class)).a(t40.g((crb) obj), new pv());
                return j6g.a;
            case 15:
                g3a<jz2<j6g>> g3aVar = ((x1c) obj).n0;
                j6g j6gVar = j6g.a;
                g3aVar.k(new jz2<>(j6gVar));
                return j6gVar;
            case 16:
                ((f8d) obj).close();
                return j6g.a;
            case 17:
                EventSource eventSource = ((sid) obj).d;
                if (eventSource != null) {
                    eventSource.cancel();
                }
                return j6g.a;
            case 18:
                return Boolean.valueOf(!((rgf) obj).B);
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                sjf sjfVar = (sjf) obj;
                sjfVar.o0 = null;
                us3.f(sjfVar).U();
                us3.f(sjfVar).S();
                fb4.a(sjfVar);
                return Boolean.TRUE;
            default:
                LaunchActivity launchActivity = ((com.indeed.android.jobsearch.viewjob.a) obj).A0;
                if (launchActivity != null) {
                    return launchActivity;
                }
                wl7.g("launchActivity");
                throw null;
        }
    }
}
