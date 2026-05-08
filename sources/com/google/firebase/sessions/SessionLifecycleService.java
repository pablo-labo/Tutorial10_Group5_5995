package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import defpackage.a9e;
import defpackage.c9e;
import defpackage.g9e;
import defpackage.k9e;
import defpackage.pf5;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "<init>", "()V", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SessionLifecycleService extends Service {
    public final HandlerThread a = new HandlerThread("FirebaseSessions_HandlerThread");
    public a b;
    public Messenger c;

    public static final class a extends Handler {
        public boolean a;
        public long b;
        public final ArrayList<Messenger> c;

        public a(Looper looper) {
            super(looper);
            this.c = new ArrayList<>();
        }

        public final void a(Messenger messenger) {
            if (this.a) {
                Object objB = pf5.c().b(k9e.class);
                objB.getClass();
                c(messenger, ((k9e) objB).b().a);
                return;
            }
            Object objB2 = pf5.c().b(a9e.class);
            objB2.getClass();
            String strA = ((a9e) objB2).a();
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + strA);
            if (strA != null) {
                c(messenger, strA);
            }
        }

        public final void b() {
            Object objB = pf5.c().b(k9e.class);
            objB.getClass();
            k9e k9eVar = (k9e) objB;
            int i = k9eVar.d + 1;
            k9eVar.d = i;
            String strA = i == 0 ? k9eVar.c : k9eVar.a();
            String str = k9eVar.c;
            int i2 = k9eVar.d;
            k9eVar.a.getClass();
            k9eVar.e = new c9e(strA, str, i2, System.currentTimeMillis() * 1000);
            k9eVar.b();
            StringBuilder sb = new StringBuilder("Generated new session ");
            Object objB2 = pf5.c().b(k9e.class);
            objB2.getClass();
            sb.append(((k9e) objB2).b().a);
            Log.d("SessionLifecycleService", sb.toString());
            StringBuilder sb2 = new StringBuilder("Broadcasting new session: ");
            Object objB3 = pf5.c().b(k9e.class);
            objB3.getClass();
            sb2.append(((k9e) objB3).b());
            Log.d("SessionLifecycleService", sb2.toString());
            Object objB4 = pf5.c().b(g9e.class);
            objB4.getClass();
            Object objB5 = pf5.c().b(k9e.class);
            objB5.getClass();
            ((g9e) objB4).a(((k9e) objB5).b());
            for (Messenger messenger : new ArrayList(this.c)) {
                messenger.getClass();
                a(messenger);
            }
            Object objB6 = pf5.c().b(a9e.class);
            objB6.getClass();
            Object objB7 = pf5.c().b(k9e.class);
            objB7.getClass();
            ((a9e) objB6).b(((k9e) objB7).b().a);
        }

        public final void c(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message messageObtain = Message.obtain(null, 3, 0, 0);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.c.remove(messenger);
            } catch (Exception e) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + JwtParser.SEPARATOR_CHAR, e);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x014e  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r12) {
            /*
                Method dump skipped, instruction units count: 373
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionLifecycleService.a.handleMessage(android.os.Message):void");
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger messenger = Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
        if (messenger != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messenger;
            a aVar = this.b;
            if (aVar != null) {
                aVar.sendMessage(messageObtain);
            }
        }
        Messenger messenger2 = this.c;
        if (messenger2 != null) {
            return messenger2.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.a;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        this.b = new a(looper);
        this.c = new Messenger(this.b);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a.quit();
    }
}
