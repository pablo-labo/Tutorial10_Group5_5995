package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yr1 implements f5d<byte[]> {
    public final byte[] a;

    public yr1(byte[] bArr) {
        beb.e(bArr, "Argument must not be null");
        this.a = bArr;
    }

    @Override // defpackage.f5d
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.f5d
    public final Class<byte[]> b() {
        return byte[].class;
    }

    @Override // defpackage.f5d
    public final byte[] get() {
        return this.a;
    }

    @Override // defpackage.f5d
    public final void recycle() {
    }
}
