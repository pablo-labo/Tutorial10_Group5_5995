package defpackage;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class th5 implements pyf, lz5<Float>, djc {
    public final JavaScriptTypedArray a;

    public th5(JavaScriptTypedArray javaScriptTypedArray) {
        javaScriptTypedArray.getClass();
        this.a = javaScriptTypedArray;
    }

    @Override // defpackage.djc
    public final JavaScriptTypedArray a() {
        return this.a;
    }

    @Override // defpackage.lz5
    public final Float get(int i) {
        if (i < 0 || i >= getLength()) {
            k20.o();
            return null;
        }
        return Float.valueOf(this.a.readFloat(i * 4));
    }

    @Override // defpackage.pyf
    public final int getLength() {
        return this.a.getLength();
    }

    @Override // java.lang.Iterable
    public final Iterator<Float> iterator() {
        return new g7e(this);
    }

    @Override // defpackage.pyf
    public final ByteBuffer toDirectBuffer() {
        return this.a.toDirectBuffer();
    }
}
