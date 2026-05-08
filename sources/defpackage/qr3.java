package defpackage;

import androidx.media3.exoplayer.source.l;
import androidx.media3.exoplayer.video.a;
import androidx.media3.ui.c;
import com.swmansion.gesturehandler.core.f;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qr3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qr3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a.this.g.onFirstFrameRendered();
                return;
            case 1:
                j79 j79Var = (j79) obj;
                Semaphore semaphore = j79Var.y0;
                lm2 lm2Var = j79Var.b0;
                if (lm2Var == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    lm2Var.p(j79Var.b.e());
                    break;
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    semaphore.release();
                    throw th;
                }
                semaphore.release();
                return;
            case 2:
                ((f) obj).a(false);
                return;
            case 3:
                ((c) obj).s();
                return;
            default:
                ((l) obj).y0 = true;
                return;
        }
    }
}
