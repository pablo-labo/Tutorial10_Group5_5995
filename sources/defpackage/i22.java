package defpackage;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i22 extends b {
    public int[] i;
    public int[] j;

    @Override // androidx.media3.common.audio.b
    public final AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i = aVar.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return AudioProcessor.a.e;
        }
        int i2 = aVar.b;
        if (!vjg.J(i)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new AudioProcessor.UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new AudioProcessor.a(aVar.a, iArr.length, i) : AudioProcessor.a.e;
    }

    @Override // androidx.media3.common.audio.b
    public final void b() {
        this.j = this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    @Override // androidx.media3.common.audio.AudioProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.nio.ByteBuffer r18) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i22.e(java.nio.ByteBuffer):void");
    }

    @Override // androidx.media3.common.audio.b
    public final void i() {
        this.j = null;
        this.i = null;
    }
}
