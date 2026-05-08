package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class a5h {
    public static final a5h b;
    public sya a;

    static {
        a5h a5hVar = new a5h();
        a5hVar.a = null;
        b = a5hVar;
    }

    public static sya a(Context context) {
        sya syaVar;
        a5h a5hVar = b;
        synchronized (a5hVar) {
            try {
                if (a5hVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    a5hVar.a = new sya(context);
                }
                syaVar = a5hVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return syaVar;
    }
}
