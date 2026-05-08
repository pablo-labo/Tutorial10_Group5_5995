package defpackage;

import defpackage.ymb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class xkg implements KSerializer<vkg> {
    public static final xkg a = new xkg();
    public static final anb b = new anb("kotlin.uuid.Uuid", ymb.i.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        String strC = decoder.C();
        strC.getClass();
        int length = strC.length();
        if (length == 32) {
            long jD = th6.d(0, 16, strC);
            long jD2 = th6.d(16, 32, strC);
            if (jD != 0 || jD2 != 0) {
                return new vkg(jD, jD2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strC.length() <= 64 ? strC : strC.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strC.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long jD3 = th6.d(0, 8, strC);
            nn2.h(8, strC);
            long jD4 = th6.d(9, 13, strC);
            nn2.h(13, strC);
            long jD5 = th6.d(14, 18, strC);
            nn2.h(18, strC);
            long jD6 = th6.d(19, 23, strC);
            nn2.h(23, strC);
            long j = (jD4 << 16) | (jD3 << 32) | jD5;
            long jD7 = th6.d(24, 36, strC) | (jD6 << 48);
            if (j != 0 || jD7 != 0) {
                return new vkg(j, jD7);
            }
        }
        return vkg.a;
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        vkg vkgVar = (vkg) obj;
        vkgVar.getClass();
        encoder.E(vkgVar.toString());
    }
}
