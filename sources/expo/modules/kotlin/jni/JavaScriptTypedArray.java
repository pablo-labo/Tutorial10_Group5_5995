package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import defpackage.d2f;
import defpackage.ig;
import defpackage.la;
import defpackage.n30;
import defpackage.pyf;
import defpackage.qyf;
import defpackage.s6;
import defpackage.ye;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096 ¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b$\u0010%J \u0010'\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0015H\u0096 ¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0018H\u0096 ¢\u0006\u0004\b)\u0010*J \u0010+\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b+\u0010,J \u0010-\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u001dH\u0096 ¢\u0006\u0004\b-\u0010.J \u0010/\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020 H\u0096 ¢\u0006\u0004\b/\u00100J \u00101\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020#H\u0096 ¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptTypedArray;", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "Lpyf;", "Lcom/facebook/jni/HybridData;", "hybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "", "getRawKind", "()I", "Ljava/nio/ByteBuffer;", "toDirectBuffer", "()Ljava/nio/ByteBuffer;", "", "buffer", "position", "size", "Lj6g;", "read", "([BII)V", "write", "", "readByte", "(I)B", "", "read2Byte", "(I)S", "read4Byte", "(I)I", "", "read8Byte", "(I)J", "", "readFloat", "(I)F", "", "readDouble", "(I)D", "value", "writeByte", "(IB)V", "write2Byte", "(IS)V", "write4Byte", "(II)V", "write8Byte", "(IJ)V", "writeFloat", "(IF)V", "writeDouble", "(ID)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaScriptTypedArray extends JavaScriptObject implements pyf {
    public final d2f a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaScriptTypedArray(HybridData hybridData) {
        super(hybridData);
        hybridData.getClass();
        new d2f(new n30(this, 6));
        this.a = new d2f(new ye(this, 11));
        new d2f(new la(this, 14));
        new d2f(new ig(this, 10));
    }

    public static qyf e(JavaScriptTypedArray javaScriptTypedArray) {
        int rawKind = javaScriptTypedArray.getRawKind();
        for (qyf qyfVar : qyf.b) {
            if (qyfVar.a() == rawKind) {
                return qyfVar;
            }
        }
        s6.j("Collection contains no element matching the predicate.");
        return null;
    }

    private final native int getRawKind();

    @Override // defpackage.pyf
    public final int getLength() {
        return ((Number) this.a.getValue()).intValue();
    }

    public native void read(byte[] buffer, int position, int size);

    public native short read2Byte(int position);

    public native int read4Byte(int position);

    public native long read8Byte(int position);

    public native byte readByte(int position);

    public native double readDouble(int position);

    public native float readFloat(int position);

    @Override // defpackage.pyf
    public native ByteBuffer toDirectBuffer();

    public native void write(byte[] buffer, int position, int size);

    public native void write2Byte(int position, short value);

    public native void write4Byte(int position, int value);

    public native void write8Byte(int position, long value);

    public native void writeByte(int position, byte value);

    public native void writeDouble(int position, double value);

    public native void writeFloat(int position, float value);
}
