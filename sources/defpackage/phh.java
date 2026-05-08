package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.iid.zzj;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class phh implements Runnable {
    public final rgh a;

    public phh(rgh rghVar) {
        this.a = rghVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rgh rghVar = this.a;
        while (true) {
            synchronized (rghVar) {
                try {
                    if (rghVar.a != 2) {
                        return;
                    }
                    if (rghVar.d.isEmpty()) {
                        rghVar.c();
                        return;
                    }
                    vih<?> vihVar = (vih) rghVar.d.poll();
                    rghVar.e.put(vihVar.a, vihVar);
                    rghVar.f.b.schedule(new aih(rghVar, vihVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String strValueOf = String.valueOf(vihVar);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(strValueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context context = rghVar.f.a;
                    Messenger messenger = rghVar.b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = vihVar.c;
                    messageObtain.arg1 = vihVar.a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", vihVar.c());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", vihVar.d);
                    messageObtain.setData(bundle);
                    try {
                        z1b z1bVar = rghVar.c;
                        Messenger messenger2 = (Messenger) z1bVar.a;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            zzj zzjVar = (zzj) z1bVar.b;
                            if (zzjVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = zzjVar.a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        rghVar.a(2, e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
