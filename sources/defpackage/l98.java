package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l98 extends Handler {
    public l98() {
        super(Looper.getMainLooper());
    }

    public abstract void a(String str);

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        message.getClass();
        Object obj = message.obj;
        obj.getClass();
        String str = (String) obj;
        int i = message.what;
        if (i == 0) {
            a(str);
        } else {
            if (i != 1) {
                return;
            }
            ArrayList arrayList = lz2.a;
            lz2.c("JsCallResultHandler", "Unhandled JavaScript error in JsCall: ".concat(str), false, null, 12);
        }
    }
}
