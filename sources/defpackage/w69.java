package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.work.impl.WorkDatabase;
import com.airbnb.lottie.parser.moshi.c;
import com.indeed.android.jobsearch.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import uqc.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w69 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w69(Object obj, Object obj2, String str, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        p79<s69> p79Var;
        int i = this.a;
        String str = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                Context context2 = (Context) ((WeakReference) obj2).get();
                if (context2 != null) {
                    context = context2;
                }
                s69 s69VarA = str == null ? null : t69.b.a(str);
                if (s69VarA != null) {
                    return new p79(s69VarA);
                }
                try {
                    uqc uqcVar = new uqc(c0h.S(context.getResources().openRawResource(R.raw.confetti)));
                    if (!z69.g(uqcVar, z69.c).booleanValue()) {
                        if (z69.g(uqcVar, z69.d).booleanValue()) {
                            try {
                                p79Var = z69.c(new GZIPInputStream(uqcVar.new a()), str);
                            } catch (IOException e) {
                                p79Var = new p79<>(e);
                            }
                        } else {
                            String[] strArr = com.airbnb.lottie.parser.moshi.a.e;
                            p79Var = z69.d(new c(uqcVar), str, true);
                        }
                        break;
                    } else {
                        p79Var = z69.e(context, new ZipInputStream(uqcVar.new a()), str);
                    }
                    return p79Var;
                } catch (Resources.NotFoundException e2) {
                    return new p79(e2);
                }
            default:
                WorkDatabase workDatabase = ((kob) obj2).e;
                ((ArrayList) obj).addAll(workDatabase.E().a(str));
                return workDatabase.D().i(str);
        }
    }
}
