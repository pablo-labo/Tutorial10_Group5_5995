package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ba8 implements kna {
    public final /* synthetic */ int a;

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        switch (this.a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            default:
                Map.Entry entry = (Map.Entry) obj;
                lna lnaVar2 = lnaVar;
                lnaVar2.b(b6c.g, entry.getKey());
                lnaVar2.b(b6c.h, entry.getValue());
                return;
        }
    }
}
