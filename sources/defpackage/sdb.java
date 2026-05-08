package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class sdb {
    public final String a;
    public final a b;
    public final Object c;

    public static final class a {
        public LogSessionId a = LogSessionId.LOG_SESSION_ID_NONE;

        public final void a(LogSessionId logSessionId) {
            ka2.q(this.a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.a = logSessionId;
        }
    }

    static {
        new sdb("");
    }

    public sdb(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new a() : null;
        this.c = new Object();
    }

    public final synchronized LogSessionId a() {
        a aVar;
        aVar = this.b;
        aVar.getClass();
        return aVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdb)) {
            return false;
        }
        sdb sdbVar = (sdb) obj;
        return Objects.equals(this.a, sdbVar.a) && Objects.equals(this.b, sdbVar.b) && Objects.equals(this.c, sdbVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
