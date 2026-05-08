package defpackage;

import com.google.android.gms.common.Feature;
import defpackage.vf0;
import vf0.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class paf<A extends vf0.b, ResultT> {
    public final Feature[] a;
    public final boolean b;
    public final int c;

    public static class a<A extends vf0.b, ResultT> {
        public n0d a;
        public boolean b;
        public Feature[] c;
        public int d;

        public final rah a() {
            fib.a("execute parameter required", this.a != null);
            return new rah(this, this.c, this.b, this.d);
        }
    }

    public paf(Feature[] featureArr, boolean z, int i) {
        this.a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static <A extends vf0.b, ResultT> a<A, ResultT> a() {
        a<A, ResultT> aVar = new a<>();
        aVar.b = true;
        aVar.d = 0;
        return aVar;
    }
}
