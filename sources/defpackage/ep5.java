package defpackage;

import android.net.Uri;
import android.webkit.CookieManager;
import com.wlappdebug.r;
import defpackage.cd4;
import defpackage.xh8;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class ep5 implements xh8 {
    public static final ep5 a = new ep5();
    public static final pxc b = new pxc(".*\\bindeed\\.(com|net)$");

    public final ArrayList a() {
        Map<String, Integer> mapB = b();
        ArrayList arrayList = new ArrayList(mapB.size());
        for (Map.Entry<String, Integer> entry : mapB.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append((Object) key);
            sb.append(value);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public final Map<String, Integer> b() {
        List<cd4.a> listD = f().a.d();
        ArrayList arrayList = new ArrayList();
        for (cd4.a aVar : listD) {
            Integer numC = a.f().c(aVar.name());
            Pair pair = numC != null ? new Pair(aVar.name(), numC) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return lc9.f0(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList c() {
        ((r.b) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(r.b.class), null)).b("", "proctor.forceWebBuckets");
        List listK0 = zve.k0("", new String[]{","});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final String e() {
        return z92.W0(c(), ",", null, null, new zg(3), 30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ed4 f() {
        return (ed4) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(ed4.class), null);
    }

    public final void g(String str) throws UnsupportedEncodingException {
        if (wve.K(str, "http", false)) {
            String host = Uri.parse(str).getHost();
            if (host == null) {
                host = "";
            }
            if (b.d(host)) {
                ArrayList arrayListH1 = z92.h1(a(), c());
                f();
                ArrayList arrayListH12 = z92.h1(arrayListH1, u63.b0(null));
                if (arrayListH12.isEmpty()) {
                    return;
                }
                String strEncode = URLEncoder.encode(z92.W0(arrayListH12, ",", null, null, null, 62), "UTF-8");
                strEncode.getClass();
                if (strEncode.length() > 0) {
                    CookieManager cookieManager = CookieManager.getInstance();
                    ArrayList arrayList = lz2.a;
                    lz2.d("ForceProctorHelper", akb.k("Setting prforceGroups=\"", strEncode, "\" for url ", str, ":"), false, null);
                    cookieManager.setCookie(str, "prforceGroups=\"" + strEncode + "\"; Path=/");
                    cookieManager.flush();
                }
            }
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
