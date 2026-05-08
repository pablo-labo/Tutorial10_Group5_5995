package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.aod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class wnd {
    public static snd a(rn0 rn0Var) {
        String str;
        String str2;
        Object codVar;
        String str3;
        List list;
        String str4;
        String str5;
        List<String> list2;
        rn0Var.getClass();
        String str6 = rn0Var.a;
        String str7 = rn0Var.b;
        boolean z = rn0Var.d;
        List<qn0> list3 = rn0Var.c;
        int i = 10;
        ArrayList arrayList = new ArrayList(t92.r0(list3, 10));
        Iterator<T> it = list3.iterator();
        while (true) {
            if (!it.hasNext()) {
                rn0 rn0Var2 = rn0Var.e;
                return new snd(str6, arrayList, str7, z, rn0Var2 != null ? a(rn0Var2) : null);
            }
            qn0 qn0Var = (qn0) it.next();
            e95 e95Var = qn0Var.e;
            lp5 lp5Var = qn0Var.s;
            String str8 = "";
            switch (e95Var.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case DatadogLogGenerator.CRASH /* 9 */:
                case 10:
                case 11:
                case 12:
                case 13:
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    String str9 = qn0Var.h;
                    String str10 = str9 == null ? "" : str9;
                    if (lp5Var == null || (str = lp5Var.e) == null) {
                        str = "";
                    }
                    if (lp5Var == null || (str2 = lp5Var.c) == null) {
                        str2 = "";
                    }
                    if (lp5Var != null && (str3 = lp5Var.d) != null) {
                        str8 = str3;
                    }
                    codVar = new cod(str10, new dod(str, str2, str8, c(lp5Var != null ? lp5Var.g : null)), qn0Var.a, qn0Var.c, qn0Var.e, qn0Var.f, qn0Var.g, qn0Var.i, qn0Var.j, qn0Var.k);
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 15:
                    List<gva> list4 = qn0Var.r;
                    List<String> list5 = zr4.a;
                    if (list4 != null) {
                        List<gva> list6 = list4;
                        ArrayList arrayList2 = new ArrayList(t92.r0(list6, i));
                        for (gva gvaVar : list6) {
                            arrayList2.add(new tnd(gvaVar.a, gvaVar.b));
                        }
                        list = arrayList2;
                    } else {
                        list = list5;
                    }
                    if (lp5Var != null && (list2 = lp5Var.f) != null) {
                        list5 = list2;
                    }
                    if (lp5Var == null || (str4 = lp5Var.c) == null) {
                        str4 = "";
                    }
                    if (lp5Var != null && (str5 = lp5Var.d) != null) {
                        str8 = str5;
                    }
                    codVar = new ynd(list, new znd(list5, str4, str8, c(lp5Var != null ? lp5Var.g : null)), qn0Var.a, qn0Var.c, qn0Var.e, qn0Var.f, qn0Var.g, qn0Var.i, qn0Var.j, qn0Var.k);
                    break;
                default:
                    l.g();
                    return null;
            }
            arrayList.add(codVar);
            i = 10;
        }
    }

    public static vnd b(ep0 ep0Var) {
        aod aodVar;
        ep0Var.getClass();
        String str = ep0Var.b;
        co0 co0Var = ep0Var.h;
        String str2 = co0Var.b;
        String str3 = co0Var.e;
        String str4 = co0Var.d;
        String str5 = co0Var.c;
        String str6 = co0Var.g;
        String str7 = co0Var.f;
        String str8 = ep0Var.a;
        o09 o09Var = ep0Var.e;
        o09 o09Var2 = ep0Var.d;
        String str9 = ep0Var.f;
        fo0 fo0Var = ep0Var.c;
        fo0Var.getClass();
        switch (fo0Var.ordinal()) {
            case 0:
                aodVar = aod.a.c;
                break;
            case 1:
                aodVar = aod.g.c;
                break;
            case 2:
                aodVar = aod.e.c;
                break;
            case 3:
                aodVar = aod.c.c;
                break;
            case 4:
                aodVar = aod.h.c;
                break;
            case 5:
                aodVar = aod.d.c;
                break;
            case 6:
                aodVar = aod.i.c;
                break;
            case 7:
                aodVar = aod.b.c;
                break;
            case 8:
                aodVar = aod.f.c;
                break;
            default:
                l.g();
                return null;
        }
        aod aodVar2 = aodVar;
        List<rn0> list = ep0Var.i;
        ArrayList arrayList = new ArrayList(t92.r0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((rn0) it.next()));
        }
        return new vnd(str, str2, str5, str4, str3, str6, str7, str8, o09Var, o09Var2, str9, aodVar2, ep0Var.g, arrayList);
    }

    public static und c(String str) {
        Object lowerCase;
        und.a.getClass();
        Iterator<T> it = und.d.iterator();
        while (true) {
            lowerCase = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String strA = ((und) next).a();
            Locale locale = Locale.ROOT;
            String lowerCase2 = strA.toLowerCase(locale);
            lowerCase2.getClass();
            if (str != null) {
                lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
            }
            if (lowerCase2.equals(lowerCase)) {
                lowerCase = next;
                break;
            }
        }
        und undVar = (und) lowerCase;
        return undVar == null ? und.b : undVar;
    }
}
