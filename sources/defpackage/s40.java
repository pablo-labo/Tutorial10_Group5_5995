package defpackage;

import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.media3.session.r;
import androidx.media3.session.x;
import androidx.media3.session.y;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import defpackage.fid;
import defpackage.lz8;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s40 implements v84, lz8.a, jg2, wq2, x.d, fid.a {
    public static qd2 b(List list, String str, List list2, List list3) {
        list.getClass();
        return new qd2(str, list2, list3);
    }

    public static void e(int i, int i2, int i3, int i4, int i5) {
        ak2.a(i);
        ak2.a(i2);
        ak2.a(i3);
        ak2.a(i4);
        ak2.a(i5);
    }

    public static /* synthetic */ void g(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(Cursor cursor) throws Exception {
        boolean zIsTerminated;
        if (cursor instanceof AutoCloseable) {
            cursor.close();
            return;
        }
        if (!(cursor instanceof ExecutorService)) {
            if (cursor instanceof TypedArray) {
                ((TypedArray) cursor).recycle();
                return;
            }
            if (cursor instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) cursor).release();
                return;
            } else if (cursor instanceof MediaDrm) {
                ((MediaDrm) cursor).release();
                return;
            } else {
                o6.h();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) cursor;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2) {
        throw new RuntimeException(str + obj + ((Object) "#") + obj2);
    }

    @Override // androidx.media3.session.x.d
    public void a(vdb vdbVar, r.e eVar) {
        y.f(vdbVar, eVar);
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        ((vdb) obj).z();
    }

    @Override // fid.a
    public Object apply(Object obj) {
        return (List) fid.W(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new h5(23));
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        return ExecutorsRegistrar.a.get();
    }

    @Override // defpackage.v84
    public double f(double d) {
        double d2;
        double dPow = d < 0.0d ? -d : d;
        if (dPow >= 0.0031308049535603718d) {
            dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
            d2 = 0.9478672985781991d;
        } else {
            d2 = 0.07739938080495357d;
        }
        return Math.copySign(dPow / d2, d);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((v20) obj).getClass();
    }
}
