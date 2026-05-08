package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class snd {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final boolean d;
    public final snd e;

    public snd(String str, ArrayList arrayList, String str2, boolean z, snd sndVar) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = z;
        this.e = sndVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snd)) {
            return false;
        }
        snd sndVar = (snd) obj;
        return wl7.b(this.a, sndVar.a) && this.b.equals(sndVar.b) && wl7.b(this.c, sndVar.c) && this.d == sndVar.d && wl7.b(this.e, sndVar.e);
    }

    public final int hashCode() {
        int iF = ia.f(akb.d(z3.d(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        snd sndVar = this.e;
        return iF + (sndVar == null ? 0 : sndVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduleApplyFormFieldGroup(groupLabel=");
        sb.append(this.a);
        sb.append(", formFields=");
        sb.append(this.b);
        sb.append(", groupId=");
        akb.q(this.c, ", isCollapsed=", ", nestedFormFieldGroup=", sb, this.d);
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
