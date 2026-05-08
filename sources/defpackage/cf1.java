package defpackage;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class cf1 implements pyf, lz5<Long>, djc {
    public final JavaScriptTypedArray a;

    public cf1(JavaScriptTypedArray javaScriptTypedArray) {
        javaScriptTypedArray.getClass();
        this.a = javaScriptTypedArray;
    }

    @Override // defpackage.djc
    public final JavaScriptTypedArray a() {
        return this.a;
    }

    @Override // defpackage.lz5
    public final Long get(int i) {
        if (i < 0 || i >= getLength()) {
            k20.o();
            return null;
        }
        return Long.valueOf(this.a.read8Byte(i * 8));
    }

    @Override // defpackage.pyf
    public final int getLength() {
        return this.a.getLength();
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new g7e(this);
    }

    @Override // defpackage.pyf
    public final ByteBuffer toDirectBuffer() {
        return this.a.toDirectBuffer();
    }
}
