package defpackage;

import defpackage.o09;
import defpackage.ymb;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class p09 implements KSerializer<o09> {
    public static final p09 a = new p09();
    public static final anb b = i7e.a("LocalDateTime", ymb.i.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        o09.a aVar = o09.Companion;
        String strC = decoder.C();
        aVar.getClass();
        strC.getClass();
        try {
            return new o09(LocalDateTime.parse(strC));
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
        o09 o09Var = (o09) obj;
        o09Var.getClass();
        encoder.E(o09Var.toString());
    }
}
