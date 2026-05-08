package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class a64 {
    public final int a;
    public final String b;
    public final a c;
    public final long d;
    public final long e;
    public final long f;
    public final ie7 g;
    public final fia h;
    public final gia i;
    public final Context j;

    public class a implements gze<File> {
        public a() {
        }

        @Override // defpackage.gze
        public final File get() {
            Context context = a64.this.j;
            context.getClass();
            return context.getApplicationContext().getCacheDir();
        }
    }

    public static final class b {
        public a a;
        public final ie7 b = new ie7(17);
        public final Context c;

        public b(Context context) {
            this.c = context;
        }
    }

    public a64(b bVar) {
        fia fiaVar;
        gia giaVar;
        Context context = bVar.c;
        this.j = context;
        a aVar = bVar.a;
        if (!((aVar == null && context == null) ? false : true)) {
            r6.g("Either a non-null context or a base directory path or supplier must be provided.");
            throw null;
        }
        if (aVar == null && context != null) {
            bVar.a = new a();
        }
        this.a = 1;
        this.b = "image_cache";
        a aVar2 = bVar.a;
        aVar2.getClass();
        this.c = aVar2;
        this.d = 41943040L;
        this.e = 10485760L;
        this.f = 2097152L;
        this.g = bVar.b;
        synchronized (fia.class) {
            try {
                if (fia.a == null) {
                    fia.a = new fia();
                }
                fiaVar = fia.a;
            } finally {
            }
        }
        this.h = fiaVar;
        synchronized (gia.class) {
            try {
                if (gia.a == null) {
                    gia.a = new gia();
                }
                giaVar = gia.a;
            } finally {
            }
        }
        this.i = giaVar;
        synchronized (iia.class) {
            if (iia.a == null) {
                iia.a = new iia();
            }
        }
    }
}
