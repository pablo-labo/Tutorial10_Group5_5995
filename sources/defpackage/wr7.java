package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import com.indeed.android.profile.screens.sheets.profilesubtab.certifications.a;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.a;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.b;
import defpackage.al4;
import defpackage.bj4;
import defpackage.cs7;
import defpackage.gi4;
import defpackage.gs7;
import defpackage.js7;
import defpackage.ls7;
import defpackage.nn4;
import defpackage.ns7;
import defpackage.os7;
import defpackage.rs7;
import defpackage.sq;
import defpackage.tl4;
import defpackage.ur7;
import defpackage.us7;
import defpackage.vw;
import defpackage.ws7;
import defpackage.xh8;
import defpackage.xs7;
import defpackage.ys7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class wr7 implements vr7, xh8 {
    public static void f(FragmentManager fragmentManager, or7 or7Var, Function2 function2) {
        t7g t7gVar;
        if (or7Var != null) {
            t7gVar = new t7g();
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_IS_BUILD_SUGGESTION", false);
            String str = or7Var.a;
            if (str != null) {
                bundle.putString("KEY_ADDITIONAL_INFORMATION", str);
            }
            t7gVar.setArguments(bundle);
        } else {
            t7gVar = new t7g();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("KEY_IS_BUILD_SUGGESTION", false);
            t7gVar.setArguments(bundle2);
        }
        t7gVar.j0 = function2;
        ((i1g) cr8.p(i1g.class)).a(fragmentManager, t7gVar);
    }

    public static void g(FragmentManager fragmentManager, boolean z, pr7 pr7Var, Function2 function2) {
        fd fdVar;
        if (z) {
            fdVar = new fd();
            String str = pr7Var != null ? pr7Var.a : null;
            String str2 = pr7Var != null ? pr7Var.c : null;
            rr7 rr7Var = pr7Var != null ? pr7Var.b : null;
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_IS_BUILD_SUGGESTION", true);
            if (str != null) {
                bundle.putString("KEY_TITLE", str);
            }
            if (str2 != null) {
                bundle.putString("KEY_DESCRIPTION", str2);
            }
            if (rr7Var != null) {
                ds7 ds7Var = rr7Var.a;
                bundle.putString("KEY_MONTH_NAME", ds7Var != null ? ds7Var.name() : null);
                Integer num = rr7Var.b;
                if (num != null) {
                    bundle.putInt("KEY_YEAR", num.intValue());
                }
            }
            fdVar.setArguments(bundle);
        } else {
            fdVar = new fd();
        }
        if (function2 != null) {
            fdVar.j0 = function2;
        }
        ((i1g) cr8.p(i1g.class)).a(fragmentManager, fdVar);
    }

    public static void h(FragmentManager fragmentManager, boolean z, zr7 zr7Var, Function2 function2) {
        nr nrVar;
        if (z) {
            nrVar = new nr();
            String str = zr7Var != null ? zr7Var.a : null;
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_IS_BUILD_SUGGESTION", true);
            if (str != null) {
                bundle.putString("KEY_URL", str);
            }
            nrVar.setArguments(bundle);
        } else {
            nrVar = new nr();
        }
        if (function2 != null) {
            nrVar.h0 = function2;
        }
        ((i1g) cr8.p(i1g.class)).a(fragmentManager, nrVar);
    }

    public static void i(FragmentManager fragmentManager, boolean z, bs7 bs7Var, Function2 function2) {
        sr srVar;
        ds7 ds7Var;
        Integer num;
        ds7 ds7Var2;
        Integer num2;
        if (z) {
            srVar = new sr();
            String strName = null;
            String str = bs7Var != null ? bs7Var.a : null;
            String str2 = bs7Var != null ? bs7Var.b : null;
            String str3 = bs7Var != null ? bs7Var.c : null;
            sr7 sr7Var = bs7Var != null ? bs7Var.d : null;
            String str4 = bs7Var != null ? bs7Var.e : null;
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_IS_BUILD_SUGGESTION", true);
            if (str != null) {
                bundle.putString("KEY_COUNTRY_OF_SERVICE", str);
            }
            if (str2 != null) {
                bundle.putString("KEY_BRANCH", str2);
            }
            if (str3 != null) {
                bundle.putString("KEY_RANK", str3);
            }
            if (str4 != null) {
                bundle.putString("KEY_DESCRIPTION", str4);
            }
            if (sr7Var != null) {
                rr7 rr7Var = sr7Var.c;
                rr7 rr7Var2 = sr7Var.a;
                if (rr7Var2 != null && (num2 = rr7Var2.b) != null) {
                    bundle.putInt("KEY_FROM_YEAR", num2.intValue());
                }
                bundle.putString("KEY_FROM_MONTH_NAME", (rr7Var2 == null || (ds7Var2 = rr7Var2.a) == null) ? null : ds7Var2.name());
                Boolean bool = sr7Var.b;
                if (bool != null) {
                    bundle.putBoolean("KEY_IS_CURRENT", bool.booleanValue());
                }
                if (rr7Var != null && (num = rr7Var.b) != null) {
                    bundle.putInt("KEY_TO_YEAR", num.intValue());
                }
                if (rr7Var != null && (ds7Var = rr7Var.a) != null) {
                    strName = ds7Var.name();
                }
                bundle.putString("KEY_TO_MONTH_NAME", strName);
            }
            srVar.setArguments(bundle);
        } else {
            srVar = new sr();
        }
        if (function2 != null) {
            srVar.h0 = function2;
        }
        ((i1g) cr8.p(i1g.class)).a(fragmentManager, srVar);
    }

    public static void j(FragmentManager fragmentManager, ss7 ss7Var, Function2 function2) {
        igg iggVar;
        if (ss7Var != null) {
            iggVar = new igg();
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_IS_BUILD_SUGGESTION", false);
            String str = ss7Var.a;
            if (str != null) {
                bundle.putString("KEY_SUMMARY", str);
            }
            iggVar.setArguments(bundle);
        } else {
            iggVar = new igg();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("KEY_IS_BUILD_SUGGESTION", false);
            iggVar.setArguments(bundle2);
        }
        iggVar.i0 = function2;
        ((i1g) cr8.p(i1g.class)).a(fragmentManager, iggVar);
    }

    @Override // defpackage.vr7
    public final void a(FragmentManager fragmentManager, gs7 gs7Var) {
        g1h g1hVar;
        f4h f4hVar;
        d1d d1dVar;
        String str;
        izc izcVar;
        qlb qlbVar;
        j3h j3hVar;
        t78 t78Var;
        h78 h78Var;
        fragmentManager.getClass();
        gs7Var.getClass();
        if (gs7Var instanceof gs7.c) {
            gs7.c cVar = (gs7.c) gs7Var;
            is7 is7Var = cVar.a;
            Function2<hs7, is7, j6g> function2 = cVar.b;
            if (is7Var == null) {
                h78Var = new h78();
            } else {
                h78 h78Var2 = new h78();
                String[] strArr = (String[]) is7Var.a.toArray(new String[0]);
                if (strArr.length != 0) {
                    Bundle bundle = new Bundle();
                    bundle.putStringArray("KEY_JOB_TITLES", strArr);
                    h78Var2.setArguments(bundle);
                }
                h78Var = h78Var2;
            }
            if (function2 != null) {
                h78Var.i0 = function2;
            }
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, h78Var);
            return;
        }
        if (gs7Var instanceof gs7.d) {
            gs7.d dVar = (gs7.d) gs7Var;
            js7 js7Var = dVar.a;
            Function2<hs7, js7, j6g> function22 = dVar.b;
            if (js7Var == null) {
                t78Var = new t78();
            } else {
                t78 t78Var2 = new t78();
                Set<js7.a> set = js7Var.a;
                ArrayList arrayList = new ArrayList(t92.r0(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((js7.a) it.next()).name());
                }
                String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                if (strArr2.length != 0) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putStringArray("KEY_JOB_TYPES_SET", strArr2);
                    t78Var2.setArguments(bundle2);
                }
                t78Var = t78Var2;
            }
            if (function22 != null) {
                t78Var.h0 = function22;
            }
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, t78Var);
            return;
        }
        if (gs7Var instanceof gs7.h) {
            gs7.h hVar = (gs7.h) gs7Var;
            ws7 ws7Var = hVar.a;
            Function2<hs7, ws7, j6g> function23 = hVar.b;
            if (ws7Var == null) {
                j3hVar = new j3h();
            } else {
                j3h j3hVar2 = new j3h();
                Bundle bundle3 = new Bundle();
                Set<ws7.a> set2 = ws7Var.a;
                if (set2 != null) {
                    Set<ws7.a> set3 = set2;
                    ArrayList arrayList2 = new ArrayList(t92.r0(set3, 10));
                    Iterator<T> it2 = set3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((ws7.a) it2.next()).name());
                    }
                    String[] strArr3 = (String[]) arrayList2.toArray(new String[0]);
                    if (strArr3 != null) {
                        bundle3.putStringArray("KEY_DAYS_SET", strArr3);
                    }
                }
                Set<ws7.c> set4 = ws7Var.b;
                if (set4 != null) {
                    Set<ws7.c> set5 = set4;
                    ArrayList arrayList3 = new ArrayList(t92.r0(set5, 10));
                    Iterator<T> it3 = set5.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((ws7.c) it3.next()).name());
                    }
                    String[] strArr4 = (String[]) arrayList3.toArray(new String[0]);
                    if (strArr4 != null) {
                        bundle3.putStringArray("KEY_SHIFTS_SET", strArr4);
                    }
                }
                Set<ws7.b> set6 = ws7Var.c;
                if (set6 != null) {
                    Set<ws7.b> set7 = set6;
                    ArrayList arrayList4 = new ArrayList(t92.r0(set7, 10));
                    Iterator<T> it4 = set7.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((ws7.b) it4.next()).name());
                    }
                    String[] strArr5 = (String[]) arrayList4.toArray(new String[0]);
                    if (strArr5 != null) {
                        bundle3.putStringArray("KEY_SCHEDULES_SET", strArr5);
                    }
                }
                j3hVar2.setArguments(bundle3);
                j3hVar = j3hVar2;
            }
            if (function23 != null) {
                j3hVar.h0 = function23;
            }
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, j3hVar);
            return;
        }
        if (gs7Var instanceof gs7.b) {
            gs7.b bVar = (gs7.b) gs7Var;
            cs7 cs7Var = bVar.a;
            Function2<hs7, cs7, j6g> function24 = bVar.b;
            if (cs7Var == null) {
                qlbVar = new qlb();
            } else {
                qlb qlbVar2 = new qlb();
                Double d = cs7Var.a;
                String str2 = cs7Var.b;
                cs7.a aVar = cs7Var.c;
                if (d != null || str2 != null || aVar != null) {
                    Bundle bundle4 = new Bundle();
                    if (d != null) {
                        bundle4.putDouble("KEY_AMOUNT", d.doubleValue());
                    }
                    if (str2 != null) {
                        bundle4.putString("KEY_CURRENCY", str2);
                    }
                    if (aVar != null) {
                        bundle4.putString("KEY_PAY_PERIOD", aVar.name());
                    }
                    qlbVar2.setArguments(bundle4);
                }
                qlbVar = qlbVar2;
            }
            if (function24 != null) {
                qlbVar.g0 = function24;
            }
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, qlbVar);
            return;
        }
        if (gs7Var instanceof gs7.e) {
            gs7.e eVar = (gs7.e) gs7Var;
            ls7 ls7Var = eVar.a;
            Function2<hs7, ls7, j6g> function25 = eVar.b;
            if (ls7Var == null) {
                izcVar = new izc();
            } else {
                izc izcVar2 = new izc();
                List<String> list = ls7Var.a;
                ls7.a aVar2 = ls7Var.b;
                List<String> list2 = list;
                if ((list2 != null && !list2.isEmpty()) || aVar2 != null) {
                    Bundle bundle5 = new Bundle();
                    if (list2 != null && !list2.isEmpty()) {
                        bundle5.putStringArray("KEY_LOCATIONS_LIST", (String[]) list2.toArray(new String[0]));
                    }
                    if (aVar2 != null) {
                        bundle5.putString("KEY_RELOCATION_VALUE", aVar2.name());
                    }
                    izcVar2.setArguments(bundle5);
                }
                izcVar = izcVar2;
            }
            if (function25 != null) {
                izcVar.i0 = function25;
            }
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, izcVar);
            return;
        }
        if (gs7Var instanceof gs7.f) {
            gs7.f fVar = (gs7.f) gs7Var;
            xs7 xs7Var = fVar.a;
            Function2<hs7, xs7, j6g> function26 = fVar.b;
            if (xs7Var == null) {
                d1dVar = new d1d();
            } else {
                d1d d1dVar2 = new d1d();
                Set<xs7.a> set8 = xs7Var.a;
                if (set8 != null) {
                    Bundle bundle6 = new Bundle();
                    Set<xs7.a> set9 = set8;
                    ArrayList arrayList5 = new ArrayList(t92.r0(set9, 10));
                    for (xs7.a aVar3 : set9) {
                        aVar3.getClass();
                        int iOrdinal = aVar3.ordinal();
                        if (iOrdinal == 0) {
                            str = "DSQF7";
                        } else if (iOrdinal == 1) {
                            str = "PAXZC";
                        } else {
                            if (iOrdinal != 2) {
                                l.g();
                                return;
                            }
                            str = "SWG7T";
                        }
                        arrayList5.add(str);
                    }
                    bundle6.putStringArray("KEY_SELECTED_SUIDS", (String[]) arrayList5.toArray(new String[0]));
                    d1dVar2.setArguments(bundle6);
                }
                d1dVar = d1dVar2;
            }
            if (function26 != null) {
                d1dVar.h0 = function26;
            }
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, d1dVar);
            return;
        }
        if (gs7Var instanceof gs7.i) {
            gs7.i iVar = (gs7.i) gs7Var;
            ys7 ys7Var = iVar.a;
            Function2<hs7, ys7, j6g> function27 = iVar.b;
            if (ys7Var == null) {
                f4hVar = new f4h();
            } else {
                f4h f4hVar2 = new f4h();
                Set<ys7.a> set10 = ys7Var.a;
                if (set10 != null) {
                    Bundle bundle7 = new Bundle();
                    Set<ys7.a> set11 = set10;
                    ArrayList arrayList6 = new ArrayList(t92.r0(set11, 10));
                    Iterator<T> it5 = set11.iterator();
                    while (it5.hasNext()) {
                        arrayList6.add(((ys7.a) it5.next()).a);
                    }
                    bundle7.putStringArray("KEY_SELECTED_SUIDS", (String[]) arrayList6.toArray(new String[0]));
                    f4hVar2.setArguments(bundle7);
                }
                f4hVar = f4hVar2;
            }
            if (function27 != null) {
                f4hVar.h0 = function27;
            }
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, f4hVar);
            return;
        }
        if (!(gs7Var instanceof gs7.g)) {
            if (!(gs7Var instanceof gs7.a)) {
                l.g();
                return;
            }
            gs7.a aVar4 = (gs7.a) gs7Var;
            as7 as7Var = aVar4.a;
            Function2<hs7, as7, j6g> function28 = aVar4.b;
            Integer num = as7Var != null ? as7Var.a : null;
            nf9 nf9Var = new nf9();
            if (num != null) {
                Bundle bundle8 = new Bundle();
                bundle8.putInt("KEY_SELECTED_TIME_MINUTES", num.intValue());
                nf9Var.setArguments(bundle8);
            }
            if (function28 != null) {
                nf9Var.h0 = function28;
            }
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, nf9Var);
            return;
        }
        gs7.g gVar = (gs7.g) gs7Var;
        us7 us7Var = gVar.a;
        Function2<hs7, us7, j6g> function29 = gVar.b;
        if (us7Var == null) {
            g1hVar = new g1h();
        } else {
            g1h g1hVar2 = new g1h();
            Set<us7.a> set12 = us7Var.a;
            if (set12 != null) {
                Bundle bundle9 = new Bundle();
                Set<us7.a> set13 = set12;
                ArrayList arrayList7 = new ArrayList(t92.r0(set13, 10));
                Iterator<T> it6 = set13.iterator();
                while (it6.hasNext()) {
                    arrayList7.add(((us7.a) it6.next()).a);
                }
                bundle9.putStringArray("KEY_SELECTED_SUIDS", (String[]) arrayList7.toArray(new String[0]));
                g1hVar2.setArguments(bundle9);
            }
            g1hVar = g1hVar2;
        }
        if (function29 != null) {
            g1hVar.g0 = function29;
        }
        ((i1g) cr8.p(i1g.class)).a(fragmentManager, g1hVar);
    }

    @Override // defpackage.vr7
    public final void b(FragmentManager fragmentManager, os7 os7Var, ur7 ur7Var) {
        String str;
        String str2;
        fragmentManager.getClass();
        os7Var.getClass();
        ur7Var.getClass();
        if (os7Var instanceof os7.g) {
            os7.g gVar = (os7.g) os7Var;
            ss7 ss7Var = gVar.a;
            Function2<ps7, ss7, j6g> function2 = gVar.b;
            if (ur7Var instanceof ur7.c) {
                j(fragmentManager, ss7Var, function2);
                return;
            }
            if (ur7Var.equals(ur7.a.a)) {
                j(fragmentManager, ss7Var, function2);
                return;
            }
            if (!ur7Var.equals(ur7.b.a)) {
                l.g();
                return;
            }
            igg iggVar = new igg();
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_IS_BUILD_SUGGESTION", true);
            if (ss7Var != null && (str2 = ss7Var.a) != null) {
                bundle.putString("KEY_SUMMARY", str2);
            }
            iggVar.setArguments(bundle);
            iggVar.i0 = function2;
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, iggVar);
            return;
        }
        if (os7Var instanceof os7.c) {
            Function2<ps7, fs7, j6g> function22 = ((os7.c) os7Var).a;
            if (!(ur7Var instanceof ur7.c) && !ur7Var.equals(ur7.a.a) && !ur7Var.equals(ur7.b.a)) {
                l.g();
                return;
            }
            gr2 gr2Var = new gr2();
            if (function22 != null) {
                gr2Var.a = function22;
            }
            ((i1g) cr8.p(i1g.class)).e(fragmentManager, gr2Var);
            return;
        }
        if (os7Var instanceof os7.d) {
            os7.d dVar = (os7.d) os7Var;
            qs7 qs7Var = dVar.a;
            Function2<ps7, qs7, j6g> function23 = dVar.b;
            if (ur7Var instanceof ur7.c) {
                a aVarA = a.C0177a.a(((ur7.c) ur7Var).a, false, qs7Var);
                if (function23 != null) {
                    aVarA.k0 = function23;
                }
                ((i1g) cr8.p(i1g.class)).a(fragmentManager, aVarA);
                return;
            }
            if (ur7Var.equals(ur7.a.a)) {
                vw vwVarA = vw.a.a(qs7Var, false);
                if (function23 != null) {
                    vwVarA.j0 = function23;
                }
                ((i1g) cr8.p(i1g.class)).a(fragmentManager, vwVarA);
                return;
            }
            if (!ur7Var.equals(ur7.b.a)) {
                l.g();
                return;
            }
            vw vwVarA2 = vw.a.a(qs7Var, true);
            if (function23 != null) {
                vwVarA2.j0 = function23;
            }
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, vwVarA2);
            return;
        }
        if (os7Var instanceof os7.f) {
            os7.f fVar = (os7.f) os7Var;
            List<qs7> list = fVar.a;
            Function2<ps7, List<qs7>, j6g> function24 = fVar.b;
            if (ur7Var instanceof ur7.c) {
                b bVarA = b.a.a(list, false, false, false, null, 24);
                if (function24 != null) {
                    bVarA.l0 = function24;
                }
                ((i1g) cr8.p(i1g.class)).a(fragmentManager, bVarA);
                return;
            }
            if (ur7Var.equals(ur7.a.a)) {
                b0.u("Add mode is not supported for skills");
                return;
            }
            if (!ur7Var.equals(ur7.b.a)) {
                l.g();
                return;
            }
            b bVarA2 = b.a.a(list, false, true, false, null, 24);
            if (function24 != null) {
                bVarA2.l0 = function24;
            }
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, bVarA2);
            return;
        }
        if (os7Var instanceof os7.e) {
            os7.e eVar = (os7.e) os7Var;
            String str3 = eVar.a;
            fq0 fq0Var = eVar.b;
            b bVarA3 = b.a.a(null, false, false, str3 != null, str3, 1);
            if (fq0Var != null) {
                bVarA3.l0 = fq0Var;
            }
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, bVarA3);
            return;
        }
        if (os7Var instanceof os7.a) {
            os7.a aVar = (os7.a) os7Var;
            or7 or7Var = aVar.a;
            Function2<ps7, or7, j6g> function25 = aVar.b;
            if (ur7Var instanceof ur7.c) {
                f(fragmentManager, or7Var, function25);
                return;
            }
            if (ur7Var.equals(ur7.a.a)) {
                f(fragmentManager, or7Var, function25);
                return;
            }
            if (!ur7Var.equals(ur7.b.a)) {
                l.g();
                return;
            }
            t7g t7gVar = new t7g();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("KEY_IS_BUILD_SUGGESTION", true);
            if (or7Var != null && (str = or7Var.a) != null) {
                bundle2.putString("KEY_ADDITIONAL_INFORMATION", str);
            }
            t7gVar.setArguments(bundle2);
            t7gVar.j0 = function25;
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, t7gVar);
            return;
        }
        if (!(os7Var instanceof os7.b)) {
            l.g();
            return;
        }
        os7.b bVar = (os7.b) os7Var;
        yr7 yr7Var = bVar.a;
        Function2<ps7, yr7, j6g> function26 = bVar.b;
        if (!(ur7Var instanceof ur7.c)) {
            if (ur7Var.equals(ur7.a.a)) {
                sq sqVarA = sq.a.a(yr7Var, false);
                if (function26 != null) {
                    sqVarA.j0 = function26;
                }
                ((i1g) cr8.p(i1g.class)).a(fragmentManager, sqVarA);
                return;
            }
            if (!ur7Var.equals(ur7.b.a)) {
                l.g();
                return;
            }
            sq sqVarA2 = sq.a.a(yr7Var, true);
            if (function26 != null) {
                sqVarA2.j0 = function26;
            }
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, sqVarA2);
            return;
        }
        String str4 = ((ur7.c) ur7Var).a;
        cj4 cj4Var = new cj4();
        Bundle bundle3 = new Bundle();
        if (str4 != null) {
            bundle3.putString("KEY_LAST_LANGUAGE_SELECTED", str4);
        }
        if ((yr7Var != null ? yr7Var.b : null) != null) {
            bundle3.putString("KEY_LANGUAGE", yr7Var.b);
        }
        if ((yr7Var != null ? yr7Var.c : null) != null) {
            bundle3.putString("KEY_LANGUAGE_TAXONOMY_ID", yr7Var.c);
        }
        if ((yr7Var != null ? yr7Var.d : null) != null) {
            bundle3.putString("KEY_PROFICIENCY", yr7Var.d);
        }
        if ((yr7Var != null ? yr7Var.e : null) != null) {
            bundle3.putString("KEY_PROFICIENCY_TAXONOMY_ID", yr7Var.e);
        }
        cj4Var.setArguments(bundle3);
        if (function26 != null) {
            cj4Var.j0 = function26;
        }
        ((i1g) cr8.p(i1g.class)).a(fragmentManager, cj4Var);
    }

    @Override // defpackage.vr7
    public final void c(lr5 lr5Var, rs7 rs7Var, ur7 ur7Var) {
        ur7Var.getClass();
        boolean z = ur7Var instanceof ur7.c;
        if (z) {
            List<Fragment> listF = lr5Var.c.f();
            listF.getClass();
            Fragment fragment = (Fragment) z92.Q0(listF);
            yvb yvbVar = null;
            g activity = fragment != null ? fragment.getActivity() : null;
            if (activity == null) {
                activity = null;
            }
            if (activity != null) {
                bxb bxbVar = new bxb(new zcd());
                irg viewModelStore = activity.getViewModelStore();
                p63 defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
                hrg hrgVar = new hrg(viewModelStore, bxbVar, defaultViewModelCreationExtras);
                yd8 yd8VarB = fwc.a.b(yvb.class);
                String strP = yd8VarB.p();
                if (strP == null) {
                    l5.q("Local and anonymous classes can not be ViewModels");
                    return;
                }
                yvbVar = (yvb) hrgVar.a(yd8VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP));
            }
            if (yvbVar != null) {
                yvbVar.K(((ur7.c) ur7Var).a);
            }
        }
        if (rs7Var instanceof rs7.c) {
            if (ur7Var instanceof ur7.a) {
                dt dtVar = new dt();
                Function1<ps7, j6g> function1 = ((rs7.c) rs7Var).a;
                if (function1 != null) {
                    dtVar.i0 = function1;
                }
                ((i1g) cr8.p(i1g.class)).a(lr5Var, dtVar);
                return;
            }
            if (z) {
                lk4 lk4Var = new lk4();
                Function1<ps7, j6g> function12 = ((rs7.c) rs7Var).a;
                if (function12 != null) {
                    lk4Var.i0 = function12;
                }
                ((i1g) cr8.p(i1g.class)).a(lr5Var, lk4Var);
                return;
            }
            return;
        }
        if (rs7Var instanceof rs7.a) {
            if (ur7Var instanceof ur7.a) {
                ra raVar = new ra();
                Function1<ps7, j6g> function13 = ((rs7.a) rs7Var).a;
                if (function13 != null) {
                    raVar.j0 = function13;
                }
                ((i1g) cr8.p(i1g.class)).a(lr5Var, raVar);
                return;
            }
            if (z) {
                of4 of4Var = new of4();
                Function1<ps7, j6g> function14 = ((rs7.a) rs7Var).a;
                if (function14 != null) {
                    of4Var.j0 = function14;
                }
                ((i1g) cr8.p(i1g.class)).a(lr5Var, of4Var);
                return;
            }
            return;
        }
        if (!(rs7Var instanceof rs7.b)) {
            l.g();
            return;
        }
        if (ur7Var instanceof ur7.a) {
            jg jgVar = new jg();
            Function1<ps7, j6g> function15 = ((rs7.b) rs7Var).a;
            if (function15 != null) {
                jgVar.i0 = function15;
            }
            ((i1g) cr8.p(i1g.class)).a(lr5Var, jgVar);
            return;
        }
        if (z) {
            rh4 rh4Var = new rh4();
            Function1<ps7, j6g> function16 = ((rs7.b) rs7Var).a;
            if (function16 != null) {
                rh4Var.i0 = function16;
            }
            ((i1g) cr8.p(i1g.class)).a(lr5Var, rh4Var);
        }
    }

    @Override // defpackage.vr7
    public final void e(FragmentManager fragmentManager, String str, ns7 ns7Var, ur7 ur7Var) {
        ds7 ds7Var;
        Integer num;
        ds7 ds7Var2;
        Integer num2;
        ds7 ds7Var3;
        Integer num3;
        ds7 ds7Var4;
        Integer num4;
        ds7 ds7Var5;
        Integer num5;
        nn4 nn4Var;
        fragmentManager.getClass();
        ns7Var.getClass();
        ur7Var.getClass();
        if (ns7Var instanceof ns7.i) {
            ns7.i iVar = (ns7.i) ns7Var;
            vs7 vs7Var = iVar.a;
            Function2<ps7, vs7, j6g> function2 = iVar.b;
            if (ur7Var instanceof ur7.c) {
                String str2 = ((ur7.c) ur7Var).a;
                if (vs7Var != null) {
                    str2.getClass();
                    nn4Var = new nn4();
                    Bundle bundle = new Bundle();
                    bundle.putString("id", str2);
                    nn4.a.a(vs7Var, bundle);
                    nn4Var.setArguments(bundle);
                } else {
                    str2.getClass();
                    nn4Var = new nn4();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("id", str2);
                    nn4Var.setArguments(bundle2);
                }
                nn4Var.l0 = function2;
                ((i1g) cr8.p(i1g.class)).a(fragmentManager, nn4Var);
                return;
            }
            if (ur7Var.equals(ur7.a.a)) {
                gy gyVar = new gy();
                gyVar.k0 = function2;
                ((i1g) cr8.p(i1g.class)).a(fragmentManager, gyVar);
                return;
            } else {
                if (!ur7Var.equals(ur7.b.a)) {
                    l.g();
                    return;
                }
                nn4 nn4Var2 = new nn4();
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("KEY_IS_BUILD_SUGGESTION", true);
                if (vs7Var != null) {
                    nn4.a.a(vs7Var, bundle3);
                }
                nn4Var2.setArguments(bundle3);
                nn4Var2.l0 = function2;
                ((i1g) cr8.p(i1g.class)).a(fragmentManager, nn4Var2);
                return;
            }
        }
        if (ns7Var instanceof ns7.c) {
            if (ur7Var instanceof ur7.c) {
                ns7.c cVar = (ns7.c) ns7Var;
                tr7 tr7Var = cVar.a;
                Function2<ps7, tr7, j6g> function22 = cVar.b;
                String str3 = ((ur7.c) ur7Var).a;
                str3.getClass();
                gi4 gi4Var = new gi4();
                Bundle bundleE = l6.e("KEY_EDUCATION_ID", str3);
                if (tr7Var != null) {
                    gi4.a.a(tr7Var, bundleE);
                }
                gi4Var.setArguments(bundleE);
                if (function22 != null) {
                    gi4Var.g0 = function22;
                }
                ((i1g) cr8.p(i1g.class)).a(fragmentManager, gi4Var);
                return;
            }
            if (ur7Var instanceof ur7.a) {
                Function2<ps7, tr7, j6g> function23 = ((ns7.c) ns7Var).b;
                bi biVar = new bi();
                if (function23 != null) {
                    biVar.h0 = function23;
                }
                ((i1g) cr8.p(i1g.class)).a(fragmentManager, biVar);
                return;
            }
            if (!(ur7Var instanceof ur7.b)) {
                l.g();
                return;
            }
            ns7.c cVar2 = (ns7.c) ns7Var;
            tr7 tr7Var2 = cVar2.a;
            Function2<ps7, tr7, j6g> function24 = cVar2.b;
            gi4 gi4Var2 = new gi4();
            Bundle bundle4 = new Bundle();
            bundle4.putBoolean("KEY_IS_BUILD_SUGGESTION", true);
            if (tr7Var2 != null) {
                gi4.a.a(tr7Var2, bundle4);
            }
            gi4Var2.setArguments(bundle4);
            gi4Var2.g0 = function24;
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, gi4Var2);
            return;
        }
        if (ns7Var instanceof ns7.b) {
            ns7.b bVar = (ns7.b) ns7Var;
            qr7 qr7Var = bVar.a;
            Function2<ps7, qr7, j6g> function25 = bVar.b;
            if (ur7Var instanceof ur7.c) {
                String str4 = ((ur7.c) ur7Var).a;
                str4.getClass();
                com.indeed.android.profile.screens.sheets.profilesubtab.certifications.a aVar = new com.indeed.android.profile.screens.sheets.profilesubtab.certifications.a();
                Bundle bundleE2 = l6.e("id", str4);
                if (qr7Var != null) {
                    a.C0174a.a(qr7Var, bundleE2);
                }
                aVar.setArguments(bundleE2);
                aVar.j0 = function25;
                ((i1g) cr8.p(i1g.class)).a(fragmentManager, aVar);
                return;
            }
            if (ur7Var.equals(ur7.a.a)) {
                re reVar = new re();
                reVar.j0 = function25;
                ((i1g) cr8.p(i1g.class)).a(fragmentManager, reVar);
                return;
            } else {
                if (!ur7Var.equals(ur7.b.a)) {
                    l.g();
                    return;
                }
                com.indeed.android.profile.screens.sheets.profilesubtab.certifications.a aVar2 = new com.indeed.android.profile.screens.sheets.profilesubtab.certifications.a();
                Bundle bundle5 = new Bundle();
                bundle5.putBoolean("KEY_IS_BUILD_SUGGESTION", true);
                if (qr7Var != null) {
                    a.C0174a.a(qr7Var, bundle5);
                }
                aVar2.setArguments(bundle5);
                aVar2.j0 = function25;
                ((i1g) cr8.p(i1g.class)).a(fragmentManager, aVar2);
                return;
            }
        }
        if (ns7Var instanceof ns7.a) {
            ns7.a aVar3 = (ns7.a) ns7Var;
            pr7 pr7Var = aVar3.a;
            Function2<ps7, pr7, j6g> function26 = aVar3.b;
            if (!(ur7Var instanceof ur7.c)) {
                if (ur7Var instanceof ur7.a) {
                    g(fragmentManager, false, null, function26);
                    return;
                } else if (ur7Var instanceof ur7.b) {
                    g(fragmentManager, true, pr7Var, function26);
                    return;
                } else {
                    l.g();
                    return;
                }
            }
            String str5 = ((ur7.c) ur7Var).a;
            str5.getClass();
            com.indeed.android.profile.screens.sheets.profilesubtab.award.a aVar4 = new com.indeed.android.profile.screens.sheets.profilesubtab.award.a();
            String str6 = pr7Var != null ? pr7Var.a : null;
            String str7 = pr7Var != null ? pr7Var.c : null;
            rr7 rr7Var = pr7Var != null ? pr7Var.b : null;
            Bundle bundleE3 = l6.e("KEY_AWARD_ID", str5);
            if (str6 != null) {
                bundleE3.putString("KEY_TITLE", str6);
            }
            if (str7 != null) {
                bundleE3.putString("KEY_DESCRIPTION", str7);
            }
            if (rr7Var != null) {
                ds7 ds7Var6 = rr7Var.a;
                bundleE3.putString("KEY_MONTH_NAME", ds7Var6 != null ? ds7Var6.name() : null);
                Integer num6 = rr7Var.b;
                if (num6 != null) {
                    bundleE3.putInt("KEY_YEAR", num6.intValue());
                }
            }
            aVar4.setArguments(bundleE3);
            if (function26 != null) {
                aVar4.i0 = function26;
            }
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, aVar4);
            return;
        }
        if (ns7Var instanceof ns7.e) {
            ns7.e eVar = (ns7.e) ns7Var;
            zr7 zr7Var = eVar.a;
            Function2<ps7, zr7, j6g> function27 = eVar.b;
            if (!(ur7Var instanceof ur7.c)) {
                if (ur7Var instanceof ur7.a) {
                    h(fragmentManager, false, null, function27);
                    return;
                } else if (ur7Var instanceof ur7.b) {
                    h(fragmentManager, true, zr7Var, function27);
                    return;
                } else {
                    l.g();
                    return;
                }
            }
            String str8 = ((ur7.c) ur7Var).a;
            str8.getClass();
            com.indeed.android.profile.screens.sheets.profilesubtab.links.a aVar5 = new com.indeed.android.profile.screens.sheets.profilesubtab.links.a();
            strName = zr7Var != null ? zr7Var.a : null;
            Bundle bundleE4 = l6.e("KEY_LINK_ID", str8);
            if (strName != null) {
                bundleE4.putString("KEY_URL", strName);
            }
            aVar5.setArguments(bundleE4);
            if (function27 != null) {
                aVar5.g0 = function27;
            }
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, aVar5);
            return;
        }
        if (ns7Var instanceof ns7.d) {
            ns7.d dVar = (ns7.d) ns7Var;
            xr7 xr7Var = dVar.a;
            Function2<ps7, xr7, j6g> function28 = dVar.b;
            if (ur7Var instanceof ur7.a) {
                rj rjVar = new rj();
                rjVar.i0 = function28;
                ((i1g) cr8.p(i1g.class)).a(fragmentManager, rjVar);
                return;
            }
            if (ur7Var instanceof ur7.c) {
                String str9 = ((ur7.c) ur7Var).a;
                bj4 bj4VarA = xr7Var != null ? bj4.a.a(xr7Var, str9) : bj4.a.a(null, str9);
                bj4VarA.i0 = function28;
                ((i1g) cr8.p(i1g.class)).a(fragmentManager, bj4VarA);
                return;
            }
            if (!(ur7Var instanceof ur7.b)) {
                l.g();
                return;
            }
            rj rjVar2 = new rj();
            Bundle bundle6 = new Bundle();
            bundle6.putBoolean("KEY_IS_BUILD_SUGGESTION", true);
            if (xr7Var != null) {
                String str10 = xr7Var.a;
                if (str10 != null) {
                    bundle6.putString("groupTitle", str10);
                }
                String str11 = xr7Var.c;
                if (str11 != null) {
                    bundle6.putString("groupDescription", str11);
                }
                sr7 sr7Var = xr7Var.b;
                if (sr7Var != null) {
                    rr7 rr7Var2 = sr7Var.c;
                    rr7 rr7Var3 = sr7Var.a;
                    Boolean bool = sr7Var.b;
                    bundle6.putBoolean("groupIsCurrent", bool != null ? bool.booleanValue() : false);
                    if (rr7Var3 != null && (num5 = rr7Var3.b) != null) {
                        bundle6.putInt("groupFromYear", num5.intValue());
                    }
                    if (rr7Var3 != null && (ds7Var5 = rr7Var3.a) != null) {
                        bundle6.putString("groupFromMonth", ds7Var5.name());
                    }
                    if (rr7Var2 != null && (num4 = rr7Var2.b) != null) {
                        bundle6.putInt("groupToYear", num4.intValue());
                    }
                    if (rr7Var2 != null && (ds7Var4 = rr7Var2.a) != null) {
                        bundle6.putString("groupToMonth", ds7Var4.name());
                    }
                }
            }
            rjVar2.setArguments(bundle6);
            rjVar2.i0 = function28;
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, rjVar2);
            return;
        }
        if (ns7Var instanceof ns7.f) {
            if (!(ur7Var instanceof ur7.c)) {
                if (ur7Var instanceof ur7.a) {
                    i(fragmentManager, false, null, ((ns7.f) ns7Var).b);
                    return;
                } else if (!(ur7Var instanceof ur7.b)) {
                    l.g();
                    return;
                } else {
                    ns7.f fVar = (ns7.f) ns7Var;
                    i(fragmentManager, true, fVar.a, fVar.b);
                    return;
                }
            }
            ns7.f fVar2 = (ns7.f) ns7Var;
            bs7 bs7Var = fVar2.a;
            Function2<ps7, bs7, j6g> function29 = fVar2.b;
            String str12 = ((ur7.c) ur7Var).a;
            str12.getClass();
            com.indeed.android.profile.screens.sheets.profilesubtab.militaryservice.a aVar6 = new com.indeed.android.profile.screens.sheets.profilesubtab.militaryservice.a();
            String str13 = bs7Var != null ? bs7Var.a : null;
            String str14 = bs7Var != null ? bs7Var.b : null;
            String str15 = bs7Var != null ? bs7Var.c : null;
            sr7 sr7Var2 = bs7Var != null ? bs7Var.d : null;
            String str16 = bs7Var != null ? bs7Var.e : null;
            Bundle bundleE5 = l6.e("KEY_MILITARY_SERVICE_ID", str12);
            if (str13 != null) {
                bundleE5.putString("KEY_COUNTRY_OF_SERVICE", str13);
            }
            if (str14 != null) {
                bundleE5.putString("KEY_BRANCH", str14);
            }
            if (str15 != null) {
                bundleE5.putString("KEY_RANK", str15);
            }
            if (str16 != null) {
                bundleE5.putString("KEY_DESCRIPTION", str16);
            }
            if (sr7Var2 != null) {
                rr7 rr7Var4 = sr7Var2.c;
                rr7 rr7Var5 = sr7Var2.a;
                if (rr7Var5 != null && (num3 = rr7Var5.b) != null) {
                    bundleE5.putInt("KEY_FROM_YEAR", num3.intValue());
                }
                bundleE5.putString("KEY_FROM_MONTH_NAME", (rr7Var5 == null || (ds7Var3 = rr7Var5.a) == null) ? null : ds7Var3.name());
                Boolean bool2 = sr7Var2.b;
                if (bool2 != null) {
                    bundleE5.putBoolean("KEY_IS_CURRENT", bool2.booleanValue());
                }
                if (rr7Var4 != null && (num2 = rr7Var4.b) != null) {
                    bundleE5.putInt("KEY_TO_YEAR", num2.intValue());
                }
                if (rr7Var4 != null && (ds7Var2 = rr7Var4.a) != null) {
                    strName = ds7Var2.name();
                }
                bundleE5.putString("KEY_TO_MONTH_NAME", strName);
            }
            aVar6.setArguments(bundleE5);
            if (function29 != null) {
                aVar6.g0 = function29;
            }
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, aVar6);
            return;
        }
        if (ns7Var instanceof ns7.g) {
            ns7.g gVar = (ns7.g) ns7Var;
            es7 es7Var = gVar.a;
            Function2<ps7, es7, j6g> function210 = gVar.b;
            if (ur7Var instanceof ur7.a) {
                du duVar = new du();
                duVar.i0 = function210;
                ((i1g) cr8.p(i1g.class)).a(fragmentManager, duVar);
                return;
            }
            if (ur7Var instanceof ur7.c) {
                String str17 = ((ur7.c) ur7Var).a;
                al4 al4VarA = es7Var != null ? al4.a.a(es7Var, str17) : al4.a.a(null, str17);
                al4VarA.i0 = function210;
                ((i1g) cr8.p(i1g.class)).a(fragmentManager, al4VarA);
                return;
            }
            if (!(ur7Var instanceof ur7.b)) {
                l.g();
                return;
            }
            du duVar2 = new du();
            Bundle bundle7 = new Bundle();
            bundle7.putBoolean("KEY_IS_BUILD_SUGGESTION", true);
            if (es7Var != null) {
                rr7 rr7Var6 = es7Var.d;
                String str18 = es7Var.a;
                if (str18 != null) {
                    bundle7.putString("patentTitle", str18);
                }
                String str19 = es7Var.c;
                if (str19 != null) {
                    bundle7.putString("patentUrl", str19);
                }
                String str20 = es7Var.e;
                if (str20 != null) {
                    bundle7.putString("patentDescription", str20);
                }
                String str21 = es7Var.b;
                if (str21 != null) {
                    bundle7.putString("patentNumber", str21);
                }
                Integer num7 = rr7Var6.b;
                if (num7 != null) {
                    bundle7.putInt("patentYear", num7.intValue());
                }
                ds7 ds7Var7 = rr7Var6.a;
                if (ds7Var7 != null) {
                    bundle7.putString("patentMonth", ds7Var7.name());
                }
            }
            duVar2.setArguments(bundle7);
            duVar2.i0 = function210;
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, duVar2);
            return;
        }
        if (!(ns7Var instanceof ns7.h)) {
            l.g();
            return;
        }
        ns7.h hVar = (ns7.h) ns7Var;
        ks7 ks7Var = hVar.a;
        Function2<ps7, ks7, j6g> function211 = hVar.b;
        if (ur7Var instanceof ur7.a) {
            wv wvVar = new wv();
            wvVar.i0 = function211;
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, wvVar);
            return;
        }
        if (ur7Var instanceof ur7.c) {
            String str22 = ((ur7.c) ur7Var).a;
            tl4 tl4VarA = ks7Var != null ? tl4.a.a(ks7Var, str22) : tl4.a.a(null, str22);
            tl4VarA.i0 = function211;
            ((i1g) cr8.p(i1g.class)).a(fragmentManager, tl4VarA);
            return;
        }
        if (!(ur7Var instanceof ur7.b)) {
            l.g();
            return;
        }
        wv wvVar2 = new wv();
        Bundle bundle8 = new Bundle();
        bundle8.putBoolean("KEY_IS_BUILD_SUGGESTION", true);
        if (ks7Var != null) {
            rr7 rr7Var7 = ks7Var.c;
            String str23 = ks7Var.a;
            if (str23 != null) {
                bundle8.putString("publicationTitle", str23);
            }
            String str24 = ks7Var.b;
            if (str24 != null) {
                bundle8.putString("publicationUrl", str24);
            }
            String str25 = ks7Var.d;
            if (str25 != null) {
                bundle8.putString("publicationDescription", str25);
            }
            if (rr7Var7 != null && (num = rr7Var7.b) != null) {
                bundle8.putInt("publicationYear", num.intValue());
            }
            if (rr7Var7 != null && (ds7Var = rr7Var7.a) != null) {
                bundle8.putString("publicationMonth", ds7Var.name());
            }
        }
        wvVar2.setArguments(bundle8);
        wvVar2.i0 = function211;
        ((i1g) cr8.p(i1g.class)).a(fragmentManager, wvVar2);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
