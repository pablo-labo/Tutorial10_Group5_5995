package defpackage;

import defpackage.lg7;
import defpackage.ymb;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class ng7 implements KSerializer<lg7> {
    public static final ng7 a = new ng7();
    public static final anb b = i7e.a("Instant", ymb.i.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        lg7.a aVar = lg7.Companion;
        String strC = decoder.C();
        aVar.getClass();
        strC.getClass();
        try {
            int iR = zve.R(strC, 'T', 0, true, 2);
            if (iR != -1) {
                int length = strC.length() - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        char cCharAt = strC.charAt(length);
                        if (cCharAt == '+' || cCharAt == '-') {
                            break;
                        }
                        if (i < 0) {
                            break;
                        }
                        length = i;
                    }
                    length = -1;
                    if (length >= iR && zve.R(strC, ':', length, false, 4) == -1) {
                        strC = strC + ":00";
                    }
                } else {
                    length = -1;
                    if (length >= iR) {
                        strC = strC + ":00";
                    }
                }
            }
            Instant instant = OffsetDateTime.parse(strC).toInstant();
            instant.getClass();
            return new lg7(instant);
        } catch (DateTimeParseException e) {
            throw new DateTimeFormatException(e);
        }
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        lg7 lg7Var = (lg7) obj;
        lg7Var.getClass();
        encoder.E(lg7Var.toString());
    }
}
