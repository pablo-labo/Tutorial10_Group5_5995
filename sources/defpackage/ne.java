package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.launch.LaunchFragment;
import com.indeed.android.reactnative.rntarebridge.nav.RNJSTNavigator;
import defpackage.h63;
import defpackage.l9c;
import defpackage.qq8;
import defpackage.sp7;
import defpackage.szc;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ne implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ne(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        int i2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                re reVar = (re) obj2;
                hz1 hz1Var = (hz1) obj;
                hz1Var.getClass();
                yvb yvbVarQ = reVar.Q();
                qe qeVar = new qe(i2, reVar, hz1Var);
                if (yvbVarQ.v().H) {
                    qeVar.invoke();
                } else {
                    String str2 = yvbVarQ.v().a;
                    if (str2 != null) {
                        a18 a18VarZ = yvb.z(hz1Var.c);
                        ((gme) yvbVarQ.e).setValue(b5g.b);
                        u63.Y(ee3.p(yvbVarQ), null, null, new wvb(yvbVarQ, str2, hz1Var, a18VarZ, qeVar, null), 3);
                    }
                }
                return j6g.a;
            case 1:
                String str3 = (String) obj;
                str3.getClass();
                ((f51) obj2).q(str3);
                return j6g.a;
            case 2:
                ActionMode actionMode = ((sa0) obj2).h;
                if (actionMode != null) {
                    actionMode.invalidateContentRect();
                }
                return j6g.a;
            case 3:
                ec1 ec1Var = (ec1) obj2;
                ex4 ex4Var = (ex4) obj;
                int i3 = ec1.s0;
                ex4Var.getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.f(6, ex4Var == ex4.b ? "network-error-screen" : "http-error-screen", null, null));
                twg twgVarQ = ec1Var.Q();
                twgVarQ.h(swg.a(twgVarQ.g(), null, true, ex4Var, 0.0f, false, 25));
                return j6g.a;
            case 4:
                ((Function1) obj2).invoke((ig3) obj);
                return j6g.a;
            case 5:
                ArrayList arrayList = (ArrayList) obj2;
                wpe wpeVar = (wpe) obj;
                wpeVar.getClass();
                while (((Boolean) wpeVar.next().b).booleanValue()) {
                    String string = wpeVar.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(string);
                }
                l9c.a.getClass();
                return new l9c.b(l9c.a.b);
            case 6:
                IanMainFragment ianMainFragment = (IanMainFragment) obj2;
                String str4 = (String) obj;
                str4.getClass();
                ((yof) ianMainFragment.V.getValue()).b(str4, "ian-main-screen");
                IanMainFragment.P(ianMainFragment, str4, false, false, 6);
                return j6g.a;
            case 7:
                cd6 cd6Var = (cd6) obj;
                cd6Var.getClass();
                cd6Var.b(((Number) ((ese) obj2).getValue()).floatValue());
                return j6g.a;
            case 8:
                LaunchFragment launchFragment = (LaunchFragment) obj2;
                h63 h63Var = (h63) obj;
                if (wl7.b(h63Var, h63.b.a)) {
                    ((gme) launchFragment.E().c0).setValue(Boolean.TRUE);
                } else if (h63Var instanceof h63.c) {
                    launchFragment.requireContext().startActivity(((h63.c) h63Var).a);
                } else if (!wl7.b(h63Var, h63.a.a)) {
                    l.g();
                    return null;
                }
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                return new oq8((qq8.a) obj2);
            case 10:
                String str5 = (String) obj;
                str5.getClass();
                ((o99) obj2).Q().x(str5);
                return j6g.a;
            case 11:
                hr7 hr7Var = (hr7) obj;
                hr7Var.getClass();
                int iOrdinal = ((p12) obj2).ordinal();
                if (iOrdinal == 0) {
                    str = "swipe";
                } else if (iOrdinal == 1) {
                    str = "longPress";
                } else if (iOrdinal == 2) {
                    str = "detailsButton";
                } else {
                    if (iOrdinal != 3) {
                        l.g();
                        return null;
                    }
                    str = "composeButton";
                }
                hr7Var.a("cause", str);
                return j6g.a;
            case 12:
                yvb yvbVar = (yvb) obj2;
                String str6 = (String) obj;
                str6.getClass();
                yvbVar.getClass();
                u63.Y(ee3.p(yvbVar), null, null, new swb(null, yvbVar, str6), 3);
                return j6g.a;
            case 13:
                return RNJSTNavigator.openProfileResumeDataImportModal$lambda$22$lambda$21((Promise) obj2, (ms7) obj);
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                lr5 lr5Var = (lr5) obj2;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) obj;
                fragmentContainerView.getClass();
                Fragment fragmentD = lr5Var.D("RNProfileScreenFragment");
                if (fragmentD == null) {
                    fragmentD = lr5Var.C(fragmentContainerView.getId());
                }
                if (fragmentD == null) {
                    ArrayList arrayList2 = lz2.a;
                    Log.d("RNProfileScreenContainer", "Creating new RN fragment for ProfileScreen", null);
                    Bundle bundle = new Bundle();
                    bundle.putString("initialTab", "PROFILE");
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("isLoggedIn", ((bp7) cr8.p(bp7.class)).e());
                    bundle.putBundle("nativeContext", bundle2);
                    ija ijaVar = new ija();
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("arg_component_name", "RNProfileScreen");
                    bundle3.putBundle("arg_launch_options", bundle);
                    bundle3.putBoolean("arg_fabric_enabled", false);
                    ijaVar.setArguments(bundle3);
                    a aVar = new a(lr5Var);
                    aVar.d(fragmentContainerView.getId(), ijaVar, "RNProfileScreenFragment", 1);
                    aVar.h(true);
                } else {
                    ArrayList arrayList3 = lz2.a;
                    Log.d("RNProfileScreenContainer", "Reusing existing RN fragment", null);
                    if (fragmentD.getId() != fragmentContainerView.getId()) {
                        a aVar2 = new a(lr5Var);
                        aVar2.l(fragmentD);
                        aVar2.j();
                        a aVar3 = new a(lr5Var);
                        aVar3.d(fragmentContainerView.getId(), fragmentD, "RNProfileScreenFragment", 1);
                        aVar3.h(true);
                    }
                }
                return j6g.a;
            case 15:
                iba ibaVar = (iba) obj2;
                ((m74) obj).getClass();
                pzc pzcVar = new pzc();
                ibaVar.b(pzcVar);
                return new szc.a(ibaVar, pzcVar);
            case 16:
                d1d d1dVar = (d1d) obj2;
                List list = (List) obj;
                list.getClass();
                aub aubVarQ = d1dVar.Q();
                u63.Y(ee3.p(aubVarQ), null, null, new wtb(aubVarQ, list, new pa0(11, list, d1dVar), null), 3);
                return j6g.a;
            case 17:
                j4e j4eVar = (j4e) obj2;
                g4a g4aVar = j4eVar.j;
                xm5 xm5Var = (xm5) obj;
                if (!xm5Var.c() && ((Boolean) ((gme) g4aVar).getValue()).booleanValue()) {
                    j4eVar.j();
                }
                ((gme) g4aVar).setValue(Boolean.valueOf(xm5Var.c()));
                return j6g.a;
            default:
                return Boolean.valueOf(wl7.b(((m65) obj).a, (qke) obj2));
        }
    }
}
