package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dxg extends c2 {
    public final t4e b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Double m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;

    public dxg(t4e t4eVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Double d, Integer num, Integer num2, Integer num3, Integer num4) {
        this.b = t4eVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = d;
        this.n = num;
        this.o = num2;
        this.p = num3;
        this.q = num4;
    }

    @Override // defpackage.rx4
    public final Map<String, Object> a() {
        HashMap map = new HashMap();
        t4e t4eVar = this.b;
        if (t4eVar != null) {
            map.put("selfDescribingEventData", t4eVar);
        }
        String str = this.c;
        if (str != null) {
            map.put("e", str);
        }
        String str2 = this.d;
        if (str2 != null) {
            map.put("tv", str2);
        }
        String str3 = this.e;
        if (str3 != null) {
            map.put("ua", str3);
        }
        String str4 = this.f;
        if (str4 != null) {
            map.put("url", str4);
        }
        String str5 = this.g;
        if (str5 != null) {
            map.put("page", str5);
        }
        String str6 = this.h;
        if (str6 != null) {
            map.put("refr", str6);
        }
        String str7 = this.i;
        if (str7 != null) {
            map.put("se_ca", str7);
        }
        String str8 = this.j;
        if (str8 != null) {
            map.put("se_ac", str8);
        }
        String str9 = this.k;
        if (str9 != null) {
            map.put("se_la", str9);
        }
        String str10 = this.l;
        if (str10 != null) {
            map.put("se_pr", str10);
        }
        Double d = this.m;
        if (d != null) {
            map.put("se_va", d);
        }
        Integer num = this.n;
        if (num != null) {
            map.put("pp_mix", num);
        }
        Integer num2 = this.o;
        if (num2 != null) {
            map.put("pp_max", num2);
        }
        Integer num3 = this.p;
        if (num3 != null) {
            map.put("pp_miy", num3);
        }
        Integer num4 = this.q;
        if (num4 != null) {
            map.put("pp_may", num4);
        }
        return map;
    }
}
