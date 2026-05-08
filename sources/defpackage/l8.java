package defpackage;

import android.graphics.Typeface;
import android.util.Log;
import defpackage.g6d;
import defpackage.vyf;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class l8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                try {
                    Method method = m8.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        m8.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            default:
                Typeface typeface = (Typeface) obj;
                g6d.c cVar = ((vyf.a) obj2).q0;
                if (cVar != null) {
                    cVar.c(typeface);
                    return;
                }
                return;
        }
    }
}
