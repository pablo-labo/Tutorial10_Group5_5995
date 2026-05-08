package defpackage;

import com.facebook.react.runtime.ReactHostImpl;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ykc implements ku2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReactHostImpl b;
    public final /* synthetic */ String c;

    public /* synthetic */ ykc(ReactHostImpl reactHostImpl, String str, int i) {
        this.a = i;
        this.b = reactHostImpl;
        this.c = str;
    }

    @Override // defpackage.ku2
    public final Object a(maf mafVar) {
        int i = this.a;
        String str = this.c;
        ReactHostImpl reactHostImpl = this.b;
        switch (i) {
            case 0:
                AtomicInteger atomicInteger = ReactHostImpl.A;
                mafVar.getClass();
                if (mafVar.f()) {
                    Exception excC = mafVar.c();
                    if (excC == null) {
                        r6.g("Required value was null.");
                        return null;
                    }
                    reactHostImpl.u("getOrCreateReloadTask()", t40.l("Error during reload. ReactInstance task faulted. Fault reason: ", excC.getMessage(), ". Reload reason: ", str), mafVar.c());
                }
                if (mafVar.e()) {
                    reactHostImpl.u("getOrCreateReloadTask()", "Error during reload. ReactInstance task cancelled. Reload reason: ".concat(str), null);
                }
                reactHostImpl.t("getOrCreateReloadTask()", "Resetting reload task ref");
                reactHostImpl.y = null;
                return mafVar;
            default:
                AtomicInteger atomicInteger2 = ReactHostImpl.A;
                mafVar.getClass();
                return reactHostImpl.q(str);
        }
    }
}
