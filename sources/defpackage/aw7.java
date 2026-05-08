package defpackage;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aw7 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aw7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        String reference;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new bw7((JsReplyProxyBoundaryInterface) obj);
            default:
                jjg jjgVar = (jjg) obj;
                synchronized (jjgVar.g) {
                    try {
                        z = false;
                        if (jjgVar.g.isMarked()) {
                            reference = jjgVar.g.getReference();
                            jjgVar.g.set(reference, false);
                            z = true;
                        } else {
                            reference = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (z) {
                    jjgVar.a.i(jjgVar.c, reference);
                }
                return null;
        }
    }
}
