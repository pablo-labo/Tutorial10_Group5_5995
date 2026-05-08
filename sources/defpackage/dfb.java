package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface dfb extends ts3 {
    default boolean G1() {
        return false;
    }

    default void J1() {
        f1();
    }

    void R(neb nebVar, peb pebVar, long j);

    default long R0() {
        int i = bpf.b;
        return bpf.a;
    }

    default void f0() {
    }

    void f1();

    @Override // defpackage.ts3
    default void w() {
        f1();
    }
}
