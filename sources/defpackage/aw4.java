package defpackage;

import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class aw4<T extends Enum<T>> implements KSerializer<T> {
    public final T[] a;
    public uv4 b;
    public final d2f c;

    /* JADX WARN: Multi-variable type inference failed */
    public aw4(Enum[] enumArr, String str) {
        enumArr.getClass();
        this.a = enumArr;
        this.c = new d2f(new ry(4, this, str));
    }

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        int iE = decoder.e(getDescriptor());
        T[] tArr = this.a;
        if (iE >= 0 && iE < tArr.length) {
            return tArr[iE];
        }
        throw new SerializationException(iE + " is not among valid " + getDescriptor().getA() + " enum values, values size is " + tArr.length);
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        T[] tArr = this.a;
        int iP0 = ut0.p0(r5, tArr);
        if (iP0 != -1) {
            encoder.h(getDescriptor(), iP0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String a = getDescriptor().getA();
        String string = Arrays.toString(tArr);
        string.getClass();
        sb.append(" is not a valid enum ");
        sb.append(a);
        sb.append(", must be one of ");
        sb.append(string);
        throw new SerializationException(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getA() + '>';
    }
}
