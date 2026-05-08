package defpackage;

import com.facebook.react.runtime.ReactHostImpl;
import defpackage.x15;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zkc implements ku2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReactHostImpl b;

    public /* synthetic */ zkc(ReactHostImpl reactHostImpl, int i) {
        this.a = i;
        this.b = reactHostImpl;
    }

    @Override // defpackage.ku2
    public final Object a(maf mafVar) {
        int i = this.a;
        ReactHostImpl reactHostImpl = this.b;
        switch (i) {
            case 0:
                AtomicInteger atomicInteger = ReactHostImpl.A;
                mafVar.getClass();
                boolean zF = mafVar.f();
                x15.a aVar = x15.b;
                if (!zF) {
                    return mafVar.b(new daf(), aVar);
                }
                Exception excC = mafVar.c();
                if (excC == null) {
                    r6.g("Required value was null.");
                    return null;
                }
                if (reactHostImpl.g) {
                    reactHostImpl.h.handleException(excC);
                } else {
                    reactHostImpl.b.handleInstanceException(excC);
                }
                return reactHostImpl.p(excC, "getOrCreateStartTask() failure: " + excC.getMessage()).b(new hlc(excC, 0), aVar);
            default:
                AtomicInteger atomicInteger2 = ReactHostImpl.A;
                mafVar.getClass();
                if (!mafVar.f()) {
                    return mafVar;
                }
                Exception excC2 = mafVar.c();
                if (excC2 == null) {
                    r6.g("Required value was null.");
                    return null;
                }
                if (reactHostImpl.g) {
                    reactHostImpl.h.handleException(excC2);
                } else {
                    reactHostImpl.b.handleInstanceException(excC2);
                }
                return reactHostImpl.p(excC2, "Reload failed");
        }
    }
}
