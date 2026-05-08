package defpackage;

import android.os.Handler;
import android.os.Looper;
import defpackage.bs3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class cs3 extends bs3 {
    public final Object b = new Object();
    public final a f = new a();
    public ArrayList<bs3.a> d = new ArrayList<>();
    public ArrayList<bs3.a> e = new ArrayList<>();
    public final Handler c = new Handler(Looper.getMainLooper());

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<bs3.a> arrayList;
            synchronized (cs3.this.b) {
                cs3 cs3Var = cs3.this;
                ArrayList<bs3.a> arrayList2 = cs3Var.e;
                arrayList = cs3Var.d;
                cs3Var.e = arrayList;
                cs3Var.d = arrayList2;
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                ArrayList<bs3.a> arrayList3 = cs3.this.e;
                if (i >= size) {
                    arrayList3.clear();
                    return;
                } else {
                    arrayList3.get(i).release();
                    i++;
                }
            }
        }
    }

    @Override // defpackage.bs3
    public final void a(z1 z1Var) {
        synchronized (this.b) {
            this.d.remove(z1Var);
        }
    }

    @Override // defpackage.bs3
    public final void b(z1 z1Var) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            z1Var.release();
            return;
        }
        synchronized (this.b) {
            try {
                if (this.d.contains(z1Var)) {
                    return;
                }
                this.d.add(z1Var);
                boolean z = true;
                if (this.d.size() != 1) {
                    z = false;
                }
                if (z) {
                    this.c.post(this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
