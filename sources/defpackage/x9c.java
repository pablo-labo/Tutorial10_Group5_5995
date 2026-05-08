package defpackage;

import com.infra.eventlogger.model.EventPayload;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class x9c extends qv4<v9c> {
    public final /* synthetic */ bac d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9c(bac bacVar, xed xedVar) {
        super(xedVar);
        this.d = bacVar;
    }

    @Override // defpackage.ha1
    public final String d() {
        return "INSERT OR ABORT INTO `QueuedEvent` (`_id`,`createdAt`,`eventPayload`,`avroEventPayload`,`jsonObjectPayload`) VALUES (nullif(?, 0),?,?,?,?)";
    }

    @Override // defpackage.qv4
    public final void h(zze zzeVar, v9c v9cVar) {
        v9c v9cVar2 = v9cVar;
        zzeVar.q(1, v9cVar2.a);
        zzeVar.q(2, v9cVar2.b);
        EventPayload eventPayload = v9cVar2.c;
        String strB = eventPayload == null ? null : k05.a.b(EventPayload.Companion.serializer(), eventPayload);
        if (strB == null) {
            zzeVar.u(3);
        } else {
            zzeVar.n(3, strB);
        }
        byte[] bArr = v9cVar2.d;
        if (bArr == null) {
            zzeVar.u(4);
        } else {
            zzeVar.r(4, bArr);
        }
        bb8 bb8Var = this.d.c;
        JsonObject jsonObject = v9cVar2.e;
        bb8Var.getClass();
        String strB2 = jsonObject != null ? cb8.a.b(JsonObject.Companion.serializer(), jsonObject) : null;
        if (strB2 == null) {
            zzeVar.u(5);
        } else {
            zzeVar.n(5, strB2);
        }
    }
}
