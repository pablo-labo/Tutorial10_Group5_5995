package defpackage;

import defpackage.m09;
import defpackage.ymb;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class n09 implements KSerializer<m09> {
    public static final n09 a = new n09();
    public static final anb b = i7e.a("LocalDate", ymb.i.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        m09.a aVar = m09.Companion;
        String strC = decoder.C();
        aVar.getClass();
        strC.getClass();
        try {
            return new m09(LocalDate.parse(strC));
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
        m09 m09Var = (m09) obj;
        m09Var.getClass();
        encoder.E(m09Var.toString());
    }
}
