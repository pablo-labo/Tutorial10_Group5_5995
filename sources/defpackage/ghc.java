package defpackage;

import com.indeed.android.reactnative.rntarebridge.RNTareBridge;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ghc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ghc(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                RNTareBridge.presentProfilePreferences$lambda$12((lr5) obj3, (String) obj2, (gs7) obj);
                break;
            default:
                hzh hzhVar = (hzh) obj;
                try {
                    hzhVar.v(((ku2) obj3).a((maf) obj2));
                } catch (CancellationException unused) {
                    hzhVar.t();
                } catch (Exception e) {
                    hzhVar.u(e);
                    return;
                }
                break;
        }
    }
}
