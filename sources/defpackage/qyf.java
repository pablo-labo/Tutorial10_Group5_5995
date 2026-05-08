package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qyf {
    public static final /* synthetic */ qyf[] a;
    public static final /* synthetic */ wv4 b;
    private final int value;

    static {
        qyf[] qyfVarArr = {new qyf("Int8Array", 0), new qyf("Int16Array", 1), new qyf("Int32Array", 2), new qyf("Uint8Array", 3), new qyf("Uint8ClampedArray", 4), new qyf("Uint16Array", 5), new qyf("Uint32Array", 6), new qyf("Float32Array", 7), new qyf("Float64Array", 8), new qyf("BigInt64Array", 9), new qyf("BigUint64Array", 10)};
        a = qyfVarArr;
        b = new wv4(qyfVarArr);
    }

    public qyf() {
        throw null;
    }

    public qyf(String str, int i) {
        int i2 = nn2.c0;
        nn2.c0 = i2 + 1;
        this.value = i2;
    }

    public static qyf valueOf(String str) {
        return (qyf) Enum.valueOf(qyf.class, str);
    }

    public static qyf[] values() {
        return (qyf[]) a.clone();
    }

    public final int a() {
        return this.value;
    }
}
