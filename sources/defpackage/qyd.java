package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class qyd {
    public static final lyd a = new lyd(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference<lyd>[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference<lyd>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        c = atomicReferenceArr;
    }

    public static final void a(lyd lydVar) {
        lydVar.getClass();
        if (lydVar.f != null || lydVar.g != null) {
            l5.q("Failed requirement.");
            return;
        }
        if (lydVar.d) {
            return;
        }
        AtomicReference<lyd> atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        lyd lydVar2 = a;
        lyd andSet = atomicReference.getAndSet(lydVar2);
        if (andSet == lydVar2) {
            return;
        }
        int i = andSet != null ? andSet.c : 0;
        if (i >= 65536) {
            atomicReference.set(andSet);
            return;
        }
        lydVar.f = andSet;
        lydVar.b = 0;
        lydVar.c = i + 8192;
        atomicReference.set(lydVar);
    }

    public static final lyd b() {
        AtomicReference<lyd> atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        lyd lydVar = a;
        lyd andSet = atomicReference.getAndSet(lydVar);
        if (andSet == lydVar) {
            return new lyd();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new lyd();
        }
        atomicReference.set(andSet.f);
        andSet.f = null;
        andSet.c = 0;
        return andSet;
    }
}
