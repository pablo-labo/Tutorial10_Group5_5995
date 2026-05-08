package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xh7 implements ws0<int[]> {
    @Override // defpackage.ws0
    public final String a() {
        return "IntegerArrayPool";
    }

    @Override // defpackage.ws0
    public final int b() {
        return 4;
    }

    @Override // defpackage.ws0
    public final int c(int[] iArr) {
        return iArr.length;
    }

    @Override // defpackage.ws0
    public final int[] newArray(int i) {
        return new int[i];
    }
}
