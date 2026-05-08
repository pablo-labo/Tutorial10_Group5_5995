package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import defpackage.c21;
import defpackage.f21;
import defpackage.o34;
import defpackage.v11;
import defpackage.v33;
import defpackage.wc2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class g33 {
    public static final b33 r = new b33();
    public final Context a;
    public final ce3 b;
    public final r33 c;
    public final jjg d;
    public final a33 e;
    public final nr6 f;
    public final oa5 g;
    public final qk0 h;
    public final e39 i;
    public final s33 j;
    public final t20 k;
    public final x23 l;
    public final w9e m;
    public e43 n;
    public final TaskCompletionSource<Boolean> o = new TaskCompletionSource<>();
    public final TaskCompletionSource<Boolean> p = new TaskCompletionSource<>();
    public final TaskCompletionSource<Void> q = new TaskCompletionSource<>();

    public class a implements SuccessContinuation<Boolean, Void> {
        public final /* synthetic */ Task a;

        public a(Task task) {
            this.a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        public final Task<Void> then(Boolean bool) {
            return g33.this.e.b(new f33(this, bool));
        }
    }

    public g33(Context context, a33 a33Var, nr6 nr6Var, ce3 ce3Var, oa5 oa5Var, r33 r33Var, qk0 qk0Var, jjg jjgVar, e39 e39Var, w9e w9eVar, s33 s33Var, t20 t20Var, x23 x23Var) {
        new AtomicBoolean(false);
        this.a = context;
        this.e = a33Var;
        this.f = nr6Var;
        this.b = ce3Var;
        this.g = oa5Var;
        this.c = r33Var;
        this.h = qk0Var;
        this.d = jjgVar;
        this.i = e39Var;
        this.j = s33Var;
        this.k = t20Var;
        this.l = x23Var;
        this.m = w9eVar;
    }

    public static void a(g33 g33Var, String str, Boolean bool) {
        int i;
        long j;
        Integer num;
        Map<String, String> mapUnmodifiableMap;
        List<sed> listUnmodifiableList;
        g33Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strL = l5.l("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strL, null);
        }
        Locale locale = Locale.US;
        nr6 nr6Var = g33Var.f;
        qk0 qk0Var = g33Var.h;
        r31 r31Var = new r31(nr6Var.c, qk0Var.f, qk0Var.g, nr6Var.b().a, (qk0Var.d != null ? gy3.APP_STORE : gy3.DEVELOPER).a(), qk0Var.h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        t31 t31Var = new t31(wc2.g());
        Context context = g33Var.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        wc2.a aVar = wc2.a.a;
        String str4 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str4)) {
            i = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i = 3;
            wc2.a aVar2 = (wc2.a) wc2.a.b.get(str4.toLowerCase(locale));
            if (aVar2 != null) {
                aVar = aVar2;
            }
        }
        int iOrdinal = aVar.ordinal();
        String str5 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = wc2.a(context);
        boolean zF = wc2.f();
        int iC = wc2.c();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        g33Var.j.c(str, jCurrentTimeMillis, new q31(r31Var, t31Var, new s31(iOrdinal, iAvailableProcessors, jA, blockCount, zF, iC)));
        if (!bool.booleanValue() || str == null) {
            j = jCurrentTimeMillis;
        } else {
            jjg jjgVar = g33Var.d;
            synchronized (jjgVar.c) {
                try {
                    jjgVar.c = str;
                    sh8 reference = jjgVar.d.a.getReference();
                    synchronized (reference) {
                        mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.a));
                    }
                    ted tedVar = jjgVar.f;
                    synchronized (tedVar) {
                        j = jCurrentTimeMillis;
                        listUnmodifiableList = Collections.unmodifiableList(new ArrayList(tedVar.a));
                    }
                    if (jjgVar.g.getReference() != null) {
                        jjgVar.a.i(str, jjgVar.g.getReference());
                    }
                    if (!mapUnmodifiableMap.isEmpty()) {
                        jjgVar.a.g(str, mapUnmodifiableMap, false);
                    }
                    if (!listUnmodifiableList.isEmpty()) {
                        jjgVar.a.h(str, listUnmodifiableList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e39 e39Var = g33Var.i;
        e39Var.b.a();
        e39Var.b = e39.c;
        if (str != null) {
            e39Var.b = new t9c(e39Var.a.b(str, "userlog"));
        }
        g33Var.l.c(str);
        w9e w9eVar = g33Var.m;
        w33 w33Var = w9eVar.a;
        Charset charset = v33.a;
        v11.a aVar3 = new v11.a();
        aVar3.a = "18.6.3";
        qk0 qk0Var2 = w33Var.c;
        String str8 = qk0Var2.a;
        if (str8 == null) {
            ja.k("Null gmpAppId");
            return;
        }
        aVar3.b = str8;
        nr6 nr6Var2 = w33Var.b;
        String str9 = nr6Var2.b().a;
        if (str9 == null) {
            ja.k("Null installationUuid");
            return;
        }
        aVar3.d = str9;
        aVar3.e = nr6Var2.b().b;
        String str10 = qk0Var2.f;
        if (str10 == null) {
            ja.k("Null buildVersion");
            return;
        }
        aVar3.g = str10;
        String str11 = qk0Var2.g;
        if (str11 == null) {
            ja.k("Null displayVersion");
            return;
        }
        aVar3.h = str11;
        aVar3.c = 4;
        Integer numValueOf = Integer.valueOf(i);
        c21.a aVar4 = new c21.a();
        aVar4.f = Boolean.FALSE;
        aVar4.d = Long.valueOf(j);
        if (str == null) {
            ja.k("Null identifier");
            return;
        }
        aVar4.b = str;
        String str12 = w33.g;
        if (str12 == null) {
            ja.k("Null generator");
            return;
        }
        aVar4.a = str12;
        String str13 = nr6Var2.c;
        if (str13 == null) {
            ja.k("Null identifier");
            return;
        }
        o34 o34Var = qk0Var2.h;
        String str14 = qk0Var2.g;
        String str15 = nr6Var2.b().a;
        if (o34Var.b == null) {
            o34Var.b = new o34.a(o34Var);
        }
        o34.a aVar5 = o34Var.b;
        String str16 = aVar5.a;
        if (aVar5 == null) {
            o34Var.b = new o34.a(o34Var);
        }
        aVar4.g = new d21(str13, str10, str14, str15, str16, o34Var.b.b);
        aVar4.i = new u21(i, str2, str3, wc2.g());
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str4) && (num = (Integer) w33.f.get(str4.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = wc2.a(w33Var.a);
        long blockSize = ((long) statFs2.getBlockSize()) * ((long) statFs2.getBlockCount());
        boolean zF2 = wc2.f();
        int iC2 = wc2.c();
        f21.a aVar6 = new f21.a();
        aVar6.a = Integer.valueOf(iIntValue);
        aVar6.b = str5;
        aVar6.c = Integer.valueOf(iAvailableProcessors2);
        aVar6.d = Long.valueOf(jA2);
        aVar6.e = Long.valueOf(blockSize);
        aVar6.f = Boolean.valueOf(zF2);
        aVar6.g = Integer.valueOf(iC2);
        aVar6.h = str6;
        aVar6.i = str7;
        aVar4.j = aVar6.a();
        aVar4.l = numValueOf;
        aVar3.i = aVar4.a();
        v11 v11VarA = aVar3.a();
        oa5 oa5Var = w9eVar.b.b;
        v33.e eVar = v11VarA.j;
        if (eVar == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String strH = eVar.h();
        try {
            c43.g.getClass();
            c43.f(oa5Var.b(strH, "report"), x33.a.a(v11VarA));
            File fileB = oa5Var.b(strH, "start-time");
            long j2 = eVar.j();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileB), c43.e);
            try {
                outputStreamWriter.write("");
                fileB.setLastModified(j2 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e) {
            String strL2 = l5.l("Could not persist report for session ", strH);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strL2, e);
            }
        }
    }

    public static Task b(g33 g33Var) {
        Task taskCall;
        g33Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : oa5.e(g33Var.g.b.listFiles(r))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new k33(g33Var, j));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String f() throws java.io.IOException {
        /*
            java.lang.Class<g33> r0 = defpackage.g33.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = "FirebaseCrashlytics"
            r2 = 0
            if (r0 != 0) goto L12
            java.lang.String r0 = "Couldn't get Class Loader"
            android.util.Log.w(r1, r0, r2)
        L10:
            r0 = r2
            goto L20
        L12:
            java.lang.String r3 = "META-INF/version-control-info.textproto"
            java.io.InputStream r0 = r0.getResourceAsStream(r3)
            if (r0 != 0) goto L20
            java.lang.String r0 = "No version control information found"
            android.util.Log.i(r1, r0, r2)
            goto L10
        L20:
            if (r0 != 0) goto L23
            return r2
        L23:
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r1, r3)
            if (r3 == 0) goto L2f
            java.lang.String r3 = "Read version control info"
            android.util.Log.d(r1, r3, r2)
        L2f:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]
        L38:
            int r3 = r0.read(r2)
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L44
            r1.write(r2, r5, r3)
            goto L38
        L44:
            byte[] r0 = r1.toByteArray()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g33.f():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0553  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r32, defpackage.nbe r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g33.c(boolean, nbe):void");
    }

    public final boolean d(nbe nbeVar) throws Throwable {
        if (!Boolean.TRUE.equals(this.e.d.get())) {
            r6.g("Not running on background worker thread as intended.");
            return false;
        }
        e43 e43Var = this.n;
        if (e43Var != null && e43Var.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            c(true, nbeVar);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetC = this.m.b.c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final void g() {
        try {
            String strF = f();
            if (strF != null) {
                try {
                    this.d.e.a("com.crashlytics.version-control-info", strF);
                } catch (IllegalArgumentException e) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    @SuppressLint({"TaskMainThread"})
    public final Task<Void> h(Task<hbe> task) {
        Task<Void> task2;
        Task task3;
        TaskCompletionSource<Boolean> taskCompletionSource = this.o;
        oa5 oa5Var = this.m.b.b;
        if (oa5.e(oa5Var.d.listFiles()).isEmpty() && oa5.e(oa5Var.e.listFiles()).isEmpty() && oa5.e(oa5Var.f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        cr8 cr8Var = cr8.c;
        cr8Var.J("Crash reports are available to be sent.");
        ce3 ce3Var = this.b;
        if (ce3Var.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            cr8Var.k("Automatic data collection is disabled.");
            cr8Var.J("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (ce3Var.b) {
                task2 = ce3Var.c.getTask();
            }
            Task<TContinuationResult> taskOnSuccessTask = task2.onSuccessTask(new h4(15));
            cr8Var.k("Waiting for send/deleteUnsentReports to be called.");
            Task<Boolean> task4 = this.p.getTask();
            ExecutorService executorService = dkg.a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            a73 a73Var = new a73(taskCompletionSource2, 7);
            taskOnSuccessTask.continueWith(a73Var);
            task4.continueWith(a73Var);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new a(task));
    }
}
