package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.infra.eventlogger.model.EventPayload;
import defpackage.kv8;

/* JADX INFO: loaded from: classes3.dex */
public final class r87 {
    public static final a Companion = new a();
    public static volatile r87 d;
    public final Context a;
    public final s64 b;
    public hz4 c;

    public static final class a {
    }

    public static final class b implements yv8 {
        public final r87 a;

        public b(r87 r87Var) {
            this.a = r87Var;
        }

        @qqa(kv8.a.ON_PAUSE)
        public final void onPause() {
            r87 r87Var = this.a;
            synchronized (r87Var) {
                s64 s64Var = r87Var.b;
                s64Var.getClass();
                Log.d("DispatchHandler", "enqueueFlush called");
                if (!s64Var.hasMessages(1)) {
                    Log.d("DispatchHandler", "enqueueFlush no messages, enqueuing");
                    s64Var.sendMessageDelayed(Message.obtain(s64Var, 1), s64Var.a);
                }
            }
        }

        @qqa(kv8.a.ON_RESUME)
        public final void onResume() {
            r87 r87Var = this.a;
            synchronized (r87Var) {
                s64 s64Var = r87Var.b;
                s64Var.getClass();
                Log.d("DispatchHandler", "enqueueFlush called");
                if (!s64Var.hasMessages(1)) {
                    Log.d("DispatchHandler", "enqueueFlush no messages, enqueuing");
                    s64Var.sendMessageDelayed(Message.obtain(s64Var, 1), s64Var.a);
                }
            }
        }
    }

    public r87(Context context, ew4 ew4Var) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("INDEED_LOG_THREAD", 10);
        handlerThread.start();
        Log.d("IndeedEventLogger", "Handler thread started: " + handlerThread);
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        this.b = new s64(context, ew4Var, looper);
        new Handler(Looper.getMainLooper()).post(new qa0(this, 1));
    }

    public final void a(EventPayload eventPayload) {
        s64 s64Var = this.b;
        Message messageObtainMessage = s64Var.obtainMessage(0, eventPayload);
        messageObtainMessage.getClass();
        s64Var.sendMessage(messageObtainMessage);
    }
}
