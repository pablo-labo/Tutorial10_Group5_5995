package com.infra.eventlogger.model.avro;

import defpackage.ewa;
import defpackage.o7e;
import defpackage.sy3;
import defpackage.u40;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/avro/NullableLong;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class NullableLong {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final long a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/avro/NullableLong$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/avro/NullableLong;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NullableLong> serializer() {
            return NullableLong$$serializer.INSTANCE;
        }
    }

    @sy3
    public /* synthetic */ NullableLong(int i, long j) {
        if (1 == (i & 1)) {
            this.a = j;
        } else {
            ewa.M(i, 1, NullableLong$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NullableLong) && this.a == ((NullableLong) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return u40.c(this.a, "NullableLong(long=", ")");
    }

    public NullableLong(long j) {
        this.a = j;
    }
}
