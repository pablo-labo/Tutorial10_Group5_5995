package com.infra.autocompleteclient.jsonmodels;

import defpackage.ewa;
import defpackage.ia;
import defpackage.o7e;
import defpackage.sy3;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/autocompleteclient/jsonmodels/LogEventBody;", "", "Companion", "$serializer", "autocomplete-client_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class LogEventBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String a;
    public final String b;
    public final long c;
    public final JsonElement d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/autocompleteclient/jsonmodels/LogEventBody$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/autocompleteclient/jsonmodels/LogEventBody;", "autocomplete-client_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        public final KSerializer<LogEventBody> serializer() {
            return LogEventBody$$serializer.INSTANCE;
        }
    }

    @sy3
    public /* synthetic */ LogEventBody(int i, String str, String str2, long j, JsonElement jsonElement) {
        if (15 != (i & 15)) {
            ewa.M(i, 15, LogEventBody$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = jsonElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogEventBody)) {
            return false;
        }
        LogEventBody logEventBody = (LogEventBody) obj;
        return wl7.b(this.a, logEventBody.a) && wl7.b(this.b, logEventBody.b) && this.c == logEventBody.c && wl7.b(this.d, logEventBody.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iD = ia.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
        JsonElement jsonElement = this.d;
        return iD + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    public final String toString() {
        return "LogEventBody(sid=" + this.a + ", actionType=" + this.b + ", time=" + this.c + ", data=" + this.d + ")";
    }
}
