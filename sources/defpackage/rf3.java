package defpackage;

import android.content.Context;
import com.infra.eventlogger.persistence.EventLoggerDatabase;
import defpackage.xed;

/* JADX INFO: loaded from: classes3.dex */
public final class rf3 {
    public static final a Companion = new a();
    public static volatile rf3 c;
    public final Context a;
    public final d2f b = new d2f(new b());

    public static final class a {
    }

    public static final class b extends mj8 implements gu5<EventLoggerDatabase> {
        public b() {
            super(0);
        }

        @Override // defpackage.gu5
        public final EventLoggerDatabase invoke() {
            xed.a aVarA = ued.a(rf3.this.a, EventLoggerDatabase.class, "indeed-event-logger-db");
            aVarA.p = false;
            aVarA.q = true;
            return (EventLoggerDatabase) aVarA.b();
        }
    }

    public rf3(Context context) {
        this.a = context;
    }
}
