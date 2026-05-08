package defpackage;

import com.indeed.android.backendservices.data.IndeedAppDatabase_Impl;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class dig implements Callable {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public dig(jvh jvhVar, tvh tvhVar) {
        this.b = jvhVar;
        this.c = tvhVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        switch (this.a) {
            case 0:
                eig eigVar = (eig) this.c;
                IndeedAppDatabase_Impl indeedAppDatabase_Impl = eigVar.a;
                indeedAppDatabase_Impl.c();
                try {
                    eigVar.b.i((List) this.b);
                    indeedAppDatabase_Impl.w();
                    return j6g.a;
                } finally {
                    indeedAppDatabase_Impl.s();
                }
            default:
                jvh jvhVar = (jvh) this.b;
                tvh tvhVar = (tvh) this.c;
                nwh nwhVar = jvhVar.b;
                synchronized (nwhVar) {
                    FileOutputStream fileOutputStreamOpenFileOutput = nwhVar.a.openFileOutput(nwhVar.b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(tvhVar.a.toString().getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } finally {
                        try {
                        } finally {
                            if (fileOutputStreamOpenFileOutput != null) {
                                try {
                                    break;
                                } catch (Throwable th) {
                                }
                            }
                        }
                    }
                }
                return null;
        }
    }

    public dig(eig eigVar, List list) {
        this.c = eigVar;
        this.b = list;
    }
}
