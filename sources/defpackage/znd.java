package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class znd {
    public final List<String> a;
    public final String b;
    public final String c;
    public final und d;

    public znd(List<String> list, String str, String str2, und undVar) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = undVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znd)) {
            return false;
        }
        znd zndVar = (znd) obj;
        return this.a.equals(zndVar.a) && this.b.equals(zndVar.b) && this.c.equals(zndVar.c) && this.d == zndVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ScheduleApplyOptionsFormFieldResponse(responseValues=" + this.a + ", formFieldId=" + this.b + ", formField=" + this.c + ", validationStatus=" + this.d + ")";
    }
}
