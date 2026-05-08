package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface khf {

    public static final class a implements khf {
        public static final a a = new a();

        @Override // defpackage.khf
        public final float a() {
            return Float.NaN;
        }

        @Override // defpackage.khf
        public final long c() {
            int i = da2.j;
            return da2.i;
        }

        @Override // defpackage.khf
        public final sn1 e() {
            return null;
        }
    }

    float a();

    default khf b(gu5<? extends khf> gu5Var) {
        return !equals(a.a) ? this : gu5Var.invoke();
    }

    long c();

    default khf d(khf khfVar) {
        boolean z = khfVar instanceof un1;
        if (!z || !(this instanceof un1)) {
            return (!z || (this instanceof un1)) ? (z || !(this instanceof un1)) ? khfVar.b(new zh(this, 24)) : this : khfVar;
        }
        un1 un1Var = (un1) khfVar;
        tbe tbeVar = un1Var.a;
        float f = un1Var.b;
        if (Float.isNaN(f)) {
            f = ((un1) this).b;
        }
        return new un1(tbeVar, f);
    }

    sn1 e();
}
