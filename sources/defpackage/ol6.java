package defpackage;

import android.util.Log;
import defpackage.ts1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class ol6 {
    public static ts1.a a(wga wgaVar) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = wgaVar.c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long jB = str != null ? b(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = map.get("Expires");
        long jB2 = str3 != null ? b(str3) : j;
        String str4 = map.get("Last-Modified");
        long jB3 = str4 != null ? b(str4) : j;
        String str5 = map.get("ETag");
        if (i != 0) {
            long j6 = (j2 * 1000) + jCurrentTimeMillis;
            j5 = z ? j6 : (j3 * 1000) + j6;
            j4 = j6;
        } else {
            j4 = (jB <= j || jB2 < jB) ? j : (jB2 - jB) + jCurrentTimeMillis;
            j5 = j4;
        }
        ts1.a aVar = new ts1.a();
        aVar.a = wgaVar.b;
        aVar.b = str5;
        aVar.f = j4;
        aVar.e = j5;
        aVar.c = jB;
        aVar.d = jB3;
        aVar.g = map;
        aVar.h = wgaVar.d;
        return aVar;
    }

    public static long b(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                jtg.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", jtg.a("Unable to parse dateStr: %s, falling back to 0", str), e);
            return 0L;
        }
    }
}
