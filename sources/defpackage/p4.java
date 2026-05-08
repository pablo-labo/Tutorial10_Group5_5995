package defpackage;

import androidx.media3.exoplayer.source.l;
import androidx.media3.exoplayer.video.a;
import app.rive.runtime.kotlin.renderers.Renderer;
import com.datadog.android.core.internal.persistence.AbstractStorage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AbstractStorage.dropAll$lambda$2((AbstractStorage) obj);
                break;
            case 1:
                a.this.g.f();
                break;
            case 2:
                ((l) obj).A();
                break;
            case 3:
                Renderer.stop$lambda$0((Renderer) obj);
                break;
            case 4:
                ndd.setRippleState$lambda$2((ndd) obj);
                break;
            default:
                sqd sqdVar = (sqd) obj;
                if (sqdVar != null) {
                    sqdVar.l().bringToFront();
                }
                break;
        }
    }
}
