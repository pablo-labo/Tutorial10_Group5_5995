package defpackage;

import defpackage.pjg;
import defpackage.ymb;
import java.time.DateTimeException;
import java.time.ZoneOffset;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class qjg implements KSerializer<pjg> {
    public static final qjg a = new qjg();
    public static final anb b = i7e.a("UtcOffset", ymb.i.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        pjg.a aVar = pjg.Companion;
        String strC = decoder.C();
        aVar.getClass();
        strC.getClass();
        try {
            return new pjg(ZoneOffset.of(strC));
        } catch (DateTimeException e) {
            throw new DateTimeFormatException(e);
        }
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        pjg pjgVar = (pjg) obj;
        pjgVar.getClass();
        encoder.E(pjgVar.toString());
    }
}
