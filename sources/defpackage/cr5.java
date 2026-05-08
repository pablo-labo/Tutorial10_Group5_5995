package defpackage;

import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.g;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class cr5<E> extends wq5 {
    public final g a;
    public final g b;
    public final Handler c;
    public final lr5 d;

    public cr5(g gVar) {
        Handler handler = new Handler();
        this.d = new lr5();
        this.a = gVar;
        this.b = gVar;
        this.c = handler;
    }

    public abstract void l(PrintWriter printWriter, String[] strArr);

    public abstract g p();

    public abstract LayoutInflater q();

    public abstract boolean s(String str);

    public abstract void t();
}
