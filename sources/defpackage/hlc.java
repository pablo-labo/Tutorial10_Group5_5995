package defpackage;

import com.facebook.react.runtime.ReactHostImpl;
import defpackage.maf;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hlc implements ku2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hlc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ku2
    public final Object a(maf mafVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AtomicInteger atomicInteger = ReactHostImpl.A;
                mafVar.getClass();
                maf<Void> mafVar2 = maf.g;
                return maf.a.c((Exception) obj);
            default:
                ku2 ku2Var = (ku2) obj;
                maf<Void> mafVar3 = maf.g;
                mafVar.getClass();
                if (!mafVar.e()) {
                    return mafVar.f() ? maf.a.c(mafVar.c()) : maf.a(mafVar, ku2Var);
                }
                maf<Object> mafVar4 = maf.j;
                mafVar4.getClass();
                return mafVar4;
        }
    }
}
