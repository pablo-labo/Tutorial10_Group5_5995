package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class uji implements Handler.Callback {
    public final /* synthetic */ fki a;

    public /* synthetic */ uji(fki fkiVar) {
        this.a = fkiVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            fki fkiVar = this.a;
            synchronized (fkiVar.d) {
                try {
                    jii jiiVar = (jii) message.obj;
                    mji mjiVar = (mji) fkiVar.d.get(jiiVar);
                    if (mjiVar != null && mjiVar.a.isEmpty()) {
                        if (mjiVar.c) {
                            jii jiiVar2 = mjiVar.e;
                            fki fkiVar2 = mjiVar.V;
                            fkiVar2.f.removeMessages(1, jiiVar2);
                            fkiVar2.g.c(fkiVar2.e, mjiVar);
                            mjiVar.c = false;
                            mjiVar.b = 2;
                        }
                        fkiVar.d.remove(jiiVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        fki fkiVar3 = this.a;
        synchronized (fkiVar3.d) {
            try {
                jii jiiVar3 = (jii) message.obj;
                mji mjiVar2 = (mji) fkiVar3.d.get(jiiVar3);
                if (mjiVar2 != null && mjiVar2.b == 3) {
                    String strValueOf = String.valueOf(jiiVar3);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = mjiVar2.f;
                    if (componentName == null) {
                        jiiVar3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = jiiVar3.b;
                        fib.i(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    mjiVar2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
