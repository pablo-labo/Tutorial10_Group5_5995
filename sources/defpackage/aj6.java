package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.source.g;
import androidx.media3.exoplayer.source.l;
import app.rive.runtime.kotlin.renderers.Renderer;
import com.facebook.react.views.scroll.a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aj6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aj6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((bj6) obj).F();
                break;
            case 1:
                ((FrameLayout) obj).setVisibility(0);
                break;
            case 2:
                ((a) obj).a();
                break;
            case 3:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new ob0((Context) obj, 5));
                break;
            case 4:
                l lVar = (l) obj;
                if (!lVar.E0) {
                    g.a aVar = lVar.h0;
                    aVar.getClass();
                    aVar.b(lVar);
                }
                break;
            default:
                Renderer.scheduleFrame$lambda$1((Renderer) obj);
                break;
        }
    }
}
