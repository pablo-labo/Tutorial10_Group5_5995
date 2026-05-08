package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import defpackage.g91;

/* JADX INFO: loaded from: classes2.dex */
public final class dlh extends x0i {
    public final /* synthetic */ g91 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlh(g91 g91Var, Looper looper) {
        super(looper);
        this.a = g91Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        zoh zohVar;
        g91 g91Var = this.a;
        int i = g91Var.w.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (zohVar = (zoh) message.obj) != null) {
                synchronized (zohVar) {
                    zohVar.a = null;
                }
                g91 g91Var2 = zohVar.c;
                synchronized (g91Var2.l) {
                    g91Var2.l.remove(zohVar);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !g91Var.q0()) {
            zoh zohVar2 = (zoh) message.obj;
            if (zohVar2 != null) {
                synchronized (zohVar2) {
                    zohVar2.a = null;
                }
                g91 g91Var3 = zohVar2.c;
                synchronized (g91Var3.l) {
                    g91Var3.l.remove(zohVar2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            g91Var.t = new ConnectionResult(message.arg2, null, null);
            if (!g91Var.u && !TextUtils.isEmpty(g91Var.j()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(g91Var.j());
                    if (!g91Var.u) {
                        g91Var.p(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = g91Var.t;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8, null, null);
            }
            g91Var.j.a(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            ConnectionResult connectionResult2 = g91Var.t;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8, null, null);
            }
            g91Var.j.a(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            g91Var.j.a(new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            g91Var.p(5, null);
            g91.a aVar = g91Var.o;
            if (aVar != null) {
                aVar.e(message.arg2);
            }
            g91Var.m();
            g91Var.o(5, 1, null);
            return;
        }
        if (i4 == 2 && !g91Var.o0()) {
            zoh zohVar3 = (zoh) message.obj;
            if (zohVar3 != null) {
                synchronized (zohVar3) {
                    zohVar3.a = null;
                }
                g91 g91Var4 = zohVar3.c;
                synchronized (g91Var4.l) {
                    g91Var4.l.remove(zohVar3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i5);
            Log.wtf("GmsClient", sb.toString(), new Exception());
            return;
        }
        zoh zohVar4 = (zoh) message.obj;
        synchronized (zohVar4) {
            try {
                bool = zohVar4.a;
                if (zohVar4.b) {
                    String string = zohVar4.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            zohVar4.a(bool);
        }
        synchronized (zohVar4) {
            zohVar4.b = true;
        }
        synchronized (zohVar4) {
            zohVar4.a = null;
        }
        g91 g91Var5 = zohVar4.c;
        synchronized (g91Var5.l) {
            g91Var5.l.remove(zohVar4);
        }
    }
}
