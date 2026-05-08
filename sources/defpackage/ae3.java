package defpackage;

import defpackage.ri6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class ae3 extends k42 {
    public byte[] j;
    public volatile boolean k;

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void a() {
        try {
            this.i.b(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                byte[] bArr = this.j;
                if (bArr.length < i2 + 16384) {
                    this.j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.i.read(this.j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                ((ri6.a) this).l = Arrays.copyOf(this.j, i2);
            }
            nn2.i(this.i);
        } catch (Throwable th) {
            nn2.i(this.i);
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void b() {
        this.k = true;
    }
}
