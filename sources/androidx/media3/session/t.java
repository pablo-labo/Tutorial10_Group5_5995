package androidx.media3.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import androidx.media3.session.LegacyConversions;
import androidx.media3.session.b;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.media3.session.legacy.RatingCompat;
import androidx.media3.session.legacy.h;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.t;
import androidx.media3.session.t.a;
import defpackage.aw5;
import defpackage.e47;
import defpackage.emf;
import defpackage.f35;
import defpackage.gdb;
import defpackage.hz8;
import defpackage.i47;
import defpackage.ij9;
import defpackage.j2;
import defpackage.ka2;
import defpackage.ky0;
import defpackage.l35;
import defpackage.l5;
import defpackage.lk9;
import defpackage.m35;
import defpackage.nl3;
import defpackage.oj9;
import defpackage.ox0;
import defpackage.ph1;
import defpackage.q20;
import defpackage.qic;
import defpackage.qyc;
import defpackage.r20;
import defpackage.r6;
import defpackage.r91;
import defpackage.rk9;
import defpackage.ryc;
import defpackage.s34;
import defpackage.sk3;
import defpackage.sk9;
import defpackage.uh9;
import defpackage.v8e;
import defpackage.v9e;
import defpackage.vdb;
import defpackage.vh6;
import defpackage.vjg;
import defpackage.vk3;
import defpackage.w8e;
import defpackage.wk3;
import defpackage.xk9;
import defpackage.yk3;
import defpackage.yk9;
import defpackage.yv5;
import defpackage.z25;
import defpackage.zkd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class t extends MediaSessionCompat.b {
    public static final int x;
    public final androidx.media3.session.b<h.b> f;
    public final s g;
    public final androidx.media3.session.legacy.h h;
    public final e i;
    public final c j;
    public final MediaSessionCompat k;
    public final f l;
    public final ComponentName m;
    public xk9 n;
    public final boolean o = true;
    public volatile long p;
    public e.a q;
    public int r;
    public Bundle s;
    public e47<androidx.media3.session.a> t;
    public e47<androidx.media3.session.a> u;
    public w8e v;
    public gdb.a w;

    public class a implements yv5<r.e> {
        public final /* synthetic */ r.d a;
        public final /* synthetic */ boolean b;

        public a(r.d dVar, boolean z) {
            this.a = dVar;
            this.b = z;
        }

        @Override // defpackage.yv5
        public final void onSuccess(r.e eVar) {
            s sVar = t.this.g;
            Handler handler = sVar.l;
            boolean z = this.b;
            r.d dVar = this.a;
            vjg.T(handler, new ph1(sVar, dVar, new m35(this, eVar, z, dVar)));
        }

        @Override // defpackage.yv5
        public final void t(Throwable th) {
        }
    }

    public static final class b {
        public static void a(MediaSessionCompat mediaSessionCompat, ComponentName componentName) {
            try {
                MediaSession mediaSession = mediaSessionCompat.a.a;
                mediaSession.getClass();
                mediaSession.setMediaButtonBroadcastReceiver(componentName);
            } catch (IllegalArgumentException e) {
                if (!Build.MANUFACTURER.equals("motorola")) {
                    throw e;
                }
                zkd.x("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e);
            }
        }
    }

    public static class c extends Handler {
        public final androidx.media3.session.b<h.b> a;

        public c(Looper looper, androidx.media3.session.b<h.b> bVar) {
            super(looper);
            this.a = bVar;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            r.d dVar = (r.d) message.obj;
            androidx.media3.session.b<h.b> bVar = this.a;
            if (bVar.k(dVar)) {
                r.c cVar = dVar.e;
                ka2.r(cVar);
                cVar.f();
                bVar.o(dVar);
            }
        }
    }

    public static final class d implements r.c {
        public final h.b a;

        public d(h.b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != d.class) {
                return false;
            }
            return Objects.equals(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return Objects.hash(this.a);
        }
    }

    public final class e implements r.c {
        public Uri c;
        public oj9 a = oj9.K;
        public String b = "";
        public long d = -9223372036854775807L;

        public class a implements yv5<Bitmap> {
            public final /* synthetic */ oj9 a;
            public final /* synthetic */ String b;
            public final /* synthetic */ Uri c;
            public final /* synthetic */ long d;

            public a(oj9 oj9Var, String str, Uri uri, long j) {
                this.a = oj9Var;
                this.b = str;
                this.c = uri;
                this.d = j;
            }

            @Override // defpackage.yv5
            public final void onSuccess(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                t tVar = t.this;
                if (this != tVar.q) {
                    return;
                }
                t.D(tVar.k, LegacyConversions.n(this.a, this.b, this.c, this.d, bitmap2));
                s sVar = tVar.g;
                vjg.T(sVar.o, new f35(sVar, 1));
            }

            @Override // defpackage.yv5
            public final void t(Throwable th) {
                if (this != t.this.q) {
                    return;
                }
                zkd.T("MediaSessionLegacyStub", "Failed to load bitmap: " + th.getMessage());
            }
        }

        public e() {
        }

        @Override // androidx.media3.session.r.c
        public final void a(int i, v8e v8eVar) {
            Bundle bundle = Bundle.EMPTY;
            MediaSessionCompat mediaSessionCompat = t.this.k;
            String str = v8eVar.b;
            mediaSessionCompat.getClass();
            if (TextUtils.isEmpty(str)) {
                l5.q("event cannot be null or empty");
            } else {
                mediaSessionCompat.a.a.sendSessionEvent(str, bundle);
            }
        }

        @Override // androidx.media3.session.r.c
        public final void e(int i, Bundle bundle) {
            ka2.l(!bundle.containsKey("EXO_SPEED"));
            ka2.l(!bundle.containsKey("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID"));
            Bundle bundle2 = new Bundle(bundle);
            t tVar = t.this;
            tVar.s = bundle2;
            if (!tVar.u.isEmpty()) {
                tVar.L();
            }
            tVar.k.a.a.setExtras(tVar.s);
            tVar.M(tVar.g.t);
        }

        @Override // androidx.media3.session.r.c
        public final void f() {
        }

        @Override // androidx.media3.session.r.c
        public final void g(int i, v9e v9eVar, boolean z, boolean z2, int i2) {
            t tVar = t.this;
            tVar.M(tVar.g.t);
        }

        @Override // androidx.media3.session.r.c
        public final void h(int i, gdb.a aVar) {
            t tVar = t.this;
            vdb vdbVar = tVar.g.t;
            int i2 = vdbVar.O0(20) ? 4 : 0;
            if (tVar.r != i2) {
                tVar.r = i2;
                tVar.k.a.a.setFlags(i2 | 3);
            }
            tVar.M(vdbVar);
        }

        public final void j(ox0 ox0Var) {
            t tVar = t.this;
            if (tVar.g.t.g0().a == 0) {
                int iW = LegacyConversions.w(ox0Var);
                MediaSessionCompat.e eVar = tVar.k.a;
                eVar.getClass();
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                builder.setLegacyStreamType(iW);
                eVar.a.setPlaybackToLocal(builder.build());
            }
        }

        public final void k() {
            int i;
            xk9 xk9Var;
            t tVar = t.this;
            MediaSessionCompat mediaSessionCompat = tVar.k;
            vdb vdbVar = tVar.g.t;
            if (vdbVar.g0().a == 0) {
                xk9Var = null;
            } else {
                gdb.a aVarV = vdbVar.V();
                if (aVarV.a.a(26, 34)) {
                    i = aVarV.a.a(25, 33) ? 2 : 1;
                } else {
                    i = 0;
                }
                Handler handler = new Handler(vdbVar.a.Q0());
                int iS = vdbVar.O0(23) ? vdbVar.S() : 0;
                s34 s34VarG0 = vdbVar.g0();
                xk9Var = new xk9(i, s34VarG0.c, iS, s34VarG0.d, handler, vdbVar);
            }
            tVar.n = xk9Var;
            if (xk9Var != null) {
                mediaSessionCompat.a.a.setPlaybackToRemote(xk9Var.a());
                return;
            }
            int iW = LegacyConversions.w(vdbVar.O0(21) ? vdbVar.f0() : ox0.h);
            MediaSessionCompat.e eVar = mediaSessionCompat.a;
            eVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(iW);
            eVar.a.setPlaybackToLocal(builder.build());
        }

        public final void l(ij9 ij9Var) {
            r();
            t tVar = t.this;
            MediaSessionCompat mediaSessionCompat = tVar.k;
            if (ij9Var == null) {
                mediaSessionCompat.a.a.setRatingType(0);
            } else {
                mediaSessionCompat.a.a.setRatingType(LegacyConversions.x(ij9Var.d.i));
            }
            tVar.M(tVar.g.t);
        }

        public final void m(int i, vdb vdbVar) {
            q(vdbVar.U0());
            n(vdbVar.O0(18) ? vdbVar.s0() : oj9.K);
            vdbVar.V0();
            r();
            p(vdbVar.D0());
            o(vdbVar.i());
            vdbVar.g0();
            k();
            int i2 = vdbVar.O0(20) ? 4 : 0;
            t tVar = t.this;
            if (tVar.r != i2) {
                tVar.r = i2;
                tVar.k.a.a.setFlags(i2 | 3);
            }
            l(vdbVar.T0());
        }

        public final void n(oj9 oj9Var) {
            t tVar = t.this;
            MediaSessionCompat mediaSessionCompat = tVar.k;
            CharSequence queueTitle = mediaSessionCompat.b.a.a.getQueueTitle();
            CharSequence charSequence = oj9Var.a;
            if (TextUtils.equals(queueTitle, charSequence)) {
                return;
            }
            vdb vdbVar = tVar.g.t;
            if (!tVar.w.a(17) || !vdbVar.V().a(17)) {
                charSequence = null;
            }
            mediaSessionCompat.a.a.setQueueTitle(charSequence);
        }

        public final void o(int i) {
            MediaSessionCompat mediaSessionCompat = t.this.k;
            int iP = LegacyConversions.p(i);
            MediaSessionCompat.e eVar = mediaSessionCompat.a;
            if (eVar.j != iP) {
                eVar.j = iP;
                synchronized (eVar.d) {
                    int iBeginBroadcast = eVar.f.beginBroadcast() - 1;
                    while (true) {
                        RemoteCallbackList<androidx.media3.session.legacy.a> remoteCallbackList = eVar.f;
                        if (iBeginBroadcast >= 0) {
                            try {
                                ((androidx.media3.session.legacy.a) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).m(iP);
                            } catch (RemoteException | SecurityException e) {
                                Log.e("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                            }
                            iBeginBroadcast--;
                        } else {
                            remoteCallbackList.finishBroadcast();
                        }
                    }
                }
            }
        }

        public final void p(boolean z) {
            MediaSessionCompat mediaSessionCompat = t.this.k;
            i47<String> i47Var = LegacyConversions.a;
            MediaSessionCompat.e eVar = mediaSessionCompat.a;
            if (eVar.k != z) {
                eVar.k = z ? 1 : 0;
                synchronized (eVar.d) {
                    int iBeginBroadcast = eVar.f.beginBroadcast() - 1;
                    while (true) {
                        RemoteCallbackList<androidx.media3.session.legacy.a> remoteCallbackList = eVar.f;
                        if (iBeginBroadcast >= 0) {
                            try {
                                ((androidx.media3.session.legacy.a) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).R(z ? 1 : 0);
                            } catch (RemoteException | SecurityException e) {
                                Log.e("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                            }
                            iBeginBroadcast--;
                        } else {
                            remoteCallbackList.finishBroadcast();
                        }
                    }
                }
            }
        }

        public final void q(emf emfVar) {
            s(emfVar);
            r();
        }

        public final void r() {
            long j;
            Uri uri;
            oj9 oj9Var;
            Uri uri2;
            t tVar = t.this;
            s sVar = tVar.g;
            vdb vdbVar = sVar.t;
            ij9 ij9VarT0 = vdbVar.T0();
            oj9 oj9VarV0 = vdbVar.V0();
            long duration = -9223372036854775807L;
            if ((!vdbVar.O0(16) || !vdbVar.S0()) && vdbVar.O0(16)) {
                duration = vdbVar.getDuration();
            }
            String str = ij9VarT0 != null ? ij9VarT0.a : "";
            Bitmap bitmap = null;
            Uri uri3 = (ij9VarT0 == null || (uri2 = ij9VarT0.f.a) == null) ? null : uri2;
            if (Objects.equals(this.a, oj9VarV0) && Objects.equals(this.b, str) && Objects.equals(this.c, uri3) && this.d == duration) {
                return;
            }
            this.b = str;
            this.c = uri3;
            this.a = oj9VarV0;
            this.d = duration;
            hz8<Bitmap> hz8VarB = sVar.m.b(oj9VarV0);
            if (hz8VarB != null) {
                tVar.q = null;
                if (hz8VarB.isDone()) {
                    try {
                        bitmap = (Bitmap) aw5.J1(hz8VarB);
                    } catch (CancellationException | ExecutionException e) {
                        zkd.T("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                    }
                    j = duration;
                    uri = uri3;
                    oj9Var = oj9VarV0;
                } else {
                    j = duration;
                    uri = uri3;
                    oj9Var = oj9VarV0;
                    a aVar = new a(oj9Var, str, uri, j);
                    str = str;
                    tVar.q = aVar;
                    Handler handler = sVar.l;
                    Objects.requireNonNull(handler);
                    hz8VarB.a(new aw5.a(hz8VarB, aVar), new nl3(handler));
                }
            } else {
                j = duration;
                uri = uri3;
                oj9Var = oj9VarV0;
            }
            t.D(tVar.k, LegacyConversions.n(oj9Var, str, uri, j, bitmap));
        }

        public final void s(emf emfVar) {
            t tVar = t.this;
            s sVar = tVar.g;
            vdb vdbVar = sVar.t;
            if (!tVar.w.a(17) || !vdbVar.V().a(17) || emfVar.p()) {
                t.C(tVar.k, null);
                return;
            }
            i47<String> i47Var = LegacyConversions.a;
            ArrayList arrayList = new ArrayList();
            emf.d dVar = new emf.d();
            for (int i = 0; i < emfVar.o(); i++) {
                arrayList.add(emfVar.m(i, dVar, 0L).b);
            }
            ArrayList arrayList2 = new ArrayList();
            yk9 yk9Var = new yk9(this, new AtomicInteger(0), arrayList, arrayList2, 0);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                byte[] bArr = ((ij9) arrayList.get(i2)).d.k;
                if (bArr == null) {
                    arrayList2.add(null);
                    yk9Var.run();
                } else {
                    hz8<Bitmap> hz8VarC = sVar.m.c(bArr);
                    arrayList2.add(hz8VarC);
                    Handler handler = sVar.l;
                    Objects.requireNonNull(handler);
                    hz8VarC.a(yk9Var, new nl3(handler));
                }
            }
        }
    }

    public final class f extends BroadcastReceiver {
        public f() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            KeyEvent keyEvent;
            if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                t.this.k.b.a.a.dispatchMediaButtonEvent(keyEvent);
            }
        }
    }

    public interface g {
        void d(r.d dVar);
    }

    static {
        x = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t(androidx.media3.session.s r12, android.net.Uri r13, android.os.Handler r14, android.os.Bundle r15, defpackage.e47 r16, defpackage.e47 r17, defpackage.w8e r18, gdb.a r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.t.<init>(androidx.media3.session.s, android.net.Uri, android.os.Handler, android.os.Bundle, e47, e47, w8e, gdb$a, android.os.Bundle):void");
    }

    public static void C(MediaSessionCompat mediaSessionCompat, ArrayList arrayList) {
        if (arrayList != null) {
            mediaSessionCompat.getClass();
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                long j = ((MediaSessionCompat.QueueItem) it.next()).b;
                if (hashSet.contains(Long.valueOf(j))) {
                    Log.e("MediaSessionCompat", r6.c(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        MediaSessionCompat.e eVar = mediaSessionCompat.a;
        MediaSession mediaSession = eVar.a;
        eVar.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MediaSessionCompat.QueueItem queueItem = (MediaSessionCompat.QueueItem) it2.next();
            MediaSession.QueueItem queueItem2 = queueItem.c;
            if (queueItem2 == null) {
                MediaSession.QueueItem queueItem3 = new MediaSession.QueueItem(queueItem.a.b(), queueItem.b);
                queueItem.c = queueItem3;
                queueItem2 = queueItem3;
            }
            arrayList2.add(queueItem2);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void D(MediaSessionCompat mediaSessionCompat, MediaMetadataCompat mediaMetadataCompat) {
        MediaSessionCompat.e eVar = mediaSessionCompat.a;
        eVar.i = mediaMetadataCompat;
        MediaSession mediaSession = eVar.a;
        Bundle bundle = mediaMetadataCompat.a;
        if (mediaMetadataCompat.b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = MediaMetadataCompat.c.get(str);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, bundle.getLong(str));
                } else if (iIntValue == 1) {
                    builder.putText(str, bundle.getString(str));
                } else if (iIntValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (iIntValue != 3) {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    }
                } else {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                }
            }
            mediaMetadataCompat.b = builder.build();
        }
        mediaSession.setMetadata(mediaMetadataCompat.b);
    }

    public static ij9 E(String str, Uri uri, String str2, Bundle bundle) {
        ij9.b.a aVar = new ij9.b.a();
        ryc rycVar = ryc.V;
        e47.b bVar = e47.b;
        qyc qycVar = qyc.e;
        List list = Collections.EMPTY_LIST;
        qyc qycVar2 = qyc.e;
        ij9.e.a aVar2 = new ij9.e.a();
        ij9.g gVar = ij9.g.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        ij9.g.a aVar3 = new ij9.g.a();
        aVar3.a = uri;
        aVar3.b = str2;
        aVar3.c = bundle;
        return new ij9(str3, new ij9.c(aVar), null, new ij9.e(aVar2), oj9.K, new ij9.g(aVar3));
    }

    public static ComponentName I(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void A(final long j) {
        if (j < 0) {
            return;
        }
        G(10, new g() { // from class: jk9
            @Override // androidx.media3.session.t.g
            public final void d(r.d dVar) {
                this.a.g.t.m0((int) j);
            }
        }, this.k.a.d(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void B() {
        G(3, new uh9(this, 3), this.k.a.d(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.session.legacy.PlaybackStateCompat F(defpackage.vdb r33) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.t.F(vdb):androidx.media3.session.legacy.PlaybackStateCompat");
    }

    public final void G(final int i, final g gVar, final h.b bVar, final boolean z) {
        s sVar = this.g;
        if (sVar.k()) {
            return;
        }
        if (bVar != null) {
            vjg.T(sVar.l, new Runnable() { // from class: pk9
                @Override // java.lang.Runnable
                public final void run() {
                    t.g gVar2 = gVar;
                    t tVar = this.a;
                    s sVar2 = tVar.g;
                    if (sVar2.k()) {
                        return;
                    }
                    boolean zIsActive = tVar.k.a.a.isActive();
                    int i2 = i;
                    h.b bVar2 = bVar;
                    if (!zIsActive) {
                        StringBuilder sbG = o6.g(i2, "Ignore incoming player command before initialization. command=", ", pid=");
                        sbG.append(bVar2.a.b);
                        zkd.T("MediaSessionLegacyStub", sbG.toString());
                        return;
                    }
                    r.d dVarK = tVar.K(bVar2);
                    if (dVarK == null) {
                        return;
                    }
                    if (!tVar.f.l(dVarK, i2)) {
                        if (i2 != 1 || sVar2.t.W()) {
                            return;
                        }
                        zkd.T("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                        return;
                    }
                    zng zngVar = sVar2.e;
                    sVar2.v(dVarK);
                    zngVar.getClass();
                    try {
                        gVar2.d(dVarK);
                    } catch (RemoteException e2) {
                        zkd.U("MediaSessionLegacyStub", "Exception in " + dVarK, e2);
                    }
                    if (z) {
                        new SparseBooleanArray().append(i2, true);
                        sVar2.s(dVarK);
                    }
                }
            });
            return;
        }
        zkd.u("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i);
    }

    public final void H(final v8e v8eVar, final int i, final g gVar, final h.b bVar) {
        if (bVar != null) {
            vjg.T(this.g.l, new Runnable() { // from class: qk9
                @Override // java.lang.Runnable
                public final void run() {
                    t.g gVar2 = gVar;
                    t tVar = this.a;
                    if (tVar.g.k()) {
                        return;
                    }
                    boolean zIsActive = tVar.k.a.a.isActive();
                    v8e v8eVar2 = v8eVar;
                    int i2 = i;
                    h.b bVar2 = bVar;
                    if (!zIsActive) {
                        StringBuilder sb = new StringBuilder("Ignore incoming session command before initialization. command=");
                        sb.append(v8eVar2 == null ? Integer.valueOf(i2) : v8eVar2.b);
                        sb.append(", pid=");
                        sb.append(bVar2.a.b);
                        zkd.T("MediaSessionLegacyStub", sb.toString());
                        return;
                    }
                    r.d dVarK = tVar.K(bVar2);
                    if (dVarK == null) {
                        return;
                    }
                    b<h.b> bVar3 = tVar.f;
                    if (v8eVar2 != null) {
                        if (!bVar3.n(dVarK, v8eVar2)) {
                            return;
                        }
                    } else if (!bVar3.m(dVarK, i2)) {
                        return;
                    }
                    try {
                        gVar2.d(dVarK);
                    } catch (RemoteException e2) {
                        zkd.U("MediaSessionLegacyStub", "Exception in " + dVarK, e2);
                    }
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object objValueOf = v8eVar;
        if (v8eVar == null) {
            objValueOf = Integer.valueOf(i);
        }
        sb.append(objValueOf);
        zkd.u("MediaSessionLegacyStub", sb.toString());
    }

    public final void J(final ij9 ij9Var, final boolean z) {
        G(31, new g() { // from class: ok9
            @Override // androidx.media3.session.t.g
            public final void d(r.d dVar) {
                t tVar = this.a;
                hz8<r.e> hz8VarT = tVar.g.t(dVar, e47.n(ij9Var), -1, -9223372036854775807L);
                ((j2.i) hz8VarT).a(new aw5.a(hz8VarT, tVar.new a(dVar, z)), h54.a);
            }
        }, this.k.a.d(), false);
    }

    public final r.d K(h.b bVar) {
        r.d dVarG = this.f.g(bVar);
        if (dVarG == null) {
            r.d dVar = new r.d(bVar, 0, 0, this.h.b(bVar), new d(bVar), Bundle.EMPTY);
            r.b bVarN = this.g.n(dVar);
            if (!bVarN.a) {
                return null;
            }
            this.f.a(bVar, dVar, bVarN.b, bVarN.c);
            s sVar = this.g;
            if (!sVar.y || !s.l(dVar)) {
                sVar.e.getClass();
            }
            dVarG = dVar;
        }
        c cVar = this.j;
        long j = this.p;
        cVar.removeMessages(1001, dVarG);
        cVar.sendMessageDelayed(cVar.obtainMessage(1001, dVarG), j);
        return dVarG;
    }

    public final void L() {
        this.t = androidx.media3.session.a.e(true, androidx.media3.session.a.c(this.u, this.v, this.w), true);
        this.s.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !androidx.media3.session.a.a(2, r0));
        this.s.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !androidx.media3.session.a.a(3, this.t));
    }

    public final void M(vdb vdbVar) {
        vjg.T(this.g.l, new ky0(5, this, vdbVar));
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void b(MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat != null) {
            G(20, new lk9(this, mediaDescriptionCompat, -1), this.k.a.d(), false);
        }
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        if (mediaDescriptionCompat != null) {
            if (i == -1 || i >= 0) {
                G(20, new lk9(this, mediaDescriptionCompat, i), this.k.a.d(), false);
            }
        }
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void d(String str, final Bundle bundle, final ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            resultReceiver.send(0, this.g.j.a());
        } else {
            final v8e v8eVar = new v8e(str, Bundle.EMPTY);
            H(v8eVar, 0, new g() { // from class: nk9
                @Override // androidx.media3.session.t.g
                public final void d(r.d dVar) {
                    s sVar = this.a.g;
                    Bundle bundle2 = bundle;
                    if (bundle2 == null) {
                        bundle2 = Bundle.EMPTY;
                    }
                    hz8<x9e> hz8VarO = sVar.o(dVar, v8eVar, bundle2);
                    ResultReceiver resultReceiver2 = resultReceiver;
                    if (resultReceiver2 != null) {
                        ((u37) hz8VarO).a(new zm3(3, hz8VarO, resultReceiver2), h54.a);
                    }
                }
            }, this.k.a.d());
        }
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void e(String str, final Bundle bundle) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        final v8e v8eVar = new v8e(str, Bundle.EMPTY);
        H(v8eVar, 0, new g() { // from class: kk9
            @Override // androidx.media3.session.t.g
            public final void d(r.d dVar) {
                s sVar = this.a.g;
                Bundle bundle2 = bundle;
                if (bundle2 == null) {
                    bundle2 = Bundle.EMPTY;
                }
                sVar.o(dVar, v8eVar, bundle2);
            }
        }, this.k.a.d());
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void f() {
        G(12, new r20(this, 9), this.k.a.d(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final boolean g(Intent intent) {
        h.b bVarD = this.k.a.d();
        bVarD.getClass();
        return this.g.q(new r.d(bVarD, 0, 0, false, null, Bundle.EMPTY), intent);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void h() {
        G(1, new z25(this, 3), this.k.a.d(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void i() {
        G(1, new l35(this, 7), this.k.a.d(), false);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void j(String str, Bundle bundle) {
        J(E(str, null, null, bundle), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void k(String str, Bundle bundle) {
        J(E(null, null, str, bundle), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void l(Uri uri, Bundle bundle) {
        J(E(null, uri, null, bundle), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void m() {
        G(2, new wk3(this, 5), this.k.a.d(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void n(String str, Bundle bundle) {
        J(E(str, null, null, bundle), false);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void o(String str, Bundle bundle) {
        J(E(null, null, str, bundle), false);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void p(Uri uri, Bundle bundle) {
        J(E(null, uri, null, bundle), false);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void q(MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat == null) {
            return;
        }
        G(20, new rk9(this, mediaDescriptionCompat), this.k.a.d(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void r() {
        G(11, new q20(this, 9), this.k.a.d(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void s(long j) {
        G(5, new sk9(this, j), this.k.a.d(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void t(final float f2) {
        if (f2 <= 0.0f) {
            return;
        }
        G(13, new g() { // from class: ik9
            @Override // androidx.media3.session.t.g
            public final void d(r.d dVar) {
                this.a.g.t.h(f2);
            }
        }, this.k.a.d(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void u(RatingCompat ratingCompat) {
        v(ratingCompat);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void v(RatingCompat ratingCompat) {
        qic qicVarQ = LegacyConversions.q(ratingCompat);
        if (qicVarQ != null) {
            H(null, 40010, new yk3(this, qicVarQ), this.k.a.d());
            return;
        }
        zkd.T("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + ratingCompat);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void w(final int i) {
        G(15, new g() { // from class: mk9
            @Override // androidx.media3.session.t.g
            public final void d(r.d dVar) {
                this.a.g.t.w0(LegacyConversions.s(i));
            }
        }, this.k.a.d(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void x(final int i) {
        G(14, new g() { // from class: tk9
            @Override // androidx.media3.session.t.g
            public final void d(r.d dVar) {
                this.a.g.t.X(LegacyConversions.u(i));
            }
        }, this.k.a.d(), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void y() {
        boolean zO0 = this.g.t.O0(9);
        MediaSessionCompat mediaSessionCompat = this.k;
        if (zO0) {
            G(9, new sk3(this, 7), mediaSessionCompat.a.d(), true);
        } else {
            G(8, new vh6(this, 4), mediaSessionCompat.a.d(), true);
        }
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.b
    public final void z() {
        boolean zO0 = this.g.t.O0(7);
        MediaSessionCompat mediaSessionCompat = this.k;
        if (zO0) {
            G(7, new vk3(this, 4), mediaSessionCompat.a.d(), true);
        } else {
            G(6, new r91(this), mediaSessionCompat.a.d(), true);
        }
    }
}
