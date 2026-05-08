package com.infra.eventlogger.model;

import com.infra.eventlogger.model.avro.NullableString;
import defpackage.ewa;
import defpackage.o7e;
import defpackage.sy3;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/DeviceProperties;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class DeviceProperties {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String a;
    public final NullableString b;
    public final NullableString c;
    public final NullableString d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/DeviceProperties$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/DeviceProperties;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<DeviceProperties> serializer() {
            return DeviceProperties$$serializer.INSTANCE;
        }
    }

    @sy3
    public /* synthetic */ DeviceProperties(int i, String str, NullableString nullableString, NullableString nullableString2, NullableString nullableString3) {
        if (15 != (i & 15)) {
            ewa.M(i, 15, DeviceProperties$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = nullableString;
        this.c = nullableString2;
        this.d = nullableString3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceProperties)) {
            return false;
        }
        DeviceProperties deviceProperties = (DeviceProperties) obj;
        return wl7.b(this.a, deviceProperties.a) && wl7.b(this.b, deviceProperties.b) && wl7.b(this.c, deviceProperties.c) && wl7.b(this.d, deviceProperties.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        NullableString nullableString = this.b;
        int iHashCode2 = (iHashCode + (nullableString == null ? 0 : nullableString.a.hashCode())) * 31;
        NullableString nullableString2 = this.c;
        int iHashCode3 = (iHashCode2 + (nullableString2 == null ? 0 : nullableString2.a.hashCode())) * 31;
        NullableString nullableString3 = this.d;
        return iHashCode3 + (nullableString3 != null ? nullableString3.a.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceProperties(platform=" + this.a + ", manufacturer=" + this.b + ", model=" + this.c + ", advertisingId=" + this.d + ")";
    }

    public DeviceProperties(String str, NullableString nullableString, NullableString nullableString2, NullableString nullableString3) {
        str.getClass();
        this.a = str;
        this.b = nullableString;
        this.c = nullableString2;
        this.d = nullableString3;
    }
}
