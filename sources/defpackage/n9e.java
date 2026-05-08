package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class n9e {
    public final v03 a;
    public Messenger b;
    public final LinkedBlockingDeque<Message> c;
    public final b d;

    public static final class a extends Handler {
        public final v03 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v03 v03Var) {
            super(Looper.getMainLooper());
            v03Var.getClass();
            this.a = v03Var;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String string;
            message.getClass();
            if (message.what != 3) {
                Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
                super.handleMessage(message);
                return;
            }
            Bundle data = message.getData();
            if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
                string = "";
            }
            Log.d("SessionLifecycleClient", "Session update received: ".concat(string));
            u63.Y(f13.a(this.a), null, null, new m9e(string, null), 3);
        }
    }

    public static final class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            StringBuilder sb = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
            n9e n9eVar = n9e.this;
            LinkedBlockingDeque<Message> linkedBlockingDeque = n9eVar.c;
            sb.append(linkedBlockingDeque.size());
            Log.d("SessionLifecycleClient", sb.toString());
            n9eVar.b = new Messenger(iBinder);
            ArrayList arrayList = new ArrayList();
            linkedBlockingDeque.drainTo(arrayList);
            u63.Y(f13.a(n9eVar.a), null, null, new o9e(n9eVar, arrayList, null), 3);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            n9e.this.b = null;
        }
    }

    public n9e(v03 v03Var) {
        v03Var.getClass();
        this.a = v03Var;
        this.c = new LinkedBlockingDeque<>(20);
        this.d = new b();
    }

    public static final Message a(n9e n9eVar, List list, int i) {
        Object obj;
        n9eVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public final void b(Message message) {
        LinkedBlockingDeque<Message> linkedBlockingDeque = this.c;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    public final void c(int i) {
        ArrayList arrayList = new ArrayList();
        this.c.drainTo(arrayList);
        Message messageObtain = Message.obtain(null, i, 0, 0);
        messageObtain.getClass();
        arrayList.add(messageObtain);
        u63.Y(f13.a(this.a), null, null, new o9e(this, arrayList, null), 3);
    }
}
