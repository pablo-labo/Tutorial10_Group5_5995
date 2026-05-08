package defpackage;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class hf1 implements pyf, lz5<l4g>, djc {
    public final JavaScriptTypedArray a;

    public hf1(JavaScriptTypedArray javaScriptTypedArray) {
        javaScriptTypedArray.getClass();
        this.a = javaScriptTypedArray;
    }

    @Override // defpackage.djc
    public final JavaScriptTypedArray a() {
        return this.a;
    }

    @Override // defpackage.lz5
    public final l4g get(int i) {
        if (i >= 0) {
            JavaScriptTypedArray javaScriptTypedArray = this.a;
            if (i < javaScriptTypedArray.getLength()) {
                return new l4g(javaScriptTypedArray.read8Byte(i * 8));
            }
        }
        k20.o();
        return null;
    }

    @Override // defpackage.pyf
    public final int getLength() {
        return this.a.getLength();
    }

    @Override // java.lang.Iterable
    public final Iterator<l4g> iterator() {
        return new g7e(this);
    }

    @Override // defpackage.pyf
    public final ByteBuffer toDirectBuffer() {
        return this.a.toDirectBuffer();
    }
}
