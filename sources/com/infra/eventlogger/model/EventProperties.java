package com.infra.eventlogger.model;

import com.infra.eventlogger.model.avro.NullableString;
import defpackage.akb;
import defpackage.bna;
import defpackage.ewa;
import defpackage.ia;
import defpackage.o7e;
import defpackage.sy3;
import defpackage.vk0;
import defpackage.w40;
import defpackage.wl7;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/eventlogger/model/EventProperties;", "", "Companion", "$serializer", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class EventProperties {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final vk0 a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final NullableString f;
    public final NullableString g;
    public final NullableString h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final long m;
    public final List<String> n;
    public final NullableString o;
    public final NullableString p;
    public final NullableString q;
    public final NullableString r;
    public final bna s;
    public final NullableString t;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/eventlogger/model/EventProperties$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/eventlogger/model/EventProperties;", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<EventProperties> serializer() {
            return EventProperties$$serializer.INSTANCE;
        }
    }

    public EventProperties(vk0 vk0Var, String str, int i, String str2, String str3, NullableString nullableString, NullableString nullableString2, NullableString nullableString3, String str4, String str5, String str6, String str7, long j, List<String> list, NullableString nullableString4, NullableString nullableString5, NullableString nullableString6, NullableString nullableString7, bna bnaVar, NullableString nullableString8) {
        vk0Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        list.getClass();
        bnaVar.getClass();
        this.a = vk0Var;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = nullableString;
        this.g = nullableString2;
        this.h = nullableString3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = j;
        this.n = list;
        this.o = nullableString4;
        this.p = nullableString5;
        this.q = nullableString6;
        this.r = nullableString7;
        this.s = bnaVar;
        this.t = nullableString8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventProperties)) {
            return false;
        }
        EventProperties eventProperties = (EventProperties) obj;
        return this.a == eventProperties.a && wl7.b(this.b, eventProperties.b) && this.c == eventProperties.c && wl7.b(this.d, eventProperties.d) && wl7.b(this.e, eventProperties.e) && wl7.b(this.f, eventProperties.f) && wl7.b(this.g, eventProperties.g) && wl7.b(this.h, eventProperties.h) && wl7.b(this.i, eventProperties.i) && wl7.b(this.j, eventProperties.j) && wl7.b(this.k, eventProperties.k) && wl7.b(this.l, eventProperties.l) && this.m == eventProperties.m && wl7.b(this.n, eventProperties.n) && wl7.b(this.o, eventProperties.o) && wl7.b(this.p, eventProperties.p) && wl7.b(this.q, eventProperties.q) && wl7.b(this.r, eventProperties.r) && this.s == eventProperties.s && wl7.b(this.t, eventProperties.t);
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(w40.c(this.c, akb.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        NullableString nullableString = this.f;
        int iHashCode = (iD + (nullableString == null ? 0 : nullableString.a.hashCode())) * 31;
        NullableString nullableString2 = this.g;
        int iHashCode2 = (iHashCode + (nullableString2 == null ? 0 : nullableString2.a.hashCode())) * 31;
        NullableString nullableString3 = this.h;
        int iG = ia.g(this.n, ia.d(akb.d(akb.d(akb.d(akb.d((iHashCode2 + (nullableString3 == null ? 0 : nullableString3.a.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31);
        NullableString nullableString4 = this.o;
        int iHashCode3 = (iG + (nullableString4 == null ? 0 : nullableString4.a.hashCode())) * 31;
        NullableString nullableString5 = this.p;
        int iHashCode4 = (iHashCode3 + (nullableString5 == null ? 0 : nullableString5.a.hashCode())) * 31;
        NullableString nullableString6 = this.q;
        int iHashCode5 = (iHashCode4 + (nullableString6 == null ? 0 : nullableString6.a.hashCode())) * 31;
        NullableString nullableString7 = this.r;
        int iHashCode6 = (this.s.hashCode() + ((iHashCode5 + (nullableString7 == null ? 0 : nullableString7.a.hashCode())) * 31)) * 31;
        NullableString nullableString8 = this.t;
        return iHashCode6 + (nullableString8 != null ? nullableString8.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventProperties(appId=");
        sb.append(this.a);
        sb.append(", appVersion=");
        sb.append(this.b);
        sb.append(", appBuildNum=");
        sb.append(this.c);
        sb.append(", appVariant=");
        sb.append(this.d);
        sb.append(", appEnvironment=");
        sb.append(this.e);
        sb.append(", appCountry=");
        sb.append(this.f);
        sb.append(", ipCountry=");
        sb.append(this.g);
        sb.append(", osVersion=");
        sb.append(this.h);
        sb.append(", clientEventId=");
        ia.r(sb, this.i, ", appInstallId=", this.j, ", appSessionId=");
        ia.r(sb, this.k, ", sessionId=", this.l, ", clientCreatedTimestamp=");
        sb.append(this.m);
        sb.append(", groups=");
        sb.append(this.n);
        sb.append(", accountId=");
        sb.append(this.o);
        sb.append(", ctk=");
        sb.append(this.p);
        sb.append(", deviceId=");
        sb.append(this.q);
        sb.append(", userLocale=");
        sb.append(this.r);
        sb.append(", deviceOrientation=");
        sb.append(this.s);
        sb.append(", secondaryAccountId=");
        sb.append(this.t);
        sb.append(")");
        return sb.toString();
    }

    @sy3
    public /* synthetic */ EventProperties(int i, vk0 vk0Var, String str, int i2, String str2, String str3, NullableString nullableString, NullableString nullableString2, NullableString nullableString3, String str4, String str5, String str6, String str7, long j, List list, NullableString nullableString4, NullableString nullableString5, NullableString nullableString6, NullableString nullableString7, bna bnaVar, NullableString nullableString8) {
        if (1048575 != (i & 1048575)) {
            ewa.M(i, 1048575, EventProperties$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = vk0Var;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = nullableString;
        this.g = nullableString2;
        this.h = nullableString3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = j;
        this.n = list;
        this.o = nullableString4;
        this.p = nullableString5;
        this.q = nullableString6;
        this.r = nullableString7;
        this.s = bnaVar;
        this.t = nullableString8;
    }
}
