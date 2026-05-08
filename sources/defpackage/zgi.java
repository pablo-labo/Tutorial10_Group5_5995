package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zgi extends gai {
    public static final WeakReference d = new WeakReference(null);
    public WeakReference c;

    public zgi(byte[] bArr) {
        super(bArr);
        this.c = d;
    }

    @Override // defpackage.gai
    public final byte[] e() {
        byte[] bArrK1;
        synchronized (this) {
            try {
                bArrK1 = (byte[]) this.c.get();
                if (bArrK1 == null) {
                    bArrK1 = k1();
                    this.c = new WeakReference(bArrK1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrK1;
    }

    public abstract byte[] k1();
}
