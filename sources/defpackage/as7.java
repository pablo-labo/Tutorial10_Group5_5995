package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class as7 {
    public final Integer a;

    public as7(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as7) && wl7.b(this.a, ((as7) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "JSTProfileMaxCommuteTime(timeMinutes=" + this.a + ")";
    }
}
