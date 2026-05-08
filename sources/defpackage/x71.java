package defpackage;

import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.source.l;
import com.facebook.react.bridge.Promise;
import com.indeed.android.reactnative.rntarebridge.nav.RNJSTNavigator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x71(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                z71 z71Var = (z71) obj2;
                ?? Apply = ((c35) obj).apply(z71Var.e);
                z71Var.e = Apply;
                y71 y71Var = new y71(0, z71Var, Apply);
                sf6 sf6Var = z71Var.b;
                if (sf6Var.f().getThread().isAlive()) {
                    sf6Var.i(y71Var);
                    break;
                }
                break;
            case 1:
                a.C0043a c0043a = (a.C0043a) obj2;
                ((a) obj).F(c0043a.a, c0043a.b);
                break;
            case 2:
                n15 n15Var = (n15) obj;
                try {
                    ((Runnable) obj2).run();
                } catch (Throwable th) {
                    n15Var.a(th);
                    return;
                }
                break;
            case 3:
                ((l) obj2).E((zxd) obj);
                break;
            default:
                RNJSTNavigator.hideRNModal$lambda$20((RNJSTNavigator) obj2, (Promise) obj);
                break;
        }
    }
}
