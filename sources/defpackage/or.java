package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.foundation.text.modifiers.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.g;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.deeplink.b;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.reactnative.rntarebridge.nav.RNJSTNavigator;
import com.swmansion.rnscreens.e;
import defpackage.b5a;
import defpackage.cd4;
import defpackage.h63;
import defpackage.jq7;
import defpackage.lx5;
import defpackage.oq7;
import defpackage.pn5;
import defpackage.sp7;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class or implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ or(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [T, android.app.Dialog, androidx.appcompat.app.c] */
    /* JADX WARN: Type inference failed for: r0v55, types: [T, android.app.Dialog, androidx.appcompat.app.c] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String queryParameter;
        int i = this.a;
        int i2 = 18;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((f51) ((sr) obj2).k0.getValue()).x(str);
                return j6g.a;
            case 1:
                return o6.a((p63) obj, (t41) obj2);
            case 2:
                fr0 fr0Var = (fr0) obj2;
                fr0Var.getClass();
                fr0Var.i();
                old oldVarA = old.a(fr0Var.i(), (List) obj, null, false, 0, null, null, false, null, false, null, false, null, null, false, false, 0, 262014);
                gse gseVar = fr0Var.b;
                gseVar.getClass();
                gseVar.m(null, oldVarA);
                return j6g.a;
            case 3:
                p91 p91Var = (p91) obj2;
                Integer num = (Integer) obj;
                qf8<Object>[] qf8VarArr = p91.i0;
                if (num != null) {
                    ((dme) ((jq6) p91Var.a0.getValue()).W).h(num.intValue());
                }
                return j6g.a;
            case 4:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                Uri uri = ((b.e) obj2).f;
                if (uri != null && (queryParameter = uri.getQueryParameter("from")) != null) {
                    bVar.a("urlFrom", queryParameter);
                }
                return j6g.a;
            case 5:
                cd4.a aVar = (cd4.a) obj;
                aVar.getClass();
                return aVar.name() + ((ad4) obj2).e(aVar);
            case 6:
                gi4 gi4Var = (gi4) obj2;
                String str2 = (String) obj;
                str2.getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-education", "delete", null, null, 12));
                yvb yvbVarR = gi4Var.R();
                u63.Y(ee3.p(yvbVarR), null, null, new fwb(null, new fk0(gi4Var, 5), yvbVarR, str2), 3);
                return j6g.a;
            case 7:
                lx5.b bVar2 = (lx5.b) obj;
                w40.l(bVar2, "subTabName", "Interview", "interviewId", (String) obj2);
                bVar2.a("myjobsPageTk", ie7.Z);
                return j6g.a;
            case 8:
                j4a j4aVar = (j4a) obj2;
                Object[] objArr = j4aVar.a;
                int i3 = j4aVar.c;
                while (i < i3) {
                    ((bg9) objArr[i]).j();
                    i++;
                }
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                lx5.b bVar3 = (lx5.b) obj;
                bVar3.getClass();
                bVar3.b("result", Long.valueOf(((Number) ((gme) ((wj1) obj2).c).getValue()).intValue()));
                return j6g.a;
            case 10:
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) obj2;
                String str3 = (String) obj;
                str3.getClass();
                ((yof) indeedApplyWebViewFragment.r0.getValue()).b(str3, "IndeedApplyWebViewFragment");
                g gVarRequireActivity = indeedApplyWebViewFragment.requireActivity();
                gVarRequireActivity.getClass();
                if (!zve.U(str3)) {
                    Lazy lazy = pkf.a;
                    Uri uri2 = Uri.parse(str3);
                    a1 a1Var = new a1(indeedApplyWebViewFragment, 13);
                    uri2.getClass();
                    if (!gVarRequireActivity.isFinishing()) {
                        View viewInflate = gVarRequireActivity.getLayoutInflater().inflate(R.layout.dialog_no_browser_support, (ViewGroup) null);
                        luc lucVar = new luc();
                        String string = gVarRequireActivity.getString(R.string.browser_does_not_support_message);
                        string.getClass();
                        String string2 = gVarRequireActivity.getString(R.string.browser_does_not_support_message_link);
                        string2.getClass();
                        okf okfVar = new okf(gVarRequireActivity, a1Var, lucVar);
                        SpannableString spannableString = new SpannableString(string);
                        spannableString.setSpan(okfVar, zve.S(string, string2, 0, false, 6), string2.length() + zve.S(string, string2, 0, false, 6), 18);
                        View viewFindViewById = viewInflate.findViewById(R.id.dialog_no_browser_support_message);
                        viewFindViewById.getClass();
                        TextView textView = (TextView) viewFindViewById;
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        textView.setText(spannableString);
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(uri2);
                            List<ResolveInfo> listQueryIntentActivities = gVarRequireActivity.getPackageManager().queryIntentActivities(intent, 131072);
                            listQueryIntentActivities.getClass();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : listQueryIntentActivities) {
                                if (!wl7.b(((ResolveInfo) obj3).activityInfo.packageName, gVarRequireActivity.getPackageName())) {
                                    arrayList.add(obj3);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((ResolveInfo) it.next()).activityInfo.packageName);
                            }
                            ArrayList<String> arrayList3 = new ArrayList();
                            for (Object obj4 : arrayList2) {
                                String str4 = (String) obj4;
                                if (str4 != null && !zve.U(str4) && !str4.equals(gVarRequireActivity.getPackageName())) {
                                    arrayList3.add(obj4);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList(t92.r0(arrayList3, 10));
                            for (String str5 : arrayList3) {
                                Intent intent2 = new Intent(intent);
                                intent2.setPackage(str5);
                                arrayList4.add(intent2);
                            }
                            if (arrayList4.isEmpty()) {
                                ActivityNotFoundException activityNotFoundException = new ActivityNotFoundException("no browser apps found to support this url");
                                ArrayList arrayList5 = lz2.a;
                                lz2.b("ThirdPartyActivityLauncher", "no browser apps found to support this url", false, activityNotFoundException);
                                ?? Create = new le9(gVarRequireActivity, 0).g(viewInflate).d().create();
                                lucVar.element = Create;
                                Create.show();
                            } else {
                                Intent intentCreateChooser = Intent.createChooser(intent, null);
                                intentCreateChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", (Parcelable[]) u63.Z(gVarRequireActivity.getComponentName()).toArray(new ComponentName[0]));
                                intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList4.toArray(new Intent[0]));
                                gVarRequireActivity.startActivity(intentCreateChooser);
                            }
                        } catch (ActivityNotFoundException e) {
                            ArrayList arrayList6 = lz2.a;
                            lz2.b("ThirdPartyActivityLauncher", "Failed to launch mobile browser", false, e);
                            ?? Create2 = new le9(gVarRequireActivity, 0).g(viewInflate).d().create();
                            lucVar.element = Create2;
                            Create2.show();
                        }
                    }
                }
                return j6g.a;
            case 11:
                ((lu8) obj2).r.b(((s37) obj).a);
                return j6g.a;
            case 12:
                i5a i5aVar = (i5a) obj2;
                b5a b5aVar = (b5a) obj;
                if (b5aVar instanceof b5a.d) {
                    r97 r97Var = r97.a;
                    String str6 = ((b5a.d) b5aVar).a;
                    r97Var.getClass();
                    if (r97.m(str6)) {
                        try {
                            g activity = i5aVar.getActivity();
                            if (activity == null || activity.isFinishing()) {
                                ArrayList arrayList7 = lz2.a;
                                lz2.b("MyJobsFragment", "openViewJob: null activity", false, new Exception("openViewJob: null activity"));
                            } else {
                                g3a<jz2<j6g>> g3aVar = kqg.a;
                                lr5 lr5VarU = activity.u();
                                lr5VarU.getClass();
                                kqg.a(str6, lr5VarU, false, "my-jobs");
                            }
                        } catch (IllegalStateException e2) {
                            ArrayList arrayList8 = lz2.a;
                            lz2.c("MyJobsFragment", "openViewJob exception", false, e2, 4);
                        }
                    } else {
                        try {
                            g activity2 = i5aVar.getActivity();
                            if (activity2 == null || activity2.isFinishing()) {
                                ArrayList arrayList9 = lz2.a;
                                lz2.b("MyJobsFragment", "openFsdv: null activity", false, new Exception("openFsdv: null activity"));
                            } else {
                                lr5 lr5VarU2 = activity2.u();
                                lr5VarU2.getClass();
                                ka2.H(str6, false, false, lr5VarU2);
                            }
                        } catch (IllegalStateException e3) {
                            ArrayList arrayList10 = lz2.a;
                            lz2.c("MyJobsFragment", "openFsdv exception", false, e3, 4);
                        }
                    }
                    break;
                } else if (b5aVar instanceof b5a.c) {
                    String str7 = ((b5a.c) b5aVar).a;
                    g activity3 = i5aVar.getActivity();
                    lr5 lr5VarU3 = activity3 != null ? activity3.u() : null;
                    if (lr5VarU3 == null) {
                        ArrayList arrayList11 = lz2.a;
                        w40.n("FragmentManager is null, cannot open apply page.", "MyJobsFragment", "FragmentManager is null, cannot open apply page.", false);
                    } else {
                        try {
                            ((rq7) cr8.p(rq7.class)).e(lr5VarU3, str7, new vg(i2));
                        } catch (IllegalStateException e4) {
                            ArrayList arrayList12 = lz2.a;
                            lz2.b("MyJobsFragment", "Error opening Indeed apply modal", false, e4);
                        } catch (MalformedURLException e5) {
                            ArrayList arrayList13 = lz2.a;
                            lz2.b("MyJobsFragment", "Invalid URL: " + str7, false, e5);
                        }
                    }
                    break;
                } else if (b5aVar instanceof b5a.b) {
                    IanMainFragment ianMainFragment = ((jq6) i5aVar.V.getValue()).d0;
                    if (ianMainFragment != null) {
                        ianMainFragment.B(((b5a.b) b5aVar).a);
                    }
                } else if (b5aVar instanceof b5a.e) {
                    g activity4 = i5aVar.getActivity();
                    if (activity4 == null) {
                        return j6g.a;
                    }
                    rq7 rq7Var = (rq7) cr8.p(rq7.class);
                    lr5 lr5VarU4 = activity4.u();
                    lr5VarU4.getClass();
                    b5a.e eVar = (b5a.e) b5aVar;
                    rq7Var.f(lr5VarU4, mh2.k(i5aVar), new jq7.p(eVar.a), eVar.b);
                } else if (b5aVar instanceof b5a.f) {
                    uha uhaVar = ((b5a.f) b5aVar).a;
                    try {
                        g activity5 = i5aVar.getActivity();
                        if (activity5 == null || activity5.isFinishing()) {
                            ArrayList arrayList14 = lz2.a;
                            lz2.b("MyJobsFragment", "openNextStepsDashboard: null or finishing activity", false, new Exception("openNextStepsDashboard: null or finishing activity"));
                        } else {
                            lr5 lr5VarU5 = activity5.u();
                            lr5VarU5.getClass();
                            Fragment fragmentD = lr5VarU5.D("RnNextStepsDashboardFragment");
                            if ((fragmentD instanceof led) && ((led) fragmentD).isVisible()) {
                                i5aVar.Y = (led) fragmentD;
                                i5aVar.Z = true;
                                ArrayList arrayList15 = lz2.a;
                                lz2.d("MyJobsFragment", "Next Steps Dashboard fragment already displayed, ignoring duplicate open request", false, null);
                            } else {
                                if (fragmentD == null || !(fragmentD instanceof led) || !((led) fragmentD).isAdded()) {
                                    i5aVar.Y = null;
                                    i5aVar.Z = false;
                                }
                                if (!i5aVar.Z || i5aVar.Y == null) {
                                    i5aVar.Y = i5aVar.O(uhaVar);
                                    i5aVar.Z = true;
                                }
                                led ledVar = i5aVar.Y;
                                if (ledVar == null) {
                                    ArrayList arrayList16 = lz2.a;
                                    lz2.c("MyJobsFragment", "Unable to initialize Next Steps Dashboard fragment", false, null, 12);
                                } else {
                                    a aVar2 = new a(lr5VarU5);
                                    if (fragmentD != null) {
                                        aVar2.e(android.R.id.content, ledVar, "RnNextStepsDashboardFragment");
                                        ArrayList arrayList17 = lz2.a;
                                        lz2.d("MyJobsFragment", "Replacing existing Next Steps Dashboard fragment", false, null);
                                    } else {
                                        aVar2.d(android.R.id.content, ledVar, "RnNextStepsDashboardFragment", 1);
                                        ArrayList arrayList18 = lz2.a;
                                        lz2.d("MyJobsFragment", "Adding new Next Steps Dashboard fragment", false, null);
                                    }
                                    aVar2.c("RnNextStepsDashboardFragment");
                                    aVar2.h(false);
                                }
                            }
                        }
                    } catch (Exception e6) {
                        ArrayList arrayList19 = lz2.a;
                        lz2.c("MyJobsFragment", "openNextStepsDashboard exception", false, e6, 4);
                    }
                } else {
                    if (!(b5aVar instanceof b5a.a)) {
                        l.g();
                        return null;
                    }
                    rq7 rq7Var2 = (rq7) cr8.p(rq7.class);
                    lr5 lr5VarU6 = i5aVar.requireActivity().u();
                    lr5VarU6.getClass();
                    rq7Var2.f(lr5VarU6, mh2.k(i5aVar), jq7.u.INSTANCE, "MyJobsFragment");
                }
                return j6g.a;
            case 13:
                return Boolean.valueOf(((oea) obj).b == ((q0a) obj2));
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                h5b h5bVar = (h5b) obj2;
                h63 h63Var = (h63) obj;
                if (wl7.b(h63Var, h63.b.a)) {
                    ((gme) h5bVar.P().f).setValue(Boolean.TRUE);
                } else if (h63Var instanceof h63.c) {
                    h5bVar.requireContext().startActivity(((h63.c) h63Var).a);
                } else if (!wl7.b(h63Var, h63.a.a)) {
                    l.g();
                    return null;
                }
                return j6g.a;
            case 15:
                ((p9d) obj2).i(((th7) obj).a);
                return j6g.a;
            case 16:
                ((rxb) obj).getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("rich-profile-home-screen", "profile-preferences-tab", null, null, 12));
                ((x1c) obj2).y(rxb.b);
                return j6g.a;
            case 17:
                return RNJSTNavigator.openModal$lambda$15$lambda$10((Promise) obj2, (oq7.b) obj);
            case 18:
                lx5.b bVar4 = (lx5.b) obj;
                bVar4.getClass();
                bVar4.a("url", ((Request) obj2).a.i);
                bVar4.a("ctk", ((pp7) cr8.p(pp7.class)).e());
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                iid iidVar = (iid) obj;
                ((kfd) obj2).b.invoke(iidVar);
                return Integer.valueOf(iidVar.M1() ? iidVar.getInt(0) : 0);
            case 20:
                return Float.valueOf(((e) obj2).l().getHeight());
            default:
                androidx.compose.foundation.text.modifiers.b bVar5 = (androidx.compose.foundation.text.modifiers.b) obj2;
                le0 le0Var = (le0) obj;
                b.a aVar3 = bVar5.t0;
                zr4 zr4Var = zr4.a;
                if (aVar3 == null) {
                    b.a aVar4 = new b.a(bVar5.d0, le0Var);
                    s1a s1aVar = new s1a(le0Var, bVar5.e0, bVar5.f0, bVar5.h0, bVar5.i0, bVar5.j0, bVar5.k0, zr4Var);
                    s1aVar.d(bVar5.d2().j);
                    aVar4.d = s1aVar;
                    bVar5.t0 = aVar4;
                } else if (!wl7.b(le0Var, aVar3.b)) {
                    aVar3.b = le0Var;
                    s1a s1aVar2 = aVar3.d;
                    if (s1aVar2 != null) {
                        tjf tjfVar = bVar5.e0;
                        pn5.a aVar5 = bVar5.f0;
                        int i4 = bVar5.h0;
                        boolean z = bVar5.i0;
                        int i5 = bVar5.j0;
                        int i6 = bVar5.k0;
                        s1aVar2.a = le0Var;
                        boolean zC = tjfVar.c(s1aVar2.k);
                        s1aVar2.k = tjfVar;
                        if (!zC) {
                            s1aVar2.q <<= 2;
                            s1aVar2.l = null;
                            s1aVar2.n = null;
                            s1aVar2.p = -1;
                            s1aVar2.o = -1;
                        }
                        s1aVar2.b = aVar5;
                        s1aVar2.c = i4;
                        s1aVar2.d = z;
                        s1aVar2.e = i5;
                        s1aVar2.f = i6;
                        s1aVar2.g = zr4Var;
                        s1aVar2.q = (s1aVar2.q << 2) | 2;
                        s1aVar2.l = null;
                        s1aVar2.n = null;
                        s1aVar2.p = -1;
                        s1aVar2.o = -1;
                    }
                }
                us3.f(bVar5).U();
                us3.f(bVar5).S();
                fb4.a(bVar5);
                return Boolean.TRUE;
        }
    }
}
