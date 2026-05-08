package com.indeed.android.jsmappservices.bridge;

import defpackage.ao0;
import defpackage.bo0;
import defpackage.boa;
import defpackage.ewa;
import defpackage.o7e;
import defpackage.pl0;
import defpackage.qt8;
import defpackage.u40;
import defpackage.wl7;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/DisplayToastData;", "", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DisplayToastData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy<KSerializer<Object>>[] h;
    public final String a;
    public final String b;
    public final String c;
    public final double d;
    public final ToastTheme e;
    public final ToastStyle f;
    public final ToastPosition g;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/DisplayToastData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/DisplayToastData;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<DisplayToastData> serializer() {
            return DisplayToastData$$serializer.INSTANCE;
        }
    }

    static {
        int i = 1;
        pl0 pl0Var = new pl0(i);
        qt8 qt8Var = qt8.b;
        h = new Lazy[]{null, null, null, null, boa.E(qt8Var, pl0Var), boa.E(qt8Var, new ao0(i)), boa.E(qt8Var, new bo0(4))};
    }

    public /* synthetic */ DisplayToastData(int i, String str, String str2, String str3, double d, ToastTheme toastTheme, ToastStyle toastStyle, ToastPosition toastPosition) {
        if (127 != (i & 127)) {
            ewa.M(i, 127, DisplayToastData$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = d;
        this.e = toastTheme;
        this.f = toastStyle;
        this.g = toastPosition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisplayToastData)) {
            return false;
        }
        DisplayToastData displayToastData = (DisplayToastData) obj;
        return wl7.b(this.a, displayToastData.a) && wl7.b(this.b, displayToastData.b) && wl7.b(this.c, displayToastData.c) && Double.compare(this.d, displayToastData.d) == 0 && this.e == displayToastData.e && this.f == displayToastData.f && this.g == displayToastData.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (Double.hashCode(this.d) + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        ToastTheme toastTheme = this.e;
        int iHashCode4 = (iHashCode3 + (toastTheme == null ? 0 : toastTheme.hashCode())) * 31;
        ToastStyle toastStyle = this.f;
        int iHashCode5 = (iHashCode4 + (toastStyle == null ? 0 : toastStyle.hashCode())) * 31;
        ToastPosition toastPosition = this.g;
        return iHashCode5 + (toastPosition != null ? toastPosition.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("DisplayToastData(message=", this.a, ", title=", this.b, ", icon=");
        sbF.append(this.c);
        sbF.append(", durationSeconds=");
        sbF.append(this.d);
        sbF.append(", theme=");
        sbF.append(this.e);
        sbF.append(", style=");
        sbF.append(this.f);
        sbF.append(", position=");
        sbF.append(this.g);
        sbF.append(")");
        return sbF.toString();
    }

    public DisplayToastData(String str) {
        this.a = str;
        this.b = null;
        this.c = null;
        this.d = 2.0d;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
