package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import defpackage.fx9;
import defpackage.ke3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class u95<Data> implements fx9<File, Data> {
    public final d<Data> a;

    public static class a<Data> implements gx9<File, Data> {
        public final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // defpackage.gx9
        public final fx9<File, Data> c(n1a n1aVar) {
            return new u95(this.a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {
    }

    public static final class c<Data> implements ke3<Data> {
        public final File a;
        public final d<Data> b;
        public Data c;

        public c(File file, d<Data> dVar) {
            this.a = file;
            this.b = dVar;
        }

        @Override // defpackage.ke3
        public final Class<Data> a() {
            return this.b.a();
        }

        @Override // defpackage.ke3
        public final void b() {
            Data data = this.c;
            if (data != null) {
                try {
                    this.b.b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // defpackage.ke3
        public final void cancel() {
        }

        /* JADX WARN: Type inference failed for: r2v5, types: [Data, java.lang.Object] */
        @Override // defpackage.ke3
        public final void d(knb knbVar, ke3.a<? super Data> aVar) {
            try {
                Data dataC = this.b.c(this.a);
                this.c = dataC;
                aVar.f(dataC);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.c(e);
            }
        }

        @Override // defpackage.ke3
        public final xe3 e() {
            return xe3.a;
        }
    }

    public interface d<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(File file);
    }

    public static class e extends a<InputStream> {
    }

    public u95(d<Data> dVar) {
        this.a = dVar;
    }

    @Override // defpackage.fx9
    public final fx9.a a(File file, int i, int i2, ova ovaVar) {
        File file2 = file;
        return new fx9.a(new nna(file2), new c(file2, this.a));
    }

    @Override // defpackage.fx9
    public final /* bridge */ /* synthetic */ boolean b(File file) {
        return true;
    }
}
