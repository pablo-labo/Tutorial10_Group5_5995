package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.drm.f;
import defpackage.e47;
import defpackage.g7;
import defpackage.i47;
import defpackage.jy1;
import defpackage.ka2;
import defpackage.qyc;
import defpackage.sdb;
import defpackage.st9;
import defpackage.uz8;
import defpackage.vjg;
import defpackage.ws5;
import defpackage.zkd;
import defpackage.zm3;
import defpackage.zr1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDrmSessionManager implements androidx.media3.exoplayer.drm.b {
    public final UUID b;
    public final g7 c;
    public final h d;
    public final HashMap<String, String> e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final d i;
    public final androidx.media3.exoplayer.upstream.a j;
    public final e k;
    public final long l;
    public final ArrayList m;
    public final Set<c> n;
    public final Set<DefaultDrmSession> o;
    public int p;
    public f q;
    public DefaultDrmSession r;
    public DefaultDrmSession s;
    public Looper t;
    public Handler u;
    public byte[] v;
    public sdb w;
    public volatile b x;

    public static final class MissingSchemeDataException extends Exception {
    }

    public class a {
        public a() {
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.m) {
                defaultDrmSession.n();
                if (Arrays.equals(defaultDrmSession.u, bArr)) {
                    if (message.what == 2 && defaultDrmSession.o == 4) {
                        String str = vjg.a;
                        defaultDrmSession.h(false);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public class c implements b.InterfaceC0045b {
        public final a.C0043a a;
        public DrmSession b;
        public boolean c;

        public c(a.C0043a c0043a) {
            this.a = c0043a;
        }

        @Override // androidx.media3.exoplayer.drm.b.InterfaceC0045b
        public final void release() {
            Handler handler = DefaultDrmSessionManager.this.u;
            handler.getClass();
            vjg.T(handler, new jy1(this, 1));
        }
    }

    public class d implements DefaultDrmSession.a {
        public final HashSet a = new HashSet();
        public DefaultDrmSession b;

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Exception exc, boolean z) {
            this.b = null;
            HashSet hashSet = this.a;
            e47 e47VarJ = e47.j(hashSet);
            hashSet.clear();
            e47.b bVarListIterator = e47VarJ.listIterator(0);
            while (bVarListIterator.hasNext()) {
                DefaultDrmSession defaultDrmSession = (DefaultDrmSession) bVarListIterator.next();
                defaultDrmSession.getClass();
                defaultDrmSession.j(z ? 1 : 3, exc);
            }
        }

        public final void b(DefaultDrmSession defaultDrmSession) {
            this.a.add(defaultDrmSession);
            if (this.b != null) {
                return;
            }
            this.b = defaultDrmSession;
            f.b bVarB = defaultDrmSession.b.b();
            defaultDrmSession.x = bVarB;
            DefaultDrmSession.c cVar = defaultDrmSession.r;
            String str = vjg.a;
            bVarB.getClass();
            cVar.getClass();
            cVar.obtainMessage(1, new DefaultDrmSession.d(uz8.c.getAndIncrement(), true, SystemClock.elapsedRealtime(), bVarB)).sendToTarget();
        }
    }

    public class e implements DefaultDrmSession.b {
        public e() {
        }
    }

    public DefaultDrmSessionManager(UUID uuid, h hVar, HashMap map, boolean z, int[] iArr, boolean z2, androidx.media3.exoplayer.upstream.a aVar) {
        uuid.getClass();
        ka2.k("Use C.CLEARKEY_UUID instead", !zr1.b.equals(uuid));
        this.b = uuid;
        this.c = g.d;
        this.d = hVar;
        this.e = map;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = aVar;
        this.i = new d();
        this.k = new e();
        this.m = new ArrayList();
        this.n = Collections.newSetFromMap(new IdentityHashMap());
        this.o = Collections.newSetFromMap(new IdentityHashMap());
        this.l = 300000L;
    }

    public static boolean g(DefaultDrmSession defaultDrmSession) {
        defaultDrmSession.n();
        if (defaultDrmSession.o != 1) {
            return false;
        }
        DrmSession.DrmSessionException drmSessionExceptionC = defaultDrmSession.c();
        drmSessionExceptionC.getClass();
        Throwable cause = drmSessionExceptionC.getCause();
        return (cause instanceof ResourceBusyException) || androidx.media3.exoplayer.drm.c.c(cause);
    }

    public static ArrayList j(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.d);
        for (int i = 0; i < drmInitData.d; i++) {
            DrmInitData.SchemeData schemeData = drmInitData.a[i];
            if ((schemeData.a(uuid) || (zr1.c.equals(uuid) && schemeData.a(zr1.b))) && (schemeData.e != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.drm.b
    public final void a(Looper looper, sdb sdbVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else {
                    ka2.q(looper2 == looper);
                    this.u.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.w = sdbVar;
    }

    @Override // androidx.media3.exoplayer.drm.b
    public final DrmSession b(a.C0043a c0043a, androidx.media3.common.a aVar) {
        l(false);
        ka2.q(this.p > 0);
        ka2.r(this.t);
        return e(this.t, c0043a, aVar, true);
    }

    @Override // androidx.media3.exoplayer.drm.b
    public final int c(androidx.media3.common.a aVar) {
        l(false);
        f fVar = this.q;
        fVar.getClass();
        int iG = fVar.g();
        DrmInitData drmInitData = aVar.r;
        if (drmInitData == null) {
            int i = st9.i(aVar.n);
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    i2 = -1;
                    break;
                }
                if (iArr[i2] == i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return 0;
            }
        } else if (this.v == null) {
            UUID uuid = this.b;
            if (j(drmInitData, uuid, true).isEmpty()) {
                if (drmInitData.d == 1 && drmInitData.a[0].a(zr1.b)) {
                    zkd.T("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = drmInitData.c;
            if (str != null && !"cenc".equals(str) && !"cbcs".equals(str) && ("cbc1".equals(str) || "cens".equals(str))) {
                return 1;
            }
        }
        return iG;
    }

    @Override // androidx.media3.exoplayer.drm.b
    public final b.InterfaceC0045b d(a.C0043a c0043a, androidx.media3.common.a aVar) {
        int i = 0;
        ka2.q(this.p > 0);
        ka2.r(this.t);
        c cVar = new c(c0043a);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new zm3(i, cVar, aVar));
        return cVar;
    }

    public final DrmSession e(Looper looper, a.C0043a c0043a, androidx.media3.common.a aVar, boolean z) {
        ArrayList arrayListJ;
        if (this.x == null) {
            this.x = new b(looper);
        }
        DrmInitData drmInitData = aVar.r;
        int i = 0;
        DefaultDrmSession defaultDrmSession = null;
        if (drmInitData == null) {
            int i2 = st9.i(aVar.n);
            f fVar = this.q;
            fVar.getClass();
            if (fVar.g() != 2 || !ws5.c) {
                int[] iArr = this.g;
                while (true) {
                    if (i >= iArr.length) {
                        i = -1;
                        break;
                    }
                    if (iArr[i] == i2) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && fVar.g() != 1) {
                    DefaultDrmSession defaultDrmSession2 = this.r;
                    if (defaultDrmSession2 == null) {
                        e47.b bVar = e47.b;
                        DefaultDrmSession defaultDrmSessionI = i(qyc.e, true, null, z);
                        this.m.add(defaultDrmSessionI);
                        this.r = defaultDrmSessionI;
                    } else {
                        defaultDrmSession2.e(null);
                    }
                    return this.r;
                }
            }
            return null;
        }
        if (this.v == null) {
            arrayListJ = j(drmInitData, this.b, false);
            if (arrayListJ.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException("Media does not support uuid: " + this.b);
                zkd.x("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (c0043a != null) {
                    c0043a.d(missingSchemeDataException);
                }
                return new androidx.media3.exoplayer.drm.e(new DrmSession.DrmSessionException(6003, missingSchemeDataException));
            }
        } else {
            arrayListJ = null;
        }
        if (this.f) {
            Iterator it = this.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession defaultDrmSession3 = (DefaultDrmSession) it.next();
                if (Objects.equals(defaultDrmSession3.a, arrayListJ)) {
                    defaultDrmSession = defaultDrmSession3;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.s;
        }
        if (defaultDrmSession != null) {
            defaultDrmSession.e(c0043a);
            return defaultDrmSession;
        }
        DefaultDrmSession defaultDrmSessionI2 = i(arrayListJ, false, c0043a, z);
        if (!this.f) {
            this.s = defaultDrmSessionI2;
        }
        this.m.add(defaultDrmSessionI2);
        return defaultDrmSessionI2;
    }

    @Override // androidx.media3.exoplayer.drm.b
    public final void f() {
        f dVar;
        l(true);
        int i = this.p;
        this.p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.q == null) {
            UUID uuid = this.b;
            this.c.getClass();
            try {
                try {
                    try {
                        dVar = new g(uuid);
                    } catch (UnsupportedSchemeException e2) {
                        throw new UnsupportedDrmException(1, e2);
                    }
                } catch (Exception e3) {
                    throw new UnsupportedDrmException(2, e3);
                }
            } catch (UnsupportedDrmException unused) {
                zkd.w("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                dVar = new androidx.media3.exoplayer.drm.d();
            }
            this.q = dVar;
            dVar.e(new a());
            return;
        }
        if (this.l == -9223372036854775807L) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((DefaultDrmSession) arrayList.get(i2)).e(null);
            i2++;
        }
    }

    public final DefaultDrmSession h(List<DrmInitData.SchemeData> list, boolean z, a.C0043a c0043a) {
        this.q.getClass();
        boolean z2 = this.h | z;
        f fVar = this.q;
        byte[] bArr = this.v;
        Looper looper = this.t;
        looper.getClass();
        sdb sdbVar = this.w;
        sdbVar.getClass();
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.b, fVar, this.i, this.k, list, z2, z, bArr, this.e, this.d, looper, this.j, sdbVar);
        defaultDrmSession.e(c0043a);
        if (this.l != -9223372036854775807L) {
            defaultDrmSession.e(null);
        }
        return defaultDrmSession;
    }

    public final DefaultDrmSession i(List<DrmInitData.SchemeData> list, boolean z, a.C0043a c0043a, boolean z2) {
        DefaultDrmSession defaultDrmSessionH = h(list, z, c0043a);
        boolean zG = g(defaultDrmSessionH);
        long j = this.l;
        Set<DefaultDrmSession> set = this.o;
        if (zG && !set.isEmpty()) {
            Iterator it = i47.k(set).iterator();
            while (it.hasNext()) {
                ((DrmSession) it.next()).f(null);
            }
            defaultDrmSessionH.f(c0043a);
            if (j != -9223372036854775807L) {
                defaultDrmSessionH.f(null);
            }
            defaultDrmSessionH = h(list, z, c0043a);
        }
        if (g(defaultDrmSessionH) && z2) {
            Set<c> set2 = this.n;
            if (!set2.isEmpty()) {
                Iterator it2 = i47.k(set2).iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    Iterator it3 = i47.k(set).iterator();
                    while (it3.hasNext()) {
                        ((DrmSession) it3.next()).f(null);
                    }
                }
                defaultDrmSessionH.f(c0043a);
                if (j != -9223372036854775807L) {
                    defaultDrmSessionH.f(null);
                }
                return h(list, z, c0043a);
            }
        }
        return defaultDrmSessionH;
    }

    public final void k() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            f fVar = this.q;
            fVar.getClass();
            fVar.release();
            this.q = null;
        }
    }

    public final void l(boolean z) {
        if (z && this.t == null) {
            zkd.U("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.t;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            zkd.U("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // androidx.media3.exoplayer.drm.b
    public final void release() {
        l(true);
        int i = this.p - 1;
        this.p = i;
        if (i != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((DefaultDrmSession) arrayList.get(i2)).f(null);
            }
        }
        Iterator it = i47.k(this.n).iterator();
        while (it.hasNext()) {
            ((c) it.next()).release();
        }
        k();
    }
}
