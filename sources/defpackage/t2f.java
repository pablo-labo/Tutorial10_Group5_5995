package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.sf6;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t2f implements sf6 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public static final class a implements sf6.a {
        public Message a;

        public final void a() {
            this.a = null;
            ArrayList arrayList = t2f.b;
            synchronized (arrayList) {
                try {
                    if (arrayList.size() < 50) {
                        arrayList.add(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            Message message = this.a;
            message.getClass();
            message.sendToTarget();
            a();
        }
    }

    public t2f(Handler handler) {
        this.a = handler;
    }

    public static a m() {
        a aVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                aVar = arrayList.isEmpty() ? new a() : (a) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // defpackage.sf6
    public final boolean a() {
        return this.a.hasMessages(1);
    }

    @Override // defpackage.sf6
    public final a b(Object obj, int i, int i2, int i3) {
        a aVarM = m();
        aVarM.a = this.a.obtainMessage(i, i2, i3, obj);
        return aVarM;
    }

    @Override // defpackage.sf6
    public final a c(int i) {
        a aVarM = m();
        aVarM.a = this.a.obtainMessage(i);
        return aVarM;
    }

    @Override // defpackage.sf6
    public final void d() {
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.sf6
    public final a e(int i, Object obj) {
        a aVarM = m();
        aVarM.a = this.a.obtainMessage(i, obj);
        return aVarM;
    }

    @Override // defpackage.sf6
    public final Looper f() {
        return this.a.getLooper();
    }

    @Override // defpackage.sf6
    public final a g(int i, int i2, int i3) {
        a aVarM = m();
        aVarM.a = this.a.obtainMessage(i, i2, i3);
        return aVarM;
    }

    @Override // defpackage.sf6
    public final boolean h(sf6.a aVar) {
        a aVar2 = (a) aVar;
        Message message = aVar2.a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = this.a.sendMessageAtFrontOfQueue(message);
        aVar2.a();
        return zSendMessageAtFrontOfQueue;
    }

    @Override // defpackage.sf6
    public final boolean i(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // defpackage.sf6
    public final boolean j(long j) {
        return this.a.sendEmptyMessageAtTime(2, j);
    }

    @Override // defpackage.sf6
    public final boolean k(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // defpackage.sf6
    public final void l(int i) {
        ka2.l(i != 0);
        this.a.removeMessages(i);
    }
}
