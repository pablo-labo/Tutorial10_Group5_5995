package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface sl8 {
    default void A(sl8 sl8Var, float[] fArr) {
        ae7.e("transformFrom is not implemented on this LayoutCoordinates");
    }

    long B(long j);

    long G(sl8 sl8Var, long j);

    qtc J(sl8 sl8Var, boolean z);

    long L(long j);

    default void N(float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    sl8 U();

    long a();

    long a0(long j);

    boolean d();

    default long p(long j) {
        return 9205357640488583168L;
    }

    default long v(long j) {
        return 9205357640488583168L;
    }

    sl8 y();
}
