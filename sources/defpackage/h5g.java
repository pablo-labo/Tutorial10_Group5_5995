package defpackage;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class h5g implements pyf, lz5<u4g>, djc {
    public final JavaScriptTypedArray a;

    public h5g(JavaScriptTypedArray javaScriptTypedArray) {
        javaScriptTypedArray.getClass();
        this.a = javaScriptTypedArray;
    }

    @Override // defpackage.djc
    public final JavaScriptTypedArray a() {
        return this.a;
    }

    @Override // defpackage.lz5
    public final u4g get(int i) {
        if (i >= 0) {
            JavaScriptTypedArray javaScriptTypedArray = this.a;
            if (i < javaScriptTypedArray.getLength()) {
                return new u4g(javaScriptTypedArray.read2Byte(i * 2));
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
    public final Iterator<u4g> iterator() {
        return new g7e(this);
    }

    @Override // defpackage.pyf
    public final ByteBuffer toDirectBuffer() {
        return this.a.toDirectBuffer();
    }
}
