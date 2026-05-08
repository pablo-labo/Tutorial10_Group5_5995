package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tnd {
    public final String a;
    public final String b;

    public tnd(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnd)) {
            return false;
        }
        tnd tndVar = (tnd) obj;
        return wl7.b(this.a, tndVar.a) && wl7.b(this.b, tndVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return akb.k("ScheduleApplyFormFieldOption(value=", this.a, ", label=", this.b, ")");
    }
}
