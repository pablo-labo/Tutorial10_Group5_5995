package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.locationselector.LocationSelectorFragment;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jsmappservices.bridge.results.ApplyResult;
import com.indeed.android.jsmappservices.bridge.results.IndeedApplyCompletionResult;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.a;
import defpackage.itc;
import defpackage.jq7;
import defpackage.s87;
import defpackage.ude;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qa implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qa(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        Object next;
        Object next2;
        Pair pair;
        Object next3;
        int i = this.a;
        int i2 = 12;
        Object obj = this.b;
        switch (i) {
            case 0:
                ra raVar = (ra) obj;
                raVar.close();
                Function1<? super ps7, j6g> function1 = raVar.j0;
                if (function1 != null) {
                    function1.invoke(ps7.b);
                }
                return j6g.a;
            case 1:
                return Boolean.valueOf((((toa) obj).a() & 9223372034707292159L) != 9205357640488583168L);
            case 2:
                return (LaunchActivity) obj;
            case 3:
                h12 h12VarG = ((w02) obj).G();
                h12VarG.k(i12.a(h12VarG.g(), null, null, null, null, null, null, null, true, 127));
                return j6g.a;
            case 4:
                ((Function1) obj).invoke(null);
                return j6g.a;
            case 5:
                h23 h23Var = (h23) obj;
                return new n2c(h23Var.h0, h23Var.i0);
            case 6:
                cva cvaVar = new cva();
                z90 z90Var = ((aqe) obj).b;
                z90Var.getClass();
                fwc.a.b(fa8.class);
                ArrayList arrayList = new ArrayList();
                try {
                    z90Var.L(null, "SELECT name FROM sqlite_master WHERE type='table' ORDER BY name;", new ne(arrayList, 5), 0, null);
                } catch (Exception e) {
                    Exception exc = new Exception("An exception occurred while looking up the table names", e);
                    System.out.println((Object) "Apollo: unhandled exception");
                    exc.printStackTrace();
                    j6g j6gVar = j6g.a;
                }
                if (!arrayList.isEmpty() && !arrayList.contains("records")) {
                    akb.n(m6.g("Apollo: Cannot find the 'records' table? (found '", "' instead)", arrayList));
                    return null;
                }
                fwc.a.b(fa8.class);
                zpe zpeVar = new zpe(new i62(new lb8(z90Var)));
                o81 o81Var = cvaVar;
                while (true) {
                    o81 o81Var2 = (o81) o81Var.c;
                    if (o81Var2 == null) {
                        o81Var.c = zpeVar;
                        return cvaVar;
                    }
                    o81Var = o81Var2;
                }
                break;
            case 7:
                wt3 wt3Var = (wt3) obj;
                return ((kb2) om2.a(wt3Var, lb2.a)).g() ? ((double) pnb.J(((da2) om2.a(wt3Var, ps2.a)).a)) > 0.5d ? sdd.d : sdd.e : sdd.f;
            case 8:
                ((al4) obj).Q(ps7.c, null);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                return new bxb(((a) obj).g0);
            case 10:
                return new bxb(((nn4) obj).h0);
            case 11:
                qj6 qj6Var = (qj6) obj;
                int i3 = qj6.r0;
                bp6 bp6Var = qj6Var.Y;
                bp6Var.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(bp6Var.a(), tx5.k(bp6Var.b, "HOME", "top-nav-profile", null, 12));
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = qj6Var.requireActivity().u();
                lr5VarU.getClass();
                rq7Var.f(lr5VarU, mh2.k(qj6Var), jq7.u.INSTANCE, "HomeTabWebViewFragment");
                return j6g.a;
            case 12:
                bp6 bp6Var2 = ((IanMainFragment) obj).c;
                bp6Var2.getClass();
                Lazy<s87> lazy2 = s87.f;
                s87.a.a(bp6Var2.a(), tx5.k(bp6Var2.b, "ian-main-screen", "hamburger-menu-close", null, 12));
                bp6Var2.c("ian-hamburger-menu", "PROFILE");
                ((j2g) cr8.p(j2g.class)).c();
                return j6g.a;
            case 13:
                ((gme) ((IndeedApplyWebViewFragment) obj).Q().X).setValue(Boolean.FALSE);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                c88 c88Var = (c88) obj;
                if (c88Var.v) {
                    c88Var.m.invoke();
                } else {
                    c88Var.i.invoke();
                }
                return j6g.a;
            case 15:
                LocationSelectorFragment locationSelectorFragment = (LocationSelectorFragment) obj;
                qf8<Object>[] qf8VarArr = LocationSelectorFragment.f;
                Lazy<s87> lazy3 = s87.f;
                s87.a.a((gz4) locationSelectorFragment.d.getValue(), tx5.k(locationSelectorFragment.e, "country-selector", "country-skip", new bt(locationSelectorFragment, i2), 4));
                ((m99) locationSelectorFragment.b.getValue()).Z.j(Boolean.TRUE);
                rq7 rq7Var2 = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU2 = locationSelectorFragment.requireActivity().u();
                lr5VarU2.getClass();
                rq7Var2.f(lr5VarU2, mh2.k(locationSelectorFragment), new jq7.i(null), "country-selector");
                return j6g.a;
            case 16:
                ((ude) obj).m(ude.c.t.a);
                return j6g.a;
            case 17:
                vpb vpbVar = (vpb) obj;
                spb spbVar = vpbVar.b;
                return vpbVar.g(new y09(spbVar.i.h(), spbVar.a));
            case 18:
                ((i1g) cr8.p(i1g.class)).a(t40.g((crb) obj), new ksb());
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                x1c x1cVar = (x1c) obj;
                String str = x1cVar.n().b;
                if (str != null && !zve.U(str)) {
                    u63.Y(ee3.p(x1cVar), null, null, new z1c(x1cVar, str, null), 3);
                }
                return j6g.a;
            case 20:
                g7c g7cVar = (g7c) obj;
                return Float.valueOf(g7cVar.a() / g7cVar.b() < 1.0f ? 0.3f : 1.0f);
            case 21:
                qhc.b.a(new IndeedApplyCompletionResult(ApplyResult.c, null));
                ((Promise) obj).resolve("CANCEL");
                return j6g.a;
            default:
                itc itcVar = (itc) obj;
                oe8 oe8VarA = itcVar.b.a();
                oe8VarA.getClass();
                ArrayList<tf8> arrayListA = ne8.a((yd8) oe8VarA);
                ArrayList arrayList2 = new ArrayList();
                for (tf8 tf8Var : arrayListA) {
                    Iterator<T> it = tf8Var.getAnnotations().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((Annotation) next) instanceof w85) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    w85 w85Var = (w85) next;
                    if (w85Var == null) {
                        pair = null;
                    } else {
                        owf<?> owfVarA = itcVar.a.a(tf8Var.getReturnType());
                        Iterator<T> it2 = tf8Var.getAnnotations().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (((Annotation) next2) instanceof s4d) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        boolean z = ((s4d) next2) != null;
                        List<Annotation> annotations = tf8Var.getAnnotations();
                        ArrayList arrayList3 = new ArrayList(t92.r0(annotations, 10));
                        for (Annotation annotation : annotations) {
                            Iterator<T> it3 = jh2.m(annotation).getAnnotations().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next3 = it3.next();
                                    if (((Annotation) next3) instanceof zf1) {
                                    }
                                } else {
                                    next3 = null;
                                }
                            }
                            zf1 zf1Var = (zf1) next3;
                            arrayList3.add(zf1Var == null ? null : new Pair(annotation, zf1Var));
                        }
                        List<Pair> listM0 = z92.M0(arrayList3);
                        ArrayList arrayList4 = new ArrayList(t92.r0(listM0, 10));
                        for (Pair pair2 : listM0) {
                            yd8 yd8VarB = fwc.a.b(((zf1) pair2.b()).binder());
                            Iterator it4 = yd8VarB.k().iterator();
                            boolean z2 = false;
                            Object obj2 = null;
                            while (true) {
                                if (it4.hasNext()) {
                                    Object next4 = it4.next();
                                    List<mf8> parameters = ((ve8) next4).getParameters();
                                    if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                                        Iterator<T> it5 = parameters.iterator();
                                        while (it5.hasNext()) {
                                            if (!((mf8) it5.next()).u()) {
                                            }
                                            break;
                                        }
                                    }
                                    if (!z2) {
                                        obj2 = next4;
                                        z2 = true;
                                    }
                                } else if (!z2) {
                                }
                            }
                            obj2 = null;
                            ve8 ve8Var = (ve8) obj2;
                            if (ve8Var == null) {
                                akb.o(yd8VarB, "Class should have a single no-arg constructor: ");
                                return null;
                            }
                            R rCallBy = ve8Var.callBy(bs4.a);
                            rCallBy.getClass();
                            tf8Var.getReturnType();
                            arrayList4.add(((dlg) rCallBy).a());
                        }
                        pair = new Pair(tf8Var, new itc.a(owfVarA, w85Var, z, arrayList4));
                    }
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                return lc9.f0(arrayList2);
        }
    }
}
