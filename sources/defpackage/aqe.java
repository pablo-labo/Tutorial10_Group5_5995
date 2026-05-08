package defpackage;

import android.content.Context;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import com.apollographql.apollo.cache.normalized.sql.ApolloInitializer;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.z90;

/* JADX INFO: loaded from: classes.dex */
public final class aqe extends v1 {
    public final z90 b;

    public aqe() {
        fwc.a.b(fa8.class);
        Context context = ApolloInitializer.a;
        if (context != null) {
            this.b = new z90(new FrameworkSQLiteOpenHelper(context, "apollo.db", new z90.a(new wz[0]), false, false), null, 20);
        } else {
            wl7.g(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX);
            throw null;
        }
    }
}
