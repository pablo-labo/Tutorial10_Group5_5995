package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class r4h {
    public static final String a = z39.f("WorkerFactory");

    public final c a(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        c cVar;
        String str2 = a;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(c.class);
        } catch (Throwable th) {
            z39.d().c(str2, "Invalid class: " + str, th);
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                cVar = (c) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                z39.d().c(str2, "Could not instantiate " + str, th2);
                cVar = null;
            }
        } else {
            cVar = null;
        }
        if (cVar == null || !cVar.isUsed()) {
            return cVar;
        }
        r6.g(akb.k("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
        return null;
    }
}
