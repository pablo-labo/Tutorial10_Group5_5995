package defpackage;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import defpackage.l05;
import defpackage.s98;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlinx.serialization.json.JsonElement;
import org.apache.avro.AvroMissingFieldException;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes2.dex */
public final class gu4 implements eu4 {
    public final /* synthetic */ hz4 a;
    public final /* synthetic */ Configuration b;

    public gu4(hz4 hz4Var, Configuration configuration) {
        this.a = hz4Var;
        this.b = configuration;
    }

    @Override // defpackage.eu4
    public final void a(cpe cpeVar, int i) {
        cpeVar.getClass();
        cpeVar.c(i, d());
    }

    @Override // defpackage.eu4
    public final boolean b(g gVar) {
        return wl7.b(gVar.E(), getFullName());
    }

    @Override // defpackage.eu4
    public final void c(LinkedHashMap linkedHashMap, String str) {
        str.getClass();
        s98.a aVar = s98.d;
        String str2 = "{\"" + getFullName() + "\": " + d() + "}";
        aVar.getClass();
        linkedHashMap.put(str, (JsonElement) aVar.c(na8.a, str2));
    }

    public final l05 d() {
        l05.a aVar = new l05.a(l05.a, l05.b);
        hz4 hz4Var = this.a;
        wk0 wk0VarValueOf = wk0.valueOf(hz4Var.a.name());
        g.f[] fVarArr = aVar.b;
        htc.b(fVarArr[0], wk0VarValueOf);
        aVar.e = wk0VarValueOf;
        boolean[] zArr = aVar.c;
        zArr[0] = true;
        String str = hz4Var.b;
        htc.b(fVarArr[1], str);
        aVar.f = str;
        zArr[1] = true;
        long j = hz4Var.c;
        g.f fVar = fVarArr[2];
        aVar.g = j;
        zArr[2] = true;
        String str2 = hz4Var.d;
        htc.b(fVarArr[3], str2);
        aVar.h = str2;
        zArr[3] = true;
        String str3 = hz4Var.e;
        htc.b(fVarArr[4], str3);
        aVar.i = str3;
        zArr[4] = true;
        String str4 = hz4Var.f;
        htc.b(fVarArr[5], str4);
        aVar.j = str4;
        zArr[5] = true;
        String str5 = hz4Var.g;
        htc.b(fVarArr[6], str5);
        aVar.k = str5;
        zArr[6] = true;
        String str6 = Build.VERSION.RELEASE;
        htc.b(fVarArr[7], str6);
        aVar.l = str6;
        zArr[7] = true;
        String string = UUID.randomUUID().toString();
        htc.b(fVarArr[8], string);
        aVar.m = string;
        zArr[8] = true;
        String str7 = hz4Var.h;
        htc.b(fVarArr[9], str7);
        aVar.n = str7;
        zArr[9] = true;
        String str8 = hz4Var.i;
        htc.b(fVarArr[10], str8);
        aVar.o = str8;
        zArr[10] = true;
        String str9 = hz4Var.j;
        htc.b(fVarArr[11], str9);
        aVar.p = str9;
        zArr[11] = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        g.f fVar2 = fVarArr[12];
        aVar.q = jCurrentTimeMillis;
        zArr[12] = true;
        List<String> list = hz4Var.k;
        htc.b(fVarArr[13], list);
        aVar.r = list;
        zArr[13] = true;
        String str10 = hz4Var.m;
        htc.b(fVarArr[17], str10);
        aVar.t = str10;
        zArr[17] = true;
        String str11 = hz4Var.l;
        htc.b(fVarArr[14], str11);
        aVar.s = str11;
        zArr[14] = true;
        htc.b(fVarArr[15], null);
        zArr[15] = true;
        String str12 = hz4Var.n;
        htc.b(fVarArr[18], str12);
        aVar.u = str12;
        zArr[18] = true;
        c19 c19Var = c19.b;
        Locale locale = LocaleList.getDefault().get(0);
        String string2 = locale != null ? locale.toString() : null;
        htc.b(fVarArr[19], string2);
        aVar.v = string2;
        zArr[19] = true;
        x34 x34Var = this.b.orientation == 1 ? x34.b : x34.a;
        g.f fVar3 = fVarArr[21];
        aVar.w = x34Var;
        zArr[21] = true;
        try {
            l05 l05Var = new l05();
            l05Var.appId = zArr[0] ? aVar.e : (wk0) aVar.a(fVarArr[0]);
            l05Var.appVersion = zArr[1] ? aVar.f : (String) aVar.a(fVarArr[1]);
            l05Var.appBuildNum = zArr[2] ? aVar.g : ((Long) aVar.a(fVarArr[2])).longValue();
            l05Var.appVariant = zArr[3] ? aVar.h : (String) aVar.a(fVarArr[3]);
            l05Var.appEnvironment = zArr[4] ? aVar.i : (String) aVar.a(fVarArr[4]);
            l05Var.appCountry = zArr[5] ? aVar.j : (String) aVar.a(fVarArr[5]);
            l05Var.ipCountry = zArr[6] ? aVar.k : (String) aVar.a(fVarArr[6]);
            l05Var.osVersion = zArr[7] ? aVar.l : (String) aVar.a(fVarArr[7]);
            l05Var.clientEventId = zArr[8] ? aVar.m : (String) aVar.a(fVarArr[8]);
            l05Var.appInstallId = zArr[9] ? aVar.n : (String) aVar.a(fVarArr[9]);
            l05Var.appSessionId = zArr[10] ? aVar.o : (String) aVar.a(fVarArr[10]);
            l05Var.sessionId = zArr[11] ? aVar.p : (String) aVar.a(fVarArr[11]);
            l05Var.clientCreatedTimestamp = zArr[12] ? aVar.q : ((Long) aVar.a(fVarArr[12])).longValue();
            l05Var.groups = zArr[13] ? aVar.r : (List) aVar.a(fVarArr[13]);
            l05Var.accountId = zArr[14] ? aVar.s : (String) aVar.a(fVarArr[14]);
            l05Var.secondaryAccountId = zArr[15] ? null : (String) aVar.a(fVarArr[15]);
            l05Var.parentTk = zArr[16] ? null : (String) aVar.a(fVarArr[16]);
            l05Var.ctk = zArr[17] ? aVar.t : (String) aVar.a(fVarArr[17]);
            l05Var.deviceId = zArr[18] ? aVar.u : (String) aVar.a(fVarArr[18]);
            l05Var.userLocale = zArr[19] ? aVar.v : (String) aVar.a(fVarArr[19]);
            l05Var.indeedLocale = zArr[20] ? null : (String) aVar.a(fVarArr[20]);
            l05Var.deviceOrientation = zArr[21] ? aVar.w : (x34) aVar.a(fVarArr[21]);
            return l05Var;
        } catch (AvroMissingFieldException e) {
            throw e;
        } catch (Exception e2) {
            throw new AvroRuntimeException(e2);
        }
    }

    @Override // defpackage.eu4
    public final String getFullName() {
        String strE = l05.a.E();
        strE.getClass();
        return strE;
    }
}
