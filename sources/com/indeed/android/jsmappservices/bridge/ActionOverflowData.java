package com.indeed.android.jsmappservices.bridge;

import defpackage.boa;
import defpackage.ewa;
import defpackage.ia;
import defpackage.j7;
import defpackage.l6;
import defpackage.o7e;
import defpackage.qt8;
import defpackage.u40;
import defpackage.wl7;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002¨\u0006\u0005"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/ActionOverflowData;", "", "Companion", "ActionOverflowRow", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActionOverflowData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy<KSerializer<Object>>[] f = {null, null, null, boa.E(qt8.b, new j7(0)), null};
    public final String a;
    public final String b;
    public final String c;
    public final List<ActionOverflowRow> d;
    public final Integer e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/ActionOverflowData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/ActionOverflowData;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ActionOverflowData> serializer() {
            return ActionOverflowData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ActionOverflowData(int i, String str, String str2, String str3, List list, Integer num) {
        if (8 != (i & 8)) {
            ewa.M(i, 8, ActionOverflowData$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = list;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionOverflowData)) {
            return false;
        }
        ActionOverflowData actionOverflowData = (ActionOverflowData) obj;
        return wl7.b(this.a, actionOverflowData.a) && wl7.b(this.b, actionOverflowData.b) && wl7.b(this.c, actionOverflowData.c) && wl7.b(this.d, actionOverflowData.d) && wl7.b(this.e, actionOverflowData.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iG = ia.g(this.d, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Integer num = this.e;
        return iG + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("ActionOverflowData(heading=", this.a, ", subheading=", this.b, ", subheadingIcon=");
        sbF.append(this.c);
        sbF.append(", items=");
        sbF.append(this.d);
        sbF.append(", currentSelectedIndex=");
        sbF.append(this.e);
        sbF.append(")");
        return sbF.toString();
    }

    @o7e
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/ActionOverflowData$ActionOverflowRow;", "", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActionOverflowRow {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String a;
        public final String b;
        public final String c;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/ActionOverflowData$ActionOverflowRow$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/ActionOverflowData$ActionOverflowRow;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ActionOverflowRow> serializer() {
                return ActionOverflowData$ActionOverflowRow$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ActionOverflowRow(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionOverflowRow)) {
                return false;
            }
            ActionOverflowRow actionOverflowRow = (ActionOverflowRow) obj;
            return wl7.b(this.a, actionOverflowRow.a) && wl7.b(this.b, actionOverflowRow.b) && wl7.b(this.c, actionOverflowRow.c);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return l6.i(u40.f("ActionOverflowRow(icon=", this.a, ", text=", this.b, ", subText="), this.c, ")");
        }

        public ActionOverflowRow() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }
}
