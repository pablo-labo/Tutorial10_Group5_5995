package androidx.work;

import android.net.Network;
import android.net.Uri;
import defpackage.f3h;
import defpackage.q2h;
import defpackage.q4h;
import defpackage.x2h;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {
    public UUID a;
    public b b;
    public HashSet c;
    public a d;
    public int e;
    public ExecutorService f;
    public x2h g;
    public q4h h;
    public f3h i;
    public q2h j;

    public static class a {
        public List<String> a;
        public List<Uri> b;
        public Network c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.a = list;
            this.b = list;
        }
    }

    public WorkerParameters() {
        throw null;
    }
}
