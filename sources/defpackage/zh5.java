package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface zh5 extends yd0<Float> {
    @Override // defpackage.yd0
    default lmg a(lvf lvfVar) {
        return new pmg(this);
    }

    default float c(float f, float f2, float f3) {
        return e(f(f, f2, f3), f, f2, f3);
    }

    float d(long j, float f, float f2, float f3);

    float e(long j, float f, float f2, float f3);

    long f(float f, float f2, float f3);
}
