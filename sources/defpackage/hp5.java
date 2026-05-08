package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class hp5 {
    public final int a;
    public final int b;
    public final Notification c;

    public hp5(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hp5.class != obj.getClass()) {
            return false;
        }
        hp5 hp5Var = (hp5) obj;
        if (this.a == hp5Var.a && this.b == hp5Var.b) {
            return this.c.equals(hp5Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
