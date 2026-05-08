package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import defpackage.e47;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final e47<AudioProcessor> a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public a(e47<AudioProcessor> e47Var) {
        this.a = e47Var;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.d = false;
    }

    public final void a() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        int i = 0;
        while (true) {
            e47<AudioProcessor> e47Var = this.a;
            if (i >= e47Var.size()) {
                break;
            }
            AudioProcessor audioProcessor = e47Var.get(i);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= b(); i2++) {
            this.c[i2] = ((AudioProcessor) arrayList.get(i2)).d();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((AudioProcessor) this.b.get(b())).c() && !this.c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= b()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    AudioProcessor audioProcessor = (AudioProcessor) arrayList.get(i);
                    if (!audioProcessor.c()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.a;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.e(byteBuffer2);
                        this.c[i] = audioProcessor.d();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < b()) {
                        ((AudioProcessor) arrayList.get(i + 1)).f();
                    }
                }
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        e47<AudioProcessor> e47Var = ((a) obj).a;
        e47<AudioProcessor> e47Var2 = this.a;
        if (e47Var2.size() != e47Var.size()) {
            return false;
        }
        for (int i = 0; i < e47Var2.size(); i++) {
            if (e47Var2.get(i) != e47Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
