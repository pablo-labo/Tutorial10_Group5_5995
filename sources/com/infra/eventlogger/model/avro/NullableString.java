package com.infra.eventlogger.model.avro;

import defpackage.ewa;
import defpackage.l5;
import defpackage.o7e;
import defpackage.sy3;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/avro/NullableString;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class NullableString {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/avro/NullableString$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/avro/NullableString;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NullableString> serializer() {
            return NullableString$$serializer.INSTANCE;
        }
    }

    @sy3
    public /* synthetic */ NullableString(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            ewa.M(i, 1, NullableString$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NullableString) && wl7.b(this.a, ((NullableString) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return l5.m("NullableString(string=", this.a, ")");
    }

    public NullableString(String str) {
        str.getClass();
        this.a = str;
    }
}
