package com.infra.eventlogger.model;

import com.infra.eventlogger.model.avro.NullableLong;
import com.infra.eventlogger.model.avro.NullableString;
import defpackage.akb;
import defpackage.atd;
import defpackage.b0;
import defpackage.boa;
import defpackage.ewa;
import defpackage.fwc;
import defpackage.gu5;
import defpackage.ia;
import defpackage.iwc;
import defpackage.k20;
import defpackage.l6;
import defpackage.mj8;
import defpackage.o6;
import defpackage.o7e;
import defpackage.qt8;
import defpackage.sy3;
import defpackage.w40;
import defpackage.wl7;
import defpackage.yd8;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public abstract class EventPayload {
    public static final Companion Companion = new Companion();
    public static final Lazy<KSerializer<Object>> a = boa.E(qt8.b, a.a);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<EventPayload> serializer() {
            return (KSerializer) EventPayload.a.getValue();
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0002\u0004¨\u0006\u0005"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$ExternalAppOpenEvent;", "Lcom/infra/eventlogger/model/EventPayload;", "Companion", "$serializer", "ExternalAppOpenEventData", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class ExternalAppOpenEvent extends EventPayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final ExternalAppOpenEventData b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$ExternalAppOpenEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$ExternalAppOpenEvent;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ExternalAppOpenEvent> serializer() {
                return EventPayload$ExternalAppOpenEvent$$serializer.INSTANCE;
            }
        }

        @o7e
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$ExternalAppOpenEvent$ExternalAppOpenEventData;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class ExternalAppOpenEventData {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final DeviceProperties a;
            public final EventProperties b;
            public final String c;
            public final ReferralParams d;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$ExternalAppOpenEvent$ExternalAppOpenEventData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$ExternalAppOpenEvent$ExternalAppOpenEventData;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<ExternalAppOpenEventData> serializer() {
                    return EventPayload$ExternalAppOpenEvent$ExternalAppOpenEventData$$serializer.INSTANCE;
                }
            }

            @sy3
            public /* synthetic */ ExternalAppOpenEventData(int i, DeviceProperties deviceProperties, EventProperties eventProperties, String str, ReferralParams referralParams) {
                if (15 != (i & 15)) {
                    ewa.M(i, 15, EventPayload$ExternalAppOpenEvent$ExternalAppOpenEventData$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = deviceProperties;
                this.b = eventProperties;
                this.c = str;
                this.d = referralParams;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExternalAppOpenEventData)) {
                    return false;
                }
                ExternalAppOpenEventData externalAppOpenEventData = (ExternalAppOpenEventData) obj;
                return wl7.b(this.a, externalAppOpenEventData.a) && wl7.b(this.b, externalAppOpenEventData.b) && wl7.b(this.c, externalAppOpenEventData.c) && wl7.b(this.d, externalAppOpenEventData.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + akb.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            }

            public final String toString() {
                return "ExternalAppOpenEventData(device=" + this.a + ", properties=" + this.b + ", url=" + this.c + ", referralParams=" + this.d + ")";
            }
        }

        @sy3
        public /* synthetic */ ExternalAppOpenEvent(int i, ExternalAppOpenEventData externalAppOpenEventData) {
            if (1 == (i & 1)) {
                this.b = externalAppOpenEventData;
            } else {
                ewa.M(i, 1, EventPayload$ExternalAppOpenEvent$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExternalAppOpenEvent) && wl7.b(this.b, ((ExternalAppOpenEvent) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ExternalAppOpenEvent(fingerprintedData=" + this.b + ")";
        }
    }

    public static final class a extends mj8 implements gu5<KSerializer<Object>> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final KSerializer<Object> invoke() {
            iwc iwcVar = fwc.a;
            return new atd("com.infra.eventlogger.model.EventPayload", iwcVar.b(EventPayload.class), new yd8[]{iwcVar.b(HttpErrorEvent.class), iwcVar.b(GenericEvent.class), iwcVar.b(GenericLifecycleEvent.class), iwcVar.b(NonFatalErrorEvent.class), iwcVar.b(AppMetricsEvent.class), iwcVar.b(NativeHttpMetricsEvent.class), iwcVar.b(ExternalAppOpenEvent.class), iwcVar.b(OrganicAppOpenEvent.class)}, new KSerializer[]{EventPayload$HttpErrorEvent$$serializer.INSTANCE, EventPayload$GenericEvent$$serializer.INSTANCE, EventPayload$GenericLifecycleEvent$$serializer.INSTANCE, EventPayload$NonFatalErrorEvent$$serializer.INSTANCE, EventPayload$AppMetricsEvent$$serializer.INSTANCE, EventPayload$NativeHttpMetricsEvent$$serializer.INSTANCE, EventPayload$ExternalAppOpenEvent$$serializer.INSTANCE, EventPayload$OrganicAppOpenEvent$$serializer.INSTANCE});
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0002\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent;", "Lcom/infra/eventlogger/model/EventPayload;", "Companion", "$serializer", "HttpErrorEventData", "HttpRequestDebug", "HttpResponseDebug", "NullableHttpResponseDebug", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class HttpErrorEvent extends EventPayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final HttpErrorEventData b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<HttpErrorEvent> serializer() {
                return EventPayload$HttpErrorEvent$$serializer.INSTANCE;
            }
        }

        @sy3
        public /* synthetic */ HttpErrorEvent(int i, HttpErrorEventData httpErrorEventData) {
            if (1 == (i & 1)) {
                this.b = httpErrorEventData;
            } else {
                ewa.M(i, 1, EventPayload$HttpErrorEvent$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HttpErrorEvent) && wl7.b(this.b, ((HttpErrorEvent) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "HttpErrorEvent(fingerprintedData=" + this.b + ")";
        }

        @o7e
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$NullableHttpResponseDebug;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class NullableHttpResponseDebug {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final HttpResponseDebug a;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$NullableHttpResponseDebug$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$NullableHttpResponseDebug;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<NullableHttpResponseDebug> serializer() {
                    return EventPayload$HttpErrorEvent$NullableHttpResponseDebug$$serializer.INSTANCE;
                }
            }

            @sy3
            public /* synthetic */ NullableHttpResponseDebug(int i, HttpResponseDebug httpResponseDebug) {
                if (1 == (i & 1)) {
                    this.a = httpResponseDebug;
                } else {
                    ewa.M(i, 1, EventPayload$HttpErrorEvent$NullableHttpResponseDebug$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NullableHttpResponseDebug) && wl7.b(this.a, ((NullableHttpResponseDebug) obj).a);
            }

            public final int hashCode() {
                HttpResponseDebug httpResponseDebug = this.a;
                if (httpResponseDebug == null) {
                    return 0;
                }
                return httpResponseDebug.hashCode();
            }

            public final String toString() {
                return "NullableHttpResponseDebug(NativeHttpResponseDebug=" + this.a + ")";
            }

            public NullableHttpResponseDebug(HttpResponseDebug httpResponseDebug) {
                this.a = httpResponseDebug;
            }
        }

        public HttpErrorEvent(HttpErrorEventData httpErrorEventData) {
            this.b = httpErrorEventData;
        }

        @o7e
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$HttpRequestDebug;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class HttpRequestDebug {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final long a;
            public final long b;
            public final long c;
            public final NullableString d;
            public final NullableString e;
            public final NullableLong f;
            public final NullableString g;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$HttpRequestDebug$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$HttpRequestDebug;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<HttpRequestDebug> serializer() {
                    return EventPayload$HttpErrorEvent$HttpRequestDebug$$serializer.INSTANCE;
                }
            }

            @sy3
            public /* synthetic */ HttpRequestDebug(int i, long j, long j2, long j3, NullableString nullableString, NullableString nullableString2, NullableLong nullableLong, NullableString nullableString3) {
                if (127 != (i & 127)) {
                    ewa.M(i, 127, EventPayload$HttpErrorEvent$HttpRequestDebug$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = j;
                this.b = j2;
                this.c = j3;
                this.d = nullableString;
                this.e = nullableString2;
                this.f = nullableLong;
                this.g = nullableString3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HttpRequestDebug)) {
                    return false;
                }
                HttpRequestDebug httpRequestDebug = (HttpRequestDebug) obj;
                return this.a == httpRequestDebug.a && this.b == httpRequestDebug.b && this.c == httpRequestDebug.c && wl7.b(this.d, httpRequestDebug.d) && wl7.b(this.e, httpRequestDebug.e) && wl7.b(this.f, httpRequestDebug.f) && wl7.b(this.g, httpRequestDebug.g);
            }

            public final int hashCode() {
                int iD = ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
                NullableString nullableString = this.d;
                int iHashCode = (iD + (nullableString == null ? 0 : nullableString.a.hashCode())) * 31;
                NullableString nullableString2 = this.e;
                int iHashCode2 = (iHashCode + (nullableString2 == null ? 0 : nullableString2.a.hashCode())) * 31;
                NullableLong nullableLong = this.f;
                int iHashCode3 = (iHashCode2 + (nullableLong == null ? 0 : Long.hashCode(nullableLong.a))) * 31;
                NullableString nullableString3 = this.g;
                return iHashCode3 + (nullableString3 != null ? nullableString3.a.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbI = w40.i(this.a, "HttpRequestDebug(timestamp=", ", headerLength=");
                sbI.append(this.b);
                o6.p(sbI, ", cookiesLength=", this.c, ", referrer=");
                sbI.append(this.d);
                sbI.append(", errDomain=");
                sbI.append(this.e);
                sbI.append(", errCode=");
                sbI.append(this.f);
                sbI.append(", networkInterface=");
                sbI.append(this.g);
                sbI.append(")");
                return sbI.toString();
            }

            public HttpRequestDebug(long j, long j2, long j3, NullableString nullableString, NullableString nullableString2, NullableLong nullableLong) {
                this.a = j;
                this.b = j2;
                this.c = j3;
                this.d = nullableString;
                this.e = nullableString2;
                this.f = nullableLong;
                this.g = null;
            }
        }

        @o7e
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$HttpErrorEventData;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class HttpErrorEventData {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final DeviceProperties a;
            public final EventProperties b;
            public final String c;
            public final String d;
            public final HttpRequestDebug e;
            public final NullableHttpResponseDebug f;
            public final String g;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$HttpErrorEventData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$HttpErrorEventData;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<HttpErrorEventData> serializer() {
                    return EventPayload$HttpErrorEvent$HttpErrorEventData$$serializer.INSTANCE;
                }
            }

            public HttpErrorEventData(DeviceProperties deviceProperties, EventProperties eventProperties, String str, String str2, HttpRequestDebug httpRequestDebug, NullableHttpResponseDebug nullableHttpResponseDebug, String str3) {
                deviceProperties.getClass();
                eventProperties.getClass();
                str.getClass();
                str2.getClass();
                httpRequestDebug.getClass();
                str3.getClass();
                this.a = deviceProperties;
                this.b = eventProperties;
                this.c = str;
                this.d = str2;
                this.e = httpRequestDebug;
                this.f = nullableHttpResponseDebug;
                this.g = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HttpErrorEventData)) {
                    return false;
                }
                HttpErrorEventData httpErrorEventData = (HttpErrorEventData) obj;
                return wl7.b(this.a, httpErrorEventData.a) && wl7.b(this.b, httpErrorEventData.b) && wl7.b(this.c, httpErrorEventData.c) && wl7.b(this.d, httpErrorEventData.d) && wl7.b(this.e, httpErrorEventData.e) && wl7.b(this.f, httpErrorEventData.f) && wl7.b(this.g, httpErrorEventData.g);
            }

            public final int hashCode() {
                int iHashCode = (this.e.hashCode() + akb.d(akb.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31;
                NullableHttpResponseDebug nullableHttpResponseDebug = this.f;
                return this.g.hashCode() + ((iHashCode + (nullableHttpResponseDebug == null ? 0 : nullableHttpResponseDebug.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HttpErrorEventData(device=");
                sb.append(this.a);
                sb.append(", properties=");
                sb.append(this.b);
                sb.append(", url=");
                ia.r(sb, this.c, ", method=", this.d, ", requestDebug=");
                sb.append(this.e);
                sb.append(", responseDebug=");
                sb.append(this.f);
                sb.append(", message=");
                return l6.i(sb, this.g, ")");
            }

            @sy3
            public /* synthetic */ HttpErrorEventData(int i, DeviceProperties deviceProperties, EventProperties eventProperties, String str, String str2, HttpRequestDebug httpRequestDebug, NullableHttpResponseDebug nullableHttpResponseDebug, String str3) {
                if (127 != (i & 127)) {
                    ewa.M(i, 127, EventPayload$HttpErrorEvent$HttpErrorEventData$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = deviceProperties;
                this.b = eventProperties;
                this.c = str;
                this.d = str2;
                this.e = httpRequestDebug;
                this.f = nullableHttpResponseDebug;
                this.g = str3;
            }
        }

        @o7e
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$HttpResponseDebug;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class HttpResponseDebug {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final long a;
            public final long b;
            public final long c;
            public final String d;
            public final long e;
            public final long f;
            public final NullableString g;
            public final NullableLong h;
            public final NullableString i;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$HttpResponseDebug$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$HttpResponseDebug;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<HttpResponseDebug> serializer() {
                    return EventPayload$HttpErrorEvent$HttpResponseDebug$$serializer.INSTANCE;
                }
            }

            @sy3
            public /* synthetic */ HttpResponseDebug(int i, long j, long j2, long j3, String str, long j4, long j5, NullableString nullableString, NullableLong nullableLong, NullableString nullableString2) {
                if (511 != (i & 511)) {
                    ewa.M(i, 511, EventPayload$HttpErrorEvent$HttpResponseDebug$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = j;
                this.b = j2;
                this.c = j3;
                this.d = str;
                this.e = j4;
                this.f = j5;
                this.g = nullableString;
                this.h = nullableLong;
                this.i = nullableString2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HttpResponseDebug)) {
                    return false;
                }
                HttpResponseDebug httpResponseDebug = (HttpResponseDebug) obj;
                return this.a == httpResponseDebug.a && this.b == httpResponseDebug.b && this.c == httpResponseDebug.c && wl7.b(this.d, httpResponseDebug.d) && this.e == httpResponseDebug.e && this.f == httpResponseDebug.f && wl7.b(this.g, httpResponseDebug.g) && wl7.b(this.h, httpResponseDebug.h) && wl7.b(this.i, httpResponseDebug.i);
            }

            public final int hashCode() {
                int iD = ia.d(ia.d(akb.d(ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
                NullableString nullableString = this.g;
                int iHashCode = (iD + (nullableString == null ? 0 : nullableString.a.hashCode())) * 31;
                NullableLong nullableLong = this.h;
                int iHashCode2 = (iHashCode + (nullableLong == null ? 0 : Long.hashCode(nullableLong.a))) * 31;
                NullableString nullableString2 = this.i;
                return iHashCode2 + (nullableString2 != null ? nullableString2.a.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbI = w40.i(this.a, "HttpResponseDebug(timestamp=", ", headerLength=");
                sbI.append(this.b);
                o6.p(sbI, ", contentLength=", this.c, ", contentType=");
                sbI.append(this.d);
                sbI.append(", setCookiesLength=");
                sbI.append(this.e);
                o6.p(sbI, ", statusCode=", this.f, ", errDomain=");
                sbI.append(this.g);
                sbI.append(", errCode=");
                sbI.append(this.h);
                sbI.append(", urlType=");
                sbI.append(this.i);
                sbI.append(")");
                return sbI.toString();
            }

            public HttpResponseDebug(long j, long j2, long j3, String str, long j4, long j5, NullableString nullableString, NullableLong nullableLong) {
                str.getClass();
                this.a = j;
                this.b = j2;
                this.c = j3;
                this.d = str;
                this.e = j4;
                this.f = j5;
                this.g = nullableString;
                this.h = nullableLong;
                this.i = null;
            }
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0002\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent;", "Lcom/infra/eventlogger/model/EventPayload;", "Companion", "$serializer", "NativeHttpMetricsEventData", "NativeHttpRequestDebug", "NativeHttpResponseDebug", "NullableNativeHttpResponseDebug", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class NativeHttpMetricsEvent extends EventPayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final NativeHttpMetricsEventData b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<NativeHttpMetricsEvent> serializer() {
                return EventPayload$NativeHttpMetricsEvent$$serializer.INSTANCE;
            }
        }

        @sy3
        public /* synthetic */ NativeHttpMetricsEvent(int i, NativeHttpMetricsEventData nativeHttpMetricsEventData) {
            if (1 == (i & 1)) {
                this.b = nativeHttpMetricsEventData;
            } else {
                ewa.M(i, 1, EventPayload$NativeHttpMetricsEvent$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NativeHttpMetricsEvent) && wl7.b(this.b, ((NativeHttpMetricsEvent) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "NativeHttpMetricsEvent(fingerprintedData=" + this.b + ")";
        }

        @o7e
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent$NullableNativeHttpResponseDebug;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class NullableNativeHttpResponseDebug {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final NativeHttpResponseDebug a;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent$NullableNativeHttpResponseDebug$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent$NullableNativeHttpResponseDebug;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<NullableNativeHttpResponseDebug> serializer() {
                    return EventPayload$NativeHttpMetricsEvent$NullableNativeHttpResponseDebug$$serializer.INSTANCE;
                }
            }

            @sy3
            public /* synthetic */ NullableNativeHttpResponseDebug(int i, NativeHttpResponseDebug nativeHttpResponseDebug) {
                if (1 == (i & 1)) {
                    this.a = nativeHttpResponseDebug;
                } else {
                    ewa.M(i, 1, EventPayload$NativeHttpMetricsEvent$NullableNativeHttpResponseDebug$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NullableNativeHttpResponseDebug) && wl7.b(this.a, ((NullableNativeHttpResponseDebug) obj).a);
            }

            public final int hashCode() {
                NativeHttpResponseDebug nativeHttpResponseDebug = this.a;
                if (nativeHttpResponseDebug == null) {
                    return 0;
                }
                return nativeHttpResponseDebug.hashCode();
            }

            public final String toString() {
                return "NullableNativeHttpResponseDebug(NativeHttpResponseDebug=" + this.a + ")";
            }

            public NullableNativeHttpResponseDebug(NativeHttpResponseDebug nativeHttpResponseDebug) {
                this.a = nativeHttpResponseDebug;
            }
        }

        public NativeHttpMetricsEvent(NativeHttpMetricsEventData nativeHttpMetricsEventData) {
            this.b = nativeHttpMetricsEventData;
        }

        @o7e
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent$NativeHttpRequestDebug;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class NativeHttpRequestDebug {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final long a;
            public final long b;
            public final long c;
            public final NullableString d;
            public final NullableString e;
            public final NullableLong f;
            public final NullableString g;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent$NativeHttpRequestDebug$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent$NativeHttpRequestDebug;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<NativeHttpRequestDebug> serializer() {
                    return EventPayload$NativeHttpMetricsEvent$NativeHttpRequestDebug$$serializer.INSTANCE;
                }
            }

            @sy3
            public /* synthetic */ NativeHttpRequestDebug(int i, long j, long j2, long j3, NullableString nullableString, NullableString nullableString2, NullableLong nullableLong, NullableString nullableString3) {
                if (127 != (i & 127)) {
                    ewa.M(i, 127, EventPayload$NativeHttpMetricsEvent$NativeHttpRequestDebug$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = j;
                this.b = j2;
                this.c = j3;
                this.d = nullableString;
                this.e = nullableString2;
                this.f = nullableLong;
                this.g = nullableString3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NativeHttpRequestDebug)) {
                    return false;
                }
                NativeHttpRequestDebug nativeHttpRequestDebug = (NativeHttpRequestDebug) obj;
                return this.a == nativeHttpRequestDebug.a && this.b == nativeHttpRequestDebug.b && this.c == nativeHttpRequestDebug.c && wl7.b(this.d, nativeHttpRequestDebug.d) && wl7.b(this.e, nativeHttpRequestDebug.e) && wl7.b(this.f, nativeHttpRequestDebug.f) && wl7.b(this.g, nativeHttpRequestDebug.g);
            }

            public final int hashCode() {
                int iD = ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
                NullableString nullableString = this.d;
                int iHashCode = (iD + (nullableString == null ? 0 : nullableString.a.hashCode())) * 31;
                NullableString nullableString2 = this.e;
                int iHashCode2 = (iHashCode + (nullableString2 == null ? 0 : nullableString2.a.hashCode())) * 31;
                NullableLong nullableLong = this.f;
                int iHashCode3 = (iHashCode2 + (nullableLong == null ? 0 : Long.hashCode(nullableLong.a))) * 31;
                NullableString nullableString3 = this.g;
                return iHashCode3 + (nullableString3 != null ? nullableString3.a.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbI = w40.i(this.a, "NativeHttpRequestDebug(timestamp=", ", headerLength=");
                sbI.append(this.b);
                o6.p(sbI, ", cookiesLength=", this.c, ", referrer=");
                sbI.append(this.d);
                sbI.append(", errDomain=");
                sbI.append(this.e);
                sbI.append(", errCode=");
                sbI.append(this.f);
                sbI.append(", networkInterface=");
                sbI.append(this.g);
                sbI.append(")");
                return sbI.toString();
            }

            public NativeHttpRequestDebug(long j, long j2, long j3, NullableString nullableString, NullableString nullableString2, NullableLong nullableLong) {
                this.a = j;
                this.b = j2;
                this.c = j3;
                this.d = nullableString;
                this.e = nullableString2;
                this.f = nullableLong;
                this.g = null;
            }
        }

        @o7e
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent$NativeHttpResponseDebug;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class NativeHttpResponseDebug {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final long a;
            public final long b;
            public final long c;
            public final String d;
            public final long e;
            public final long f;
            public final NullableString g;
            public final NullableLong h;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent$NativeHttpResponseDebug$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent$NativeHttpResponseDebug;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<NativeHttpResponseDebug> serializer() {
                    return EventPayload$NativeHttpMetricsEvent$NativeHttpResponseDebug$$serializer.INSTANCE;
                }
            }

            @sy3
            public /* synthetic */ NativeHttpResponseDebug(int i, long j, long j2, long j3, String str, long j4, long j5, NullableString nullableString, NullableLong nullableLong) {
                if (255 != (i & 255)) {
                    ewa.M(i, 255, EventPayload$NativeHttpMetricsEvent$NativeHttpResponseDebug$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = j;
                this.b = j2;
                this.c = j3;
                this.d = str;
                this.e = j4;
                this.f = j5;
                this.g = nullableString;
                this.h = nullableLong;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NativeHttpResponseDebug)) {
                    return false;
                }
                NativeHttpResponseDebug nativeHttpResponseDebug = (NativeHttpResponseDebug) obj;
                return this.a == nativeHttpResponseDebug.a && this.b == nativeHttpResponseDebug.b && this.c == nativeHttpResponseDebug.c && wl7.b(this.d, nativeHttpResponseDebug.d) && this.e == nativeHttpResponseDebug.e && this.f == nativeHttpResponseDebug.f && wl7.b(this.g, nativeHttpResponseDebug.g) && wl7.b(this.h, nativeHttpResponseDebug.h);
            }

            public final int hashCode() {
                int iD = ia.d(ia.d(akb.d(ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
                NullableString nullableString = this.g;
                int iHashCode = (iD + (nullableString == null ? 0 : nullableString.a.hashCode())) * 31;
                NullableLong nullableLong = this.h;
                return iHashCode + (nullableLong != null ? Long.hashCode(nullableLong.a) : 0);
            }

            public final String toString() {
                StringBuilder sbI = w40.i(this.a, "NativeHttpResponseDebug(timestamp=", ", headerLength=");
                sbI.append(this.b);
                o6.p(sbI, ", contentLength=", this.c, ", contentType=");
                sbI.append(this.d);
                sbI.append(", setCookiesLength=");
                sbI.append(this.e);
                o6.p(sbI, ", statusCode=", this.f, ", errDomain=");
                sbI.append(this.g);
                sbI.append(", errCode=");
                sbI.append(this.h);
                sbI.append(")");
                return sbI.toString();
            }

            public NativeHttpResponseDebug(long j, long j2, long j3, String str, long j4, long j5, NullableString nullableString, NullableLong nullableLong) {
                str.getClass();
                this.a = j;
                this.b = j2;
                this.c = j3;
                this.d = str;
                this.e = j4;
                this.f = j5;
                this.g = nullableString;
                this.h = nullableLong;
            }
        }

        @o7e
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent$NativeHttpMetricsEventData;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class NativeHttpMetricsEventData {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final DeviceProperties a;
            public final EventProperties b;
            public final String c;
            public final String d;
            public final NativeHttpRequestDebug e;
            public final NullableNativeHttpResponseDebug f;
            public final long g;
            public final String h;
            public final NullableString i;
            public final NullableString j;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent$NativeHttpMetricsEventData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent$NativeHttpMetricsEventData;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<NativeHttpMetricsEventData> serializer() {
                    return EventPayload$NativeHttpMetricsEvent$NativeHttpMetricsEventData$$serializer.INSTANCE;
                }
            }

            public NativeHttpMetricsEventData(DeviceProperties deviceProperties, EventProperties eventProperties, String str, String str2, NativeHttpRequestDebug nativeHttpRequestDebug, NullableNativeHttpResponseDebug nullableNativeHttpResponseDebug, long j, String str3, NullableString nullableString, NullableString nullableString2) {
                deviceProperties.getClass();
                eventProperties.getClass();
                str.getClass();
                str2.getClass();
                nativeHttpRequestDebug.getClass();
                str3.getClass();
                this.a = deviceProperties;
                this.b = eventProperties;
                this.c = str;
                this.d = str2;
                this.e = nativeHttpRequestDebug;
                this.f = nullableNativeHttpResponseDebug;
                this.g = j;
                this.h = str3;
                this.i = nullableString;
                this.j = nullableString2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NativeHttpMetricsEventData)) {
                    return false;
                }
                NativeHttpMetricsEventData nativeHttpMetricsEventData = (NativeHttpMetricsEventData) obj;
                return wl7.b(this.a, nativeHttpMetricsEventData.a) && wl7.b(this.b, nativeHttpMetricsEventData.b) && wl7.b(this.c, nativeHttpMetricsEventData.c) && wl7.b(this.d, nativeHttpMetricsEventData.d) && wl7.b(this.e, nativeHttpMetricsEventData.e) && wl7.b(this.f, nativeHttpMetricsEventData.f) && this.g == nativeHttpMetricsEventData.g && wl7.b(this.h, nativeHttpMetricsEventData.h) && wl7.b(this.i, nativeHttpMetricsEventData.i) && wl7.b(this.j, nativeHttpMetricsEventData.j);
            }

            public final int hashCode() {
                int iHashCode = (this.e.hashCode() + akb.d(akb.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31;
                NullableNativeHttpResponseDebug nullableNativeHttpResponseDebug = this.f;
                int iD = akb.d(ia.d((iHashCode + (nullableNativeHttpResponseDebug == null ? 0 : nullableNativeHttpResponseDebug.hashCode())) * 31, 31, this.g), 31, this.h);
                NullableString nullableString = this.i;
                int iHashCode2 = (iD + (nullableString == null ? 0 : nullableString.a.hashCode())) * 31;
                NullableString nullableString2 = this.j;
                return iHashCode2 + (nullableString2 != null ? nullableString2.a.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NativeHttpMetricsEventData(device=");
                sb.append(this.a);
                sb.append(", properties=");
                sb.append(this.b);
                sb.append(", url=");
                ia.r(sb, this.c, ", method=", this.d, ", request=");
                sb.append(this.e);
                sb.append(", response=");
                sb.append(this.f);
                sb.append(", responseLatencyMs=");
                sb.append(this.g);
                sb.append(", message=");
                sb.append(this.h);
                sb.append(", urlType=");
                sb.append(this.i);
                sb.append(", graphQLOperation=");
                sb.append(this.j);
                sb.append(")");
                return sb.toString();
            }

            @sy3
            public /* synthetic */ NativeHttpMetricsEventData(int i, DeviceProperties deviceProperties, EventProperties eventProperties, String str, String str2, NativeHttpRequestDebug nativeHttpRequestDebug, NullableNativeHttpResponseDebug nullableNativeHttpResponseDebug, long j, String str3, NullableString nullableString, NullableString nullableString2) {
                if (1023 != (i & 1023)) {
                    ewa.M(i, 1023, EventPayload$NativeHttpMetricsEvent$NativeHttpMetricsEventData$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = deviceProperties;
                this.b = eventProperties;
                this.c = str;
                this.d = str2;
                this.e = nativeHttpRequestDebug;
                this.f = nullableNativeHttpResponseDebug;
                this.g = j;
                this.h = str3;
                this.i = nullableString;
                this.j = nullableString2;
            }
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002¨\u0006\u0005"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$AppMetricsEvent;", "Lcom/infra/eventlogger/model/EventPayload;", "Companion", "$serializer", "AppMetricsEventData", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class AppMetricsEvent extends EventPayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final AppMetricsEventData b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$AppMetricsEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$AppMetricsEvent;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<AppMetricsEvent> serializer() {
                return EventPayload$AppMetricsEvent$$serializer.INSTANCE;
            }
        }

        @sy3
        public /* synthetic */ AppMetricsEvent(int i, AppMetricsEventData appMetricsEventData) {
            if (1 == (i & 1)) {
                this.b = appMetricsEventData;
            } else {
                ewa.M(i, 1, EventPayload$AppMetricsEvent$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppMetricsEvent) && wl7.b(this.b, ((AppMetricsEvent) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AppMetricsEvent(fingerprintedData=" + this.b + ")";
        }

        public AppMetricsEvent(AppMetricsEventData appMetricsEventData) {
            this.b = appMetricsEventData;
        }

        @o7e
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$AppMetricsEvent$AppMetricsEventData;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class AppMetricsEventData {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final DeviceProperties a;
            public final EventProperties b;
            public final String c;
            public final Map<String, Long> d;
            public final Map<String, String> e;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$AppMetricsEvent$AppMetricsEventData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$AppMetricsEvent$AppMetricsEventData;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<AppMetricsEventData> serializer() {
                    return EventPayload$AppMetricsEvent$AppMetricsEventData$$serializer.INSTANCE;
                }
            }

            @sy3
            public /* synthetic */ AppMetricsEventData(int i, DeviceProperties deviceProperties, EventProperties eventProperties, String str, Map map, Map map2) {
                if (31 != (i & 31)) {
                    ewa.M(i, 31, EventPayload$AppMetricsEvent$AppMetricsEventData$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = deviceProperties;
                this.b = eventProperties;
                this.c = str;
                this.d = map;
                this.e = map2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AppMetricsEventData)) {
                    return false;
                }
                AppMetricsEventData appMetricsEventData = (AppMetricsEventData) obj;
                return wl7.b(this.a, appMetricsEventData.a) && wl7.b(this.b, appMetricsEventData.b) && wl7.b(this.c, appMetricsEventData.c) && wl7.b(this.d, appMetricsEventData.d) && wl7.b(this.e, appMetricsEventData.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + k20.b(this.d, akb.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AppMetricsEventData(device=");
                sb.append(this.a);
                sb.append(", properties=");
                sb.append(this.b);
                sb.append(", name=");
                sb.append(this.c);
                sb.append(", durationsMs=");
                sb.append(this.d);
                sb.append(", extraInfo=");
                return b0.k(sb, this.e, ")");
            }

            public AppMetricsEventData(DeviceProperties deviceProperties, EventProperties eventProperties, String str, Map<String, Long> map, Map<String, String> map2) {
                deviceProperties.getClass();
                eventProperties.getClass();
                str.getClass();
                map.getClass();
                map2.getClass();
                this.a = deviceProperties;
                this.b = eventProperties;
                this.c = str;
                this.d = map;
                this.e = map2;
            }
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0002\u0004¨\u0006\u0005"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$GenericEvent;", "Lcom/infra/eventlogger/model/EventPayload;", "Companion", "$serializer", "GenericEventData", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class GenericEvent extends EventPayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final GenericEventData b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$GenericEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$GenericEvent;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<GenericEvent> serializer() {
                return EventPayload$GenericEvent$$serializer.INSTANCE;
            }
        }

        @sy3
        public /* synthetic */ GenericEvent(int i, GenericEventData genericEventData) {
            if (1 == (i & 1)) {
                this.b = genericEventData;
            } else {
                ewa.M(i, 1, EventPayload$GenericEvent$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenericEvent) && wl7.b(this.b, ((GenericEvent) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "GenericEvent(fingerprintedData=" + this.b + ")";
        }

        public GenericEvent(GenericEventData genericEventData) {
            this.b = genericEventData;
        }

        @o7e
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$GenericEvent$GenericEventData;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class GenericEventData {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final DeviceProperties a;
            public final EventProperties b;
            public final String c;
            public final String d;
            public final List<String> e;
            public final int f;
            public final List<String> g;
            public final List<NullableString> h;
            public final List<String> i;
            public final List<NullableLong> j;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$GenericEvent$GenericEventData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$GenericEvent$GenericEventData;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<GenericEventData> serializer() {
                    return EventPayload$GenericEvent$GenericEventData$$serializer.INSTANCE;
                }
            }

            @sy3
            public /* synthetic */ GenericEventData(int i, DeviceProperties deviceProperties, EventProperties eventProperties, String str, String str2, List list, int i2, List list2, List list3, List list4, List list5) {
                if (1023 != (i & 1023)) {
                    ewa.M(i, 1023, EventPayload$GenericEvent$GenericEventData$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = deviceProperties;
                this.b = eventProperties;
                this.c = str;
                this.d = str2;
                this.e = list;
                this.f = i2;
                this.g = list2;
                this.h = list3;
                this.i = list4;
                this.j = list5;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GenericEventData)) {
                    return false;
                }
                GenericEventData genericEventData = (GenericEventData) obj;
                return wl7.b(this.a, genericEventData.a) && wl7.b(this.b, genericEventData.b) && wl7.b(this.c, genericEventData.c) && wl7.b(this.d, genericEventData.d) && wl7.b(this.e, genericEventData.e) && this.f == genericEventData.f && wl7.b(this.g, genericEventData.g) && wl7.b(this.h, genericEventData.h) && wl7.b(this.i, genericEventData.i) && wl7.b(this.j, genericEventData.j);
            }

            public final int hashCode() {
                return this.j.hashCode() + ia.g(this.i, ia.g(this.h, ia.g(this.g, w40.c(this.f, ia.g(this.e, akb.d(akb.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31), 31), 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("GenericEventData(device=");
                sb.append(this.a);
                sb.append(", properties=");
                sb.append(this.b);
                sb.append(", eventName=");
                ia.r(sb, this.c, ", eventType=", this.d, ", tags=");
                sb.append(this.e);
                sb.append(", eventVersion=");
                sb.append(this.f);
                sb.append(", stringParams=");
                l6.q(sb, this.g, ", stringValues=", this.h, ", intParams=");
                sb.append(this.i);
                sb.append(", intValues=");
                sb.append(this.j);
                sb.append(")");
                return sb.toString();
            }

            public GenericEventData(DeviceProperties deviceProperties, EventProperties eventProperties, String str, String str2, List<String> list, int i, List<String> list2, List<NullableString> list3, List<String> list4, List<NullableLong> list5) {
                deviceProperties.getClass();
                eventProperties.getClass();
                str.getClass();
                str2.getClass();
                this.a = deviceProperties;
                this.b = eventProperties;
                this.c = str;
                this.d = str2;
                this.e = list;
                this.f = i;
                this.g = list2;
                this.h = list3;
                this.i = list4;
                this.j = list5;
            }
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0002\u0004¨\u0006\u0005"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$GenericLifecycleEvent;", "Lcom/infra/eventlogger/model/EventPayload;", "Companion", "$serializer", "GenericLifecycleEventData", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class GenericLifecycleEvent extends EventPayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final GenericLifecycleEventData b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$GenericLifecycleEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$GenericLifecycleEvent;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<GenericLifecycleEvent> serializer() {
                return EventPayload$GenericLifecycleEvent$$serializer.INSTANCE;
            }
        }

        @sy3
        public /* synthetic */ GenericLifecycleEvent(int i, GenericLifecycleEventData genericLifecycleEventData) {
            if (1 == (i & 1)) {
                this.b = genericLifecycleEventData;
            } else {
                ewa.M(i, 1, EventPayload$GenericLifecycleEvent$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenericLifecycleEvent) && wl7.b(this.b, ((GenericLifecycleEvent) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "GenericLifecycleEvent(fingerprintedData=" + this.b + ")";
        }

        public GenericLifecycleEvent(GenericLifecycleEventData genericLifecycleEventData) {
            this.b = genericLifecycleEventData;
        }

        @o7e
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$GenericLifecycleEvent$GenericLifecycleEventData;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class GenericLifecycleEventData {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final DeviceProperties a;
            public final EventProperties b;
            public final String c;
            public final String d;
            public final long e;
            public final long f;
            public final long g;
            public final String h;
            public final NullableString i;
            public final NullableString j;
            public final NullableString k;
            public final NullableString l;
            public final NullableString m;
            public final NullableString n;
            public final NullableString o;
            public final Map<String, JsmaDynamicProperty> p;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$GenericLifecycleEvent$GenericLifecycleEventData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$GenericLifecycleEvent$GenericLifecycleEventData;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<GenericLifecycleEventData> serializer() {
                    return EventPayload$GenericLifecycleEvent$GenericLifecycleEventData$$serializer.INSTANCE;
                }
            }

            @sy3
            public /* synthetic */ GenericLifecycleEventData(int i, DeviceProperties deviceProperties, EventProperties eventProperties, String str, String str2, long j, long j2, long j3, String str3, NullableString nullableString, NullableString nullableString2, NullableString nullableString3, NullableString nullableString4, NullableString nullableString5, NullableString nullableString6, NullableString nullableString7, Map map) {
                if (65535 != (i & 65535)) {
                    ewa.M(i, 65535, EventPayload$GenericLifecycleEvent$GenericLifecycleEventData$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = deviceProperties;
                this.b = eventProperties;
                this.c = str;
                this.d = str2;
                this.e = j;
                this.f = j2;
                this.g = j3;
                this.h = str3;
                this.i = nullableString;
                this.j = nullableString2;
                this.k = nullableString3;
                this.l = nullableString4;
                this.m = nullableString5;
                this.n = nullableString6;
                this.o = nullableString7;
                this.p = map;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GenericLifecycleEventData)) {
                    return false;
                }
                GenericLifecycleEventData genericLifecycleEventData = (GenericLifecycleEventData) obj;
                return wl7.b(this.a, genericLifecycleEventData.a) && wl7.b(this.b, genericLifecycleEventData.b) && wl7.b(this.c, genericLifecycleEventData.c) && wl7.b(this.d, genericLifecycleEventData.d) && this.e == genericLifecycleEventData.e && this.f == genericLifecycleEventData.f && this.g == genericLifecycleEventData.g && wl7.b(this.h, genericLifecycleEventData.h) && wl7.b(this.i, genericLifecycleEventData.i) && wl7.b(this.j, genericLifecycleEventData.j) && wl7.b(this.k, genericLifecycleEventData.k) && wl7.b(this.l, genericLifecycleEventData.l) && wl7.b(this.m, genericLifecycleEventData.m) && wl7.b(this.n, genericLifecycleEventData.n) && wl7.b(this.o, genericLifecycleEventData.o) && wl7.b(this.p, genericLifecycleEventData.p);
            }

            public final int hashCode() {
                int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                String str = this.c;
                int iD = akb.d(ia.d(ia.d(ia.d(akb.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
                NullableString nullableString = this.i;
                int iHashCode2 = (iD + (nullableString == null ? 0 : nullableString.a.hashCode())) * 31;
                NullableString nullableString2 = this.j;
                int iHashCode3 = (iHashCode2 + (nullableString2 == null ? 0 : nullableString2.a.hashCode())) * 31;
                NullableString nullableString3 = this.k;
                int iHashCode4 = (iHashCode3 + (nullableString3 == null ? 0 : nullableString3.a.hashCode())) * 31;
                NullableString nullableString4 = this.l;
                int iHashCode5 = (iHashCode4 + (nullableString4 == null ? 0 : nullableString4.a.hashCode())) * 31;
                NullableString nullableString5 = this.m;
                int iHashCode6 = (iHashCode5 + (nullableString5 == null ? 0 : nullableString5.a.hashCode())) * 31;
                NullableString nullableString6 = this.n;
                int iHashCode7 = (iHashCode6 + (nullableString6 == null ? 0 : nullableString6.a.hashCode())) * 31;
                NullableString nullableString7 = this.o;
                return this.p.hashCode() + ((iHashCode7 + (nullableString7 != null ? nullableString7.a.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("GenericLifecycleEventData(device=");
                sb.append(this.a);
                sb.append(", properties=");
                sb.append(this.b);
                sb.append(", commonDetails=");
                ia.r(sb, this.c, ", eventName=", this.d, ", eventCount=");
                sb.append(this.e);
                o6.p(sb, ", lastInstallTimestamp=", this.f, ", firstInstallTimestamp=");
                sb.append(this.g);
                sb.append(", firstInstallVersion=");
                sb.append(this.h);
                sb.append(", upgradedFromVersion=");
                sb.append(this.i);
                sb.append(", appStore=");
                sb.append(this.j);
                sb.append(", installerPackage=");
                sb.append(this.k);
                sb.append(", systemUserAgent=");
                sb.append(this.l);
                sb.append(", installReferrer=");
                sb.append(this.m);
                sb.append(", attributionToken=");
                sb.append(this.n);
                sb.append(", entityData=");
                sb.append(this.o);
                sb.append(", extraProperties=");
                sb.append(this.p);
                sb.append(")");
                return sb.toString();
            }

            public GenericLifecycleEventData(DeviceProperties deviceProperties, EventProperties eventProperties, String str, long j, long j2, long j3, String str2, NullableString nullableString, NullableString nullableString2, NullableString nullableString3, NullableString nullableString4, NullableString nullableString5, NullableString nullableString6, LinkedHashMap linkedHashMap) {
                deviceProperties.getClass();
                eventProperties.getClass();
                str.getClass();
                str2.getClass();
                this.a = deviceProperties;
                this.b = eventProperties;
                this.c = null;
                this.d = str;
                this.e = j;
                this.f = j2;
                this.g = j3;
                this.h = str2;
                this.i = nullableString;
                this.j = nullableString2;
                this.k = nullableString3;
                this.l = nullableString4;
                this.m = nullableString5;
                this.n = null;
                this.o = nullableString6;
                this.p = linkedHashMap;
            }
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0002\u0004¨\u0006\u0005"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$NonFatalErrorEvent;", "Lcom/infra/eventlogger/model/EventPayload;", "Companion", "$serializer", "NonFatalErrorEventData", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class NonFatalErrorEvent extends EventPayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final NonFatalErrorEventData b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$NonFatalErrorEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$NonFatalErrorEvent;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<NonFatalErrorEvent> serializer() {
                return EventPayload$NonFatalErrorEvent$$serializer.INSTANCE;
            }
        }

        @sy3
        public /* synthetic */ NonFatalErrorEvent(int i, NonFatalErrorEventData nonFatalErrorEventData) {
            if (1 == (i & 1)) {
                this.b = nonFatalErrorEventData;
            } else {
                ewa.M(i, 1, EventPayload$NonFatalErrorEvent$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NonFatalErrorEvent) && wl7.b(this.b, ((NonFatalErrorEvent) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "NonFatalErrorEvent(fingerprintedData=" + this.b + ")";
        }

        public NonFatalErrorEvent(NonFatalErrorEventData nonFatalErrorEventData) {
            this.b = nonFatalErrorEventData;
        }

        @o7e
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$NonFatalErrorEvent$NonFatalErrorEventData;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class NonFatalErrorEventData {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final DeviceProperties a;
            public final EventProperties b;
            public final String c;
            public final String d;
            public final String e;
            public final long f;
            public final String g;
            public final List<String> h;
            public final List<NullableString> i;
            public final List<String> j;
            public final List<NullableLong> k;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$NonFatalErrorEvent$NonFatalErrorEventData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$NonFatalErrorEvent$NonFatalErrorEventData;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<NonFatalErrorEventData> serializer() {
                    return EventPayload$NonFatalErrorEvent$NonFatalErrorEventData$$serializer.INSTANCE;
                }
            }

            public NonFatalErrorEventData(DeviceProperties deviceProperties, EventProperties eventProperties, String str, String str2, String str3, long j, String str4, List<String> list, List<NullableString> list2, List<String> list3, List<NullableLong> list4) {
                deviceProperties.getClass();
                eventProperties.getClass();
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                this.a = deviceProperties;
                this.b = eventProperties;
                this.c = str;
                this.d = str2;
                this.e = str3;
                this.f = j;
                this.g = str4;
                this.h = list;
                this.i = list2;
                this.j = list3;
                this.k = list4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NonFatalErrorEventData)) {
                    return false;
                }
                NonFatalErrorEventData nonFatalErrorEventData = (NonFatalErrorEventData) obj;
                return wl7.b(this.a, nonFatalErrorEventData.a) && wl7.b(this.b, nonFatalErrorEventData.b) && wl7.b(this.c, nonFatalErrorEventData.c) && wl7.b(this.d, nonFatalErrorEventData.d) && wl7.b(this.e, nonFatalErrorEventData.e) && this.f == nonFatalErrorEventData.f && wl7.b(this.g, nonFatalErrorEventData.g) && wl7.b(this.h, nonFatalErrorEventData.h) && wl7.b(this.i, nonFatalErrorEventData.i) && wl7.b(this.j, nonFatalErrorEventData.j) && wl7.b(this.k, nonFatalErrorEventData.k);
            }

            public final int hashCode() {
                return this.k.hashCode() + ia.g(this.j, ia.g(this.i, ia.g(this.h, akb.d(ia.d(akb.d(akb.d(akb.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NonFatalErrorEventData(device=");
                sb.append(this.a);
                sb.append(", properties=");
                sb.append(this.b);
                sb.append(", message=");
                ia.r(sb, this.c, ", stackTrace=", this.d, ", breadcrumbs=");
                sb.append(this.e);
                sb.append(", errCode=");
                sb.append(this.f);
                sb.append(", errDomain=");
                sb.append(this.g);
                sb.append(", stringParams=");
                sb.append(this.h);
                sb.append(", stringValues=");
                sb.append(this.i);
                sb.append(", intParams=");
                sb.append(this.j);
                sb.append(", intValues=");
                sb.append(this.k);
                sb.append(")");
                return sb.toString();
            }

            @sy3
            public /* synthetic */ NonFatalErrorEventData(int i, DeviceProperties deviceProperties, EventProperties eventProperties, String str, String str2, String str3, long j, String str4, List list, List list2, List list3, List list4) {
                if (2047 != (i & 2047)) {
                    ewa.M(i, 2047, EventPayload$NonFatalErrorEvent$NonFatalErrorEventData$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = deviceProperties;
                this.b = eventProperties;
                this.c = str;
                this.d = str2;
                this.e = str3;
                this.f = j;
                this.g = str4;
                this.h = list;
                this.i = list2;
                this.j = list3;
                this.k = list4;
            }
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0002\u0004¨\u0006\u0005"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$OrganicAppOpenEvent;", "Lcom/infra/eventlogger/model/EventPayload;", "Companion", "$serializer", "OrganicAppOpenEventData", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class OrganicAppOpenEvent extends EventPayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final OrganicAppOpenEventData b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$OrganicAppOpenEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$OrganicAppOpenEvent;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<OrganicAppOpenEvent> serializer() {
                return EventPayload$OrganicAppOpenEvent$$serializer.INSTANCE;
            }
        }

        @sy3
        public /* synthetic */ OrganicAppOpenEvent(int i, OrganicAppOpenEventData organicAppOpenEventData) {
            if (1 == (i & 1)) {
                this.b = organicAppOpenEventData;
            } else {
                ewa.M(i, 1, EventPayload$OrganicAppOpenEvent$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OrganicAppOpenEvent) && wl7.b(this.b, ((OrganicAppOpenEvent) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OrganicAppOpenEvent(fingerprintedData=" + this.b + ")";
        }

        public OrganicAppOpenEvent(OrganicAppOpenEventData organicAppOpenEventData) {
            this.b = organicAppOpenEventData;
        }

        @o7e
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$OrganicAppOpenEvent$OrganicAppOpenEventData;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class OrganicAppOpenEventData {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final DeviceProperties a;
            public final EventProperties b;
            public final String c;
            public final ReferralParams d;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$OrganicAppOpenEvent$OrganicAppOpenEventData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$OrganicAppOpenEvent$OrganicAppOpenEventData;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<OrganicAppOpenEventData> serializer() {
                    return EventPayload$OrganicAppOpenEvent$OrganicAppOpenEventData$$serializer.INSTANCE;
                }
            }

            @sy3
            public /* synthetic */ OrganicAppOpenEventData(int i, DeviceProperties deviceProperties, EventProperties eventProperties, String str, ReferralParams referralParams) {
                if (15 != (i & 15)) {
                    ewa.M(i, 15, EventPayload$OrganicAppOpenEvent$OrganicAppOpenEventData$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = deviceProperties;
                this.b = eventProperties;
                this.c = str;
                this.d = referralParams;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OrganicAppOpenEventData)) {
                    return false;
                }
                OrganicAppOpenEventData organicAppOpenEventData = (OrganicAppOpenEventData) obj;
                return wl7.b(this.a, organicAppOpenEventData.a) && wl7.b(this.b, organicAppOpenEventData.b) && wl7.b(this.c, organicAppOpenEventData.c) && wl7.b(this.d, organicAppOpenEventData.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + akb.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            }

            public final String toString() {
                return "OrganicAppOpenEventData(device=" + this.a + ", properties=" + this.b + ", url=" + this.c + ", referralParams=" + this.d + ")";
            }

            public OrganicAppOpenEventData(DeviceProperties deviceProperties, EventProperties eventProperties, String str, ReferralParams referralParams) {
                deviceProperties.getClass();
                eventProperties.getClass();
                str.getClass();
                referralParams.getClass();
                this.a = deviceProperties;
                this.b = eventProperties;
                this.c = str;
                this.d = referralParams;
            }
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$ReferralParams;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class ReferralParams {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final NullableString a;
        public final NullableString b;
        public final NullableString c;
        public final NullableString d;
        public final NullableString e;
        public final NullableString f;
        public final NullableString g;
        public final NullableString h;
        public final NullableString i;
        public final NullableString j;
        public final NullableString k;
        public final NullableString l;
        public final NullableString m;
        public final NullableString n;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventPayload$ReferralParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventPayload$ReferralParams;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ReferralParams> serializer() {
                return EventPayload$ReferralParams$$serializer.INSTANCE;
            }
        }

        @sy3
        public /* synthetic */ ReferralParams(int i, NullableString nullableString, NullableString nullableString2, NullableString nullableString3, NullableString nullableString4, NullableString nullableString5, NullableString nullableString6, NullableString nullableString7, NullableString nullableString8, NullableString nullableString9, NullableString nullableString10, NullableString nullableString11, NullableString nullableString12, NullableString nullableString13, NullableString nullableString14) {
            if (16383 != (i & 16383)) {
                ewa.M(i, 16383, EventPayload$ReferralParams$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = nullableString;
            this.b = nullableString2;
            this.c = nullableString3;
            this.d = nullableString4;
            this.e = nullableString5;
            this.f = nullableString6;
            this.g = nullableString7;
            this.h = nullableString8;
            this.i = nullableString9;
            this.j = nullableString10;
            this.k = nullableString11;
            this.l = nullableString12;
            this.m = nullableString13;
            this.n = nullableString14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReferralParams)) {
                return false;
            }
            ReferralParams referralParams = (ReferralParams) obj;
            return wl7.b(this.a, referralParams.a) && wl7.b(this.b, referralParams.b) && wl7.b(this.c, referralParams.c) && wl7.b(this.d, referralParams.d) && wl7.b(this.e, referralParams.e) && wl7.b(this.f, referralParams.f) && wl7.b(this.g, referralParams.g) && wl7.b(this.h, referralParams.h) && wl7.b(this.i, referralParams.i) && wl7.b(this.j, referralParams.j) && wl7.b(this.k, referralParams.k) && wl7.b(this.l, referralParams.l) && wl7.b(this.m, referralParams.m) && wl7.b(this.n, referralParams.n);
        }

        public final int hashCode() {
            NullableString nullableString = this.a;
            int iHashCode = (nullableString == null ? 0 : nullableString.a.hashCode()) * 31;
            NullableString nullableString2 = this.b;
            int iHashCode2 = (iHashCode + (nullableString2 == null ? 0 : nullableString2.a.hashCode())) * 31;
            NullableString nullableString3 = this.c;
            int iHashCode3 = (iHashCode2 + (nullableString3 == null ? 0 : nullableString3.a.hashCode())) * 31;
            NullableString nullableString4 = this.d;
            int iHashCode4 = (iHashCode3 + (nullableString4 == null ? 0 : nullableString4.a.hashCode())) * 31;
            NullableString nullableString5 = this.e;
            int iHashCode5 = (iHashCode4 + (nullableString5 == null ? 0 : nullableString5.a.hashCode())) * 31;
            NullableString nullableString6 = this.f;
            int iHashCode6 = (iHashCode5 + (nullableString6 == null ? 0 : nullableString6.a.hashCode())) * 31;
            NullableString nullableString7 = this.g;
            int iHashCode7 = (iHashCode6 + (nullableString7 == null ? 0 : nullableString7.a.hashCode())) * 31;
            NullableString nullableString8 = this.h;
            int iHashCode8 = (iHashCode7 + (nullableString8 == null ? 0 : nullableString8.a.hashCode())) * 31;
            NullableString nullableString9 = this.i;
            int iHashCode9 = (iHashCode8 + (nullableString9 == null ? 0 : nullableString9.a.hashCode())) * 31;
            NullableString nullableString10 = this.j;
            int iHashCode10 = (iHashCode9 + (nullableString10 == null ? 0 : nullableString10.a.hashCode())) * 31;
            NullableString nullableString11 = this.k;
            int iHashCode11 = (iHashCode10 + (nullableString11 == null ? 0 : nullableString11.a.hashCode())) * 31;
            NullableString nullableString12 = this.l;
            int iHashCode12 = (iHashCode11 + (nullableString12 == null ? 0 : nullableString12.a.hashCode())) * 31;
            NullableString nullableString13 = this.m;
            int iHashCode13 = (iHashCode12 + (nullableString13 == null ? 0 : nullableString13.a.hashCode())) * 31;
            NullableString nullableString14 = this.n;
            return iHashCode13 + (nullableString14 != null ? nullableString14.a.hashCode() : 0);
        }

        public final String toString() {
            return "ReferralParams(affiliateKey=" + this.a + ", keywords=" + this.b + ", newCookieValue=" + this.c + ", referrer=" + this.d + ", host=" + this.e + ", refType=" + this.f + ", refTime=" + this.g + ", reqAffiliateKey=" + this.h + ", reqKeywords=" + this.i + ", reqRefType=" + this.j + ", from=" + this.k + ", fbclid=" + this.l + ", gclid=" + this.m + ", utm_source=" + this.n + ")";
        }

        public ReferralParams(NullableString nullableString, NullableString nullableString2, NullableString nullableString3, NullableString nullableString4, NullableString nullableString5, NullableString nullableString6, NullableString nullableString7, NullableString nullableString8, NullableString nullableString9, NullableString nullableString10, NullableString nullableString11, NullableString nullableString12, NullableString nullableString13, NullableString nullableString14) {
            this.a = nullableString;
            this.b = nullableString2;
            this.c = nullableString3;
            this.d = nullableString4;
            this.e = nullableString5;
            this.f = nullableString6;
            this.g = nullableString7;
            this.h = nullableString8;
            this.i = nullableString9;
            this.j = nullableString10;
            this.k = nullableString11;
            this.l = nullableString12;
            this.m = nullableString13;
            this.n = nullableString14;
        }
    }
}
