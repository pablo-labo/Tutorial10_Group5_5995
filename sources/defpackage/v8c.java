package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import defpackage.fx9;
import defpackage.ke3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class v8c<DataT> implements fx9<Uri, DataT> {
    public final Context a;
    public final fx9<File, DataT> b;
    public final fx9<Uri, DataT> c;
    public final Class<DataT> d;

    public static abstract class a<DataT> implements gx9<Uri, DataT> {
        public final Context a;
        public final Class<DataT> b;

        public a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // defpackage.gx9
        public final fx9<Uri, DataT> c(n1a n1aVar) {
            Class<DataT> cls = this.b;
            return new v8c(this.a, n1aVar.a(File.class, cls), n1aVar.a(Uri.class, cls), cls);
        }
    }

    public static final class b extends a<ParcelFileDescriptor> {
    }

    public static final class c extends a<InputStream> {
    }

    public static final class d<DataT> implements ke3<DataT> {
        public static final String[] Z = {"_data"};
        public final ova V;
        public final Class<DataT> W;
        public volatile boolean X;
        public volatile ke3<DataT> Y;
        public final Context a;
        public final fx9<File, DataT> b;
        public final fx9<Uri, DataT> c;
        public final Uri d;
        public final int e;
        public final int f;

        public d(Context context, fx9<File, DataT> fx9Var, fx9<Uri, DataT> fx9Var2, Uri uri, int i, int i2, ova ovaVar, Class<DataT> cls) {
            this.a = context.getApplicationContext();
            this.b = fx9Var;
            this.c = fx9Var2;
            this.d = uri;
            this.e = i;
            this.f = i2;
            this.V = ovaVar;
            this.W = cls;
        }

        @Override // defpackage.ke3
        public final Class<DataT> a() {
            return this.W;
        }

        @Override // defpackage.ke3
        public final void b() {
            ke3<DataT> ke3Var = this.Y;
            if (ke3Var != null) {
                ke3Var.b();
            }
        }

        public final ke3<DataT> c() throws Throwable {
            fx9.a<DataT> aVarA;
            Throwable th;
            boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            Context context = this.a;
            ova ovaVar = this.V;
            int i = this.f;
            int i2 = this.e;
            if (zIsExternalStorageLegacy) {
                Uri uri = this.d;
                try {
                    Cursor cursorQuery = context.getContentResolver().query(uri, Z, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                aVarA = this.b.a(file, i2, i, ovaVar);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor == null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                Uri requireOriginal = this.d;
                boolean zP = web.p(requireOriginal);
                fx9<Uri, DataT> fx9Var = this.c;
                if (zP && requireOriginal.getPathSegments().contains("picker")) {
                    aVarA = fx9Var.a(requireOriginal, i2, i, ovaVar);
                } else {
                    if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                    }
                    aVarA = fx9Var.a(requireOriginal, i2, i, ovaVar);
                }
            }
            if (aVarA != null) {
                return aVarA.c;
            }
            return null;
        }

        @Override // defpackage.ke3
        public final void cancel() {
            this.X = true;
            ke3<DataT> ke3Var = this.Y;
            if (ke3Var != null) {
                ke3Var.cancel();
            }
        }

        @Override // defpackage.ke3
        public final void d(knb knbVar, ke3.a<? super DataT> aVar) throws Throwable {
            try {
                ke3<DataT> ke3VarC = c();
                if (ke3VarC == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
                } else {
                    this.Y = ke3VarC;
                    if (this.X) {
                        cancel();
                    } else {
                        ke3VarC.d(knbVar, aVar);
                    }
                }
            } catch (FileNotFoundException e) {
                aVar.c(e);
            }
        }

        @Override // defpackage.ke3
        public final xe3 e() {
            return xe3.a;
        }
    }

    public v8c(Context context, fx9<File, DataT> fx9Var, fx9<Uri, DataT> fx9Var2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = fx9Var;
        this.c = fx9Var2;
        this.d = cls;
    }

    @Override // defpackage.fx9
    public final fx9.a a(Uri uri, int i, int i2, ova ovaVar) {
        Uri uri2 = uri;
        return new fx9.a(new nna(uri2), new d(this.a, this.b, this.c, uri2, i, i2, ovaVar, this.d));
    }

    @Override // defpackage.fx9
    public final boolean b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && web.p(uri);
    }
}
