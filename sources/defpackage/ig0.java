package defpackage;

import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes.dex */
public final class ig0 extends SegmentFinder {
    public final /* synthetic */ kn2 a;

    public ig0(kn2 kn2Var) {
        this.a = kn2Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.r(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.l(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.D(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.q(i);
    }
}
