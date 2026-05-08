package defpackage;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class k5g implements pyf, lz5<f4g>, djc {
    public final JavaScriptTypedArray a;

    public k5g(JavaScriptTypedArray javaScriptTypedArray) {
        javaScriptTypedArray.getClass();
        this.a = javaScriptTypedArray;
    }

    @Override // defpackage.djc
    public final JavaScriptTypedArray a() {
        return this.a;
    }

    @Override // defpackage.lz5
    public final f4g get(int i) {
        if (i >= 0) {
            JavaScriptTypedArray javaScriptTypedArray = this.a;
            if (i < javaScriptTypedArray.getLength()) {
                return new f4g(javaScriptTypedArray.read4Byte(i * 4));
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
    public final Iterator<f4g> iterator() {
        return new g7e(this);
    }

    @Override // defpackage.pyf
    public final ByteBuffer toDirectBuffer() {
        return this.a.toDirectBuffer();
    }
}
