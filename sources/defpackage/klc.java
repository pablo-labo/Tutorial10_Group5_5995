package defpackage;

import com.facebook.react.runtime.ReactHostImpl;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class klc implements ku2 {
    @Override // defpackage.ku2
    public final Object a(maf mafVar) {
        AtomicInteger atomicInteger = ReactHostImpl.A;
        mafVar.getClass();
        Object objD = mafVar.d();
        if (objD != null) {
            return ((ReactHostImpl.a) objD).a;
        }
        r6.g("Required value was null.");
        return null;
    }
}
