package defpackage;

import android.graphics.Bitmap;
import androidx.media3.session.LegacyConversions;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.media3.session.s;
import androidx.media3.session.t;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yk9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yk9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                t.e eVar = (t.e) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                if (((AtomicInteger) obj3).incrementAndGet() == arrayList.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    int i2 = 0;
                    while (i2 < arrayList2.size()) {
                        hz8 hz8Var = (hz8) arrayList2.get(i2);
                        if (hz8Var != null) {
                            try {
                                bitmap = (Bitmap) aw5.J1(hz8Var);
                            } catch (CancellationException | ExecutionException e) {
                                zkd.v("MediaSessionLegacyStub", "Failed to get bitmap", e);
                                bitmap = null;
                            }
                        } else {
                            bitmap = null;
                        }
                        arrayList3.add(new MediaSessionCompat.QueueItem(null, LegacyConversions.i((ij9) arrayList.get(i2), bitmap), i2 == -1 ? -1L : i2));
                        i2++;
                        break;
                    }
                    t.C(t.this.k, arrayList3);
                }
                break;
            default:
                ebe ebeVar = (ebe) obj3;
                wq2 wq2Var = (wq2) obj2;
                hz8 hz8Var2 = (hz8) obj;
                if (((s) obj4).k()) {
                    ebeVar.l(null);
                } else {
                    try {
                        wq2Var.accept(hz8Var2);
                        ebeVar.l(null);
                    } catch (Throwable th) {
                        ebeVar.m(th);
                    }
                }
                break;
        }
    }
}
