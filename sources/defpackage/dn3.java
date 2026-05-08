package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dn3 implements gze<tn9> {
    @Override // defpackage.gze
    public final tn9 get() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i = iMin < 16777216 ? 1048576 : iMin < 33554432 ? 2097152 : 4194304;
        return new tn9(i, Integer.MAX_VALUE, i, i / 8);
    }
}
