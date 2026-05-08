package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.tare.debug.ProfileUIPlatformDebugFragment;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.b;
import defpackage.ig3;
import defpackage.ns7;
import defpackage.os7;
import defpackage.ur7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ok4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ok4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        boolean z;
        int i = this.a;
        int i2 = 1;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Boolean bool = Boolean.FALSE;
                ((g4a) obj3).setValue(new ig3(null, bool, new ig3.b(bool, (s38) obj, (Integer) obj2)));
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    by1.a(f.f(g.c(g.f(e.a.b, 1.0f), 0.4f), 8.0f), ggd.a(16.0f), 0L, bh2.c(895009752, new b52(arrayList, i2), bVar), bVar, 1572870, 60);
                } else {
                    bVar.D();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                yy4.d((String) obj3, (b) obj, ka2.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ap9.b((x1e) obj3, (b) obj, ka2.L(1));
                break;
            case 4:
                crb crbVar = (crb) obj3;
                hvb hvbVar = (hvb) obj;
                String str = (String) obj2;
                hvbVar.getClass();
                str.getClass();
                int i3 = 12;
                switch (hvbVar.ordinal()) {
                    case 0:
                        ((vr7) cr8.p(vr7.class)).b(t40.g(crbVar), new os7.g(null, new ph2(i3)), new ur7.c(""));
                        break;
                    case 1:
                        Iterator<T> it = crbVar.P().v().g.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (((j2h) next).a.equals(str)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        j2h j2hVar = (j2h) next;
                        if (j2hVar == null) {
                            l5.q(l5.m("Work experience with id ", str, " not found"));
                        } else {
                            ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.i(jsb.l(j2hVar), new cj2(12)), new ur7.c(str));
                        }
                        break;
                    case 2:
                        ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.c(null, new us0(8)), new ur7.c(str));
                        break;
                    case 3:
                        ((vr7) cr8.p(vr7.class)).b(t40.g(crbVar), new os7.a(null, new rh2(13, (byte) 0)), new ur7.c(""));
                        break;
                    case 4:
                        ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.a(null, new kk2(13)), new ur7.c(str));
                        break;
                    case 5:
                        ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.b(null, new fj2(13, (byte) 0)), new ur7.c(str));
                        break;
                    case 6:
                        crbVar.P().K(str);
                        ((i1g) cr8.p(i1g.class)).a(t40.g(crbVar), new of4());
                        break;
                    case 7:
                        crbVar.P().K(str);
                        ((i1g) cr8.p(i1g.class)).a(t40.g(crbVar), new lk4());
                        break;
                    case 8:
                        crbVar.P().K(str);
                        ((i1g) cr8.p(i1g.class)).a(t40.g(crbVar), new rh4());
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        Iterator<T> it2 = crbVar.P().v().C.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (wl7.b(((lu0) next2).a, str)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        lu0 lu0Var = (lu0) next2;
                        if (lu0Var == null) {
                            l5.q(l5.m("Group with id ", str, " not found"));
                        } else {
                            ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.d(jsb.r(lu0Var), new cm0(11)), new ur7.c(str));
                        }
                        break;
                    case 10:
                        ((i1g) cr8.p(i1g.class)).a(t40.g(crbVar), new o99());
                        break;
                    case 11:
                        crbVar.P().C();
                        ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.e(null, new dm0(13, (byte) 0)), new ur7.c(str));
                        break;
                    case 12:
                        ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.f(null, new em0(12)), new ur7.c(str));
                        break;
                    case 13:
                        Iterator<T> it3 = crbVar.P().v().r.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next3 = it3.next();
                                if (wl7.b(((n5b) next3).a, str)) {
                                }
                            } else {
                                next3 = null;
                            }
                        }
                        n5b n5bVar = (n5b) next3;
                        if (n5bVar == null) {
                            l5.q(l5.m("Patent with id ", str, " not found"));
                        } else {
                            ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.g(jsb.h(n5bVar), new fm0(15)), new ur7.c(str));
                        }
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        Iterator<T> it4 = crbVar.P().v().n.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next4 = it4.next();
                                if (wl7.b(((p6c) next4).a, str)) {
                                }
                            } else {
                                next4 = null;
                            }
                        }
                        p6c p6cVar = (p6c) next4;
                        if (p6cVar == null) {
                            l5.q(l5.m("Publication with id ", str, " not found"));
                        } else {
                            ((vr7) cr8.p(vr7.class)).e(t40.g(crbVar), "ProfileFragment", new ns7.h(jsb.i(p6cVar), new vb2(9)), new ur7.c(str));
                        }
                        break;
                    case 15:
                        List<zie> list = crbVar.P().v().Q;
                        if ((list instanceof Collection) && list.isEmpty()) {
                            z = false;
                            ((i1g) cr8.p(i1g.class)).a(t40.g(crbVar), b.a.a(null, false, false, z, str, 5));
                        } else {
                            Iterator<T> it5 = list.iterator();
                            while (it5.hasNext()) {
                                yie yieVar = ((zie) it5.next()).j;
                                if (wl7.b(yieVar != null ? yieVar.a : null, str)) {
                                    z = true;
                                    ((i1g) cr8.p(i1g.class)).a(t40.g(crbVar), b.a.a(null, false, false, z, str, 5));
                                    break;
                                }
                            }
                            z = false;
                            ((i1g) cr8.p(i1g.class)).a(t40.g(crbVar), b.a.a(null, false, false, z, str, 5));
                        }
                        break;
                    default:
                        l.g();
                        break;
                }
                break;
            case 5:
                ProfileUIPlatformDebugFragment profileUIPlatformDebugFragment = (ProfileUIPlatformDebugFragment) obj3;
                androidx.compose.runtime.b bVar2 = (androidx.compose.runtime.b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objV = bVar2.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        objV = r.f(Boolean.FALSE);
                        bVar2.p(objV);
                    }
                    g4a g4aVar = (g4a) objV;
                    Object objV2 = bVar2.v();
                    if (objV2 == c0020a) {
                        objV2 = r.f("");
                        bVar2.p(objV2);
                    }
                    g4a g4aVar2 = (g4a) objV2;
                    boolean zX = bVar2.x(profileUIPlatformDebugFragment);
                    Object objV3 = bVar2.v();
                    if (zX || objV3 == c0020a) {
                        objV3 = new le(profileUIPlatformDebugFragment, 14);
                        bVar2.p(objV3);
                    }
                    gu5 gu5Var = (gu5) objV3;
                    Object objV4 = bVar2.v();
                    if (objV4 == c0020a) {
                        objV4 = new r00(3, g4aVar2, g4aVar);
                        bVar2.p(objV4);
                    }
                    wu5 wu5Var = (wu5) objV4;
                    Object objV5 = bVar2.v();
                    if (objV5 == c0020a) {
                        objV5 = new a88(g4aVar2, g4aVar);
                        bVar2.p(objV5);
                    }
                    androidx.fragment.app.g gVarRequireActivity = profileUIPlatformDebugFragment.requireActivity();
                    gVarRequireActivity.getClass();
                    q1c.f(gu5Var, wu5Var, (wu5) objV5, gVarRequireActivity, ((yvb) profileUIPlatformDebugFragment.b.getValue()).v(), ((aub) profileUIPlatformDebugFragment.c.getValue()).l(), bVar2, 295344);
                    boolean zBooleanValue = ((Boolean) g4aVar.getValue()).booleanValue();
                    String str2 = (String) g4aVar2.getValue();
                    fv6 fv6Var = fv6.q4;
                    Object objV6 = bVar2.v();
                    if (objV6 == c0020a) {
                        objV6 = new rr2(7, g4aVar);
                        bVar2.p(objV6);
                    }
                    tz6.a(12583296, 888, null, (gu5) objV6, fv6Var, bVar2, null, str2, null, null, null, zBooleanValue);
                } else {
                    bVar2.D();
                }
                break;
            case 6:
                hs7 hs7Var = (hs7) obj;
                hs7Var.getClass();
                ((wu5) obj3).q(hs7Var, (ws7) obj2, "Work Schedule");
                break;
            case 7:
                ((Integer) obj2).getClass();
                kee.a((gu5) obj3, (androidx.compose.runtime.b) obj, ka2.L(7));
                break;
            default:
                ((Integer) obj2).getClass();
                ((x8f) obj3).M(ka2.L(1), (androidx.compose.runtime.b) obj);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ ok4(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
