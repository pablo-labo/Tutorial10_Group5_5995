package defpackage;

import android.os.AsyncTask;
import okhttp3.WebSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class o24 extends AsyncTask<Void, Void, Void> {
    public final /* synthetic */ m24 a;

    public o24(m24 m24Var) {
        this.a = m24Var;
    }

    @Override // android.os.AsyncTask
    public final Void doInBackground(Void[] voidArr) {
        voidArr.getClass();
        m24 m24Var = this.a;
        xo7 xo7Var = m24Var.h;
        if (xo7Var != null) {
            ctc ctcVar = xo7Var.b;
            ctcVar.e = true;
            try {
                WebSocket webSocket = ctcVar.g;
                if (webSocket != null) {
                    webSocket.e(1000, "End of session");
                }
            } catch (Exception unused) {
            }
            ctcVar.g = null;
            ctcVar.b = null;
        }
        m24Var.h = null;
        return null;
    }
}
