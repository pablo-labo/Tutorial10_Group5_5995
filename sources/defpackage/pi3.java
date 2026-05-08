package defpackage;

import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import com.datadog.android.log.Logger;
import com.indeed.android.jobsearch.BuildConfig;
import defpackage.o7d;
import java.util.Collections;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public class pi3 implements yde {
    public static final ah2 b = new ah2(-399486428, new vh2(0), false);
    public static final nfa c = new nfa("KotlinTypeRefiner", 3);
    public static final pi3 d = new pi3(4);
    public final /* synthetic */ int a;

    public pi3(zme zmeVar) {
        this.a = 2;
    }

    public static final wd7 b(String str, KSerializer kSerializer) {
        return new wd7(str, new xd7(kSerializer));
    }

    public static final int c(float[] fArr) {
        int i = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i2 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i2 << 1) | i;
    }

    public static final void d(AutoCloseable autoCloseable, Throwable th) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    l5.o(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    boa.h(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    o6.h();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
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
    }

    public static final y03 e(Executor executor) {
        return new q15(executor);
    }

    public static final String f(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static void i(Logger logger, String str, long j, long j2, String str2, String str3, String str4) {
        logger.getClass();
        str.getClass();
        str3.getClass();
        Logger.i$default(logger, "NativeHttpMetrics", null, lc9.a0(new Pair("appVersion", BuildConfig.VERSION_NAME), new Pair("buildEnvironment", "prod"), new Pair("httpMethod", str), new Pair("message", "NativeHttpMetrics"), new Pair("responseLatencyMs", Long.valueOf(j)), new Pair("responseStatusCode", Long.valueOf(j2)), new Pair("url", str2), new Pair("urlType", str3), new Pair("graphQLOperation", str4)), 2, null);
    }

    public static Date j(Parcel parcel) {
        long j = parcel.readLong();
        if (j != -1) {
            return new Date(j);
        }
        return null;
    }

    public static Set k(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public static final String l(lu2 lu2Var) {
        Object aVar;
        if (lu2Var instanceof v64) {
            return ((v64) lu2Var).toString();
        }
        try {
            aVar = lu2Var + '@' + f(lu2Var);
        } catch (Throwable th) {
            aVar = new o7d.a(th);
        }
        if (o7d.a(aVar) != null) {
            aVar = lu2Var.getClass().getName() + '@' + f(lu2Var);
        }
        return (String) aVar;
    }

    @Override // defpackage.yde
    public vi5 a(fse fseVar) {
        return new gj5(wde.a);
    }

    public Object g(float f, float f2, Object obj, Object obj2, float f3, float f4, float f5) {
        throw null;
    }

    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    public void h(int i, String str) {
        foa[] foaVarArr = ioa.a.get();
        int i2 = 0;
        if (foaVarArr != null) {
            for (foa foaVar : foaVarArr) {
                foaVar.b();
            }
        }
        try {
            System.load(str);
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                foa[] foaVarArr2 = ioa.a.get();
                if (foaVarArr2 != null) {
                    int length = foaVarArr2.length;
                    while (i2 < length) {
                        foaVarArr2[i2].f();
                        i2++;
                    }
                }
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 13:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ pi3(int i) {
        this.a = i;
    }
}
