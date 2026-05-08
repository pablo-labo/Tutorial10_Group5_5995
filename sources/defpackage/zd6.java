package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zd6 extends pvf<AtomicLongArray> {
    public final /* synthetic */ pvf a;

    public zd6(pvf pvfVar) {
        this.a = pvfVar;
    }

    @Override // defpackage.pvf
    public final AtomicLongArray a(nb8 nb8Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        nb8Var.a();
        while (nb8Var.hasNext()) {
            arrayList.add(Long.valueOf(((Number) this.a.a(nb8Var)).longValue()));
        }
        nb8Var.v();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    @Override // defpackage.pvf
    public final void b(gc8 gc8Var, AtomicLongArray atomicLongArray) throws IOException {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        gc8Var.h();
        int length = atomicLongArray2.length();
        for (int i = 0; i < length; i++) {
            this.a.b(gc8Var, Long.valueOf(atomicLongArray2.get(i)));
        }
        gc8Var.v();
    }
}
