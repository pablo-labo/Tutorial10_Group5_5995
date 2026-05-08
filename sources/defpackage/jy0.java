package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.media3.exoplayer.d;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.oney.WebRTCModule.WebRTCModule;
import defpackage.mt3;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jy0(is5 is5Var, View view, Rect rect) {
        this.a = 1;
        this.b = view;
        this.c = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                d.a aVar = ((ry0) obj2).b;
                String str = vjg.a;
                d.this.s.u((String) obj);
                break;
            case 1:
                is5.g((Rect) obj, (View) obj2);
                break;
            case 2:
                mt3.a aVar2 = (mt3.a) obj;
                try {
                    Object objCall = ((Callable) obj2).call();
                    mt3 mt3Var = mt3.this;
                    if (objCall == null) {
                        objCall = a4.V;
                    }
                    if (a4.f.b(mt3Var, null, objCall)) {
                        a4.f(mt3Var);
                    }
                } catch (Exception e) {
                    aVar2.a(e);
                    return;
                }
                break;
            case 3:
                ((s) obj2).g.m1((r.d) obj, Integer.MIN_VALUE, 1, x.o1(new l(11)));
                break;
            case 4:
                yq2 yq2Var = (yq2) obj2;
                y9e y9eVar = (y9e) obj;
                yq2Var.getClass();
                y9eVar.getClass();
                yq2Var.accept(y9eVar);
                break;
            default:
                ((WebRTCModule) obj2).lambda$setAudioDevice$42((String) obj);
                break;
        }
    }

    public /* synthetic */ jy0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
