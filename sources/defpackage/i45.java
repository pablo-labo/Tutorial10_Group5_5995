package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media3.session.a;
import androidx.media3.session.r;
import androidx.media3.session.v;
import com.indeed.android.jobsearch.R;
import expo.modules.kotlin.exception.Exceptions$AppContextLost;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class i45 extends v {
    public static final /* synthetic */ int b0 = 0;
    public WeakReference<gk0> V;
    public final LinkedHashMap W = new LinkedHashMap();
    public final ddb X = new ddb(this);
    public r Y;
    public final androidx.media3.session.a Z;
    public final androidx.media3.session.a a0;

    @uh3(c = "expo.modules.video.playbackService.ExpoVideoPlaybackService$cleanup$1", f = "ExpoVideoPlaybackService.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return i45.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            i45.this.stopForeground(1);
            i45.this.getClass();
            Object systemService = i45.this.getSystemService("notification");
            systemService.getClass();
            ((NotificationManager) systemService).cancelAll();
            List listZ1 = z92.z1(i45.this.W.values());
            i45.this.W.clear();
            Iterator it = listZ1.iterator();
            while (it.hasNext()) {
                ((r) it.next()).b();
            }
            Object systemService2 = i45.this.getSystemService("notification");
            systemService2.getClass();
            ((NotificationManager) systemService2).deleteNotificationChannel("PlaybackService");
            return j6g.a;
        }
    }

    @uh3(c = "expo.modules.video.playbackService.ExpoVideoPlaybackService$onUpdateNotification$1", f = "ExpoVideoPlaybackService.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ r $session;
        final /* synthetic */ boolean $startInForegroundRequired;
        int label;
        final /* synthetic */ i45 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, i45 i45Var, r rVar, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$startInForegroundRequired = z;
            this.this$0 = i45Var;
            this.$session = rVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$startInForegroundRequired, this.this$0, this.$session, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                int r0 = r2.label
                if (r0 != 0) goto L35
                defpackage.r7d.b(r3)
                boolean r3 = r2.$startInForegroundRequired
                if (r3 == 0) goto L29
                i45 r3 = r2.this$0
                androidx.media3.session.r r0 = r2.$session
                int r1 = defpackage.i45.b0
                r3.getClass()
                androidx.media3.session.s r3 = r0.a
                android.os.Bundle r3 = r3.B
                java.lang.String r0 = "showNotification"
                r1 = 0
                boolean r3 = r3.getBoolean(r0, r1)
                if (r3 == 0) goto L29
                i45 r3 = r2.this$0
                androidx.media3.session.r r2 = r2.$session
                defpackage.i45.i(r3, r2)
                goto L32
            L29:
                i45 r2 = r2.this$0
                androidx.media3.session.r r3 = defpackage.i45.h(r2)
                defpackage.i45.i(r2, r3)
            L32:
                j6g r2 = defpackage.j6g.a
                return r2
            L35:
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r2)
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: i45.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public i45() {
        Bundle bundle = Bundle.EMPTY;
        v8e v8eVar = new v8e("SEEK_FORWARD", bundle);
        v8e v8eVar2 = new v8e("SEEK_REWIND", bundle);
        a.C0056a c0056a = new a.C0056a(0);
        c0056a.f = "rewind";
        c0056a.d(v8eVar);
        c0056a.d = R.drawable.seek_forwards_10s;
        this.Z = c0056a.a();
        a.C0056a c0056a2 = new a.C0056a(0);
        c0056a2.f = "forward";
        c0056a2.d(v8eVar2);
        c0056a2.d = R.drawable.seek_backwards_10s;
        this.a0 = c0056a2.a();
    }

    public static final r h(i45 i45Var) {
        Object obj;
        Object next;
        List listZ1 = z92.z1(z92.D1(z92.h1(u63.b0(i45Var.Y), z92.z1(i45Var.W.values()))));
        Iterator it = listZ1.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            r rVar = (r) next;
            if (rVar.a.B.getBoolean("showNotification", false) && rVar.a().W()) {
                break;
            }
        }
        r rVar2 = (r) next;
        if (rVar2 != null) {
            return rVar2;
        }
        Iterator it2 = listZ1.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((r) next2).a.B.getBoolean("showNotification", false)) {
                obj = next2;
                break;
            }
        }
        return (r) obj;
    }

    public static final void i(i45 i45Var, r rVar) {
        CharSequence charSequence;
        oj9 oj9Var;
        if (rVar != null) {
            i45Var.getClass();
            gdb gdbVarA = rVar.a();
            if (gdbVarA != null && !gdbVarA.W()) {
                i45Var.stopForeground(2);
            }
        }
        if (!wl7.b(i45Var.Y, rVar)) {
            Object systemService = i45Var.getSystemService("notification");
            systemService.getClass();
            ((NotificationManager) systemService).cancelAll();
        }
        i45Var.Y = rVar;
        if (rVar == null) {
            i45Var.stopForeground(1);
            return;
        }
        boolean zW = rVar.a().W();
        if (rVar.a().M0() == null) {
            return;
        }
        Object systemService2 = i45Var.getSystemService("notification");
        systemService2.getClass();
        NotificationManager notificationManager = (NotificationManager) systemService2;
        notificationManager.createNotificationChannel(new NotificationChannel("PlaybackService", "PlaybackService", 2));
        ij9 ij9VarM0 = rVar.a().M0();
        if (ij9VarM0 == null || (oj9Var = ij9VarM0.d) == null || (charSequence = oj9Var.a) == null) {
            charSequence = "\u200e";
        }
        pla plaVar = new pla(i45Var, "PlaybackService");
        plaVar.w.icon = R.drawable.media3_icon_circular_play;
        plaVar.e = pla.b(charSequence);
        plaVar.e(new vm9(rVar));
        Notification notificationA = plaVar.a();
        notificationA.getClass();
        int iHashCode = rVar.a().hashCode();
        if (!zW) {
            notificationManager.notify(iHashCode, notificationA);
            return;
        }
        try {
            i45Var.startForeground(iHashCode, notificationA);
            j6g j6gVar = j6g.a;
        } catch (Exception e) {
            d49 d49Var = (d49) i45Var.k().l.getValue();
            if (d49Var != null) {
                d49Var.a(o39.Error, pyd.w("Failed to start the expo-video foreground service"), e);
                j6g j6gVar2 = j6g.a;
            }
        }
    }

    @Override // androidx.media3.session.v
    public final void d(r.d dVar) {
    }

    @Override // androidx.media3.session.v
    public final void e(r rVar, boolean z) {
        rVar.getClass();
        u63.Y(k().g, null, null, new b(z, this, rVar, null), 3);
    }

    public final void j() {
        u63.Y(k().g, null, null, new a(null), 3);
    }

    public final gk0 k() throws Exceptions$AppContextLost {
        gk0 gk0Var = this.V.get();
        if (gk0Var != null) {
            return gk0Var;
        }
        throw new Exceptions$AppContextLost();
    }

    @Override // androidx.media3.session.v, android.app.Service
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return this.X;
    }

    @Override // androidx.media3.session.v, android.app.Service
    public final void onDestroy() {
        j();
        super.onDestroy();
    }

    @Override // androidx.media3.session.v, android.app.Service
    public final void onTaskRemoved(Intent intent) {
        j();
        stopSelf();
    }
}
