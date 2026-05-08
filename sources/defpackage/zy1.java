package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import defpackage.f31;
import defpackage.l71;
import defpackage.sfa;
import defpackage.y21;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class zy1 implements zsf {
    public final i62 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final b82 e;
    public final b82 f;
    public final int g;

    public static final class a {
        public final URL a;
        public final t11 b;
        public final String c;

        public a(URL url, t11 t11Var, String str) {
            this.a = url;
            this.b = t11Var;
            this.c = str;
        }
    }

    public static final class b {
        public final int a;
        public final URL b;
        public final long c;

        public b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    public zy1(Context context, b82 b82Var, b82 b82Var2) {
        ea8 ea8Var = new ea8();
        dz0 dz0Var = dz0.a;
        ea8Var.a(ne1.class, dz0Var);
        ea8Var.a(t11.class, dz0Var);
        gz0 gz0Var = gz0.a;
        ea8Var.a(l39.class, gz0Var);
        ea8Var.a(g31.class, gz0Var);
        ez0 ez0Var = ez0.a;
        ea8Var.a(t72.class, ez0Var);
        ea8Var.a(u11.class, ez0Var);
        cz0 cz0Var = cz0.a;
        ea8Var.a(b50.class, cz0Var);
        ea8Var.a(q11.class, cz0Var);
        fz0 fz0Var = fz0.a;
        ea8Var.a(a39.class, fz0Var);
        ea8Var.a(f31.class, fz0Var);
        hz0 hz0Var = hz0.a;
        ea8Var.a(sfa.class, hz0Var);
        ea8Var.a(i31.class, hz0Var);
        ea8Var.d = true;
        this.a = new i62(ea8Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = c(as1.c);
        this.e = b82Var2;
        this.f = b82Var;
        this.g = 130000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(l5.l("Invalid url: ", str), e);
        }
    }

    @Override // defpackage.zsf
    public final y21 a(y21 y21Var) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        y21.a aVarI = y21Var.i();
        int i = Build.VERSION.SDK_INT;
        HashMap map = aVarI.f;
        if (map == null) {
            r6.g("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("sdk-version", String.valueOf(i));
        aVarI.a("model", Build.MODEL);
        aVarI.a("hardware", Build.HARDWARE);
        aVarI.a("device", Build.DEVICE);
        aVarI.a("product", Build.PRODUCT);
        aVarI.a("os-uild", Build.ID);
        aVarI.a("manufacturer", Build.MANUFACTURER);
        aVarI.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map2 = aVarI.f;
        if (map2 == null) {
            r6.g("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("tz-offset", String.valueOf(offset));
        int iA = activeNetworkInfo == null ? sfa.b.NONE.a() : activeNetworkInfo.getType();
        HashMap map3 = aVarI.f;
        if (map3 == null) {
            r6.g("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("net-type", String.valueOf(iA));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            subtype = sfa.a.UNKNOWN_MOBILE_SUBTYPE.a();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = sfa.a.COMBINED.a();
            } else if (sfa.a.c.get(subtype) == null) {
                subtype = 0;
            }
        }
        HashMap map4 = aVarI.f;
        if (map4 == null) {
            r6.g("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("mobile-subtype", String.valueOf(subtype));
        aVarI.a("country", Locale.getDefault().getCountry());
        aVarI.a("locale", Locale.getDefault().getLanguage());
        Context context = this.c;
        aVarI.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            i49.b("CctTransportBackend", "Unable to find version code for package", e);
        }
        aVarI.a("application_build", Integer.toString(i2));
        return aVarI.b();
    }

    @Override // defpackage.zsf
    public final s11 b(r11 r11Var) {
        String str;
        b bVarA;
        String str2;
        Integer numValueOf;
        f31.a aVar;
        l71.a aVar2 = l71.a.b;
        HashMap map = new HashMap();
        for (iy4 iy4Var : r11Var.a) {
            String strG = iy4Var.g();
            if (map.containsKey(strG)) {
                ((List) map.get(strG)).add(iy4Var);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iy4Var);
                map.put(strG, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iy4 iy4Var2 = (iy4) ((List) entry.getValue()).get(0);
            x8c x8cVar = x8c.DEFAULT;
            long time = this.f.getTime();
            long time2 = this.e.getTime();
            u11 u11Var = new u11(new q11(Integer.valueOf(iy4Var2.f("sdk-version")), iy4Var2.a("model"), iy4Var2.a("hardware"), iy4Var2.a("device"), iy4Var2.a("product"), iy4Var2.a("os-uild"), iy4Var2.a("manufacturer"), iy4Var2.a("fingerprint"), iy4Var2.a("locale"), iy4Var2.a("country"), iy4Var2.a("mcc_mnc"), iy4Var2.a("application_build")));
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                str2 = null;
            } catch (NumberFormatException unused) {
                str2 = (String) entry.getKey();
                numValueOf = null;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                iy4 iy4Var3 = (iy4) it2.next();
                xs4 xs4VarD = iy4Var3.d();
                dt4 dt4Var = xs4VarD.a;
                byte[] bArr = xs4VarD.b;
                Iterator it3 = it;
                Iterator it4 = it2;
                if (dt4Var.equals(new dt4("proto"))) {
                    aVar = new f31.a();
                    aVar.d = bArr;
                } else if (dt4Var.equals(new dt4("json"))) {
                    String str3 = new String(bArr, Charset.forName("UTF-8"));
                    f31.a aVar3 = new f31.a();
                    aVar3.e = str3;
                    aVar = aVar3;
                } else {
                    String strConcat = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat, 5)) {
                        Log.w(strConcat, "Received event of unsupported encoding " + dt4Var + ". Skipping...");
                    }
                    it = it3;
                    it2 = it4;
                }
                aVar.a = Long.valueOf(iy4Var3.e());
                aVar.c = Long.valueOf(iy4Var3.h());
                String str4 = iy4Var3.b().get("tz-offset");
                aVar.f = Long.valueOf(str4 == null ? 0L : Long.valueOf(str4).longValue());
                aVar.g = new i31(sfa.b.b.get(iy4Var3.f("net-type")), sfa.a.c.get(iy4Var3.f("mobile-subtype")));
                if (iy4Var3.c() != null) {
                    aVar.b = iy4Var3.c();
                }
                String strConcat2 = aVar.a == null ? " eventTimeMs" : "";
                if (aVar.c == null) {
                    strConcat2 = strConcat2.concat(" eventUptimeMs");
                }
                if (aVar.f == null) {
                    strConcat2 = strConcat2.concat(" timezoneOffsetSeconds");
                }
                if (!strConcat2.isEmpty()) {
                    r6.g("Missing required properties:".concat(strConcat2));
                    return null;
                }
                arrayList3.add(new f31(aVar.a.longValue(), aVar.b, aVar.c.longValue(), aVar.d, aVar.e, aVar.f.longValue(), aVar.g));
                it = it3;
                it2 = it4;
            }
            arrayList2.add(new g31(time, time2, u11Var, numValueOf, str2, arrayList3));
        }
        t11 t11Var = new t11(arrayList2);
        byte[] bArr2 = r11Var.b;
        l71.a aVar4 = l71.a.c;
        URL urlC = this.d;
        if (bArr2 != null) {
            try {
                as1 as1VarA = as1.a(bArr2);
                str = as1VarA.b;
                if (str == null) {
                    str = null;
                }
                String str5 = as1VarA.a;
                if (str5 != null) {
                    urlC = c(str5);
                }
            } catch (IllegalArgumentException unused2) {
                return new s11(aVar4, -1L);
            }
        } else {
            str = null;
        }
        try {
            a aVar5 = new a(urlC, t11Var, str);
            yy1 yy1Var = new yy1(this, 0);
            int i = 5;
            do {
                bVarA = yy1Var.a(aVar5);
                URL url = bVarA.b;
                if (url != null) {
                    i49.a(url, "CctTransportBackend", "Following redirect to: %s");
                    aVar5 = new a(url, aVar5.b, aVar5.c);
                } else {
                    aVar5 = null;
                }
                if (aVar5 == null) {
                    break;
                }
                i--;
            } while (i >= 1);
            int i2 = bVarA.a;
            if (i2 == 200) {
                return new s11(l71.a.a, bVarA.c);
            }
            if (i2 < 500 && i2 != 404) {
                return i2 == 400 ? new s11(l71.a.d, -1L) : new s11(aVar4, -1L);
            }
            return new s11(aVar2, -1L);
        } catch (IOException e) {
            i49.b("CctTransportBackend", "Could not make request to the backend", e);
            return new s11(aVar2, -1L);
        }
    }
}
