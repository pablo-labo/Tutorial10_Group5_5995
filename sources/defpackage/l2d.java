package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.LocaleList;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import defpackage.cd4;
import defpackage.cz2;
import defpackage.xa5;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xa5.b;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.error.ReportEmailHelperKt$getErrorReportFile$2", f = "ReportEmailHelper.kt", l = {166}, m = "invokeSuspend")
public final class l2d extends c1f implements Function2<e13, lu2<? super File>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $exceptionDump;
    final /* synthetic */ String $reportSource;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2d(Context context, String str, String str2, lu2<? super l2d> lu2Var) {
        super(2, lu2Var);
        this.$context = context;
        this.$reportSource = str;
        this.$exceptionDump = str2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new l2d(this.$context, this.$reportSource, this.$exceptionDump, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super File> lu2Var) {
        return ((l2d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws IOException {
        File fileCreateTempFile;
        String str;
        Object objConcat;
        File file;
        String strK;
        BufferedReader bufferedReader;
        int i;
        char c;
        int i2 = this.label;
        int i3 = 0;
        int i4 = 1;
        if (i2 == 0) {
            r7d.b(obj);
            fileCreateTempFile = File.createTempFile("errorReport", ".txt");
            fileCreateTempFile.getClass();
            Context context = this.$context;
            PackageInfo packageInfoA = uwg.a(context);
            if (packageInfoA == null) {
                str = "not available";
            } else {
                str = packageInfoA.versionName + " (" + (Build.VERSION.SDK_INT >= 28 ? qya.a(packageInfoA) : packageInfoA.versionCode) + ")";
            }
            context.getClass();
            SharedPreferences sharedPreferences = context.getSharedPreferences("indeedPrefs", 0);
            sharedPreferences.getClass();
            Map<String, ?> all = sharedPreferences.getAll();
            all.getClass();
            ArrayList arrayList = new ArrayList(all.size());
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    strK = t40.k(key, " = null");
                } else {
                    key.getClass();
                    Object obj2 = wve.D(key, "Token", true) ? "(redacted)" : value;
                    strK = key + " = (" + value.getClass().getSimpleName() + ") " + obj2;
                }
                arrayList.add(strK);
            }
            String strW0 = z92.W0(z92.o1(arrayList), "\n", null, null, null, 62);
            StringBuilder sb = new StringBuilder("--- App ---\n\nplayProd release 277.1 (99968) d0488e7d\n\n--- Device ---\n\n");
            sb.append("Android: " + Build.VERSION.RELEASE + "\n");
            sb.append("Manufacturer: " + Build.MANUFACTURER + "\n");
            sb.append("Model: " + Build.MODEL + "\n");
            sb.append("Product: " + Build.PRODUCT + "\n");
            sb.append("Brand: " + Build.BRAND + "\n");
            sb.append("WebView version: " + str + "\n");
            c19 c19Var = c19.b;
            sb.append("Current locale: " + new c19(new e19(LocaleList.getDefault())) + "\n");
            sb.append("Display language: " + Locale.getDefault().getDisplayLanguage() + "\n\n");
            sb.append("--- Preferences ---\n\n");
            if (strW0.length() > 0) {
                sb.append(strW0);
                sb.append("\n\n");
            } else {
                sb.append("No items\n\n");
            }
            sb.append("--- App Proctor Groups ---\n\n");
            dd4 dd4Var = dd4.a;
            for (cd4.a aVar : dd4.n().a.d()) {
                String strName = aVar.name();
                dd4 dd4Var2 = dd4.a;
                sb.append(strName + ": " + dd4.n().a.e(aVar) + "\n");
            }
            hb5.N(fileCreateTempFile, sb.toString());
            hb5.N(fileCreateTempFile, "\n--- Report Source ---\n\n".concat("Report source: " + this.$reportSource + "\n"));
            hb5.N(fileCreateTempFile, "\n--- WebView Information ---\n\n".concat("Default User Agent: " + WebSettings.getDefaultUserAgent(this.$context) + "\n"));
            Context context2 = this.$context;
            this.L$0 = fileCreateTempFile;
            this.L$1 = fileCreateTempFile;
            this.label = 1;
            Object systemService = context2.getSystemService("connectivity");
            systemService.getClass();
            objConcat = "\n--- Network Info Status ---\n\n".concat("Active Network Info: " + ((ConnectivityManager) systemService).getActiveNetworkInfo() + "\n");
            g13 g13Var = g13.a;
            if (objConcat == g13Var) {
                return g13Var;
            }
            file = fileCreateTempFile;
        } else {
            if (i2 != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileCreateTempFile = (File) this.L$1;
            File file2 = (File) this.L$0;
            r7d.b(obj);
            file = file2;
            objConcat = obj;
        }
        hb5.N(fileCreateTempFile, (String) objConcat);
        file.getClass();
        StringBuilder sb2 = new StringBuilder("\n--- Cookies ---\n\n");
        CookieManager cookieManager = CookieManager.getInstance();
        sb2.append("indeed.com cookies: " + p2d.c(cookieManager.getCookie("https://indeed.com")) + "\n");
        sb2.append("indeed.com/m/ cookies: " + p2d.c(cookieManager.getCookie("https://indeed.com/m/")) + "\n");
        sb2.append("www.indeed.com cookies: " + p2d.c(cookieManager.getCookie("https://www.indeed.com")) + "\n");
        sb2.append("www.indeed.com/m/ cookies: " + p2d.c(cookieManager.getCookie("https://www.indeed.com/m/")) + "\n");
        String strConcat = "https://".concat(d93.b());
        if (!strConcat.equals("https://www.indeed.com")) {
            sb2.append(strConcat + " cookies: " + p2d.c(cookieManager.getCookie(strConcat)) + "\n");
            sb2.append(strConcat + "/m/ cookies: " + p2d.c(cookieManager.getCookie(strConcat.concat("/m/"))) + "\n");
        }
        hb5.N(file, sb2.toString());
        Context context3 = this.$context;
        StringBuilder sb3 = new StringBuilder("\n--- Cookies Dump ---\n\n");
        try {
            List listB = cz2.b();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : listB) {
                if (wve.D(((cz2.a) obj3).a, ".indeed.com", false)) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : arrayList2) {
                if (!ut0.f0(((cz2.a) obj4).c, p2d.a)) {
                    arrayList3.add(obj4);
                }
            }
            List listP1 = z92.p1(arrayList3, new etb(i4));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj5 : listP1) {
                String str2 = ((cz2.a) obj5).a;
                Object arrayList4 = linkedHashMap.get(str2);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap.put(str2, arrayList4);
                }
                ((List) arrayList4).add(obj5);
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str3 = (String) entry2.getKey();
                List list = (List) entry2.getValue();
                Iterator it = list.iterator();
                int length = i3;
                while (true) {
                    i = i4;
                    c = 2;
                    if (!it.hasNext()) {
                        break;
                    }
                    cz2.a aVar2 = (cz2.a) it.next();
                    length += aVar2.d.length() + aVar2.c.length() + 1 + 2;
                    i4 = i;
                }
                nf nfVar = new nf(24);
                dc dcVar = new dc(20);
                Function1[] function1Arr = new Function1[2];
                function1Arr[i3] = nfVar;
                function1Arr[i] = dcVar;
                for (cz2.a aVar3 : z92.p1(list, ak2.h(function1Arr))) {
                    String str4 = aVar3.b;
                    String str5 = aVar3.d;
                    String str6 = aVar3.c;
                    char c2 = c;
                    sb3.append("- " + str3 + "|" + str4 + "|" + (str5.length() + str6.length() + 1 + 2) + "/" + length + "|" + str6 + "=" + str5);
                    sb3.append('\n');
                    c = c2;
                    i3 = 0;
                }
                i4 = i;
            }
        } catch (Throwable th) {
            sb3.append("Error: could not dump cookies: " + th);
            sb3.append('\n');
            ArrayList arrayList5 = lz2.a;
            lz2.c("ReportEmailHelper", "could not dump cookies: " + th, false, th, 4);
            try {
                File dataDir = context3.getDataDir();
                dataDir.getClass();
                xa5.b bVar = new xa5(dataDir, eb5.a, null).new b();
                while (bVar.hasNext()) {
                    File next = bVar.next();
                    Object objValueOf = next.isDirectory() ? "d" : Long.valueOf(next.length());
                    sb3.append("file: " + objValueOf + " " + new File(hb5.V(next, dataDir)));
                    sb3.append('\n');
                }
            } catch (Throwable th2) {
                sb3.append("Error in enumerating files: " + th2);
                sb3.append('\n');
            }
        }
        hb5.N(file, sb3.toString());
        String str7 = this.$exceptionDump;
        StringBuilder sb4 = new StringBuilder("\n--- Stack Trace ---\n\n");
        if (str7 != null) {
            sb4.append(str7);
        } else {
            sb4.append("Exception was null");
        }
        hb5.N(file, sb4.toString());
        StringBuilder sb5 = new StringBuilder("\n--- Logcat Logs ---\n\n");
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d").getInputStream()));
        } catch (IOException unused) {
            sb5.append("Failed to read logcat file\n");
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb5.append(((Object) line) + "\n");
            hb5.N(file, sb5.toString());
            return file;
        }
        sb5.append("\n");
        hb5.N(file, sb5.toString());
        return file;
    }
}
