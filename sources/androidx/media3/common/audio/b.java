package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements AudioProcessor {
    public AudioProcessor.a b;
    public AudioProcessor.a c;
    public AudioProcessor.a d;
    public AudioProcessor.a e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public b() {
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    public abstract AudioProcessor.a a(AudioProcessor.a aVar);

    public void b() {
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean c() {
        return this.h && this.g == AudioProcessor.a;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.g;
        this.g = AudioProcessor.a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void f() {
        this.h = true;
        h();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.g = AudioProcessor.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        b();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a g(AudioProcessor.a aVar) {
        this.d = aVar;
        this.e = a(aVar);
        return isActive() ? this.e : AudioProcessor.a.e;
    }

    public void h() {
    }

    public void i() {
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.e != AudioProcessor.a.e;
    }

    public final ByteBuffer j(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
        i();
    }
}
