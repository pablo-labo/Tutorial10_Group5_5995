package androidx.media3.session;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.session.a;
import androidx.media3.session.d;
import androidx.media3.session.e;
import androidx.media3.session.f;
import androidx.media3.session.h;
import androidx.media3.session.j;
import androidx.media3.session.legacy.h;
import androidx.media3.session.p;
import androidx.media3.session.q;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.v;
import androidx.media3.session.x;
import com.indeed.android.jobsearch.R;
import defpackage.aw5;
import defpackage.boa;
import defpackage.e47;
import defpackage.eq2;
import defpackage.gdb;
import defpackage.ht0;
import defpackage.ka2;
import defpackage.p9;
import defpackage.qx0;
import defpackage.qyc;
import defpackage.uj9;
import defpackage.vjg;
import defpackage.yo2;
import defpackage.zkd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends Service {
    public c c;
    public q d;
    public d e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final ht0 f = new ht0();

    public static final class a {
        public static boolean a(IllegalStateException illegalStateException) {
            return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
        }
    }

    public final class b {
        public b() {
        }
    }

    public static final class c extends h.a {
        public final WeakReference<v> a;
        public final Handler b;
        public final Set<f> c;

        public c(v vVar) {
            attachInterface(this, "androidx.media3.session.IMediaSessionService");
            this.a = new WeakReference<>(vVar);
            this.b = new Handler(vVar.getApplicationContext().getMainLooper());
            this.c = Collections.synchronizedSet(new HashSet());
        }

        @Override // androidx.media3.session.h
        public final void s0(final f fVar, Bundle bundle) {
            if (fVar == null || bundle == null) {
                boa.p(fVar);
                return;
            }
            try {
                final yo2 yo2VarA = yo2.a(bundle);
                v vVar = this.a.get();
                if (vVar == null) {
                    boa.p(fVar);
                    return;
                }
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = yo2VarA.d;
                }
                final h.b bVar = new h.b(yo2VarA.c, callingPid, callingUid);
                final boolean zB = androidx.media3.session.legacy.h.a(vVar.getApplicationContext()).b(bVar);
                this.c.add(fVar);
                try {
                    this.b.post(new Runnable() { // from class: zk9
                        @Override // java.lang.Runnable
                        public final void run() {
                            h.b bVar2 = bVar;
                            yo2 yo2Var = yo2VarA;
                            boolean z = zB;
                            v.c cVar = this.a;
                            Set<f> set = cVar.c;
                            f fVar2 = fVar;
                            set.remove(fVar2);
                            try {
                                v vVar2 = cVar.a.get();
                                if (vVar2 == null) {
                                    return;
                                }
                                int i = yo2Var.a;
                                int i2 = yo2Var.b;
                                vVar2.d(new r.d(bVar2, i, i2, z, new x.a(fVar2, i2), yo2Var.e));
                                return;
                            } catch (Exception e) {
                                zkd.U("MSessionService", "Failed to add a session to session service", e);
                                return;
                            } finally {
                                boa.p(fVar2);
                            }
                            boa.p(fVar2);
                        }
                    });
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            } catch (RuntimeException e) {
                zkd.U("MSessionService", "Ignoring malformed Bundle for ConnectionRequest", e);
                boa.p(fVar);
            }
        }
    }

    public final q a() {
        if (this.d == null) {
            ka2.s(getBaseContext(), "Accessing service context before onCreate()");
            e.a aVar = new e.a(getApplicationContext());
            ka2.q(!aVar.c);
            e eVar = new e(aVar);
            aVar.c = true;
            if (this.e == null) {
                this.e = new d(this);
            }
            this.d = new q(this, eVar, this.e);
        }
        return this.d;
    }

    public final ArrayList b() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.f.values());
        }
        return arrayList;
    }

    public final boolean c(r rVar) {
        boolean zContainsKey;
        synchronized (this.a) {
            zContainsKey = this.f.containsKey(rVar.a.i);
        }
        return zContainsKey;
    }

    public abstract void d(r.d dVar);

    public void e(final r rVar, final boolean z) {
        e47<androidx.media3.session.a> e47VarN0;
        final q qVarA = a();
        if (!qVarA.a.c(rVar) || !qVarA.c(rVar)) {
            qVarA.a.stopForeground(1);
            qVarA.Z = false;
            if (qVarA.Y != null) {
                qVarA.c.b.cancel(null, 1001);
                qVarA.X++;
                qVarA.Y = null;
                return;
            }
            return;
        }
        int i = qVarA.X + 1;
        qVarA.X = i;
        j jVarA = qVarA.a(rVar);
        jVarA.getClass();
        jVarA.V0();
        j.b bVar = jVarA.c;
        if (bVar.o0()) {
            e47VarN0 = bVar.N0();
        } else {
            e47.b bVar2 = e47.b;
            e47VarN0 = qyc.e;
        }
        final e47<androidx.media3.session.a> e47Var = e47VarN0;
        final uj9 uj9Var = new uj9(qVarA, i, rVar);
        vjg.T(new Handler(rVar.a().Q0()), new Runnable() { // from class: vj9
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                p.a aVar;
                vj9 vj9Var;
                e eVar;
                pla plaVar;
                q qVar;
                e eVar2;
                gdb gdbVar;
                s sVar;
                pla plaVar2;
                q qVar2 = qVarA;
                p.b bVar3 = qVar2.W;
                p.a aVar2 = qVar2.b;
                e eVar3 = (e) bVar3;
                Context context = eVar3.a;
                NotificationManager notificationManager = eVar3.b;
                if (notificationManager.getNotificationChannel("default_channel_id") == null) {
                    NotificationChannel notificationChannel = new NotificationChannel("default_channel_id", context.getString(R.string.default_notification_channel_name), 2);
                    if (Build.VERSION.SDK_INT <= 27) {
                        notificationChannel.setShowBadge(false);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                e47.a aVar3 = new e47.a();
                int i3 = 0;
                while (true) {
                    e47 e47Var2 = e47Var;
                    if (i3 >= e47Var2.size()) {
                        break;
                    }
                    a aVar4 = (a) e47Var2.get(i3);
                    v8e v8eVar = aVar4.a;
                    if (v8eVar != null && v8eVar.a == 0 && aVar4.i) {
                        aVar3.c((a) e47Var2.get(i3));
                    }
                    i3++;
                }
                r rVar2 = rVar;
                gdb gdbVarA = rVar2.a();
                s sVar2 = rVar2.a;
                pla plaVar3 = new pla(context, "default_channel_id");
                vm9 vm9Var = new vm9(rVar2);
                gdb.a aVarV = gdbVarA.V();
                qyc qycVarF = aVar3.f();
                boolean Z = vjg.Z(gdbVarA, sVar2.p);
                qyc qycVarE = a.e(true, qycVarF, true);
                boolean zA = a.a(2, qycVarE);
                int i4 = 2;
                boolean zA2 = a.a(3, qycVarE);
                e47.a aVar5 = new e47.a();
                if (zA) {
                    aVar5.c(((a) qycVarE.get(0)).b(b47.d(2)));
                    i2 = 1;
                } else {
                    if (aVarV.a.a(7, 6)) {
                        a.C0056a c0056a = new a.C0056a(57413);
                        c0056a.c(6);
                        c0056a.f = context.getString(R.string.media3_controls_seek_to_previous_description);
                        aVar5.c(c0056a.a());
                    }
                    i2 = 0;
                }
                if (!aVarV.a(1)) {
                    aVar = aVar2;
                } else if (Z) {
                    aVar = aVar2;
                    a.C0056a c0056a2 = new a.C0056a(57399);
                    c0056a2.c(1);
                    c0056a2.f = context.getString(R.string.media3_controls_play_description);
                    aVar5.c(c0056a2.a());
                } else {
                    aVar = aVar2;
                    a.C0056a c0056a3 = new a.C0056a(57396);
                    c0056a3.c(1);
                    c0056a3.f = context.getString(R.string.media3_controls_pause_description);
                    aVar5.c(c0056a3.a());
                }
                if (zA2) {
                    aVar5.c(((a) qycVarE.get(i2)).b(b47.d(3)));
                    i2++;
                } else if (aVarV.a.a(9, 8)) {
                    a.C0056a c0056a4 = new a.C0056a(57412);
                    c0056a4.c(8);
                    c0056a4.f = context.getString(R.string.media3_controls_seek_to_next_description);
                    aVar5.c(c0056a4.a());
                }
                while (i2 < qycVarE.d) {
                    aVar5.c(((a) qycVarE.get(i2)).b(b47.d(6)));
                    i2++;
                }
                qyc qycVarF2 = aVar5.f();
                int[] iArrCopyOf = new int[3];
                int[] iArr = new int[3];
                Arrays.fill(iArrCopyOf, -1);
                Arrays.fill(iArr, -1);
                boolean z2 = false;
                int i5 = 0;
                while (i5 < qycVarF2.d) {
                    a aVar6 = (a) qycVarF2.get(i5);
                    v8e v8eVar2 = aVar6.a;
                    Context context2 = context;
                    int i6 = aVar6.b;
                    qyc qycVar = qycVarF2;
                    CharSequence charSequence = aVar6.f;
                    int[] iArr2 = iArr;
                    int i7 = aVar6.d;
                    boolean z3 = z2;
                    b47 b47Var = aVar6.h;
                    int i8 = i5;
                    ArrayList<mla> arrayList = plaVar3.b;
                    if (v8eVar2 != null) {
                        d dVar = (d) aVar;
                        qVar = qVar2;
                        v vVar = dVar.a;
                        ka2.l(v8eVar2.a == 0);
                        PorterDuff.Mode mode = IconCompat.k;
                        eVar2 = eVar3;
                        plaVar2 = plaVar3;
                        IconCompat iconCompatA = IconCompat.a(vVar.getResources(), vVar.getPackageName(), i7);
                        String str = v8eVar2.b;
                        Bundle bundle = v8eVar2.c;
                        gdbVar = gdbVarA;
                        Intent intent = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
                        intent.setData(sVar2.b);
                        sVar = sVar2;
                        intent.setComponent(new ComponentName(vVar, vVar.getClass()));
                        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", str);
                        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", bundle);
                        int i9 = dVar.b + 1;
                        dVar.b = i9;
                        arrayList.add(new mla(iconCompatA, charSequence, PendingIntent.getService(vVar, i9, intent, 201326592)));
                    } else {
                        qVar = qVar2;
                        eVar2 = eVar3;
                        gdbVar = gdbVarA;
                        sVar = sVar2;
                        plaVar2 = plaVar3;
                        ka2.q(i6 != -1);
                        PorterDuff.Mode mode2 = IconCompat.k;
                        context2.getClass();
                        IconCompat iconCompatA2 = IconCompat.a(context2.getResources(), context2.getPackageName(), i7);
                        d dVar2 = (d) aVar;
                        long j = i6;
                        v vVar2 = dVar2.a;
                        int i10 = (j == 8 || j == 9) ? 87 : (j == 6 || j == 7) ? 88 : j == 3 ? 86 : j == 12 ? 90 : j == 11 ? 89 : j == 1 ? 85 : 0;
                        Intent intentA = dVar2.a(rVar2, i10);
                        arrayList.add(new mla(iconCompatA2, charSequence, (j != 1 || rVar2.a().W()) ? PendingIntent.getService(vVar2, i10, intentA, 67108864) : PendingIntent.getForegroundService(vVar2, i10, intentA, 67108864)));
                    }
                    int i11 = aVar6.g.getInt("androidx.media3.session.command.COMPACT_VIEW_INDEX", -1);
                    if (i11 < 0 || i11 >= 3) {
                        int i12 = i4;
                        if (b47Var.b(0) == i12) {
                            iArr2[0] = i8;
                        } else if (b47Var.b(0) == 1) {
                            iArr2[1] = i8;
                        } else {
                            if (b47Var.b(0) == 3) {
                                iArr2[i12] = i8;
                            }
                            z2 = z3;
                        }
                        z2 = z3;
                    } else {
                        iArrCopyOf[i11] = i8;
                        z2 = true;
                    }
                    i5 = i8 + 1;
                    context = context2;
                    qycVarF2 = qycVar;
                    iArr = iArr2;
                    qVar2 = qVar;
                    eVar3 = eVar2;
                    plaVar3 = plaVar2;
                    gdbVarA = gdbVar;
                    sVar2 = sVar;
                    i4 = 2;
                }
                q qVar3 = qVar2;
                e eVar4 = eVar3;
                gdb gdbVar2 = gdbVarA;
                s sVar3 = sVar2;
                pla plaVar4 = plaVar3;
                int[] iArr3 = iArr;
                if (!z2) {
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 3; i14 < i15; i15 = 3) {
                        int i16 = iArr3[i14];
                        if (i16 != -1) {
                            iArrCopyOf[i13] = i16;
                            i13++;
                        }
                        i14++;
                    }
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= 3) {
                        break;
                    }
                    if (iArrCopyOf[i17] == -1) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i17);
                        break;
                    }
                    i17++;
                }
                vm9Var.c = iArrCopyOf;
                if (gdbVar2.O0(18)) {
                    oj9 oj9VarI0 = gdbVar2.I0();
                    plaVar = plaVar4;
                    plaVar.e = pla.b(oj9VarI0.a);
                    plaVar.f = pla.b(oj9VarI0.b);
                    hz8<Bitmap> hz8VarB = sVar3.m.b(oj9VarI0);
                    if (hz8VarB != null) {
                        eVar = eVar4;
                        e.b bVar4 = eVar.c;
                        if (bVar4 != null) {
                            bVar4.c = true;
                        }
                        if (hz8VarB.isDone()) {
                            try {
                                plaVar.d((Bitmap) aw5.J1(hz8VarB));
                            } catch (CancellationException | ExecutionException e) {
                                zkd.T("NotificationProvider", "Failed to load bitmap: " + e.getMessage());
                            }
                            vj9Var = this;
                        } else {
                            vj9Var = this;
                            e.b bVar5 = new e.b(plaVar, uj9Var);
                            eVar.c = bVar5;
                            Handler handler = sVar3.l;
                            Objects.requireNonNull(handler);
                            hz8VarB.a(new aw5.a(hz8VarB, bVar5), new nl3(handler));
                        }
                    } else {
                        vj9Var = this;
                        eVar = eVar4;
                    }
                } else {
                    vj9Var = this;
                    eVar = eVar4;
                    plaVar = plaVar4;
                }
                long jCurrentTimeMillis = (!gdbVar2.t0() || gdbVar2.k() || gdbVar2.P0() || gdbVar2.e().a != 1.0f) ? -9223372036854775807L : System.currentTimeMillis() - gdbVar2.p0();
                boolean z4 = jCurrentTimeMillis != -9223372036854775807L;
                if (!z4) {
                    jCurrentTimeMillis = 0;
                }
                Notification notification = plaVar.w;
                notification.when = jCurrentTimeMillis;
                plaVar.k = z4;
                plaVar.l = z4;
                if (Build.VERSION.SDK_INT >= 31) {
                    plaVar.u = 1;
                }
                plaVar.g = null;
                d dVar3 = (d) aVar;
                notification.deleteIntent = PendingIntent.getService(dVar3.a, 86, dVar3.a(rVar2, 86).putExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", true), 67108864);
                plaVar.c(8, true);
                notification.icon = eVar.d;
                plaVar.e(vm9Var);
                plaVar.s = 1;
                plaVar.c(2, false);
                plaVar.n = "media3_group_key";
                qVar3.e.execute(new hd3(qVar3, rVar2, new p(plaVar.a()), z));
            }
        });
    }

    public final boolean f(r rVar, boolean z) {
        try {
            e(rVar, a().b(z));
            return true;
        } catch (IllegalStateException e) {
            if (Build.VERSION.SDK_INT < 31 || !a.a(e)) {
                throw e;
            }
            zkd.x("MSessionService", "Failed to start foreground", e);
            this.b.post(new qx0(this, 9));
            return false;
        }
    }

    public final void g(r rVar) {
        synchronized (this.a) {
            ka2.k("session not found", this.f.containsKey(rVar.a.i));
            this.f.remove(rVar.a.i);
        }
        vjg.T(this.b, new p9(4, this, rVar));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action;
        if (intent != null && (action = intent.getAction()) != null) {
            if (action.equals("androidx.media3.session.MediaSessionService")) {
                c cVar = this.c;
                ka2.r(cVar);
                return cVar;
            }
            if (action.equals("android.media.browse.MediaBrowserService")) {
                d(new r.d(new h.b("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY));
                return null;
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.c = new c(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        c cVar = this.c;
        if (cVar != null) {
            cVar.a.clear();
            cVar.b.removeCallbacksAndMessages(null);
            Set<f> set = cVar.c;
            Iterator<f> it = set.iterator();
            while (it.hasNext()) {
                boa.p(it.next());
            }
            set.clear();
            this.c = null;
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        final r rVar;
        r next;
        int i3 = 1;
        if (intent != null) {
            if (this.e == null) {
                this.e = new d(this);
            }
            d dVar = this.e;
            Uri data = intent.getData();
            if (data != null) {
                synchronized (r.b) {
                    try {
                        Iterator<r> it = r.c.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (Objects.equals(next.a.b, data)) {
                            }
                        }
                    } finally {
                    }
                }
                rVar = next;
            } else {
                rVar = null;
            }
            dVar.getClass();
            if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                if (rVar == null) {
                    d(new r.d(new h.b("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY));
                    return 1;
                }
                s sVar = rVar.a;
                sVar.l.post(new eq2(i3, sVar, intent));
                return 1;
            }
            if (rVar != null && "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
                final String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    Bundle extras2 = intent.getExtras();
                    Object obj2 = extras2 != null ? extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS") : null;
                    final Bundle bundle = obj2 instanceof Bundle ? (Bundle) obj2 : Bundle.EMPTY;
                    final q qVarA = a();
                    final j jVarA = qVarA.a(rVar);
                    if (jVarA != null) {
                        vjg.T(new Handler(rVar.a().Q0()), new Runnable(rVar, str, bundle, jVarA) { // from class: tj9
                            public final /* synthetic */ String b;
                            public final /* synthetic */ Bundle c;
                            public final /* synthetic */ j d;

                            {
                                this.b = str;
                                this.c = bundle;
                                this.d = jVarA;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                q qVar = this.a;
                                qVar.e.execute(new oy0(qVar, this.d, this.b, this.c));
                            }
                        });
                    }
                }
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        if (a().Z) {
            ArrayList arrayListB = b();
            for (int i = 0; i < arrayListB.size(); i++) {
                if (((r) arrayListB.get(i)).a().t0()) {
                    return;
                }
            }
        }
        q qVarA = a();
        v vVar = qVarA.a;
        qVarA.b0 = false;
        Handler handler = qVarA.d;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
            ArrayList arrayListB2 = vVar.b();
            for (int i2 = 0; i2 < arrayListB2.size(); i2++) {
                vVar.f((r) arrayListB2.get(i2), false);
            }
        }
        ArrayList arrayListB3 = b();
        for (int i3 = 0; i3 < arrayListB3.size(); i3++) {
            ((r) arrayListB3.get(i3)).a().A(false);
        }
        stopSelf();
    }
}
