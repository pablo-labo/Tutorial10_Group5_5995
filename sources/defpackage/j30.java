package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import android.view.inputmethod.InputMethodManager;
import androidx.navigation.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.forcedupgrade.ForcedUpgradeFragment;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.tare.debug.ProfileFormsDebugFragment;
import com.indeed.android.jobsearch.webview.external.ExternalActivity;
import com.indeed.android.jobsearch.webview.external.ExternalWebView;
import com.indeed.android.jsmappservices.bridge.SearchType;
import defpackage.azg;
import defpackage.ba5;
import defpackage.fr0;
import defpackage.s87;
import defpackage.sp7;
import defpackage.xh8;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.Lazy;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j30 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j30(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v39, types: [oj6] */
    @Override // defpackage.gu5
    public final Object invoke() {
        String string;
        ?? arrayList;
        int i = this.a;
        ?? r2 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                d40 d40Var = (d40) obj;
                Object value = ((gme) d40Var.l).getValue();
                if (value != null) {
                    return value;
                }
                float fG = ((cme) d40Var.j).g();
                boolean zIsNaN = Float.isNaN(fG);
                g4a g4aVar = d40Var.g;
                if (zIsNaN) {
                    return ((gme) g4aVar).getValue();
                }
                Object value2 = ((gme) g4aVar).getValue();
                pa4 pa4VarE = d40Var.e();
                float f = pa4VarE.f(value2);
                if (f != fG && !Float.isNaN(f)) {
                    if (f < fG) {
                        Object objB = pa4VarE.b(fG, true);
                        if (objB != null) {
                            return objB;
                        }
                    } else {
                        Object objB2 = pa4VarE.b(fG, false);
                        if (objB2 != null) {
                            return objB2;
                        }
                    }
                }
                return value2;
            case 1:
                ((fr0) obj).r(new fr0.b.a(0));
                return j6g.a;
            case 2:
                y91 y91Var = (y91) obj;
                bp6 bp6Var = y91Var.f;
                bp6Var.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(bp6Var.a(), tx5.k(bp6Var.b, "IanLogger", "report-the-issue", null, 12));
                y91Var.F("BaseIanWebViewFragment", new lz(4), new ye(y91Var, 3));
                return j6g.a;
            case 3:
                gy1 gy1Var = (gy1) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("coWorkerPromo", "coWorkerPromoChatNow", u63.Z("coWorker"), null, 8));
                gy1Var.g0.invoke();
                gy1Var.close();
                return j6g.a;
            case 4:
                Bundle bundle = new Bundle();
                SharedPreferences sharedPreferences = ((re3) obj).a;
                if (sharedPreferences.getLong("expire", 0L) > new Date().getTime() && (string = sharedPreferences.getString("bundle", null)) != null) {
                    byte[] bArrDecode = Base64.decode(string, 0);
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
                    parcelObtain.setDataPosition(0);
                    Bundle bundle2 = parcelObtain.readBundle(null);
                    parcelObtain.recycle();
                    if (bundle2 != null) {
                        bundle = bundle2;
                    }
                }
                sharedPreferences.edit().clear().apply();
                return bundle;
            case 5:
                ExternalActivity externalActivity = (ExternalActivity) obj;
                externalActivity.z0 = null;
                ExternalWebView externalWebView = externalActivity.w0;
                if (externalWebView != null) {
                    externalWebView.requestFocus();
                    return j6g.a;
                }
                wl7.g("externalWebView");
                throw null;
            case 6:
                ba5 ba5Var = (ba5) obj;
                File file = ba5Var.a;
                ba5.a aVar = ba5Var.b;
                File[] fileArrListFiles = file.listFiles(new z95());
                if (fileArrListFiles == null) {
                    ArrayList arrayList2 = lz2.a;
                    lz2.c("FileLogging", l6.g(file, "Could not list files in "), false, null, 12);
                    return j6g.a;
                }
                if (fileArrListFiles.length > 1) {
                    pyd.Q(fileArrListFiles, new g9h(r2 == true ? 1 : 0));
                }
                aVar.getClass();
                Iterator it = ut0.h0(50, fileArrListFiles).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                long jLongValue = ba5Var.d.invoke().longValue();
                if (50 >= fileArrListFiles.length) {
                    arrayList = ut0.E0(fileArrListFiles);
                } else {
                    arrayList = new ArrayList(50);
                    int i2 = 0;
                    for (File file2 : fileArrListFiles) {
                        arrayList.add(file2);
                        i2++;
                        if (i2 != 50) {
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : (Iterable) arrayList) {
                    if (jLongValue - ((File) obj2).lastModified() > 5184000000L) {
                        arrayList3.add(obj2);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    ((File) it2.next()).delete();
                }
                return j6g.a;
            case 7:
                ((hn0) ((ForcedUpgradeFragment) obj).a.getValue()).b("forced_upgrade");
                return j6g.a;
            case 8:
                ?? r9 = (oj6) obj;
                String string2 = ((Context) (r9 instanceof ai8 ? ((ai8) r9).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Context.class), null)).getString(R.string.desc_notifications_icon);
                string2.getClass();
                return string2;
            case DatadogLogGenerator.CRASH /* 9 */:
                Object systemService = ((ye7) obj).a.getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 10:
                ((np7) cr8.p(np7.class)).e("JSTNavigatorImpl", "navToRegPromo");
                ((e) obj).n(R.id.navActionDirectlyRegPromo, null);
                return j6g.a;
            case 11:
                return (OkHttpClient) obj;
            case 12:
                fma fmaVar = (fma) obj;
                int i3 = fma.s0;
                fmaVar.Y.i("NOTIFICATIONS");
                fmaVar.Y();
                return j6g.a;
            case 13:
                ((gme) ((h5b) obj).P().e).setValue(Boolean.FALSE);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                it5.a();
                Object value3 = ((vpb) obj).q.getValue();
                value3.getClass();
                return new h1d((opb) value3);
            case 15:
                ((gme) ((ProfileFormsDebugFragment) obj).a).setValue(Boolean.TRUE);
                return j6g.a;
            case 16:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj;
                aud audVarH = searchOverlayFragment.H();
                audVarH.getClass();
                Lazy<s87> lazy2 = s87.f;
                s87.a.a(audVarH.a(), tx5.k(audVarH.b, ak2.M(SearchType.c), "current-location", null, 12));
                cud cudVarI = searchOverlayFragment.I();
                m19 m19Var = cudVarI.f;
                if (m19Var.j()) {
                    cudVarI.y(azg.h.a);
                    cudVarI.z();
                } else {
                    m19Var.A();
                }
                return j6g.a;
            case 17:
                return ((zf8) ((ArrayList) obj).get(0)).a();
            case 18:
                ((x8f) obj).close();
                return j6g.a;
            default:
                return Boolean.valueOf(((cme) ((igf) obj).a).g() > 0.0f);
        }
    }
}
