package defpackage;

import android.view.ActionMode;
import androidx.compose.ui.layout.w;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.deeplink.b;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.profile.screens.sheets.profilesubtab.links.a;
import defpackage.hf3;
import defpackage.k36;
import defpackage.lx5;
import defpackage.s87;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class me implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ me(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                boolean zF = c0h.F();
                frg frgVar = ((re) obj2).h0;
                if (zF) {
                    ((f51) frgVar.getValue()).j(str);
                } else {
                    ((f51) frgVar.getValue()).h(str);
                }
                break;
            case 1:
                break;
            case 2:
                vw vwVar = (vw) obj2;
                zie zieVar = (zie) obj;
                zieVar.getClass();
                if (vwVar.k0) {
                    qs7 qs7VarJ = jsb.j(zieVar);
                    vwVar.close();
                    Function2<? super ps7, ? super qs7, j6g> function2 = vwVar.j0;
                    if (function2 != null) {
                        function2.invoke(ps7.a, qs7VarJ);
                    }
                } else {
                    vwVar.Q().i(zieVar, new qe(2, vwVar, zieVar));
                }
                break;
            case 3:
                ActionMode actionMode = ((sa0) obj2).h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                break;
            case 4:
                x1c x1cVar = (x1c) obj2;
                ((gme) x1cVar.X).setValue(yz7.a(x1cVar.m(), null, null, (String) obj, null, null, null, null, null, null, null, null, null, null, null, 16379));
                x1cVar.L();
                break;
            case 5:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                String queryParameter = ((b.k) obj2).f.getQueryParameter("from");
                if (queryParameter != null) {
                    bVar.a("urlFrom", queryParameter);
                }
                break;
            case 6:
                ((l64) obj2).a0 = true;
                break;
            case 7:
                a aVar = (a) obj2;
                String str2 = (String) obj;
                str2.getClass();
                aVar.R().R(str2, aVar.R().v().a0.a);
                break;
            case 8:
                cd6 cd6Var = (cd6) obj;
                cd6Var.getClass();
                cd6Var.b(((Number) ((ese) obj2).getValue()).floatValue());
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                x2a x2aVar = (x2a) obj2;
                x2aVar.q(x2aVar.g() + ((Float) obj).floatValue());
                break;
            case 10:
                lx5.b bVar2 = (lx5.b) obj;
                bVar2.getClass();
                Function1<hr7, j6g> function1 = ((sp7.h) obj2).a;
                if (function1 != null) {
                    function1.invoke(new zp7(bVar2));
                }
                break;
            case 11:
                t78 t78Var = (t78) obj2;
                js7 js7Var = (js7) obj;
                js7Var.getClass();
                t78Var.close();
                Function2<? super hs7, ? super js7, j6g> function22 = t78Var.h0;
                if (function22 != null) {
                    function22.invoke(hs7.a, js7Var);
                }
                break;
            case 12:
                ((udf) obj2).b(((ooa) obj).a);
                break;
            case 13:
                Boolean bool = (Boolean) ((Function1) obj).invoke((q6d) obj2);
                bool.booleanValue();
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                crb crbVar = (crb) obj2;
                if (((j6g) ((jz2) obj).a()) != null) {
                    crbVar.S();
                }
                break;
            case 15:
                bub bubVar = (bub) obj2;
                cub cubVar = (cub) obj;
                cubVar.getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-privacy-selector", "save", null, null, 12));
                x1c x1cVar2 = (x1c) bubVar.i0.getValue();
                ((gme) x1cVar2.Y).setValue(b5g.b);
                cub cubVar2 = x1cVar2.o().b;
                ((gme) x1cVar2.V).setValue(exb.a(x1cVar2.o(), null, cubVar, null, null, false, false, false, null, false, false, false, false, false, false, 65533));
                oq oqVar = new oq(x1cVar2, 21);
                mr mrVar = new mr(9, x1cVar2, cubVar2);
                boolean z = x1cVar2.o().b == cub.a;
                u63.Y(ee3.p(x1cVar2), null, null, new h2c(x1cVar2, new zfg(z ? aoe.OPT_IN : aoe.OPT_OUT), z ? tnb.TOGGLE_ON_SUCCESS : tnb.TOGGLE_OFF_SUCCESS, z ? "OPT_IN" : "OPT_OUT", oqVar, z ? tnb.TOGGLE_ON_ERROR : tnb.TOGGLE_OFF_ERROR, mrVar, null), 3);
                bubVar.close();
                break;
            case 16:
                String str3 = (String) obj;
                str3.getClass();
                ((yvb) obj2).o(str3);
                break;
            case 17:
                pld pldVar = (pld) obj2;
                hf3 hf3Var = (hf3) obj;
                if (hf3Var instanceof hf3.c) {
                    pldVar.getClass();
                    pldVar.i();
                    old oldVarI = pldVar.i();
                    k36.a aVar2 = (k36.a) ((hf3.c) hf3Var).a;
                    old oldVarA = old.a(oldVarI, null, null, false, aVar2.a, aVar2.b, null, false, null, false, null, false, null, null, false, false, 0, 262095);
                    gse gseVar = pldVar.b;
                    gseVar.getClass();
                    gseVar.m(null, oldVarA);
                } else {
                    ArrayList arrayList = lz2.a;
                    w40.n("Unable to successfully retrieve Job Seeker top choice budget.", "SavedTabViewModel", "Unable to successfully retrieve Job Seeker top choice budget.", false);
                }
                break;
            case 18:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj2;
                String str4 = (String) obj;
                str4.getClass();
                aud audVarH = searchOverlayFragment.H();
                audVarH.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(audVarH.a(), tx5.k(audVarH.b, ak2.M(SearchType.b), "delete-recent-search", null, 12));
                searchOverlayFragment.I().h(str4);
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                j4e j4eVar = (j4e) obj2;
                sl8 sl8Var = (sl8) obj;
                j4eVar.m = sl8Var;
                if (((Boolean) ((gme) j4eVar.j).getValue()).booleanValue() && j4eVar.g() != null) {
                    ooa ooaVar = sl8Var != null ? new ooa(sl8Var.L(0L)) : null;
                    if (!wl7.b(j4eVar.l, ooaVar)) {
                        j4eVar.l = ooaVar;
                        j4eVar.n();
                        j4eVar.p();
                    }
                }
                break;
            case 20:
                a4a a4aVar = (a4a) obj2;
                if (obj instanceof qse) {
                    ((qse) obj).z(4);
                }
                a4aVar.d(obj);
                break;
            case 21:
                w.a.y((w.a) obj, (w) obj2, 0, 0);
                break;
            default:
                f4h f4hVar = (f4h) obj2;
                List list = (List) obj;
                list.getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab-edit-work-wellbeing-preference", "save-work-wellbeing-preference", null, null, 12));
                aub aubVarQ = f4hVar.Q();
                u63.Y(ee3.p(aubVarQ), null, null, new ztb(aubVarQ, list, new pa0(13, list, f4hVar), null), 3);
                break;
        }
        return j6g.a;
    }
}
