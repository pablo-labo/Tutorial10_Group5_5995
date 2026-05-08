package defpackage;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.b;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class wmf extends b {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void k(ByteBuffer byteBuffer, int i2) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i2) * 4.656612875245797E-10d));
        if (iFloatToIntBits == i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // androidx.media3.common.audio.b
    public final AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i2 = aVar.c;
        if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4) {
            return i2 != 4 ? new AudioProcessor.a(aVar.a, aVar.b, 4) : AudioProcessor.a.e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferJ;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.b.c;
        if (i3 == 21) {
            byteBufferJ = j((i2 / 3) * 4);
            while (iPosition < iLimit) {
                k(byteBufferJ, ((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            byteBufferJ = j(i2);
            while (iPosition < iLimit) {
                k(byteBufferJ, (byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24));
                iPosition += 4;
            }
        } else if (i3 == 1342177280) {
            byteBufferJ = j((i2 / 3) * 4);
            while (iPosition < iLimit) {
                k(byteBufferJ, ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                bg.h();
                return;
            }
            byteBufferJ = j(i2);
            while (iPosition < iLimit) {
                k(byteBufferJ, (byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }
}
