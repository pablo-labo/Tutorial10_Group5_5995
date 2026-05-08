package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wq1 implements ws0<byte[]> {
    @Override // defpackage.ws0
    public final String a() {
        return "ByteArrayPool";
    }

    @Override // defpackage.ws0
    public final int b() {
        return 1;
    }

    @Override // defpackage.ws0
    public final int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // defpackage.ws0
    public final byte[] newArray(int i) {
        return new byte[i];
    }
}
