package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.drm.f;
import androidx.media3.exoplayer.upstream.b;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import defpackage.e47;
import defpackage.hz2;
import defpackage.ka2;
import defpackage.sdb;
import defpackage.uz8;
import defpackage.vjg;
import defpackage.ws5;
import defpackage.xn0;
import defpackage.zkd;
import defpackage.zr1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDrmSession implements DrmSession {
    public final List<DrmInitData.SchemeData> a;
    public final f b;
    public final a c;
    public final b d;
    public final boolean e;
    public final boolean f;
    public final HashMap<String, String> g;
    public final hz2<a.C0043a> h;
    public final androidx.media3.exoplayer.upstream.b i;
    public final sdb j;
    public final i k;
    public final UUID l;
    public final Looper m;
    public final e n;
    public int o;
    public int p;
    public HandlerThread q;
    public c r;
    public ws5 s;
    public DrmSession.DrmSessionException t;
    public byte[] u;
    public byte[] v;
    public f.a w;
    public f.b x;

    public static final class UnexpectedDrmSessionException extends IOException {
    }

    public interface a {
    }

    public interface b {
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {
        public boolean a;

        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object objB;
            d dVar = (d) message.obj;
            try {
                int i = message.what;
                if (i == 1) {
                    objB = ((h) DefaultDrmSession.this.k).b((f.b) dVar.c);
                } else {
                    if (i != 2) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    objB = ((h) defaultDrmSession.k).a(defaultDrmSession.l, (f.a) dVar.c);
                }
            } catch (MediaDrmCallbackException e) {
                d dVar2 = (d) message.obj;
                if (dVar2.b) {
                    int i2 = dVar2.d + 1;
                    dVar2.d = i2;
                    if (i2 <= DefaultDrmSession.this.i.b(3)) {
                        SystemClock.elapsedRealtime();
                        SystemClock.elapsedRealtime();
                        long jA = DefaultDrmSession.this.i.a(new b.c(e.getCause() instanceof IOException ? (IOException) e.getCause() : new UnexpectedDrmSessionException(e.getCause()), dVar2.d));
                        if (jA != -9223372036854775807L) {
                            synchronized (this) {
                                try {
                                    if (!this.a) {
                                        sendMessageDelayed(Message.obtain(message), jA);
                                        return;
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }
                objB = e;
            } catch (Exception e2) {
                zkd.U("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                objB = e2;
            }
            androidx.media3.exoplayer.upstream.b bVar = DefaultDrmSession.this.i;
            long j = dVar.a;
            bVar.getClass();
            synchronized (this) {
                try {
                    if (!this.a) {
                        DefaultDrmSession.this.n.obtainMessage(message.what, Pair.create(dVar.c, objB)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    public static final class d {
        public final long a;
        public final boolean b;
        public final Object c;
        public int d;

        public d(long j, boolean z, long j2, Object obj) {
            this.a = j;
            this.b = z;
            this.c = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Set<a.C0043a> set;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 1) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                a aVar = defaultDrmSession.c;
                if (obj == defaultDrmSession.x) {
                    if (defaultDrmSession.o == 2 || defaultDrmSession.i()) {
                        defaultDrmSession.x = null;
                        if (obj2 instanceof Exception) {
                            ((DefaultDrmSessionManager.d) aVar).a((Exception) obj2, false);
                            return;
                        }
                        try {
                            defaultDrmSession.b.f((byte[]) obj2);
                            DefaultDrmSessionManager.d dVar = (DefaultDrmSessionManager.d) aVar;
                            dVar.b = null;
                            HashSet hashSet = dVar.a;
                            e47 e47VarJ = e47.j(hashSet);
                            hashSet.clear();
                            e47.b bVarListIterator = e47VarJ.listIterator(0);
                            while (bVarListIterator.hasNext()) {
                                DefaultDrmSession defaultDrmSession2 = (DefaultDrmSession) bVarListIterator.next();
                                if (defaultDrmSession2.l()) {
                                    defaultDrmSession2.h(true);
                                }
                            }
                            return;
                        } catch (Exception e) {
                            ((DefaultDrmSessionManager.d) aVar).a(e, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            DefaultDrmSession defaultDrmSession3 = DefaultDrmSession.this;
            if (obj == defaultDrmSession3.w && defaultDrmSession3.i()) {
                defaultDrmSession3.w = null;
                if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                    defaultDrmSession3.k((Throwable) obj2, false);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    byte[] bArrK = defaultDrmSession3.b.k(defaultDrmSession3.u, bArr);
                    if (defaultDrmSession3.v != null && bArrK != null && bArrK.length != 0) {
                        defaultDrmSession3.v = bArrK;
                    }
                    defaultDrmSession3.o = 4;
                    hz2<a.C0043a> hz2Var = defaultDrmSession3.h;
                    synchronized (hz2Var.a) {
                        set = hz2Var.c;
                    }
                    Iterator<a.C0043a> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().a();
                    }
                } catch (Exception e2) {
                    e = e2;
                    defaultDrmSession3.k(e, true);
                } catch (NoSuchMethodError e3) {
                    e = e3;
                    defaultDrmSession3.k(e, true);
                }
            }
        }
    }

    public DefaultDrmSession(UUID uuid, f fVar, a aVar, b bVar, List list, boolean z, boolean z2, byte[] bArr, HashMap map, h hVar, Looper looper, androidx.media3.exoplayer.upstream.a aVar2, sdb sdbVar) {
        this.l = uuid;
        this.c = aVar;
        this.d = bVar;
        this.b = fVar;
        this.e = z;
        this.f = z2;
        if (bArr != null) {
            this.v = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.g = map;
        this.k = hVar;
        this.h = new hz2<>();
        this.i = aVar2;
        this.j = sdbVar;
        this.o = 2;
        this.m = looper;
        this.n = new e(looper);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID a() {
        n();
        return this.l;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean b() {
        n();
        return this.e;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException c() {
        n();
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final ws5 d() {
        n();
        return this.s;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void e(a.C0043a c0043a) {
        n();
        if (this.p < 0) {
            zkd.w("DefaultDrmSession", "Session reference count less than zero: " + this.p);
            this.p = 0;
        }
        if (c0043a != null) {
            hz2<a.C0043a> hz2Var = this.h;
            synchronized (hz2Var.a) {
                try {
                    ArrayList arrayList = new ArrayList(hz2Var.d);
                    arrayList.add(c0043a);
                    hz2Var.d = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) hz2Var.b.get(c0043a);
                    if (num == null) {
                        HashSet hashSet = new HashSet(hz2Var.c);
                        hashSet.add(c0043a);
                        hz2Var.c = Collections.unmodifiableSet(hashSet);
                    }
                    hz2Var.b.put(c0043a, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i = this.p + 1;
        this.p = i;
        if (i == 1) {
            ka2.q(this.o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new c(this.q.getLooper());
            if (l()) {
                h(true);
            }
        } else if (c0043a != null && i() && this.h.a(c0043a) == 1) {
            c0043a.c(this.o);
        }
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (defaultDrmSessionManager.l != -9223372036854775807L) {
            defaultDrmSessionManager.o.remove(this);
            Handler handler = defaultDrmSessionManager.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void f(a.C0043a c0043a) {
        n();
        int i = this.p;
        if (i <= 0) {
            zkd.w("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.p = i2;
        if (i2 == 0) {
            this.o = 0;
            e eVar = this.n;
            String str = vjg.a;
            eVar.removeCallbacksAndMessages(null);
            c cVar = this.r;
            synchronized (cVar) {
                cVar.removeCallbacksAndMessages(null);
                cVar.a = true;
            }
            this.r = null;
            this.q.quit();
            this.q = null;
            this.s = null;
            this.t = null;
            this.w = null;
            this.x = null;
            byte[] bArr = this.u;
            if (bArr != null) {
                this.b.j(bArr);
                this.u = null;
            }
        }
        if (c0043a != null) {
            hz2<a.C0043a> hz2Var = this.h;
            synchronized (hz2Var.a) {
                try {
                    Integer num = (Integer) hz2Var.b.get(c0043a);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(hz2Var.d);
                        arrayList.remove(c0043a);
                        hz2Var.d = Collections.unmodifiableList(arrayList);
                        int iIntValue = num.intValue();
                        HashMap map = hz2Var.b;
                        if (iIntValue == 1) {
                            map.remove(c0043a);
                            HashSet hashSet = new HashSet(hz2Var.c);
                            hashSet.remove(c0043a);
                            hz2Var.c = Collections.unmodifiableSet(hashSet);
                        } else {
                            map.put(c0043a, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } finally {
                }
            }
            if (this.h.a(c0043a) == 0) {
                c0043a.e();
            }
        }
        b bVar = this.d;
        int i3 = this.p;
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (i3 == 1 && defaultDrmSessionManager.p > 0 && defaultDrmSessionManager.l != -9223372036854775807L) {
            defaultDrmSessionManager.o.add(this);
            Handler handler = defaultDrmSessionManager.u;
            handler.getClass();
            handler.postAtTime(new xn0(this, 3), this, SystemClock.uptimeMillis() + defaultDrmSessionManager.l);
        } else if (i3 == 0) {
            defaultDrmSessionManager.m.remove(this);
            if (defaultDrmSessionManager.r == this) {
                defaultDrmSessionManager.r = null;
            }
            if (defaultDrmSessionManager.s == this) {
                defaultDrmSessionManager.s = null;
            }
            DefaultDrmSessionManager.d dVar = defaultDrmSessionManager.i;
            HashSet hashSet2 = dVar.a;
            hashSet2.remove(this);
            if (dVar.b == this) {
                dVar.b = null;
                if (!hashSet2.isEmpty()) {
                    DefaultDrmSession defaultDrmSession = (DefaultDrmSession) hashSet2.iterator().next();
                    dVar.b = defaultDrmSession;
                    f.b bVarB = defaultDrmSession.b.b();
                    defaultDrmSession.x = bVarB;
                    c cVar2 = defaultDrmSession.r;
                    String str2 = vjg.a;
                    bVarB.getClass();
                    cVar2.getClass();
                    cVar2.obtainMessage(1, new d(uz8.c.getAndIncrement(), true, SystemClock.elapsedRealtime(), bVarB)).sendToTarget();
                }
            }
            if (defaultDrmSessionManager.l != -9223372036854775807L) {
                Handler handler2 = defaultDrmSessionManager.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                defaultDrmSessionManager.o.remove(this);
            }
        }
        defaultDrmSessionManager.k();
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean g(String str) {
        n();
        byte[] bArr = this.u;
        ka2.r(bArr);
        return this.b.m(str, bArr);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        n();
        return this.o;
    }

    @RequiresNonNull({RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY})
    public final void h(boolean z) {
        long jMin;
        String str;
        Set<a.C0043a> set;
        if (this.f) {
            return;
        }
        byte[] bArr = this.u;
        String str2 = vjg.a;
        boolean z2 = true;
        if (this.v == null) {
            m(bArr, 1, z);
            return;
        }
        if (this.o != 4) {
            try {
                this.b.d(this.u, this.v);
            } catch (Exception | NoSuchMethodError e2) {
                j(1, e2);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (zr1.d.equals(this.l)) {
            n();
            byte[] bArr2 = this.u;
            Pair pair = null;
            Map<String, String> mapA = bArr2 == null ? null : this.b.a(bArr2);
            if (mapA != null) {
                long j = -9223372036854775807L;
                try {
                    str = mapA.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                long j2 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                Long lValueOf = Long.valueOf(j2);
                try {
                    String str3 = mapA.get("PlaybackDurationRemaining");
                    if (str3 != null) {
                        j = Long.parseLong(str3);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (jMin <= 60) {
            zkd.u("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            m(bArr, 2, z);
            return;
        }
        if (jMin <= 0) {
            j(2, new KeysExpiredException());
            return;
        }
        this.o = 4;
        hz2<a.C0043a> hz2Var = this.h;
        synchronized (hz2Var.a) {
            set = hz2Var.c;
        }
        Iterator<a.C0043a> it = set.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @EnsuresNonNullIf(expression = {RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY}, result = true)
    public final boolean i() {
        int i = this.o;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            androidx.media3.exoplayer.drm.DrmSession$DrmSessionException r0 = new androidx.media3.exoplayer.drm.DrmSession$DrmSessionException
            boolean r1 = r7 instanceof android.media.MediaDrm.MediaDrmStateException
            r2 = 1
            if (r1 == 0) goto L17
            r6 = r7
            android.media.MediaDrm$MediaDrmStateException r6 = (android.media.MediaDrm.MediaDrmStateException) r6
            java.lang.String r6 = r6.getDiagnosticInfo()
            int r6 = defpackage.vjg.y(r6)
            int r6 = defpackage.vjg.x(r6)
            goto L5a
        L17:
            boolean r1 = r7 instanceof android.media.MediaDrmResetException
            r3 = 6006(0x1776, float:8.416E-42)
            if (r1 == 0) goto L1f
        L1d:
            r6 = r3
            goto L5a
        L1f:
            boolean r1 = r7 instanceof android.media.NotProvisionedException
            r4 = 6002(0x1772, float:8.41E-42)
            if (r1 != 0) goto L54
            boolean r1 = androidx.media3.exoplayer.drm.c.b(r7)
            if (r1 == 0) goto L2c
            goto L54
        L2c:
            boolean r1 = r7 instanceof android.media.DeniedByServerException
            if (r1 == 0) goto L33
            r6 = 6007(0x1777, float:8.418E-42)
            goto L5a
        L33:
            boolean r1 = r7 instanceof androidx.media3.exoplayer.drm.UnsupportedDrmException
            if (r1 == 0) goto L3a
            r6 = 6001(0x1771, float:8.409E-42)
            goto L5a
        L3a:
            boolean r1 = r7 instanceof androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MissingSchemeDataException
            if (r1 == 0) goto L41
            r6 = 6003(0x1773, float:8.412E-42)
            goto L5a
        L41:
            boolean r1 = r7 instanceof androidx.media3.exoplayer.drm.KeysExpiredException
            if (r1 == 0) goto L48
            r6 = 6008(0x1778, float:8.419E-42)
            goto L5a
        L48:
            if (r6 != r2) goto L4b
            goto L1d
        L4b:
            r1 = 2
            if (r6 != r1) goto L51
            r6 = 6004(0x1774, float:8.413E-42)
            goto L5a
        L51:
            r1 = 3
            if (r6 != r1) goto L56
        L54:
            r6 = r4
            goto L5a
        L56:
            defpackage.o6.h()
            return
        L5a:
            r0.<init>(r6, r7)
            r5.t = r0
            java.lang.String r6 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            defpackage.zkd.x(r6, r0, r7)
            boolean r6 = r7 instanceof java.lang.Exception
            if (r6 == 0) goto L8c
            hz2<androidx.media3.exoplayer.drm.a$a> r6 = r5.h
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            java.util.Set<E> r6 = r6.c     // Catch: java.lang.Throwable -> L89
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            java.util.Iterator r6 = r6.iterator()
        L76:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r6.next()
            androidx.media3.exoplayer.drm.a$a r0 = (androidx.media3.exoplayer.drm.a.C0043a) r0
            r1 = r7
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0.d(r1)
            goto L76
        L89:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            throw r5
        L8c:
            boolean r6 = r7 instanceof java.lang.Error
            if (r6 == 0) goto La8
            boolean r6 = androidx.media3.exoplayer.drm.c.c(r7)
            if (r6 != 0) goto La0
            boolean r6 = androidx.media3.exoplayer.drm.c.b(r7)
            if (r6 == 0) goto L9d
            goto La0
        L9d:
            java.lang.Error r7 = (java.lang.Error) r7
            throw r7
        La0:
            int r6 = r5.o
            r7 = 4
            if (r6 == r7) goto La7
            r5.o = r2
        La7:
            return
        La8:
            java.lang.String r5 = "Unexpected Throwable subclass"
            defpackage.ja.m(r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.DefaultDrmSession.j(int, java.lang.Throwable):void");
    }

    public final void k(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || androidx.media3.exoplayer.drm.c.b(th)) {
            ((DefaultDrmSessionManager.d) this.c).b(this);
        } else {
            j(z ? 1 : 2, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {com.datadog.android.rum.internal.domain.scope.RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY}, result = true)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l() {
        /*
            r4 = this;
            boolean r0 = r4.i()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            androidx.media3.exoplayer.drm.f r0 = r4.b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            byte[] r0 = r0.c()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            r4.u = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            androidx.media3.exoplayer.drm.f r2 = r4.b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            sdb r3 = r4.j     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            r2.h(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            androidx.media3.exoplayer.drm.f r0 = r4.b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            byte[] r2 = r4.u     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            ws5 r0 = r0.i(r2)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            r4.s = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            r0 = 3
            r4.o = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            hz2<androidx.media3.exoplayer.drm.a$a> r2 = r4.h     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            java.lang.Object r3 = r2.a     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            monitor-enter(r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            java.util.Set<E> r2 = r2.c     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
        L30:
            boolean r3 = r2.hasNext()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            androidx.media3.exoplayer.drm.a$a r3 = (androidx.media3.exoplayer.drm.a.C0043a) r3     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            r3.c(r0)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            goto L30
        L40:
            byte[] r0 = r4.u     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            r0.getClass()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
            return r1
        L46:
            r0 = move-exception
            goto L4d
        L48:
            r0 = move-exception
            goto L4d
        L4a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            throw r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5f
        L4d:
            boolean r2 = androidx.media3.exoplayer.drm.c.b(r0)
            if (r2 == 0) goto L5b
            androidx.media3.exoplayer.drm.DefaultDrmSession$a r0 = r4.c
            androidx.media3.exoplayer.drm.DefaultDrmSessionManager$d r0 = (androidx.media3.exoplayer.drm.DefaultDrmSessionManager.d) r0
            r0.b(r4)
            goto L66
        L5b:
            r4.j(r1, r0)
            goto L66
        L5f:
            androidx.media3.exoplayer.drm.DefaultDrmSession$a r0 = r4.c
            androidx.media3.exoplayer.drm.DefaultDrmSessionManager$d r0 = (androidx.media3.exoplayer.drm.DefaultDrmSessionManager.d) r0
            r0.b(r4)
        L66:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.DefaultDrmSession.l():boolean");
    }

    public final void m(byte[] bArr, int i, boolean z) {
        try {
            f.a aVarL = this.b.l(bArr, this.a, i, this.g);
            this.w = aVarL;
            c cVar = this.r;
            String str = vjg.a;
            aVarL.getClass();
            cVar.getClass();
            cVar.obtainMessage(2, new d(uz8.c.getAndIncrement(), z, SystemClock.elapsedRealtime(), aVarL)).sendToTarget();
        } catch (Exception | NoSuchMethodError e2) {
            k(e2, true);
        }
    }

    public final void n() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.m;
        if (threadCurrentThread != looper.getThread()) {
            zkd.U("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
