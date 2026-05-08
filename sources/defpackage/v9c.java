package defpackage;

import com.infra.eventlogger.model.EventPayload;
import java.util.Arrays;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class v9c {
    public final long a;
    public final long b;
    public final EventPayload c;
    public final byte[] d;
    public final JsonObject e;

    public /* synthetic */ v9c(long j, EventPayload eventPayload, byte[] bArr, JsonObject jsonObject, int i) {
        this(0L, j, (i & 4) != 0 ? null : eventPayload, (i & 8) != 0 ? null : bArr, (i & 16) != 0 ? null : jsonObject);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!v9c.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            ja.k("null cannot be cast to non-null type com.infra.eventlogger.persistence.QueuedEvent");
            return false;
        }
        v9c v9cVar = (v9c) obj;
        if (this.a != v9cVar.a || this.b != v9cVar.b || !wl7.b(this.c, v9cVar.c) || !wl7.b(this.e, v9cVar.e)) {
            return false;
        }
        byte[] bArr = v9cVar.d;
        byte[] bArr2 = this.d;
        if (bArr2 != null) {
            if (bArr == null || !Arrays.equals(bArr2, bArr)) {
                return false;
            }
        } else if (bArr != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iD = ia.d(Long.hashCode(this.a) * 31, 31, this.b);
        EventPayload eventPayload = this.c;
        int iHashCode = (iD + (eventPayload == null ? 0 : eventPayload.hashCode())) * 31;
        JsonObject jsonObject = this.e;
        int iHashCode2 = (iHashCode + (jsonObject == null ? 0 : jsonObject.a.hashCode())) * 31;
        byte[] bArr = this.d;
        return iHashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String toString() {
        String string = Arrays.toString(this.d);
        StringBuilder sbI = w40.i(this.a, "QueuedEvent(_id=", ", createdAt=");
        sbI.append(this.b);
        sbI.append(", eventPayload=");
        sbI.append(this.c);
        sbI.append(", avroEventPayload=");
        sbI.append(string);
        sbI.append(", jsonObjectPayload=");
        sbI.append(this.e);
        sbI.append(")");
        return sbI.toString();
    }

    public v9c(long j, long j2, EventPayload eventPayload, byte[] bArr, JsonObject jsonObject) {
        this.a = j;
        this.b = j2;
        this.c = eventPayload;
        this.d = bArr;
        this.e = jsonObject;
    }
}
