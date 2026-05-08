package com.infra.autocompleteclient.jsonmodels;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.l6;
import defpackage.o7e;
import defpackage.sy3;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/autocompleteclient/jsonmodels/Location;", "", "Companion", "$serializer", "autocomplete-client_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class Location {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/autocompleteclient/jsonmodels/Location$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/autocompleteclient/jsonmodels/Location;", "autocomplete-client_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        public final KSerializer<Location> serializer() {
            return Location$$serializer.INSTANCE;
        }
    }

    @sy3
    public /* synthetic */ Location(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        if ((i & 1) != 0) {
            this.a = str;
        } else {
            this.a = null;
        }
        if ((i & 2) != 0) {
            this.b = str2;
        } else {
            this.b = null;
        }
        if ((i & 4) != 0) {
            this.c = str3;
        } else {
            this.c = null;
        }
        if ((i & 8) != 0) {
            this.d = str4;
        } else {
            this.d = null;
        }
        if ((i & 16) != 0) {
            this.e = str5;
        } else {
            this.e = null;
        }
        if ((i & 32) != 0) {
            this.f = str6;
        } else {
            this.f = null;
        }
        if ((i & 64) != 0) {
            this.g = str7;
        } else {
            this.g = null;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            this.h = str8;
        } else {
            this.h = null;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            this.i = str9;
        } else {
            this.i = null;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            this.j = str10;
        } else {
            this.j = null;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            this.k = str11;
        } else {
            this.k = null;
        }
        if ((i & 2048) != 0) {
            this.l = str12;
        } else {
            this.l = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return wl7.b(this.a, location.a) && wl7.b(this.b, location.b) && wl7.b(this.c, location.c) && wl7.b(this.d, location.d) && wl7.b(this.e, location.e) && wl7.b(this.f, location.f) && wl7.b(this.g, location.g) && wl7.b(this.h, location.h) && wl7.b(this.i, location.i) && wl7.b(this.j, location.j) && wl7.b(this.k, location.k) && wl7.b(this.l, location.l);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.g;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.h;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.i;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.j;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.k;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.l;
        return iHashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Location(locationType=");
        sb.append(this.a);
        sb.append(", country=");
        sb.append(this.b);
        sb.append(", admin1=");
        sb.append(this.c);
        sb.append(", admin2=");
        sb.append(this.d);
        sb.append(", admin3=");
        sb.append(this.e);
        sb.append(", admin4=");
        sb.append(this.f);
        sb.append(", name=");
        sb.append(this.g);
        sb.append(", countryText=");
        sb.append(this.h);
        sb.append(", admin1Text=");
        sb.append(this.i);
        sb.append(", admin2Text=");
        sb.append(this.j);
        sb.append(", admin3Text=");
        sb.append(this.k);
        sb.append(", admin4Text=");
        return l6.i(sb, this.l, ")");
    }

    public Location() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
    }
}
