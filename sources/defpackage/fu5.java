package defpackage;

import androidx.activity.ComponentActivity;
import androidx.activity.a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fu5 {
    public final Object a;
    public boolean b;
    public final ArrayList c;

    public fu5(ComponentActivity.d dVar, a aVar) {
        dVar.getClass();
        this.a = new Object();
        this.c = new ArrayList();
    }

    public final void a() {
        synchronized (this.a) {
            try {
                this.b = true;
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((gu5) it.next()).invoke();
                }
                this.c.clear();
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
