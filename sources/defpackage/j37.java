package defpackage;

import androidx.media3.session.j;
import androidx.media3.session.q;
import androidx.media3.session.r;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.camera.ImageStoreManager;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j37 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j37(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ImageStoreManager.getBase64ForTag$lambda$0((ImageStoreManager) obj4, (String) obj3, (Callback) obj2, (Callback) obj);
                break;
            default:
                q qVar = (q) obj4;
                q.b bVar = (q.b) obj2;
                r rVar = (r) obj;
                try {
                    j jVar = (j) ((sg9) obj3).get(0L, TimeUnit.MILLISECONDS);
                    if (qVar.c(rVar)) {
                        bVar.a.f(bVar.b, false);
                    }
                    jVar.Z(bVar);
                } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused) {
                    qVar.a.g(rVar);
                }
                break;
        }
    }
}
