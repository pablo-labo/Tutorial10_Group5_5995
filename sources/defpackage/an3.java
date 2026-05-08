package defpackage;

import android.net.Uri;
import androidx.media3.datasource.d;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.upstream.a;
import defpackage.ij9;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class an3 {
    public final Object a = new Object();
    public ij9.d b;
    public DefaultDrmSessionManager c;

    public static DefaultDrmSessionManager a(ij9.d dVar) {
        d.a aVar = new d.a();
        Uri uri = dVar.b;
        h hVar = new h(uri == null ? null : uri.toString(), dVar.f, aVar);
        f47<String, String> f47Var = dVar.c;
        i47 i47VarB = f47Var.a;
        if (i47VarB == null) {
            i47VarB = f47Var.b();
            f47Var.a = i47VarB;
        }
        r6g it = i47VarB.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (hVar.d) {
                hVar.d.put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = zr1.a;
        a aVar2 = new a();
        UUID uuid2 = dVar.a;
        uuid2.getClass();
        boolean z = dVar.d;
        boolean z2 = dVar.e;
        int[] iArrP1 = bm7.P1(dVar.g);
        for (int i : iArrP1) {
            boolean z3 = true;
            if (i != 2 && i != 1) {
                z3 = false;
            }
            ka2.l(z3);
        }
        DefaultDrmSessionManager defaultDrmSessionManager = new DefaultDrmSessionManager(uuid2, hVar, map, z, (int[]) iArrP1.clone(), z2, aVar2);
        byte[] bArr = dVar.h;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        ka2.q(defaultDrmSessionManager.m.isEmpty());
        defaultDrmSessionManager.v = bArrCopyOf;
        return defaultDrmSessionManager;
    }

    public final b b(ij9 ij9Var) {
        DefaultDrmSessionManager defaultDrmSessionManager;
        ij9Var.b.getClass();
        ij9.d dVar = ij9Var.b.c;
        if (dVar == null) {
            return b.a;
        }
        synchronized (this.a) {
            try {
                if (!dVar.equals(this.b)) {
                    this.b = dVar;
                    this.c = a(dVar);
                }
                defaultDrmSessionManager = this.c;
                defaultDrmSessionManager.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return defaultDrmSessionManager;
    }
}
