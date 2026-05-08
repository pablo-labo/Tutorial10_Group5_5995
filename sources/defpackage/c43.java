package defpackage;

import android.util.Log;
import defpackage.v33;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class c43 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final x33 g = new x33();
    public static final y33 h = new y33(0);
    public static final z33 i = new z33();
    public final AtomicInteger a = new AtomicInteger(0);
    public final oa5 b;
    public final nbe c;
    public final x23 d;

    public c43(oa5 oa5Var, nbe nbeVar, x23 x23Var) {
        this.b = oa5Var;
        this.c = nbeVar;
        this.d = x23Var;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        oa5 oa5Var = this.b;
        arrayList.addAll(oa5.e(oa5Var.e.listFiles()));
        arrayList.addAll(oa5.e(oa5Var.f.listFiles()));
        y33 y33Var = h;
        Collections.sort(arrayList, y33Var);
        List listE = oa5.e(oa5Var.d.listFiles());
        Collections.sort(listE, y33Var);
        arrayList.addAll(listE);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(oa5.e(this.b.c.list())).descendingSet();
    }

    public final void d(v33.e.d dVar, String str, boolean z) {
        oa5 oa5Var = this.b;
        int i2 = this.c.b().a.a;
        g.getClass();
        try {
            f(oa5Var.b(str, l5.m("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z ? "_" : "")), x33.a.a(dVar));
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        a43 a43Var = new a43();
        oa5Var.getClass();
        File file = new File(oa5Var.c, str);
        file.mkdirs();
        List<File> listE = oa5.e(file.listFiles(a43Var));
        Collections.sort(listE, new b43(0));
        int size = listE.size();
        for (File file2 : listE) {
            if (size <= i2) {
                return;
            }
            oa5.d(file2);
            size--;
        }
    }
}
