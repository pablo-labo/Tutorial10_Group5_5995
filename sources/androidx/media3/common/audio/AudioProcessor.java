package androidx.media3.common.audio;

import defpackage.k6;
import defpackage.vjg;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface AudioProcessor {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {
        public static final a e = new a(-1, -1, -1);
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = vjg.J(i3) ? vjg.t(i3) * i2 : -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.a);
            sb.append(", channelCount=");
            sb.append(this.b);
            sb.append(", encoding=");
            return k6.h(sb, this.c, ']');
        }
    }

    boolean c();

    ByteBuffer d();

    void e(ByteBuffer byteBuffer);

    void f();

    void flush();

    a g(a aVar);

    boolean isActive();

    void reset();

    public static final class UnhandledAudioFormatException extends Exception {
        public final a inputAudioFormat;

        public UnhandledAudioFormatException(String str, a aVar) {
            super(str + " " + aVar);
            this.inputAudioFormat = aVar;
        }

        public UnhandledAudioFormatException(a aVar) {
            this("Unhandled input format:", aVar);
        }
    }
}
