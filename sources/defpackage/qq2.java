package defpackage;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes2.dex */
public final class qq2 implements hna, uob, he0, OnCompleteListener {
    public Object a;

    public qq2(int i) {
        switch (i) {
            case DatadogLogGenerator.CRASH /* 9 */:
                this.a = new ArrayDeque(16);
                break;
            default:
                this.a = new oaf();
                break;
        }
    }

    @Override // defpackage.uob
    public void a() {
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        if (((Boolean) bu8.J0.a(bu8.b[47], bu8Var)).booleanValue()) {
            ((gl8) this.a).d.k(new jz2<>(j6g.a));
        }
    }

    @Override // defpackage.hna
    public Object b() {
        Type type = (Type) this.a;
        if (!(type instanceof ParameterizedType)) {
            bg.k(type, "Invalid EnumMap type: ");
            return null;
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        bg.k(type, "Invalid EnumMap type: ");
        return null;
    }

    @Override // defpackage.uob
    public String c() {
        return "LaunchViewModel";
    }

    public String d(Uri uri) {
        String strY;
        uri.getClass();
        Context context = (Context) this.a;
        String type = context.getContentResolver().getType(uri);
        String str = null;
        if (wl7.b(type != null ? MimeTypeMap.getSingleton().getExtensionFromMimeType(type) : null, "txt")) {
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                BufferedReader bufferedReader = inputStreamOpenInputStream != null ? new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, a32.b), 8192) : null;
                if (bufferedReader != null) {
                    try {
                        strY = nn2.y(bufferedReader);
                    } finally {
                    }
                } else {
                    strY = null;
                }
                c0h.q(bufferedReader, null);
                str = strY;
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.c("OtherFilePreviewRendererImpl", "Error reading file content: {" + e + "}", false, null, 12);
            }
        } else {
            str = "";
        }
        return (str == null || str.length() == 0) ? "" : str.toString();
    }

    public void e(Exception exc) {
        oaf oafVar = (oaf) this.a;
        synchronized (oafVar.a) {
            try {
                if (oafVar.b) {
                    r6.g("Cannot set the error on a completed task.");
                    return;
                }
                oafVar.b = true;
                oafVar.e = exc;
                oafVar.a.notifyAll();
                oafVar.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + h());
    }

    public void g(long j) throws IOException {
        long jH = h();
        if (jH != j) {
            if (jH != -1) {
                if (jH != -2) {
                    return;
                } else {
                    jH = -2;
                }
            }
            StringBuilder sbI = w40.i(j, "expected non-string scope or scope ", " but found ");
            sbI.append(jH);
            throw new IOException(sbI.toString());
        }
    }

    @Override // defpackage.he0
    public zh5 get(int i) {
        return ((fi5[]) this.a)[i];
    }

    public long h() {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.a;
        if (task.isSuccessful()) {
            return;
        }
        Exception exception = task.getException();
        exception.getClass();
        taskCompletionSource.trySetException(exception);
    }

    public /* synthetic */ qq2(Object obj) {
        this.a = obj;
    }
}
