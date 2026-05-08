package com.facebook.hermes.intl;

import android.icu.text.RuleBasedCollator;
import com.facebook.hermes.intl.c;
import defpackage.d6g;
import defpackage.f84;
import defpackage.g19;
import defpackage.in6;
import defpackage.pnb;
import defpackage.r;
import defpackage.un6;
import defpackage.vn6;
import defpackage.wn6;
import defpackage.wo7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@f84
public class Collator {
    public final wn6 a;
    public final vn6 b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final un6 f;
    public final in6<?> g;
    public final in6<?> h;
    public final r i;

    @f84
    public Collator(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        this.d = "default";
        r rVar = new r();
        rVar.a = null;
        this.i = rVar;
        String[] strArr = pnb.V;
        Map<String, Object> map2 = map;
        c.a aVar = c.a.b;
        this.a = (wn6) c.c(wn6.class, (String) c.b(map2, "usage", aVar, strArr, "sort"));
        HashMap map3 = new HashMap();
        map3.put("localeMatcher", c.b(map2, "localeMatcher", aVar, pnb.d, "best fit"));
        c.a aVar2 = c.a.a;
        wo7.b bVar = wo7.a;
        Object objB = c.b(map2, "numeric", aVar2, bVar, bVar);
        map3.put("kn", objB instanceof wo7.b ? objB : String.valueOf(((Boolean) objB).booleanValue()));
        map3.put("kf", c.b(map2, "caseFirst", aVar, pnb.f, bVar));
        HashMap mapA = b.a(list, map3, Arrays.asList("co", "kf", "kn"));
        in6<?> in6Var = (in6) mapA.get("locale");
        this.g = in6Var;
        this.h = in6Var.c();
        Object objA = wo7.a(mapA, "co");
        this.d = (String) (objA instanceof wo7.a ? "default" : objA);
        Object objA2 = wo7.a(mapA, "kn");
        if (objA2 instanceof wo7.a) {
            this.e = false;
        } else {
            this.e = Boolean.parseBoolean((String) objA2);
        }
        String strA = wo7.a(mapA, "kf");
        this.f = (un6) c.c(un6.class, (String) (strA instanceof wo7.a ? "false" : strA));
        if (this.a == wn6.b) {
            ArrayList arrayListA = this.g.a();
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                arrayList.add(d6g.b((String) it.next()));
            }
            arrayList.add(d6g.b("search"));
            this.g.d("co", arrayList);
        }
        Object objB2 = c.b(map2, "sensitivity", aVar, pnb.e, bVar);
        if (!(objB2 instanceof wo7.b)) {
            this.b = (vn6) c.c(vn6.class, (String) objB2);
        } else if (this.a == wn6.a) {
            this.b = vn6.d;
        } else {
            this.b = vn6.e;
        }
        this.c = ((Boolean) c.b(map2, "ignorePunctuation", aVar2, bVar, Boolean.FALSE)).booleanValue();
        r rVar2 = this.i;
        g19 g19Var = (g19) this.g;
        g19Var.f();
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) android.icu.text.Collator.getInstance(g19Var.a);
        rVar2.a = ruleBasedCollator;
        ruleBasedCollator.setDecomposition(17);
        if (this.e) {
            ((RuleBasedCollator) rVar2.a).setNumericCollation(true);
        }
        int iOrdinal = this.f.ordinal();
        RuleBasedCollator ruleBasedCollator2 = (RuleBasedCollator) rVar2.a;
        if (iOrdinal == 0) {
            ruleBasedCollator2.setUpperCaseFirst(true);
        } else if (iOrdinal != 1) {
            ruleBasedCollator2.setCaseFirstDefault();
        } else {
            ruleBasedCollator2.setLowerCaseFirst(true);
        }
        int iOrdinal2 = this.b.ordinal();
        if (iOrdinal2 == 0) {
            ((RuleBasedCollator) rVar2.a).setStrength(0);
        } else if (iOrdinal2 == 1) {
            ((RuleBasedCollator) rVar2.a).setStrength(1);
        } else if (iOrdinal2 == 2) {
            ((RuleBasedCollator) rVar2.a).setStrength(0);
            ((RuleBasedCollator) rVar2.a).setCaseLevel(true);
        } else if (iOrdinal2 == 3) {
            ((RuleBasedCollator) rVar2.a).setStrength(2);
        }
        if (this.c) {
            ((RuleBasedCollator) rVar2.a).setAlternateHandlingShifted(true);
        }
    }

    @f84
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        return ((String) c.b(map, "localeMatcher", c.a.b, pnb.d, "best fit")).equals("best fit") ? Arrays.asList(a.c((String[]) list.toArray(new String[list.size()]))) : Arrays.asList(a.e((String[]) list.toArray(new String[list.size()])));
    }

    @f84
    public double compare(String str, String str2) {
        return ((RuleBasedCollator) this.i.a).compare(str, str2);
    }

    @f84
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.h.e().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.a.toString());
        vn6 vn6Var = this.b;
        vn6 vn6Var2 = vn6.e;
        if (vn6Var == vn6Var2) {
            r rVar = this.i;
            RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) rVar.a;
            if (ruleBasedCollator != null) {
                int strength = ruleBasedCollator.getStrength();
                vn6Var2 = strength == 0 ? ((RuleBasedCollator) rVar.a).isCaseLevel() ? vn6.c : vn6.a : strength == 1 ? vn6.b : vn6.d;
            }
            linkedHashMap.put("sensitivity", vn6Var2.toString());
        } else {
            linkedHashMap.put("sensitivity", vn6Var.toString());
        }
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.c));
        linkedHashMap.put("collation", this.d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.e));
        linkedHashMap.put("caseFirst", this.f.toString());
        return linkedHashMap;
    }
}
