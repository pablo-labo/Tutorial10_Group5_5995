package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.d;
import androidx.media3.exoplayer.drm.f;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import defpackage.gf3;
import defpackage.ka2;
import defpackage.ryc;
import defpackage.vjg;
import defpackage.zr1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class h implements i {
    public final d.a a;
    public final String b;
    public final boolean c;
    public final HashMap d;

    public h(String str, boolean z, d.a aVar) {
        ka2.l((z && TextUtils.isEmpty(str)) ? false : true);
        this.a = aVar;
        this.b = str;
        this.c = z;
        this.d = new HashMap();
    }

    public final byte[] a(UUID uuid, f.a aVar) {
        String str = aVar.b;
        if (this.c || TextUtils.isEmpty(str)) {
            str = this.b;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            ka2.s(uri, "The uri must be set.");
            throw new MediaDrmCallbackException(new gf3(uri, 0L, 1, null, map, 0L, -1L, null, 0), uri, ryc.V, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map2 = new HashMap();
        UUID uuid2 = zr1.e;
        map2.put(TracingInterceptor.HEADER_CT, uuid2.equals(uuid) ? "text/xml" : zr1.c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map2.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.d) {
            map2.putAll(this.d);
        }
        return c.a(this.a.a(), str, aVar.a, map2);
    }

    public final byte[] b(f.b bVar) {
        return c.a(this.a.a(), bVar.b + "&signedRequest=" + vjg.q(bVar.a), null, Collections.EMPTY_MAP);
    }
}
