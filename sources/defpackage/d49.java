package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d49 {
    public final List<f39> a;

    /* JADX WARN: Multi-variable type inference failed */
    public d49(List<? extends f39> list) {
        this.a = list;
    }

    public static void b(d49 d49Var, String str) {
        d49Var.getClass();
        d49Var.a(o39.Warn, str, null);
    }

    public final void a(o39 o39Var, String str, Throwable th) {
        o39.a.getClass();
        switch (o39Var) {
            case Trace:
            case Timer:
            case Stacktrace:
            case Debug:
                break;
            case Info:
            case Warn:
            case Error:
            case Fatal:
                Iterator<T> it = this.a.iterator();
                while (it.hasNext()) {
                    ((f39) it.next()).a(o39Var, str, th);
                }
                break;
            default:
                l.g();
                break;
        }
    }
}
