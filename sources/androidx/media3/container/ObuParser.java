package androidx.media3.container;

import defpackage.f4b;
import defpackage.ka2;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ObuParser {

    public static final class a {
        public final boolean a;

        public a(c cVar, b bVar) throws NotYetImplementedException {
            int i = bVar.a;
            ByteBuffer byteBuffer = bVar.b;
            int i2 = 0;
            ka2.l(i == 6 || i == 3);
            int iMin = Math.min(4, byteBuffer.remaining());
            byte[] bArr = new byte[iMin];
            byteBuffer.asReadOnlyBuffer().get(bArr);
            f4b f4bVar = new f4b(bArr, iMin);
            cVar.getClass();
            if (f4bVar.f()) {
                this.a = false;
                return;
            }
            int iG = f4bVar.g(2);
            if (!f4bVar.f()) {
                this.a = true;
                return;
            }
            if (iG != 3 && iG != 0) {
                f4bVar.f();
            }
            f4bVar.n();
            throw new NotYetImplementedException(i2);
        }
    }

    public static final class b {
        public final int a;
        public final ByteBuffer b;

        public b(ByteBuffer byteBuffer, int i) {
            this.a = i;
            this.b = byteBuffer;
        }
    }

    public static final class c {
    }

    public static ArrayList a(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b2 = byteBufferAsReadOnlyBuffer.get();
            int i = (b2 >> 3) & 15;
            if (((b2 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            if (((b2 >> 1) & 1) != 0) {
                iRemaining = 0;
                for (int i2 = 0; i2 < 8; i2++) {
                    byte b3 = byteBufferAsReadOnlyBuffer.get();
                    iRemaining |= (b3 & 127) << (i2 * 7);
                    if ((b3 & 128) == 0) {
                        break;
                    }
                }
            } else {
                iRemaining = byteBufferAsReadOnlyBuffer.remaining();
            }
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            arrayList.add(new b(byteBufferDuplicate, i));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
        }
        return arrayList;
    }

    public static class NotYetImplementedException extends Exception {
        private NotYetImplementedException() {
        }

        public /* synthetic */ NotYetImplementedException(int i) {
            this();
        }
    }
}
