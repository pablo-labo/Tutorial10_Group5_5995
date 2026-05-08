package defpackage;

import androidx.media3.exoplayer.drm.a;
import com.facebook.react.bridge.Promise;
import com.oney.WebRTCModule.WebRTCModule;
import defpackage.wi6;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yc4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yc4(int i, Object obj, Object obj2) {
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
                a.C0043a c0043a = (a.C0043a) obj2;
                ((a) obj).s0(c0043a.a, c0043a.b);
                break;
            case 1:
                wi6.a aVar = ((bj6) obj2).c;
                wi6.this.b.f(((ui6) obj).m);
                break;
            case 2:
                ((d9a) obj2).l((ox4) obj);
                break;
            default:
                ((WebRTCModule) obj2).lambda$getDisplayMedia$10((Promise) obj);
                break;
        }
    }
}
