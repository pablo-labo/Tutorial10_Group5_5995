package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.navigation.e;
import com.indeed.android.reactnative.rntarebridge.nav.RNJSTNavigator;
import defpackage.j2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class odc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ odc(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                RNJSTNavigator.openSearchOverlayModal$lambda$3$lambda$2$lambda$1((FragmentManager) this.b, (e) this.c, (lt7) this.d);
                break;
            default:
                ebe ebeVar = (ebe) this.b;
                ph1 ph1Var = (ph1) this.c;
                x9e x9eVar = (x9e) this.d;
                try {
                    if (!(ebeVar.a instanceof j2.b)) {
                        ph1Var.run();
                        ebeVar.l(x9eVar);
                    }
                } catch (Throwable th) {
                    ebeVar.m(th);
                }
                break;
        }
    }
}
